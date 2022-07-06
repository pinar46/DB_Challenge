package com.pinarc.DB_Challenge.controller;


import com.pinarc.DB_Challenge.entities.Betriebsstelle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pinarc.DB_Challenge.repositories.BetriebsstellenRepository;

@RestController
public class BetriebsstelleController {

    private BetriebsstellenRepository repository;

    @Autowired
    public BetriebsstelleController(BetriebsstellenRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/betriebsstelle/{abk}")
    public Betriebsstelle queryBetriebsstelle(@PathVariable("abk") String abk) {
        return repository.getByAbk(abk);
    }


}
