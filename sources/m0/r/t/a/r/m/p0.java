package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;

/* compiled from: TypeSubstitution.kt */
public abstract class p0 {
    public static final p0 a = new a();

    /* compiled from: TypeSubstitution.kt */
    public static final class a extends p0 {
        public m0 e(v vVar) {
            i.e(vVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final TypeSubstitutor c() {
        TypeSubstitutor e = TypeSubstitutor.e(this);
        i.d(e, "create(this)");
        return e;
    }

    public f d(f fVar) {
        i.e(fVar, "annotations");
        return fVar;
    }

    public abstract m0 e(v vVar);

    public boolean f() {
        return this instanceof a;
    }

    public v g(v vVar, Variance variance) {
        i.e(vVar, "topLevelType");
        i.e(variance, "position");
        return vVar;
    }
}
