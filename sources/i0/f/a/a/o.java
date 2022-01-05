package i0.f.a.a;

import com.fasterxml.jackson.annotation.OptBoolean;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: JsonMerge */
public @interface o {
    OptBoolean value() default OptBoolean.TRUE;
}
