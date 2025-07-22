package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        System.out.print("주사위를 굴리는 중...\n");
        for (int i = 0; i < 10; i++) {
            int temp = random.nextInt(6) + 1;
            System.out.print("\r🎲 " + temp);
            Thread.sleep(200);
        }
        System.out.println("\n최종 결과입니다!");
    }
}
