package org.example.TextGame;

import java.util.Scanner;

public class Game {
    void start() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    ╔═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╗");
        System.out.println("         ***   텍스트 게임  ***       ");
        System.out.println("    ╚═ ═══ ═══ ═══ ═══ ═══ ═══ ═══ ═╝");
        System.out.println("          얏호~! 게임 시작이다 ! ");
        System.out.println();
        Thread.sleep(2000);
        System.out.println("              * 시작중 * ");
        System.out.println();
        Thread.sleep(1000);
        while (true) {
            System.out.print("      ║");
            Thread.sleep(1000);
            for (int i = 0; i < 11; i++) {
                System.out.print("══");
                Thread.sleep(200);
            }
            System.out.println("║");
            break;
        }
        Thread.sleep(3000);
        System.out.println();
        System.out.println("    당신은 모험의 시작점에 서 있습니다.");
        System.out.println("    이 게임은 당신의 '선택'에 따라");
        System.out.println("    결과가 달라지는 인터랙티브 스토리입니다.");
        Thread.sleep(3000);
        System.out.println();
        System.out.println("    ✔️ 선택지에 따라 생존, 죽음, 혹은 전설이 될 수 있습니다.");
        System.out.println("    ✔️ 일부 선택에는 성공 또는 실패 확률이 존재합니다.");
        System.out.println("    ✔️ 주사위 🎲 운도 당신의 편이 아닐 수 있습니다.");
        Thread.sleep(3000);
        System.out.println();
        System.out.println("    엔딩은 하나가 아닙니다. 당신의 이야기를 시작하세요.");
    }
}
