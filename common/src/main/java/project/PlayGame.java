package project;

import java.util.List;

/**
 * @author simon................laptop
 * @date 2024/8/20 11:20 上午
 * @description:
 */
public class PlayGame {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> cardList = deck.getCardList();

        //test for initialize
        deck.initialize();

        //test for display
        deck.display();

        //test for shuffle
        deck.shuffle();

        deck.display();
    }
}
