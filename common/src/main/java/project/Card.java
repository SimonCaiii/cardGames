package project;

import lombok.Data;

/**
 * @author simon................laptop
 * @date 2024/8/20 10:32 上午
 * @description:
 */
@Data
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

}
