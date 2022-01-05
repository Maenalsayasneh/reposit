package m0.r.t.a.r.c.v0.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaAnnotation.kt */
public final class b extends l implements a {
    public final Annotation a;

    public b(Annotation annotation) {
        i.e(annotation, "annotation");
        this.a = annotation;
    }

    public Collection<m0.r.t.a.r.e.a.w.b> a() {
        Object obj;
        Method[] declaredMethods = h.l1(h.N0(this.a)).getDeclaredMethods();
        i.d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(this.a, new Object[0]);
            i.d(invoke, "method.invoke(annotation)");
            d g = d.g(method.getName());
            i.e(invoke, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            Class<?> cls = invoke.getClass();
            List<m0.r.d<? extends Object>> list = ReflectClassUtilKt.a;
            i.e(cls, "<this>");
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new m(g, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                obj = new d(g, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                obj = new f(g, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                obj = new i(g, (Class) invoke);
            } else {
                obj = new o(g, invoke);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public m0.r.t.a.r.g.a e() {
        return ReflectClassUtilKt.b(h.l1(h.N0(this.a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && i.a(this.a, ((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        i.e(this, "this");
        return false;
    }

    public boolean t() {
        i.e(this, "this");
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        i0.d.a.a.a.p(b.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public g x() {
        return new h(h.l1(h.N0(this.a)));
    }
}
