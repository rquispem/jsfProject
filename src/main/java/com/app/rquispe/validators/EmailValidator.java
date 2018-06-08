package com.app.rquispe.validators;

import org.apache.commons.lang3.StringUtils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

//“registers our class as a JSF custom validator class. The value of its value attribute is the logical name that JSF
// pages can use to refer to it.”
@FacesValidator(value = "emailValidator")
public class EmailValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        org.apache.commons.validator.routines.EmailValidator emailValidator =
                org.apache.commons.validator.routines.EmailValidator.getInstance();

        HtmlInputText htmlInputText = (HtmlInputText) uiComponent;

        String email = (String ) value;

        if (StringUtils.isNoneBlank(email)) {
            if (!emailValidator.isValid(email)) {
                FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel() + ": email format is not valid");
                throw new ValidatorException(facesMessage);
            }
        }
    }
}
