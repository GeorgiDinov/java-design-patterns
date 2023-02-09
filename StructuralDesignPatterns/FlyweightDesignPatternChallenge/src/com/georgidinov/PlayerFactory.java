package com.georgidinov;

import java.util.HashMap;
import java.util.Map;

class PlayerFactory {

    private Map<String, Player> players = new HashMap<>();

    public int getNumberOfPlayersCreated() {
        return this.players.size();
    }//end of method getNumberOfPlayersCreated

    public Player getPlayer(String playerType) throws Exception {
        Player player;
        if (this.players.containsKey(playerType)) {
            player = this.players.get(playerType);
        } else {

            switch (playerType) {
                case "Terrorist":
                    System.out.println("\tTerrorist created");
                    player = new Terrorist();
                    this.players.put("Terrorist", player);
                    break;
                case "CounterTerrorist":
                    System.out.println("\tCounterTerrorist created");
                    player = new CounterTerrorist();
                    this.players.put("CounterTerrorist", player);
                    break;
                default:
                    throw new Exception("Player Factory produce " +
                            "Terrorist or Counter Terrorists only!");

            }//end of switch statement

        }//end of else clause

        return player;

    }//end of method getPlayer

}//end of class PlayerFactory
