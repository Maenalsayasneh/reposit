package com.clubhouse.backchannel.chat;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: BackchannelChatFragment.kt */
public final class ChatArgs implements Parcelable {
    public static final Parcelable.Creator<ChatArgs> CREATOR = new a();
    public final String c;

    /* compiled from: BackchannelChatFragment.kt */
    public static final class a implements Parcelable.Creator<ChatArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ChatArgs(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ChatArgs[i];
        }
    }

    public ChatArgs(String str) {
        i.e(str, "chatId");
        this.c = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatArgs) && i.a(this.c, ((ChatArgs) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.x0(i0.d.a.a.a.P0("ChatArgs(chatId="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
    }
}
