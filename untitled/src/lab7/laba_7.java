package lab7;

import java.util.ArrayList;
class CollectionApp {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add("Mercedes-Benz");
        states.add("BMW");
        states.add("Lada");
        states.add("Tesla");
        states.add(1, "УАЗ"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Audi"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("BMW")) {
            System.out.println("Список содержит марку BMW");
        }

        // удалим несколько объектов
        states.remove("BMW");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){
            System.out.println(country);
        }
    }
}
