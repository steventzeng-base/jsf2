package base.view;

import javax.enterprise.inject.Model;

/**
 *
 * @author steven
 */
@Model
public class GreetBean {

    private String name;

    public String getGreeting() {
        return "Hello " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
