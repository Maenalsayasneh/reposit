package m0.r.t.a.q;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: ThrowingCaller.kt */
public final class g implements c {
    public static final g a = new g();

    public /* bridge */ /* synthetic */ Member a() {
        return null;
    }

    public List<Type> b() {
        return EmptyList.c;
    }

    public Object call(Object[] objArr) {
        i.e(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public Type getReturnType() {
        Class cls = Void.TYPE;
        i.d(cls, "Void.TYPE");
        return cls;
    }
}
