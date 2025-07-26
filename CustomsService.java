package my.netology.service;

public class CustomsService {
    public static final int Buty_rate = 100; // ставка пошлины за кг. (статическое поле, пихаем ниже с заменой)

    public static int calculateCustoms(int price, int weight){

        int result = price/100 + weight * Buty_rate; // цена % ставку за коп. за рубль + вес * ставку пошлины в статике

        return result; // "результивтивный результ" с возвратом в main
    }

    // При решении этой задачки вспотел без спортзала. Тут вроде ничего сложного, но как это всё было не просто.
    // Прям заставило шестерни со скрипов проворачиваться. Спасибо )
}

