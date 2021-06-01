package tier2.less1;

public class Robot implements Act {
    private String name;


    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name+" побежал");
    }

    @Override
    public void jump() {
        System.out.println(name+" прыгнул");
    }

    @Override
    public String getName() {
        return name;
    }


}
