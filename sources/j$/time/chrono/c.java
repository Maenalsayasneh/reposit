package j$.time.chrono;

import j$.com.android.tools.r8.a;
import j$.time.chrono.b;
import j$.time.temporal.Temporal;
import j$.time.temporal.m;
import java.io.Serializable;

abstract class c<D extends b> implements b, Temporal, m, Serializable {
    static b o(h hVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (hVar.equals(bVar.h())) {
            return bVar;
        }
        StringBuilder b = a.b("Chronology mismatch, expected: ");
        b.append(hVar.t());
        b.append(", actual: ");
        b.append(bVar.h().t());
        throw new ClassCastException(b.toString());
    }
}
