package by.it.makovsky.jd02_02;


import java.util.*;

public class Basket {

    private final static Map<Integer,String> GOODS = new HashMap<>();

    public static String addGoods(){
        GOODS.put(1,"хлеб за 1,2 руб.");
        GOODS.put(2,"молоко за 2,49 руб.");
        GOODS.put(3,"сигареты за 2,6 руб.");
        GOODS.put(4,"водка за 9,99 руб");
        int a= Rnd.getRandom(4);
        ArrayList<String> str=new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            String s=GOODS.get(i);
            str.add(s);
        }
        return str.toString();
    }
}
