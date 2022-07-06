package com.pinarc.DB_Challenge.repositories;

import com.pinarc.DB_Challenge.entities.Betriebsstelle;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvParser;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvParserSettings;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class CsvBetriebsstellenService {

    public List<Betriebsstelle> readFile(final String filename) {
        try (FileInputStream stream = new FileInputStream(filename)) {
            return readFile(stream);
        } catch (IOException ex) {
            System.out.println("Fehler!");
            return null;
        }
    }

    public List<Betriebsstelle> readFile(final InputStream inputStream) {
        List<Betriebsstelle> betriebsstelleList = new ArrayList<>();
        CsvParserSettings setting = new CsvParserSettings();
        setting.setHeaderExtractionEnabled(true);
        setting.setDelimiterDetectionEnabled(true);
        CsvParser parser = new CsvParser(setting);
        List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
        parseAllRecords.forEach(record -> {
            Betriebsstelle betriebsstelle = new Betriebsstelle();
            betriebsstelle.setAbk(record.getString("Abk"));
            betriebsstelle.setName(record.getString("Name"));
            betriebsstelle.setKurzname(record.getString("Kurzname"));
            betriebsstelle.setTyp(record.getString("Typ"));
            betriebsstelle.setBetrZust(record.getString("BetrZust"));
            betriebsstelle.setPrimaryLocationCode(record.getString("PrimaryLocationCode"));
            betriebsstelle.setUic(record.getString("UIC"));
            betriebsstelle.setRb(record.getString("RB"));
            betriebsstelle.setGueltigVon(record.getString("GültigVon"));
            betriebsstelle.setGueltigBis(record.getString("GültigBis"));
            betriebsstelle.setNetzKey(record.getString("NetzKey"));
            betriebsstelle.setFplRel(record.getString("FplRel"));
            betriebsstelle.setFplGr(record.getString("FplGr"));
            betriebsstelleList.add(betriebsstelle);
        });
        return betriebsstelleList;
    }

}
