package lection02_overriding_abstract.example4;

import lection02_overriding_abstract.example4.Plane;

public class App {
    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft() {

            int a = 10;

            public void mySeflMadeMethod(){
            }

            @Override
            public void doFly() {
                System.out.println("Я метод doFly анонимного класса");
            }
        };

        aircraft.doFly();
        new Plane().doFly();

        JRU_Helloween_M2

    }
}
