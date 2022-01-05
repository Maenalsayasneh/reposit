package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 extends Lambda implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 c = new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1();

    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
        } else {
            str = value.toString();
        }
        return str2 + '=' + str;
    }
}
