import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Initialize the deck of cards
        ArrayList<String> deck = new ArrayList<String>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck of cards
        Collections.shuffle(deck, new Random());

        // Distribute 9 cards to 4 players
        String[][] players = new String[4][9];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck.get(i * 9 + j);
            }
        }

        // Print the cards received by the players
        for (int i = 0; i < 4; i++) {
            System.out.println("Cards received by player " + (i+1) + ":");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
