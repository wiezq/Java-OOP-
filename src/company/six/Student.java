package six;

public class Student implements Comparable<Student> {

    private String m_name;
    private String m_group;
    private int m_course;
    int m_id;

    public Student(String name, String group, int course, int id)
    {
        this.m_name = name;
        this.m_group = group;
        this.m_course = course;
        this.m_id = id;
    }

    public int getId()
    {
        return this.m_id;
    }

    @Override
    public int compareTo(Student otherStudent) {
        
        return Integer.compare(getId(), otherStudent.getId());
    }

    @Override
    public String toString() {
        return "Name : " + this.m_name + "\nId : " + this.m_id;
    }


    
}
