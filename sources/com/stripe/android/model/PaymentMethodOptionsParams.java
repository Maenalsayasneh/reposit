package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0014\u0015\u0016B\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003H ¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "()Ljava/util/List;", "createTypeParams", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Type;)V", "Blik", "Card", "WeChatPay", "Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;", "Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik;", "Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodOptionsParams.kt */
public abstract class PaymentMethodOptionsParams implements StripeParamsModel, Parcelable {
    private final PaymentMethod.Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J#\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "()Ljava/util/List;", "createTypeParams", "component1", "()Ljava/lang/String;", "code", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCode", "setCode", "(Ljava/lang/String;)V", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodOptionsParams.kt */
    public static final class Blik extends PaymentMethodOptionsParams {
        public static final Parcelable.Creator<Blik> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        public static final String PARAM_CODE = "code";
        private String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik$Companion;", "", "", "PARAM_CODE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodOptionsParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Blik> {
            public final Blik createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Blik(parcel.readString());
            }

            public final Blik[] newArray(int i) {
                return new Blik[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Blik(String str) {
            super(PaymentMethod.Type.Blik, (f) null);
            i.e(str, PARAM_CODE);
            this.code = str;
        }

        public static /* synthetic */ Blik copy$default(Blik blik, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = blik.code;
            }
            return blik.copy(str);
        }

        public final String component1() {
            return this.code;
        }

        public final Blik copy(String str) {
            i.e(str, PARAM_CODE);
            return new Blik(str);
        }

        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            return h.L2(new Pair(PARAM_CODE, this.code));
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Blik) && i.a(this.code, ((Blik) obj).code);
            }
            return true;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            String str = this.code;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setCode(String str) {
            i.e(str, "<set-?>");
            this.code = str;
        }

        public String toString() {
            return a.y0(a.P0("Blik(code="), this.code, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J#\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\"R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\"¨\u0006("}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "()Ljava/util/List;", "createTypeParams", "component1", "()Ljava/lang/String;", "component2", "cvc", "network", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCvc", "setCvc", "(Ljava/lang/String;)V", "getNetwork", "setNetwork", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodOptionsParams.kt */
    public static final class Card extends PaymentMethodOptionsParams {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_CVC = "cvc";
        @Deprecated
        private static final String PARAM_NETWORK = "network";
        private String cvc;
        private String network;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$Card$Companion;", "", "", "PARAM_CVC", "Ljava/lang/String;", "PARAM_NETWORK", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodOptionsParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Card> {
            public final Card createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Card(parcel.readString(), parcel.readString());
            }

            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this((String) null, (String) null, 3, (f) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Card(String str, String str2, int i, f fVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Card copy$default(Card card, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = card.cvc;
            }
            if ((i & 2) != 0) {
                str2 = card.network;
            }
            return card.copy(str, str2);
        }

        public final String component1() {
            return this.cvc;
        }

        public final String component2() {
            return this.network;
        }

        public final Card copy(String str, String str2) {
            return new Card(str, str2);
        }

        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            return g.K(new Pair(PARAM_CVC, this.cvc), new Pair("network", this.network));
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return i.a(this.cvc, card.cvc) && i.a(this.network, card.network);
        }

        public final String getCvc() {
            return this.cvc;
        }

        public final String getNetwork() {
            return this.network;
        }

        public int hashCode() {
            String str = this.cvc;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.network;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final void setCvc(String str) {
            this.cvc = str;
        }

        public final void setNetwork(String str) {
            this.network = str;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Card(cvc=");
            P0.append(this.cvc);
            P0.append(", network=");
            return a.y0(P0, this.network, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.cvc);
            parcel.writeString(this.network);
        }

        public Card(String str, String str2) {
            super(PaymentMethod.Type.Card, (f) null);
            this.cvc = str;
            this.network = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J#\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "()Ljava/util/List;", "createTypeParams", "component1", "()Ljava/lang/String;", "appId", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAppId", "setAppId", "(Ljava/lang/String;)V", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodOptionsParams.kt */
    public static final class WeChatPay extends PaymentMethodOptionsParams {
        public static final Parcelable.Creator<WeChatPay> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        public static final String PARAM_APP_ID = "app_id";
        public static final String PARAM_CLIENT = "client";
        private String appId;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay$Companion;", "", "", "PARAM_APP_ID", "Ljava/lang/String;", "PARAM_CLIENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodOptionsParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<WeChatPay> {
            public final WeChatPay createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new WeChatPay(parcel.readString());
            }

            public final WeChatPay[] newArray(int i) {
                return new WeChatPay[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WeChatPay(String str) {
            super(PaymentMethod.Type.WeChatPay, (f) null);
            i.e(str, "appId");
            this.appId = str;
        }

        public static /* synthetic */ WeChatPay copy$default(WeChatPay weChatPay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weChatPay.appId;
            }
            return weChatPay.copy(str);
        }

        public final String component1() {
            return this.appId;
        }

        public final WeChatPay copy(String str) {
            i.e(str, "appId");
            return new WeChatPay(str);
        }

        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            return g.K(new Pair(PARAM_CLIENT, "android"), new Pair(PARAM_APP_ID, this.appId));
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof WeChatPay) && i.a(this.appId, ((WeChatPay) obj).appId);
            }
            return true;
        }

        public final String getAppId() {
            return this.appId;
        }

        public int hashCode() {
            String str = this.appId;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setAppId(String str) {
            i.e(str, "<set-?>");
            this.appId = str;
        }

        public String toString() {
            return a.y0(a.P0("WeChatPay(appId="), this.appId, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.appId);
        }
    }

    private PaymentMethodOptionsParams(PaymentMethod.Type type2) {
        this.type = type2;
    }

    public abstract List<Pair<String, Object>> createTypeParams$payments_core_release();

    public final PaymentMethod.Type getType() {
        return this.type;
    }

    public Map<String, Object> toParamMap() {
        List<Pair<String, Object>> createTypeParams$payments_core_release = createTypeParams$payments_core_release();
        Map o = g.o();
        for (Pair pair : createTypeParams$payments_core_release) {
            String str = (String) pair.c;
            B b = pair.d;
            Map S2 = b != null ? h.S2(new Pair(str, b)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            o = g.b0(o, S2);
        }
        if (!o.isEmpty()) {
            return h.S2(new Pair(this.type.code, o));
        }
        return g.o();
    }

    public /* synthetic */ PaymentMethodOptionsParams(PaymentMethod.Type type2, f fVar) {
        this(type2);
    }
}
