class Person{
    String name = "sneha";
    void displayPerson(){
         System.out.println(name);
    }
}
class Employee extends Person{
    int employeeId =17;
    void displayEmployee(){
         System.out.println(employeeId);
    }
}
class Manager extends Employee{
    String department="cse";
    void diaplayManager(){
        System.out.println(department);
    }
}
public class Multiple {
    public static void main(String args[]){
        Manager ob = new Manager();
        ob.displayPerson();
        ob.displayEmployee();
        ob.diaplayManager();
    }
}