import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ProblemRepository {

    public static List<Problem> getAllProblems() {
        List<Problem> problems = new ArrayList<>();

        problems.add(new Problem(1, "Two Sum", "Arrays", "Easy", "Amazon"));
        problems.add(new Problem(2, "Reverse Linked List", "LinkedList", "Easy", "Google"));
        problems.add(new Problem(3, "Longest Substring Without Repeating Characters", "Strings", "Medium", "Amazon"));
        problems.add(new Problem(4, "Word Ladder", "Graph", "Hard", "Google"));
        problems.add(new Problem(5, "Climbing Stairs", "Dynamic Programming", "Easy", "Amazon"));

        return problems;
    }
    public static List<Problem> getProblemsByCompany(String company) {
        List<Problem> allProblems = getAllProblems();
        List<Problem> filtered = new ArrayList<>();

        for (Problem p : allProblems) {
            if (p.getCompany().equalsIgnoreCase(company)) {
                filtered.add(p);
            }
        }

        return filtered;
    }
    public static List<Problem> getDailyWorkout(String company, int count) {
    List<Problem> companyProblems = getProblemsByCompany(company);
    List<Problem> workout = new ArrayList<>();
    Collections.shuffle(companyProblems);

    for (int i = 0; i < count && i < companyProblems.size(); i++) {
        workout.add(companyProblems.get(i));
    }

    return workout;
}
}