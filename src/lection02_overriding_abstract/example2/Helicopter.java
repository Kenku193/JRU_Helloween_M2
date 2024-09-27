package lection02_overriding_abstract.example2;

public class Helicopter extends Aircraft{
    @Override
    public void doFly() {
        System.out.println("Я лечу благодаря лопастям");
    }

    public void setPI(double input) {
        PI = input;
    }
}
