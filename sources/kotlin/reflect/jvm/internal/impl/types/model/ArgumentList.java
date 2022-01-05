package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import m0.r.t.a.r.m.z0.h;
import m0.r.t.a.r.m.z0.i;

/* compiled from: TypeSystemContext.kt */
public final class ArgumentList extends ArrayList<i> implements h {
    public ArgumentList(int i) {
        super(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.contains((i) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.remove((i) obj);
    }
}
