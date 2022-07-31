package Instruments;

public abstract class Guitar extends Instrument{
    private Integer numOfStrings;

    public Guitar(String description, Integer salePrice, Integer boughtPrice, String material, String colour, InstrumentType instrumentType, Integer numOfStrings) {
        super(description, salePrice, boughtPrice, material, colour, instrumentType);
        this.numOfStrings = numOfStrings;
    }
}
