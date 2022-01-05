package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

public final class ConstructorDetector implements Serializable {
    public static final ConstructorDetector c = new ConstructorDetector(SingleArgConstructor.HEURISTIC);
    public final SingleArgConstructor d;

    public enum SingleArgConstructor {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    static {
        SingleArgConstructor singleArgConstructor = SingleArgConstructor.PROPERTIES;
        SingleArgConstructor singleArgConstructor2 = SingleArgConstructor.DELEGATING;
        SingleArgConstructor singleArgConstructor3 = SingleArgConstructor.REQUIRE_MODE;
    }

    public ConstructorDetector(SingleArgConstructor singleArgConstructor) {
        this.d = singleArgConstructor;
    }
}
