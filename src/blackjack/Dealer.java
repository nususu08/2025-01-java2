package blackjack;

import java.util.List;

public class Dealer extends Gamer {
    private final static int CAN_RECEIVE_POINT = 16; // 매직 넘버
    public boolean isMoreCard() {
     // 딜러가 가지고 있는 카드의 총 점수가 16점 이하면 true 리턴
     // 17점 이상이면 false 리턴
        int score = Rule.getScore(this.openCards());
        return score <= CAN_RECEIVE_POINT;
    }
}
