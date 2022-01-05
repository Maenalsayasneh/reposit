package m0.r;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

/* compiled from: KCallable.kt */
public interface c<R> extends b {
    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    String getName();

    List<KParameter> getParameters();

    n getReturnType();

    List<o> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
