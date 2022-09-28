public class Q14Student
{
    // Class attribute in string for student "name"
    private String name;

    // Class attribute in string for student "studentID"
    private String studentID;

    // Class attribute in string for student "degreeProgramme"
    private String degreeProgramme;

    // Class constructor for the Q14Student class in public type so it can be used in another class
    // The this keyword is used to refer to the current object
    public Q14Student(String name, String studentID, String degreeProgramme)
    {
        this.name = name;
        this.studentID = studentID;
        this.degreeProgramme = degreeProgramme;
    }

    // Getter method to return the value of variable name
    public String getName()
    {
        return name;
    }

    // Setter method that takes parameter name and assigns it to the name variable
    // The this keyword is used to refer to the current object
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter method to return the value of variable studentID
    public String getStudentID()
    {
        return studentID;
    }

    // Setter method that takes parameter studentID and assigns it to the studentID variable
    // The this keyword is used to refer to the current object
    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    // Getter method to return the value of variable degreeProgramme
    public String getDegreeProgramme()
    {
        return degreeProgramme;
    }

    // Setter method that takes parameter degreeProgramme and assigns it to the degreeProgramme variable
    // The this keyword is used to refer to the current object
    public void setDegreeProgramme(String degreeProgramme)
    {
        this.degreeProgramme = degreeProgramme;
    }

    // toString method that returns a string in the given format
    @Override
    public String toString()
    {
        return String.format("[%s, ID: %s, %s]", this.name, this.studentID, this.degreeProgramme);
    }
}
