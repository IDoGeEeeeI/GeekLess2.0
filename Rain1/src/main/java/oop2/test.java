package oop2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();

        Animal catM = new Cat("Барсик",a);
        Animal catM2 = new Cat("Барсик",a);
        Animal catM3 = new Cat("Барсик",a);



        Animal dogM = new Dog("Бобик",b);
        Animal dogM2 = new Dog("Бобик",b);

        catM.infoRun();
        catM.infoSwim();
        dogM.infoRun();
        dogM.infoSwim();

        Animal.getCheckCat();
        Animal.getCheckDog();


        scan.close();
    }

}
