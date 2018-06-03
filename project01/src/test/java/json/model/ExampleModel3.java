package json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jhcorea on 2018. 6. 2..
 */
public class ExampleModel3 {


    @JsonProperty("appleA")
    String apple = "apple3";

    @JsonProperty("bananaA")
    String banana = "banana3";

    public String getApple() {
        return "nope apple";
    }

    public void setApple(String apple) {
        this.apple = "strange apple";
    }

    public String getBanana() {
        return "nope banana";
    }

    public void setBanana(String banana) {
        this.banana = "strange banana";
    }

}
