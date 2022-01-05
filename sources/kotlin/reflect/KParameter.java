package kotlin.reflect;

import m0.r.b;
import m0.r.n;

/* compiled from: KParameter.kt */
public interface KParameter extends b {

    /* compiled from: KParameter.kt */
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    Kind f();

    boolean g();

    String getName();

    n getType();

    boolean k();
}
