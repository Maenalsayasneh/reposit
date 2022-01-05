package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.SessionId;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.view.ActivityStarter;
import h0.a.f.d.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u0012\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract;", "Lh0/a/f/d/a;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "<init>", "()V", "Companion", "Args", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionContract.kt */
public final class PaymentOptionContract extends a<Args, PaymentOptionResult> {
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_ARGS = "extra_activity_args";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u0000 @2\u00020\u0001:\u0001@BM\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jb\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b/\u00100R\u0019\u0010\u001a\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u0010\u000bR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b4\u0010\u0017R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u0010\u0014R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b8\u0010\bR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b:\u0010\u000eR\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010\u0004R\u0019\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\b\u001c\u0010\u0011¨\u0006A"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "Lcom/stripe/android/model/StripeIntent;", "component1", "()Lcom/stripe/android/model/StripeIntent;", "", "Lcom/stripe/android/model/PaymentMethod;", "component2", "()Ljava/util/List;", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "component3", "()Lcom/stripe/android/paymentsheet/analytics/SessionId;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component4", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "", "component5", "()Z", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "component6", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "", "component7", "()Ljava/lang/Integer;", "stripeIntent", "paymentMethods", "sessionId", "config", "isGooglePayReady", "newCard", "statusBarColor", "copy", "(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/analytics/SessionId;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "getSessionId", "Ljava/lang/Integer;", "getStatusBarColor", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "Ljava/util/List;", "getPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getConfig", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent", "Z", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/analytics/SessionId;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;Ljava/lang/Integer;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionContract.kt */
    public static final class Args implements ActivityStarter.Args {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final PaymentSheet.Configuration config;
        private final boolean isGooglePayReady;
        private final PaymentSelection.New.Card newCard;
        private final List<PaymentMethod> paymentMethods;
        private final SessionId sessionId;
        private final Integer statusBarColor;
        private final StripeIntent stripeIntent;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "fromIntent$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "fromIntent", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionContract.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Args fromIntent$payments_core_release(Intent intent) {
                i.e(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                return new Args(stripeIntent, arrayList, SessionId.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentSheet.Configuration.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? PaymentSelection.New.Card.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(StripeIntent stripeIntent2, List<PaymentMethod> list, SessionId sessionId2, PaymentSheet.Configuration configuration, boolean z, PaymentSelection.New.Card card, Integer num) {
            i.e(stripeIntent2, "stripeIntent");
            i.e(list, "paymentMethods");
            i.e(sessionId2, "sessionId");
            this.stripeIntent = stripeIntent2;
            this.paymentMethods = list;
            this.sessionId = sessionId2;
            this.config = configuration;
            this.isGooglePayReady = z;
            this.newCard = card;
            this.statusBarColor = num;
        }

        public static /* synthetic */ Args copy$default(Args args, StripeIntent stripeIntent2, List<PaymentMethod> list, SessionId sessionId2, PaymentSheet.Configuration configuration, boolean z, PaymentSelection.New.Card card, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeIntent2 = args.stripeIntent;
            }
            if ((i & 2) != 0) {
                list = args.paymentMethods;
            }
            List<PaymentMethod> list2 = list;
            if ((i & 4) != 0) {
                sessionId2 = args.sessionId;
            }
            SessionId sessionId3 = sessionId2;
            if ((i & 8) != 0) {
                configuration = args.config;
            }
            PaymentSheet.Configuration configuration2 = configuration;
            if ((i & 16) != 0) {
                z = args.isGooglePayReady;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                card = args.newCard;
            }
            PaymentSelection.New.Card card2 = card;
            if ((i & 64) != 0) {
                num = args.statusBarColor;
            }
            return args.copy(stripeIntent2, list2, sessionId3, configuration2, z2, card2, num);
        }

        public final StripeIntent component1() {
            return this.stripeIntent;
        }

        public final List<PaymentMethod> component2() {
            return this.paymentMethods;
        }

        public final SessionId component3() {
            return this.sessionId;
        }

        public final PaymentSheet.Configuration component4() {
            return this.config;
        }

        public final boolean component5() {
            return this.isGooglePayReady;
        }

        public final PaymentSelection.New.Card component6() {
            return this.newCard;
        }

        public final Integer component7() {
            return this.statusBarColor;
        }

        public final Args copy(StripeIntent stripeIntent2, List<PaymentMethod> list, SessionId sessionId2, PaymentSheet.Configuration configuration, boolean z, PaymentSelection.New.Card card, Integer num) {
            i.e(stripeIntent2, "stripeIntent");
            i.e(list, "paymentMethods");
            i.e(sessionId2, "sessionId");
            return new Args(stripeIntent2, list, sessionId2, configuration, z, card, num);
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
            return i.a(this.stripeIntent, args.stripeIntent) && i.a(this.paymentMethods, args.paymentMethods) && i.a(this.sessionId, args.sessionId) && i.a(this.config, args.config) && this.isGooglePayReady == args.isGooglePayReady && i.a(this.newCard, args.newCard) && i.a(this.statusBarColor, args.statusBarColor);
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public final PaymentSelection.New.Card getNewCard() {
            return this.newCard;
        }

        public final List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final SessionId getSessionId() {
            return this.sessionId;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        public int hashCode() {
            StripeIntent stripeIntent2 = this.stripeIntent;
            int i = 0;
            int hashCode = (stripeIntent2 != null ? stripeIntent2.hashCode() : 0) * 31;
            List<PaymentMethod> list = this.paymentMethods;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            SessionId sessionId2 = this.sessionId;
            int hashCode3 = (hashCode2 + (sessionId2 != null ? sessionId2.hashCode() : 0)) * 31;
            PaymentSheet.Configuration configuration = this.config;
            int hashCode4 = (hashCode3 + (configuration != null ? configuration.hashCode() : 0)) * 31;
            boolean z = this.isGooglePayReady;
            if (z) {
                z = true;
            }
            int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
            PaymentSelection.New.Card card = this.newCard;
            int hashCode5 = (i2 + (card != null ? card.hashCode() : 0)) * 31;
            Integer num = this.statusBarColor;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode5 + i;
        }

        public final boolean isGooglePayReady() {
            return this.isGooglePayReady;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Args(stripeIntent=");
            P0.append(this.stripeIntent);
            P0.append(", paymentMethods=");
            P0.append(this.paymentMethods);
            P0.append(", sessionId=");
            P0.append(this.sessionId);
            P0.append(", config=");
            P0.append(this.config);
            P0.append(", isGooglePayReady=");
            P0.append(this.isGooglePayReady);
            P0.append(", newCard=");
            P0.append(this.newCard);
            P0.append(", statusBarColor=");
            P0.append(this.statusBarColor);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeParcelable(this.stripeIntent, i);
            List<PaymentMethod> list = this.paymentMethods;
            parcel.writeInt(list.size());
            for (PaymentMethod writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            this.sessionId.writeToParcel(parcel, 0);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                parcel.writeInt(1);
                configuration.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.isGooglePayReady ? 1 : 0);
            PaymentSelection.New.Card card = this.newCard;
            if (card != null) {
                parcel.writeInt(1);
                card.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            Integer num = this.statusBarColor;
            if (num != null) {
                i0.d.a.a.a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Companion;", "", "", "EXTRA_ARGS", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionContract.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public Intent createIntent(Context context, Args args) {
        i.e(context, "context");
        i.e(args, "input");
        Intent putExtra = new Intent(context, PaymentOptionsActivity.class).putExtra("extra_activity_args", args);
        i.d(putExtra, "Intent(context, PaymentO…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    public PaymentOptionResult parseResult(int i, Intent intent) {
        return PaymentOptionResult.Companion.fromIntent$payments_core_release(intent);
    }
}
