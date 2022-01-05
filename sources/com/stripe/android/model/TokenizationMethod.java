package com.stripe.android.model;

import i0.j.f.p.h;
import java.util.Set;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/TokenizationMethod;", "", "", "", "code", "Ljava/util/Set;", "<init>", "(Ljava/lang/String;ILjava/util/Set;)V", "Companion", "ApplePay", "GooglePay", "Masterpass", "VisaCheckout", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TokenizationMethod.kt */
public enum TokenizationMethod {
    ApplePay(h.N3("apple_pay")),
    GooglePay(g.h0("android_pay", "google")),
    Masterpass(h.N3("masterpass")),
    VisaCheckout(h.N3("visa_checkout"));
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public final Set<String> code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/TokenizationMethod$Companion;", "", "", "code", "Lcom/stripe/android/model/TokenizationMethod;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/TokenizationMethod;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TokenizationMethod.kt */
    public static final class Companion {
        private Companion() {
        }

        public final TokenizationMethod fromCode$payments_core_release(String str) {
            TokenizationMethod[] values = TokenizationMethod.values();
            for (int i = 0; i < 4; i++) {
                TokenizationMethod tokenizationMethod = values[i];
                if (g.f(tokenizationMethod.code, str)) {
                    return tokenizationMethod;
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

    private TokenizationMethod(Set<String> set) {
        this.code = set;
    }
}
