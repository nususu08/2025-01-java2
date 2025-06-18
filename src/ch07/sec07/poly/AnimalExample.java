package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(dog);
        animalCrying(bulldog);
        // 월~ 월~
        // 불독이 쩜프한다
    }
    public static void animalCrying(Animal ani) {
        ani.crying();
        if(ani instanceof Dog) {
            Dog dog2 = (Dog)ani;
            dog2.jump();
        }



    }
}
