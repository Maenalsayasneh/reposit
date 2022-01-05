package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$debounce$2 extends Lambda implements l<T, Long> {
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$2(long j) {
        super(1);
        this.c = j;
    }

    public Object invoke(Object obj) {
        return Long.valueOf(this.c);
    }
}
