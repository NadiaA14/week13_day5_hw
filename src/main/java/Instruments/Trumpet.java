package Instruments;

public abstract class Trumpet extends Instrument{

    public Trumpet(String description, Integer salePrice, Integer boughtPrice, String material, String colour, InstrumentType instrumentType) {
        super(description, salePrice, boughtPrice, material, colour, instrumentType);
    }
}
