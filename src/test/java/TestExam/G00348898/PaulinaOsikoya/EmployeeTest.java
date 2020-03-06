/*
 Name:Paulina Osikoya
 G00348898
 lecturer:Paul lennon

 Brief : creat an Employee class with the relevant information in order to carry out the tests in the Employeee test class

 */
package TestExam.G00348898.PaulinaOsikoya;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


public class EmployeeTest {
    private Employee myEmployee;

   /**************************PRE TEST START**************************/
    @BeforeAll
    @DisplayName("Starting the Test")
    public static void print(){
        System.out.println("Starting the tests.");
    }
    /*****************************************************************/


    /**************************CREATE INSTANCE**************************/
    @BeforeEach
    @DisplayName("New instance of the Employee")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myEmployee = new Employee("Ms","Paulina","123456",8712345,"full-time",21);
        System.out.println("TimeStamp = "+ testInfo.getDisplayName());
    }
    /*****************************************************************/

    /**************************TESTS**************************/

    @Test
    @DisplayName("Testing Getter and Setters")
    void testGettersAndSetter(TestInfo testInfo, TestReporter testReporter)
    {

        //title
        //Mr
        myEmployee.setTitle("Mr");
        assertEquals(myEmployee.getTitle(),"Mr");
        //Mrs
        myEmployee.setTitle("Mrs");
        assertEquals(myEmployee.getTitle(),"Mrs");
        //Ms
        myEmployee.setTitle("Ms");
        assertEquals(myEmployee.getTitle(),"Ms");
        //name
        myEmployee.setName("john");
        assertEquals(myEmployee.getName(),"john");
        //pps
        myEmployee.setPps("123456");
        assertEquals(myEmployee.getPps(),"123456");
        //phone
        myEmployee.setPhone(999999);
        assertEquals(myEmployee.getPhone(),999999);
        //employmentType
        //FullTime
        myEmployee.setEmploymentType("full-time");
        assertEquals(myEmployee.getEmploymentType(),"full-time");
        //PartTime
        myEmployee.setEmploymentType("part-time");
        assertEquals(myEmployee.getEmploymentType(),"part-time");
        //age
        myEmployee.setAge(21);
        assertEquals(myEmployee.getAge(),21);
    }

    @Test
    @DisplayName("Invalid Title")
    void testTileInvalid(TestInfo testInfo, TestReporter testReporter)
    {
        //title
        //Mr
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            myEmployee.setTitle("Yo");
        });
    }

    @Test
    @DisplayName("Invalid pps")
    void testPPSInvalid(TestInfo testInfo, TestReporter testReporter)
    {
        //title
        //Mr
        myEmployee.setPps("123456");
        assertEquals(myEmployee.getPps(),"123456");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            myEmployee.setTitle("1234");
        });
    }


    @Test
    @DisplayName("Invalid EmpType")
    void testEmpTypeInvalid(TestInfo testInfo, TestReporter testReporter)
    {
        //title
        //Mr
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            myEmployee.setEmploymentType("Yo");
        });
    }

    @Test
    @DisplayName("Invalid age")
    void testAgeInvalid(TestInfo testInfo, TestReporter testReporter)
    {
        //age
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            myEmployee.setAge(16);
        });
    }


    @Test
    @DisplayName("Invalid phone")
    void testPHONEInvalid(TestInfo testInfo, TestReporter testReporter)
    {
        //Phone
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            myEmployee.setPhone(999999999);
        });
    }

    @Test
    @DisplayName("valid Constructor")
    void testConstructorvalid(TestInfo testInfo, TestReporter testReporter)
    {

        myEmployee = new Employee("Ms","Paulina","123456",8712345,"full-time",21);

        assertEquals(myEmployee.getTitle(),"Ms");

        assertEquals(myEmployee.getName(),"Paulina");

        assertEquals(myEmployee.getPps(),"123456");

        assertEquals(myEmployee.getPhone(),8712345);

        assertEquals(myEmployee.getEmploymentType(),"full-time");

        assertEquals(myEmployee.getAge(),21);
    }

    @Test
    @DisplayName("invalidvalid Constructor")
    void testConstructorinvalid(TestInfo testInfo, TestReporter testReporter)
    {

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Employee("Ms","Paulina","123456",8712345,"full-time",16);
        });

    }

    /**************************POST TEST DONE**************************/
    @AfterAll
    @DisplayName("Ending the Test")
    public static void done(){
        System.out.println("Completed the tests.");
    }
    /*****************************************************************/

}
