package main.fpij.inheritance;

public interface MultipleInheritanceVehicle {

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

    interface Alarm {

        default String turnAlarmOn() {
            return "Turning the alarm on.";
        }

        default String turnAlarmOff() {
            return "Turning the alarm off.";
        }
    }

    class Car2 implements MultipleInheritanceVehicle, Alarm {

        private String brand;

        // uses the default methods from the MultipleInheritanceVehicle interface:
//        @Override
//        public String turnAlarmOn() {
//            return MultipleInheritanceVehicle.super.turnAlarmOn();
//        }
//
//        @Override
//        public String turnAlarmOff() {
//            return MultipleInheritanceVehicle.super.turnAlarmOff();
//        }

        /*
        // uses the default methods from the Alarm interface:
        @Override
        public String turnAlarmOn() {
            return Alarm.super.turnAlarmOn();
        }

        @Override
        public String turnAlarmOff() {
            return Alarm.super.turnAlarmOff();
        }
         */

        // uses the default methods from both Alarm interface and MultipleInheritanceVehicle interface
        @Override
        public String turnAlarmOn() {
            return MultipleInheritanceVehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
        }

        @Override
        public String turnAlarmOff() {
            return MultipleInheritanceVehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
        }

        public Car2(String brand) {
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
            MultipleInheritanceVehicle car = new Car2("BMW");
            System.out.println(car.getBrand());
            System.out.println(car.speedUp());
            System.out.println(car.slowDown());
            System.out.println(car.turnAlarmOn());
            System.out.println(car.turnAlarmOff());
            System.out.println(car.getSpeedInKMH(100));
        }
    }

