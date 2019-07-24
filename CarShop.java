import javax.swing.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CarShop {

    public static void main(String[] args) {
        //主方法
        Custom custom=new Custom();
        ShowCars(8);
        RentCars(custom);
        Caculate(custom);
        SeeResult(custom);
    }


    public static void  RentCars(Custom custom){
        //租车程序
        Scanner in=new Scanner(System.in);

            for(int i=0;i<custom.Cars.length;i++){
                System.out.println("请输入序号"+custom.Cars[i].getId()+custom.Cars[i].getName()+"的租用数量");
                int rentNum=in.nextInt();
                while(rentNum<0)rentNum=in.nextInt();
                custom.Cars[i].setRentNum(rentNum);
                //租车数量的确定
                if(rentNum!=0) {
                    System.out.println("请输入序号" + custom.Cars[i].getId() + custom.Cars[i].getName() + "的租用天数");
                    int rentDays = in.nextInt();
                    while(rentDays<0)rentDays=in.nextInt();
                    custom.Cars[i].setRentDays(rentDays);
                }
                //租车时间的确定
            }
    }

    public static void ShowCars(int maxCar){
        //车辆信息的展示
        System.out.println();
        for(int i=1;i<=maxCar;i++){
            System.out.println(CarFactory.CreateCar(i));
        }
    }

    public static void Caculate(Custom custom){
        //客户信息的计算
           for(int i=0;i<custom.Cars.length && custom.Cars[i].getRentNum()>0;i++){
               custom.totalDays+=custom.Cars[i].getRentDays();  //总体的租车天数
               custom.totalNum+=custom.Cars[i].getRentNum(); //总体的租车数量
               custom.totalCosts+=custom.Cars[i].getCost()*custom.Cars[i].getRentDays()*custom.Cars[i].getRentNum();
               //租车费用的确定，总的消费=车的价钱×租车天数×租车数量
               if(custom.Cars[i] instanceof Truck ){
                   //载货量的计算
                   Truck temp=(Truck)custom.Cars[i];
                   custom.totalVolume+=temp.getCargoVolume()*temp.getRentNum();
               }
               if(custom.Cars[i] instanceof PickupTrucks){
                   //载人量的计算
                   PickupTrucks temp=(PickupTrucks)custom.Cars[i];
                   custom.totalCapcity+=temp.getCapacity()*temp.getRentNum();
                   custom.totalVolume+=temp.getCargoVolume()*temp.getRentNum();
               }
               if(custom.Cars[i] instanceof PassengerCar){
                   //载人量和载人量的计算
                   PassengerCar temp=(PassengerCar)custom.Cars[i];
                   custom.totalCapcity+=temp.getCapacity()*temp.getRentNum();
               }
               //载人量（载货量）=可载人（货）车的载人（货）量×租用数量
           }
    }

    public static void SeeResult(Custom custom){
        //展示结果
        System.out.println("总体载货量："+custom.totalVolume);
        System.out.println("总体载人量："+custom.totalCapcity);
        System.out.println("总体租车费用:"+custom.totalCosts);
        System.out.println("总体天数"+custom.totalDays);
        System.out.println("总体租车数量"+custom.totalNum);
        for(int i=0;i<custom.Cars.length;i++){
            if(custom.Cars[i].getRentNum()!=0)
            System.out.println(custom.Cars[i].getName()+""+custom.Cars[i].getRentNum());
        }
    }
}
