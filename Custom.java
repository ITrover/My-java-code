
public class Custom{
    //客户，含有客户信息，总的花费，总的租用天数等等
    public int totalCosts=0;
    public int totalVolume=0;
    public float totalCapcity=0;
    public int totalDays=0;
    public int totalNum=0;
    public  Car Cars[]={
            new PassengerCar(1,"小轿车",40,4),
            new PassengerCar(2,"面包车",65,7),
            new PassengerCar(3,"大巴车",180,20),
            new Truck(4,"低栏车",30, (float) 1.5),
            new Truck(5,"高栏车",47, (float) 2.5),
            new Truck(6,"厢式车",80, (float) 4.5),
            new PickupTrucks(7,"日式皮卡车",60,5,1),
            new PickupTrucks(8,"美式皮卡车",60,2,3)
    };
}
