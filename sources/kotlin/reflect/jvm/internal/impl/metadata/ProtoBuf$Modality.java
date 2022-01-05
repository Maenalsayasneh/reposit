package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

public enum ProtoBuf$Modality implements Internal.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static Internal.b<ProtoBuf$Modality> internalValueMap;
    private final int value;

    public static class a implements Internal.b<ProtoBuf$Modality> {
        public Internal.a a(int i) {
            return ProtoBuf$Modality.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new a();
    }

    private ProtoBuf$Modality(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Modality valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }
}
