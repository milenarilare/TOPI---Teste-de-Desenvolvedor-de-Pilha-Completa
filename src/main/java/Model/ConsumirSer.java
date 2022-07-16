package Model;

import ConsumirApi.Consumir;
import ConsumirApi.ConsumirApiApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




public class ConsumirSer {

    private static final Logger log =
            LoggerFactory.getLogger(ConsumirApiApplication.class);



@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
        }
@Bean
public CommandLineRunner run(RestTemplate restTemplate)throws
        Exception{
        return args -> {
        Consumir consumir = restTemplate.getForObject("https://www.themealdb.com/api/json/v1/1/search.php?s=",Consumir.class);
        log.info("Resultado da Chamada REST:" + consumir.toString());

        };

        }

        }