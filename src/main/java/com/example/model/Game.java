package com.example.model;

public class Game {
    final Mountain mountain = new Mountain();
    final Player player = new Player();
    final Computer computer = new Computer();

    public Player getPlayer() {
        return player;
    }
    
    public Mountain getMountain() {
        return mountain;
    }

    public Computer getComputer() {
        return computer;
    }
    
    public Game() {
        mountain.shuffle();
    }
    
    public Card distributeCardToPlayer(Player playerToReceive) {
        if (playerToReceive.isStop()) {
            return null;
        }
        return playerToReceive.receiveCard(mountain.flip());
    }

    public String result() {
        if (playerBurst() && computerBurst() || player.getPoints() == computer.getPoints()) {
            return "Draw";
        }

        if (computerBurst() && (!playerBurst() || player.getPoints() > computer.getPoints())) {
            return "You win";
        }

        return "You lost";
    }

    public boolean finish() {
        return playerBurst() || computerBurst() || bothStop();
    }

    private boolean playerBurst() {
        return player.getPoints() > 21;
    }

    private boolean computerBurst() {
        return computer.getPoints() > 21;
    }

    private boolean bothStop() {
        return player.isStop() && computer.isStop();
    }
}
