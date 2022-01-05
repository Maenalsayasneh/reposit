package com.clubhouse.android.ui.invites;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: PendingInvitesFragment.kt */
public final class PendingInvitesArgs implements Parcelable {
    public static final Parcelable.Creator<PendingInvitesArgs> CREATOR = new a();
    public final List<SuggestedInvite> c;

    /* compiled from: PendingInvitesFragment.kt */
    public static final class a implements Parcelable.Creator<PendingInvitesArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(PendingInvitesArgs.class.getClassLoader()));
            }
            return new PendingInvitesArgs(arrayList);
        }

        public Object[] newArray(int i) {
            return new PendingInvitesArgs[i];
        }
    }

    public PendingInvitesArgs(List<SuggestedInvite> list) {
        i.e(list, "pendingInvites");
        this.c = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PendingInvitesArgs) && i.a(this.c, ((PendingInvitesArgs) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.A0(i0.d.a.a.a.P0("PendingInvitesArgs(pendingInvites="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<SuggestedInvite> list = this.c;
        parcel.writeInt(list.size());
        for (SuggestedInvite writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public PendingInvitesArgs() {
        this(EmptyList.c);
    }
}
