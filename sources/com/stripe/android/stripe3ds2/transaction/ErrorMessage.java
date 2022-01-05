package com.stripe.android.stripe3ds2.transaction;

import androidx.annotation.Keep;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0018\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "transactionId", "errorCode", "errorDescription", "errorDetails", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorDetails", "getErrorCode", "getErrorDescription", "getTransactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: ErrorMessage.kt */
public final class ErrorMessage {
    private final String errorCode;
    private final String errorDescription;
    private final String errorDetails;
    private final String transactionId;

    public ErrorMessage(String str, String str2, String str3, String str4) {
        i.e(str, "transactionId");
        i.e(str2, "errorCode");
        i.e(str3, "errorDescription");
        i.e(str4, "errorDetails");
        this.transactionId = str;
        this.errorCode = str2;
        this.errorDescription = str3;
        this.errorDetails = str4;
    }

    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorMessage.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = errorMessage.errorCode;
        }
        if ((i & 4) != 0) {
            str3 = errorMessage.errorDescription;
        }
        if ((i & 8) != 0) {
            str4 = errorMessage.errorDetails;
        }
        return errorMessage.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.transactionId;
    }

    public final String component2() {
        return this.errorCode;
    }

    public final String component3() {
        return this.errorDescription;
    }

    public final String component4() {
        return this.errorDetails;
    }

    public final ErrorMessage copy(String str, String str2, String str3, String str4) {
        i.e(str, "transactionId");
        i.e(str2, "errorCode");
        i.e(str3, "errorDescription");
        i.e(str4, "errorDetails");
        return new ErrorMessage(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) obj;
        return i.a(this.transactionId, errorMessage.transactionId) && i.a(this.errorCode, errorMessage.errorCode) && i.a(this.errorDescription, errorMessage.errorDescription) && i.a(this.errorDetails, errorMessage.errorDetails);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetails() {
        return this.errorDetails;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.errorDescription;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.errorDetails;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ErrorMessage(transactionId=");
        P0.append(this.transactionId);
        P0.append(", errorCode=");
        P0.append(this.errorCode);
        P0.append(", errorDescription=");
        P0.append(this.errorDescription);
        P0.append(", errorDetails=");
        return a.y0(P0, this.errorDetails, ")");
    }
}
