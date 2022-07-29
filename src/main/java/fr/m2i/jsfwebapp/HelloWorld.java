package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author rahni
 */
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    // messageBean est le nom de l'instance Message
    @ManagedProperty(value = "#{messageBean}")
    private Message messageBean;

    private String message;

    public HelloWorld() {

    }

    // necessaire pour la page xhtml
    public String getMessage() {

        if (messageBean != null) {
            message = messageBean.getMessage();
        }

        return message;
    }

    // necessaire pour injection de dependance
    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }
}