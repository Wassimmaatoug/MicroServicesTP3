package master.fss.calculatriceservice.metier;

public interface ICalculatrice {
    double somme(double a, double b);
    double soustraction(double a, double b);
    double multiplication(double a, double b);
    double division(double a, double b);
}