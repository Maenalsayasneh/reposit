package kotlin.text;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.q.e;

/* compiled from: Strings.kt */
public final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements l<e, String> {
    public final /* synthetic */ CharSequence c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        super(1);
        this.c = charSequence;
    }

    public Object invoke(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "it");
        return StringsKt__IndentKt.K(this.c, eVar);
    }
}
