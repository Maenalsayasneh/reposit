package kotlinx.serialization.internal;

import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import n0.c.b;

/* compiled from: Tagged.kt */
public final class TaggedDecoder$decodeSerializableElement$1 extends Lambda implements a<T> {
    public final /* synthetic */ TaggedDecoder c;
    public final /* synthetic */ b d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaggedDecoder$decodeSerializableElement$1(TaggedDecoder taggedDecoder, b bVar, Object obj) {
        super(0);
        this.c = taggedDecoder;
        this.d = bVar;
        this.q = obj;
    }

    public final T invoke() {
        TaggedDecoder taggedDecoder = this.c;
        b bVar = this.d;
        Objects.requireNonNull(taggedDecoder);
        i.e(bVar, "deserializer");
        return taggedDecoder.B(bVar);
    }
}
