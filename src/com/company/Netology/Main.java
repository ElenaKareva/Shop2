package com.company.Netology;

import shop.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Goods[] goods = {new RainCoat(), new AppLe(), new Cabbage(), new Shirt()};

        printGoods(goods);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество через пробел или введите `end` ");
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            String[] parts = input.split(" ");
            int goodsNumber = Integer.parseInt(parts[0]) - 1;
            goods[goodsNumber].setNumber(Integer.parseInt(parts[1]));
        }
        printGoods(goods);
        printBasket(goods);
    }

    private static void printGoods(Goods[] goods) {
        System.out.println("Ознакомьтесь со списком товаров: ");
        for (int i = 0; i < goods.length; i++) {
            System.out.println((i + 1) + ". " + goods[i]);
        }
    }

    private static void printBasket(Goods[] goods) {
        int costGoods = 0;
        System.out.println("Ваша корзина: ");
        for (Goods goodsList : goods) {
            if (goodsList.getNumber() != 0) {
                costGoods += goodsList.getNumber() * goodsList.getPrice();
                System.out.println(goods + " 'количество'= " + goodsList.getNumber() + " шт."
                        + " 'цена'= " + goodsList.getPrice() + " " +
                        " 'стоимость'= " + goodsList.getNumber() * goodsList.getPrice() + " рублей");
            }
        }
        System.out.println("Итого: " + costGoods + " " + "рублей");
    }

}
