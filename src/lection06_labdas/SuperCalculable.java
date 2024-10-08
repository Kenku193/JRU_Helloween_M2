package lection06_labdas;

public interface SuperCalculable {
    int calc(Integer... a);
}

class X{

    public static void main(String[] args) {

        SuperCalculable superCalculable = new SuperCalculable() {
            @Override
            public int calc(Integer... a) {
                int sum = 0;
                for (int i = 0; i < a.length; i++) {
                    sum = sum+ a[i];
                }
                return sum;
            }
        };

        System.out.println(superCalculable.calc(9, 10, 11));

    }
}
