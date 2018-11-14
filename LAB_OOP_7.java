
//1. Протестировать работу коллекции ArrayList.

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
// добавим в список ряд элементов
        people.add("Моргенштерн");
        people.add("Кизару");
        people.add("Гостмейн");
        people.add("Бонс");
        people.add(1, "Цой"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Лил памп"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList имеет %d элементов \n", people.size());
        for (String person : people) {

            System.out.println(person);
        }
        // проверяем наличие элемента
        if (people.contains("Моргенштерн")) {

            System.out.println("ArrayList содержит Моргенштерн");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Лил памп");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {

            System.out.println(person);
        }
    }
}
