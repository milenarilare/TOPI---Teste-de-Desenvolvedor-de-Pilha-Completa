/**package ConsumirApi.Dominio;

import ConsumirApi.ConsumirApi;
import Model.Consumir;
import Model.ConsumirService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/consumir")

public class ConsumirController {
private ConsumirService service = new ConsumirService();


    @GetMapping()
    public List<Consumir> get(){
        ConsumirApi consumir = ConsumirApi.getInstance();
        System.out.println(consumir.doRequest("id"));
        return service.getConsumir();

    }

}*/
