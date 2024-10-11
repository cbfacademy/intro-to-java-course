package com.cbfacademy;

public class DiceGame implements Player{
    private DicePlayer player1;
    private DicePlayer player2;
    private int targetScore = 30;

    public DiceGame() {
        player1 = PlayerFactory.create();
        player2 = PlayerFactory.create();
        player1.setName("Player 1");
        player2.setName("Player 2");
    }

  public DiceGame(Player player1, Player player2) {
        
    }

@Override
    public void setName(String name) {
        // You can leave this blank if DiceGame doesn't need a name itself
    }

    @Override
    public String getName() {
        return "DiceGame"; // Return a default name, or customize as needed
    }

    public String play() {
        int score1 = 0;
        int score2 = 0;
        String winner = null;

        System.out.println("Game started. Target score: " + targetScore);
        System.out.println();

        while (score1 < targetScore && score2 < targetScore) {
            score1 += player1.roll();
            score2 += player2.roll();
            System.out.println();
        }

        if(score1 > score2) {
            winner = player1.getName();
        } else if (score2 > score1) {
            player2.getName();
        }
        
        return winner;
    }

    @Override
    public int roll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'roll'");
    }
}