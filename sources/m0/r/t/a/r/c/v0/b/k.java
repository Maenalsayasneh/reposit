package m0.r.t.a.r.c.v0.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.z;

/* compiled from: ReflectJavaConstructor.kt */
public final class k extends p implements m0.r.t.a.r.e.a.w.k {
    public final Constructor<?> a;

    public k(Constructor<?> constructor) {
        i.e(constructor, "member");
        this.a = constructor;
    }

    public Member Q() {
        return this.a;
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
        i.d(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return EmptyList.c;
        }
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) g.k(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.a.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                i.d(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) g.k(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            i.d(genericParameterTypes, "realTypes");
            i.d(parameterAnnotations, "realAnnotations");
            return R(genericParameterTypes, parameterAnnotations, this.a.isVarArgs());
        }
        throw new IllegalStateException(i.k("Illegal generic signature: ", this.a));
    }
}
