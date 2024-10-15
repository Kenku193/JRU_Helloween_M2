package level07_casting;

public class Month {
}

class WinterMonths extends Month {}
class AutumnMonths extends Month {}
class SummerMonths extends Month {
    public void swim(){
        System.out.println("Пойдем купаться!");
    }
}
class SpringMonths extends Month {}