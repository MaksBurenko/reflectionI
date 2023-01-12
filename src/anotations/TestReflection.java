package anotations;

import java.lang.reflect.Method;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Person();

        Class personClass1 = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("Person");

        Method[] methods = personClass1.getMethods();
    }
}
