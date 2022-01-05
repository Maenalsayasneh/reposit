package i0.f.a.c;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.List;

/* compiled from: BeanDescription */
public abstract class b {
    public final JavaType a;

    public b(JavaType javaType) {
        this.a = javaType;
    }

    public abstract Class<?>[] a();

    public abstract JsonFormat.Value b(JsonFormat.Value value);

    public abstract AnnotatedMember c();

    public abstract AnnotatedMethod d(String str, Class<?>[] clsArr);

    public abstract JsonInclude.Value e(JsonInclude.Value value);

    public abstract List<AnnotatedMethod> f();
}
