package tier2.less3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhonesData {
    private HashMap<String, List<String>> cellsBook;

    public PhonesData()
    {
        this.cellsBook = new HashMap<>();
    }


    public void add(String name, String number) {
        if(cellsBook.containsKey(name)){//проверка на наличие человека в базе  (имя - key, номер - значение)
            List<String> numbers = cellsBook.get(name);//если он есть, то создаем лист его номеров
            if(!numbers.contains(number))
            {
                numbers.add(number);
            }
        }
        else
        {
            cellsBook.put(name, new ArrayList<>(Arrays.asList(number)));
        }
    }



    public List<String> get(String name) {
        if(cellsBook.containsKey(name))
        {
            System.out.println(name +" "+ cellsBook.get(name));//вывод человека, добавил для себя
            return cellsBook.get(name);
        }
        else
        {
            System.out.println(String.format(name)+" не найден");//вывод человека, если его нет в базе данных, добавил для себя
            return new ArrayList<>();
        }
    }

}
