package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.m.v0;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor$initializeSupertypes$2 extends Lambda implements a<List<? extends v0>> {
    public final /* synthetic */ List<v0> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$initializeSupertypes$2(List<? extends v0> list) {
        super(0);
        this.c = list;
    }

    public Object invoke() {
        return this.c;
    }
}
