package tier1.less7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.getSatiefy();

        Cat mas[]=new Cat[4];
        mas[0]= new Cat("Murzic",10);
        mas[1]= new Cat("Masy",3);
        mas[2]= new Cat("Bonny",9);
        mas[3]= new Cat("Marcus",11);


        for (int i=0;i< mas.length;i++){
            mas[i].eat(plate);
            System.out.print(mas[i].getName()+" съел/a из ");
            plate.info();
        }



        Scanner scanner = new Scanner(System.in);
        int feed = scanner.nextInt();
        plate.addFood(feed);
        plate.info();
        scanner.close();
    }
}
