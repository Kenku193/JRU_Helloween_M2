package lection04_interfaces.example1;



public interface Drivable extends Sellable {

  // public static final
  int SOSISKI = -110;
  int KOTLETI = -220;

  // public abstract
 default void goStraight(){
   System.out.println("Что-то двигается прямо");
 };
  default void goLeft(){
    System.out.println("Что-то двигается налево");
  };
  default void goRight(){
    System.out.println("Что-то двигается направо");
  };
  default void goBack(){
    System.out.println("Что-то двигается назад");
  };

}
