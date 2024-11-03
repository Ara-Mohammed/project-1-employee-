public class Display {

    public static void header() {
        System.out.println("NAME OF EMPLOYEE                YEARLY SALARY");
        System.out.println("________________                ______________");
    }

    public static void displayEmployeeInfo(Employee employee) {
      
        System.out.println(employee.getFirstName() 
        + " " + employee.getLastName() + "           $" +
        employee.getYearlySalary());
    }

    public static void main(String[] args) {
        Employee a = new Employee("Ara", "Mohammed         ", 5000);
        Employee b = new Employee("Sahand", "Ari           ", 6000);
        header();
        displayEmployeeInfo(a);
        
        displayEmployeeInfo(b);

        System.out.println("\n\n***************************************");
        
        System.out.println("* 10 Percent Salary Raised, congrats! *");
        
        System.out.println("***************************************");

        
        a.rise(10);  
        b.rise(10);  
        
        System.out.println();
        
        displayEmployeeInfo(a);
        
        displayEmployeeInfo(b); 
    }
}
