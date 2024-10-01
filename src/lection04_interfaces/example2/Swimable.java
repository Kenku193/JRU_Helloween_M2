package lection04_interfaces.example2;

public interface Swimable {
   default void go(){
       System.out.println("Я плавательный");
   };
}
