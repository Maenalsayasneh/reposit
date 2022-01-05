package m0.r.t.a.r.c.v0.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.b.i;
import m0.r.d;
import m0.r.t.a.r.e.a.w.b;
import m0.r.t.a.r.e.a.w.w;
import m0.r.t.a.r.e.a.w.z;

/* compiled from: ReflectJavaMethod.kt */
public final class q extends p implements m0.r.t.a.r.e.a.w.q {
    public final Method a;

    public q(Method method) {
        i.e(method, "member");
        this.a = method;
    }

    public boolean K() {
        i.e(this, "this");
        return S() != null;
    }

    public Member Q() {
        return this.a;
    }

    public b S() {
        b oVar;
        Object defaultValue = this.a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        i.e(defaultValue, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        Class<?> cls = defaultValue.getClass();
        List<d<? extends Object>> list = ReflectClassUtilKt.a;
        i.e(cls, "<this>");
        if (Enum.class.isAssignableFrom(cls)) {
            oVar = new m((m0.r.t.a.r.g.d) null, (Enum) defaultValue);
        } else if (defaultValue instanceof Annotation) {
            oVar = new d((m0.r.t.a.r.g.d) null, (Annotation) defaultValue);
        } else if (defaultValue instanceof Object[]) {
            oVar = new f((m0.r.t.a.r.g.d) null, (Object[]) defaultValue);
        } else if (defaultValue instanceof Class) {
            oVar = new i((m0.r.t.a.r.g.d) null, (Class) defaultValue);
        } else {
            oVar = new o((m0.r.t.a.r.g.d) null, defaultValue);
        }
        return oVar;
    }

    public w getReturnType() {
        w wVar;
        Type genericReturnType = this.a.getGenericReturnType();
        i.d(genericReturnType, "member.genericReturnType");
        i.e(genericReturnType, "type");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new t(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            wVar = new g(genericReturnType);
        } else if (genericReturnType instanceof WildcardType) {
            wVar = new x((WildcardType) genericReturnType);
        } else {
            wVar = new j(genericReturnType);
        }
        return wVar;
    }

    public List<v> getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        i.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable vVar : typeParameters) {
            arrayList.add(new v(vVar));
        }
        return arrayList;
    }

    public List<z> h() {
        Type[] genericParameterTypes = this.a.getGenericParameterTypes();
        i.d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.a.getParameterAnnotations();
        i.d(parameterAnnotations, "member.parameterAnnotations");
        return R(genericParameterTypes, parameterAnnotations, this.a.isVarArgs());
    }
}
