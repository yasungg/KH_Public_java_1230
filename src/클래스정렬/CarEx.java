package 클래스정렬;

import org.jetbrains.annotations.NotNull;

public class CarEx implements Comparable<CarEx>{
    public String modelName;
    public int modelYear;
    public String color;

    public CarEx(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(@NotNull CarEx o) { // 정렬 조건을 넣어주는 것
        /*if(this.modelYear == o.modelYear) {//차의 연식이 같으면
            return this.modelName.compareTo(o.modelName);//이름을 기준으로 사전순 정렬
        } else if(this.modelYear < o.modelYear) return -1;
        else return 1;*/
        if(this.color.compareTo(o.color) == 0) {
            return this.modelName.compareTo(o.modelName);
        }
        return -1; // 중복인 경우 검색 조건을 하나 더 넣어주면 된다.
    }
}
