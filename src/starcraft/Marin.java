package starcraft;

public class Marin extends GroundUnit {

    public void stimPack() {
        System.out.println("스팀팩 사용!");
    }

    @Override
    public String toString() {
        return "Marin";
    }
}
