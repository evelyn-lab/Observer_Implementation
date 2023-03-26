package example;

public class Developer implements Subscriber{
    @Override
    public void update(String gameName, String[] playerAchievements, String briefInfo, String technicalData) {
        System.out.println("New game released: " + gameName);
        System.out.println("Technical data:");
        System.out.println("- " + technicalData);
    }
}
