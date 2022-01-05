package i0.h.a.b.h;

import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public final class i implements Parcelable.Creator<StreetViewPanoramaOptions> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = h0.b0.v.r2(r15)
            r1 = 0
            r2 = 0
            r8 = r1
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r13 = r7
        L_0x0010:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x0077
            int r1 = r15.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r1
            switch(r3) {
                case 2: goto L_0x006d;
                case 3: goto L_0x0068;
                case 4: goto L_0x005e;
                case 5: goto L_0x0048;
                case 6: goto L_0x0043;
                case 7: goto L_0x003e;
                case 8: goto L_0x0039;
                case 9: goto L_0x0034;
                case 10: goto L_0x002f;
                case 11: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            h0.b0.v.i2(r15, r1)
            goto L_0x0010
        L_0x0025:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.StreetViewSource> r3 = com.google.android.gms.maps.model.StreetViewSource.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r15, r1, r3)
            r13 = r1
            com.google.android.gms.maps.model.StreetViewSource r13 = (com.google.android.gms.maps.model.StreetViewSource) r13
            goto L_0x0010
        L_0x002f:
            byte r12 = h0.b0.v.B1(r15, r1)
            goto L_0x0010
        L_0x0034:
            byte r11 = h0.b0.v.B1(r15, r1)
            goto L_0x0010
        L_0x0039:
            byte r10 = h0.b0.v.B1(r15, r1)
            goto L_0x0010
        L_0x003e:
            byte r9 = h0.b0.v.B1(r15, r1)
            goto L_0x0010
        L_0x0043:
            byte r8 = h0.b0.v.B1(r15, r1)
            goto L_0x0010
        L_0x0048:
            int r1 = h0.b0.v.I1(r15, r1)
            if (r1 != 0) goto L_0x0050
            r7 = r2
            goto L_0x0010
        L_0x0050:
            r3 = 4
            h0.b0.v.K2(r15, r1, r3)
            int r1 = r15.readInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = r1
            goto L_0x0010
        L_0x005e:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r15, r1, r3)
            r6 = r1
            com.google.android.gms.maps.model.LatLng r6 = (com.google.android.gms.maps.model.LatLng) r6
            goto L_0x0010
        L_0x0068:
            java.lang.String r5 = h0.b0.v.N(r15, r1)
            goto L_0x0010
        L_0x006d:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.StreetViewPanoramaCamera> r3 = com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r15, r1, r3)
            r4 = r1
            com.google.android.gms.maps.model.StreetViewPanoramaCamera r4 = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) r4
            goto L_0x0010
        L_0x0077:
            h0.b0.v.a0(r15, r0)
            com.google.android.gms.maps.StreetViewPanoramaOptions r15 = new com.google.android.gms.maps.StreetViewPanoramaOptions
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.h.i.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
