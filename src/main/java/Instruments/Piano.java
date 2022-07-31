package Instruments;

public abstract class Piano extends Instrument{

    public Piano(String description, Integer salePrice, Integer boughtPrice, String material, String colour, InstrumentType instrumentType) {
        super(description, salePrice, boughtPrice, material, colour, instrumentType);
    }
}
