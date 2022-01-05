package kotlinx.serialization;

import i0.d.a.a.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "", "index", "<init>", "(I)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: SerializationException.kt */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(a.e0("An unknown field for index ", i));
    }
}
