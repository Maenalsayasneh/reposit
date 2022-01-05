package com.clubhouse.android.ui.profile.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.Topic;
import m0.n.b.i;

/* compiled from: EditTopicsFragment.kt */
public final class EditTopicsArgs implements Parcelable {
    public static final Parcelable.Creator<EditTopicsArgs> CREATOR = new a();
    public final Topic c;

    /* compiled from: EditTopicsFragment.kt */
    public static final class a implements Parcelable.Creator<EditTopicsArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new EditTopicsArgs((Topic) parcel.readParcelable(EditTopicsArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new EditTopicsArgs[i];
        }
    }

    public EditTopicsArgs() {
        this.c = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditTopicsArgs) && i.a(this.c, ((EditTopicsArgs) obj).c);
    }

    public int hashCode() {
        Topic topic = this.c;
        if (topic == null) {
            return 0;
        }
        return topic.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EditTopicsArgs(topicForAdding=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
    }

    public EditTopicsArgs(Topic topic) {
        this.c = topic;
    }

    public EditTopicsArgs(Topic topic, int i) {
        int i2 = i & 1;
        this.c = null;
    }
}
