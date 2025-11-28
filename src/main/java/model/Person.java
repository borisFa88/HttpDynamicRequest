
package model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.logging.Level;
import java.util.logging.Logger;

@JacksonXmlRootElement(localName = "Person")
public class Person {
    private String name;
    private int age;
    private final static Logger logger = Logger.getLogger(Person.class.getName());

    public String getName() {
        logger.log(Level.WARNING, " getter  name = : " + name);
        return name;
    }

    public void setName(String name) {
        logger.log(Level.WARNING, " setter  name =  " + name);
        this.name = name;
    }

    public int getAge() {
        logger.log(Level.WARNING, " getter  name = : " + age);
        return age;
    }

    public void setAge(int age) {
        logger.log(Level.WARNING, " getter  name = : " + age);
        this.age = age;
    }
}
