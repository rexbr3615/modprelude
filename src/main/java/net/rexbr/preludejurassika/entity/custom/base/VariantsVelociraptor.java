package net.rexbr.preludejurassika.entity.custom.base;

import java.util.Arrays;
import java.util.Comparator;

public enum VariantsVelociraptor {

    MALE(0),
    FEMALE(1);

    private static final VariantsVelociraptor[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(VariantsVelociraptor::getId)).toArray(VariantsVelociraptor[]::new);
    private final int id;

    VariantsVelociraptor(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static VariantsVelociraptor byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
