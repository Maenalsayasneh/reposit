package i0.f.a.c.j;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: JsonPOJOBuilder */
public @interface e {

    /* compiled from: JsonPOJOBuilder */
    public static class a {
        public final String a;
        public final String b;

        public a(e eVar) {
            String buildMethodName = eVar.buildMethodName();
            String withPrefix = eVar.withPrefix();
            this.a = buildMethodName;
            this.b = withPrefix;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
