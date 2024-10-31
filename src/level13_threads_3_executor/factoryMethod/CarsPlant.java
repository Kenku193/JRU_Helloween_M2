package level13_threads_3_executor.factoryMethod;

// СБОРОЧНАЯ ЛИНИЯ МАШИН НА ЗАВОДЕ (НАСЛЕДНИК)

class CarsPlant extends Plant{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

