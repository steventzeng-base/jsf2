package base.view;

import javax.enterprise.inject.Model;

/**
 *
 * @author steven
 */
@Model
public class HelloBean {

    private final String message = "Hello World";

    public String getMessage() {
        return message;
    }

}
