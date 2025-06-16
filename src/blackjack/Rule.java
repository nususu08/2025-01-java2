package blackjack;

import java.util.List;

public class Rule {
    public static void getWinner(Dealer dealer, Gamer gamer) {
        // 경우의 수 6가지
        // 1. 둘 다 총 점수가 21점 초과 >> 비김
        // 2. 둘 다 총 점수가 21점 이하지만 점수가 같음 >> 비김
        // 3. 딜러의 총 점수가 21점 초과 게이머의 총 점수가 21점 이하 >> 게이머 승
        // 4. 둘 다 총 점수가 21점 이하이지만 게이머의 총 점수가 21점에 가까움 >> 게이머 승
        // 5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 >> 딜러 승
        // 6. 둘 다 총 점수가 21점 이하이지만 딜러의 총 점수가 21점에 가까움 >> 딜러 승
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());
        if(dealerScore > 21 && gamerScore > 21) {
            System.out.println("Burst! 무승부 .");
        } else if(dealerScore <= 21 && gamerScore <= 21 && dealerScore == gamerScore) {
            System.out.println("점수 동일, 무승부.");
        } else if(dealerScore > 21 && gamerScore <= 21) {
            System.out.println("딜러 Burst! 게이머 승리");
        } else if(dealerScore <= 21 && gamerScore <= 21 && dealerScore < gamerScore) {
            System.out.println("게이머 승리");
        } else if(dealerScore <= 21 && gamerScore > 21) {
            System.out.println("게이머 Burst! 딜러 승리");
        } else if(dealerScore <= 21 && gamerScore <= 21 && dealerScore > gamerScore) {
            System.out.println("딜러 승리");
        }

    }


    public static int getScore(List<Card> cards) {
        int sum = 0;
        for (Card card : cards) {
            switch (card.getDenomination()) {
                case "A":
                    sum += 1;
                    break;
                case "J", "Q", "K":
                    sum += 10;
                    break;
                default:
                    sum += Integer.parseInt(card.getDenomination());
                    break;
            }
        }
        return sum;
        }
    private static int convertDenominationToScore(String denomination) {
        return switch(denomination) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
};
