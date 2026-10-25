package Behavioral_Design_Pattern.ChainOfResponsibilityDesign;

public class Main {

    public static void main(String[] args) {
        // Chain of Responsibility Design is a behavioral design pattern that allows passing requests along a chain of handlers.

        Client client = new Client(new Chatbot(new CustomerExecutive(new TechTeam())));
        client.raiseIssue(new Issue("Level1", "Level1 issue description"));
    }

}
