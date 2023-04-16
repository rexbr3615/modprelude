package net.rexbr.preludejurassika.Utils.preludeUtils;


import java.util.Arrays;
import java.util.Comparator;

public enum AlosaurusVariants {
    MAXIMUS(0),
    EUROPEUS(1),
    FRAGILIS(2);

    private static final AlosaurusVariants[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(AlosaurusVariants::getId)).toArray(AlosaurusVariants[]::new);
    private final int id;

    AlosaurusVariants(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static AlosaurusVariants byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}

