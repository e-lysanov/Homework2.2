public class Main {
    public static void main(String[] args) {

        ServiceStation station = new ServiceStation();
        Transport[] transports = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        for (int i = 0; i < transports.length; i++) {
            station.check(transports[i]);
        }



//        for (int i = 0; i < transports.length; i++) {
//            Transport transport = transports[i];
//            if (transport.getWheelsCount() < 4) {
//                station.check(null, transport, null);
//            } else if (transport.getWheelsCount() == 4) {
//                station.check(transport, null, null);
//            } else {
//                station.check(null, null, transport);
//            }
//        }





//        Car car = new Car("car1", 4);
//        Car car2 = new Car("car2", 4);
//
//        Truck truck = new Truck("truck1", 6);
//        Truck truck2 = new Truck("truck2", 8);
//
//        Bicycle bicycle = new Bicycle("bicycle1", 2);
//        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
//
//        ServiceStation station = new ServiceStation();
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);
    }
}