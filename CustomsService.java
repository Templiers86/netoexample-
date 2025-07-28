package my.netology.service;

import java.util.Scanner;

public class CustomsService {
    public static final int BUTY_RATE = 100; // Исправил. Невнимательно подошёл к вопросу.

    public static int calculateCustoms(int price, int weight) {

        int result = price / 100 + weight * BUTY_RATE;

        return result;
    }
}
