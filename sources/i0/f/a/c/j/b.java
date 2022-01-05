package i0.f.a.c.j;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: JsonAppend */
public @interface b {

    /* compiled from: JsonAppend */
    public @interface a {
        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* renamed from: i0.f.a.c.j.b$b  reason: collision with other inner class name */
    /* compiled from: JsonAppend */
    public @interface C0120b {
        JsonInclude.Include include() default JsonInclude.Include.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends VirtualBeanPropertyWriter> value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    C0120b[] props() default {};
}
