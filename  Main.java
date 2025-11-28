class Main {
    public static void main(String[] args) {
        // Create news agency
        NewsAgency newsAgency = new NewsAgency("Global News Network");

        // Create subscribers
        Subscriber emailUser1 = new EmailSubscriber("Alice Johnson", "alice@email.com");
        Subscriber emailUser2 = new EmailSubscriber("Bob Smith", "bob.smith@company.com");
        Subscriber smsUser1 = new SMSSubscriber("Charlie Brown", "+1234567890");
        Subscriber smsUser2 = new SMSSubscriber("Diana Prince", "+1987654321");

        // Subscribe users
        System.out.println("=== SUBSCRIPTION PHASE ===");
        newsAgency.subscribe(emailUser1);
        newsAgency.subscribe(emailUser2);
        newsAgency.subscribe(smsUser1);
        newsAgency.subscribe(smsUser2);

        // Publish breaking news
        System.out.println("\n=== NEWS PUBLICATION PHASE ===");
        newsAgency.publishNews(
            "Major Earthquake Hits Coast", 
            "A magnitude 7.5 earthquake has struck the coastal region.", 
            "Emergency"
        );

        // Show current subscribers
        newsAgency.listSubscribers();
    }
}