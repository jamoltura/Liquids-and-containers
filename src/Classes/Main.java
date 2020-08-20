package Classes;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        // Создание массив емкость
        List<Capacities> capacities  = new ArrayList<>();

        // запонения массив с жикости
        Random random = new Random();
        int count = 5;
        for (int i = 0; i < count; i++) {
            switch (random.nextInt(3)) {
                case 0 -> capacities.add(new Cube());
                case 1 -> capacities.add(new Ball());
                case 2 -> capacities.add(new Tetrahedron());
            }
        }

        // Сортируем массив
        capacities.sort(sort);

        String[] str = {"Тип ёмкости", "Высота(см)", "Ширина(см)", "Длина(см)", "Объем(см3)", "Тип жидкости", "Кг", "Литр"};
        String s = "%13s|%10s|%10s|%10s|%20s|%14s|%10s|%10s|\n";
        System.out.printf(s, str);

        String[] str2 = {"____________", "__________", "__________", "__________", "____________________", "______________", "__________", "__________"};

        System.out.printf(s, str2);

        // Выводим на консол
        for (int i = 0; i < count; i++) {
            capacities.get(i).getParametrs();
            System.out.printf(s, str2);
        }

    }

    // Метод для сортировка по массе жидкости
    public static Comparator<Capacities> sort = (obj1, obj2) -> (Double.compare(obj2.jidkost.getKg(), obj1.jidkost.getKg()));
}
