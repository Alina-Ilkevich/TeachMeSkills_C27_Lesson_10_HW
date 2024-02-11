package run;

import cardOperation.CardOperation;
import fabric.Fabric;

/**
 *This class is used to check the written code
 */
public class Runner {
    public static void main(String[] args) {
        CardOperation.compareCard(Fabric.createCards());
        CardOperation.countCard(Fabric.createCards());
    }
}
