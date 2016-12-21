package base.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author steven
 */
@Named
@ViewScoped
public class TodoForm2 implements Serializable {

    private static final long serialVersionUID = -7781220659908968790L;

    private static final Logger LOGGER = Logger.getLogger(TodoForm2.class.getName());

    private final List<String> todos = new ArrayList<>();

    private String todo;

    public void create() {
        LOGGER.log(Level.INFO, "new todo {0} created!", todo);
        todos.add(todo);
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public List<String> getTodos() {
        return todos;
    }

}
