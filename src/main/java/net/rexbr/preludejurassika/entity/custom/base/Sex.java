package net.rexbr.preludejurassika.entity.custom.base;

import java.util.Arrays;
import java.util.Comparator;

public enum Sex {
    MALE(0),
    FEMALE(1),
    BIS(2);

    private static final Sex[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Sex::getId)).toArray(Sex[]::new);
    private final int id;

    Sex(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Sex byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
