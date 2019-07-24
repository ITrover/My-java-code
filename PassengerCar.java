public class PassengerCar extends Car {
    //载人车的通类，具备裁人能力
    private int capacity;

    public PassengerCar(int id,String name,int cost,int capacity){
        super(id,name,cost);
        this.capacity=capacity;
    }

    public void setCapacity(int capacity){
        this.capacity =capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString()+"载人量为："+ capacity;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+capacity*50;
    }
}
