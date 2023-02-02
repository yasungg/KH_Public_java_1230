package 게임만들기;
//추상클래스 생성했기 때문에 객체 생성이 안됨
public abstract class Unit {
    protected String name; // 캐릭터이름
    protected int pPower; // 물리적 힘
    protected int mPower; // 마력
    protected double pPen; // 물리 관통력
    protected double pHit; // 물리 적중률
    protected double mPen;// 마법 관통력
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기
    protected int healthPoint; // 체력
}
