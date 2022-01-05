package com.stripe.android.networking;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import m0.n.b.f;
import m0.q.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/networking/RetryDelaySupplier;", "", "", "maxRetries", "remainingRetries", "", "getDelayMillis", "(II)J", "incrementSeconds", "J", "<init>", "(J)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: RetryDelaySupplier.kt */
public final class RetryDelaySupplier {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final long DEFAULT_INCREMENT_SECONDS = 2;
    private final long incrementSeconds;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/RetryDelaySupplier$Companion;", "", "", "DEFAULT_INCREMENT_SECONDS", "J", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: RetryDelaySupplier.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public RetryDelaySupplier() {
        this(0, 1, (f) null);
    }

    public RetryDelaySupplier(long j) {
        this.incrementSeconds = j;
    }

    public final long getDelayMillis(int i, int i2) {
        return TimeUnit.SECONDS.toMillis((long) Math.pow((double) this.incrementSeconds, (double) ((i - i.b(i2, 1, i)) + 1)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RetryDelaySupplier(long j, int i, f fVar) {
        this((i & 1) != 0 ? DEFAULT_INCREMENT_SECONDS : j);
    }
}
