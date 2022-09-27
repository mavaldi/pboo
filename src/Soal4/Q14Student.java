package Soal4;

public class Q14Student
{
    private String name;
    private String studentID;
    private String degreeProgramme;

    public Q14Student(String name, String studentID, String degreeProgramme)
    {
        this.name = name;
        this.studentID = studentID;
        this.degreeProgramme = degreeProgramme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDegreeProgramme() {
        return degreeProgramme;
    }

    public void setDegreeProgramme(String degreeProgramme) {
        this.degreeProgramme = degreeProgramme;
    }

    @Override
    public String toString()
    {
        return String.format("[%s, ID: %s, %s]", this.name, this.studentID, this.degreeProgramme);
    }
}
