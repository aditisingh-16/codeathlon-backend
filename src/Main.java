import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Problem> problems = ProblemRepository.getDailyWorkout("Amazon", 2);

        for (Problem p : problems) {
            System.out.println(p.getTitle() + " | " + p.getTopic() + " | " + p.getDifficulty() + " | " + p.getCompany());
        }
    }
}