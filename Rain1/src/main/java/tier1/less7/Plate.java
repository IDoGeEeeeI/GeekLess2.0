package tier1.less7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if(food-n>0){
            food -= n;
        }
       else {
            System.out.println("действие не возможно");
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public  void addFood(int p){
        food+=p;
    }
}
