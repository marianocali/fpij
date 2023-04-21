package main.fpij.inheritance;


/**
 * Using default methods in interface Vehicle make it available in class Car.
 * Car implements Vehicle so inherit default methods: turnAlarmOn and turnAlarmOff
 */
public interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }


    default double getSpeedInKMH(double speed) {
        return speed * 1.60934;
    }

}

     class Car implements Vehicle {

        private String brand;

        // constructors/getters


         public Car(String brand) {
             this.brand = brand;
         }

         @Override
        public String getBrand() {
            return brand;
        }

        @Override
        public String speedUp() {
            return "The car is speeding up.";
        }

        @Override
        public String slowDown() {
            return "The car is slowing down.";
        }

        public static void main(String[] args) {
            Vehicle car = new Car("BMW");
            System.out.println(car.getBrand());
            System.out.println(car.speedUp());
            System.out.println(car.slowDown());
            System.out.println(car.turnAlarmOn());
            System.out.println(car.turnAlarmOff());
            System.out.println(car.getSpeedInKMH(100));

        }
    }

