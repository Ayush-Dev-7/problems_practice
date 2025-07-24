package pojo;

public class Boy {
    int age;
    String name;

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Boy() {
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

    @Override
    public String toString() {
        return name;
    }
}
