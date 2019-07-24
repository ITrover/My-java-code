public class Truck extends Car{
    //货车的通类，具有载货能力
    private float cargoVolume;

    public Truck(int id,String name,int cost,float cargoVolume){
        super(id,name,cost);
        this.cargoVolume=cargoVolume;
    }

    public float getCargoVolume(){
        return this.cargoVolume;
    }
    public void setCargoVolume(float cargoVolume){
        this.cargoVolume=cargoVolume;
    }

    @Override
    public String toString() {
        return super.toString()+"载货量为： "+cargoVolume+" ";
    }

    @Override
    public int hashCode() {
        return (int) (super.hashCode()+cargoVolume*20);
    }
}
