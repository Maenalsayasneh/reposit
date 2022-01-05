package m0.r.t.a.r.c.v0.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.e;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class f extends c implements e {
    public final Object[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, Object[] objArr) {
        super(dVar);
        i.e(objArr, "values");
        this.b = objArr;
    }

    public List<c> e() {
        Object obj;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            i.c(obj2);
            i.e(obj2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            Class<?> cls = obj2.getClass();
            List<m0.r.d<? extends Object>> list = ReflectClassUtilKt.a;
            i.e(cls, "<this>");
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new m((d) null, (Enum) obj2);
            } else if (obj2 instanceof Annotation) {
                obj = new d((d) null, (Annotation) obj2);
            } else if (obj2 instanceof Object[]) {
                obj = new f((d) null, (Object[]) obj2);
            } else if (obj2 instanceof Class) {
                obj = new i((d) null, (Class) obj2);
            } else {
                obj = new o((d) null, obj2);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
