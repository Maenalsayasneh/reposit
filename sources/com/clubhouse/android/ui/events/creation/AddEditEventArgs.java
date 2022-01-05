package com.clubhouse.android.ui.events.creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.EventInClub;
import m0.n.b.i;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventArgs implements Parcelable {
    public static final Parcelable.Creator<AddEditEventArgs> CREATOR = new a();
    public final EventInClub c;

    /* compiled from: AddEditEventFragment.kt */
    public static final class a implements Parcelable.Creator<AddEditEventArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new AddEditEventArgs((EventInClub) parcel.readParcelable(AddEditEventArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new AddEditEventArgs[i];
        }
    }

    public AddEditEventArgs() {
        this.c = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddEditEventArgs) && i.a(this.c, ((AddEditEventArgs) obj).c);
    }

    public int hashCode() {
        EventInClub eventInClub = this.c;
        if (eventInClub == null) {
            return 0;
        }
        return eventInClub.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AddEditEventArgs(event=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
    }

    public AddEditEventArgs(EventInClub eventInClub) {
        this.c = eventInClub;
    }

    public AddEditEventArgs(EventInClub eventInClub, int i) {
        int i2 = i & 1;
        this.c = null;
    }
}
