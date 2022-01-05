package kotlin.text;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: Strings.kt */
public final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ char[] c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$2(char[] cArr, boolean z) {
        super(2);
        this.c = cArr;
        this.d = z;
    }

    public Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        i.e(charSequence, "$receiver");
        int n = StringsKt__IndentKt.n(charSequence, this.c, intValue, this.d);
        if (n < 0) {
            return null;
        }
        return new Pair(Integer.valueOf(n), 1);
    }
}
