package example;

public class Journalist implements Subscriber {
    @Override
    public void update(String gameName, String[] playerAchievements, String briefInfo, String technicalData) {
        System.out.println("New game released: " + gameName);
        System.out.println("Brief info: " + briefInfo);
    }
}
