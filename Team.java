package workhome1new;

public class Team {
    private String name;
    private People[] participants;

    public Team(String name, People... participants) {
        this.name = name;
        this.participants = participants;
    }

    public People[] getParticipants() {
        return participants;
    }

    public void showResults() {
        System.out.println("Результаты прохождение полосы командой " + name);

        for (People p : participants) {
            System.out.println(p.getResult());
        }
    }
}
