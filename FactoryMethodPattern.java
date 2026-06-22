interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a Car");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        return null;
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        vehicle.drive();
    }
}