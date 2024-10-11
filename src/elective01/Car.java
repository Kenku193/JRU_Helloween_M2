package elective01;

public class Car {

   private String brand;
   private String color;

    public Car(String  brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("Начинаю красить");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){}

        this.color = color;
        System.out.println("Закончила красить");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color='" + color + '\'' +
                '}';
    }
}
