package n0.c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlinx.serialization.KSerializer;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Annotations.kt */
public @interface e {
    Class<? extends KSerializer<?>> with() default KSerializer.class;
}
