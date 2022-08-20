
package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author rahni
 */

@ManagedBean(name = "messageBean", eager = true)
public class Message {

    private String message;

    public Message() {
        this.message = "Le message depuis le Bean Message";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}