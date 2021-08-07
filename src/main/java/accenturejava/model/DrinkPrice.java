package accenturejava.model;

public class DrinkPrice {
    private Double small;
    private Double medium;
    private Double large;
    private Double huge;
    private Double mega;
    private Double ultra;

    public DrinkPrice() {}

    public void setSmall(Double small) {
        this.small = small;
    }

    public Double getSmall() {
        return this.small;
    }

    public Double getMedium() {
        return medium;
    }

    public void setMedium(Double medium) {
        this.medium = medium;
    }

    public Double getLarge() {
        return large;
    }

    public void setLarge(Double large) {
        this.large = large;
    }

    public Double getHuge() {
        return huge;
    }

    public void setHuge(Double huge) {
        this.huge = huge;
    }

    public Double getMega() {

        return mega;
    }

    public void setMega(Double mega) {
        this.mega = mega;
    }

    public Double getUltra() {
        return ultra;
    }

    public void setUltra(Double ultra) {
        this.ultra = ultra;
    }
    
    public Double getBySizeName(String sizeName) {
        switch (sizeName.toLowerCase()) {
            case "small": return this.getSmall();
            case "medium": return this.getMedium();
            case "large": return this.getLarge();
            case "huge": return this.getHuge();
            case "mega": return this.getMega();
            case "ultra": return this.getUltra();
            default: return 0.00;
        }
    }
}





