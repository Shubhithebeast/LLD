
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Shubham";
        employee.setId(101);
        employee.department = "Engineering";
        employee.work();

        FullTimeEmp fullTimeEmp = new FullTimeEmp();
        fullTimeEmp.name = "Rahul";
        fullTimeEmp.setId(102);
        fullTimeEmp.department = "Marketing";
        fullTimeEmp.monthlySalary = 50000.0;
        fullTimeEmp.paidLeaves = 20;

        fullTimeEmp.work();

        ContractEmp contractEmp = new ContractEmp();
        contractEmp.name = "Neena";
        contractEmp.setId(103);
        contractEmp.department = "HR";
        contractEmp.dailyWage = 2000.0;
        contractEmp.duration = 30;

        contractEmp.work();




    }
}