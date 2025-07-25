import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Доброго времени суток");

        System.out.println("Введите цену товара (руб.):");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        int duty = calculateCustoms( price,  weight);
        System.out.println("Вывод пошлины:" + duty + "(руб):");

    }
        public static int calculateCustoms(int price, int weight) {
            return price / 100 + weight * 100;
        }








   // package my.netology.service;

   // public class CustomsService {

      //  public static int calculateCustoms(int price, int weight) {
           // return price / 100 + weight * 100;
}