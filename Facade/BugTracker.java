public class BugTracker {
    private Boolean activeSprint;

    public Boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
