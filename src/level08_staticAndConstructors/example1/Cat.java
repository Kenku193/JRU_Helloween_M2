package level08_staticAndConstructors.example1;

public class Cat {
    static int x;
    static {
        x = 10;
    }
    public int a;
    {
        a = 5;
    }
    public int b = a + 1;
    public int c = a * b;

    public Cat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
