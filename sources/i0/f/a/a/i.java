package i0.f.a.a;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: JsonIdentityInfo */
public @interface i {
    Class<? extends ObjectIdGenerator<?>> generator();

    String property() default "@id";

    Class<? extends z> resolver() default a0.class;

    Class<?> scope() default Object.class;
}
