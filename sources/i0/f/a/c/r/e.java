package i0.f.a.c.r;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import i0.f.a.c.b;
import i0.f.a.c.n.a;

/* compiled from: PropertyBuilder */
public class e {
    public final SerializationConfig a;
    public final b b;
    public final AnnotationIntrospector c;
    public Object d;
    public final JsonInclude.Value e;
    public final boolean f;

    public e(SerializationConfig serializationConfig, b bVar) {
        JsonInclude.Value value;
        this.a = serializationConfig;
        this.b = bVar;
        JsonInclude.Value value2 = JsonInclude.Value.c;
        JsonInclude.Value e2 = bVar.e(value2);
        serializationConfig.k(bVar.a.c, value2);
        value2 = e2 != null ? e2.a(value2) : value2;
        JsonInclude.Value value3 = serializationConfig.e2.d;
        if (value3 == null) {
            value = value2;
        } else {
            value = value3.a(value2);
        }
        this.e = value;
        this.f = value2.d == JsonInclude.Include.NON_DEFAULT;
        this.c = serializationConfig.e();
    }

    public JavaType a(a aVar, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType C0 = this.c.C0(this.a, aVar, javaType);
        boolean z2 = true;
        if (C0 != javaType) {
            Class<?> cls = C0.c;
            Class<?> cls2 = javaType.c;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                StringBuilder P0 = i0.d.a.a.a.P0("Illegal concrete-type annotation for method '");
                P0.append(aVar.d());
                P0.append("': class ");
                P0.append(cls.getName());
                P0.append(" not a super-type of (declared) class ");
                throw new IllegalArgumentException(i0.d.a.a.a.W(cls2, P0));
            }
            javaType = C0;
            z = true;
        }
        JsonSerialize.Typing g02 = this.c.g0(aVar);
        if (!(g02 == null || g02 == JsonSerialize.Typing.DEFAULT_TYPING)) {
            if (g02 != JsonSerialize.Typing.STATIC) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return javaType.a0();
        }
        return null;
    }
}
