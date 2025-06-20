package ch08.sec11.exam02;
   /*
    인터페이스는 인스턴스 멤버필드를 가질 수 없다.
    static final 멤버필드는 가질 수 있따.

    무조건 추상메소드만 가질 수 있다.
    public abstract 는 생략 가능
    자동으로 붙기 때문

    인터페이스가 인터페이스를 상속 받을 땐 extend 사용
    인터페이스는 클래스를 상속 받을 수 없다
    클래스가 인터페이스를 상속 받을 땐 implements 사용
     */


// 운송수단
public interface Vehicle {

    void run();
    void stop();
}

