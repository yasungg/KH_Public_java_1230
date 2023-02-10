package 명함전송클라이언트;

import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    int age;
    String phone;
    String eMail;

    public NameCard(String name, int age, String phone, String eMail)  {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
