import transport.bus;
import transport.train;
import transport.car;

public class Main {
    public static void main(String[] args) {
        car lada = new car("Lada", "Granta", 1.7, "желтый", 120, 2015, "Россия", "механическая", "седан","у777уу777", 4,true,new car.Key(true, false));
        System.out.println(lada);

        car audi = new car("Audi","A8 50 L TDI quattro",0,null, 180,0,"Германия", "автомат", "внедорожник",null, 0,false, new car.Key(false,true));
        System.out.println(audi);

        car bmw = new car("BMW","Z8",3,"черный", 220,2021,"Германия", null, "пикап","в999вв999", 2, true, new car.Key(true,true));
        bmw.car();

        car kia = new car("Kia","Sportage 4 поколение",2.4,"красный", 0, 2018,"Южная Корея","механическая", "универсал","х123оо456", 3, false, new car.Key(false,false));
        kia.car();

        car hyundai = new car ("Hyundai","Avante",1.6,"оранжевый", 150, 2016,"Южная Корея", "автомат", "купе","н159аа753", 4,false,null);
        hyundai.car();

        hyundai.changeTyres(4);
        System.out.println(hyundai);

        train lastochka = new train("Ласточка", "В-901", 2011, "Россия", null,301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 8);
        train leningrad = new train("Ленинград", "D-125", 2019, "Россия", null,270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);

        bus small = new bus("ПАЗ","12345", 2001, "Россия", "желтый", 200);
        bus medium = new bus("ЛАЗ", "987-Н", 2020, "Аргентина", null, 210);
        bus large = new bus("Икарус", "666-ад", 0, null, "красный", -120);
        System.out.println(small);
        System.out.println(medium);
        System.out.println(large);

    }
}