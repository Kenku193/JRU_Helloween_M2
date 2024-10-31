package level13_threads_3_executor.factoryMethod;

public class Solution {
    public static void main(String[] args) {

       Transport transportCar = new CarsPlant().createTransport();
       System.out.println(transportCar.getClass());

       Transport transportMotorcycle = new MotorcyclesPlant().createTransport();
       System.out.println(transportMotorcycle.getClass());


    }
}
