public class Employee {
    String name;
    private int id;
    String department;

    void work(){
        System.out.println(name + " " + id + " is working in " + department + " department.");
    }

    void attendMeeting(){
        System.out.println(name + " is attending a meeting.");
    }

    void setId(int id){
        if(id<0){
            System.out.println("Invalid ID");
            return;
        }
        this.id = id;
    }
}
