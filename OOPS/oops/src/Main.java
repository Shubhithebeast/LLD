
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Shubham";
        employee.setId(101);
        employee.department = "Engineering";
        employee.attendMeeting();
        employee.work();

        Employee employee2 = new Employee();
        employee2.name = "Isha";
        employee2.setId(-11);
        employee2.department = "Marketing";
        employee2.attendMeeting();
        employee2.work();


    }
}