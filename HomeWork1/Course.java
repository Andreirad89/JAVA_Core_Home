package workhome1new;

public class Course {
    private int runDistance;
    private int jumpLeght;
    private int swimmDistance;

    public Course(int runDistance, int jumpLeght, int swimmDistance) {
        this.runDistance = runDistance;
        this.jumpLeght = jumpLeght;
        this.swimmDistance = swimmDistance;
    }

    public void letsGo(Team team) {
        for (People p : team.getParticipants()) {
            p.run(runDistance);
            p.jump(jumpLeght);
            p.swimm(swimmDistance);
        }
    }
}
