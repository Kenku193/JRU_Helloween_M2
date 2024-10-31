package level13_threads_3_executor.factoryMethod;

import java.util.ArrayList;
import java.util.List;

class Motorcycle implements Transport {
    String name;
    List<String> accessories = new ArrayList();

    public Motorcycle() {
        name = "Мотоциклик";
        accessories.add("Аптечка");
        accessories.add("Шлем");
        accessories.add("Бланк завещания");
    }

    @Override
    public String toString() {
        return "Transport type: " + name + "\n" + accessories;
    }

}
