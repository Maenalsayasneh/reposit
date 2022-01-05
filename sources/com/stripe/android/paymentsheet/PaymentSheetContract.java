package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.SessionId;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.view.ActivityStarter;
import h0.a.f.d.a;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u0011\u0013B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract;", "Lh0/a/f/d/a;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "<init>", "()V", "Companion", "Args", "Result", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetContract.kt */
public final class PaymentSheetContract extends a<Args, PaymentSheetResult> {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_args";
    @Deprecated
    private static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 52\u00020\u0001:\u00015B-\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b3\u00104J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010\rR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010\nR\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010\u0007R\u0015\u00100\u001a\u0004\u0018\u00010-8F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00101\u001a\u00020\u001b8F@\u0006¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "component1", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "component2", "()Lcom/stripe/android/paymentsheet/analytics/SessionId;", "", "component3", "()Ljava/lang/Integer;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component4", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "clientSecret", "sessionId", "statusBarColor", "config", "copy", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/analytics/SessionId;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getClientSecret", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getConfig", "Ljava/lang/Integer;", "getStatusBarColor", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "getSessionId", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getGooglePayConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "googlePayConfig", "isGooglePayEnabled", "()Z", "<init>", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/analytics/SessionId;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetContract.kt */
    public static final class Args implements ActivityStarter.Args {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final ClientSecret clientSecret;
        private final PaymentSheet.Configuration config;
        private final SessionId sessionId;
        private final Integer statusBarColor;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "fromIntent$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "fromIntent", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSheetContract.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Args fromIntent$payments_core_release(Intent intent) {
                i.e(intent, "intent");
                Companion unused = PaymentSheetContract.Companion;
                return (Args) intent.getParcelableExtra(PaymentSheetContract.EXTRA_ARGS);
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                ClientSecret clientSecret = (ClientSecret) parcel.readParcelable(Args.class.getClassLoader());
                SessionId createFromParcel = SessionId.CREATOR.createFromParcel(parcel);
                PaymentSheet.Configuration configuration = null;
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                if (parcel.readInt() != 0) {
                    configuration = PaymentSheet.Configuration.CREATOR.createFromParcel(parcel);
                }
                return new Args(clientSecret, createFromParcel, valueOf, configuration);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(ClientSecret clientSecret2, SessionId sessionId2, Integer num, PaymentSheet.Configuration configuration) {
            i.e(clientSecret2, "clientSecret");
            i.e(sessionId2, "sessionId");
            this.clientSecret = clientSecret2;
            this.sessionId = sessionId2;
            this.statusBarColor = num;
            this.config = configuration;
        }

        public static /* synthetic */ Args copy$default(Args args, ClientSecret clientSecret2, SessionId sessionId2, Integer num, PaymentSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                clientSecret2 = args.clientSecret;
            }
            if ((i & 2) != 0) {
                sessionId2 = args.sessionId;
            }
            if ((i & 4) != 0) {
                num = args.statusBarColor;
            }
            if ((i & 8) != 0) {
                configuration = args.config;
            }
            return args.copy(clientSecret2, sessionId2, num, configuration);
        }

        public final ClientSecret component1() {
            return this.clientSecret;
        }

        public final SessionId component2() {
            return this.sessionId;
        }

        public final Integer component3() {
            return this.statusBarColor;
        }

        public final PaymentSheet.Configuration component4() {
            return this.config;
        }

        public final Args copy(ClientSecret clientSecret2, SessionId sessionId2, Integer num, PaymentSheet.Configuration configuration) {
            i.e(clientSecret2, "clientSecret");
            i.e(sessionId2, "sessionId");
            return new Args(clientSecret2, sessionId2, num, configuration);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return i.a(this.clientSecret, args.clientSecret) && i.a(this.sessionId, args.sessionId) && i.a(this.statusBarColor, args.statusBarColor) && i.a(this.config, args.config);
        }

        public final ClientSecret getClientSecret() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public final PaymentSheet.GooglePayConfiguration getGooglePayConfig() {
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                return configuration.getGooglePay();
            }
            return null;
        }

        public final SessionId getSessionId() {
            return this.sessionId;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            ClientSecret clientSecret2 = this.clientSecret;
            int i = 0;
            int hashCode = (clientSecret2 != null ? clientSecret2.hashCode() : 0) * 31;
            SessionId sessionId2 = this.sessionId;
            int hashCode2 = (hashCode + (sessionId2 != null ? sessionId2.hashCode() : 0)) * 31;
            Integer num = this.statusBarColor;
            int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                i = configuration.hashCode();
            }
            return hashCode3 + i;
        }

        public final boolean isGooglePayEnabled() {
            return getGooglePayConfig() != null && (this.clientSecret instanceof PaymentIntentClientSecret);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Args(clientSecret=");
            P0.append(this.clientSecret);
            P0.append(", sessionId=");
            P0.append(this.sessionId);
            P0.append(", statusBarColor=");
            P0.append(this.statusBarColor);
            P0.append(", config=");
            P0.append(this.config);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeParcelable(this.clientSecret, i);
            this.sessionId.writeToParcel(parcel, 0);
            Integer num = this.statusBarColor;
            if (num != null) {
                i0.d.a.a.a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                parcel.writeInt(1);
                configuration.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Companion;", "", "", "EXTRA_ARGS", "Ljava/lang/String;", "EXTRA_RESULT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetContract.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "component1", "()Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "paymentSheetResult", "copy", "(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$Result;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "getPaymentSheetResult", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetContract.kt */
    public static final class Result implements ActivityStarter.Result {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final PaymentSheetResult paymentSheetResult;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Result> {
            public final Result createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Result((PaymentSheetResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(PaymentSheetResult paymentSheetResult2) {
            i.e(paymentSheetResult2, "paymentSheetResult");
            this.paymentSheetResult = paymentSheetResult2;
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentSheetResult paymentSheetResult2, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSheetResult2 = result.paymentSheetResult;
            }
            return result.copy(paymentSheetResult2);
        }

        public final PaymentSheetResult component1() {
            return this.paymentSheetResult;
        }

        public final Result copy(PaymentSheetResult paymentSheetResult2) {
            i.e(paymentSheetResult2, "paymentSheetResult");
            return new Result(paymentSheetResult2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Result) && i.a(this.paymentSheetResult, ((Result) obj).paymentSheetResult);
            }
            return true;
        }

        public final PaymentSheetResult getPaymentSheetResult() {
            return this.paymentSheetResult;
        }

        public int hashCode() {
            PaymentSheetResult paymentSheetResult2 = this.paymentSheetResult;
            if (paymentSheetResult2 != null) {
                return paymentSheetResult2.hashCode();
            }
            return 0;
        }

        public Bundle toBundle() {
            Companion unused = PaymentSheetContract.Companion;
            return g0.a.b.b.a.g(new Pair(PaymentSheetContract.EXTRA_RESULT, this));
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Result(paymentSheetResult=");
            P0.append(this.paymentSheetResult);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeParcelable(this.paymentSheetResult, i);
        }
    }

    public Intent createIntent(Context context, Args args) {
        i.e(context, "context");
        i.e(args, "input");
        Intent putExtra = new Intent(context, PaymentSheetActivity.class).putExtra(EXTRA_ARGS, args);
        i.d(putExtra, "Intent(context, PaymentS…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = (com.stripe.android.paymentsheet.PaymentSheetContract.Result) r3.getParcelableExtra(EXTRA_RESULT);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.stripe.android.paymentsheet.PaymentSheetResult parseResult(int r2, android.content.Intent r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0011
            java.lang.String r2 = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result"
            android.os.Parcelable r2 = r3.getParcelableExtra(r2)
            com.stripe.android.paymentsheet.PaymentSheetContract$Result r2 = (com.stripe.android.paymentsheet.PaymentSheetContract.Result) r2
            if (r2 == 0) goto L_0x0011
            com.stripe.android.paymentsheet.PaymentSheetResult r2 = r2.getPaymentSheetResult()
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x0015
            goto L_0x0021
        L_0x0015:
            com.stripe.android.paymentsheet.PaymentSheetResult$Failed r2 = new com.stripe.android.paymentsheet.PaymentSheetResult$Failed
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed to retrieve a PaymentSheetResult."
            r3.<init>(r0)
            r2.<init>(r3)
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetContract.parseResult(int, android.content.Intent):com.stripe.android.paymentsheet.PaymentSheetResult");
    }
}
