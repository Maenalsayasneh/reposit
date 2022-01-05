package com.stripe.android.stripe3ds2.transaction;

import androidx.annotation.Keep;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component1", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "component2", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "sdkTransactionId", "errorMessage", "copy", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;)Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "getErrorMessage", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: ProtocolErrorEvent.kt */
public final class ProtocolErrorEvent {
    private final ErrorMessage errorMessage;
    private final SdkTransactionId sdkTransactionId;

    public ProtocolErrorEvent(SdkTransactionId sdkTransactionId2, ErrorMessage errorMessage2) {
        i.e(errorMessage2, "errorMessage");
        this.sdkTransactionId = sdkTransactionId2;
        this.errorMessage = errorMessage2;
    }

    public static /* synthetic */ ProtocolErrorEvent copy$default(ProtocolErrorEvent protocolErrorEvent, SdkTransactionId sdkTransactionId2, ErrorMessage errorMessage2, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkTransactionId2 = protocolErrorEvent.sdkTransactionId;
        }
        if ((i & 2) != 0) {
            errorMessage2 = protocolErrorEvent.errorMessage;
        }
        return protocolErrorEvent.copy(sdkTransactionId2, errorMessage2);
    }

    public final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public final ErrorMessage component2() {
        return this.errorMessage;
    }

    public final ProtocolErrorEvent copy(SdkTransactionId sdkTransactionId2, ErrorMessage errorMessage2) {
        i.e(errorMessage2, "errorMessage");
        return new ProtocolErrorEvent(sdkTransactionId2, errorMessage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolErrorEvent)) {
            return false;
        }
        ProtocolErrorEvent protocolErrorEvent = (ProtocolErrorEvent) obj;
        return i.a(this.sdkTransactionId, protocolErrorEvent.sdkTransactionId) && i.a(this.errorMessage, protocolErrorEvent.errorMessage);
    }

    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId2 = this.sdkTransactionId;
        int i = 0;
        int hashCode = (sdkTransactionId2 != null ? sdkTransactionId2.hashCode() : 0) * 31;
        ErrorMessage errorMessage2 = this.errorMessage;
        if (errorMessage2 != null) {
            i = errorMessage2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ProtocolErrorEvent(sdkTransactionId=");
        P0.append(this.sdkTransactionId);
        P0.append(", errorMessage=");
        P0.append(this.errorMessage);
        P0.append(")");
        return P0.toString();
    }
}
