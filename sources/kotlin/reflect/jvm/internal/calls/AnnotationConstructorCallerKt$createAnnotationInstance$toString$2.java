package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 extends Lambda implements a<String> {
    public final /* synthetic */ Class c;
    public final /* synthetic */ Map d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(Class cls, Map map) {
        super(0);
        this.c = cls;
        this.d = map;
    }

    public Object invoke() {
        StringBuilder N0 = i0.d.a.a.a.N0('@');
        N0.append(this.c.getCanonicalName());
        g.C(this.d.entrySet(), N0, ", ", "(", ")", 0, (CharSequence) null, AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1.c, 48);
        String sb = N0.toString();
        i.d(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
