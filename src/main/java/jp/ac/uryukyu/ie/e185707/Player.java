package jp.ac.uryukyu.ie.e185707;
import java.util.*;

public class Player {
        int hand;

    /**
     * Playerが入力した手を数値化するメソッド。
     */
    public void setHand() {
            System.out.print("「グー」「チョキ」「パー」のどれかを入力してください。＞");
            Scanner sc = new Scanner(System.in);
            String inputHand = sc.nextLine();

            switch(inputHand) {
                case "グー":
                    hand = 0;
                    break;
                case "チョキ":
                    hand = 1;
                    break;
                case "パー":
                    hand = 2;
                    break;
                default:
                    System.out.println("エラー");
            }
        }

        public int getHand() {
            return hand;
        }
}
