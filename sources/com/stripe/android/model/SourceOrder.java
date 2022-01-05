package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u000212BI\b\u0000\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b/\u00100J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010\u000fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u0004R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010\fR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010\u0007R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b.\u0010\u0007¨\u00063"}, d2 = {"Lcom/stripe/android/model/SourceOrder;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/Integer;", "", "component2", "()Ljava/lang/String;", "component3", "", "Lcom/stripe/android/model/SourceOrder$Item;", "component4", "()Ljava/util/List;", "Lcom/stripe/android/model/SourceOrder$Shipping;", "component5", "()Lcom/stripe/android/model/SourceOrder$Shipping;", "amount", "currency", "email", "items", "shipping", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/SourceOrder$Shipping;)Lcom/stripe/android/model/SourceOrder;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/SourceOrder$Shipping;", "getShipping", "Ljava/lang/Integer;", "getAmount", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getEmail", "getCurrency", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/SourceOrder$Shipping;)V", "Item", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceOrder.kt */
public final class SourceOrder implements StripeModel {
    public static final Parcelable.Creator<SourceOrder> CREATOR = new Creator();
    private final Integer amount;
    private final String currency;
    private final String email;
    private final List<Item> items;
    private final Shipping shipping;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SourceOrder> {
        public final SourceOrder createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Item.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new SourceOrder(valueOf, readString, readString2, arrayList, parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null);
        }

        public final SourceOrder[] newArray(int i) {
            return new SourceOrder[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0001-BA\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007JJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\nR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010\u0007R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010\u0004R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b)\u0010\nR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b*\u0010\u0007¨\u0006."}, d2 = {"Lcom/stripe/android/model/SourceOrder$Item;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/SourceOrder$Item$Type;", "component1", "()Lcom/stripe/android/model/SourceOrder$Item$Type;", "", "component2", "()Ljava/lang/Integer;", "", "component3", "()Ljava/lang/String;", "component4", "component5", "type", "amount", "currency", "description", "quantity", "copy", "(Lcom/stripe/android/model/SourceOrder$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/model/SourceOrder$Item;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCurrency", "Ljava/lang/Integer;", "getQuantity", "Lcom/stripe/android/model/SourceOrder$Item$Type;", "getType", "getDescription", "getAmount", "<init>", "(Lcom/stripe/android/model/SourceOrder$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrder.kt */
    public static final class Item implements StripeModel {
        public static final Parcelable.Creator<Item> CREATOR = new Creator();
        private final Integer amount;
        private final String currency;
        private final String description;
        private final Integer quantity;
        private final Type type;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Item> {
            public final Item createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Item((Type) Enum.valueOf(Type.class, parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Item[] newArray(int i) {
                return new Item[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/SourceOrder$Item$Type;", "", "", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Sku", "Tax", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceOrder.kt */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping("shipping");
            
            public static final Companion Companion = null;
            /* access modifiers changed from: private */
            public final String code;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;", "", "", "code", "Lcom/stripe/android/model/SourceOrder$Item$Type;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/SourceOrder$Item$Type;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: SourceOrder.kt */
            public static final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Type fromCode$payments_core_release(String str) {
                    Type[] values = Type.values();
                    for (int i = 0; i < 3; i++) {
                        Type type = values[i];
                        if (i.a(type.code, str)) {
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
        }

        public Item(Type type2, Integer num, String str, String str2, Integer num2) {
            i.e(type2, "type");
            this.type = type2;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.quantity = num2;
        }

        public static /* synthetic */ Item copy$default(Item item, Type type2, Integer num, String str, String str2, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = item.type;
            }
            if ((i & 2) != 0) {
                num = item.amount;
            }
            Integer num3 = num;
            if ((i & 4) != 0) {
                str = item.currency;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = item.description;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                num2 = item.quantity;
            }
            return item.copy(type2, num3, str3, str4, num2);
        }

        public final Type component1() {
            return this.type;
        }

        public final Integer component2() {
            return this.amount;
        }

        public final String component3() {
            return this.currency;
        }

        public final String component4() {
            return this.description;
        }

        public final Integer component5() {
            return this.quantity;
        }

        public final Item copy(Type type2, Integer num, String str, String str2, Integer num2) {
            i.e(type2, "type");
            return new Item(type2, num, str, str2, num2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return i.a(this.type, item.type) && i.a(this.amount, item.amount) && i.a(this.currency, item.currency) && i.a(this.description, item.description) && i.a(this.quantity, item.quantity);
        }

        public final Integer getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            Type type2 = this.type;
            int i = 0;
            int hashCode = (type2 != null ? type2.hashCode() : 0) * 31;
            Integer num = this.amount;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.currency;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num2 = this.quantity;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Item(type=");
            P0.append(this.type);
            P0.append(", amount=");
            P0.append(this.amount);
            P0.append(", currency=");
            P0.append(this.currency);
            P0.append(", description=");
            P0.append(this.description);
            P0.append(", quantity=");
            P0.append(this.quantity);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.type.name());
            Integer num = this.amount;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.currency);
            parcel.writeString(this.description);
            Integer num2 = this.quantity;
            if (num2 != null) {
                a.i(parcel, 1, num2);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Item(Type type2, Integer num, String str, String str2, Integer num2, int i, f fVar) {
            this(type2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BE\b\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007JL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0004R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b&\u0010\u0007R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b'\u0010\u0007R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b(\u0010\u0007¨\u0006+"}, d2 = {"Lcom/stripe/android/model/SourceOrder$Shipping;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "address", "carrier", "name", "phone", "trackingNumber", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceOrder$Shipping;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPhone", "Lcom/stripe/android/model/Address;", "getAddress", "getName", "getCarrier", "getTrackingNumber", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrder.kt */
    public static final class Shipping implements StripeModel {
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Shipping> {
            public final Shipping createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Shipping(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        public Shipping() {
            this((Address) null, (String) null, (String) null, (String) null, (String) null, 31, (f) null);
        }

        public Shipping(Address address2, String str, String str2, String str3, String str4) {
            this.address = address2;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address2, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address2 = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.carrier;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = shipping.name;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address2, str5, str6, str7, str4);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.carrier;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final String component5() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address2, String str, String str2, String str3, String str4) {
            return new Shipping(address2, str, str2, str3, str4);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) obj;
            return i.a(this.address, shipping.address) && i.a(this.carrier, shipping.carrier) && i.a(this.name, shipping.name) && i.a(this.phone, shipping.phone) && i.a(this.trackingNumber, shipping.trackingNumber);
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public int hashCode() {
            Address address2 = this.address;
            int i = 0;
            int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.trackingNumber;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Shipping(address=");
            P0.append(this.address);
            P0.append(", carrier=");
            P0.append(this.carrier);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", phone=");
            P0.append(this.phone);
            P0.append(", trackingNumber=");
            return a.y0(P0, this.trackingNumber, ")");
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
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Shipping(com.stripe.android.model.Address r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, m0.n.b.f r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = r0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = r0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r1
                r8 = r2
                r9 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.SourceOrder.Shipping.<init>(com.stripe.android.model.Address, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
        }
    }

    public SourceOrder() {
        this((Integer) null, (String) null, (String) null, (List) null, (Shipping) null, 31, (f) null);
    }

    public SourceOrder(Integer num, String str, String str2, List<Item> list, Shipping shipping2) {
        i.e(list, "items");
        this.amount = num;
        this.currency = str;
        this.email = str2;
        this.items = list;
        this.shipping = shipping2;
    }

    public static /* synthetic */ SourceOrder copy$default(SourceOrder sourceOrder, Integer num, String str, String str2, List<Item> list, Shipping shipping2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sourceOrder.amount;
        }
        if ((i & 2) != 0) {
            str = sourceOrder.currency;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = sourceOrder.email;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = sourceOrder.items;
        }
        List<Item> list2 = list;
        if ((i & 16) != 0) {
            shipping2 = sourceOrder.shipping;
        }
        return sourceOrder.copy(num, str3, str4, list2, shipping2);
    }

    public final Integer component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.email;
    }

    public final List<Item> component4() {
        return this.items;
    }

    public final Shipping component5() {
        return this.shipping;
    }

    public final SourceOrder copy(Integer num, String str, String str2, List<Item> list, Shipping shipping2) {
        i.e(list, "items");
        return new SourceOrder(num, str, str2, list, shipping2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceOrder)) {
            return false;
        }
        SourceOrder sourceOrder = (SourceOrder) obj;
        return i.a(this.amount, sourceOrder.amount) && i.a(this.currency, sourceOrder.currency) && i.a(this.email, sourceOrder.email) && i.a(this.items, sourceOrder.items) && i.a(this.shipping, sourceOrder.shipping);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public int hashCode() {
        Integer num = this.amount;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.email;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Item> list = this.items;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Shipping shipping2 = this.shipping;
        if (shipping2 != null) {
            i = shipping2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("SourceOrder(amount=");
        P0.append(this.amount);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", email=");
        P0.append(this.email);
        P0.append(", items=");
        P0.append(this.items);
        P0.append(", shipping=");
        P0.append(this.shipping);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        Integer num = this.amount;
        if (num != null) {
            a.i(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.currency);
        parcel.writeString(this.email);
        List<Item> list = this.items;
        parcel.writeInt(list.size());
        for (Item writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        Shipping shipping2 = this.shipping;
        if (shipping2 != null) {
            parcel.writeInt(1);
            shipping2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SourceOrder(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.util.List r8, com.stripe.android.model.SourceOrder.Shipping r9, int r10, m0.n.b.f r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.c
        L_0x001c:
            r3 = r8
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.SourceOrder.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.util.List, com.stripe.android.model.SourceOrder$Shipping, int, m0.n.b.f):void");
    }
}
