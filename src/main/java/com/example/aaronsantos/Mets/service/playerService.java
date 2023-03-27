package com.example.aaronsantos.Mets.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.aaronsantos.Mets.api.model.player;

@Service
public class playerService {

    private List<player> playerList;

    public playerService() {
        this.playerList = new ArrayList<>();

        player p1 = new player(0,5,"david wright","right","right", 1982,2004,2018, "3B", 183, 92, 7,49.2);
        player p2 = new player(1,18,"daryl strawberry","left","left", 1962,1983,1999, "RF", 198, 86, 8,42.2);
        player p3= new player(2,15,"carlos beltran","switch","right", 1977,1998,2017, "CF", 185, 97, 9, 70.1);
        player p4= new player(3,13,"edgar alfonzo","right","right", 1973,1995,2006, "2B", 180, 95, 1,28.7);


        playerList.addAll(Arrays.asList(p1,p2, p3, p4));
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

    public player getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(playerList.size());
        return this.playerList.get(index);
    }
}
