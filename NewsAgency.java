import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers;
    private String agencyName;

    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("Subscriber added: " + subscriber.getSubscriberInfo());
            System.out.println("Total subscribers: " + subscribers.size());
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("Subscriber removed: " + subscriber.getSubscriberInfo());
            System.out.println("Total subscribers: " + subscribers.size());
        }
    }

    public void publishNews(String title, String content, String category) {
        News news = new News(title, content, category);
        System.out.printf("\n=== %s PUBLISHING BREAKING NEWS ===\n", agencyName.toUpperCase());
        System.out.printf("News: %s\n", news);
        System.out.println("Notifying subscribers...\n");
        
        notifySubscribers(news);
    }

    private void notifySubscribers(News news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public int getSubscriberCount() {
        return subscribers.size();
    }

    public void listSubscribers() {
        System.out.println("\n=== CURRENT SUBSCRIBERS ===");
        if (subscribers.isEmpty()) {
            System.out.println("No subscribers currently.");
        } else {
            for (Subscriber subscriber : subscribers) {
                System.out.println("- " + subscriber.getSubscriberInfo());
            }
        }
    }
}