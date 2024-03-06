package com.learning.core.day4;
public class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
    }

    public void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7) {
            return "Gold";
        } else if (avgRating >= 5) {
            return "Silver";
        } else if (avgRating >= 2) {
            return "Copper";
        } else {
            throw new NotEligibleException("Player is not eligible for any coin.");
        }
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + coins);
    }
}

public class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class D04P02 {
    public static void main(String[] args) {
        CricketRating player1 = new CricketRating("Player1", 8, 7, 9);
        player1.calculateAverageRating(player1.critic1, player1.critic2, player1.critic3);
        try {
            player1.coins = player1.calculateCoins();
            player1.display();
        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        CricketRating player2 = new CricketRating("Player2", 5, 6);
        player2.calculateAverageRating(player2.critic1, player2.critic2);
        try {
            player2.coins = player2.calculateCoins();
            player2.display();
        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        CricketRating player3 = new CricketRating("Player3", 1, 3, 4);
        player3.calculateAverageRating(player3.critic1, player3.critic2, player3.critic3);
        try {
            player3.coins = player3.calculateCoins();
            player3.display();
        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
