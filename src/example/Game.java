package example;
import java.util.List;
import java.util.ArrayList;

public class Game implements Publisher {
    private List<Subscriber> subscribers;
    private String gameName;
    private String[] playerAchievements;
    private String briefInfo;
    private String technicalData;

    public Game() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber observer : subscribers) {
            observer.update(gameName, playerAchievements, briefInfo, technicalData);
        }
    }

    public void setGameInfo(String gameName, String[] playerAchievements, String briefInfo, String technicalData) {
        this.gameName = gameName;
        this.playerAchievements = playerAchievements;
        this.briefInfo = briefInfo;
        this.technicalData = technicalData;
        notifySubscribers();
    }
}
