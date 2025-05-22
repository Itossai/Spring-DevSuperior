package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name="game_id")
    private Games games;
    @ManyToOne
    @JoinColumn(name="game_list_id")
    private GameList gameList;

    public BelongingPK (){

    }

    public BelongingPK(Games games, GameList gameList) {
        this.games = games;
        this.gameList = gameList;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((games == null) ? 0 : games.hashCode());
        result = prime * result + ((gameList == null) ? 0 : gameList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        if (games == null) {
            if (other.games != null)
                return false;
        } else if (!games.equals(other.games))
            return false;
        if (gameList == null) {
            if (other.gameList != null)
                return false;
        } else if (!gameList.equals(other.gameList))
            return false;
        return true;
    }
    
    

}
