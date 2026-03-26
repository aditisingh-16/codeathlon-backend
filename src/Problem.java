public class Problem {
    private int id;
    private String title;
    private String topic;
    private String difficulty;
    private String company;

    // Constructor
    public Problem(int id, String title, String topic, String difficulty, String company) {
        this.id = id;
        this.title = title;
        this.topic = topic;
        this.difficulty = difficulty;
        this.company = company;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getTopic() { return topic; }
    public String getDifficulty() { return difficulty; }
    public String getCompany() { return company; }
}