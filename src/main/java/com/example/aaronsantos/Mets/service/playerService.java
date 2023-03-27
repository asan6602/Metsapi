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
        player p11= new player(10,3,"bud harrelson","switch","right", 1944,"SS", 2,20.3);
        player p12= new player(11,21,"cleon jones","right","left", 1963,"LF", 1,18.1);
        player p13= new player(12,5,"john olerud","left","left", 1968,"1B", 2,58.2);
        player p14= new player(13,9,"brandon nimmo","left","right", 1993,"CF", 0,17.2);
        player p15= new player(14,1,"jeff mcneil","left","right", 1992,"2B", 2,16.9);

        player p16= new player(15,4,"lenny dykstra","left","left", 1963,"CF", 3,42.4);
        player p17= new player(16,22,"kevin mcreynolds","right","right", 1959,"LF", 2,30.1);
        player p18= new player(17,30,"michael conforto","left","right", 1993,"RF", 1,15.7);
        player p19= new player(18,15,"jerry grote","right","right", 1942,"C", 2,15.1);
        player p20= new player(19,20,"pete alonso","right","right", 1994,"1B", 2,14.2);
        
        player p21= new player(20,20,"tommie agee","right","right", 1942,"CF", 2,25.4);
        player p22= new player(21,29,"dave magadan","left","right", 1962,"3B", 0,21.1);
        player p23= new player(22,11,"wayne garrett","left","right", 1947,"3B", 0,16.8);
        player p24= new player(23,15,"daniel murphy","left","right", 1995,"2B", 3,20.4);
        player p25= new player(24,16,"lee mazzilli","switch","right", 1955,"CF", 1,15.6);



        playerList.addAll(Arrays.asList(p1,p2, p3, p4, p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20));
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
