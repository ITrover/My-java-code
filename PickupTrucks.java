public class PickupTrucks extends Car{
    //皮卡车的通类，具有载人和载货能力
    private float cargoVolume;
    private int capacity;

    public PickupTrucks(int id,String name,int cost,float cargoVolume,int capacity){
        super(id,name,cost);
        this.cargoVolume=cargoVolume;
        this.capacity=capacity;
    }

    public float getCargoVolume(){
        return this.cargoVolume;
    }
    public void setCargoVolume(float cargoVolume){
        this.cargoVolume=cargoVolume;
    }


    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString()+"载客量为："+capacity+" "+"载货量为："+cargoVolume+" ";
    }

    @Override
    public int hashCode() {
        return (int) (super.hashCode()+cargoVolume*20+capacity*50);
    }
}
