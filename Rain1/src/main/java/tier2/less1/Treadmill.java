package tier2.less1;

public class Treadmill implements ForWallAndTredmill {

    @Override
    public boolean toRun(String name) {
        System.out.println(name+" пробежал по дорожке");
        return true;
    }

    @Override
    public boolean toJump(String name) {
        return false;
    }


}
