package ch07.sec07.poly2;
// 캡슐화
// 본인이 가지고 있는 소유금액을 저장할 수 있다. (Money)
// 소유금액은 만원 단위이며 일천만원을 기본적으로 가지고 있다.
// 제품 구매시 보너스 점수를 저장할 수 있다. (bonusPoint)
// 컴퓨터, 티비를 구매할 수 있다. buy 메소드
// 구매시 제품 가격만큼 소유금액은 차감된다.
// 구매시 구매한 제품이름이 출력된다.
// e.g. "Tv을/를 구입하였습니다."
// e.g. "Computer을/를 구입하였습니다."
// 구매시 구매 포인트를 적립된다.
// 구매시 소유금액이 부족하면 "잔액이 부족합니다."
// 내용이 출력되면서 구매하지 않는다.
public class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1_000;
    }

    public void buy(Product product) {
        if(this.money < product.getPrice()) {
            System.out.println("잔액이 부족합니다.");
            return;
        } else {
            System.out.println(product + "의 가격 : " + product.getPrice());
            System.out.printf("%s을/를 구입하였습니다.\n", product);
            this.money -= product.getPrice();
            this.bonusPoint += product.getBonusPoint();
            System.out.println("남은 잔액 : " + getMoney());
            System.out.println("포인트 : " + getBonusPoint());
            System.out.println("------------------");
        }
    }

    public int getMoney() {
        return this.money;
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }
}
