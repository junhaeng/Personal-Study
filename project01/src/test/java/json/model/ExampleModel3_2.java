package json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jhcorea on 2018. 6. 2..
 */
public class ExampleModel3_2 {


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

    public String getAppleA() {
        return "nope apple2";
    }

    public void setAppleA(String apple) {
        this.apple = "strange apple2";
    }

    public String getBananaA() {
        return "nope banana2";
    }

    public void setBananaA(String banana) {
        this.banana = "strange banana2";
    }

}
