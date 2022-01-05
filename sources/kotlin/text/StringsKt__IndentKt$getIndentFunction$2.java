package kotlin.text;

import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Indent.kt */
public final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements l<String, String> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__IndentKt$getIndentFunction$2(String str) {
        super(1);
        this.c = str;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "line");
        return a.y0(new StringBuilder(), this.c, str);
    }
}
