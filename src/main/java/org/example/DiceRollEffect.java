package org.example;
import java.util.Random;
import java.util.Scanner;

public class DiceRollEffect {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        System.out.print("주사위를 굴리는 중");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("주사위를 굴리시겠습니까? ( Y / N )");
            String choice = scanner.nextLine();
            if (choice.equals("Y")) {
                System.out.println(" [주사위 굴리는중] ");
                for (int i = 0; i < 10; i++) {
                    int temp = random.nextInt(6) + 1;
                    System.out.print("\r🎲 " + temp);
                    Thread.sleep(200);
                }
                System.out.println("\n최종 결과입니다!");
                System.out.println("주사위를 다시 굴리시겠습니까? ( Y / N )");
                String subchoice = scanner.nextLine();
                if (subchoice.equals("N")) {
                    break;
                } else if (subchoice.equals("Y")) {
                    continue;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            } else if (choice.equals("N")) {
                System.out.println("주사위를 종료합니다.");
                scanner.close();
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}

