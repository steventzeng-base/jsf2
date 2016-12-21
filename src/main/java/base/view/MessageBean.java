package base.view;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import static javax.faces.application.FacesMessage.*;

/**
 *
 * @author steven
 */
@Model
public class MessageBean {

    private String inputMessage;

    public String getInputMessage() {
        return inputMessage;
    }

    public void setInputMessage(String inputMessage) {
        this.inputMessage = inputMessage;
    }

    public void addNewMessage() {
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(SEVERITY_INFO, "You success add new message:" + inputMessage, ""));

    }
}
