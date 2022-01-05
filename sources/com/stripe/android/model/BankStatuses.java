package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.view.Bank;
import i0.d.a.a.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\tJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006$"}, d2 = {"Lcom/stripe/android/model/BankStatuses;", "Lcom/stripe/android/model/StripeModel;", "", "", "", "component1", "()Ljava/util/Map;", "", "size$payments_core_release", "()I", "size", "Lcom/stripe/android/view/Bank;", "bank", "isOnline$payments_core_release", "(Lcom/stripe/android/view/Bank;)Z", "isOnline", "statuses", "copy", "(Ljava/util/Map;)Lcom/stripe/android/model/BankStatuses;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BankStatuses.kt */
public final class BankStatuses implements StripeModel {
    public static final Parcelable.Creator<BankStatuses> CREATOR = new Creator();
    private final Map<String, Boolean> statuses;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<BankStatuses> {
        public final BankStatuses createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                readInt--;
            }
            return new BankStatuses(linkedHashMap);
        }

        public final BankStatuses[] newArray(int i) {
            return new BankStatuses[i];
        }
    }

    public BankStatuses() {
        this((Map) null, 1, (f) null);
    }

    public BankStatuses(Map<String, Boolean> map) {
        i.e(map, "statuses");
        this.statuses = map;
    }

    private final Map<String, Boolean> component1() {
        return this.statuses;
    }

    public static /* synthetic */ BankStatuses copy$default(BankStatuses bankStatuses, Map<String, Boolean> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = bankStatuses.statuses;
        }
        return bankStatuses.copy(map);
    }

    public final BankStatuses copy(Map<String, Boolean> map) {
        i.e(map, "statuses");
        return new BankStatuses(map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BankStatuses) && i.a(this.statuses, ((BankStatuses) obj).statuses);
        }
        return true;
    }

    public int hashCode() {
        Map<String, Boolean> map = this.statuses;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final /* synthetic */ boolean isOnline$payments_core_release(Bank bank) {
        i.e(bank, "bank");
        Boolean bool = this.statuses.get(bank.getId());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int size$payments_core_release() {
        return this.statuses.size();
    }

    public String toString() {
        StringBuilder P0 = a.P0("BankStatuses(statuses=");
        P0.append(this.statuses);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        Map<String, Boolean> map = this.statuses;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Boolean> next : map.entrySet()) {
            parcel.writeString(next.getKey());
            parcel.writeInt(next.getValue().booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankStatuses(Map map, int i, f fVar) {
        this((i & 1) != 0 ? g.o() : map);
    }
}
