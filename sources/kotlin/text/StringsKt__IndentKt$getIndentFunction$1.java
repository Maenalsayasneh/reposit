package kotlin.text;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Indent.kt */
public final class StringsKt__IndentKt$getIndentFunction$1 extends Lambda implements l<String, String> {
    public static final StringsKt__IndentKt$getIndentFunction$1 c = new StringsKt__IndentKt$getIndentFunction$1();

    public StringsKt__IndentKt$getIndentFunction$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "line");
        return str;
    }
}
