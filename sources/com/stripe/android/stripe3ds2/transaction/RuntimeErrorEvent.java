package com.stripe.android.stripe3ds2.transaction;

import androidx.annotation.Keep;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019B\u0011\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "", "", "component1", "()Ljava/lang/String;", "component2", "errorCode", "errorMessage", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/Throwable;)V", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "errorData", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: RuntimeErrorEvent.kt */
public final class RuntimeErrorEvent {
    private final String errorCode;
    private final String errorMessage;

    public RuntimeErrorEvent(String str, String str2) {
        i.e(str, "errorCode");
        i.e(str2, "errorMessage");
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ RuntimeErrorEvent copy$default(RuntimeErrorEvent runtimeErrorEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runtimeErrorEvent.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = runtimeErrorEvent.errorMessage;
        }
        return runtimeErrorEvent.copy(str, str2);
    }

    public final String component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final RuntimeErrorEvent copy(String str, String str2) {
        i.e(str, "errorCode");
        i.e(str2, "errorMessage");
        return new RuntimeErrorEvent(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuntimeErrorEvent)) {
            return false;
        }
        RuntimeErrorEvent runtimeErrorEvent = (RuntimeErrorEvent) obj;
        return i.a(this.errorCode, runtimeErrorEvent.errorCode) && i.a(this.errorMessage, runtimeErrorEvent.errorMessage);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.errorCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.errorMessage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("RuntimeErrorEvent(errorCode=");
        P0.append(this.errorCode);
        P0.append(", errorMessage=");
        return a.y0(P0, this.errorMessage, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RuntimeErrorEvent(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "throwable"
            m0.n.b.i.e(r3, r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "throwable.javaClass.simpleName"
            m0.n.b.i.d(r0, r1)
            java.lang.String r3 = r3.getMessage()
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            java.lang.String r3 = ""
        L_0x001b:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.RuntimeErrorEvent.<init>(java.lang.Throwable):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RuntimeErrorEvent(ErrorData errorData) {
        this(errorData.getErrorCode(), errorData.getErrorDetail());
        i.e(errorData, "errorData");
    }
}
