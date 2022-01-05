package com.clubhouse.android.ui.channels.users.recent;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.i;

/* compiled from: RecentlyDepartedSpeakersFragment.kt */
public final class RecentlyDepartedSpeakersArgs implements Parcelable {
    public static final Parcelable.Creator<RecentlyDepartedSpeakersArgs> CREATOR = new a();
    public final List<UserInChannel> c;
    public final Channel d;
    public final Uri q;

    /* compiled from: RecentlyDepartedSpeakersFragment.kt */
    public static final class a implements Parcelable.Creator<RecentlyDepartedSpeakersArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(RecentlyDepartedSpeakersArgs.class.getClassLoader()));
            }
            return new RecentlyDepartedSpeakersArgs(arrayList, (Channel) parcel.readParcelable(RecentlyDepartedSpeakersArgs.class.getClassLoader()), (Uri) parcel.readParcelable(RecentlyDepartedSpeakersArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new RecentlyDepartedSpeakersArgs[i];
        }
    }

    public RecentlyDepartedSpeakersArgs(List<UserInChannel> list, Channel channel, Uri uri) {
        i.e(list, "recentSpeakers");
        i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.c = list;
        this.d = channel;
        this.q = uri;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyDepartedSpeakersArgs)) {
            return false;
        }
        RecentlyDepartedSpeakersArgs recentlyDepartedSpeakersArgs = (RecentlyDepartedSpeakersArgs) obj;
        return i.a(this.c, recentlyDepartedSpeakersArgs.c) && i.a(this.d, recentlyDepartedSpeakersArgs.d) && i.a(this.q, recentlyDepartedSpeakersArgs.q);
    }

    public int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Uri uri = this.q;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("RecentlyDepartedSpeakersArgs(recentSpeakers=");
        P0.append(this.c);
        P0.append(", channel=");
        P0.append(this.d);
        P0.append(", reportImageUri=");
        P0.append(this.q);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<UserInChannel> list = this.c;
        parcel.writeInt(list.size());
        for (UserInChannel writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.q, i);
    }
}
