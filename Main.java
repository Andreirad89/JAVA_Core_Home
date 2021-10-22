package workhome1new;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(330,2,150);

        Team team = new Team("Команда1",
                new People("Андрей", 30, 300, 3, 150),
                new People("Паша", 30, 330, 1, 100),
                new People("Сергей", 30, 350, 3, 180),
                new People("Иван", 30, 300, 1, 100)
        );

        course.letsGo(team);
        team.showResults();
    }
}
