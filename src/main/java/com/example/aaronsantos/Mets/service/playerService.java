package com.example.aaronsantos.Mets.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.aaronsantos.Mets.api.model.player;

@Service
public class playerService {

    private List<player> playerList;

    public playerService() {
        this.playerList = new ArrayList<>();

        player p1 = new player(0,5,"david wright","right","right", 1982,2004,2018, "3B", 183, 92, 7);
        player p2 = new player(1,18,"daryl strawberry","left","left", 1962,1983,1999, "RF", 198, 86, 8);
        player p3= new player(2,15,"carlos beltran","switch","right", 1977,1998,2017, "CF", 185, 97, 9);


        playerList.addAll(Arrays.asList(p1,p2, p3));
    }
    
    public List<player> getPlayerList() {
        return playerList;
    }

    public Optional<player> getPlayer(Integer id) {
        Optional<player> optional = Optional.empty();
        for (player player: playerList) {
            if(id == player.getId()) {
                optional = Optional.of(player);
                return optional;
            }
        }
        return optional;
    }
}
