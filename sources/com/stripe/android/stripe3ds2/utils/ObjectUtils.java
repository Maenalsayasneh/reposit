package com.stripe.android.stripe3ds2.utils;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;", "", "obj1", "obj2", "", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "values", "", "hash", "([Ljava/lang/Object;)I", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ObjectUtils.kt */
public final class ObjectUtils {
    public static final ObjectUtils INSTANCE = new ObjectUtils();

    private ObjectUtils() {
    }

    public static final boolean equals(Object obj, Object obj2) {
        return i.a(obj, obj2);
    }

    public static final int hash(Object... objArr) {
        i.e(objArr, "values");
        return Objects.hash(Arrays.copyOf(objArr, objArr.length));
    }
}
