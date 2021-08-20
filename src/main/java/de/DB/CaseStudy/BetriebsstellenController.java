package de.DB.CaseStudy;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BetriebsstellenController {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/betriebsstelle/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Betriebsstelle getBetriebsstelle (@PathVariable(name = "id") String code){
        Betriebsstelle angefragteBetriebsstelle = null;
        System.out.println(code);
        for (Betriebsstelle b : CaseStudyApplication.betriebsstellen) {
            if (b.getCode().equals(code.toUpperCase())){
                angefragteBetriebsstelle = b;
            }
        }
        return angefragteBetriebsstelle;
    }

}
