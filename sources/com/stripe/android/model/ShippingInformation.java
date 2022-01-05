package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B+\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b$\u0010\fR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010\n¨\u0006*"}, d2 = {"Lcom/stripe/android/model/ShippingInformation;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "component2", "()Ljava/lang/String;", "component3", "address", "name", "phone", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ShippingInformation;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getPhone", "Lcom/stripe/android/model/Address;", "getAddress", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ShippingInformation.kt */
public final class ShippingInformation implements StripeModel, StripeParamsModel {
    public static final Parcelable.Creator<ShippingInformation> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String PARAM_ADDRESS = "address";
    private static final String PARAM_NAME = "name";
    private static final String PARAM_PHONE = "phone";
    private final Address address;
    private final String name;
    private final String phone;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/ShippingInformation$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_NAME", "PARAM_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ShippingInformation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ShippingInformation> {
        public final ShippingInformation createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new ShippingInformation(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        public final ShippingInformation[] newArray(int i) {
            return new ShippingInformation[i];
        }
    }

    public ShippingInformation() {
        this((Address) null, (String) null, (String) null, 7, (f) null);
    }

    public ShippingInformation(Address address2, String str, String str2) {
        this.address = address2;
        this.name = str;
        this.phone = str2;
    }

    public static /* synthetic */ ShippingInformation copy$default(ShippingInformation shippingInformation, Address address2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            address2 = shippingInformation.address;
        }
        if ((i & 2) != 0) {
            str = shippingInformation.name;
        }
        if ((i & 4) != 0) {
            str2 = shippingInformation.phone;
        }
        return shippingInformation.copy(address2, str, str2);
    }

    public final Address component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone;
    }

    public final ShippingInformation copy(Address address2, String str, String str2) {
        return new ShippingInformation(address2, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingInformation)) {
            return false;
        }
        ShippingInformation shippingInformation = (ShippingInformation) obj;
        return i.a(this.address, shippingInformation.address) && i.a(this.name, shippingInformation.name) && i.a(this.phone, shippingInformation.phone);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        Address address2 = this.address;
        int i = 0;
        int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.phone;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public Map<String, Object> toParamMap() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("name", this.name);
        pairArr[1] = new Pair("phone", this.phone);
        Address address2 = this.address;
        pairArr[2] = new Pair("address", address2 != null ? address2.toParamMap() : null);
        List<Pair> K = g.K(pairArr);
        ArrayList arrayList = new ArrayList();
        for (Pair pair : K) {
            String str = (String) pair.c;
            B b = pair.d;
            Pair pair2 = b != null ? new Pair(str, b) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return g.w0(arrayList);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShippingInformation(address=");
        P0.append(this.address);
        P0.append(", name=");
        P0.append(this.name);
        P0.append(", phone=");
        return a.y0(P0, this.phone, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        Address address2 = this.address;
        if (address2 != null) {
            parcel.writeInt(1);
            address2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.phone);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingInformation(Address address2, String str, String str2, int i, f fVar) {
        this((i & 1) != 0 ? null : address2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
