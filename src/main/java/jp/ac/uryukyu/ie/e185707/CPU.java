package jp.ac.uryukyu.ie.e185707;
import java.util.*;

public class CPU {
    int hand;

    /**
     * CPUの出す手をランダムに決めるメソッド。
     */
    public void setHand() {
        double rand = Math.random() ;
        hand = (int)rand;
    }

    public int getHand() {
        return this.hand;
    }
}
