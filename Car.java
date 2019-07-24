public abstract class Car  {
       private String name;
       private int id;
       private int cost;
       private int rentDays;
       private int rentNum;
    //所有其他车的抽象类，包含通用的属性和方法

       public Car(){}
       public Car(int id,String name,int cost){
           this.id=id;
           this.name=name;
           this.cost=cost;
       }

    @Override
    public String toString() {
        return "序号："+id+" "+"车名："+name+" "+"费用为："+cost+" ";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.hashCode()==this.hashCode()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+id+cost;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRentNum() {
        return rentNum;
    }

    public void setRentNum(int rentNum) {
        this.rentNum = rentNum;
    }
}
