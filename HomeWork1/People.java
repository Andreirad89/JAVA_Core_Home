package workhome1new;

public class People {
    private String name;
    private int age;
    private int maxRun;
    private int maxJump;
    private int maxSwimm;

    private boolean isRunningPassed;
    private boolean isJumpingPassed;
    private boolean isSwimmingPassed;

    public People(String name, int age, int maxRun, int maxJump, int maxSwimm) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwimm = maxSwimm;
    }

    public void infoPeople() {
        System.out.println("Имя: " + this.name + "; Возраст: " + this.age + "; Максимальная дистанция бега: " + this.maxRun
                + "; Максимальная дальность прыжка: " + this.maxJump + "; Максимальная дальность заплыва: " + this.maxSwimm);
    }
    public void run(int runDistance) {
        isRunningPassed = maxRun >= runDistance;
    }

    public void jump(int jumpLeght) {
        isJumpingPassed = maxJump >= jumpLeght;
    }

    public void swimm(int swimmDistance) {
        isSwimmingPassed = maxSwimm >= swimmDistance;
    }

    public String getResult() {
        return String.format("Участник %s: %s | %s | %s", name,
                isRunningPassed ? "пробежал дистанцию" : "увы, не смог пробежать",
                isJumpingPassed ? "выполнил прыжок" : "увы, прыжок не удался",
                isSwimmingPassed ? "проплыл дистанцию" : "yвы, не смог проплыть"
        );
    }
}
