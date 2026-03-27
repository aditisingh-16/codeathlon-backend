import java.util.HashMap;
import java.util.Map;

public class ProgressTracker {

    private Map<String, Integer> solvedCount;
    private Map<String, Integer> totalCount;

    public ProgressTracker() {
        solvedCount = new HashMap<>();
        totalCount = new HashMap<>();
    }

    public void addProblem(String topic) {
        totalCount.put(topic, totalCount.getOrDefault(topic, 0) + 1);
    }

    public void markSolved(String topic) {
        solvedCount.put(topic, solvedCount.getOrDefault(topic, 0) + 1);
    }

    public void showProgress() {
        System.out.println("\nProgress:");

        for (String topic : totalCount.keySet()) {
            int solved = solvedCount.getOrDefault(topic, 0);
            int total = totalCount.get(topic);

            int percent = (solved * 100) / total;

            System.out.println(topic + ": " + percent + "%");
        }
    }
}