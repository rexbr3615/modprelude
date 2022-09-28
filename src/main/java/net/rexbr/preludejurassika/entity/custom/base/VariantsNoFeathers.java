package net.rexbr.preludejurassika.entity.custom.base;

import java.util.Arrays;
import java.util.Comparator;

public enum VariantsNoFeathers {

    MALE(0),
    FEMALE(1);

    private static final VariantsNoFeathers[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(VariantsNoFeathers::getId)).toArray(VariantsNoFeathers[]::new);
    private final int id;

    VariantsNoFeathers(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static VariantsNoFeathers byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
