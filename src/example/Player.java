package example;

public class Player implements Subscriber {
    @Override
    public void update(String gameName, String[] playerAchievements, String briefInfo, String technicalData) {
        System.out.println("New game released: " + gameName);
        System.out.println("Player achievements:");
        for (String achievement : playerAchievements) {
            System.out.println("- " + achievement);
        }
    }
}
