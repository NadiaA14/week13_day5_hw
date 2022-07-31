package Instruments;

public abstract class Flute extends Instrument {

    public Flute(String description, Integer salePrice, Integer boughtPrice, String material, String colour, InstrumentType instrumentType) {
        super(description, salePrice, boughtPrice, material, colour, instrumentType);
    }
}
