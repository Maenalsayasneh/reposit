package i0.h.a.b.c.h;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class a implements Parcelable.Creator<DataHolder> {
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = h0.b0.v.r2(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r8 = r6
            r4 = r2
            r7 = r4
        L_0x000b:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x004b
            int r1 = r11.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r1
            r9 = 1
            if (r3 == r9) goto L_0x0046
            r9 = 2
            if (r3 == r9) goto L_0x003c
            r9 = 3
            if (r3 == r9) goto L_0x0037
            r9 = 4
            if (r3 == r9) goto L_0x0032
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r9) goto L_0x002d
            h0.b0.v.i2(r11, r1)
            goto L_0x000b
        L_0x002d:
            int r4 = h0.b0.v.G1(r11, r1)
            goto L_0x000b
        L_0x0032:
            android.os.Bundle r8 = h0.b0.v.I(r11, r1)
            goto L_0x000b
        L_0x0037:
            int r7 = h0.b0.v.G1(r11, r1)
            goto L_0x000b
        L_0x003c:
            android.os.Parcelable$Creator r3 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r1 = h0.b0.v.Q(r11, r1, r3)
            r6 = r1
            android.database.CursorWindow[] r6 = (android.database.CursorWindow[]) r6
            goto L_0x000b
        L_0x0046:
            java.lang.String[] r5 = h0.b0.v.O(r11, r1)
            goto L_0x000b
        L_0x004b:
            h0.b0.v.a0(r11, r0)
            com.google.android.gms.common.data.DataHolder r11 = new com.google.android.gms.common.data.DataHolder
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r11.q = r0
            r0 = r2
        L_0x005c:
            java.lang.String[] r1 = r11.d
            int r3 = r1.length
            if (r0 >= r3) goto L_0x006b
            android.os.Bundle r3 = r11.q
            r1 = r1[r0]
            r3.putInt(r1, r0)
            int r0 = r0 + 1
            goto L_0x005c
        L_0x006b:
            android.database.CursorWindow[] r0 = r11.x
            int r0 = r0.length
            int[] r0 = new int[r0]
            r11.Z1 = r0
            r0 = r2
        L_0x0073:
            android.database.CursorWindow[] r1 = r11.x
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0091
            int[] r3 = r11.Z1
            r3[r2] = r0
            r1 = r1[r2]
            int r1 = r1.getStartPosition()
            int r1 = r0 - r1
            android.database.CursorWindow[] r3 = r11.x
            r3 = r3[r2]
            int r3 = r3.getNumRows()
            int r3 = r3 - r1
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0091:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.h.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
