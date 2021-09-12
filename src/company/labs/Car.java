package labs;

public class Car implements Nameable {
    private String m_name;


    public Car()
    {
        this.m_name = "Ford";
    }

    public Car(String name)
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
        return "Car{" +
                "m_name='" + m_name + '\'' +
                '}';
    }
}
