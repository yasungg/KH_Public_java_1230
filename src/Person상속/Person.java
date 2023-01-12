package Person상속;

public class Person {
    int age;
    int sleep;

    void setAge(int age) {
            this.age = age;
        }
    void setSleep(int sleep) {
        this.sleep = sleep;
    }
    int getAge() {
        return this.age;
    }
    int getSleep() {
        return this.sleep;
    }

}
class Worker extends Person {
    private int work;
    Worker() {
        age = 38;
        sleep = 8;

    }
    void setWork(int work) {
        this.work = work;
    }
    int getWork() {
        return this.work;
    }
}
class Student extends Person{
    int study;
    Student() {
        age = 38;
        sleep = 8;

    }
    void setStudy(int study) {
        this.study = study;
    }
    int getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return this.study;
    }
    }



