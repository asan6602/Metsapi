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

        player p1 = new player(0,5,"david wright","right","right", 1982,"3B", 7,49.2);
        player p2 = new player(1,18,"daryl strawberry","left","left", 1962,"RF", 8,42.2);
        player p3= new player(2,15,"carlos beltran","switch","right", 1977,"CF", 9, 70.1);
        player p4= new player(3,13,"edgar alfonzo","right","right", 1973,"2B", 1,28.7);
        player p5= new player(4,7,"jose reyes","switch","right", 1983,"SS", 4,37.2);
        player p6= new player(5,17,"keith hernandez","left","left", 1953,"1B", 5,60.3);
        player p7= new player(6,31,"mike piazza","right","right", 1968,"C", 12,59.5);
        player p8= new player(7,20,"howard johnson","switch","right", 1960,"3B", 2,22.2);
        player p9= new player(8,1,"mookie wilson","switch","right", 1956,"CF", 0,22.4);
        player p10= new player(9,16,"john stearns","right","right", 1951,"C", 4,19.7);



        playerList.addAll(Arrays.asList(p1,p2, p3, p4, p5,p6,p7,p8,p9,p10));
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
