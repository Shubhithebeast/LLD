package Behavioral_Design_Pattern.ChainOfResponsibilityDesign;

public class TechTeam implements CustomerSupportHandler {

    public void handleIssue(Issue issue) {
        System.out.println("Tech Team handling issue: " );
        if(issue.getPriority().equals("Level3")){
            System.out.println("Tech Team resolved Level3 issue: ");
            issue.setStatus("Resolved by Tech Team");
        }else{
            System.out.println("Tech Team cannot handle issue: ");
            issue.setStatus("Issue could not be resolved");
        }
    }

}
