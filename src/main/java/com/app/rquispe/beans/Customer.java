package com.app.rquispe.beans;

/**
 * “There are two types of Java Beans that can interact with JSF pages: JSF managed beans and CDI named beans.
 * 1. JSF managed beans have been around since the first version of the JSF specification and can be used only in a JSF context.
 * 2. CDI named beans were introduced in Java EE 6 and can interoperate with other Java EE APIs, such as Enterprise JavaBeans”
 *
 */

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named //“ makes a Java class a CDI named bean”
@RequestScoped //“specifies that the bean should live through a single request.”
public class Customer {

    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
