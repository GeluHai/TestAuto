/*
4. Create a class called Employee that includes three pieces of information as instance variables—
a first name (typeString), a last name (typeString) and a monthly salary (double).
Your class should have a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable.
If the monthly salary is not positive, set it to 0.0.
Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

package exercise4;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Pop", "Vasile", 7000);
        Employee employee2 = new Employee("Vasile", "Constantin", 6800);

        System.out.println(employee1.getFirstName()+" "+employee1.getLastName()+" has a yearly salary of "+ (12*employee1.getMonthlySalary()));
        System.out.println(employee2.getFirstName()+" "+employee2.getLastName()+" has a yearly salary of "+ (12*employee2.getMonthlySalary()));

        System.out.println("\nEverybody gets a 10% raise\n");

        System.out.println(employee1.getFirstName()+" "+employee1.getLastName()+" has a yearly salary of "+ (12*((employee1.getMonthlySalary()*110)/100)));
        System.out.println(employee2.getFirstName()+" "+employee2.getLastName()+" has a yearly salary of "+ (12*((employee2.getMonthlySalary()*110)/100)));
    }
}
