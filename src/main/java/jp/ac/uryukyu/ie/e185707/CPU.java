package jp.ac.uryukyu.ie.e185707;
import java.util.*;

public class CPU {
    int hand;

    public void setHand() {
        double rand = Math.random() * 3;
        hand = (int)rand;
    }

    public int getHand() {
        return this.hand;
    }
}
