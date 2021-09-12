package labs;

public class Person implements Nameable {
    private String m_name;


    public Person()
    {
        this.m_name = "Ivan";
    }

    public Person(String name)
    {
        this.m_name = name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }


    @Override
    public String getName() {
        return m_name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "m_name='" + m_name + '\'' +
                '}';
    }
}
