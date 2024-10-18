package level08_staticAndConstructors.example1;

public class Parent {

    static String s;
    static {
        s = "Yura";
        s = "Another Name";
    }
    static {
        s = null;
    }

    int id = 0;
}