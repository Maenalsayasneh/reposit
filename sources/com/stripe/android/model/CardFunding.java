package com.stripe.android.model;

import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/CardFunding;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Credit", "Debit", "Prepaid", "Unknown", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardFunding.kt */
public enum CardFunding {
    Credit("credit"),
    Debit("debit"),
    Prepaid("prepaid"),
    Unknown("unknown");
    
    public static final Companion Companion = null;
    private final String code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/CardFunding$Companion;", "", "", "code", "Lcom/stripe/android/model/CardFunding;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/CardFunding;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardFunding.kt */
    public static final class Companion {
        private Companion() {
        }

        public final CardFunding fromCode$payments_core_release(String str) {
            CardFunding[] values = CardFunding.values();
            for (int i = 0; i < 4; i++) {
                CardFunding cardFunding = values[i];
                if (i.a(cardFunding.getCode$payments_core_release(), str)) {
                    return cardFunding;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private CardFunding(String str) {
        this.code = str;
    }

    public final String getCode$payments_core_release() {
        return this.code;
    }
}
