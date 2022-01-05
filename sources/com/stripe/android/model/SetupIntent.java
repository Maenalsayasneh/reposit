package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import i0.d.a.a.a;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u0000 b2\u00020\u0001:\u0004cdbeB\u0001\b\u0000\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010'\u001a\u00020\f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010/\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001f\u0012\b\u00101\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b`\u0010aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\bJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\b#\u0010$J¬\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010'\u001a\u00020\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010*\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u0010\bJ\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000205HÖ\u0001¢\u0006\u0004\b<\u00107J \u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000205HÖ\u0001¢\u0006\u0004\bA\u0010BR\u001e\u0010%\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bD\u0010\bR\u001e\u0010(\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\bE\u0010\bR\u0016\u0010F\u001a\u00020\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0004R\u0018\u0010H\u001a\u0004\u0018\u00010\u00068V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\bR\u001e\u0010,\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010C\u001a\u0004\bI\u0010\bR\u0018\u0010M\u001a\u0004\u0018\u00010J8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010*\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010N\u001a\u0004\b*\u0010\u0004R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010O\u001a\u0004\bP\u0010\u0018R\u001c\u0010'\u001a\u00020\f8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010Q\u001a\u0004\bR\u0010\u000eR\u001e\u0010.\u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010S\u001a\u0004\bT\u0010\u001bR\u001e\u0010+\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010U\u001a\u0004\bV\u0010\u0014R\u001e\u0010)\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010C\u001a\u0004\bW\u0010\bR\u001b\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010X\u001a\u0004\bY\u0010\u000bR\u001b\u0010/\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010Z\u001a\u0004\b[\u0010\u001eR\u001e\u00101\u001a\u0004\u0018\u00010\"8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b1\u0010\\\u001a\u0004\b]\u0010$R\u001b\u00100\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010^\u001a\u0004\b_\u0010!¨\u0006f"}, d2 = {"Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/StripeIntent;", "", "requiresAction", "()Z", "requiresConfirmation", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "component2", "()Lcom/stripe/android/model/SetupIntent$CancellationReason;", "", "component3", "()J", "component4", "component5", "component6", "Lcom/stripe/android/model/PaymentMethod;", "component7", "()Lcom/stripe/android/model/PaymentMethod;", "component8", "", "component9", "()Ljava/util/List;", "Lcom/stripe/android/model/StripeIntent$Status;", "component10", "()Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/model/StripeIntent$Usage;", "component11", "()Lcom/stripe/android/model/StripeIntent$Usage;", "Lcom/stripe/android/model/SetupIntent$Error;", "component12", "()Lcom/stripe/android/model/SetupIntent$Error;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "component13", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "id", "cancellationReason", "created", "clientSecret", "description", "isLiveMode", "paymentMethod", "paymentMethodId", "paymentMethodTypes", "status", "usage", "lastSetupError", "nextActionData", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Lcom/stripe/android/model/StripeIntent$NextActionData;)Lcom/stripe/android/model/SetupIntent;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getClientSecret", "isConfirmed", "getLastErrorMessage", "lastErrorMessage", "getPaymentMethodId", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "Z", "Ljava/util/List;", "getPaymentMethodTypes", "J", "getCreated", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "getDescription", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "getCancellationReason", "Lcom/stripe/android/model/StripeIntent$Usage;", "getUsage", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "Lcom/stripe/android/model/SetupIntent$Error;", "getLastSetupError", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "Companion", "CancellationReason", "ClientSecret", "Error", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SetupIntent.kt */
public final class SetupIntent implements StripeIntent {
    public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final CancellationReason cancellationReason;
    private final String clientSecret;
    private final long created;
    private final String description;
    private final String id;
    private final boolean isLiveMode;
    private final Error lastSetupError;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final List<String> paymentMethodTypes;
    private final StripeIntent.Status status;
    private final StripeIntent.Usage usage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason;", "", "", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Duplicate", "RequestedByCustomer", "Abandoned", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SetupIntent.kt */
    public enum CancellationReason {
        Duplicate("duplicate"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason$Companion;", "", "", "code", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent$CancellationReason;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SetupIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final CancellationReason fromCode$payments_core_release(String str) {
                CancellationReason[] values = CancellationReason.values();
                for (int i = 0; i < 3; i++) {
                    CancellationReason cancellationReason = values[i];
                    if (i.a(cancellationReason.code, str)) {
                        return cancellationReason;
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

        private CancellationReason(String str) {
            this.code = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret;", "", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent$ClientSecret;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "setupIntentId", "Ljava/lang/String;", "getSetupIntentId$payments_core_release", "getValue$payments_core_release", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SetupIntent.kt */
    public static final class ClientSecret {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Pattern PATTERN = Pattern.compile("^seti_[^_]+_secret_[^_]+$");
        private final String setupIntentId;
        private final String value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN", "Ljava/util/regex/Pattern;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SetupIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0067 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ClientSecret(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "value"
                m0.n.b.i.e(r5, r0)
                r4.<init>()
                r4.value = r5
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "_secret"
                r0.<init>(r1)
                r1 = 0
                java.util.List r5 = r0.c(r5, r1)
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x0046
                int r0 = r5.size()
                java.util.ListIterator r0 = r5.listIterator(r0)
            L_0x0024:
                boolean r2 = r0.hasPrevious()
                if (r2 == 0) goto L_0x0046
                java.lang.Object r2 = r0.previous()
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                r3 = 1
                if (r2 != 0) goto L_0x0039
                r2 = r3
                goto L_0x003a
            L_0x0039:
                r2 = r1
            L_0x003a:
                if (r2 != 0) goto L_0x0024
                int r0 = r0.nextIndex()
                int r0 = r0 + r3
                java.util.List r5 = m0.j.g.p0(r5, r0)
                goto L_0x0048
            L_0x0046:
                kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.c
            L_0x0048:
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r5, r0)
                java.lang.String[] r5 = (java.lang.String[]) r5
                r5 = r5[r1]
                r4.setupIntentId = r5
                java.util.regex.Pattern r5 = PATTERN
                java.lang.String r0 = r4.value
                java.util.regex.Matcher r5 = r5.matcher(r0)
                boolean r5 = r5.matches()
                if (r5 == 0) goto L_0x0068
                return
            L_0x0068:
                java.lang.String r5 = "Invalid client secret: "
                java.lang.StringBuilder r5 = i0.d.a.a.a.P0(r5)
                java.lang.String r0 = r4.value
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.SetupIntent.ClientSecret.<init>(java.lang.String):void");
        }

        public static /* synthetic */ ClientSecret copy$default(ClientSecret clientSecret, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientSecret.value;
            }
            return clientSecret.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.value;
        }

        public final ClientSecret copy(String str) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            return new ClientSecret(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ClientSecret) && i.a(this.value, ((ClientSecret) obj).value);
            }
            return true;
        }

        public final String getSetupIntentId$payments_core_release() {
            return this.setupIntentId;
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("ClientSecret(value="), this.value, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/SetupIntent;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SetupIntent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final SetupIntent fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new SetupIntentJsonParser().parse(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SetupIntent> {
        public final SetupIntent createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            i.e(parcel2, "in");
            return new SetupIntent(parcel.readString(), parcel.readInt() != 0 ? (CancellationReason) Enum.valueOf(CancellationReason.class, parcel.readString()) : null, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0 ? (StripeIntent.Status) Enum.valueOf(StripeIntent.Status.class, parcel.readString()) : null, parcel.readInt() != 0 ? (StripeIntent.Usage) Enum.valueOf(StripeIntent.Usage.class, parcel.readString()) : null, parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel2) : null, (StripeIntent.NextActionData) parcel2.readParcelable(SetupIntent.class.getClassLoader()));
        }

        public final SetupIntent[] newArray(int i) {
            return new SetupIntent[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000 42\u00020\u0001:\u000245BO\b\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b2\u00103J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u0004R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b*\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b+\u0010\u0004R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010\u000bR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b.\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u0010\u000eR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b1\u0010\u0004¨\u00066"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "Lcom/stripe/android/model/PaymentMethod;", "component6", "()Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "component7", "()Lcom/stripe/android/model/SetupIntent$Error$Type;", "code", "declineCode", "docUrl", "message", "param", "paymentMethod", "type", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/SetupIntent$Error$Type;)Lcom/stripe/android/model/SetupIntent$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDeclineCode", "getCode", "getDocUrl", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "getMessage", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "getType", "getParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/SetupIntent$Error$Type;)V", "Companion", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SetupIntent.kt */
    public static final class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "payment_intent_authentication_failure";
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final String code;
        private final String declineCode;
        private final String docUrl;
        private final String message;
        private final String param;
        private final PaymentMethod paymentMethod;
        private final Type type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Companion;", "", "", "CODE_AUTHENTICATION_ERROR", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SetupIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Error> {
            public final Error createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Type) Enum.valueOf(Type.class, parcel.readString()) : null);
            }

            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SetupIntent.kt */
        public enum Type {
            ApiConnectionError("api_connection_error"),
            ApiError("api_error"),
            AuthenticationError("authentication_error"),
            CardError("card_error"),
            IdempotencyError("idempotency_error"),
            InvalidRequestError("invalid_request_error"),
            RateLimitError("rate_limit_error");
            
            public static final Companion Companion = null;
            private final String code;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;", "", "", "typeCode", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/SetupIntent$Error$Type;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: SetupIntent.kt */
            public static final class Companion {
                private Companion() {
                }

                public final Type fromCode$payments_core_release(String str) {
                    Type[] values = Type.values();
                    for (int i = 0; i < 7; i++) {
                        Type type = values[i];
                        if (i.a(type.getCode(), str)) {
                            return type;
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

            private Type(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod2, Type type2) {
            this.code = str;
            this.declineCode = str2;
            this.docUrl = str3;
            this.message = str4;
            this.param = str5;
            this.paymentMethod = paymentMethod2;
            this.type = type2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod2, Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.code;
            }
            if ((i & 2) != 0) {
                str2 = error.declineCode;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = error.docUrl;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = error.message;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = error.param;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                paymentMethod2 = error.paymentMethod;
            }
            PaymentMethod paymentMethod3 = paymentMethod2;
            if ((i & 64) != 0) {
                type2 = error.type;
            }
            return error.copy(str, str6, str7, str8, str9, paymentMethod3, type2);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.declineCode;
        }

        public final String component3() {
            return this.docUrl;
        }

        public final String component4() {
            return this.message;
        }

        public final String component5() {
            return this.param;
        }

        public final PaymentMethod component6() {
            return this.paymentMethod;
        }

        public final Type component7() {
            return this.type;
        }

        public final Error copy(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod2, Type type2) {
            return new Error(str, str2, str3, str4, str5, paymentMethod2, type2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return i.a(this.code, error.code) && i.a(this.declineCode, error.declineCode) && i.a(this.docUrl, error.docUrl) && i.a(this.message, error.message) && i.a(this.param, error.param) && i.a(this.paymentMethod, error.paymentMethod) && i.a(this.type, error.type);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDeclineCode() {
            return this.declineCode;
        }

        public final String getDocUrl() {
            return this.docUrl;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getParam() {
            return this.param;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.code;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.declineCode;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.docUrl;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.message;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.param;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            PaymentMethod paymentMethod2 = this.paymentMethod;
            int hashCode6 = (hashCode5 + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0)) * 31;
            Type type2 = this.type;
            if (type2 != null) {
                i = type2.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Error(code=");
            P0.append(this.code);
            P0.append(", declineCode=");
            P0.append(this.declineCode);
            P0.append(", docUrl=");
            P0.append(this.docUrl);
            P0.append(", message=");
            P0.append(this.message);
            P0.append(", param=");
            P0.append(this.param);
            P0.append(", paymentMethod=");
            P0.append(this.paymentMethod);
            P0.append(", type=");
            P0.append(this.type);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.code);
            parcel.writeString(this.declineCode);
            parcel.writeString(this.docUrl);
            parcel.writeString(this.message);
            parcel.writeString(this.param);
            PaymentMethod paymentMethod2 = this.paymentMethod;
            if (paymentMethod2 != null) {
                parcel.writeInt(1);
                paymentMethod2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            Type type2 = this.type;
            if (type2 != null) {
                parcel.writeInt(1);
                parcel.writeString(type2.name());
                return;
            }
            parcel.writeInt(0);
        }
    }

    public SetupIntent(String str, CancellationReason cancellationReason2, long j, String str2, String str3, boolean z, PaymentMethod paymentMethod2, String str4, List<String> list, StripeIntent.Status status2, StripeIntent.Usage usage2, Error error, StripeIntent.NextActionData nextActionData2) {
        i.e(list, "paymentMethodTypes");
        this.id = str;
        this.cancellationReason = cancellationReason2;
        this.created = j;
        this.clientSecret = str2;
        this.description = str3;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod2;
        this.paymentMethodId = str4;
        this.paymentMethodTypes = list;
        this.status = status2;
        this.usage = usage2;
        this.lastSetupError = error;
        this.nextActionData = nextActionData2;
    }

    public static /* synthetic */ SetupIntent copy$default(SetupIntent setupIntent, String str, CancellationReason cancellationReason2, long j, String str2, String str3, boolean z, PaymentMethod paymentMethod2, String str4, List list, StripeIntent.Status status2, StripeIntent.Usage usage2, Error error, StripeIntent.NextActionData nextActionData2, int i, Object obj) {
        SetupIntent setupIntent2 = setupIntent;
        int i2 = i;
        return setupIntent.copy((i2 & 1) != 0 ? setupIntent.getId() : str, (i2 & 2) != 0 ? setupIntent2.cancellationReason : cancellationReason2, (i2 & 4) != 0 ? setupIntent.getCreated() : j, (i2 & 8) != 0 ? setupIntent.getClientSecret() : str2, (i2 & 16) != 0 ? setupIntent.getDescription() : str3, (i2 & 32) != 0 ? setupIntent.isLiveMode() : z, (i2 & 64) != 0 ? setupIntent.getPaymentMethod() : paymentMethod2, (i2 & 128) != 0 ? setupIntent.getPaymentMethodId() : str4, (i2 & 256) != 0 ? setupIntent.getPaymentMethodTypes() : list, (i2 & 512) != 0 ? setupIntent.getStatus() : status2, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? setupIntent2.usage : usage2, (i2 & 2048) != 0 ? setupIntent2.lastSetupError : error, (i2 & 4096) != 0 ? setupIntent.getNextActionData() : nextActionData2);
    }

    public static final SetupIntent fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final StripeIntent.Status component10() {
        return getStatus();
    }

    public final StripeIntent.Usage component11() {
        return this.usage;
    }

    public final Error component12() {
        return this.lastSetupError;
    }

    public final StripeIntent.NextActionData component13() {
        return getNextActionData();
    }

    public final CancellationReason component2() {
        return this.cancellationReason;
    }

    public final long component3() {
        return getCreated();
    }

    public final String component4() {
        return getClientSecret();
    }

    public final String component5() {
        return getDescription();
    }

    public final boolean component6() {
        return isLiveMode();
    }

    public final PaymentMethod component7() {
        return getPaymentMethod();
    }

    public final String component8() {
        return getPaymentMethodId();
    }

    public final List<String> component9() {
        return getPaymentMethodTypes();
    }

    public final SetupIntent copy(String str, CancellationReason cancellationReason2, long j, String str2, String str3, boolean z, PaymentMethod paymentMethod2, String str4, List<String> list, StripeIntent.Status status2, StripeIntent.Usage usage2, Error error, StripeIntent.NextActionData nextActionData2) {
        List<String> list2 = list;
        i.e(list2, "paymentMethodTypes");
        return new SetupIntent(str, cancellationReason2, j, str2, str3, z, paymentMethod2, str4, list2, status2, usage2, error, nextActionData2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetupIntent)) {
            return false;
        }
        SetupIntent setupIntent = (SetupIntent) obj;
        return i.a(getId(), setupIntent.getId()) && i.a(this.cancellationReason, setupIntent.cancellationReason) && getCreated() == setupIntent.getCreated() && i.a(getClientSecret(), setupIntent.getClientSecret()) && i.a(getDescription(), setupIntent.getDescription()) && isLiveMode() == setupIntent.isLiveMode() && i.a(getPaymentMethod(), setupIntent.getPaymentMethod()) && i.a(getPaymentMethodId(), setupIntent.getPaymentMethodId()) && i.a(getPaymentMethodTypes(), setupIntent.getPaymentMethodTypes()) && i.a(getStatus(), setupIntent.getStatus()) && i.a(this.usage, setupIntent.usage) && i.a(this.lastSetupError, setupIntent.lastSetupError) && i.a(getNextActionData(), setupIntent.getNextActionData());
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public long getCreated() {
        return this.created;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getLastErrorMessage() {
        Error error = this.lastSetupError;
        if (error != null) {
            return error.getMessage();
        }
        return null;
    }

    public final Error getLastSetupError() {
        return this.lastSetupError;
    }

    public StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    public StripeIntent.NextActionType getNextActionType() {
        StripeIntent.NextActionData nextActionData2 = getNextActionData();
        if (nextActionData2 instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData2 instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData2 instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        return null;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public StripeIntent.Status getStatus() {
        return this.status;
    }

    public final StripeIntent.Usage getUsage() {
        return this.usage;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 0;
        int hashCode = (id2 != null ? id2.hashCode() : 0) * 31;
        CancellationReason cancellationReason2 = this.cancellationReason;
        int hashCode2 = (Long.hashCode(getCreated()) + ((hashCode + (cancellationReason2 != null ? cancellationReason2.hashCode() : 0)) * 31)) * 31;
        String clientSecret2 = getClientSecret();
        int hashCode3 = (hashCode2 + (clientSecret2 != null ? clientSecret2.hashCode() : 0)) * 31;
        String description2 = getDescription();
        int hashCode4 = (hashCode3 + (description2 != null ? description2.hashCode() : 0)) * 31;
        boolean isLiveMode2 = isLiveMode();
        if (isLiveMode2) {
            isLiveMode2 = true;
        }
        int i2 = (hashCode4 + (isLiveMode2 ? 1 : 0)) * 31;
        PaymentMethod paymentMethod2 = getPaymentMethod();
        int hashCode5 = (i2 + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0)) * 31;
        String paymentMethodId2 = getPaymentMethodId();
        int hashCode6 = (hashCode5 + (paymentMethodId2 != null ? paymentMethodId2.hashCode() : 0)) * 31;
        List<String> paymentMethodTypes2 = getPaymentMethodTypes();
        int hashCode7 = (hashCode6 + (paymentMethodTypes2 != null ? paymentMethodTypes2.hashCode() : 0)) * 31;
        StripeIntent.Status status2 = getStatus();
        int hashCode8 = (hashCode7 + (status2 != null ? status2.hashCode() : 0)) * 31;
        StripeIntent.Usage usage2 = this.usage;
        int hashCode9 = (hashCode8 + (usage2 != null ? usage2.hashCode() : 0)) * 31;
        Error error = this.lastSetupError;
        int hashCode10 = (hashCode9 + (error != null ? error.hashCode() : 0)) * 31;
        StripeIntent.NextActionData nextActionData2 = getNextActionData();
        if (nextActionData2 != null) {
            i = nextActionData2.hashCode();
        }
        return hashCode10 + i;
    }

    public boolean isConfirmed() {
        return g.f(g.h0(StripeIntent.Status.Processing, StripeIntent.Status.Succeeded), getStatus());
    }

    public boolean isLiveMode() {
        return this.isLiveMode;
    }

    public boolean requiresAction() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    public boolean requiresConfirmation() {
        return getStatus() == StripeIntent.Status.RequiresConfirmation;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SetupIntent(id=");
        P0.append(getId());
        P0.append(", cancellationReason=");
        P0.append(this.cancellationReason);
        P0.append(", created=");
        P0.append(getCreated());
        P0.append(", clientSecret=");
        P0.append(getClientSecret());
        P0.append(", description=");
        P0.append(getDescription());
        P0.append(", isLiveMode=");
        P0.append(isLiveMode());
        P0.append(", paymentMethod=");
        P0.append(getPaymentMethod());
        P0.append(", paymentMethodId=");
        P0.append(getPaymentMethodId());
        P0.append(", paymentMethodTypes=");
        P0.append(getPaymentMethodTypes());
        P0.append(", status=");
        P0.append(getStatus());
        P0.append(", usage=");
        P0.append(this.usage);
        P0.append(", lastSetupError=");
        P0.append(this.lastSetupError);
        P0.append(", nextActionData=");
        P0.append(getNextActionData());
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        CancellationReason cancellationReason2 = this.cancellationReason;
        if (cancellationReason2 != null) {
            parcel.writeInt(1);
            parcel.writeString(cancellationReason2.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.created);
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.description);
        parcel.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod2 = this.paymentMethod;
        if (paymentMethod2 != null) {
            parcel.writeInt(1);
            paymentMethod2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.paymentMethodId);
        parcel.writeStringList(this.paymentMethodTypes);
        StripeIntent.Status status2 = this.status;
        if (status2 != null) {
            parcel.writeInt(1);
            parcel.writeString(status2.name());
        } else {
            parcel.writeInt(0);
        }
        StripeIntent.Usage usage2 = this.usage;
        if (usage2 != null) {
            parcel.writeInt(1);
            parcel.writeString(usage2.name());
        } else {
            parcel.writeInt(0);
        }
        Error error = this.lastSetupError;
        if (error != null) {
            parcel.writeInt(1);
            error.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.nextActionData, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SetupIntent(java.lang.String r19, com.stripe.android.model.SetupIntent.CancellationReason r20, long r21, java.lang.String r23, java.lang.String r24, boolean r25, com.stripe.android.model.PaymentMethod r26, java.lang.String r27, java.util.List r28, com.stripe.android.model.StripeIntent.Status r29, com.stripe.android.model.StripeIntent.Usage r30, com.stripe.android.model.SetupIntent.Error r31, com.stripe.android.model.StripeIntent.NextActionData r32, int r33, m0.n.b.f r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r26
        L_0x000b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0012
            r16 = r2
            goto L_0x0014
        L_0x0012:
            r16 = r31
        L_0x0014:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r17 = r32
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.SetupIntent.<init>(java.lang.String, com.stripe.android.model.SetupIntent$CancellationReason, long, java.lang.String, java.lang.String, boolean, com.stripe.android.model.PaymentMethod, java.lang.String, java.util.List, com.stripe.android.model.StripeIntent$Status, com.stripe.android.model.StripeIntent$Usage, com.stripe.android.model.SetupIntent$Error, com.stripe.android.model.StripeIntent$NextActionData, int, m0.n.b.f):void");
    }
}
