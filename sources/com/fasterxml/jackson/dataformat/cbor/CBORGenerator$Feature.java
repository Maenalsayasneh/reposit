package com.fasterxml.jackson.dataformat.cbor;

import i0.f.a.b.m.e;

public enum CBORGenerator$Feature implements e {
    WRITE_MINIMAL_INTS(true),
    WRITE_TYPE_HEADER(false),
    LENIENT_UTF_ENCODING(false);
    
    public final boolean _defaultState;
    public final int _mask;

    private CBORGenerator$Feature(boolean z) {
        this._defaultState = z;
        this._mask = 1 << ordinal();
    }

    public static int collectDefaults() {
        CBORGenerator$Feature[] values = values();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            CBORGenerator$Feature cBORGenerator$Feature = values[i2];
            if (cBORGenerator$Feature.enabledByDefault()) {
                i |= cBORGenerator$Feature.getMask();
            }
        }
        return i;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        return (i & getMask()) != 0;
    }

    public int getMask() {
        return this._mask;
    }
}
