package m0.r.t.a.q;

import i0.j.f.p.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$2;
import m0.c;
import m0.n.b.i;
import m0.r.k;

/* compiled from: AnnotationConstructorCaller.kt */
public final class a implements InvocationHandler {
    public final /* synthetic */ Class a;
    public final /* synthetic */ c b;
    public final /* synthetic */ c c;
    public final /* synthetic */ AnnotationConstructorCallerKt$createAnnotationInstance$2 d;
    public final /* synthetic */ Map e;

    public a(Class cls, c cVar, k kVar, c cVar2, k kVar2, AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2, Map map) {
        this.a = cls;
        this.b = cVar;
        this.c = cVar2;
        this.d = annotationConstructorCallerKt$createAnnotationInstance$2;
        this.e = map;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        i.d(method, "method");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return this.a;
                    }
                } else if (name.equals("hashCode")) {
                    return this.c.getValue();
                }
            } else if (name.equals("toString")) {
                return this.b.getValue();
            }
        }
        if (i.a(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(this.d.a(h.S3(objArr)));
        }
        if (this.e.containsKey(name)) {
            return this.e.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(h.l4(objArr));
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }
}
