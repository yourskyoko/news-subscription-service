public class EmailSubscriber implements Subscriber {
    private String emailAddress;
    private String name;

    public EmailSubscriber(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(News news) {
        System.out.printf("[EMAIL] To: %s (%s)\n", emailAddress, name);
        System.out.printf("Subject: Breaking News: %s\n", news.getTitle());
        System.out.printf("Content: %s\n", news.getContent());
        System.out.printf("Category: %s | Published: %s\n", 
            news.getCategory(), news.getTimestamp());
        System.out.println("---");
    }

    @Override
    public String getSubscriberInfo() {
        return String.format("Email Subscriber: %s (%s)", name, emailAddress);
    }

    public String getEmailAddress() { return emailAddress; }
    public String getName() { return name; }
}