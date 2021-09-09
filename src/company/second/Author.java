package second;

public class Author {
    private String m_name;
    private String m_email;
    private char m_gender;

    public Author(String name, String email, char gender) {
        this.m_name = name;
        this.m_email = email;
        this.m_gender = gender;
    }

    public String getName() {
        return this.m_name;
    }

    public String getEmail() {
        return this.m_email;
    }

    public char getGender() {
        return this.m_gender;
    }

    public void setEmail(String email) {
        this.m_email = email;
    }

    @Override
    public String toString() {
        return m_name + "(" + m_gender + ")" + " at " + m_email;
    }
}
