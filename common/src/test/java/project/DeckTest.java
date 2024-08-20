package project;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author simon................laptop
 * @date 2024/8/20 11:45 上午
 * @description:
 */
public class DeckTest {
    Deck deck = new Deck();
    final String suitClubs = "clubs";
    final String suitDiamonds = "diamonds";
    final String suitHeart = "hearts";
    final String suitSpades = "spades";

    /**
     * test the size of the cardList
     * */
    @Test
    public void initialize() {
        deck.initialize();
        List<Card> cardList = deck.getCardList();
        assertEquals(52, cardList.size());
    }

    /**
     * test the number of different suits
     * */
    @Test
    public void testNumberOfDifferentSuits() {
        deck.initialize();
        List<Card> cardList = deck.getCardList();
        int clubsCount = calaulateNumber(cardList, suitClubs);
        int diamondsCount = calaulateNumber(cardList, suitDiamonds);
        int heartsCount = calaulateNumber(cardList, suitHeart);
        int spadesCount = calaulateNumber(cardList, suitSpades);
        assertEquals(13,clubsCount);
        assertEquals(13,diamondsCount);
        assertEquals(13,heartsCount);
        assertEquals(13,spadesCount);
    }

    /**
     * test the function of shuffle
     * */
    @Test
    public void testShuffle(){
        deck.initialize();
        List<Card> cardList = deck.getCardList();
        deck.shuffle();
        int clubsCount = calaulateNumber(cardList, suitClubs);
        int diamondsCount = calaulateNumber(cardList, suitDiamonds);
        int heartsCount = calaulateNumber(cardList, suitHeart);
        int spadesCount = calaulateNumber(cardList, suitSpades);
        assertEquals(13,clubsCount);
        assertEquals(13,diamondsCount);
        assertEquals(13,heartsCount);
        assertEquals(13,spadesCount);
    }


    /**
     * test withdraw card from the end of the cardlist
     * */
    @Test
    public void testDrawCards(){
        deck.initialize();
        deck.drawCard();
        assertEquals(51,deck.getCardList().size());
        deck.display();
    }

    public int calaulateNumber(List<Card> cardList,String suit){
        int count = 0;
        for (int i = 0; i <cardList.size() ; i++) {
            Card card = cardList.get(i);
            if(suit.equals(card.getSuit())){
                count++;
            }
        }
        return count;
    }






}