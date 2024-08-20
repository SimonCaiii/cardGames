package project;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author simon................laptop
 * @date 2024/8/20 10:40 上午
 * @description:
 */
@Data
public class Deck {
    private List<Card> cardList;
    private String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String[] suit = {"clubs", "diamonds", "hearts", "spades"};

    public Deck(){
        this.cardList = new ArrayList<>();
    }

    public void initialize(){
        for (String suitElement : suit){
            for (String rankElement : rank){
                cardList.add(new Card(rankElement,suitElement));
            }
        }
    }

    public void shuffle(){
        for (int i = cardList.size()-1; i > 0 ; i--) {
            Card currentCard = cardList.get(i);
            int j = new Random().nextInt(i);
            cardList.set(i,cardList.get(j));
            cardList.set(j,currentCard);

        }
    }

    public void drawCard(){
        cardList.remove(cardList.get(cardList.size()-1));
    }

    public void display(){
        for (int i = 0; i < cardList.size() ; i++) {
            Card card = cardList.get(i);
            System.out.println("suit: " + card.getSuit() +" rank: " + card.getRank());
        }
    }
}
