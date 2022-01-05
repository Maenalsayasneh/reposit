package com.stripe.android.model;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/StripeFilePurpose;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "BusinessIcon", "BusinessLogo", "CustomerSignature", "DisputeEvidence", "IdentityDocument", "PciDocument", "TaxDocumentUserUpload", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeFilePurpose.kt */
public enum StripeFilePurpose {
    BusinessIcon("business_icon"),
    BusinessLogo("business_logo"),
    CustomerSignature("customer_signature"),
    DisputeEvidence("dispute_evidence"),
    IdentityDocument("identity_document"),
    PciDocument("pci_document"),
    TaxDocumentUserUpload("tax_document_user_upload");
    
    public static final Companion Companion = null;
    private final String code;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/StripeFilePurpose$Companion;", "", "", "code", "Lcom/stripe/android/model/StripeFilePurpose;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/StripeFilePurpose;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeFilePurpose.kt */
    public static final class Companion {
        private Companion() {
        }

        public final StripeFilePurpose fromCode(String str) {
            StripeFilePurpose[] values = StripeFilePurpose.values();
            for (int i = 0; i < 7; i++) {
                StripeFilePurpose stripeFilePurpose = values[i];
                if (i.a(stripeFilePurpose.getCode$payments_core_release(), str)) {
                    return stripeFilePurpose;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private StripeFilePurpose(String str) {
        this.code = str;
    }

    public final String getCode$payments_core_release() {
        return this.code;
    }
}
