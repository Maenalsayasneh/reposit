package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.stripe.android.model.parsers.TokenJsonParser;
import i0.d.a.a.a;
import java.util.Date;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002=>BI\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0004\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0005J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0019\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u0010\u000eR\u0019\u0010\u0017\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b1\u0010\bR\u0019\u0010\u001a\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b2\u0010\u000eR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b4\u0010\u0012R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u0010\u0005R\u0019\u0010\u0018\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010\u000b¨\u0006?"}, d2 = {"Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/model/Token$Type;", "component2", "()Lcom/stripe/android/model/Token$Type;", "Ljava/util/Date;", "component3", "()Ljava/util/Date;", "", "component4", "()Z", "component5", "Lcom/stripe/android/model/BankAccount;", "component6", "()Lcom/stripe/android/model/BankAccount;", "Lcom/stripe/android/model/Card;", "component7", "()Lcom/stripe/android/model/Card;", "id", "type", "created", "livemode", "used", "bankAccount", "card", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Ljava/util/Date;ZZLcom/stripe/android/model/BankAccount;Lcom/stripe/android/model/Card;)Lcom/stripe/android/model/Token;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getLivemode", "Lcom/stripe/android/model/Token$Type;", "getType", "getUsed", "Lcom/stripe/android/model/BankAccount;", "getBankAccount", "Lcom/stripe/android/model/Card;", "getCard", "Ljava/lang/String;", "getId", "Ljava/util/Date;", "getCreated", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Ljava/util/Date;ZZLcom/stripe/android/model/BankAccount;Lcom/stripe/android/model/Card;)V", "Companion", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Token.kt */
public final class Token implements StripeModel, StripePaymentSource {
    public static final Parcelable.Creator<Token> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final BankAccount bankAccount;
    private final Card card;
    private final Date created;
    private final String id;
    private final boolean livemode;
    private final Type type;
    private final boolean used;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Token$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/Token;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Token;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Token.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Token fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new TokenJsonParser().parse(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Token> {
        public final Token createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            String readString = parcel.readString();
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            Date date = (Date) parcel.readSerializable();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new Token(readString, type, date, z2, z, parcel.readInt() != 0 ? BankAccount.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel) : null);
        }

        public final Token[] newArray(int i) {
            return new Token[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/Token$Type;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Card", "BankAccount", "Pii", "Account", "CvcUpdate", "Person", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Token.kt */
    public enum Type {
        Card("card"),
        BankAccount("bank_account"),
        Pii("pii"),
        Account("account"),
        CvcUpdate("cvc_update"),
        Person(NotificationCompat.MessagingStyle.Message.KEY_PERSON);
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Token$Type$Companion;", "", "", "code", "Lcom/stripe/android/model/Token$Type;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/Token$Type;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Token.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Type fromCode(String str) {
                Type[] values = Type.values();
                for (int i = 0; i < 6; i++) {
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

    public Token(String str, Type type2, Date date, boolean z, boolean z2, BankAccount bankAccount2, Card card2) {
        i.e(str, "id");
        i.e(type2, "type");
        i.e(date, "created");
        this.id = str;
        this.type = type2;
        this.created = date;
        this.livemode = z;
        this.used = z2;
        this.bankAccount = bankAccount2;
        this.card = card2;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, Type type2, Date date, boolean z, boolean z2, BankAccount bankAccount2, Card card2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.getId();
        }
        if ((i & 2) != 0) {
            type2 = token.type;
        }
        Type type3 = type2;
        if ((i & 4) != 0) {
            date = token.created;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            z = token.livemode;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = token.used;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            bankAccount2 = token.bankAccount;
        }
        BankAccount bankAccount3 = bankAccount2;
        if ((i & 64) != 0) {
            card2 = token.card;
        }
        return token.copy(str, type3, date2, z3, z4, bankAccount3, card2);
    }

    public static final Token fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final Type component2() {
        return this.type;
    }

    public final Date component3() {
        return this.created;
    }

    public final boolean component4() {
        return this.livemode;
    }

    public final boolean component5() {
        return this.used;
    }

    public final BankAccount component6() {
        return this.bankAccount;
    }

    public final Card component7() {
        return this.card;
    }

    public final Token copy(String str, Type type2, Date date, boolean z, boolean z2, BankAccount bankAccount2, Card card2) {
        i.e(str, "id");
        i.e(type2, "type");
        i.e(date, "created");
        return new Token(str, type2, date, z, z2, bankAccount2, card2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        return i.a(getId(), token.getId()) && i.a(this.type, token.type) && i.a(this.created, token.created) && this.livemode == token.livemode && this.used == token.used && i.a(this.bankAccount, token.bankAccount) && i.a(this.card, token.card);
    }

    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public final Card getCard() {
        return this.card;
    }

    public final Date getCreated() {
        return this.created;
    }

    public String getId() {
        return this.id;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean getUsed() {
        return this.used;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 0;
        int hashCode = (id2 != null ? id2.hashCode() : 0) * 31;
        Type type2 = this.type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 31;
        Date date = this.created;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        boolean z = this.livemode;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.used;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        BankAccount bankAccount2 = this.bankAccount;
        int hashCode4 = (i3 + (bankAccount2 != null ? bankAccount2.hashCode() : 0)) * 31;
        Card card2 = this.card;
        if (card2 != null) {
            i = card2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Token(id=");
        P0.append(getId());
        P0.append(", type=");
        P0.append(this.type);
        P0.append(", created=");
        P0.append(this.created);
        P0.append(", livemode=");
        P0.append(this.livemode);
        P0.append(", used=");
        P0.append(this.used);
        P0.append(", bankAccount=");
        P0.append(this.bankAccount);
        P0.append(", card=");
        P0.append(this.card);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.type.name());
        parcel.writeSerializable(this.created);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeInt(this.used ? 1 : 0);
        BankAccount bankAccount2 = this.bankAccount;
        if (bankAccount2 != null) {
            parcel.writeInt(1);
            bankAccount2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Card card2 = this.card;
        if (card2 != null) {
            parcel.writeInt(1);
            card2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Token(String str, Type type2, Date date, boolean z, boolean z2, BankAccount bankAccount2, Card card2, int i, f fVar) {
        this(str, type2, date, z, z2, (i & 32) != 0 ? null : bankAccount2, (i & 64) != 0 ? null : card2);
    }
}
