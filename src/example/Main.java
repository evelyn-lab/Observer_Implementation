package example;

public class Main {
    public static void main(String[] args) {
        Game gameConsole = new Game();
        Player player1 = new Player();
        Player player2 = new Player();
        Journalist journalist = new Journalist();
        Developer developer = new Developer();
        gameConsole.registerSubscriber(player1);
        gameConsole.registerSubscriber(player2);
        gameConsole.registerSubscriber(journalist);
        gameConsole.registerSubscriber(developer);

        String gameName = "New Game";
        String[] playerAchievements = {"Achievement 1", "Achievement 2", "Achievement 3"};
        String briefInfo = "This is a new game";
        String technicalData = "Engine version: 1.0, Platform: PC, Xbox, PlayStation";

        gameConsole.setGameInfo(gameName, playerAchievements, briefInfo, technicalData);
    }
}