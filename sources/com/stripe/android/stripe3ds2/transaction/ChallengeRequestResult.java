package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "", "<init>", "()V", "ProtocolError", "RuntimeError", "Success", "Timeout", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeRequestResult.kt */
public abstract class ChallengeRequestResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "component1", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "data", "copy", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "getData", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestResult.kt */
    public static final class ProtocolError extends ChallengeRequestResult {
        private final ErrorData data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData errorData) {
            super((f) null);
            i.e(errorData, MessageExtension.FIELD_DATA);
            this.data = errorData;
        }

        public static /* synthetic */ ProtocolError copy$default(ProtocolError protocolError, ErrorData errorData, int i, Object obj) {
            if ((i & 1) != 0) {
                errorData = protocolError.data;
            }
            return protocolError.copy(errorData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final ProtocolError copy(ErrorData errorData) {
            i.e(errorData, MessageExtension.FIELD_DATA);
            return new ProtocolError(errorData);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ProtocolError) && i.a(this.data, ((ProtocolError) obj).data);
            }
            return true;
        }

        public final ErrorData getData() {
            return this.data;
        }

        public int hashCode() {
            ErrorData errorData = this.data;
            if (errorData != null) {
                return errorData.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("ProtocolError(data=");
            P0.append(this.data);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "", "component1", "()Ljava/lang/Throwable;", "throwable", "copy", "(Ljava/lang/Throwable;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "<init>", "(Ljava/lang/Throwable;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestResult.kt */
    public static final class RuntimeError extends ChallengeRequestResult {
        private final Throwable throwable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable th) {
            super((f) null);
            i.e(th, "throwable");
            this.throwable = th;
        }

        public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = runtimeError.throwable;
            }
            return runtimeError.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final RuntimeError copy(Throwable th) {
            i.e(th, "throwable");
            return new RuntimeError(th);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RuntimeError) && i.a(this.throwable, ((RuntimeError) obj).throwable);
            }
            return true;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            Throwable th = this.throwable;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("RuntimeError(throwable=");
            P0.append(this.throwable);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "component1", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "component2", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "creqData", "cresData", "copy", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "getCresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getCreqData", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestResult.kt */
    public static final class Success extends ChallengeRequestResult {
        private final ChallengeRequestData creqData;
        private final ChallengeResponseData cresData;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            super((f) null);
            i.e(challengeRequestData, "creqData");
            i.e(challengeResponseData, "cresData");
            this.creqData = challengeRequestData;
            this.cresData = challengeResponseData;
        }

        public static /* synthetic */ Success copy$default(Success success, ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, int i, Object obj) {
            if ((i & 1) != 0) {
                challengeRequestData = success.creqData;
            }
            if ((i & 2) != 0) {
                challengeResponseData = success.cresData;
            }
            return success.copy(challengeRequestData, challengeResponseData);
        }

        public final ChallengeRequestData component1() {
            return this.creqData;
        }

        public final ChallengeResponseData component2() {
            return this.cresData;
        }

        public final Success copy(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            i.e(challengeRequestData, "creqData");
            i.e(challengeResponseData, "cresData");
            return new Success(challengeRequestData, challengeResponseData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return i.a(this.creqData, success.creqData) && i.a(this.cresData, success.cresData);
        }

        public final ChallengeRequestData getCreqData() {
            return this.creqData;
        }

        public final ChallengeResponseData getCresData() {
            return this.cresData;
        }

        public int hashCode() {
            ChallengeRequestData challengeRequestData = this.creqData;
            int i = 0;
            int hashCode = (challengeRequestData != null ? challengeRequestData.hashCode() : 0) * 31;
            ChallengeResponseData challengeResponseData = this.cresData;
            if (challengeResponseData != null) {
                i = challengeResponseData.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Success(creqData=");
            P0.append(this.creqData);
            P0.append(", cresData=");
            P0.append(this.cresData);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "component1", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "data", "copy", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "getData", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestResult.kt */
    public static final class Timeout extends ChallengeRequestResult {
        private final ErrorData data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Timeout(ErrorData errorData) {
            super((f) null);
            i.e(errorData, MessageExtension.FIELD_DATA);
            this.data = errorData;
        }

        public static /* synthetic */ Timeout copy$default(Timeout timeout, ErrorData errorData, int i, Object obj) {
            if ((i & 1) != 0) {
                errorData = timeout.data;
            }
            return timeout.copy(errorData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final Timeout copy(ErrorData errorData) {
            i.e(errorData, MessageExtension.FIELD_DATA);
            return new Timeout(errorData);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Timeout) && i.a(this.data, ((Timeout) obj).data);
            }
            return true;
        }

        public final ErrorData getData() {
            return this.data;
        }

        public int hashCode() {
            ErrorData errorData = this.data;
            if (errorData != null) {
                return errorData.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Timeout(data=");
            P0.append(this.data);
            P0.append(")");
            return P0.toString();
        }
    }

    private ChallengeRequestResult() {
    }

    public /* synthetic */ ChallengeRequestResult(f fVar) {
        this();
    }
}
