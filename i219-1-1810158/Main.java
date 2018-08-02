// javac  -encoding utf-8 .\Main.java
/**  */

import java.util.Scanner;//input
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // init
        SessionController sc = new SessionController();

        // scenario
        // 1.
        sc.pullWeather();

        // 2.
        sc.cam.detectCustomer();

        // 3.
        sc.pullItemList();

        // 4.
        sc.getRecommend();

        for (int i = 0;; i++) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("[" + i + "]INPUT ItemNo(0/1/2)or coin value(10/50/100/500):");// テスト用
                int tmp = scanner.nextInt();
                // 5.
                if (tmp == 10 || tmp == 50 || tmp == 100 || tmp == 500) {
                    sc.pay.money = tmp;
                    System.out.println(tmp + "Coin recived");
                    sc.pullMoney();
                } // 6.
                else if (tmp == 0 || tmp == 1 || tmp == 2) {
                    sc.tc.itemNumber = tmp;
                    System.out.println(tmp + "Item recieved");
                    sc.pullItemNumber();
                }
            } catch (InputMismatchException e) {
                System.out.println("[" + i + "]Not a Number.");
            }

        }

    }
}