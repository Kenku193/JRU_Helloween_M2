package lection05_generics.example2;

import lection05_generics.example2.entity.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Animal<Bone> dog = new Animal();
        List<Bone> feedsForDog = new ArrayList<>();

        feedsForDog.add(new Bone());
        feedsForDog.add(new Bone());
        dog.eat(feedsForDog);

        List<AnoterBones> anoterBones = new ArrayList<>();
        anoterBones.add(new AnoterBones());
        anoterBones.add(new AnoterBones());
        anoterBones.add(new AnoterBones());
        dog.eat(anoterBones);

//        List<Feed> feeds = new ArrayList<>();
//        feeds.add(new Feed());
//        feeds.add(new Feed());
//        dog.eat(feeds);

        Animal<Fish> cat = new Animal();
        List<Fish> feedsForCat = new ArrayList<>();
        feedsForCat.add(new Fish());
        feedsForCat.add(new Fish());
        cat.eat(feedsForCat);

    }
}
