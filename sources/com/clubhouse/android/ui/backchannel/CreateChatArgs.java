package com.clubhouse.android.ui.backchannel;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.n.b.i;

/* compiled from: CreateChatArgs.kt */
public final class CreateChatArgs implements Parcelable {
    public static final Parcelable.Creator<CreateChatArgs> CREATOR = new a();
    public final SourceLocation c;
    public final Integer d;

    /* compiled from: CreateChatArgs.kt */
    public static final class a implements Parcelable.Creator<CreateChatArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new CreateChatArgs(SourceLocation.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public Object[] newArray(int i) {
            return new CreateChatArgs[i];
        }
    }

    public CreateChatArgs(SourceLocation sourceLocation, Integer num) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c = sourceLocation;
        this.d = num;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChatArgs)) {
            return false;
        }
        CreateChatArgs createChatArgs = (CreateChatArgs) obj;
        return this.c == createChatArgs.c && i.a(this.d, createChatArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreateChatArgs(source=");
        P0.append(this.c);
        P0.append(", userId=");
        return i0.d.a.a.a.v0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "out");
        parcel.writeString(this.c.name());
        Integer num = this.d;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }
}
