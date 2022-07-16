package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@JsonIgnoreProperties(ignoreUnknown = true)

@RestController
@RequestMapping("/api/v1/value")
public class Value {


    private Long id;
    private String consumir;


    public Value(){

    }
    public Long getId(){
        return this.id;

    }
    public String getConsumir(){
        return this.consumir;
    }
    public void setId(Long id){
        this.id = id;
    }

    public void setConsumir(String consumir) {
        this.consumir = consumir;
    }
    @Override
    public String toString(){
        return "Value{" +
                "id=" + id +
                ", consumir='" + consumir + '\'' +
                '}';
    }

}
