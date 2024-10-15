package level07_casting;

public class Example5 {
    public static void main(String[] args) {

        int numMonth = 12;

//        switch (numMonth){
//            case 12, 2:
//                System.out.println("Winter");
//                break;
//            case 1:
//                System.out.println("Winter");
//                break;
//            case 3,4,5:
//                System.out.println("Spring");
//                break;
//            case 6,7,8:
//                System.out.println("Summer");
//                break;
//            case 9,10,11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Incorrect data");
//        }

        switch (numMonth){
            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            default -> System.out.println("Incorrect data");
        }

        Month vacation = switch (numMonth){
            case 12,1,2 -> {
                System.out.println("Отпуск зимой!"); yield new WinterMonths();}
            case 3,4,5 -> {
                System.out.println("Отпуск весной!"); yield new SpringMonths();}
            case 6,7,8 -> {
                System.out.println("Отпуск летом!"); yield new SummerMonths();}
            case 9,10,11 -> {
                System.out.println("Отпуск осень!"); yield new AutumnMonths();}
            default -> new Month();
        };


        System.out.println(vacation.getClass().getSimpleName());
//        if (vacation instanceof SummerMonths) {
//            ((SummerMonths) vacation).swim();
//        }

        if (vacation instanceof SummerMonths m) {
            m.swim();
        }



    }
}
