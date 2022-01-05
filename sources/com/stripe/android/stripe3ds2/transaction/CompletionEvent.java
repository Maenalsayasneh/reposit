package com.stripe.android.stripe3ds2.transaction;

import androidx.annotation.Keep;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;", "", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component1", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "", "component2", "()Ljava/lang/String;", "sdkTransactionId", "transactionStatus", "copy", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/CompletionEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransactionStatus", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: CompletionEvent.kt */
public final class CompletionEvent {
    private final SdkTransactionId sdkTransactionId;
    private final String transactionStatus;

    public CompletionEvent(SdkTransactionId sdkTransactionId2, String str) {
        i.e(sdkTransactionId2, "sdkTransactionId");
        i.e(str, "transactionStatus");
        this.sdkTransactionId = sdkTransactionId2;
        this.transactionStatus = str;
    }

    public static /* synthetic */ CompletionEvent copy$default(CompletionEvent completionEvent, SdkTransactionId sdkTransactionId2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkTransactionId2 = completionEvent.sdkTransactionId;
        }
        if ((i & 2) != 0) {
            str = completionEvent.transactionStatus;
        }
        return completionEvent.copy(sdkTransactionId2, str);
    }

    public final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public final String component2() {
        return this.transactionStatus;
    }

    public final CompletionEvent copy(SdkTransactionId sdkTransactionId2, String str) {
        i.e(sdkTransactionId2, "sdkTransactionId");
        i.e(str, "transactionStatus");
        return new CompletionEvent(sdkTransactionId2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletionEvent)) {
            return false;
        }
        CompletionEvent completionEvent = (CompletionEvent) obj;
        return i.a(this.sdkTransactionId, completionEvent.sdkTransactionId) && i.a(this.transactionStatus, completionEvent.transactionStatus);
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId2 = this.sdkTransactionId;
        int i = 0;
        int hashCode = (sdkTransactionId2 != null ? sdkTransactionId2.hashCode() : 0) * 31;
        String str = this.transactionStatus;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CompletionEvent(sdkTransactionId=");
        P0.append(this.sdkTransactionId);
        P0.append(", transactionStatus=");
        return a.y0(P0, this.transactionStatus, ")");
    }
}
