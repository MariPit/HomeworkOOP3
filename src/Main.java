import transport.car.Car;
import transport.driver.DriverB;

public class Main {

    public static void main(String[] args) {
//        bus gaz = new bus("ГАЗ", "123", 6.2);
//        bus laz = new bus("ЛАЗ", "456", 5.1);
//        bus paz = new bus("ПАЗ", "789", 4.9);
//        bus maz = new bus("МАЗ", "666", 5.6);
//        System.out.println(gaz);
//        System.out.println(gaz.bestLapTime());
//        System.out.println(laz);
//        System.out.println(laz.pitStop());
//        System.out.println(paz);
//        System.out.println(paz.maxSpeed());
//        System.out.println(maz);
//        System.out.println(maz.startMove());
//        System.out.println(maz.finishMove());
//
        Car lada = new Car("Lada", "Granta", 1.7, new DriverB("Максим", true,5), null);
//        car audi = new car("Audi", "A8 50 L TDI quattro", 0);
//        car bmw = new car("BMW", "Z8", 3);
//        car kia = new car("Kia", "Sportage 4 поколение", 2.4);
//        lada.car();
//        lada.startMove();
//        audi.car();
//        audi.pitStop();
//        bmw.car();
//        bmw.bestLapTime();
//        kia.car();
//        kia.finishMove();
//
//        for (int i = 1; i <= 4; i++) {
//            trucks trucks = new trucks("Грузовик " + i, "1" + i, 3.2 +i);
//            System.out.println(trucks);
//            System.out.println(trucks.startMove());
//            System.out.println(trucks.maxSpeed());
//            System.out.println(trucks.pitStop());
//            System.out.println(trucks.finishMove());
//            System.out.println(trucks.bestLapTime());
//        }
//        driverB max = new driverB("Максим", true, 5);
//        driverC vlad = new driverC("Влад", true, 4);
//        driverD stas = new driverD("Стас", true, 3);
//        max.startMove();
//        vlad.refill();
//        stas.finishMove();
//
//        System.out.println(max);;
            lada.printType();
    }
}