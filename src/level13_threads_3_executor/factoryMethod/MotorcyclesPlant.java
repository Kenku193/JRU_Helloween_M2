package level13_threads_3_executor.factoryMethod;

class MotorcyclesPlant extends Plant {
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
}
