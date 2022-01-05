package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.e.b.p;

/* compiled from: SignatureBuildingComponents.kt */
public final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements l<String, CharSequence> {
    public final /* synthetic */ p c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignatureBuildingComponents$jvmDescriptor$1(p pVar) {
        super(1);
        this.c = pVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "it");
        return this.c.b(str);
    }
}
