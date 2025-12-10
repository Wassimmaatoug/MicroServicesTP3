package master.fss.calculstatistiqueservice.controller;

import master.fss.calculstatistiqueservice.client.CalculatriceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stats")
public class StatistiqueFeignController {

    private final CalculatriceClient calculatriceClient;

    @Autowired
    public StatistiqueFeignController(CalculatriceClient calculatriceClient) {
        this.calculatriceClient = calculatriceClient;
    }

    @GetMapping("/moyenne")
    public double moyenne(@RequestParam double a, @RequestParam double b) {
        Double somme = calculatriceClient.somme(a, b);

        if (somme == null) {
            throw new RuntimeException("Service Calculatrice non disponible !");
        }

        return somme / 2;
    }
}
