package Behavioral_Design_Pattern.ChainOfResponsibilityDesign;

public class Client {

    private CustomerSupportHandler supportHandler;

    public Client( CustomerSupportHandler handler ){
        this.supportHandler = handler;
    }

    public void raiseIssue (Issue issue){
        System.out.println("Raising issue: " + issue);
        supportHandler.handleIssue(issue);
    }

}
