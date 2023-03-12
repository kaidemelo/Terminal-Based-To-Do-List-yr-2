//Imports
import java.util.ArrayList;

//Main Class
public class Main {

    //Main Method
    public static void main(String[] args) {
        //Creates Arraylist of type Todo ot store the Todos in
        ArrayList<Todo> Todo = new ArrayList<>();
        //Arraylist passed as argument to the constructor of a new instance of the CLIMenu class
        new CLIMenu(Todo);
    }
}