import java.util.Scanner;

import static my.netology.service.CustomsService.calculateCustoms;

public class HomeWork {
    public static void main(String[] args) {

    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доброго времени суток");

        System.out.println("Введите цену товара (руб.):");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        int duty = calculateCustoms(price, weight);
        System.out.println("Вывод пошлины:" + duty + "(руб.)");

    }

    }



}