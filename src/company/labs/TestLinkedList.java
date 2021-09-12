package labs;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Porshe 911");
        cars.add("Mclaren P1");
        cars.addLast("Ferrari F40");
        cars.add(1,"Лада 21099");
        System.out.printf("В списке %d элементов \n", cars.size());
        System.out.println(cars.get(1));

        cars.set(1,"BMW m5");

        for(String car : cars)
        {
            System.out.println(car);
        }

        if(cars.contains("Porshe 911"))
        {
            System.out.println("Список содержит Porshe 911");
        }

        cars.remove("Ferrari F40");
        cars.removeFirst();
        cars.removeLast();
    }

}
