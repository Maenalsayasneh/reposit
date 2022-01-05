package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2 extends Lambda implements a<Integer> {
    public final /* synthetic */ Map c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2(Map map) {
        super(0);
        this.c = map;
    }

    public Object invoke() {
        int i;
        int i2 = 0;
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                i = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                i = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                i = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                i = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                i = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                i = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                i = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                i = Arrays.hashCode((double[]) value);
            } else if (value instanceof Object[]) {
                i = Arrays.hashCode((Object[]) value);
            } else {
                i = value.hashCode();
            }
            i2 += i ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(i2);
    }
}
