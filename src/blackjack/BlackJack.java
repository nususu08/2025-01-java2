package blackjack;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cards = new CardDeck();
        cards.printAllCards();
        Card c = cards.getCard();
        System.out.println(c);

        System.out.println("-----------------");
        System.out.println(cards.getCard());
        System.out.println(cards.getCard());

        System.out.println("----------------------");
        cards.printAllCards();
    }
}
