package com.pinarc.DB_Challenge.repositories;

import com.pinarc.DB_Challenge.entities.Betriebsstelle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class BetriebsstellenRepository {
    private List<Betriebsstelle> betriebsstellen;

    @Autowired
    public BetriebsstellenRepository(final CsvBetriebsstellenService betriebsstellenService) {
        betriebsstellen = betriebsstellenService.readFile(getClass().getResourceAsStream("/Betriebsstelle2016.csv"));
    }

    public Betriebsstelle getByAbk(final String abk) {
        for (Betriebsstelle betriebsstelle : betriebsstellen) {
            if (Objects.equals(betriebsstelle.getAbk(), abk)) {
                return betriebsstelle;
            }
        }
        return null;
    }

}
