package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0003)*+B'\b\u0007\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R!\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\u000bR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\u000e¨\u0006,"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "", "Lcom/stripe/android/model/SourceOrderParams$Item;", "component1", "()Ljava/util/List;", "Lcom/stripe/android/model/SourceOrderParams$Shipping;", "component2", "()Lcom/stripe/android/model/SourceOrderParams$Shipping;", "items", "shipping", "copy", "(Ljava/util/List;Lcom/stripe/android/model/SourceOrderParams$Shipping;)Lcom/stripe/android/model/SourceOrderParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Lcom/stripe/android/model/SourceOrderParams$Shipping;", "getShipping", "<init>", "(Ljava/util/List;Lcom/stripe/android/model/SourceOrderParams$Shipping;)V", "Companion", "Item", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SourceOrderParams.kt */
public final class SourceOrderParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<SourceOrderParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_ITEMS = "items";
    @Deprecated
    private static final String PARAM_SHIPPING = "shipping";
    private final List<Item> items;
    private final Shipping shipping;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Companion;", "", "", "PARAM_ITEMS", "Ljava/lang/String;", "PARAM_SHIPPING", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrderParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SourceOrderParams> {
        public final SourceOrderParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "in");
            Shipping shipping = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Item.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                shipping = Shipping.CREATOR.createFromParcel(parcel);
            }
            return new SourceOrderParams(arrayList, shipping);
        }

        public final SourceOrderParams[] newArray(int i) {
            return new SourceOrderParams[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000245BO\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJX\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\u000fR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b+\u0010\u000fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010\nR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u0010\rR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b0\u0010\rR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b1\u0010\u000f¨\u00066"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "component1", "()Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "type", "amount", "currency", "description", "parent", "quantity", "copy", "(Lcom/stripe/android/model/SourceOrderParams$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/model/SourceOrderParams$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "getParent", "Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "getType", "Ljava/lang/Integer;", "getAmount", "getQuantity", "getCurrency", "<init>", "(Lcom/stripe/android/model/SourceOrderParams$Item$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrderParams.kt */
    public static final class Item implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_AMOUNT = "amount";
        @Deprecated
        private static final String PARAM_CURRENCY = "currency";
        @Deprecated
        private static final String PARAM_DESCRIPTION = "description";
        @Deprecated
        private static final String PARAM_PARENT = "parent";
        @Deprecated
        private static final String PARAM_QUANTITY = "quantity";
        @Deprecated
        private static final String PARAM_TYPE = "type";
        private final Integer amount;
        private final String currency;
        private final String description;
        private final String parent;
        private final Integer quantity;
        private final Type type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item$Companion;", "", "", "PARAM_AMOUNT", "Ljava/lang/String;", "PARAM_CURRENCY", "PARAM_DESCRIPTION", "PARAM_PARENT", "PARAM_QUANTITY", "PARAM_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceOrderParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Item> {
            public final Item createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Item(parcel.readInt() != 0 ? (Type) Enum.valueOf(Type.class, parcel.readString()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Item[] newArray(int i) {
                return new Item[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Item$Type;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Sku", "Tax", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceOrderParams.kt */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping(SourceOrderParams.PARAM_SHIPPING);
            
            private final String code;

            private Type(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public Item() {
            this((Type) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, 63, (f) null);
        }

        public Item(Type type2, Integer num, String str, String str2, String str3, Integer num2) {
            this.type = type2;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.parent = str3;
            this.quantity = num2;
        }

        public static /* synthetic */ Item copy$default(Item item, Type type2, Integer num, String str, String str2, String str3, Integer num2, int i, Object obj) {
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
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = item.description;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = item.parent;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                num2 = item.quantity;
            }
            return item.copy(type2, num3, str4, str5, str6, num2);
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

        public final String component5() {
            return this.parent;
        }

        public final Integer component6() {
            return this.quantity;
        }

        public final Item copy(Type type2, Integer num, String str, String str2, String str3, Integer num2) {
            return new Item(type2, num, str, str2, str3, num2);
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
            return i.a(this.type, item.type) && i.a(this.amount, item.amount) && i.a(this.currency, item.currency) && i.a(this.description, item.description) && i.a(this.parent, item.parent) && i.a(this.quantity, item.quantity);
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

        public final String getParent() {
            return this.parent;
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
            String str3 = this.parent;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Integer num2 = this.quantity;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode5 + i;
        }

        public Map<String, Object> toParamMap() {
            Map o = g.o();
            Integer num = this.amount;
            Map map = null;
            Map S2 = num != null ? h.S2(new Pair(PARAM_AMOUNT, Integer.valueOf(num.intValue()))) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            String str = this.currency;
            Map S22 = str != null ? h.S2(new Pair(PARAM_CURRENCY, str)) : null;
            if (S22 == null) {
                S22 = g.o();
            }
            Map b02 = g.b0(b0, S22);
            String str2 = this.description;
            Map S23 = str2 != null ? h.S2(new Pair("description", str2)) : null;
            if (S23 == null) {
                S23 = g.o();
            }
            Map b03 = g.b0(b02, S23);
            String str3 = this.parent;
            Map S24 = str3 != null ? h.S2(new Pair(PARAM_PARENT, str3)) : null;
            if (S24 == null) {
                S24 = g.o();
            }
            Map b04 = g.b0(b03, S24);
            Integer num2 = this.quantity;
            Map S25 = num2 != null ? h.S2(new Pair(PARAM_QUANTITY, Integer.valueOf(num2.intValue()))) : null;
            if (S25 == null) {
                S25 = g.o();
            }
            Map b05 = g.b0(b04, S25);
            Type type2 = this.type;
            if (type2 != null) {
                map = h.S2(new Pair("type", type2.getCode$payments_core_release()));
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b05, map);
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
            P0.append(", parent=");
            P0.append(this.parent);
            P0.append(", quantity=");
            P0.append(this.quantity);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Type type2 = this.type;
            if (type2 != null) {
                parcel.writeInt(1);
                parcel.writeString(type2.name());
            } else {
                parcel.writeInt(0);
            }
            Integer num = this.amount;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.currency);
            parcel.writeString(this.description);
            parcel.writeString(this.parent);
            Integer num2 = this.quantity;
            if (num2 != null) {
                a.i(parcel, 1, num2);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Item(com.stripe.android.model.SourceOrderParams.Item.Type r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, int r12, m0.n.b.f r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                if (r6 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r7
            L_0x000f:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r8
            L_0x0016:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r9
            L_0x001d:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0023
                r4 = r0
                goto L_0x0024
            L_0x0023:
                r4 = r10
            L_0x0024:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002a
                r12 = r0
                goto L_0x002b
            L_0x002a:
                r12 = r11
            L_0x002b:
                r6 = r5
                r7 = r13
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.SourceOrderParams.Item.<init>(com.stripe.android.model.SourceOrderParams$Item$Type, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B?\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010\fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b(\u0010\fR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b)\u0010\fR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b*\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010\n¨\u00060"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "address", "carrier", "name", "phone", "trackingNumber", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SourceOrderParams$Shipping;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTrackingNumber", "getPhone", "getName", "getCarrier", "Lcom/stripe/android/model/Address;", "getAddress", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SourceOrderParams.kt */
    public static final class Shipping implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_CARRIER = "carrier";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        @Deprecated
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/SourceOrderParams$Shipping$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: SourceOrderParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Shipping> {
            public final Shipping createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        public Shipping(Address address2, String str, String str2, String str3, String str4) {
            i.e(address2, "address");
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
            i.e(address2, "address");
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

        public Map<String, Object> toParamMap() {
            Map S2 = h.S2(new Pair("address", this.address.toParamMap()));
            String str = this.carrier;
            Map map = null;
            Map S22 = str != null ? h.S2(new Pair("carrier", str)) : null;
            if (S22 == null) {
                S22 = g.o();
            }
            Map b0 = g.b0(S2, S22);
            String str2 = this.name;
            Map S23 = str2 != null ? h.S2(new Pair("name", str2)) : null;
            if (S23 == null) {
                S23 = g.o();
            }
            Map b02 = g.b0(b0, S23);
            String str3 = this.phone;
            Map S24 = str3 != null ? h.S2(new Pair("phone", str3)) : null;
            if (S24 == null) {
                S24 = g.o();
            }
            Map b03 = g.b0(b02, S24);
            String str4 = this.trackingNumber;
            if (str4 != null) {
                map = h.S2(new Pair(PARAM_TRACKING_NUMBER, str4));
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b03, map);
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
            this.address.writeToParcel(parcel, 0);
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Shipping(Address address2, String str, String str2, String str3, String str4, int i, f fVar) {
            this(address2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    public SourceOrderParams() {
        this((List) null, (Shipping) null, 3, (f) null);
    }

    public SourceOrderParams(List<Item> list) {
        this(list, (Shipping) null, 2, (f) null);
    }

    public SourceOrderParams(List<Item> list, Shipping shipping2) {
        this.items = list;
        this.shipping = shipping2;
    }

    public static /* synthetic */ SourceOrderParams copy$default(SourceOrderParams sourceOrderParams, List<Item> list, Shipping shipping2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sourceOrderParams.items;
        }
        if ((i & 2) != 0) {
            shipping2 = sourceOrderParams.shipping;
        }
        return sourceOrderParams.copy(list, shipping2);
    }

    public final List<Item> component1() {
        return this.items;
    }

    public final Shipping component2() {
        return this.shipping;
    }

    public final SourceOrderParams copy(List<Item> list, Shipping shipping2) {
        return new SourceOrderParams(list, shipping2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceOrderParams)) {
            return false;
        }
        SourceOrderParams sourceOrderParams = (SourceOrderParams) obj;
        return i.a(this.items, sourceOrderParams.items) && i.a(this.shipping, sourceOrderParams.shipping);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public int hashCode() {
        List<Item> list = this.items;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Shipping shipping2 = this.shipping;
        if (shipping2 != null) {
            i = shipping2.hashCode();
        }
        return hashCode + i;
    }

    public Map<String, Object> toParamMap() {
        Map map;
        Map o = g.o();
        List<Item> list = this.items;
        Map map2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (Item paramMap : list) {
                arrayList.add(paramMap.toParamMap());
            }
            map = h.S2(new Pair(PARAM_ITEMS, arrayList));
        } else {
            map = null;
        }
        if (map == null) {
            map = g.o();
        }
        Map b0 = g.b0(o, map);
        Shipping shipping2 = this.shipping;
        if (shipping2 != null) {
            map2 = h.S2(new Pair(PARAM_SHIPPING, shipping2.toParamMap()));
        }
        if (map2 == null) {
            map2 = g.o();
        }
        return g.b0(b0, map2);
    }

    public String toString() {
        StringBuilder P0 = a.P0("SourceOrderParams(items=");
        P0.append(this.items);
        P0.append(", shipping=");
        P0.append(this.shipping);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        List<Item> list = this.items;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Item writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Shipping shipping2 = this.shipping;
        if (shipping2 != null) {
            parcel.writeInt(1);
            shipping2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SourceOrderParams(List list, Shipping shipping2, int i, f fVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : shipping2);
    }
}
