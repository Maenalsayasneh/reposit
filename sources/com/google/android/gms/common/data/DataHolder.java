package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.h.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @RecentlyNonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new a();
    public final Bundle Y1;
    public int[] Z1;
    public boolean a2 = false;
    public boolean b2 = true;
    public final int c;
    public final String[] d;
    public Bundle q;
    public final CursorWindow[] x;
    public final int y;

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static class zaa extends RuntimeException {
    }

    static {
        Objects.requireNonNull(new String[0], "null reference");
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.c = i;
        this.d = strArr;
        this.x = cursorWindowArr;
        this.y = i2;
        this.Y1 = bundle;
    }

    public final void close() {
        synchronized (this) {
            if (!this.a2) {
                this.a2 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.x;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.b2 && this.x.length > 0) {
                synchronized (this) {
                    z = this.a2;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.C2(parcel, 1, this.d, false);
        v.E2(parcel, 2, this.x, i, false);
        int i2 = this.y;
        v.J2(parcel, 3, 4);
        parcel.writeInt(i2);
        v.w2(parcel, 4, this.Y1, false);
        int i3 = this.c;
        v.J2(parcel, 1000, 4);
        parcel.writeInt(i3);
        v.L2(parcel, G2);
        if ((i & 1) != 0) {
            close();
        }
    }
}
