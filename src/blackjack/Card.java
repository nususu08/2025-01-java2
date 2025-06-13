package blackjack;
// 무늬 pattern - Spade, Heart, Clover, Diamond
// 값 denomination = A, 2, 3, 4, 5 .. 9, 10, J, Q, K
public class Card {
    private String pattern;
    private String denomination;

    // 생성자, 메소드 차이, 다른 2가지

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.pattern, this.denomination);
    }
}
