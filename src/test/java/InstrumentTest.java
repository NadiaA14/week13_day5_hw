import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.InstrumentType;
import org.junit.Before;

public class InstrumentTest {
    Instrument instrument;
    Guitar guitar;
    InstrumentType instrumentType;

    @Before
    guitar = new Guitar("Fun", 10, 5, "wood", "black", instrumentType.WOODWIND);
}
