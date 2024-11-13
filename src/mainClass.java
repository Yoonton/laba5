import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.reflect.*;

public class mainClass {
    public static void main(String[] args) throws Exception{
        //!task1
        // Class clazz = Class.forName(args[0]);
        // Constructor constructor = clazz.getConstructor(String.class, int.class);
        // Car car1 = (Car)constructor.newInstance("Lada", 4);
        // Method method = clazz.getMethod(args[1], String.class, double.class);
        // method.invoke(car1, args[2], Double.parseDouble(args[3]));
        // VehicleStatic.printAllModelWithPrice(car1);
        //!task2
        Vehicle car2 = new Car("", 0);
        car2 = VehicleStatic.createVehicle("BMW", 5, car2);
        VehicleStatic.printAllModelWithPrice(car2);
        //!task3 - task5
        System.out.println("Задание 2-5\n");
        Vehicle veh1 = new Moped("krutoi", 5);
        VehicleStatic.printAllModelWithPrice(veh1);
        System.out.println("цена: " + veh1.getPriceByName("Name: 1"));

        veh1.editModelName("Name: 1", "aaa");
        VehicleStatic.printAllModelWithPrice(veh1);

        veh1.setPriceByName("Name: 0", 1.1);
        VehicleStatic.printAllModelWithPrice(veh1);

        veh1.deleteModelByName("Name: 3");
        VehicleStatic.printAllModelWithPrice(veh1);

        veh1.modelAdd("bbb", 2.2);
        VehicleStatic.printAllModelWithPrice(veh1);        
        //!task6
        System.out.println("Задание 6");
        Car car1 = new Car("null", 2);
        Motorbike bike1 = new Motorbike("null", 1);
        VehicleStatic.printAllModelWithPrice(car1);
        VehicleStatic.printAllModelWithPrice(bike1);
        System.out.println("Среднее арифмитическое: "+VehicleStatic.arithmeticMean(car1, bike1)+"\n");
        //!task7
        System.out.println("Задание 7");
        Moped moped1 = new Moped("krutoiMoped", 5);
        PrintWriter pw = new PrintWriter("C:\\Users\\mak-s\\ИВТ\\OOP\\laba5\\lib\\task7.txt");
        VehicleStatic.writeVehicle(moped1, pw);
        Moped moped2 = (Moped)VehicleStatic.readVehicle(new FileReader("C:\\Users\\mak-s\\ИВТ\\OOP\\laba5\\lib\\task7.txt"));
        VehicleStatic.printAllModelWithPrice(moped2);
    }
}
