package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h0.o.a.c0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    public final String Y1;
    public final int Z1;
    public final int a2;
    public final CharSequence b2;
    public final int[] c;
    public final int c2;
    public final ArrayList<String> d;
    public final CharSequence d2;
    public final ArrayList<String> e2;
    public final ArrayList<String> f2;
    public final boolean g2;
    public final int[] q;
    public final int[] x;
    public final int y;

    public class a implements Parcelable.Creator<BackStackState> {
        public Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public Object[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(h0.o.a.a aVar) {
        int size = aVar.c.size();
        this.c = new int[(size * 5)];
        if (aVar.i) {
            this.d = new ArrayList<>(size);
            this.q = new int[size];
            this.x = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                c0.a aVar2 = aVar.c.get(i);
                int i3 = i2 + 1;
                this.c[i2] = aVar2.a;
                ArrayList<String> arrayList = this.d;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.c;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.e;
                iArr[i6] = aVar2.f;
                this.q[i] = aVar2.g.ordinal();
                this.x[i] = aVar2.h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.y = aVar.h;
            this.Y1 = aVar.k;
            this.Z1 = aVar.u;
            this.a2 = aVar.l;
            this.b2 = aVar.m;
            this.c2 = aVar.n;
            this.d2 = aVar.o;
            this.e2 = aVar.p;
            this.f2 = aVar.q;
            this.g2 = aVar.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.d);
        parcel.writeIntArray(this.q);
        parcel.writeIntArray(this.x);
        parcel.writeInt(this.y);
        parcel.writeString(this.Y1);
        parcel.writeInt(this.Z1);
        parcel.writeInt(this.a2);
        TextUtils.writeToParcel(this.b2, parcel, 0);
        parcel.writeInt(this.c2);
        TextUtils.writeToParcel(this.d2, parcel, 0);
        parcel.writeStringList(this.e2);
        parcel.writeStringList(this.f2);
        parcel.writeInt(this.g2 ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.c = parcel.createIntArray();
        this.d = parcel.createStringArrayList();
        this.q = parcel.createIntArray();
        this.x = parcel.createIntArray();
        this.y = parcel.readInt();
        this.Y1 = parcel.readString();
        this.Z1 = parcel.readInt();
        this.a2 = parcel.readInt();
        this.b2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c2 = parcel.readInt();
        this.d2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.e2 = parcel.createStringArrayList();
        this.f2 = parcel.createStringArrayList();
        this.g2 = parcel.readInt() != 0;
    }
}
