package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import m0.n.a.a;
import m0.r.t.a.r.b.b;
import m0.r.t.a.r.c.d;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$objectInstance$2 extends Lambda implements a<T> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$objectInstance$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    public final T invoke() {
        Field field;
        d a = this.c.a();
        if (a.f() != ClassKind.OBJECT) {
            return null;
        }
        if (!a.w() || h.o2(b.a, a)) {
            field = KClassImpl.this.y.getDeclaredField("INSTANCE");
        } else {
            field = KClassImpl.this.y.getEnclosingClass().getDeclaredField(a.getName().b());
        }
        T t = field.get((Object) null);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T");
        return t;
    }
}
