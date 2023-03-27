package com.example.aaronsantos.Mets.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aaronsantos.Mets.api.model.player;
import com.example.aaronsantos.Mets.service.playerService;

@CrossOrigin
@RestController
public class playerController {


    private playerService playerService;

    public playerController(playerService ps) {
        this.playerService = ps;
    }
    
    ///player?id={id}
    @GetMapping("/player")
    public player getPlayer(@RequestParam Integer id) {
        Optional<player> player = playerService.getPlayer(id);
        if(player.isPresent()) {
            return (player)player.get();
        }
        return null;
    }

    @GetMapping("/players")
    public List<player> getPlayers() {
        return playerService.getPlayerList();
    }

    @GetMapping("/random")
    public player getRandom() {
        return playerService.getRandom();
    }
}
