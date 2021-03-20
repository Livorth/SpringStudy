package cn.livorth.Pojo;

public class TestPorC {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestPorC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestPorC() {
    }

    @Override
    public String toString() {
        return "TestPorC{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
