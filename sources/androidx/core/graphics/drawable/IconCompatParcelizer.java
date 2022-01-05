package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;
import java.util.Objects;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = versionedParcel.k(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (versionedParcel.i(2)) {
            bArr = versionedParcel.g();
        }
        iconCompat.d = bArr;
        iconCompat.e = versionedParcel.m(iconCompat.e, 3);
        iconCompat.f = versionedParcel.k(iconCompat.f, 4);
        iconCompat.g = versionedParcel.k(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) versionedParcel.m(iconCompat.h, 6);
        String str = iconCompat.j;
        if (versionedParcel.i(7)) {
            str = versionedParcel.n();
        }
        iconCompat.j = str;
        String str2 = iconCompat.k;
        if (versionedParcel.i(8)) {
            str2 = versionedParcel.n();
        }
        iconCompat.k = str2;
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case -1:
                Parcelable parcelable = iconCompat.e;
                if (parcelable != null) {
                    iconCompat.c = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.e;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.d;
                    iconCompat.c = bArr2;
                    iconCompat.b = 3;
                    iconCompat.f = 0;
                    iconCompat.g = bArr2.length;
                    break;
                } else {
                    iconCompat.c = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.d, Charset.forName("UTF-16"));
                iconCompat.c = str3;
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.c = iconCompat.d;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case -1:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((String) iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (-1 != i) {
            versionedParcel.p(1);
            versionedParcel.t(i);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.r(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.u(parcelable);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            versionedParcel.p(4);
            versionedParcel.t(i2);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            versionedParcel.p(5);
            versionedParcel.t(i3);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.u(colorStateList);
        }
        String str = iconCompat.j;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.v(str);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.v(str2);
        }
    }
}
