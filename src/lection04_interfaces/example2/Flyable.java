package lection04_interfaces.example2;

public interface Flyable {
    default void go(){
        System.out.println("Я летательный");
    };
}
