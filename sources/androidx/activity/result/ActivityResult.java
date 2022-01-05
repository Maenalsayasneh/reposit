package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();
    public final int c;
    public final Intent d;

    public class a implements Parcelable.Creator<ActivityResult> {
        public Object createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        public Object[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.c = i;
        this.d = intent;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActivityResult{resultCode=");
        int i = this.c;
        P0.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        P0.append(", data=");
        P0.append(this.d);
        P0.append('}');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d == null ? 0 : 1);
        Intent intent = this.d;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.c = parcel.readInt();
        this.d = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
