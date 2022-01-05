package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.m.v0;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor$_supertypes$2 extends Lambda implements a<List<? extends v0>> {
    public final /* synthetic */ NewCapturedTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$_supertypes$2(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        super(0);
        this.c = newCapturedTypeConstructor;
    }

    public Object invoke() {
        a<? extends List<? extends v0>> aVar = this.c.b;
        if (aVar == null) {
            return null;
        }
        return (List) aVar.invoke();
    }
}
