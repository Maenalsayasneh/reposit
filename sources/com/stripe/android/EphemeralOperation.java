package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import i0.d.a.a.a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00038 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/EphemeralOperation;", "Landroid/os/Parcelable;", "", "", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "productUsage", "getId$payments_core_release", "()Ljava/lang/String;", "id", "<init>", "()V", "Customer", "Issuing", "RetrieveKey", "Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EphemeralOperation.kt */
public abstract class EphemeralOperation implements Parcelable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation;", "<init>", "()V", "AddSource", "AttachPaymentMethod", "DeleteSource", "DetachPaymentMethod", "GetPaymentMethods", "UpdateDefaultSource", "UpdateShipping", "Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralOperation.kt */
    public static abstract class Customer extends EphemeralOperation {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÀ\u0003¢\u0006\u0004\b\t\u0010\nJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\nR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010\u0004R\u001c\u0010\u000e\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b&\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010\u0004¨\u0006*"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "component1", "()Ljava/lang/String;", "component2", "component3$payments_core_release", "component3", "", "component4$payments_core_release", "()Ljava/util/Set;", "component4", "sourceId", "sourceType", "id", "productUsage", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getProductUsage$payments_core_release", "Ljava/lang/String;", "getSourceType", "getId$payments_core_release", "getSourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class AddSource extends Customer {
            public static final Parcelable.Creator<AddSource> CREATOR = new Creator();
            private final String id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<AddSource> {
                public final AddSource createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new AddSource(readString, readString2, readString3, linkedHashSet);
                }

                public final AddSource[] newArray(int i) {
                    return new AddSource[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddSource(String str, String str2, String str3, Set<String> set) {
                super((f) null);
                i.e(str, "sourceId");
                i.e(str2, "sourceType");
                i.e(str3, "id");
                i.e(set, "productUsage");
                this.sourceId = str;
                this.sourceType = str2;
                this.id = str3;
                this.productUsage = set;
            }

            public static /* synthetic */ AddSource copy$default(AddSource addSource, String str, String str2, String str3, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = addSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = addSource.sourceType;
                }
                if ((i & 4) != 0) {
                    str3 = addSource.getId$payments_core_release();
                }
                if ((i & 8) != 0) {
                    set = addSource.getProductUsage$payments_core_release();
                }
                return addSource.copy(str, str2, str3, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2() {
                return this.sourceType;
            }

            public final String component3$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component4$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final AddSource copy(String str, String str2, String str3, Set<String> set) {
                i.e(str, "sourceId");
                i.e(str2, "sourceType");
                i.e(str3, "id");
                i.e(set, "productUsage");
                return new AddSource(str, str2, str3, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddSource)) {
                    return false;
                }
                AddSource addSource = (AddSource) obj;
                return i.a(this.sourceId, addSource.sourceId) && i.a(this.sourceType, addSource.sourceType) && i.a(getId$payments_core_release(), addSource.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), addSource.getProductUsage$payments_core_release());
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            public int hashCode() {
                String str = this.sourceId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.sourceType;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode3 = (hashCode2 + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("AddSource(sourceId=");
                P0.append(this.sourceId);
                P0.append(", sourceType=");
                P0.append(this.sourceType);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.sourceId);
                parcel.writeString(this.sourceType);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0004R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\tR\u001c\u0010\f\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b$\u0010\u0004¨\u0006'"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "component1", "()Ljava/lang/String;", "component2$payments_core_release", "component2", "", "component3$payments_core_release", "()Ljava/util/Set;", "component3", "paymentMethodId", "id", "productUsage", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPaymentMethodId", "Ljava/util/Set;", "getProductUsage$payments_core_release", "getId$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class AttachPaymentMethod extends Customer {
            public static final Parcelable.Creator<AttachPaymentMethod> CREATOR = new Creator();
            private final String id;
            private final String paymentMethodId;
            private final Set<String> productUsage;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<AttachPaymentMethod> {
                public final AttachPaymentMethod createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new AttachPaymentMethod(readString, readString2, linkedHashSet);
                }

                public final AttachPaymentMethod[] newArray(int i) {
                    return new AttachPaymentMethod[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AttachPaymentMethod(String str, String str2, Set<String> set) {
                super((f) null);
                i.e(str, "paymentMethodId");
                i.e(str2, "id");
                i.e(set, "productUsage");
                this.paymentMethodId = str;
                this.id = str2;
                this.productUsage = set;
            }

            public static /* synthetic */ AttachPaymentMethod copy$default(AttachPaymentMethod attachPaymentMethod, String str, String str2, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = attachPaymentMethod.paymentMethodId;
                }
                if ((i & 2) != 0) {
                    str2 = attachPaymentMethod.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = attachPaymentMethod.getProductUsage$payments_core_release();
                }
                return attachPaymentMethod.copy(str, str2, set);
            }

            public final String component1() {
                return this.paymentMethodId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final AttachPaymentMethod copy(String str, String str2, Set<String> set) {
                i.e(str, "paymentMethodId");
                i.e(str2, "id");
                i.e(set, "productUsage");
                return new AttachPaymentMethod(str, str2, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AttachPaymentMethod)) {
                    return false;
                }
                AttachPaymentMethod attachPaymentMethod = (AttachPaymentMethod) obj;
                return i.a(this.paymentMethodId, attachPaymentMethod.paymentMethodId) && i.a(getId$payments_core_release(), attachPaymentMethod.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), attachPaymentMethod.getProductUsage$payments_core_release());
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public int hashCode() {
                String str = this.paymentMethodId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode2 = (hashCode + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("AttachPaymentMethod(paymentMethodId=");
                P0.append(this.paymentMethodId);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.paymentMethodId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\u0004R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\tR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b$\u0010\u0004¨\u0006'"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "component1", "()Ljava/lang/String;", "component2$payments_core_release", "component2", "", "component3$payments_core_release", "()Ljava/util/Set;", "component3", "sourceId", "id", "productUsage", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "getSourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class DeleteSource extends Customer {
            public static final Parcelable.Creator<DeleteSource> CREATOR = new Creator();
            private final String id;
            private final Set<String> productUsage;
            private final String sourceId;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<DeleteSource> {
                public final DeleteSource createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new DeleteSource(readString, readString2, linkedHashSet);
                }

                public final DeleteSource[] newArray(int i) {
                    return new DeleteSource[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public DeleteSource(String str, String str2, Set<String> set) {
                super((f) null);
                i.e(str, "sourceId");
                i.e(str2, "id");
                i.e(set, "productUsage");
                this.sourceId = str;
                this.id = str2;
                this.productUsage = set;
            }

            public static /* synthetic */ DeleteSource copy$default(DeleteSource deleteSource, String str, String str2, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deleteSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = deleteSource.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = deleteSource.getProductUsage$payments_core_release();
                }
                return deleteSource.copy(str, str2, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final DeleteSource copy(String str, String str2, Set<String> set) {
                i.e(str, "sourceId");
                i.e(str2, "id");
                i.e(set, "productUsage");
                return new DeleteSource(str, str2, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeleteSource)) {
                    return false;
                }
                DeleteSource deleteSource = (DeleteSource) obj;
                return i.a(this.sourceId, deleteSource.sourceId) && i.a(getId$payments_core_release(), deleteSource.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), deleteSource.getProductUsage$payments_core_release());
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public int hashCode() {
                String str = this.sourceId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode2 = (hashCode + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("DeleteSource(sourceId=");
                P0.append(this.sourceId);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.sourceId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0004R\u001c\u0010\f\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b$\u0010\u0004¨\u0006'"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "component1", "()Ljava/lang/String;", "component2$payments_core_release", "component2", "", "component3$payments_core_release", "()Ljava/util/Set;", "component3", "paymentMethodId", "id", "productUsage", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getProductUsage$payments_core_release", "Ljava/lang/String;", "getPaymentMethodId", "getId$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class DetachPaymentMethod extends Customer {
            public static final Parcelable.Creator<DetachPaymentMethod> CREATOR = new Creator();
            private final String id;
            private final String paymentMethodId;
            private final Set<String> productUsage;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<DetachPaymentMethod> {
                public final DetachPaymentMethod createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new DetachPaymentMethod(readString, readString2, linkedHashSet);
                }

                public final DetachPaymentMethod[] newArray(int i) {
                    return new DetachPaymentMethod[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public DetachPaymentMethod(String str, String str2, Set<String> set) {
                super((f) null);
                i.e(str, "paymentMethodId");
                i.e(str2, "id");
                i.e(set, "productUsage");
                this.paymentMethodId = str;
                this.id = str2;
                this.productUsage = set;
            }

            public static /* synthetic */ DetachPaymentMethod copy$default(DetachPaymentMethod detachPaymentMethod, String str, String str2, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = detachPaymentMethod.paymentMethodId;
                }
                if ((i & 2) != 0) {
                    str2 = detachPaymentMethod.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = detachPaymentMethod.getProductUsage$payments_core_release();
                }
                return detachPaymentMethod.copy(str, str2, set);
            }

            public final String component1() {
                return this.paymentMethodId;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final DetachPaymentMethod copy(String str, String str2, Set<String> set) {
                i.e(str, "paymentMethodId");
                i.e(str2, "id");
                i.e(set, "productUsage");
                return new DetachPaymentMethod(str, str2, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DetachPaymentMethod)) {
                    return false;
                }
                DetachPaymentMethod detachPaymentMethod = (DetachPaymentMethod) obj;
                return i.a(this.paymentMethodId, detachPaymentMethod.paymentMethodId) && i.a(getId$payments_core_release(), detachPaymentMethod.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), detachPaymentMethod.getProductUsage$payments_core_release());
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public int hashCode() {
                String str = this.paymentMethodId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode2 = (hashCode + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("DetachPaymentMethod(paymentMethodId=");
                P0.append(this.paymentMethodId);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.paymentMethodId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0011\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÀ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\fJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010,R\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010\u0014R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u0010\fR\u001c\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u0010\u0004R\u001c\u0010\u001a\u001a\u00020\n8\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b3\u0010\fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b4\u0010\fR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u0010\b¨\u00069"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/model/PaymentMethod$Type;", "component1$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component1", "", "component2$payments_core_release", "()Ljava/lang/Integer;", "component2", "", "component3$payments_core_release", "()Ljava/lang/String;", "component3", "component4$payments_core_release", "component4", "component5$payments_core_release", "component5", "", "component6$payments_core_release", "()Ljava/util/Set;", "component6", "type", "limit", "endingBefore", "startingAfter", "id", "productUsage", "copy", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getProductUsage$payments_core_release", "Ljava/lang/String;", "getEndingBefore$payments_core_release", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType$payments_core_release", "getId$payments_core_release", "getStartingAfter$payments_core_release", "Ljava/lang/Integer;", "getLimit$payments_core_release", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class GetPaymentMethods extends Customer {
            public static final Parcelable.Creator<GetPaymentMethods> CREATOR = new Creator();
            private final String endingBefore;
            private final String id;
            private final Integer limit;
            private final Set<String> productUsage;
            private final String startingAfter;
            private final PaymentMethod.Type type;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<GetPaymentMethods> {
                public final GetPaymentMethods createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    PaymentMethod.Type type = (PaymentMethod.Type) Enum.valueOf(PaymentMethod.Type.class, parcel.readString());
                    Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new GetPaymentMethods(type, valueOf, readString, readString2, readString3, linkedHashSet);
                }

                public final GetPaymentMethods[] newArray(int i) {
                    return new GetPaymentMethods[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ GetPaymentMethods(PaymentMethod.Type type2, Integer num, String str, String str2, String str3, Set set, int i, f fVar) {
                this(type2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, str3, set);
            }

            public static /* synthetic */ GetPaymentMethods copy$default(GetPaymentMethods getPaymentMethods, PaymentMethod.Type type2, Integer num, String str, String str2, String str3, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    type2 = getPaymentMethods.type;
                }
                if ((i & 2) != 0) {
                    num = getPaymentMethods.limit;
                }
                Integer num2 = num;
                if ((i & 4) != 0) {
                    str = getPaymentMethods.endingBefore;
                }
                String str4 = str;
                if ((i & 8) != 0) {
                    str2 = getPaymentMethods.startingAfter;
                }
                String str5 = str2;
                if ((i & 16) != 0) {
                    str3 = getPaymentMethods.getId$payments_core_release();
                }
                String str6 = str3;
                if ((i & 32) != 0) {
                    set = getPaymentMethods.getProductUsage$payments_core_release();
                }
                return getPaymentMethods.copy(type2, num2, str4, str5, str6, set);
            }

            public final PaymentMethod.Type component1$payments_core_release() {
                return this.type;
            }

            public final Integer component2$payments_core_release() {
                return this.limit;
            }

            public final String component3$payments_core_release() {
                return this.endingBefore;
            }

            public final String component4$payments_core_release() {
                return this.startingAfter;
            }

            public final String component5$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component6$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final GetPaymentMethods copy(PaymentMethod.Type type2, Integer num, String str, String str2, String str3, Set<String> set) {
                i.e(type2, "type");
                i.e(str3, "id");
                i.e(set, "productUsage");
                return new GetPaymentMethods(type2, num, str, str2, str3, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GetPaymentMethods)) {
                    return false;
                }
                GetPaymentMethods getPaymentMethods = (GetPaymentMethods) obj;
                return i.a(this.type, getPaymentMethods.type) && i.a(this.limit, getPaymentMethods.limit) && i.a(this.endingBefore, getPaymentMethods.endingBefore) && i.a(this.startingAfter, getPaymentMethods.startingAfter) && i.a(getId$payments_core_release(), getPaymentMethods.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), getPaymentMethods.getProductUsage$payments_core_release());
            }

            public final String getEndingBefore$payments_core_release() {
                return this.endingBefore;
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public final Integer getLimit$payments_core_release() {
                return this.limit;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getStartingAfter$payments_core_release() {
                return this.startingAfter;
            }

            public final PaymentMethod.Type getType$payments_core_release() {
                return this.type;
            }

            public int hashCode() {
                PaymentMethod.Type type2 = this.type;
                int i = 0;
                int hashCode = (type2 != null ? type2.hashCode() : 0) * 31;
                Integer num = this.limit;
                int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
                String str = this.endingBefore;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.startingAfter;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode5 = (hashCode4 + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode5 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("GetPaymentMethods(type=");
                P0.append(this.type);
                P0.append(", limit=");
                P0.append(this.limit);
                P0.append(", endingBefore=");
                P0.append(this.endingBefore);
                P0.append(", startingAfter=");
                P0.append(this.startingAfter);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                int i2;
                i.e(parcel, "parcel");
                parcel.writeString(this.type.name());
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
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public GetPaymentMethods(PaymentMethod.Type type2, Integer num, String str, String str2, String str3, Set<String> set) {
                super((f) null);
                i.e(type2, "type");
                i.e(str3, "id");
                i.e(set, "productUsage");
                this.type = type2;
                this.limit = num;
                this.endingBefore = str;
                this.startingAfter = str2;
                this.id = str3;
                this.productUsage = set;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÀ\u0003¢\u0006\u0004\b\t\u0010\nJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u0004R\u001c\u0010\u000e\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b$\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b%\u0010\u0004R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010\n¨\u0006*"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "component1", "()Ljava/lang/String;", "component2", "component3$payments_core_release", "component3", "", "component4$payments_core_release", "()Ljava/util/Set;", "component4", "sourceId", "sourceType", "id", "productUsage", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSourceId", "getId$payments_core_release", "getSourceType", "Ljava/util/Set;", "getProductUsage$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class UpdateDefaultSource extends Customer {
            public static final Parcelable.Creator<UpdateDefaultSource> CREATOR = new Creator();
            private final String id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<UpdateDefaultSource> {
                public final UpdateDefaultSource createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new UpdateDefaultSource(readString, readString2, readString3, linkedHashSet);
                }

                public final UpdateDefaultSource[] newArray(int i) {
                    return new UpdateDefaultSource[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public UpdateDefaultSource(String str, String str2, String str3, Set<String> set) {
                super((f) null);
                i.e(str, "sourceId");
                i.e(str2, "sourceType");
                i.e(str3, "id");
                i.e(set, "productUsage");
                this.sourceId = str;
                this.sourceType = str2;
                this.id = str3;
                this.productUsage = set;
            }

            public static /* synthetic */ UpdateDefaultSource copy$default(UpdateDefaultSource updateDefaultSource, String str, String str2, String str3, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateDefaultSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = updateDefaultSource.sourceType;
                }
                if ((i & 4) != 0) {
                    str3 = updateDefaultSource.getId$payments_core_release();
                }
                if ((i & 8) != 0) {
                    set = updateDefaultSource.getProductUsage$payments_core_release();
                }
                return updateDefaultSource.copy(str, str2, str3, set);
            }

            public final String component1() {
                return this.sourceId;
            }

            public final String component2() {
                return this.sourceType;
            }

            public final String component3$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component4$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final UpdateDefaultSource copy(String str, String str2, String str3, Set<String> set) {
                i.e(str, "sourceId");
                i.e(str2, "sourceType");
                i.e(str3, "id");
                i.e(set, "productUsage");
                return new UpdateDefaultSource(str, str2, str3, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateDefaultSource)) {
                    return false;
                }
                UpdateDefaultSource updateDefaultSource = (UpdateDefaultSource) obj;
                return i.a(this.sourceId, updateDefaultSource.sourceId) && i.a(this.sourceType, updateDefaultSource.sourceType) && i.a(getId$payments_core_release(), updateDefaultSource.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), updateDefaultSource.getProductUsage$payments_core_release());
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            public int hashCode() {
                String str = this.sourceId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.sourceType;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode3 = (hashCode2 + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("UpdateDefaultSource(sourceId=");
                P0.append(this.sourceId);
                P0.append(", sourceType=");
                P0.append(this.sourceType);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.sourceId);
                parcel.writeString(this.sourceType);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u00020\u00058\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u0007R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010\u000bR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0004¨\u0006*"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/model/ShippingInformation;", "component1", "()Lcom/stripe/android/model/ShippingInformation;", "", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "", "component3$payments_core_release", "()Ljava/util/Set;", "component3", "shippingInformation", "id", "productUsage", "copy", "(Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "<init>", "(Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class UpdateShipping extends Customer {
            public static final Parcelable.Creator<UpdateShipping> CREATOR = new Creator();
            private final String id;
            private final Set<String> productUsage;
            private final ShippingInformation shippingInformation;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<UpdateShipping> {
                public final UpdateShipping createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    ShippingInformation createFromParcel = ShippingInformation.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new UpdateShipping(createFromParcel, readString, linkedHashSet);
                }

                public final UpdateShipping[] newArray(int i) {
                    return new UpdateShipping[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public UpdateShipping(ShippingInformation shippingInformation2, String str, Set<String> set) {
                super((f) null);
                i.e(shippingInformation2, "shippingInformation");
                i.e(str, "id");
                i.e(set, "productUsage");
                this.shippingInformation = shippingInformation2;
                this.id = str;
                this.productUsage = set;
            }

            public static /* synthetic */ UpdateShipping copy$default(UpdateShipping updateShipping, ShippingInformation shippingInformation2, String str, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    shippingInformation2 = updateShipping.shippingInformation;
                }
                if ((i & 2) != 0) {
                    str = updateShipping.getId$payments_core_release();
                }
                if ((i & 4) != 0) {
                    set = updateShipping.getProductUsage$payments_core_release();
                }
                return updateShipping.copy(shippingInformation2, str, set);
            }

            public final ShippingInformation component1() {
                return this.shippingInformation;
            }

            public final String component2$payments_core_release() {
                return getId$payments_core_release();
            }

            public final Set<String> component3$payments_core_release() {
                return getProductUsage$payments_core_release();
            }

            public final UpdateShipping copy(ShippingInformation shippingInformation2, String str, Set<String> set) {
                i.e(shippingInformation2, "shippingInformation");
                i.e(str, "id");
                i.e(set, "productUsage");
                return new UpdateShipping(shippingInformation2, str, set);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateShipping)) {
                    return false;
                }
                UpdateShipping updateShipping = (UpdateShipping) obj;
                return i.a(this.shippingInformation, updateShipping.shippingInformation) && i.a(getId$payments_core_release(), updateShipping.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), updateShipping.getProductUsage$payments_core_release());
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            public int hashCode() {
                ShippingInformation shippingInformation2 = this.shippingInformation;
                int i = 0;
                int hashCode = (shippingInformation2 != null ? shippingInformation2.hashCode() : 0) * 31;
                String id$payments_core_release = getId$payments_core_release();
                int hashCode2 = (hashCode + (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0)) * 31;
                Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
                if (productUsage$payments_core_release != null) {
                    i = productUsage$payments_core_release.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("UpdateShipping(shippingInformation=");
                P0.append(this.shippingInformation);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(", productUsage=");
                P0.append(getProductUsage$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.shippingInformation.writeToParcel(parcel, 0);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
            }
        }

        private Customer() {
            super((f) null);
        }

        public /* synthetic */ Customer(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\b¨\u0006$"}, d2 = {"Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "Lcom/stripe/android/EphemeralOperation;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "", "component2$payments_core_release", "()Ljava/util/Set;", "component2", "id", "productUsage", "copy", "(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralOperation.kt */
    public static final class RetrieveKey extends EphemeralOperation {
        public static final Parcelable.Creator<RetrieveKey> CREATOR = new Creator();
        private final String id;
        private final Set<String> productUsage;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<RetrieveKey> {
            public final RetrieveKey createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                while (readInt != 0) {
                    linkedHashSet.add(parcel.readString());
                    readInt--;
                }
                return new RetrieveKey(readString, linkedHashSet);
            }

            public final RetrieveKey[] newArray(int i) {
                return new RetrieveKey[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RetrieveKey(String str, Set<String> set) {
            super((f) null);
            i.e(str, "id");
            i.e(set, "productUsage");
            this.id = str;
            this.productUsage = set;
        }

        public static /* synthetic */ RetrieveKey copy$default(RetrieveKey retrieveKey, String str, Set<String> set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = retrieveKey.getId$payments_core_release();
            }
            if ((i & 2) != 0) {
                set = retrieveKey.getProductUsage$payments_core_release();
            }
            return retrieveKey.copy(str, set);
        }

        public final String component1$payments_core_release() {
            return getId$payments_core_release();
        }

        public final Set<String> component2$payments_core_release() {
            return getProductUsage$payments_core_release();
        }

        public final RetrieveKey copy(String str, Set<String> set) {
            i.e(str, "id");
            i.e(set, "productUsage");
            return new RetrieveKey(str, set);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetrieveKey)) {
                return false;
            }
            RetrieveKey retrieveKey = (RetrieveKey) obj;
            return i.a(getId$payments_core_release(), retrieveKey.getId$payments_core_release()) && i.a(getProductUsage$payments_core_release(), retrieveKey.getProductUsage$payments_core_release());
        }

        public String getId$payments_core_release() {
            return this.id;
        }

        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        public int hashCode() {
            String id$payments_core_release = getId$payments_core_release();
            int i = 0;
            int hashCode = (id$payments_core_release != null ? id$payments_core_release.hashCode() : 0) * 31;
            Set<String> productUsage$payments_core_release = getProductUsage$payments_core_release();
            if (productUsage$payments_core_release != null) {
                i = productUsage$payments_core_release.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("RetrieveKey(id=");
            P0.append(getId$payments_core_release());
            P0.append(", productUsage=");
            P0.append(getProductUsage$payments_core_release());
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.id);
            Set<String> set = this.productUsage;
            parcel.writeInt(set.size());
            for (String writeString : set) {
                parcel.writeString(writeString);
            }
        }
    }

    private EphemeralOperation() {
    }

    public abstract String getId$payments_core_release();

    public abstract Set<String> getProductUsage$payments_core_release();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\b\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing;", "Lcom/stripe/android/EphemeralOperation;", "", "", "productUsage", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "<init>", "(Ljava/util/Set;)V", "RetrievePin", "UpdatePin", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralOperation.kt */
    public static abstract class Issuing extends EphemeralOperation {
        private final Set<String> productUsage;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J8\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010\u0004R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b!\u0010\u0004R\u001c\u0010\f\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010\u0004¨\u0006&"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4$payments_core_release", "component4", "cardId", "verificationId", "userOneTimeCode", "id", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserOneTimeCode", "getCardId", "getId$payments_core_release", "getVerificationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class RetrievePin extends Issuing {
            public static final Parcelable.Creator<RetrievePin> CREATOR = new Creator();
            private final String cardId;
            private final String id;
            private final String userOneTimeCode;
            private final String verificationId;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<RetrievePin> {
                public final RetrievePin createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new RetrievePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                public final RetrievePin[] newArray(int i) {
                    return new RetrievePin[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public RetrievePin(String str, String str2, String str3, String str4) {
                super((Set) null, 1, (f) null);
                i.e(str, "cardId");
                i.e(str2, "verificationId");
                i.e(str3, "userOneTimeCode");
                i.e(str4, "id");
                this.cardId = str;
                this.verificationId = str2;
                this.userOneTimeCode = str3;
                this.id = str4;
            }

            public static /* synthetic */ RetrievePin copy$default(RetrievePin retrievePin, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = retrievePin.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = retrievePin.verificationId;
                }
                if ((i & 4) != 0) {
                    str3 = retrievePin.userOneTimeCode;
                }
                if ((i & 8) != 0) {
                    str4 = retrievePin.getId$payments_core_release();
                }
                return retrievePin.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.cardId;
            }

            public final String component2() {
                return this.verificationId;
            }

            public final String component3() {
                return this.userOneTimeCode;
            }

            public final String component4$payments_core_release() {
                return getId$payments_core_release();
            }

            public final RetrievePin copy(String str, String str2, String str3, String str4) {
                i.e(str, "cardId");
                i.e(str2, "verificationId");
                i.e(str3, "userOneTimeCode");
                i.e(str4, "id");
                return new RetrievePin(str, str2, str3, str4);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetrievePin)) {
                    return false;
                }
                RetrievePin retrievePin = (RetrievePin) obj;
                return i.a(this.cardId, retrievePin.cardId) && i.a(this.verificationId, retrievePin.verificationId) && i.a(this.userOneTimeCode, retrievePin.userOneTimeCode) && i.a(getId$payments_core_release(), retrievePin.getId$payments_core_release());
            }

            public final String getCardId() {
                return this.cardId;
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                String str = this.cardId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.verificationId;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.userOneTimeCode;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String id$payments_core_release = getId$payments_core_release();
                if (id$payments_core_release != null) {
                    i = id$payments_core_release.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("RetrievePin(cardId=");
                P0.append(this.cardId);
                P0.append(", verificationId=");
                P0.append(this.verificationId);
                P0.append(", userOneTimeCode=");
                P0.append(this.userOneTimeCode);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.cardId);
                parcel.writeString(this.verificationId);
                parcel.writeString(this.userOneTimeCode);
                parcel.writeString(this.id);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\b\u0010\u0004JB\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u00020\u00028\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b#\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b$\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b%\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b&\u0010\u0004¨\u0006)"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5$payments_core_release", "component5", "cardId", "newPin", "verificationId", "userOneTimeCode", "id", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId$payments_core_release", "getVerificationId", "getCardId", "getNewPin", "getUserOneTimeCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralOperation.kt */
        public static final class UpdatePin extends Issuing {
            public static final Parcelable.Creator<UpdatePin> CREATOR = new Creator();
            private final String cardId;
            private final String id;
            private final String newPin;
            private final String userOneTimeCode;
            private final String verificationId;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<UpdatePin> {
                public final UpdatePin createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new UpdatePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                public final UpdatePin[] newArray(int i) {
                    return new UpdatePin[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public UpdatePin(String str, String str2, String str3, String str4, String str5) {
                super((Set) null, 1, (f) null);
                i.e(str, "cardId");
                i.e(str2, "newPin");
                i.e(str3, "verificationId");
                i.e(str4, "userOneTimeCode");
                i.e(str5, "id");
                this.cardId = str;
                this.newPin = str2;
                this.verificationId = str3;
                this.userOneTimeCode = str4;
                this.id = str5;
            }

            public static /* synthetic */ UpdatePin copy$default(UpdatePin updatePin, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updatePin.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = updatePin.newPin;
                }
                String str6 = str2;
                if ((i & 4) != 0) {
                    str3 = updatePin.verificationId;
                }
                String str7 = str3;
                if ((i & 8) != 0) {
                    str4 = updatePin.userOneTimeCode;
                }
                String str8 = str4;
                if ((i & 16) != 0) {
                    str5 = updatePin.getId$payments_core_release();
                }
                return updatePin.copy(str, str6, str7, str8, str5);
            }

            public final String component1() {
                return this.cardId;
            }

            public final String component2() {
                return this.newPin;
            }

            public final String component3() {
                return this.verificationId;
            }

            public final String component4() {
                return this.userOneTimeCode;
            }

            public final String component5$payments_core_release() {
                return getId$payments_core_release();
            }

            public final UpdatePin copy(String str, String str2, String str3, String str4, String str5) {
                i.e(str, "cardId");
                i.e(str2, "newPin");
                i.e(str3, "verificationId");
                i.e(str4, "userOneTimeCode");
                i.e(str5, "id");
                return new UpdatePin(str, str2, str3, str4, str5);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdatePin)) {
                    return false;
                }
                UpdatePin updatePin = (UpdatePin) obj;
                return i.a(this.cardId, updatePin.cardId) && i.a(this.newPin, updatePin.newPin) && i.a(this.verificationId, updatePin.verificationId) && i.a(this.userOneTimeCode, updatePin.userOneTimeCode) && i.a(getId$payments_core_release(), updatePin.getId$payments_core_release());
            }

            public final String getCardId() {
                return this.cardId;
            }

            public String getId$payments_core_release() {
                return this.id;
            }

            public final String getNewPin() {
                return this.newPin;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                String str = this.cardId;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.newPin;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.verificationId;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.userOneTimeCode;
                int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String id$payments_core_release = getId$payments_core_release();
                if (id$payments_core_release != null) {
                    i = id$payments_core_release.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("UpdatePin(cardId=");
                P0.append(this.cardId);
                P0.append(", newPin=");
                P0.append(this.newPin);
                P0.append(", verificationId=");
                P0.append(this.verificationId);
                P0.append(", userOneTimeCode=");
                P0.append(this.userOneTimeCode);
                P0.append(", id=");
                P0.append(getId$payments_core_release());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.cardId);
                parcel.writeString(this.newPin);
                parcel.writeString(this.verificationId);
                parcel.writeString(this.userOneTimeCode);
                parcel.writeString(this.id);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Issuing(Set set, int i, f fVar) {
            this((i & 1) != 0 ? EmptySet.c : set);
        }

        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        private Issuing(Set<String> set) {
            super((f) null);
            this.productUsage = set;
        }
    }

    public /* synthetic */ EphemeralOperation(f fVar) {
        this();
    }
}
