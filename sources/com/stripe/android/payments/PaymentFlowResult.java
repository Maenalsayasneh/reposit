package com.stripe.android.payments;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Source;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import n0.b.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult;", "", "<init>", "()V", "Unvalidated", "Validated", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowResult.kt */
public abstract class PaymentFlowResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u0000 D2\u00020\u0001:\u0001DBY\b\u0000\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010!\u001a\u00020\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bB\u0010CJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u0018\u0010\nJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001aHÀ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u001e\u0010\nJ`\u0010'\u001a\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010#\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010\nJ\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010\u000eJ\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b/\u0010\u000eJ \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b4\u00105R\u001c\u0010!\u001a\u00020\f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b7\u0010\u000eR\u001c\u0010#\u001a\u00020\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b9\u0010\u0016R\u001e\u0010&\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\b;\u0010\nR\u001e\u0010$\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\b<\u0010\nR\u001e\u0010%\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b%\u0010=\u001a\u0004\b>\u0010\u001cR\u001e\u0010 \u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b?\u0010\nR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bA\u0010\u0012¨\u0006E"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "validate", "()Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "", "component2$payments_core_release", "()I", "component2", "Lcom/stripe/android/exception/StripeException;", "component3$payments_core_release", "()Lcom/stripe/android/exception/StripeException;", "component3", "", "component4$payments_core_release", "()Z", "component4", "component5$payments_core_release", "component5", "Lcom/stripe/android/model/Source;", "component6$payments_core_release", "()Lcom/stripe/android/model/Source;", "component6", "component7$payments_core_release", "component7", "clientSecret", "flowOutcome", "exception", "canCancelSource", "sourceId", "source", "stripeAccountId", "copy", "(Ljava/lang/String;ILcom/stripe/android/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getFlowOutcome$payments_core_release", "Z", "getCanCancelSource$payments_core_release", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "getSourceId$payments_core_release", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "getClientSecret$payments_core_release", "Lcom/stripe/android/exception/StripeException;", "getException$payments_core_release", "<init>", "(Ljava/lang/String;ILcom/stripe/android/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowResult.kt */
    public static final class Unvalidated implements Parcelable {
        private static final String CLIENT_SECRET_INTENT_ERROR = "Invalid client_secret value in result Intent.";
        public static final Parcelable.Creator<Unvalidated> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private static final String EXTRA = "extra_args";
        private final boolean canCancelSource;
        private final String clientSecret;
        private final StripeException exception;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;", "Ln0/b/a;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "", "flags", "Lm0/i;", "write", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Landroid/os/Parcel;I)V", "Landroid/content/Intent;", "intent", "fromIntent$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "fromIntent", "", "CLIENT_SECRET_INTENT_ERROR", "Ljava/lang/String;", "EXTRA", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentFlowResult.kt */
        public static final class Companion implements a<Unvalidated> {
            private Companion() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
                r11 = (com.stripe.android.payments.PaymentFlowResult.Unvalidated) r11.getParcelableExtra("extra_args");
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ com.stripe.android.payments.PaymentFlowResult.Unvalidated fromIntent$payments_core_release(android.content.Intent r11) {
                /*
                    r10 = this;
                    if (r11 == 0) goto L_0x000d
                    java.lang.String r0 = "extra_args"
                    android.os.Parcelable r11 = r11.getParcelableExtra(r0)
                    com.stripe.android.payments.PaymentFlowResult$Unvalidated r11 = (com.stripe.android.payments.PaymentFlowResult.Unvalidated) r11
                    if (r11 == 0) goto L_0x000d
                    goto L_0x001d
                L_0x000d:
                    com.stripe.android.payments.PaymentFlowResult$Unvalidated r11 = new com.stripe.android.payments.PaymentFlowResult$Unvalidated
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 127(0x7f, float:1.78E-43)
                    r9 = 0
                    r0 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                L_0x001d:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentFlowResult.Unvalidated.Companion.fromIntent$payments_core_release(android.content.Intent):com.stripe.android.payments.PaymentFlowResult$Unvalidated");
            }

            public Unvalidated[] newArray(int i) {
                m0.r.t.a.r.m.a1.a.P2(this);
                throw null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public Unvalidated create(Parcel parcel) {
                i.e(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                Serializable readSerializable = parcel.readSerializable();
                if (!(readSerializable instanceof StripeException)) {
                    readSerializable = null;
                }
                StripeException stripeException = (StripeException) readSerializable;
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                return new Unvalidated(readString, readInt, stripeException, z, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
            }

            public void write(Unvalidated unvalidated, Parcel parcel, int i) {
                i.e(unvalidated, "$this$write");
                i.e(parcel, "parcel");
                parcel.writeString(unvalidated.getClientSecret$payments_core_release());
                parcel.writeInt(unvalidated.getFlowOutcome$payments_core_release());
                parcel.writeSerializable(unvalidated.getException$payments_core_release());
                Integer num = 1;
                num.intValue();
                if (!unvalidated.getCanCancelSource$payments_core_release()) {
                    num = null;
                }
                parcel.writeInt(num != null ? num.intValue() : 0);
                parcel.writeString(unvalidated.getSourceId$payments_core_release());
                parcel.writeParcelable(unvalidated.getSource$payments_core_release(), i);
                parcel.writeString(unvalidated.getStripeAccountId$payments_core_release());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Unvalidated> {
            public final Unvalidated createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return Unvalidated.Companion.create(parcel);
            }

            public final Unvalidated[] newArray(int i) {
                return new Unvalidated[i];
            }
        }

        public Unvalidated() {
            this((String) null, 0, (StripeException) null, false, (String) null, (Source) null, (String) null, 127, (f) null);
        }

        public Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source2, String str3) {
            this.clientSecret = str;
            this.flowOutcome = i;
            this.exception = stripeException;
            this.canCancelSource = z;
            this.sourceId = str2;
            this.source = source2;
            this.stripeAccountId = str3;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, StripeException stripeException, boolean z, String str2, Source source2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = unvalidated.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = unvalidated.flowOutcome;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                stripeException = unvalidated.exception;
            }
            StripeException stripeException2 = stripeException;
            if ((i2 & 8) != 0) {
                z = unvalidated.canCancelSource;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                str2 = unvalidated.sourceId;
            }
            String str4 = str2;
            if ((i2 & 32) != 0) {
                source2 = unvalidated.source;
            }
            Source source3 = source2;
            if ((i2 & 64) != 0) {
                str3 = unvalidated.stripeAccountId;
            }
            return unvalidated.copy(str, i3, stripeException2, z2, str4, source3, str3);
        }

        public final String component1$payments_core_release() {
            return this.clientSecret;
        }

        public final int component2$payments_core_release() {
            return this.flowOutcome;
        }

        public final StripeException component3$payments_core_release() {
            return this.exception;
        }

        public final boolean component4$payments_core_release() {
            return this.canCancelSource;
        }

        public final String component5$payments_core_release() {
            return this.sourceId;
        }

        public final Source component6$payments_core_release() {
            return this.source;
        }

        public final String component7$payments_core_release() {
            return this.stripeAccountId;
        }

        public final Unvalidated copy(String str, int i, StripeException stripeException, boolean z, String str2, Source source2, String str3) {
            return new Unvalidated(str, i, stripeException, z, str2, source2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unvalidated)) {
                return false;
            }
            Unvalidated unvalidated = (Unvalidated) obj;
            return i.a(this.clientSecret, unvalidated.clientSecret) && this.flowOutcome == unvalidated.flowOutcome && i.a(this.exception, unvalidated.exception) && this.canCancelSource == unvalidated.canCancelSource && i.a(this.sourceId, unvalidated.sourceId) && i.a(this.source, unvalidated.source) && i.a(this.stripeAccountId, unvalidated.stripeAccountId);
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getClientSecret$payments_core_release() {
            return this.clientSecret;
        }

        public final StripeException getException$payments_core_release() {
            return this.exception;
        }

        public final int getFlowOutcome$payments_core_release() {
            return this.flowOutcome;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final String getStripeAccountId$payments_core_release() {
            return this.stripeAccountId;
        }

        public int hashCode() {
            String str = this.clientSecret;
            int i = 0;
            int M = i0.d.a.a.a.M(this.flowOutcome, (str != null ? str.hashCode() : 0) * 31, 31);
            StripeException stripeException = this.exception;
            int hashCode = (M + (stripeException != null ? stripeException.hashCode() : 0)) * 31;
            boolean z = this.canCancelSource;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            String str2 = this.sourceId;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Source source2 = this.source;
            int hashCode3 = (hashCode2 + (source2 != null ? source2.hashCode() : 0)) * 31;
            String str3 = this.stripeAccountId;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final Bundle toBundle() {
            return g0.a.b.b.a.g(new Pair("extra_args", this));
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Unvalidated(clientSecret=");
            P0.append(this.clientSecret);
            P0.append(", flowOutcome=");
            P0.append(this.flowOutcome);
            P0.append(", exception=");
            P0.append(this.exception);
            P0.append(", canCancelSource=");
            P0.append(this.canCancelSource);
            P0.append(", sourceId=");
            P0.append(this.sourceId);
            P0.append(", source=");
            P0.append(this.source);
            P0.append(", stripeAccountId=");
            return i0.d.a.a.a.y0(P0, this.stripeAccountId, ")");
        }

        public final Validated validate() {
            StripeException stripeException = this.exception;
            if (!(stripeException instanceof Throwable)) {
                String str = this.clientSecret;
                if (!(str == null || StringsKt__IndentKt.o(str))) {
                    return new Validated(this.clientSecret, this.flowOutcome, this.canCancelSource, this.sourceId, this.source, this.stripeAccountId);
                }
                throw new IllegalArgumentException(CLIENT_SECRET_INTENT_ERROR.toString());
            }
            throw stripeException;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Companion.write(this, parcel, i);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Unvalidated(java.lang.String r7, int r8, com.stripe.android.exception.StripeException r9, boolean r10, java.lang.String r11, com.stripe.android.model.Source r12, java.lang.String r13, int r14, m0.n.b.f r15) {
            /*
                r6 = this;
                r15 = r14 & 1
                r0 = 0
                if (r15 == 0) goto L_0x0007
                r15 = r0
                goto L_0x0008
            L_0x0007:
                r15 = r7
            L_0x0008:
                r7 = r14 & 2
                r1 = 0
                if (r7 == 0) goto L_0x000f
                r2 = r1
                goto L_0x0010
            L_0x000f:
                r2 = r8
            L_0x0010:
                r7 = r14 & 4
                if (r7 == 0) goto L_0x0016
                r3 = r0
                goto L_0x0017
            L_0x0016:
                r3 = r9
            L_0x0017:
                r7 = r14 & 8
                if (r7 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r1 = r10
            L_0x001d:
                r7 = r14 & 16
                if (r7 == 0) goto L_0x0023
                r4 = r0
                goto L_0x0024
            L_0x0023:
                r4 = r11
            L_0x0024:
                r7 = r14 & 32
                if (r7 == 0) goto L_0x002a
                r5 = r0
                goto L_0x002b
            L_0x002a:
                r5 = r12
            L_0x002b:
                r7 = r14 & 64
                if (r7 == 0) goto L_0x0031
                r14 = r0
                goto L_0x0032
            L_0x0031:
                r14 = r13
            L_0x0032:
                r7 = r6
                r8 = r15
                r9 = r2
                r10 = r3
                r11 = r1
                r12 = r4
                r13 = r5
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentFlowResult.Unvalidated.<init>(java.lang.String, int, com.stripe.android.exception.StripeException, boolean, java.lang.String, com.stripe.android.model.Source, java.lang.String, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0013\u0010\u0004JR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0007J\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010\u0004R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0017\u001a\u00020\t8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010\u000bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b(\u0010\u0004R\u001c\u0010\u0016\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\u0007R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b+\u0010\u0004¨\u0006."}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "", "", "component1", "()Ljava/lang/String;", "", "component2$payments_core_release", "()I", "component2", "", "component3$payments_core_release", "()Z", "component3", "component4$payments_core_release", "component4", "Lcom/stripe/android/model/Source;", "component5$payments_core_release", "()Lcom/stripe/android/model/Source;", "component5", "component6$payments_core_release", "component6", "clientSecret", "flowOutcome", "canCancelSource", "sourceId", "source", "stripeAccountId", "copy", "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientSecret", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "Z", "getCanCancelSource$payments_core_release", "getSourceId$payments_core_release", "I", "getFlowOutcome$payments_core_release", "getStripeAccountId$payments_core_release", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowResult.kt */
    public static final class Validated {
        private final boolean canCancelSource;
        private final String clientSecret;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;

        public Validated(String str, int i, boolean z, String str2, Source source2, String str3) {
            i.e(str, "clientSecret");
            this.clientSecret = str;
            this.flowOutcome = i;
            this.canCancelSource = z;
            this.sourceId = str2;
            this.source = source2;
            this.stripeAccountId = str3;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i, boolean z, String str2, Source source2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = validated.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = validated.flowOutcome;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = validated.canCancelSource;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                str2 = validated.sourceId;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                source2 = validated.source;
            }
            Source source3 = source2;
            if ((i2 & 32) != 0) {
                str3 = validated.stripeAccountId;
            }
            return validated.copy(str, i3, z2, str4, source3, str3);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final int component2$payments_core_release() {
            return this.flowOutcome;
        }

        public final boolean component3$payments_core_release() {
            return this.canCancelSource;
        }

        public final String component4$payments_core_release() {
            return this.sourceId;
        }

        public final Source component5$payments_core_release() {
            return this.source;
        }

        public final String component6$payments_core_release() {
            return this.stripeAccountId;
        }

        public final Validated copy(String str, int i, boolean z, String str2, Source source2, String str3) {
            i.e(str, "clientSecret");
            return new Validated(str, i, z, str2, source2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) obj;
            return i.a(this.clientSecret, validated.clientSecret) && this.flowOutcome == validated.flowOutcome && this.canCancelSource == validated.canCancelSource && i.a(this.sourceId, validated.sourceId) && i.a(this.source, validated.source) && i.a(this.stripeAccountId, validated.stripeAccountId);
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getFlowOutcome$payments_core_release() {
            return this.flowOutcome;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final String getStripeAccountId$payments_core_release() {
            return this.stripeAccountId;
        }

        public int hashCode() {
            String str = this.clientSecret;
            int i = 0;
            int M = i0.d.a.a.a.M(this.flowOutcome, (str != null ? str.hashCode() : 0) * 31, 31);
            boolean z = this.canCancelSource;
            if (z) {
                z = true;
            }
            int i2 = (M + (z ? 1 : 0)) * 31;
            String str2 = this.sourceId;
            int hashCode = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Source source2 = this.source;
            int hashCode2 = (hashCode + (source2 != null ? source2.hashCode() : 0)) * 31;
            String str3 = this.stripeAccountId;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Validated(clientSecret=");
            P0.append(this.clientSecret);
            P0.append(", flowOutcome=");
            P0.append(this.flowOutcome);
            P0.append(", canCancelSource=");
            P0.append(this.canCancelSource);
            P0.append(", sourceId=");
            P0.append(this.sourceId);
            P0.append(", source=");
            P0.append(this.source);
            P0.append(", stripeAccountId=");
            return i0.d.a.a.a.y0(P0, this.stripeAccountId, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Validated(String str, int i, boolean z, String str2, Source source2, String str3, int i2, f fVar) {
            this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : source2, (i2 & 32) != 0 ? null : str3);
        }
    }

    private PaymentFlowResult() {
    }
}
