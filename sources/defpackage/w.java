package defpackage;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.z;

/* renamed from: w  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class w extends Lambda implements a<z> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(int i, Object obj) {
        super(0);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke() {
        int i = this.c;
        if (i == 0) {
            return (f0) this.d;
        }
        if (i == 1) {
            return (f0) this.d;
        }
        throw null;
    }
}
