package level15_innerClasses.example1;

public class App {
    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120, 10, 5);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

//        Bicycle.Pump pump = new Bicycle.Pump();
//        pump.pumpIt();
//
        seat.getSeatParam();

        // ПОЧИТАЙТЕ - РАЗБЕРИТЕСЬ
        System.out.println(Bicycle.Seat.getX());
        System.out.println(Bicycle.Seat.x);
//
//        seat.up();
//        peugeot.start();
//        handleBar.left();
//        handleBar.right();
//
//        System.out.println(Bicycle.Seat.x);

    }
}
