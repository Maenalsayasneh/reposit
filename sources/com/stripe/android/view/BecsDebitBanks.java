package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeJsonUtils;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014B\u001f\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks;", "", "", "bsb", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "byPrefix", "(Ljava/lang/String;)Lcom/stripe/android/view/BecsDebitBanks$Bank;", "", "shouldIncludeTestBank", "Z", "", "banks", "Ljava/util/List;", "getBanks$payments_core_release", "()Ljava/util/List;", "<init>", "(Ljava/util/List;Z)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Z)V", "Companion", "Bank", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BecsDebitBanks.kt */
public final class BecsDebitBanks {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final Bank STRIPE_TEST_BANK = new Bank("00", "STRIPE", "Stripe Test Bank");
    private final List<Bank> banks;
    private final boolean shouldIncludeTestBank;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\b\u0010\u0004J.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0004R\u001c\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b!\u0010\u0004R\u001c\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\"\u0010\u0004¨\u0006%"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Bank;", "Landroid/os/Parcelable;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "component2$payments_core_release", "component2", "component3$payments_core_release", "component3", "prefix", "code", "name", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/view/BecsDebitBanks$Bank;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefix$payments_core_release", "getCode$payments_core_release", "getName$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BecsDebitBanks.kt */
    public static final class Bank implements Parcelable {
        public static final Parcelable.Creator<Bank> CREATOR = new Creator();
        private final String code;
        private final String name;
        private final String prefix;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Bank> {
            public final Bank createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Bank(parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Bank[] newArray(int i) {
                return new Bank[i];
            }
        }

        public Bank(String str, String str2, String str3) {
            i.e(str, "prefix");
            i.e(str2, PaymentMethodOptionsParams.Blik.PARAM_CODE);
            i.e(str3, "name");
            this.prefix = str;
            this.code = str2;
            this.name = str3;
        }

        public static /* synthetic */ Bank copy$default(Bank bank, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bank.prefix;
            }
            if ((i & 2) != 0) {
                str2 = bank.code;
            }
            if ((i & 4) != 0) {
                str3 = bank.name;
            }
            return bank.copy(str, str2, str3);
        }

        public final String component1$payments_core_release() {
            return this.prefix;
        }

        public final String component2$payments_core_release() {
            return this.code;
        }

        public final String component3$payments_core_release() {
            return this.name;
        }

        public final Bank copy(String str, String str2, String str3) {
            i.e(str, "prefix");
            i.e(str2, PaymentMethodOptionsParams.Blik.PARAM_CODE);
            i.e(str3, "name");
            return new Bank(str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bank)) {
                return false;
            }
            Bank bank = (Bank) obj;
            return i.a(this.prefix, bank.prefix) && i.a(this.code, bank.code) && i.a(this.name, bank.name);
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPrefix$payments_core_release() {
            return this.prefix;
        }

        public int hashCode() {
            String str = this.prefix;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.code;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Bank(prefix=");
            P0.append(this.prefix);
            P0.append(", code=");
            P0.append(this.code);
            P0.append(", name=");
            return a.y0(P0, this.name, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.prefix);
            parcel.writeString(this.code);
            parcel.writeString(this.name);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Companion;", "", "Landroid/content/Context;", "context", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "createBanksData", "(Landroid/content/Context;)Ljava/util/List;", "", "readFile", "(Landroid/content/Context;)Ljava/lang/String;", "STRIPE_TEST_BANK", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BecsDebitBanks.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final List<Bank> createBanksData(Context context) {
            Map<String, Object> jsonObjectToMap$payments_core_release = StripeJsonUtils.INSTANCE.jsonObjectToMap$payments_core_release(new JSONObject(readFile(context)));
            if (jsonObjectToMap$payments_core_release == null) {
                jsonObjectToMap$payments_core_release = g.o();
            }
            ArrayList arrayList = new ArrayList(jsonObjectToMap$payments_core_release.size());
            for (Map.Entry next : jsonObjectToMap$payments_core_release.entrySet()) {
                Object value = next.getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) value;
                arrayList.add(new Bank((String) next.getKey(), String.valueOf(g.u(list)), String.valueOf(g.G(list))));
            }
            return arrayList;
        }

        private final String readFile(Context context) {
            Resources resources = context.getResources();
            i.d(resources, "context.resources");
            String next = new Scanner(resources.getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            i.d(next, "Scanner(\n               …seDelimiter(\"\\\\A\").next()");
            return next;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BecsDebitBanks(List<Bank> list, boolean z) {
        i.e(list, "banks");
        this.banks = list;
        this.shouldIncludeTestBank = z;
    }

    public final Bank byPrefix(String str) {
        i.e(str, "bsb");
        List<Bank> list = this.banks;
        Bank bank = STRIPE_TEST_BANK;
        T t = null;
        if (!this.shouldIncludeTestBank) {
            bank = null;
        }
        Iterator<T> it = g.Z(list, g.L(bank)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (StringsKt__IndentKt.J(str, ((Bank) next).getPrefix$payments_core_release(), false, 2)) {
                t = next;
                break;
            }
        }
        return (Bank) t;
    }

    public final List<Bank> getBanks$payments_core_release() {
        return this.banks;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BecsDebitBanks(List list, boolean z, int i, f fVar) {
        this((List<Bank>) list, (i & 2) != 0 ? true : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BecsDebitBanks(Context context, boolean z, int i, f fVar) {
        this(context, (i & 2) != 0 ? true : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BecsDebitBanks(Context context, boolean z) {
        this((List<Bank>) Companion.createBanksData(context), z);
        i.e(context, "context");
    }
}
