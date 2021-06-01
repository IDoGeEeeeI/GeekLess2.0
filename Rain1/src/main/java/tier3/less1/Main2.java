package tier3.less1;


import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        String[] arr = {"asd", "ds", "ret", "123"};

        System.out.println("Задание 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));


        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(arr);
        System.out.println("Задание 2\n" + list.getClass() + " : " + list);


        //Задача 3. Коробки с фруктами
        System.out.println("Задание 3");

//        Orange orange = new Orange(1.5f);
//        Apple apple = new Apple(1.f);

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange(1.5f));
        orangeBox1.add(new Orange(1.5f));
        orangeBox1.add(new Orange(1.5f));

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange(1.5f));
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple(1.f));
        }

        System.out.println("");
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
        System.out.println("");

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес 1: " + orange1Weigth);
        System.out.println("Вес 2: " + orange2Weigth);
        System.out.println("Вес ябл: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
        System.out.println("");
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
        System.out.println("");
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}