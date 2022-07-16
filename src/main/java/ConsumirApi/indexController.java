package ConsumirApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")

public class indexController {



    @GetMapping()
    public String get(){
        return " URLBase";

    }

}
