package m0.r.t.a.q;

import i0.j.f.p.h;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.i;

/* compiled from: InternalUnderlyingValOfInlineClass.kt */
public abstract class f implements c<Method> {
    public final Type a;
    public final Method b;
    public final List<Type> c;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class a extends f implements b {
        public final Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, EmptyList.c, (m0.n.b.f) null);
            i.e(method, "unboxMethod");
            this.d = obj;
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            i.e(objArr, "args");
            h.B(this, objArr);
            Object obj = this.d;
            i.e(objArr, "args");
            return this.b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class b extends f {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, h.L2(method.getDeclaringClass()), (m0.n.b.f) null);
            i.e(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            i.e(objArr, "args");
            i.e(objArr, "args");
            h.B(this, objArr);
            Object obj = objArr[0];
            Object[] k = objArr.length <= 1 ? new Object[0] : g.k(objArr, 1, objArr.length);
            i.e(k, "args");
            return this.b.invoke(obj, Arrays.copyOf(k, k.length));
        }
    }

    public f(Method method, List list, m0.n.b.f fVar) {
        this.b = method;
        this.c = list;
        Class<?> returnType = method.getReturnType();
        i.d(returnType, "unboxMethod.returnType");
        this.a = returnType;
    }

    public /* bridge */ /* synthetic */ Member a() {
        return null;
    }

    public final List<Type> b() {
        return this.c;
    }

    public final Type getReturnType() {
        return this.a;
    }
}
