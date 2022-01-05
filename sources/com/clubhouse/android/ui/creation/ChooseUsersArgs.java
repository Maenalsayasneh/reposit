package com.clubhouse.android.ui.creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.UserInList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: ChooseUsersFragment.kt */
public final class ChooseUsersArgs implements Parcelable {
    public static final Parcelable.Creator<ChooseUsersArgs> CREATOR = new a();
    public final List<UserInList> c;

    /* compiled from: ChooseUsersFragment.kt */
    public static final class a implements Parcelable.Creator<ChooseUsersArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ChooseUsersArgs.class.getClassLoader()));
            }
            return new ChooseUsersArgs(arrayList);
        }

        public Object[] newArray(int i) {
            return new ChooseUsersArgs[i];
        }
    }

    public ChooseUsersArgs(List<UserInList> list) {
        i.e(list, "selectedUsers");
        this.c = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChooseUsersArgs) && i.a(this.c, ((ChooseUsersArgs) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.A0(i0.d.a.a.a.P0("ChooseUsersArgs(selectedUsers="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<UserInList> list = this.c;
        parcel.writeInt(list.size());
        for (UserInList writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public ChooseUsersArgs() {
        this(EmptyList.c);
    }
}
