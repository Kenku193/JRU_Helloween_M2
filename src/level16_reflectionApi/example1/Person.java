package level16_reflectionApi.example1;

public class Person {
    private String name;
    private int age;

    public boolean isMale;

    protected String address;
   // 1     2       3
    public static final int MAX_AGE = 120;
    public static final int MIN_AGE = 999;

    public void doNothing(int a, int b){
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", address='" + address + '\'' +
                '}';
    }
}
