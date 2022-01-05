package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ImmediateTimeoutTransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lm0/i;", "start", "(Lm0/l/c;)Ljava/lang/Object;", "Ln0/a/g2/d;", "", "timeout", "Ln0/a/g2/d;", "getTimeout", "()Ln0/a/g2/d;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ImmediateTimeoutTransactionTimer.kt */
public final class ImmediateTimeoutTransactionTimer implements TransactionTimer {
    private final d<Boolean> timeout = new f(Boolean.TRUE);

    public d<Boolean> getTimeout() {
        return this.timeout;
    }

    public Object start(c<? super i> cVar) {
        return i.a;
    }
}
