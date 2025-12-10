package master.fss.calculstatistiqueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalculStatistiqueServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculStatistiqueServiceApplication.class, args);
    }
}