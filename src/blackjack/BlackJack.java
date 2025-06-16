package blackjack;
import java.util.List;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
//        cd.printAllCards();

        Card c= cd.getCard();

        System.out.println(c);
        System.out.println(cd.getCard());
        System.out.println(cd.getCard());

        System.out.println("------------");
        cd.printAllCards();
        System.out.println("-----게이머 카드-------");

//        System.out.println(cd);
//        System.out.println(cd.toString());
////
//        String str= "안녕";
//        System.out.println(str);
//        System.out.println(str.toString());

        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());
        gamer.showCards();
        List<Card> cards = gamer.openCards();
        int score = Rule.getScore(cards); //A: 1, 2~10 점수 그대로, j,q,k 10점

        System.out.printf("score: %d\n", score);

        System.out.println("-----딜러 카드-------");
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        dealer.showCards();
        System.out.printf("needMoreCard: %b\n", dealer.isMoreCard());
        if(dealer.isMoreCard()) {
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();
        System.out.println("----- 결과 -----");
        Rule.getWinner(dealer, gamer);
    }
}