package icerbergModel;

import java.time.LocalDate;
import java.util.*;

public class IcebergModel {

    Map<Icerberg, List<IcebergData>> icerbergsTracker = new HashMap<>();

    public IcebergModel() {
        Icerberg icerberg1 = new Icerberg("Cabo Hatteras", 70.3, "Katrina");
        icerbergsTracker.put(icerberg1, Arrays.asList(new IcebergData(icerberg1, LocalDate.of(2000, 10, 12), 80.2),
                new IcebergData(icerberg1, LocalDate.of(2000, 11, 12), 79.2),
                new IcebergData(icerberg1, LocalDate.of(2000, 12, 12), 70.8)));
    }

    public static void main(String[] args) {
        IcebergModel icebergModel = new IcebergModel();
        icebergModel.output();
    }

    private void output() {
        for (List<IcebergData> list : icerbergsTracker.values()) {
            for (IcebergData icebergData : list) {
                System.out.println(icebergData);
            }
        }
    }
}
