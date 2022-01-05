package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel;", "Lcom/stripe/android/model/StripeModel;", "<init>", "()V", "Card", "SepaDebit", "Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceTypeModel.kt */
public abstract class SourceTypeModel implements StripeModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001:\u0001KB\u0001\b\u0000\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0004J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010*J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b5\u00106R\u001b\u0010$\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b8\u0010\u0016R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010\u0004R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b<\u0010\u0012R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00109\u001a\u0004\b=\u0010\u0004R\u001b\u0010 \u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b?\u0010\u000eR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00109\u001a\u0004\b@\u0010\u0004R\u001b\u0010!\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010>\u001a\u0004\bA\u0010\u000eR\u001b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\bB\u0010\u0004R\u001b\u0010%\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bD\u0010\u0019R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\bE\u0010\u0004R\u0019\u0010\u001c\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bG\u0010\bR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\bH\u0010\u0004¨\u0006L"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel;", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/stripe/android/model/CardBrand;", "component3", "()Lcom/stripe/android/model/CardBrand;", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Integer;", "component8", "Lcom/stripe/android/model/CardFunding;", "component9", "()Lcom/stripe/android/model/CardFunding;", "component10", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "component11", "()Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "Lcom/stripe/android/model/TokenizationMethod;", "component12", "()Lcom/stripe/android/model/TokenizationMethod;", "addressLine1Check", "addressZipCheck", "brand", "country", "cvcCheck", "dynamicLast4", "expiryMonth", "expiryYear", "funding", "last4", "threeDSecureStatus", "tokenizationMethod", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/SourceTypeModel$Card;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "getThreeDSecureStatus", "Ljava/lang/String;", "getAddressLine1Check", "Lcom/stripe/android/model/CardFunding;", "getFunding", "getCountry", "Ljava/lang/Integer;", "getExpiryMonth", "getDynamicLast4", "getExpiryYear", "getLast4", "Lcom/stripe/android/model/TokenizationMethod;", "getTokenizationMethod", "getCvcCheck", "Lcom/stripe/android/model/CardBrand;", "getBrand", "getAddressZipCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)V", "ThreeDSecureStatus", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceTypeModel.kt */
    public static final class Card extends SourceTypeModel {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        private final String addressLine1Check;
        private final String addressZipCheck;
        private final CardBrand brand;
        private final String country;
        private final String cvcCheck;
        private final String dynamicLast4;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final CardFunding funding;
        private final String last4;
        private final ThreeDSecureStatus threeDSecureStatus;
        private final TokenizationMethod tokenizationMethod;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Card> {
            public final Card createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Card(parcel.readString(), parcel.readString(), (CardBrand) Enum.valueOf(CardBrand.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? (CardFunding) Enum.valueOf(CardFunding.class, parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0 ? (ThreeDSecureStatus) Enum.valueOf(ThreeDSecureStatus.class, parcel.readString()) : null, parcel.readInt() != 0 ? (TokenizationMethod) Enum.valueOf(TokenizationMethod.class, parcel.readString()) : null);
            }

            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Required", "Optional", "NotSupported", "Recommended", "Unknown", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceTypeModel.kt */
        public enum ThreeDSecureStatus {
            Required("required"),
            Optional("optional"),
            NotSupported("not_supported"),
            Recommended("recommended"),
            Unknown("unknown");
            
            public static final Companion Companion = null;
            /* access modifiers changed from: private */
            public final String code;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;", "", "", "code", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: SourceTypeModel.kt */
            public static final class Companion {
                private Companion() {
                }

                public final ThreeDSecureStatus fromCode(String str) {
                    ThreeDSecureStatus[] values = ThreeDSecureStatus.values();
                    for (int i = 0; i < 5; i++) {
                        ThreeDSecureStatus threeDSecureStatus = values[i];
                        if (i.a(threeDSecureStatus.code, str)) {
                            return threeDSecureStatus;
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

            private ThreeDSecureStatus(String str) {
                this.code = str;
            }

            public String toString() {
                return this.code;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Card(java.lang.String r17, java.lang.String r18, com.stripe.android.model.CardBrand r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, java.lang.Integer r24, com.stripe.android.model.CardFunding r25, java.lang.String r26, com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus r27, com.stripe.android.model.TokenizationMethod r28, int r29, m0.n.b.f r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r4 = r2
                goto L_0x000b
            L_0x0009:
                r4 = r17
            L_0x000b:
                r1 = r0 & 2
                if (r1 == 0) goto L_0x0011
                r5 = r2
                goto L_0x0013
            L_0x0011:
                r5 = r18
            L_0x0013:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0019
                r7 = r2
                goto L_0x001b
            L_0x0019:
                r7 = r20
            L_0x001b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0021
                r8 = r2
                goto L_0x0023
            L_0x0021:
                r8 = r21
            L_0x0023:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0029
                r9 = r2
                goto L_0x002b
            L_0x0029:
                r9 = r22
            L_0x002b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0031
                r10 = r2
                goto L_0x0033
            L_0x0031:
                r10 = r23
            L_0x0033:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0039
                r11 = r2
                goto L_0x003b
            L_0x0039:
                r11 = r24
            L_0x003b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0041
                r12 = r2
                goto L_0x0043
            L_0x0041:
                r12 = r25
            L_0x0043:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0049
                r13 = r2
                goto L_0x004b
            L_0x0049:
                r13 = r26
            L_0x004b:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0051
                r14 = r2
                goto L_0x0053
            L_0x0051:
                r14 = r27
            L_0x0053:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0059
                r15 = r2
                goto L_0x005b
            L_0x0059:
                r15 = r28
            L_0x005b:
                r3 = r16
                r6 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.SourceTypeModel.Card.<init>(java.lang.String, java.lang.String, com.stripe.android.model.CardBrand, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.stripe.android.model.CardFunding, java.lang.String, com.stripe.android.model.SourceTypeModel$Card$ThreeDSecureStatus, com.stripe.android.model.TokenizationMethod, int, m0.n.b.f):void");
        }

        public static /* synthetic */ Card copy$default(Card card, String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus2, TokenizationMethod tokenizationMethod2, int i, Object obj) {
            Card card2 = card;
            int i2 = i;
            return card.copy((i2 & 1) != 0 ? card2.addressLine1Check : str, (i2 & 2) != 0 ? card2.addressZipCheck : str2, (i2 & 4) != 0 ? card2.brand : cardBrand, (i2 & 8) != 0 ? card2.country : str3, (i2 & 16) != 0 ? card2.cvcCheck : str4, (i2 & 32) != 0 ? card2.dynamicLast4 : str5, (i2 & 64) != 0 ? card2.expiryMonth : num, (i2 & 128) != 0 ? card2.expiryYear : num2, (i2 & 256) != 0 ? card2.funding : cardFunding, (i2 & 512) != 0 ? card2.last4 : str6, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? card2.threeDSecureStatus : threeDSecureStatus2, (i2 & 2048) != 0 ? card2.tokenizationMethod : tokenizationMethod2);
        }

        public final String component1() {
            return this.addressLine1Check;
        }

        public final String component10() {
            return this.last4;
        }

        public final ThreeDSecureStatus component11() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod component12() {
            return this.tokenizationMethod;
        }

        public final String component2() {
            return this.addressZipCheck;
        }

        public final CardBrand component3() {
            return this.brand;
        }

        public final String component4() {
            return this.country;
        }

        public final String component5() {
            return this.cvcCheck;
        }

        public final String component6() {
            return this.dynamicLast4;
        }

        public final Integer component7() {
            return this.expiryMonth;
        }

        public final Integer component8() {
            return this.expiryYear;
        }

        public final CardFunding component9() {
            return this.funding;
        }

        public final Card copy(String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus2, TokenizationMethod tokenizationMethod2) {
            CardBrand cardBrand2 = cardBrand;
            i.e(cardBrand2, AccountRangeJsonParser.FIELD_BRAND);
            return new Card(str, str2, cardBrand2, str3, str4, str5, num, num2, cardFunding, str6, threeDSecureStatus2, tokenizationMethod2);
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
            return i.a(this.addressLine1Check, card.addressLine1Check) && i.a(this.addressZipCheck, card.addressZipCheck) && i.a(this.brand, card.brand) && i.a(this.country, card.country) && i.a(this.cvcCheck, card.cvcCheck) && i.a(this.dynamicLast4, card.dynamicLast4) && i.a(this.expiryMonth, card.expiryMonth) && i.a(this.expiryYear, card.expiryYear) && i.a(this.funding, card.funding) && i.a(this.last4, card.last4) && i.a(this.threeDSecureStatus, card.threeDSecureStatus) && i.a(this.tokenizationMethod, card.tokenizationMethod);
        }

        public final String getAddressLine1Check() {
            return this.addressLine1Check;
        }

        public final String getAddressZipCheck() {
            return this.addressZipCheck;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getCvcCheck() {
            return this.cvcCheck;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        public final CardFunding getFunding() {
            return this.funding;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final ThreeDSecureStatus getThreeDSecureStatus() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod getTokenizationMethod() {
            return this.tokenizationMethod;
        }

        public int hashCode() {
            String str = this.addressLine1Check;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.addressZipCheck;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            CardBrand cardBrand = this.brand;
            int hashCode3 = (hashCode2 + (cardBrand != null ? cardBrand.hashCode() : 0)) * 31;
            String str3 = this.country;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.cvcCheck;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.dynamicLast4;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Integer num = this.expiryMonth;
            int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.expiryYear;
            int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
            CardFunding cardFunding = this.funding;
            int hashCode9 = (hashCode8 + (cardFunding != null ? cardFunding.hashCode() : 0)) * 31;
            String str6 = this.last4;
            int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
            ThreeDSecureStatus threeDSecureStatus2 = this.threeDSecureStatus;
            int hashCode11 = (hashCode10 + (threeDSecureStatus2 != null ? threeDSecureStatus2.hashCode() : 0)) * 31;
            TokenizationMethod tokenizationMethod2 = this.tokenizationMethod;
            if (tokenizationMethod2 != null) {
                i = tokenizationMethod2.hashCode();
            }
            return hashCode11 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Card(addressLine1Check=");
            P0.append(this.addressLine1Check);
            P0.append(", addressZipCheck=");
            P0.append(this.addressZipCheck);
            P0.append(", brand=");
            P0.append(this.brand);
            P0.append(", country=");
            P0.append(this.country);
            P0.append(", cvcCheck=");
            P0.append(this.cvcCheck);
            P0.append(", dynamicLast4=");
            P0.append(this.dynamicLast4);
            P0.append(", expiryMonth=");
            P0.append(this.expiryMonth);
            P0.append(", expiryYear=");
            P0.append(this.expiryYear);
            P0.append(", funding=");
            P0.append(this.funding);
            P0.append(", last4=");
            P0.append(this.last4);
            P0.append(", threeDSecureStatus=");
            P0.append(this.threeDSecureStatus);
            P0.append(", tokenizationMethod=");
            P0.append(this.tokenizationMethod);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.addressLine1Check);
            parcel.writeString(this.addressZipCheck);
            parcel.writeString(this.brand.name());
            parcel.writeString(this.country);
            parcel.writeString(this.cvcCheck);
            parcel.writeString(this.dynamicLast4);
            Integer num = this.expiryMonth;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            Integer num2 = this.expiryYear;
            if (num2 != null) {
                a.i(parcel, 1, num2);
            } else {
                parcel.writeInt(0);
            }
            CardFunding cardFunding = this.funding;
            if (cardFunding != null) {
                parcel.writeInt(1);
                parcel.writeString(cardFunding.name());
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.last4);
            ThreeDSecureStatus threeDSecureStatus2 = this.threeDSecureStatus;
            if (threeDSecureStatus2 != null) {
                parcel.writeInt(1);
                parcel.writeString(threeDSecureStatus2.name());
            } else {
                parcel.writeInt(0);
            }
            TokenizationMethod tokenizationMethod2 = this.tokenizationMethod;
            if (tokenizationMethod2 != null) {
                parcel.writeInt(1);
                parcel.writeString(tokenizationMethod2.name());
                return;
            }
            parcel.writeInt(0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus2, TokenizationMethod tokenizationMethod2) {
            super((f) null);
            i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
            this.addressLine1Check = str;
            this.addressZipCheck = str2;
            this.brand = cardBrand;
            this.country = str3;
            this.cvcCheck = str4;
            this.dynamicLast4 = str5;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.funding = cardFunding;
            this.last4 = str6;
            this.threeDSecureStatus = threeDSecureStatus2;
            this.tokenizationMethod = tokenizationMethod2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BO\b\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004Jd\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010\u0004R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b&\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b'\u0010\u0004R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b(\u0010\u0004R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b)\u0010\u0004R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b*\u0010\u0004R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b+\u0010\u0004¨\u0006."}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "Lcom/stripe/android/model/SourceTypeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "bankCode", "branchCode", "country", "fingerPrint", "last4", "mandateReference", "mandateUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountry", "getLast4", "getMandateUrl", "getFingerPrint", "getMandateReference", "getBankCode", "getBranchCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceTypeModel.kt */
    public static final class SepaDebit extends SourceTypeModel {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        private final String bankCode;
        private final String branchCode;
        private final String country;
        private final String fingerPrint;
        private final String last4;
        private final String mandateReference;
        private final String mandateUrl;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<SepaDebit> {
            public final SepaDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super((f) null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerPrint = str4;
            this.last4 = str5;
            this.mandateReference = str6;
            this.mandateUrl = str7;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = sepaDebit.country;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = sepaDebit.fingerPrint;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = sepaDebit.mandateReference;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = sepaDebit.mandateUrl;
            }
            return sepaDebit.copy(str, str8, str9, str10, str11, str12, str7);
        }

        public final String component1() {
            return this.bankCode;
        }

        public final String component2() {
            return this.branchCode;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.fingerPrint;
        }

        public final String component5() {
            return this.last4;
        }

        public final String component6() {
            return this.mandateReference;
        }

        public final String component7() {
            return this.mandateUrl;
        }

        public final SepaDebit copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            return new SepaDebit(str, str2, str3, str4, str5, str6, str7);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) obj;
            return i.a(this.bankCode, sepaDebit.bankCode) && i.a(this.branchCode, sepaDebit.branchCode) && i.a(this.country, sepaDebit.country) && i.a(this.fingerPrint, sepaDebit.fingerPrint) && i.a(this.last4, sepaDebit.last4) && i.a(this.mandateReference, sepaDebit.mandateReference) && i.a(this.mandateUrl, sepaDebit.mandateUrl);
        }

        public final String getBankCode() {
            return this.bankCode;
        }

        public final String getBranchCode() {
            return this.branchCode;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getFingerPrint() {
            return this.fingerPrint;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getMandateReference() {
            return this.mandateReference;
        }

        public final String getMandateUrl() {
            return this.mandateUrl;
        }

        public int hashCode() {
            String str = this.bankCode;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.fingerPrint;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.last4;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.mandateReference;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.mandateUrl;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("SepaDebit(bankCode=");
            P0.append(this.bankCode);
            P0.append(", branchCode=");
            P0.append(this.branchCode);
            P0.append(", country=");
            P0.append(this.country);
            P0.append(", fingerPrint=");
            P0.append(this.fingerPrint);
            P0.append(", last4=");
            P0.append(this.last4);
            P0.append(", mandateReference=");
            P0.append(this.mandateReference);
            P0.append(", mandateUrl=");
            return a.y0(P0, this.mandateUrl, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bankCode);
            parcel.writeString(this.branchCode);
            parcel.writeString(this.country);
            parcel.writeString(this.fingerPrint);
            parcel.writeString(this.last4);
            parcel.writeString(this.mandateReference);
            parcel.writeString(this.mandateUrl);
        }
    }

    private SourceTypeModel() {
    }

    public /* synthetic */ SourceTypeModel(f fVar) {
        this();
    }
}
