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
        ProgressTracker tracker = new ProgressTracker();

        // Add problems from workout
        for (Problem p : problems) {
            tracker.addProblem(p.getTopic());
        }

        // Simulate solving all problems
        if (!problems.isEmpty()) {
            Problem p = problems.get(0); // solve only first problem
            tracker.markSolved(p.getTopic());
        }

        // Show progress
        tracker.showProgress();
    }
}