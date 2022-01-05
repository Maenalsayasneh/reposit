package m0.r.t.a.r.c.v0.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.b.i;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class m extends c implements m0.r.t.a.r.e.a.w.m {
    public final Enum<?> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d dVar, Enum<?> enumR) {
        super(dVar);
        i.e(enumR, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.b = enumR;
    }

    public a b() {
        Class<?> cls = this.b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        i.d(cls, "enumClass");
        return ReflectClassUtilKt.b(cls);
    }

    public d d() {
        return d.g(this.b.name());
    }
}
