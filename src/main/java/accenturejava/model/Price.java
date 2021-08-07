package accenturejava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {
    @JsonProperty("drink_name")
    private String drink_name;
    @JsonProperty("prices")
    private DrinkPrice prices;

    public Price() {
    }

    public String getDrinkName() {
        return this.drink_name;
    }

    public void setDrinkName(String drink_name) {
        this.drink_name = drink_name;
    }

    public DrinkPrice getPrice() {
        return this.prices;
    }

    public void setPrice(DrinkPrice prices) {
        this.prices = prices;
    }
}

