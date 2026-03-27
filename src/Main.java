import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Daily workout
        List<Problem> problems = ProblemRepository.getBalancedWorkout("Amazon");

        System.out.println("Today's Workout:");
        for (Problem p : problems) {
            System.out.println(p.getTitle() + " | " + p.getTopic() + " | " + p.getDifficulty());
        }

        // Streak simulation
       UserStats user = new UserStats();

        // Simulate yesterday activity
        user.setLastSolvedDate(java.time.LocalDate.now().minusDays(1));
        user.setStreak(1); // important!

        user.updateStreak(); // today

        System.out.println("\nCurrent Streak: " + user.getStreak());
    }
}