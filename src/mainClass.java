public class mainClass {
    public static void main(String[] args) throws Exception{
        Car car = new Car("audi", 5);
        Vehicle car2 = (Car)car.clone();

        VehicleStatic.printAllModelWithPrice(car);
        VehicleStatic.printAllModelWithPrice(car2);

        System.out.println(car.equals(car2)+"\n");

        car.setPriceByName("Name: 1", 6496.0);
        VehicleStatic.printAllModelWithPrice(car);
        VehicleStatic.printAllModelWithPrice(car2);

        System.out.println(car.equals(car2)+"\n");

        System.out.println("Motorbike"+"\n");

        Motorbike bike = new Motorbike("bike", 4);
        Motorbike bike2 = (Motorbike)bike.clone();
        VehicleStatic.printAllModelWithPrice(bike);
        VehicleStatic.printAllModelWithPrice(bike2);

        System.out.println(bike.equals(bike2) +"\n");

        bike2.setPriceByName("Name: 1", 8009.0);
        VehicleStatic.printAllModelWithPrice(bike);
        VehicleStatic.printAllModelWithPrice(bike2);

        System.out.println(bike.equals(bike2) +"\n");

        System.out.println(car);
        System.out.println(bike);
    }
}
