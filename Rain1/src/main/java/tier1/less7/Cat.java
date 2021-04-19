package tier1.less7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety=false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety=true;
    }
    public boolean getSatiefy (){
//        System.out.println(satiety);
        return satiety;
    }
    public String getName(){
        return name;
    }
}
