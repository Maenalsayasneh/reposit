package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import n0.a.g2.d;
import n0.a.g2.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/GooglePayRepository;", "", "Ln0/a/g2/d;", "", "isReady", "()Ln0/a/g2/d;", "Disabled", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: GooglePayRepository.kt */
public interface GooglePayRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/GooglePayRepository$Disabled;", "Lcom/stripe/android/paymentsheet/GooglePayRepository;", "Ln0/a/g2/d;", "", "isReady", "()Ln0/a/g2/d;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayRepository.kt */
    public static final class Disabled implements GooglePayRepository {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        public d<Boolean> isReady() {
            return new f(Boolean.FALSE);
        }
    }

    d<Boolean> isReady();
}
