package chp08.ex8_1;

public class MainHero {
    public static void main(String[] args) {
        Hero ironMan = new Hero("아이언맨", 100, 130);
        Hero hulk = new Hero("헐크", 200, 100);

        System.out.println(ironMan); // ironman.toString() println()에서는 생략 가능
        System.out.println(hulk);
    }
}