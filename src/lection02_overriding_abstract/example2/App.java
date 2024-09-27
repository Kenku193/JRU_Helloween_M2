package lection02_overriding_abstract.example2;

public class App {
    public static void main(String[] args) {

        Plane plane = new Plane();
        plane.nubmer = 1;
        System.out.println(plane.nubmer);
        plane.text = "Текст самолета";
        System.out.println(plane.text);

        Helicopter helicopter = new Helicopter();
        helicopter.nubmer = 2;
        System.out.println(helicopter.nubmer);
        plane.text = "Текст вертолета";
        System.out.println(helicopter.text);

        System.out.println(plane.nubmer == helicopter.nubmer);
        System.out.println(plane.text == helicopter.text);

        System.out.println(Aircraft.PI);
        Aircraft.PI = 111.11;
        System.out.println(Aircraft.PI);

        System.out.println(Aircraft.helicopterFromAircraft);

        ((Helicopter) helicopter).setPI(1);

        // !!!!!!!!!!!!!!!!
        Aircraft[] aircrafts = {new Helicopter(), new Plane()};
        ((Helicopter) (aircrafts[0])).setPI(1);

    }
}
