import java.time.LocalDate;

public class UserStats {

    private int streak;
    private LocalDate lastSolvedDate;

    public UserStats() {
        this.streak = 0;
        this.lastSolvedDate = null;
    }

    public void updateStreak() {
        LocalDate today = LocalDate.now();

        if (lastSolvedDate == null) {
            streak = 1;
        } else if (lastSolvedDate.plusDays(1).equals(today)) {
            streak++;
        } else if (lastSolvedDate.equals(today)) {
            // same day, no change
        } else {
            streak = 1;
        }

        lastSolvedDate = today;
    }

    public int getStreak() {
        return streak;
    }
    public void setLastSolvedDate(LocalDate date) {
        this.lastSolvedDate = date;
    }
    public void setStreak(int streak) {
            this.streak = streak;
    }
}