package net.rexbr.preludejurassika.entity.custom.base;

import java.util.Arrays;
import java.util.Comparator;

public enum  Variants {

    MALE(0),
    FEMALE(1),
    F_MALE(2),
    F_FEMALE(3);

    private static final Variants[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Variants::getId)).toArray(Variants[]::new);
    private final int id;

    Variants(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Variants byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
