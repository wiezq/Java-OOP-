package first;

public class Dog {
    private String m_name;
    private int m_age;

    public Dog(String name, int age) {
        m_name = name;
        m_age = age;
    }

    public Dog(String name) {
        m_name = name;
        m_age = 0;
    }

    public void setAge(int age) {
        this.m_age = age;

    }

    public int getAge() {
        return m_age;
    }

    public void setName(String name) {
        this.m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public String toString() {
        return "Кличка: " + this.m_name + "\nВозраст: " + this.m_age;
    }

    public void intoHumanAge() {
        System.out.println(m_name + "'s age in human years is " + m_age * 7 + " years");
    }
}
