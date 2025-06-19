package starcraft;

// 수송기
// 8개의 지상유닛을 태울 수 있따.
public class DropShip extends FlyingUnit {
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadIndex = 0;

    // 유닛 하나를 태운다. 메소드 load
    // 태웠으면 return true, 못 태웠으면 return false
    public boolean load(GroundUnit unit) {
        if (this.loadIndex == units.length) {
            System.out.println("인원이 가득 찼습니다.");
            return false;
        }
        System.out.println(unit + "를/을 태웠습니다. 현재 인구: " + (loadIndex + 1));
        units[this.loadIndex++] = unit;
        return true;
    }

    // 유닛 하나를 떨군다. 메소드명 unload
    public GroundUnit unload() {
        if(loadIndex == 0) {
            System.out.println("뺄 인원 없음.");
            return null;
        }
        GroundUnit temp = units[--loadIndex];
        units[loadIndex] = null;
        System.out.println("현재 인구: " + loadIndex);
        return temp;
    }

    public int getLoadIndex() {
        return loadIndex;
    }
}
