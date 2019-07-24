public class CarFactory {
    public static Car CreateCar(int id){
        Car car=null;
        switch (id){
            case 1:car=new PassengerCar(1,"小轿车",40,4);return car;
            case 2:car=new PassengerCar(2,"面包车",65,7);return car;
            case 3:car=new PassengerCar(3,"大巴车",180,20);return car;
            case 4:car=new Truck(4,"低栏车",30, (float) 1.5);return car;
            case 5:car=new Truck(5,"高栏车",47,2.5f);return car;
            case 6:car=new Truck(6,"厢式车",80,4.5f);return car;
            case 7:car=new PickupTrucks(7,"日式皮卡车",60,5,1);return car;
            case 8:car=new PickupTrucks(8,"美式皮卡车",60,2,3);return car;
            default:{
                System.out.println("请输入正确id");return null;
            }
        }
    }
}
