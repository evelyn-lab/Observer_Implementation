package example;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
