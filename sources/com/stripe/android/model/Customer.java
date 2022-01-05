package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.parsers.CustomerJsonParser;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u0000 E2\u00020\u0001:\u0001EBm\b\u0000\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\bC\u0010DJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\bJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\bJ\u0010\u0010'\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u00103R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b5\u0010\bR\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b7\u0010\u000fR\u001b\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b8\u0010\bR\u001b\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b9\u0010\bR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b:\u0010\bR\u0019\u0010\u001e\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b<\u0010\u0012R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\b>\u0010\fR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b?\u0010\bR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010@\u001a\u0004\bA\u0010\u0015R\u0019\u0010#\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\bB\u0010\u0012¨\u0006F"}, d2 = {"Lcom/stripe/android/model/Customer;", "Lcom/stripe/android/model/StripeModel;", "", "sourceId", "Lcom/stripe/android/model/CustomerSource;", "getSourceById", "(Ljava/lang/String;)Lcom/stripe/android/model/CustomerSource;", "component1", "()Ljava/lang/String;", "component2", "Lcom/stripe/android/model/ShippingInformation;", "component3", "()Lcom/stripe/android/model/ShippingInformation;", "", "component4", "()Ljava/util/List;", "", "component5", "()Z", "", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "id", "defaultSource", "shippingInformation", "sources", "hasMore", "totalCount", "url", "description", "email", "liveMode", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/model/Customer;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getSources", "getDescription", "getUrl", "getEmail", "Z", "getHasMore", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "getDefaultSource", "Ljava/lang/Integer;", "getTotalCount", "getLiveMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Customer.kt */
public final class Customer implements StripeModel {
    public static final Parcelable.Creator<Customer> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final String defaultSource;
    private final String description;
    private final String email;
    private final boolean hasMore;
    private final String id;
    private final boolean liveMode;
    private final ShippingInformation shippingInformation;
    private final List<CustomerSource> sources;
    private final Integer totalCount;
    private final String url;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/Customer$Companion;", "", "", "jsonString", "Lcom/stripe/android/model/Customer;", "fromString", "(Ljava/lang/String;)Lcom/stripe/android/model/Customer;", "Lorg/json/JSONObject;", "jsonObject", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Customer;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Customer.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Customer fromJson(JSONObject jSONObject) {
            i.e(jSONObject, "jsonObject");
            return new CustomerJsonParser().parse(jSONObject);
        }

        public final Customer fromString(String str) {
            Object obj;
            if (str == null) {
                return null;
            }
            try {
                obj = new JSONObject(str);
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            if (obj instanceof Result.Failure) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null) {
                return Customer.Companion.fromJson(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Customer> {
        public final Customer createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ShippingInformation createFromParcel = parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(CustomerSource.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new Customer(readString, readString2, createFromParcel, arrayList, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Customer[] newArray(int i) {
            return new Customer[i];
        }
    }

    public Customer(String str, String str2, ShippingInformation shippingInformation2, List<CustomerSource> list, boolean z, Integer num, String str3, String str4, String str5, boolean z2) {
        i.e(list, "sources");
        this.id = str;
        this.defaultSource = str2;
        this.shippingInformation = shippingInformation2;
        this.sources = list;
        this.hasMore = z;
        this.totalCount = num;
        this.url = str3;
        this.description = str4;
        this.email = str5;
        this.liveMode = z2;
    }

    public static /* synthetic */ Customer copy$default(Customer customer, String str, String str2, ShippingInformation shippingInformation2, List list, boolean z, Integer num, String str3, String str4, String str5, boolean z2, int i, Object obj) {
        Customer customer2 = customer;
        int i2 = i;
        return customer.copy((i2 & 1) != 0 ? customer2.id : str, (i2 & 2) != 0 ? customer2.defaultSource : str2, (i2 & 4) != 0 ? customer2.shippingInformation : shippingInformation2, (i2 & 8) != 0 ? customer2.sources : list, (i2 & 16) != 0 ? customer2.hasMore : z, (i2 & 32) != 0 ? customer2.totalCount : num, (i2 & 64) != 0 ? customer2.url : str3, (i2 & 128) != 0 ? customer2.description : str4, (i2 & 256) != 0 ? customer2.email : str5, (i2 & 512) != 0 ? customer2.liveMode : z2);
    }

    public static final Customer fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public static final Customer fromString(String str) {
        return Companion.fromString(str);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.liveMode;
    }

    public final String component2() {
        return this.defaultSource;
    }

    public final ShippingInformation component3() {
        return this.shippingInformation;
    }

    public final List<CustomerSource> component4() {
        return this.sources;
    }

    public final boolean component5() {
        return this.hasMore;
    }

    public final Integer component6() {
        return this.totalCount;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.email;
    }

    public final Customer copy(String str, String str2, ShippingInformation shippingInformation2, List<CustomerSource> list, boolean z, Integer num, String str3, String str4, String str5, boolean z2) {
        List<CustomerSource> list2 = list;
        i.e(list2, "sources");
        return new Customer(str, str2, shippingInformation2, list2, z, num, str3, str4, str5, z2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) obj;
        return i.a(this.id, customer.id) && i.a(this.defaultSource, customer.defaultSource) && i.a(this.shippingInformation, customer.shippingInformation) && i.a(this.sources, customer.sources) && this.hasMore == customer.hasMore && i.a(this.totalCount, customer.totalCount) && i.a(this.url, customer.url) && i.a(this.description, customer.description) && i.a(this.email, customer.email) && this.liveMode == customer.liveMode;
    }

    public final String getDefaultSource() {
        return this.defaultSource;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getLiveMode() {
        return this.liveMode;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final CustomerSource getSourceById(String str) {
        T t;
        i.e(str, "sourceId");
        Iterator<T> it = this.sources.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((CustomerSource) t).getId(), str)) {
                break;
            }
        }
        return (CustomerSource) t;
    }

    public final List<CustomerSource> getSources() {
        return this.sources;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.defaultSource;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ShippingInformation shippingInformation2 = this.shippingInformation;
        int hashCode3 = (hashCode2 + (shippingInformation2 != null ? shippingInformation2.hashCode() : 0)) * 31;
        List<CustomerSource> list = this.sources;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.hasMore;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        Integer num = this.totalCount;
        int hashCode5 = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i3 = (hashCode7 + i) * 31;
        boolean z3 = this.liveMode;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Customer(id=");
        P0.append(this.id);
        P0.append(", defaultSource=");
        P0.append(this.defaultSource);
        P0.append(", shippingInformation=");
        P0.append(this.shippingInformation);
        P0.append(", sources=");
        P0.append(this.sources);
        P0.append(", hasMore=");
        P0.append(this.hasMore);
        P0.append(", totalCount=");
        P0.append(this.totalCount);
        P0.append(", url=");
        P0.append(this.url);
        P0.append(", description=");
        P0.append(this.description);
        P0.append(", email=");
        P0.append(this.email);
        P0.append(", liveMode=");
        return a.D0(P0, this.liveMode, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.defaultSource);
        ShippingInformation shippingInformation2 = this.shippingInformation;
        if (shippingInformation2 != null) {
            parcel.writeInt(1);
            shippingInformation2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<CustomerSource> list = this.sources;
        parcel.writeInt(list.size());
        for (CustomerSource writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.hasMore ? 1 : 0);
        Integer num = this.totalCount;
        if (num != null) {
            a.i(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.description);
        parcel.writeString(this.email);
        parcel.writeInt(this.liveMode ? 1 : 0);
    }
}
