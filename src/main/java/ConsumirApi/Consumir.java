package ConsumirApi;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Consumir{
        private String id;
        private Value value;

        public Consumir(){

        }
        public String getId(){
            return id;

        }

    public void setid(){
            this.id = id;

    }
    public Value getValue(){
            return value;

    }
    public void setValue(Value value){
            this.value = value;

    }
    @Override
    public String toString(){
            return "Consumir{"+
                    "id='" + id + '\'' +
                    ", value=" + value +
                    '}';

    }
}
