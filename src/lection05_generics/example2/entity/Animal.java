package lection05_generics.example2.entity;

import java.util.List;

public class Animal<T> { // ПОД T Я ПОДРАЗУМЕВАЮ ЕДУ ДЛЯ ЖИВОТНОГО

    public void eat(List<? extends T> feeds){}

    // public void eat(List<? super T > feeds){}

    public void voice(){}

}
