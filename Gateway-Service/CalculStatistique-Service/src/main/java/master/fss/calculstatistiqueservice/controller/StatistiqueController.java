package master.fss.calculstatistiqueservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/stats")
public class StatistiqueController {
    private final RestTemplate restTemplate;
    private final String calculatriceServiceUrl;

    public StatistiqueController(RestTemplate restTemplate,
                                 @Value("${calculatrice.service.url}") String calculatriceServiceUrl) {
        this.restTemplate = restTemplate;
        this.calculatriceServiceUrl = calculatriceServiceUrl;
    }

    @GetMapping("/moyenne")
    public double moyenne(@RequestParam double a, @RequestParam double b) {
        String url = calculatriceServiceUrl + "/api/calcul/somme?a=" + a + "&b=" + b;
        Double somme = restTemplate.getForObject(url, Double.class);
        return somme / 2;
    }
}