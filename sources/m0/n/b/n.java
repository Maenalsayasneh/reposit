package m0.n.b;

import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.TypeReference;
import m0.r.d;
import m0.r.e;
import m0.r.f;
import m0.r.g;
import m0.r.i;
import m0.r.j;
import m0.r.m;
import m0.r.p;

/* compiled from: ReflectionFactory */
public class n {
    public g a(FunctionReference functionReference) {
        return functionReference;
    }

    public d b(Class cls) {
        return new d(cls);
    }

    public f c(Class cls, String str) {
        return new l(cls, str);
    }

    public i d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public j e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public m f(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public String g(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(Lambda lambda) {
        return g(lambda);
    }

    public m0.r.n i(e eVar, List<p> list, boolean z) {
        return new TypeReference(eVar, list, z);
    }
}
