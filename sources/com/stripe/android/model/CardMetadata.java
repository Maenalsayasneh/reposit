package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.cards.Bin;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0004R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\b¨\u0006%"}, d2 = {"Lcom/stripe/android/model/CardMetadata;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/cards/Bin;", "component1", "()Lcom/stripe/android/cards/Bin;", "", "Lcom/stripe/android/model/AccountRange;", "component2", "()Ljava/util/List;", "bin", "accountRanges", "copy", "(Lcom/stripe/android/cards/Bin;Ljava/util/List;)Lcom/stripe/android/model/CardMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/cards/Bin;", "getBin", "Ljava/util/List;", "getAccountRanges", "<init>", "(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardMetadata.kt */
public final class CardMetadata implements StripeModel {
    public static final Parcelable.Creator<CardMetadata> CREATOR = new Creator();
    private final List<AccountRange> accountRanges;
    private final Bin bin;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<CardMetadata> {
        public final CardMetadata createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            Bin createFromParcel = Bin.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(AccountRange.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new CardMetadata(createFromParcel, arrayList);
        }

        public final CardMetadata[] newArray(int i) {
            return new CardMetadata[i];
        }
    }

    public CardMetadata(Bin bin2, List<AccountRange> list) {
        i.e(bin2, "bin");
        i.e(list, "accountRanges");
        this.bin = bin2;
        this.accountRanges = list;
    }

    public static /* synthetic */ CardMetadata copy$default(CardMetadata cardMetadata, Bin bin2, List<AccountRange> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bin2 = cardMetadata.bin;
        }
        if ((i & 2) != 0) {
            list = cardMetadata.accountRanges;
        }
        return cardMetadata.copy(bin2, list);
    }

    public final Bin component1() {
        return this.bin;
    }

    public final List<AccountRange> component2() {
        return this.accountRanges;
    }

    public final CardMetadata copy(Bin bin2, List<AccountRange> list) {
        i.e(bin2, "bin");
        i.e(list, "accountRanges");
        return new CardMetadata(bin2, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardMetadata)) {
            return false;
        }
        CardMetadata cardMetadata = (CardMetadata) obj;
        return i.a(this.bin, cardMetadata.bin) && i.a(this.accountRanges, cardMetadata.accountRanges);
    }

    public final List<AccountRange> getAccountRanges() {
        return this.accountRanges;
    }

    public final Bin getBin() {
        return this.bin;
    }

    public int hashCode() {
        Bin bin2 = this.bin;
        int i = 0;
        int hashCode = (bin2 != null ? bin2.hashCode() : 0) * 31;
        List<AccountRange> list = this.accountRanges;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CardMetadata(bin=");
        P0.append(this.bin);
        P0.append(", accountRanges=");
        P0.append(this.accountRanges);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        this.bin.writeToParcel(parcel, 0);
        List<AccountRange> list = this.accountRanges;
        parcel.writeInt(list.size());
        for (AccountRange writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }
}
