package i0.f.a.c.r.k;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import i0.f.a.b.f;
import i0.f.a.c.g;

/* compiled from: ObjectIdWriter */
public final class a {
    public final JavaType a;
    public final f b;
    public final ObjectIdGenerator<?> c;
    public final g<Object> d;
    public final boolean e;

    public a(JavaType javaType, f fVar, ObjectIdGenerator<?> objectIdGenerator, g<?> gVar, boolean z) {
        this.a = javaType;
        this.b = fVar;
        this.c = objectIdGenerator;
        this.d = gVar;
        this.e = z;
    }

    public static a a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        SerializedString serializedString = null;
        String str = propertyName == null ? null : propertyName.q;
        if (str != null) {
            serializedString = new SerializedString(str);
        }
        return new a(javaType, serializedString, objectIdGenerator, (g<?>) null, z);
    }
}
