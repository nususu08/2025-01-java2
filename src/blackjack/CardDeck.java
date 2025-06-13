package blackjack;

public class CardDeck {
    private Card[] cards = new Card[52];// cards는 카드객체 52개의 주소값을 저장한 친구한테 접근할 수 있다
    private String[] pattern = {"Spade", "Heart", "Diamond", "Clover"};
    private String[] dinomination = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private int selectedIdx = 0;

    // 기본 생성자 작성
    public CardDeck() {
        // 각 방은 어떤 값만 들어갈 수 있는가?
        // 모든 방에 모두 다른 주소값을 넣는다.

        // 각 카드가 가지고 있는 값도 모두 달라야 합니다.
        // 패턴은 Spade, Heart, Diamond, Clover
        // 디노미네이션 A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
        // 13장 패턴은 모두 Spade
        // 13장 패턴은 모두 Heart
        int temp = 0;
        for (String string : pattern) {
            for (String s : dinomination) {
                cards[temp++] = new Card(string, s);
            }
        }
        shuffile();
    }

    private void shuffile() {
        for (int i=0; i<cards.length; i++) {
            int temp = (int)(Math.random() * cards.length);
            Card temp2 = cards[i];
            cards[i] = cards[temp];
            cards[temp] = temp2;
        }
    }

    public Card getCard() {
        if(selectedIdx < cards.length) {
            Card c = cards[selectedIdx];
            cards[selectedIdx++] = null;
            return c;
        }
        return null;
    }

    public void printAllCards() {
        for(Card card : cards) {
            // System.out.printf("%s (%s)\n", card.getPattern(), card.getDenomination());
            System.out.println(card);
        }
    }

}
