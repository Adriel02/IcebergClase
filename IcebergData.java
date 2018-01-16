package icerbergModel;

import java.time.LocalDate;

public class IcebergData {

    public final Icerberg icerberg;
    public final LocalDate localDate;
    public final double volumen;

    public IcebergData(Icerberg icerberg, LocalDate localDate, double volumen) {
        this.icerberg = icerberg;
        this.localDate = localDate;
        this.volumen = volumen;
    }

    public Icerberg getIcerberg() {
        return icerberg;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return icerberg +
                " with date " + localDate +
                ", has a volume of " + volumen;
    }
}
