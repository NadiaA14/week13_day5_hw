package Shop;

public class ItemsSale {
    private String description;
    private Integer salePrice;
    private Integer boughtPrice;

    public ItemsSale(String description, Integer salePrice, Integer boughtPrice) {
        this.description = description;
        this.salePrice = salePrice;
        this.boughtPrice = boughtPrice;
    }

    public String getDescription() {
        return description;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public Integer getBoughtPrice() {
        return boughtPrice;
    }
}
