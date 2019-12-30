package Poke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card{
    private String suit;
    private String rank;
    public Card(String suit, String rank) {
        this.suit = suit;  //花色
        this.rank = rank;  //点数
    }
    @Override
    public String toString() {
        return  "(" + suit +" " + rank +")";
    }

}
public class CardDemo{
    private static String[] SUIT={"♠","♣","♦","❤"};
    public static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=2;j<11;j++){
                poker.add(new Card(SUIT[i],j+""));
            }
            poker.add(new Card(SUIT[i],"J"));
            poker.add(new Card(SUIT[i],"Q"));
            poker.add(new Card(SUIT[i],"K"));
            poker.add(new Card(SUIT[i],"A"));

        }
        return poker;
    }

    public static void main(String[] args) {
      //1.初始化牌
        System.out.println("创建第一副牌");
        List<Card> poker=buyPoker();
        //2.洗牌
        Collections.shuffle(poker);
        //3.发牌
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        for(int cardIndex=0;cardIndex<5;cardIndex++){
            for(int playerNum=0;playerNum<3;playerNum++){
                players.get(playerNum).add(poker.remove(0));
            }
        }
        System.out.println(players.get(0));
        System.out.println(players.get(1));
        System.out.println(players.get(2));
    }
}