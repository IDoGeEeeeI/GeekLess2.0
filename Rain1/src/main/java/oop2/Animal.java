package oop2;

public class Animal {
    String name;
    float metr;

    protected static int checkCat=0;
    protected static int checkDog=0;


    public static void getCheckCat() {
        System.out.println(checkCat);
    }

    public static void getCheckDog() {
        System.out.println(checkDog);
    }

    public static void setCheckCat(int checkCat) {
        Animal.checkCat = checkCat;
    }

    public static void setCheckDog(int checkDog) {
        Animal.checkDog = checkDog;
    }



    public Animal() {
    }
    public Animal(String name, float metr) {
        this.name = name;
        this.metr = metr;
    }

    public void infoRun() {

        System.out.println(name+" пробежал "+metr);
    }
    public void infoSwim() {

        System.out.println(name+" пробежал "+metr);
    }



//    public void setCheckCat(){
//        System.out.println(checkCat);
//    }
//    public void setCheckDog(){
//        System.out.println(checkDog);
//    }

}










