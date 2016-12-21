/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import static javax.faces.application.FacesMessage.*;

/**
 *
 * @author steven
 */
@Named
@ViewScoped
public class MessageBean2 implements Serializable {

    private static final long serialVersionUID = -7256565417886037889L;

    List<String> messages = new ArrayList<>();

    int code = ThreadLocalRandom.current().nextInt(100);

    Integer validCode;

    private String msg;

    public int getCode() {
        return code;
    }

    public Integer getValidCode() {
        return validCode;
    }

    public void setValidCode(Integer validCode) {
        this.validCode = validCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public void create() {
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(SEVERITY_INFO, "You success add new message:" + msg, ""));
        messages.add(msg);
    }

}
