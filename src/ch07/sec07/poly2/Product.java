package ch07.sec07.poly2;
// 제품의 가격 정보를 저장할 수 있따.
// 제품구매시 제공하는 보너스 점수 저장할 수 있다 (bonusPoint)
// 캡슐화, immutable
// 외부에 값을 보내줄 수 DLt다.
public abstract class Product {
    private final int PRICE;
    private final int BONUSPOINT;

    public Product(int price) {
        this.PRICE = price;
        this.BONUSPOINT = (int)(price * 0.1); // 가격의 10%
    }

    public int getPrice() {
        return this.PRICE;
    }

    public int getBonusPoint() {
        return this.BONUSPOINT;
    }
}

