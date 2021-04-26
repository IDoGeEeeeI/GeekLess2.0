package tier2.less1;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall();
        Treadmill treadmill1 = new Treadmill();
        System.out.println("Задание 1,2");
        Cat cat1 = new Cat("Барсик");
        cat1.jump();
        cat1.run();
        System.out.println();
        Person person1 = new Person("Гена");
        person1.jump();
        person1.run();
        System.out.println();
        Robot robot1 = new Robot("Нафаня");
        robot1.jump();
        robot1.run();
        System.out.println();

        if(wall1!=null){
            wall1.toJump(cat1.getName());
            wall1.toJump(person1.getName());
            wall1.toJump(robot1.getName());
        }
        System.out.println();
        if (treadmill1!=null){
            treadmill1.toRun(cat1.getName());
            treadmill1.toRun(person1.getName());
            treadmill1.toRun(robot1.getName());
        }
        System.out.println();
        System.out.println("Задание 3");





        Act members []={
            new Cat("Мурзик"),
            new Person("Степан"),
            new Robot("R2-D2")
        };

        ForWallAndTredmill obstacles[]={
               new Wall(),
               new Treadmill()
        };



        for (Act member : members) {
            for (ForWallAndTredmill obstacle : obstacles) {
                System.out.println(member.getName()+ " прошел полосу препятствий" );

            }
        }



    }
}
