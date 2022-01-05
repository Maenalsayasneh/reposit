package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002>?B\u0001\b\u0000\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b<\u0010=J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0005J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0005J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u0005J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u0005J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0005J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0005J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0005J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020 HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0004¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b0\u0010\u0005R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u0010\u0012R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b3\u0010\u0005R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b4\u0010\u0005R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b5\u0010\u0005R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b6\u0010\u0005R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b7\u0010\u0005R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b8\u0010\u0005R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b9\u0010\u0005R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010\t¨\u0006@"}, d2 = {"Lcom/stripe/android/model/BankAccount;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/stripe/android/model/BankAccount$Type;", "component3", "()Lcom/stripe/android/model/BankAccount$Type;", "component4", "component5", "component6", "component7", "component8", "component9", "Lcom/stripe/android/model/BankAccount$Status;", "component10", "()Lcom/stripe/android/model/BankAccount$Status;", "id", "accountHolderName", "accountHolderType", "bankName", "countryCode", "currency", "fingerprint", "last4", "routingNumber", "status", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)Lcom/stripe/android/model/BankAccount;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountryCode", "Lcom/stripe/android/model/BankAccount$Status;", "getStatus", "getCurrency", "getBankName", "getFingerprint", "getRoutingNumber", "getLast4", "getId", "getAccountHolderName", "Lcom/stripe/android/model/BankAccount$Type;", "getAccountHolderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)V", "Status", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BankAccount.kt */
public final class BankAccount implements StripeModel, StripePaymentSource {
    public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();
    private final String accountHolderName;
    private final Type accountHolderType;
    private final String bankName;
    private final String countryCode;
    private final String currency;
    private final String fingerprint;
    private final String id;
    private final String last4;
    private final String routingNumber;
    private final Status status;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<BankAccount> {
        public final BankAccount createFromParcel(Parcel parcel) {
            Type type;
            Status status;
            i.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                type = (Type) Enum.valueOf(Type.class, parcel.readString());
            } else {
                type = null;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                status = (Status) Enum.valueOf(Status.class, parcel.readString());
            } else {
                status = null;
            }
            return new BankAccount(readString, readString2, type, readString3, readString4, readString5, readString6, readString7, readString8, status);
        }

        public final BankAccount[] newArray(int i) {
            return new BankAccount[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/BankAccount$Status;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode$payments_core_release", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "New", "Validated", "Verified", "VerificationFailed", "Errored", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BankAccount.kt */
    public enum Status {
        New("new"),
        Validated("validated"),
        Verified("verified"),
        VerificationFailed("verification_failed"),
        Errored("errored");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/BankAccount$Status$Companion;", "", "", "code", "Lcom/stripe/android/model/BankAccount$Status;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/BankAccount$Status;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: BankAccount.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Status fromCode$payments_core_release(String str) {
                Status[] values = Status.values();
                for (int i = 0; i < 5; i++) {
                    Status status = values[i];
                    if (i.a(status.getCode$payments_core_release(), str)) {
                        return status;
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

        private Status(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        public String toString() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/BankAccount$Type;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "getCode$payments_core_release", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Company", "Individual", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BankAccount.kt */
    public enum Type {
        Company("company"),
        Individual("individual");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/BankAccount$Type$Companion;", "", "", "code", "Lcom/stripe/android/model/BankAccount$Type;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/BankAccount$Type;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: BankAccount.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Type fromCode$payments_core_release(String str) {
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

        public String toString() {
            return this.code;
        }
    }

    public BankAccount() {
        this((String) null, (String) null, (Type) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Status) null, 1023, (f) null);
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status2) {
        this.id = str;
        this.accountHolderName = str2;
        this.accountHolderType = type;
        this.bankName = str3;
        this.countryCode = str4;
        this.currency = str5;
        this.fingerprint = str6;
        this.last4 = str7;
        this.routingNumber = str8;
        this.status = status2;
    }

    public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status2, int i, Object obj) {
        BankAccount bankAccount2 = bankAccount;
        int i2 = i;
        return bankAccount.copy((i2 & 1) != 0 ? bankAccount.getId() : str, (i2 & 2) != 0 ? bankAccount2.accountHolderName : str2, (i2 & 4) != 0 ? bankAccount2.accountHolderType : type, (i2 & 8) != 0 ? bankAccount2.bankName : str3, (i2 & 16) != 0 ? bankAccount2.countryCode : str4, (i2 & 32) != 0 ? bankAccount2.currency : str5, (i2 & 64) != 0 ? bankAccount2.fingerprint : str6, (i2 & 128) != 0 ? bankAccount2.last4 : str7, (i2 & 256) != 0 ? bankAccount2.routingNumber : str8, (i2 & 512) != 0 ? bankAccount2.status : status2);
    }

    public final String component1() {
        return getId();
    }

    public final Status component10() {
        return this.status;
    }

    public final String component2() {
        return this.accountHolderName;
    }

    public final Type component3() {
        return this.accountHolderType;
    }

    public final String component4() {
        return this.bankName;
    }

    public final String component5() {
        return this.countryCode;
    }

    public final String component6() {
        return this.currency;
    }

    public final String component7() {
        return this.fingerprint;
    }

    public final String component8() {
        return this.last4;
    }

    public final String component9() {
        return this.routingNumber;
    }

    public final BankAccount copy(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status2) {
        return new BankAccount(str, str2, type, str3, str4, str5, str6, str7, str8, status2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        return i.a(getId(), bankAccount.getId()) && i.a(this.accountHolderName, bankAccount.accountHolderName) && i.a(this.accountHolderType, bankAccount.accountHolderType) && i.a(this.bankName, bankAccount.bankName) && i.a(this.countryCode, bankAccount.countryCode) && i.a(this.currency, bankAccount.currency) && i.a(this.fingerprint, bankAccount.fingerprint) && i.a(this.last4, bankAccount.last4) && i.a(this.routingNumber, bankAccount.routingNumber) && i.a(this.status, bankAccount.status);
    }

    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    public final Type getAccountHolderType() {
        return this.accountHolderType;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public String getId() {
        return this.id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 0;
        int hashCode = (id2 != null ? id2.hashCode() : 0) * 31;
        String str = this.accountHolderName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Type type = this.accountHolderType;
        int hashCode3 = (hashCode2 + (type != null ? type.hashCode() : 0)) * 31;
        String str2 = this.bankName;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.countryCode;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.currency;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.fingerprint;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.last4;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.routingNumber;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Status status2 = this.status;
        if (status2 != null) {
            i = status2.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("BankAccount(id=");
        P0.append(getId());
        P0.append(", accountHolderName=");
        P0.append(this.accountHolderName);
        P0.append(", accountHolderType=");
        P0.append(this.accountHolderType);
        P0.append(", bankName=");
        P0.append(this.bankName);
        P0.append(", countryCode=");
        P0.append(this.countryCode);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", fingerprint=");
        P0.append(this.fingerprint);
        P0.append(", last4=");
        P0.append(this.last4);
        P0.append(", routingNumber=");
        P0.append(this.routingNumber);
        P0.append(", status=");
        P0.append(this.status);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.accountHolderName);
        Type type = this.accountHolderType;
        if (type != null) {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.bankName);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.currency);
        parcel.writeString(this.fingerprint);
        parcel.writeString(this.last4);
        parcel.writeString(this.routingNumber);
        Status status2 = this.status;
        if (status2 != null) {
            parcel.writeInt(1);
            parcel.writeString(status2.name());
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BankAccount(java.lang.String r12, java.lang.String r13, com.stripe.android.model.BankAccount.Type r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.stripe.android.model.BankAccount.Status r21, int r22, m0.n.b.f r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.BankAccount.<init>(java.lang.String, java.lang.String, com.stripe.android.model.BankAccount$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.BankAccount$Status, int, m0.n.b.f):void");
    }
}
