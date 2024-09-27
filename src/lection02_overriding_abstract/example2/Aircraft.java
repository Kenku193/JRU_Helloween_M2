package lection02_overriding_abstract.example2;

public abstract class Aircraft {

    int nubmer;
    String text;
    static double PI = 3.14;
    static Helicopter helicopterFromAircraft = new Helicopter();

    public abstract void doFly();

}
