package com.clubhouse.android.channels.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import m0.n.b.i;

/* compiled from: ChannelArgs.kt */
public final class ChannelArgs implements Parcelable {
    public static final Parcelable.Creator<ChannelArgs> CREATOR = new a();
    public final String c;
    public final SourceLocation d;

    /* compiled from: ChannelArgs.kt */
    public static final class a implements Parcelable.Creator<ChannelArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ChannelArgs(parcel.readString(), SourceLocation.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new ChannelArgs[i];
        }
    }

    public ChannelArgs(String str, SourceLocation sourceLocation) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(sourceLocation, "sourceLocation");
        this.c = str;
        this.d = sourceLocation;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelArgs)) {
            return false;
        }
        ChannelArgs channelArgs = (ChannelArgs) obj;
        return i.a(this.c, channelArgs.c) && this.d == channelArgs.d;
    }

    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelArgs(channel=");
        P0.append(this.c);
        P0.append(", sourceLocation=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }
}
