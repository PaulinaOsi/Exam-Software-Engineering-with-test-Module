/*
 Name:Paulina Osikoya
 G00348898
 lecturer:Paul lennon

 Brief : creat an Employee class with the relevant information in order to carry out the tests in the Employeee test class

 */
package TestExam.G00348898.PaulinaOsikoya;
public class Employee {

/*****************VARS*********************/
private String title; // mr ms mrs
private String name; // min 5 max 22
private String pps; // 6 char length
private int phone; //7 digits
private String employmentType; //full-time / part-time
private int age; //over 18

    /****************CONSTRUCTOR*********************/
    public Employee(String title, String name, String pps, int phone, String employmentType, int age) {

        //error checking
        //title
        if(title.equalsIgnoreCase("Mr")||title.equalsIgnoreCase("Mrs")||title.equalsIgnoreCase("Ms")){
            this.title = title;
        }else{
            throw  new IllegalArgumentException("invalid title");
        }

        //name
        if(name.length()>5 || name.length()<=22){
            this.name = name;
        }else{

            throw  new IllegalArgumentException("invalid name");
        }

        //pps
        if(pps.length()<6){
            throw  new IllegalArgumentException("invalid pps");
        }else{
            this.pps = pps;
        }

        //phone
        if(phone>=9999999){
            throw  new IllegalArgumentException("invalid number");
        }else{
            this.phone = phone;
        }

        //emptype
        if(employmentType.equalsIgnoreCase("part-time")||employmentType.equalsIgnoreCase("full-time")){
            this.employmentType = employmentType;
        }else{
            throw  new IllegalArgumentException("invalid employment type");
        }

        //age
        if(age<18){
            throw  new IllegalArgumentException("invalid age - too young");
        }else{
            this.age = age;
        }

    }

    /****************GETTERS AND SETTERS********************/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equalsIgnoreCase("Mr")||title.equalsIgnoreCase("Mrs")||title.equalsIgnoreCase("Ms")){
            this.title = title;
        }else{
            throw  new IllegalArgumentException("invalid title");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>5 || name.length()<=22){
            this.name = name;

        }else{
            throw  new IllegalArgumentException("invalid name");
        }
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        if(pps.length()<6){
            throw  new IllegalArgumentException("invalid pps");
        }else{
            this.pps = pps;
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if(phone>=1000000){
            throw  new IllegalArgumentException("invalid number");
        }else{
            this.phone = phone;
        }
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if(employmentType.equalsIgnoreCase("part-time")||employmentType.equalsIgnoreCase("full-time")){
            this.employmentType = employmentType;
        }else{
            throw  new IllegalArgumentException("invalid employment type");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age<18){
            throw  new IllegalArgumentException("invalid age - too young");
        }else{
            this.age = age;
        }
    }
}

