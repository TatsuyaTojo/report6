package jp.ac.uryukyu.ie.e185707;

public class Judge {int judge;

    /**
     * 数値化したPlayerとCPUが出した手を(CPUの出した手ーPlayerの出した手+3)%3で求めて、勝ち負けの判定をするメソッド。
     * @param cpuHand
     * @param playerHand
     */
    public void judgement(int cpuHand, int playerHand) {
        judge =( cpuHand - playerHand + 3)%3;

        switch (judge) {
            case 0:
                System.out.println("あいこです");
                break;
            case 1:
                System.out.println("あなたの勝ち！");
                break;
            case 2:
                System.out.println("あなたの負け！");
                break;
            default:
        }
    }

}
