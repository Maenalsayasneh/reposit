package i0.f.a.c.j;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: JsonNaming */
public @interface d {
    Class<? extends PropertyNamingStrategy> value() default PropertyNamingStrategy.class;
}
