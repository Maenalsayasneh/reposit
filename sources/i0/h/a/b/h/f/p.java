package i0.h.a.b.h.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i0.h.a.b.d.b;
import i0.h.a.b.g.g.a;
import i0.h.a.b.g.g.c;

public final class p extends a implements o {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.h.a.b.g.g.d B() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.L()
            r1 = 5
            android.os.Parcel r0 = r4.d0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            int r2 = i0.h.a.b.g.g.e.a
            if (r1 != 0) goto L_0x0013
            r1 = 0
            goto L_0x0027
        L_0x0013:
            java.lang.String r2 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof i0.h.a.b.g.g.d
            if (r3 == 0) goto L_0x0021
            r1 = r2
            i0.h.a.b.g.g.d r1 = (i0.h.a.b.g.g.d) r1
            goto L_0x0027
        L_0x0021:
            i0.h.a.b.g.g.f r2 = new i0.h.a.b.g.g.f
            r2.<init>(r1)
            r1 = r2
        L_0x0027:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.h.f.p.B():i0.h.a.b.g.g.d");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.h.a.b.h.f.a S() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.L()
            r1 = 4
            android.os.Parcel r0 = r4.d0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof i0.h.a.b.h.f.a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            i0.h.a.b.h.f.a r1 = (i0.h.a.b.h.f.a) r1
            goto L_0x0025
        L_0x001f:
            i0.h.a.b.h.f.h r2 = new i0.h.a.b.h.f.h
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.h.f.p.S():i0.h.a.b.h.f.a");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.h.a.b.h.f.e T(i0.h.a.b.d.b r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.L()
            i0.h.a.b.g.g.c.a(r0, r4)
            r4 = 8
            android.os.Parcel r4 = r3.d0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i0.h.a.b.h.f.e
            if (r2 == 0) goto L_0x0023
            r0 = r1
            i0.h.a.b.h.f.e r0 = (i0.h.a.b.h.f.e) r0
            goto L_0x0029
        L_0x0023:
            i0.h.a.b.h.f.l r1 = new i0.h.a.b.h.f.l
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.h.f.p.T(i0.h.a.b.d.b):i0.h.a.b.h.f.e");
    }

    public final void b0(b bVar, int i) throws RemoteException {
        Parcel L = L();
        c.a(L, bVar);
        L.writeInt(i);
        j0(6, L);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.h.a.b.h.f.c g0(i0.h.a.b.d.b r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.L()
            i0.h.a.b.g.g.c.a(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.d0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i0.h.a.b.h.f.c
            if (r2 == 0) goto L_0x0022
            r0 = r1
            i0.h.a.b.h.f.c r0 = (i0.h.a.b.h.f.c) r0
            goto L_0x0028
        L_0x0022:
            i0.h.a.b.h.f.r r1 = new i0.h.a.b.h.f.r
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.h.f.p.g0(i0.h.a.b.d.b):i0.h.a.b.h.f.c");
    }
}
