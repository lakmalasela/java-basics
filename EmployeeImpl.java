public class EmployeeImpl implements EmployeeService{

    public String getName(){
        return "Amal Silva";
    }


    public static void main(String[] args) {
        EmployeeImpl employee = new EmployeeImpl();
        String Firstname = employee.getName();

        System.out.println("First name is "+Firstname);
    }
}
