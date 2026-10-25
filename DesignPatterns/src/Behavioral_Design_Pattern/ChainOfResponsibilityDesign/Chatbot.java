package Behavioral_Design_Pattern.ChainOfResponsibilityDesign;

public class Chatbot implements CustomerSupportHandler {

    private CustomerExecutive nextHandler;

    public Chatbot(CustomerExecutive handler){
        this.nextHandler = handler;
    }

    public void handleIssue(Issue issue) {
        System.out.println("Chatbot handling issue: ");

        if(issue.getPriority().equals("Level1")){
            System.out.println("Chatbot resolved Level1 issue: ");
            issue.setStatus("Resolved by Chatbot");
        }else{
            System.out.println("Chatbot cannot handle issue: ");
           issue.setStatus("Escalated to Customer Executive");
            nextHandler.handleIssue(issue);
        }


    }

}   
