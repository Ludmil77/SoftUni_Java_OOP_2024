package footballTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;


    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public double getRating()
    {
       double rating = 0;
        return rating;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Player player)
    {

        players.add(player);
    }

    public void removePlayer(String playerName)
    {
        players.removeIf(x -> x.getName().equals(playerName));

    }
}
