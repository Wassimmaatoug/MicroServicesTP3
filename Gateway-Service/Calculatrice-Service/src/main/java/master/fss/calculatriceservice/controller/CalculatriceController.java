package master.fss.calculatriceservice.controller;

import master.fss.calculatriceservice.metier.ICalculatrice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calcul")
public class CalculatriceController {
    private final ICalculatrice calculatrice;

    public CalculatriceController(ICalculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    @GetMapping("/somme")
    public double somme(@RequestParam double a, @RequestParam double b) {
        return calculatrice.somme(a, b);
    }

    @GetMapping("/soustraction")
    public double soustraction(@RequestParam double a, @RequestParam double b) {
        return calculatrice.soustraction(a, b);
    }

    @GetMapping("/multiplication")
    public double multiplication(@RequestParam double a, @RequestParam double b) {
        return calculatrice.multiplication(a, b);
    }

    @GetMapping("/division")
    public double division(@RequestParam double a, @RequestParam double b) {
        return calculatrice.division(a, b);
    }

    @GetMapping("/test")
    public String test() {
        return "Service de calculatrice actif !";
    }
}