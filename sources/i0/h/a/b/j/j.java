package i0.h.a.b.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.SafeBrowsingData;
import h0.b0.v;

public final class j implements Parcelable.Creator<SafeBrowsingData> {
    public static void a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, safeBrowsingData.c, false);
        v.A2(parcel, 3, safeBrowsingData.d, i, false);
        v.A2(parcel, 4, safeBrowsingData.q, i, false);
        long j = safeBrowsingData.x;
        v.J2(parcel, 5, 8);
        parcel.writeLong(j);
        v.x2(parcel, 6, safeBrowsingData.y, false);
        v.L2(parcel, G2);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = h0.b0.v.r2(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r10 = r7
            r8 = r2
        L_0x000c:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0050
            int r1 = r12.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 2
            if (r2 == r3) goto L_0x004b
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r3 = 4
            if (r2 == r3) goto L_0x0037
            r3 = 5
            if (r2 == r3) goto L_0x0032
            r3 = 6
            if (r2 == r3) goto L_0x002d
            h0.b0.v.i2(r12, r1)
            goto L_0x000c
        L_0x002d:
            byte[] r10 = h0.b0.v.J(r12, r1)
            goto L_0x000c
        L_0x0032:
            long r8 = h0.b0.v.H1(r12, r1)
            goto L_0x000c
        L_0x0037:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r12, r1, r2)
            r7 = r1
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7
            goto L_0x000c
        L_0x0041:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r2 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r12, r1, r2)
            r6 = r1
            com.google.android.gms.common.data.DataHolder r6 = (com.google.android.gms.common.data.DataHolder) r6
            goto L_0x000c
        L_0x004b:
            java.lang.String r5 = h0.b0.v.N(r12, r1)
            goto L_0x000c
        L_0x0050:
            h0.b0.v.a0(r12, r0)
            com.google.android.gms.safetynet.SafeBrowsingData r12 = new com.google.android.gms.safetynet.SafeBrowsingData
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.j.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
