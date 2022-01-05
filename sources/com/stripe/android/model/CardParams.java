package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.CardUtils;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import i0.j.f.p.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u0001\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0004\bU\u0010VBi\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0004\bU\u0010WJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\nJ\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\nJ\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010\u000eJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b/\u0010\u000eJ \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b4\u00105R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u00106\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u00109R\u0019\u0010\u001c\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010<\u001a\u0004\b=\u0010\n\"\u0004\b>\u0010?R$\u0010#\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\bA\u0010\u0017\"\u0004\bB\u0010CR$\u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010<\u001a\u0004\bD\u0010\n\"\u0004\bE\u0010?R\"\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0\u00198V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010HR\"\u0010\u001f\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010I\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u0010LR\"\u0010 \u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010I\u001a\u0004\bM\u0010\u000e\"\u0004\bN\u0010LR$\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\bO\u0010\n\"\u0004\bP\u0010?R\"\u0010\u001e\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010<\u001a\u0004\bQ\u0010\n\"\u0004\bR\u0010?R\u0013\u0010T\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bS\u0010\n¨\u0006Y"}, d2 = {"Lcom/stripe/android/model/CardParams;", "Lcom/stripe/android/model/TokenParams;", "", "", "component2", "()Ljava/util/Set;", "Lcom/stripe/android/model/CardBrand;", "component1", "()Lcom/stripe/android/model/CardBrand;", "component3$payments_core_release", "()Ljava/lang/String;", "component3", "", "component4$payments_core_release", "()I", "component4", "component5$payments_core_release", "component5", "component6$payments_core_release", "component6", "component7", "Lcom/stripe/android/model/Address;", "component8", "()Lcom/stripe/android/model/Address;", "component9", "", "component10", "()Ljava/util/Map;", "brand", "loggingTokens", "number", "expMonth", "expYear", "cvc", "name", "address", "currency", "metadata", "copy", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)Lcom/stripe/android/model/CardParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getMetadata", "setMetadata", "(Ljava/util/Map;)V", "Lcom/stripe/android/model/CardBrand;", "getBrand", "Ljava/lang/String;", "getCvc$payments_core_release", "setCvc$payments_core_release", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/Address;", "getAddress", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getCurrency", "setCurrency", "getTypeDataParams", "typeDataParams", "Ljava/util/Set;", "I", "getExpMonth$payments_core_release", "setExpMonth$payments_core_release", "(I)V", "getExpYear$payments_core_release", "setExpYear$payments_core_release", "getName", "setName", "getNumber$payments_core_release", "setNumber$payments_core_release", "getLast4", "last4", "<init>", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardParams.kt */
public final class CardParams extends TokenParams {
    public static final Parcelable.Creator<CardParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_ADDRESS_CITY = "address_city";
    @Deprecated
    private static final String PARAM_ADDRESS_COUNTRY = "address_country";
    @Deprecated
    private static final String PARAM_ADDRESS_LINE1 = "address_line1";
    @Deprecated
    private static final String PARAM_ADDRESS_LINE2 = "address_line2";
    @Deprecated
    private static final String PARAM_ADDRESS_STATE = "address_state";
    @Deprecated
    private static final String PARAM_ADDRESS_ZIP = "address_zip";
    @Deprecated
    private static final String PARAM_CURRENCY = "currency";
    @Deprecated
    private static final String PARAM_CVC = "cvc";
    @Deprecated
    private static final String PARAM_EXP_MONTH = "exp_month";
    @Deprecated
    private static final String PARAM_EXP_YEAR = "exp_year";
    @Deprecated
    private static final String PARAM_METADATA = "metadata";
    @Deprecated
    private static final String PARAM_NAME = "name";
    @Deprecated
    private static final String PARAM_NUMBER = "number";
    private Address address;
    private final CardBrand brand;
    private String currency;
    private String cvc;
    private int expMonth;
    private int expYear;
    private final Set<String> loggingTokens;
    private Map<String, String> metadata;
    private String name;
    private String number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/CardParams$Companion;", "", "", "PARAM_ADDRESS_CITY", "Ljava/lang/String;", "PARAM_ADDRESS_COUNTRY", "PARAM_ADDRESS_LINE1", "PARAM_ADDRESS_LINE2", "PARAM_ADDRESS_STATE", "PARAM_ADDRESS_ZIP", "PARAM_CURRENCY", "PARAM_CVC", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_METADATA", "PARAM_NAME", "PARAM_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<CardParams> {
        public final CardParams createFromParcel(Parcel parcel) {
            String readString;
            i.e(parcel, "in");
            CardBrand cardBrand = (CardBrand) Enum.valueOf(CardBrand.class, parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            while (true) {
                readString = parcel.readString();
                if (readInt == 0) {
                    break;
                }
                linkedHashSet.add(readString);
                readInt--;
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Address createFromParcel = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt4);
                while (readInt4 != 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    readInt4--;
                }
            }
            return new CardParams(cardBrand, (Set<String>) linkedHashSet, readString, readInt2, readInt3, readString2, readString3, createFromParcel, readString4, (Map<String, String>) linkedHashMap);
        }

        public final CardParams[] newArray(int i) {
            return new CardParams[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardParams(com.stripe.android.model.CardBrand r14, java.util.Set r15, java.lang.String r16, int r17, int r18, java.lang.String r19, java.lang.String r20, com.stripe.android.model.Address r21, java.lang.String r22, java.util.Map r23, int r24, m0.n.b.f r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.c
            r4 = r1
            goto L_0x000b
        L_0x000a:
            r4 = r15
        L_0x000b:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r2
            goto L_0x0014
        L_0x0012:
            r8 = r19
        L_0x0014:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r20
        L_0x001c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0022
            r10 = r2
            goto L_0x0024
        L_0x0022:
            r10 = r21
        L_0x0024:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002a
            r11 = r2
            goto L_0x002c
        L_0x002a:
            r11 = r22
        L_0x002c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0032
            r12 = r2
            goto L_0x0034
        L_0x0032:
            r12 = r23
        L_0x0034:
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r2.<init>((com.stripe.android.model.CardBrand) r3, (java.util.Set<java.lang.String>) r4, (java.lang.String) r5, (int) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (com.stripe.android.model.Address) r10, (java.lang.String) r11, (java.util.Map<java.lang.String, java.lang.String>) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardParams.<init>(com.stripe.android.model.CardBrand, java.util.Set, java.lang.String, int, int, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.util.Map, int, m0.n.b.f):void");
    }

    public CardParams(String str, int i, int i2) {
        this(str, i, i2, (String) null, (String) null, (Address) null, (String) null, (Map) null, 248, (f) null);
    }

    public CardParams(String str, int i, int i2, String str2) {
        this(str, i, i2, str2, (String) null, (Address) null, (String) null, (Map) null, 240, (f) null);
    }

    public CardParams(String str, int i, int i2, String str2, String str3) {
        this(str, i, i2, str2, str3, (Address) null, (String) null, (Map) null, 224, (f) null);
    }

    public CardParams(String str, int i, int i2, String str2, String str3, Address address2) {
        this(str, i, i2, str2, str3, address2, (String) null, (Map) null, 192, (f) null);
    }

    public CardParams(String str, int i, int i2, String str2, String str3, Address address2, String str4) {
        this(str, i, i2, str2, str3, address2, str4, (Map) null, 128, (f) null);
    }

    private final Set<String> component2() {
        return this.loggingTokens;
    }

    public static /* synthetic */ CardParams copy$default(CardParams cardParams, CardBrand cardBrand, Set set, String str, int i, int i2, String str2, String str3, Address address2, String str4, Map map, int i3, Object obj) {
        CardParams cardParams2 = cardParams;
        int i4 = i3;
        return cardParams.copy((i4 & 1) != 0 ? cardParams2.brand : cardBrand, (i4 & 2) != 0 ? cardParams2.loggingTokens : set, (i4 & 4) != 0 ? cardParams2.number : str, (i4 & 8) != 0 ? cardParams2.expMonth : i, (i4 & 16) != 0 ? cardParams2.expYear : i2, (i4 & 32) != 0 ? cardParams2.cvc : str2, (i4 & 64) != 0 ? cardParams2.name : str3, (i4 & 128) != 0 ? cardParams2.address : address2, (i4 & 256) != 0 ? cardParams2.currency : str4, (i4 & 512) != 0 ? cardParams2.metadata : map);
    }

    public final CardBrand component1() {
        return this.brand;
    }

    public final Map<String, String> component10() {
        return this.metadata;
    }

    public final String component3$payments_core_release() {
        return this.number;
    }

    public final int component4$payments_core_release() {
        return this.expMonth;
    }

    public final int component5$payments_core_release() {
        return this.expYear;
    }

    public final String component6$payments_core_release() {
        return this.cvc;
    }

    public final String component7() {
        return this.name;
    }

    public final Address component8() {
        return this.address;
    }

    public final String component9() {
        return this.currency;
    }

    public final CardParams copy(CardBrand cardBrand, Set<String> set, String str, int i, int i2, String str2, String str3, Address address2, String str4, Map<String, String> map) {
        i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
        i.e(set, "loggingTokens");
        i.e(str, PARAM_NUMBER);
        return new CardParams(cardBrand, set, str, i, i2, str2, str3, address2, str4, map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardParams)) {
            return false;
        }
        CardParams cardParams = (CardParams) obj;
        return i.a(this.brand, cardParams.brand) && i.a(this.loggingTokens, cardParams.loggingTokens) && i.a(this.number, cardParams.number) && this.expMonth == cardParams.expMonth && this.expYear == cardParams.expYear && i.a(this.cvc, cardParams.cvc) && i.a(this.name, cardParams.name) && i.a(this.address, cardParams.address) && i.a(this.currency, cardParams.currency) && i.a(this.metadata, cardParams.metadata);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCvc$payments_core_release() {
        return this.cvc;
    }

    public final int getExpMonth$payments_core_release() {
        return this.expMonth;
    }

    public final int getExpYear$payments_core_release() {
        return this.expYear;
    }

    public final String getLast4() {
        return a.U3(this.number, 4);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber$payments_core_release() {
        return this.number;
    }

    public Map<String, Object> getTypeDataParams() {
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair(PARAM_NUMBER, this.number);
        pairArr[1] = new Pair(PARAM_EXP_MONTH, Integer.valueOf(this.expMonth));
        pairArr[2] = new Pair(PARAM_EXP_YEAR, Integer.valueOf(this.expYear));
        pairArr[3] = new Pair(PARAM_CVC, this.cvc);
        pairArr[4] = new Pair("name", this.name);
        pairArr[5] = new Pair(PARAM_CURRENCY, this.currency);
        Address address2 = this.address;
        pairArr[6] = new Pair(PARAM_ADDRESS_LINE1, address2 != null ? address2.getLine1() : null);
        Address address3 = this.address;
        pairArr[7] = new Pair(PARAM_ADDRESS_LINE2, address3 != null ? address3.getLine2() : null);
        Address address4 = this.address;
        pairArr[8] = new Pair(PARAM_ADDRESS_CITY, address4 != null ? address4.getCity() : null);
        Address address5 = this.address;
        pairArr[9] = new Pair(PARAM_ADDRESS_STATE, address5 != null ? address5.getState() : null);
        Address address6 = this.address;
        pairArr[10] = new Pair(PARAM_ADDRESS_ZIP, address6 != null ? address6.getPostalCode() : null);
        Address address7 = this.address;
        pairArr[11] = new Pair(PARAM_ADDRESS_COUNTRY, address7 != null ? address7.getCountry() : null);
        pairArr[12] = new Pair(PARAM_METADATA, this.metadata);
        List<Pair> K = g.K(pairArr);
        Map<String, Object> o = g.o();
        for (Pair pair : K) {
            String str = (String) pair.c;
            B b = pair.d;
            Map S2 = b != null ? h.S2(new Pair(str, b)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            o = g.b0(o, S2);
        }
        return o;
    }

    public int hashCode() {
        CardBrand cardBrand = this.brand;
        int i = 0;
        int hashCode = (cardBrand != null ? cardBrand.hashCode() : 0) * 31;
        Set<String> set = this.loggingTokens;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        String str = this.number;
        int M = i0.d.a.a.a.M(this.expYear, i0.d.a.a.a.M(this.expMonth, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
        String str2 = this.cvc;
        int hashCode3 = (M + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Address address2 = this.address;
        int hashCode5 = (hashCode4 + (address2 != null ? address2.hashCode() : 0)) * 31;
        String str4 = this.currency;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setAddress(Address address2) {
        this.address = address2;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setCvc$payments_core_release(String str) {
        this.cvc = str;
    }

    public final void setExpMonth$payments_core_release(int i) {
        this.expMonth = i;
    }

    public final void setExpYear$payments_core_release(int i) {
        this.expYear = i;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNumber$payments_core_release(String str) {
        i.e(str, "<set-?>");
        this.number = str;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CardParams(brand=");
        P0.append(this.brand);
        P0.append(", loggingTokens=");
        P0.append(this.loggingTokens);
        P0.append(", number=");
        P0.append(this.number);
        P0.append(", expMonth=");
        P0.append(this.expMonth);
        P0.append(", expYear=");
        P0.append(this.expYear);
        P0.append(", cvc=");
        P0.append(this.cvc);
        P0.append(", name=");
        P0.append(this.name);
        P0.append(", address=");
        P0.append(this.address);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", metadata=");
        P0.append(this.metadata);
        P0.append(")");
        return P0.toString();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.Map$Entry, java.lang.Object] */
    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.brand.name());
        Set<String> set = this.loggingTokens;
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
        parcel.writeString(this.number);
        parcel.writeInt(this.expMonth);
        parcel.writeInt(this.expYear);
        parcel.writeString(this.cvc);
        parcel.writeString(this.name);
        Address address2 = this.address;
        if (address2 != null) {
            parcel.writeInt(1);
            address2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.currency);
        Map<String, String> map = this.metadata;
        if (map != null) {
            Iterator l1 = i0.d.a.a.a.l1(parcel, 1, map);
            while (l1.hasNext()) {
                ? next = l1.next();
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardParams(CardBrand cardBrand, Set<String> set, String str, int i, int i2, String str2, String str3, Address address2, String str4, Map<String, String> map) {
        super(Token.Type.Card, set);
        i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
        i.e(set, "loggingTokens");
        i.e(str, PARAM_NUMBER);
        this.brand = cardBrand;
        this.loggingTokens = set;
        this.number = str;
        this.expMonth = i;
        this.expYear = i2;
        this.cvc = str2;
        this.name = str3;
        this.address = address2;
        this.currency = str4;
        this.metadata = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardParams(java.lang.String r13, int r14, int r15, java.lang.String r16, java.lang.String r17, com.stripe.android.model.Address r18, java.lang.String r19, java.util.Map r20, int r21, m0.n.b.f r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r17
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r19
        L_0x0023:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r20
        L_0x002b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardParams.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.util.Map, int, m0.n.b.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardParams(String str, int i, int i2, String str2, String str3, Address address2, String str4, Map<String, String> map) {
        this(CardUtils.getPossibleCardBrand(str), (Set<String>) EmptySet.c, str, i, i2, str2, str3, address2, str4, map);
        String str5 = str;
        i.e(str, PARAM_NUMBER);
    }
}
