
public class Main {
    public static void main(String[] args) {

    // Encapsulation : Encapsulation is the process of wrapping data (variables) and code (methods) together as a single unit.
        // In Java, encapsulation is achieved using access modifiers. It allows us to restrict access to the internal state of an object
        // and protect it from unauthorized access and modification.

        Employee employee = new Employee();
        employee.name = "Shubham";
        employee.setId(101);
        employee.department = "Engineering";
        // employee.work();

    // Inheritance : Inheritance is the process by which one class acquires the properties (fields) and behaviors (methods) of another class.
        FullTimeEmp fullTimeEmp = new FullTimeEmp();
        fullTimeEmp.name = "Rahul";
        fullTimeEmp.setId(102);
        fullTimeEmp.department = "Marketing";
        fullTimeEmp.monthlySalary = 50000.0;
        fullTimeEmp.paidLeaves = 20;
        // fullTimeEmp.work();

        ContractEmp contractEmp = new ContractEmp();
        contractEmp.name = "Neena";
        contractEmp.setId(103);
        contractEmp.department = "HR";
        contractEmp.dailyWage = 2000.0;
        contractEmp.duration = 30;
       // contractEmp.work();


    // Polymorphism : Polymorphism is the ability of an object to take on many forms.
        // In Java, polymorphism is achieved through method overloading and method overriding.
        // It allows us to use a single interface to represent different types of objects.

        // compile-time polymorphism (method overloading)

        Printer printer = new Printer();
//        printer.print();
//        printer.print("Document1");
//        printer.print("Document2", 5);
//        printer.print(3);
//        printer.print(2.5);
//        printer.print(null);

        // run-time polymorphism (method overriding)

        Vehicle vehicle = new Vehicle();
//        vehicle.description();

        Car car = new Car();
//        car.description();

        Vehicle vehicle2 = new Car();
//        vehicle2.description();




    // Abstraction : abstrations is the process of hiding the implementation details and showing only the functionality to the user.
        // In Java, abstraction is achieved using abstract classes and interfaces.
        // It allows us to focus on what an object does instead of how it does it.

        Payment payment1 = new NetBanking();
        payment1.pay();

        Payment payment2 = new Upi();
        payment2.pay();

        Payment payment3 = new CreditCard();
        payment3.pay();

    }
}