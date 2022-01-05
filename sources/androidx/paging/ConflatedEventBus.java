package androidx.paging;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r0\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/paging/ConflatedEventBus;", "", "T", "data", "Lm0/i;", "send", "(Ljava/lang/Object;)V", "Ln0/a/g2/d;", "flow", "Ln0/a/g2/d;", "getFlow", "()Ln0/a/g2/d;", "Ln0/a/g2/q;", "Lkotlin/Pair;", "", "state", "Ln0/a/g2/q;", "initialValue", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConflatedEventBus.kt */
public final class ConflatedEventBus<T> {
    private final d<T> flow;
    private final q<Pair<Integer, T>> state;

    public ConflatedEventBus() {
        this((Object) null, 1, (f) null);
    }

    public ConflatedEventBus(T t) {
        q<Pair<Integer, T>> a = a0.a(new Pair(Integer.MIN_VALUE, t));
        this.state = a;
        this.flow = new ConflatedEventBus$$special$$inlined$mapNotNull$1(a);
    }

    public final d<T> getFlow() {
        return this.flow;
    }

    public final void send(T t) {
        i.e(t, MessageExtension.FIELD_DATA);
        q<Pair<Integer, T>> qVar = this.state;
        qVar.setValue(new Pair(Integer.valueOf(((Number) qVar.getValue().c).intValue() + 1), t));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConflatedEventBus(Object obj, int i, f fVar) {
        this((i & 1) != 0 ? null : obj);
    }
}
