class BasicCar { //multilevel
    void start() {
        System.out.println("The car has started!");
    }
}

class ElectricCar extends BasicCar {
    void charge() {
        System.out.println("The car is being charged!");
    }
}

class AutomaticCar extends ElectricCar {
    void drive() {
        System.out.println("The car is driven automatically.");
    }
}

class Multilevel {
    public static void main(String[] args) {
        AutomaticCar myTesla = new AutomaticCar();
        myTesla.start();
        myTesla.charge();
        myTesla.drive();
    }
}