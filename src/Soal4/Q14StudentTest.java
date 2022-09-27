package Soal4;

public class Q14StudentTest
{
    public static void main(String[] args) {
        Q14Student q14Student = new Q14Student("Rizqy Mavaldi", "5025201111", "Informatics");
        System.out.println("Sebelum dirubah");
        System.out.println(q14Student.toString());

        System.out.println("\nSetelah dirubah");
        q14Student.setStudentID("5025201110");
        q14Student.setName("Mavaldi Rizky");
        q14Student.setDegreeProgramme("Bachelor Informatics");
        System.out.println(q14Student.toString());

        System.out.println("\nTes Getter");
        System.out.println("Name: " + q14Student.getName());
        System.out.println("ID: " + q14Student.getStudentID());
        System.out.println("Degree Programmer: " + q14Student.getDegreeProgramme());
    }
}
