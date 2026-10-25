package Behavioral_Design_Pattern.ChainOfResponsibilityDesign;

public class CustomerExecutive implements CustomerSupportHandler {

    private CustomerSupportHandler nextHandler;

    public CustomerExecutive(CustomerSupportHandler handler){
        this.nextHandler = handler;
    }

    public void handleIssue(Issue issue) {
        System.out.println("Customer Executive handling issue: ");
        if(issue.getPriority().equals("Level2")){
            System.out.println("Customer Executive resolved Level2 issue: ");
            issue.setStatus("Resolved by Customer Executive");
        }else{
            issue.setStatus("Escalated to Tech Team");
            nextHandler.handleIssue(issue);
        }
    }

}
