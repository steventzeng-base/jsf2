package base.view;

import java.util.logging.Logger;
import javax.enterprise.inject.Model;

import static java.util.logging.Level.*;

/**
 *
 * @author steven
 */
@Model
public class TodoForm {

    private static final Logger LOGGER = Logger.getLogger(TodoForm.class.getName());

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String create() {
        LOGGER.log(INFO, "do post");
        return "add_todo_result";
    }
}
