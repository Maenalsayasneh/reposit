package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

public enum ProtoBuf$Visibility implements Internal.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static Internal.b<ProtoBuf$Visibility> internalValueMap;
    private final int value;

    public static class a implements Internal.b<ProtoBuf$Visibility> {
        public Internal.a a(int i) {
            return ProtoBuf$Visibility.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new a();
    }

    private ProtoBuf$Visibility(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Visibility valueOf(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }
}
