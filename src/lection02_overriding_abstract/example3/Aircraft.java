package lection02_overriding_abstract.example3;

public abstract class Aircraft {
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void doFly();
}


class Plane extends Aircraft {

    // super - это обращение к классу-родителю
    // this - это обращение внутри самого себя

    public Plane(String name) {
        super(name);
    }

    @Override
    void doFly() {

    }
}
