package anotations;

public class Main {

    @MethodInfo(author = "Maks", dateOfCreation = 2023, purpose = "Print Hello world")
    public void printHelloWorld(){
        System.out.println("Hello world!");
    }

}
