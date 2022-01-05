package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Token;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\b\b\u0018\u0000 ,2\u00020\u0001:\u0002,-BE\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\u0004JR\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\"\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180%8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010$¨\u0006."}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams;", "Lcom/stripe/android/model/TokenParams;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "component4", "()Lcom/stripe/android/model/BankAccountTokenParams$Type;", "component5", "component6", "country", "currency", "accountNumber", "accountHolderType", "accountHolderName", "routingNumber", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccountTokenParams$Type;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/BankAccountTokenParams;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "", "getTypeDataParams", "()Ljava/util/Map;", "typeDataParams", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccountTokenParams$Type;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BankAccountTokenParams.kt */
public final class BankAccountTokenParams extends TokenParams {
    public static final Parcelable.Creator<BankAccountTokenParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @Deprecated
    private static final String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    @Deprecated
    private static final String PARAM_ACCOUNT_NUMBER = "account_number";
    @Deprecated
    private static final String PARAM_COUNTRY = "country";
    @Deprecated
    private static final String PARAM_CURRENCY = "currency";
    @Deprecated
    private static final String PARAM_ROUTING_NUMBER = "routing_number";
    private final String accountHolderName;
    private final Type accountHolderType;
    private final String accountNumber;
    private final String country;
    private final String currency;
    private final String routingNumber;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Companion;", "", "", "PARAM_ACCOUNT_HOLDER_NAME", "Ljava/lang/String;", "PARAM_ACCOUNT_HOLDER_TYPE", "PARAM_ACCOUNT_NUMBER", "PARAM_COUNTRY", "PARAM_CURRENCY", "PARAM_ROUTING_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BankAccountTokenParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<BankAccountTokenParams> {
        public final BankAccountTokenParams createFromParcel(Parcel parcel) {
            Type type;
            i.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                type = (Type) Enum.valueOf(Type.class, parcel.readString());
            } else {
                type = null;
            }
            return new BankAccountTokenParams(readString, readString2, readString3, type, parcel.readString(), parcel.readString());
        }

        public final BankAccountTokenParams[] newArray(int i) {
            return new BankAccountTokenParams[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Individual", "Company", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BankAccountTokenParams.kt */
    public enum Type {
        Individual("individual"),
        Company("company");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;", "", "", "code", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/BankAccountTokenParams$Type;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: BankAccountTokenParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Type fromCode$payments_core_release(String str) {
                Type[] values = Type.values();
                for (int i = 0; i < 2; i++) {
                    Type type = values[i];
                    if (i.a(type.getCode$payments_core_release(), str)) {
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

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    public BankAccountTokenParams(String str, String str2, String str3) {
        this(str, str2, str3, (Type) null, (String) null, (String) null, 56, (f) null);
    }

    public BankAccountTokenParams(String str, String str2, String str3, Type type) {
        this(str, str2, str3, type, (String) null, (String) null, 48, (f) null);
    }

    public BankAccountTokenParams(String str, String str2, String str3, Type type, String str4) {
        this(str, str2, str3, type, str4, (String) null, 32, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankAccountTokenParams(String str, String str2, String str3, Type type, String str4, String str5, int i, f fVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    private final String component1() {
        return this.country;
    }

    private final String component2() {
        return this.currency;
    }

    private final String component3() {
        return this.accountNumber;
    }

    private final Type component4() {
        return this.accountHolderType;
    }

    private final String component5() {
        return this.accountHolderName;
    }

    private final String component6() {
        return this.routingNumber;
    }

    public static /* synthetic */ BankAccountTokenParams copy$default(BankAccountTokenParams bankAccountTokenParams, String str, String str2, String str3, Type type, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankAccountTokenParams.country;
        }
        if ((i & 2) != 0) {
            str2 = bankAccountTokenParams.currency;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bankAccountTokenParams.accountNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            type = bankAccountTokenParams.accountHolderType;
        }
        Type type2 = type;
        if ((i & 16) != 0) {
            str4 = bankAccountTokenParams.accountHolderName;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = bankAccountTokenParams.routingNumber;
        }
        return bankAccountTokenParams.copy(str, str6, str7, type2, str8, str5);
    }

    public final BankAccountTokenParams copy(String str, String str2, String str3, Type type, String str4, String str5) {
        i.e(str, "country");
        i.e(str2, PARAM_CURRENCY);
        i.e(str3, "accountNumber");
        return new BankAccountTokenParams(str, str2, str3, type, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccountTokenParams)) {
            return false;
        }
        BankAccountTokenParams bankAccountTokenParams = (BankAccountTokenParams) obj;
        return i.a(this.country, bankAccountTokenParams.country) && i.a(this.currency, bankAccountTokenParams.currency) && i.a(this.accountNumber, bankAccountTokenParams.accountNumber) && i.a(this.accountHolderType, bankAccountTokenParams.accountHolderType) && i.a(this.accountHolderName, bankAccountTokenParams.accountHolderName) && i.a(this.routingNumber, bankAccountTokenParams.routingNumber);
    }

    public Map<String, Object> getTypeDataParams() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("country", this.country);
        pairArr[1] = new Pair(PARAM_CURRENCY, this.currency);
        pairArr[2] = new Pair(PARAM_ACCOUNT_HOLDER_NAME, this.accountHolderName);
        Type type = this.accountHolderType;
        pairArr[3] = new Pair(PARAM_ACCOUNT_HOLDER_TYPE, type != null ? type.getCode$payments_core_release() : null);
        pairArr[4] = new Pair(PARAM_ROUTING_NUMBER, this.routingNumber);
        pairArr[5] = new Pair(PARAM_ACCOUNT_NUMBER, this.accountNumber);
        List<Pair> K = g.K(pairArr);
        Map<String, Object> o = g.o();
        for (Pair pair : K) {
            String str = (String) pair.c;
            String str2 = (String) pair.d;
            Map S2 = str2 != null ? h.S2(new Pair(str, str2)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            o = g.b0(o, S2);
        }
        return o;
    }

    public int hashCode() {
        String str = this.country;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.currency;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.accountNumber;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Type type = this.accountHolderType;
        int hashCode4 = (hashCode3 + (type != null ? type.hashCode() : 0)) * 31;
        String str4 = this.accountHolderName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.routingNumber;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("BankAccountTokenParams(country=");
        P0.append(this.country);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", accountNumber=");
        P0.append(this.accountNumber);
        P0.append(", accountHolderType=");
        P0.append(this.accountHolderType);
        P0.append(", accountHolderName=");
        P0.append(this.accountHolderName);
        P0.append(", routingNumber=");
        return a.y0(P0, this.routingNumber, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeString(this.accountNumber);
        Type type = this.accountHolderType;
        if (type != null) {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.accountHolderName);
        parcel.writeString(this.routingNumber);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String str, String str2, String str3, Type type, String str4, String str5) {
        super(Token.Type.BankAccount, (Set) null, 2, (f) null);
        i.e(str, "country");
        i.e(str2, PARAM_CURRENCY);
        i.e(str3, "accountNumber");
        this.country = str;
        this.currency = str2;
        this.accountNumber = str3;
        this.accountHolderType = type;
        this.accountHolderName = str4;
        this.routingNumber = str5;
    }
}
