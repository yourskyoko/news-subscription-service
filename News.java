import java.time.LocalDateTime;

public class News {
    private String title;
    private String content;
    private String category;
    private LocalDateTime timestamp;

    public News(String title, String content, String category) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getCategory() { return category; }
    public LocalDateTime getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return String.format("[%s] %s: %s (Published: %s)", 
            category, title, content, timestamp);
    }
}