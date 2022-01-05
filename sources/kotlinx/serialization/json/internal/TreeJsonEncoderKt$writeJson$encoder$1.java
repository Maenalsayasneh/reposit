package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonElement;
import m0.i;
import m0.n.a.l;

/* compiled from: TreeJsonEncoder.kt */
public final class TreeJsonEncoderKt$writeJson$encoder$1 extends Lambda implements l<JsonElement, i> {
    public final /* synthetic */ Ref$ObjectRef c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TreeJsonEncoderKt$writeJson$encoder$1(Ref$ObjectRef ref$ObjectRef) {
        super(1);
        this.c = ref$ObjectRef;
    }

    public Object invoke(Object obj) {
        T t = (JsonElement) obj;
        m0.n.b.i.e(t, "it");
        this.c.c = t;
        return i.a;
    }
}
