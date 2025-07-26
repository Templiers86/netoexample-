package my.netology.service;

public class CustomsService {

    public static int calculateCustoms(int price, int weight){
        return price / 100 + weight * 100;
    }
}