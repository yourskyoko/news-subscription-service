public class SMSSubscriber implements Subscriber {
    private String phoneNumber;
    private String name;

    public SMSSubscriber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(News news) {
        System.out.printf("[SMS] To: %s (%s)\n", phoneNumber, name);
        System.out.printf("Breaking News: %s\n", news.getTitle());
        System.out.printf("Brief: %s\n", 
            news.getContent().length() > 50 ? 
            news.getContent().substring(0, 50) + "..." : news.getContent());
        System.out.println("---");
    }

    @Override
    public String getSubscriberInfo() {
        return String.format("SMS Subscriber: %s (%s)", name, phoneNumber);
    }

    public String getPhoneNumber() { return phoneNumber; }
    public String getName() { return name; }
}