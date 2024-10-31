package level13_threads_3_executor.factoryMethod;

import java.util.ArrayList;
import java.util.List;

class Car implements Transport{
    String name;
    List<String> accessories = new ArrayList();
    public Car(){
        name = "Машинка";
        accessories.add("Панорамная крыша");
        accessories.add("Климат-контроль");
        accessories.add("Кожаный салон");
        accessories.add("Кожаный мешок");
    }

    @Override
    public String toString() {
        return "Transport type: " + name + "\n" + accessories;
    }
}



