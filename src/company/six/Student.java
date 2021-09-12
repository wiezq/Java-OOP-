package six;

public class Student implements Comparable<Student> {

    private String m_name;
    private String m_group;
    private int m_course;
    private int m_id;
    private int m_GPA;


    public Student(String name, String group, int course, int id, int GPA) {
        this.m_name = name;
        this.m_group = group;
        this.m_course = course;
        this.m_id = id;
        this.m_GPA = GPA;
    }

    public int getId() {
        return this.m_id;
    }

    public int getGPA() {
        return this.m_GPA;
    }

    @Override
    public int compareTo(Student otherStudent) {

        if (this.getId() == otherStudent.getId()) {
            return 0;
        } else if (this.getId() < otherStudent.getId()) {
            return -1;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "Name :" + this.m_name + " Id :" + this.m_id + " GPA: " + this.getGPA();
    }


}
