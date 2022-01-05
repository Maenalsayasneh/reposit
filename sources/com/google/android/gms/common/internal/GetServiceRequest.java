package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.c;
import i0.h.a.b.c.i.a;
import i0.h.a.b.c.i.f0;
import i0.h.a.b.c.i.g;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new f0();
    public Scope[] Y1;
    public Bundle Z1;
    public Account a2;
    public Feature[] b2;
    public final int c;
    public Feature[] c2;
    public final int d;
    public boolean d2;
    public int e2;
    public boolean f2;
    public final String g2;
    public int q;
    public String x;
    public IBinder y;

    public GetServiceRequest(int i, String str) {
        this.c = 6;
        this.q = c.a;
        this.d = i;
        this.d2 = true;
        this.g2 = str;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.q;
        v.J2(parcel, 3, 4);
        parcel.writeInt(i4);
        v.B2(parcel, 4, this.x, false);
        IBinder iBinder = this.y;
        if (iBinder != null) {
            int G22 = v.G2(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            v.L2(parcel, G22);
        }
        v.E2(parcel, 6, this.Y1, i, false);
        v.w2(parcel, 7, this.Z1, false);
        v.A2(parcel, 8, this.a2, i, false);
        v.E2(parcel, 10, this.b2, i, false);
        v.E2(parcel, 11, this.c2, i, false);
        boolean z = this.d2;
        v.J2(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = this.e2;
        v.J2(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = this.f2;
        v.J2(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        v.B2(parcel, 15, this.g2, false);
        v.L2(parcel, G2);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        this.c = i;
        this.d = i2;
        this.q = i3;
        if ("com.google.android.gms".equals(str)) {
            this.x = "com.google.android.gms";
        } else {
            this.x = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                g d0 = g.a.d0(iBinder);
                int i5 = a.a;
                if (d0 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = d0.a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.a2 = account2;
        } else {
            this.y = iBinder;
            this.a2 = account;
        }
        this.Y1 = scopeArr;
        this.Z1 = bundle;
        this.b2 = featureArr;
        this.c2 = featureArr2;
        this.d2 = z;
        this.e2 = i4;
        this.f2 = z2;
        this.g2 = str2;
    }
}
