package 게임만들기;

public class Character extends Unit implements GameAction{
    //name : 캐릭터 이름
    // pP : 물리 힘
    // Mp : 마력
    // pH : 물리 적중률
    // mH : 마법 적중률
    // ultra : 궁극기 데미지
    // hP
    public Character(String name, int pP, double pPen, int mP, double mPen, int ultra, int hp) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pPen = pPen;
        this.mPen = mPen;
        this.ultraPower = ultra;
        this.healthPoint = hp;
    }
    @Override
    public double pAttack() {
        return pPower * pPen;
    }

    @Override
    public double mAttack() {
        return mPower * mPen;
    }

    @Override
    public int ultimate() {
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {
        if(healthPoint > damage) {
            healthPoint -= damage;
            System.out.println("남아있는 " + name + "의 체력은 " + healthPoint + "입니다!!");
            return false;
        } else {
            System.out.println(name + "(이)가 사망했습니다!!!!");
            return true;
        }
    }
}
