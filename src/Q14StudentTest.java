public class Q14StudentTest
{
    public static void main(String[] args)
    {
        // Create an object of class Q14Student (This will call the constructor)
        Q14Student studentData = new Q14Student("Mavaldi Rizqy", "5025211086", "Informatics");

        // Print out the student data before we change all the variables
        System.out.println("Before change :");
        System.out.println(studentData.toString());

        // Print out the student data after we change all the variables by using setter methods
        System.out.println("\nAfter change :");
        studentData.setStudentID("1000001");
        studentData.setName("Sri Purwaningsih");
        studentData.setDegreeProgramme("Bachelor Informatics");
        System.out.println(studentData.toString());

        // Testing the getter methods
        System.out.println("\nTest Getter methods :");
        System.out.println("Name: " + studentData.getName());
        System.out.println("ID: " + studentData.getStudentID());
        System.out.println("Degree Programmer: " + studentData.getDegreeProgramme());
    }
}
