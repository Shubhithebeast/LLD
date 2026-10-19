public class Printer {
    public void print() {
        System.out.println("Printing...");
    }

//    public void print(String document) {
//        System.out.println("Printing document: " + document);
//    }

    public void print(String document, int copies) {
        System.out.println("Printing " + copies + " copies of document: " + document);
    }

    public void print(int copies) {
        System.out.println("Printing " + copies + " copies of a document");
    }

    public void print(double size) {
        System.out.println("Printing a document of size: " + size + " MB");
    }

    static void print(String obj){
        System.out.println("String method called: ");
    }

    static void print(Object obj){
        System.out.println("Object method called: ");
    }

    public static void main(String[] args) {
        print(null);
    }

}
