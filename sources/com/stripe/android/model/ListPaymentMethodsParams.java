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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B;\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0004\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\n\u0010\u0005J\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u000fHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001c\u0010\u0014\u001a\u00020\u000f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010\u0011R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+¨\u0006/"}, d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethod$Type;", "component2$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component2", "customerId", "paymentMethodType", "limit", "endingBefore", "startingAfter", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ListPaymentMethodsParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Lcom/stripe/android/model/PaymentMethod$Type;", "getPaymentMethodType$payments_core_release", "Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ListPaymentMethodsParams.kt */
public final class ListPaymentMethodsParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<ListPaymentMethodsParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_CUSTOMER = "customer";
    @Deprecated
    private static final String PARAM_ENDING_BEFORE = "ending_before";
    @Deprecated
    private static final String PARAM_LIMIT = "limit";
    @Deprecated
    private static final String PARAM_STARTING_AFTER = "starting_after";
    @Deprecated
    private static final String PARAM_TYPE = "type";
    private final String customerId;
    private final String endingBefore;
    private final Integer limit;
    private final PaymentMethod.Type paymentMethodType;
    private final String startingAfter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams$Companion;", "", "", "PARAM_CUSTOMER", "Ljava/lang/String;", "PARAM_ENDING_BEFORE", "PARAM_LIMIT", "PARAM_STARTING_AFTER", "PARAM_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ListPaymentMethodsParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ListPaymentMethodsParams> {
        public final ListPaymentMethodsParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new ListPaymentMethodsParams(parcel.readString(), (PaymentMethod.Type) Enum.valueOf(PaymentMethod.Type.class, parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        public final ListPaymentMethodsParams[] newArray(int i) {
            return new ListPaymentMethodsParams[i];
        }
    }

    public ListPaymentMethodsParams(String str, PaymentMethod.Type type, Integer num, String str2, String str3) {
        i.e(str, "customerId");
        i.e(type, "paymentMethodType");
        this.customerId = str;
        this.paymentMethodType = type;
        this.limit = num;
        this.endingBefore = str2;
        this.startingAfter = str3;
    }

    private final String component1() {
        return this.customerId;
    }

    private final Integer component3() {
        return this.limit;
    }

    private final String component4() {
        return this.endingBefore;
    }

    private final String component5() {
        return this.startingAfter;
    }

    public static /* synthetic */ ListPaymentMethodsParams copy$default(ListPaymentMethodsParams listPaymentMethodsParams, String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listPaymentMethodsParams.customerId;
        }
        if ((i & 2) != 0) {
            type = listPaymentMethodsParams.paymentMethodType;
        }
        PaymentMethod.Type type2 = type;
        if ((i & 4) != 0) {
            num = listPaymentMethodsParams.limit;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = listPaymentMethodsParams.endingBefore;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = listPaymentMethodsParams.startingAfter;
        }
        return listPaymentMethodsParams.copy(str, type2, num2, str4, str3);
    }

    public final PaymentMethod.Type component2$payments_core_release() {
        return this.paymentMethodType;
    }

    public final ListPaymentMethodsParams copy(String str, PaymentMethod.Type type, Integer num, String str2, String str3) {
        i.e(str, "customerId");
        i.e(type, "paymentMethodType");
        return new ListPaymentMethodsParams(str, type, num, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPaymentMethodsParams)) {
            return false;
        }
        ListPaymentMethodsParams listPaymentMethodsParams = (ListPaymentMethodsParams) obj;
        return i.a(this.customerId, listPaymentMethodsParams.customerId) && i.a(this.paymentMethodType, listPaymentMethodsParams.paymentMethodType) && i.a(this.limit, listPaymentMethodsParams.limit) && i.a(this.endingBefore, listPaymentMethodsParams.endingBefore) && i.a(this.startingAfter, listPaymentMethodsParams.startingAfter);
    }

    public final PaymentMethod.Type getPaymentMethodType$payments_core_release() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        String str = this.customerId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PaymentMethod.Type type = this.paymentMethodType;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Integer num = this.limit;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.endingBefore;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.startingAfter;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public Map<String, Object> toParamMap() {
        List<Pair> K = g.K(new Pair(PARAM_CUSTOMER, this.customerId), new Pair("type", this.paymentMethodType.code), new Pair("limit", this.limit), new Pair(PARAM_ENDING_BEFORE, this.endingBefore), new Pair(PARAM_STARTING_AFTER, this.startingAfter));
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

    public String toString() {
        StringBuilder P0 = a.P0("ListPaymentMethodsParams(customerId=");
        P0.append(this.customerId);
        P0.append(", paymentMethodType=");
        P0.append(this.paymentMethodType);
        P0.append(", limit=");
        P0.append(this.limit);
        P0.append(", endingBefore=");
        P0.append(this.endingBefore);
        P0.append(", startingAfter=");
        return a.y0(P0, this.startingAfter, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "parcel");
        parcel.writeString(this.customerId);
        parcel.writeString(this.paymentMethodType.name());
        Integer num = this.limit;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.endingBefore);
        parcel.writeString(this.startingAfter);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListPaymentMethodsParams(String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i, f fVar) {
        this(str, type, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
