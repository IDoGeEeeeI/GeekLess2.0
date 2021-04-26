package tier2.less1;

public class Wall implements ForWallAndTredmill {
    private String name;

    @Override
    public boolean toRun(String name) {
        return false;
    }

    @Override
    public boolean toJump(String name) {
        System.out.println(name+" препрыгнул через стену");
        return true;
    }
}
