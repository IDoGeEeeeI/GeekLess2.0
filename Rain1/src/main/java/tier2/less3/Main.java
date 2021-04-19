package tier2.less3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>(11);
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add("ddd");
        arrayList.add("aaa");
        arrayList.add("ccc");
        arrayList.add("ccc");
        arrayList.add("bbb");
        ArrayList<String> arrayList2 =  (ArrayList<String>)arrayList.clone();


//уникальные значения
        for (String word1: arrayList2)
        {
            for (String word2: arrayList2)
            {
              if(word1.equals(word2)){
                    set.add(word1);
              }
            }
        }

//количество повторов
        for (String num: set)
        {
            int i=0;
            for (String word2: arrayList2)
            {
               if (num==word2){
                   i++;
               }
            }
            System.out.println("количество "+num+" = "+i);
        }
        System.out.println(set);
        System.out.println();


        PhonesData test1 = new PhonesData();
        test1.add("Перов","+79258718894");
        test1.add("Перов","+79448520434");
        test1.add("Попов","+79240338812");
        test1.get("Перов");
        test1.get("Попов");
        test1.get("d");

    }
}
