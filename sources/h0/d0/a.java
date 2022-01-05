package h0.d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
public class a extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new h0.f.a(), new h0.f.a(), new h0.f.a());
    }

    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(dataPosition - i3);
            this.e.setDataPosition(dataPosition);
        }
    }

    public VersionedParcel b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        return new a(parcel, dataPosition, i2, i0.d.a.a.a.y0(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    public boolean f() {
        return this.e.readInt() != 0;
    }

    public byte[] g() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    public boolean i(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        if (this.k == i2) {
            return true;
        }
        return false;
    }

    public int j() {
        return this.e.readInt();
    }

    public <T extends Parcelable> T l() {
        return this.e.readParcelable(a.class.getClassLoader());
    }

    public String n() {
        return this.e.readString();
    }

    public void p(int i2) {
        a();
        this.i = i2;
        this.d.put(i2, this.e.dataPosition());
        this.e.writeInt(0);
        this.e.writeInt(i2);
    }

    public void q(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
            return;
        }
        this.e.writeInt(-1);
    }

    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    public void t(int i2) {
        this.e.writeInt(i2);
    }

    public void u(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    public void v(String str) {
        this.e.writeString(str);
    }

    public a(Parcel parcel, int i2, int i3, String str, h0.f.a<String, Method> aVar, h0.f.a<String, Method> aVar2, h0.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }
}
