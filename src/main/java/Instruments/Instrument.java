package Instruments;

import Shop.ItemsSale;

public abstract class Instrument extends ItemsSale implements IPlay {
    private String material;
    private String colour;
    InstrumentType instrumentType;

    public Instrument(String description, Integer salePrice, Integer boughtPrice, String material, String colour, InstrumentType instrumentType) {
        super(description, salePrice, boughtPrice);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }
}
