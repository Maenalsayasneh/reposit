package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i0.h.a.b.j.j;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new j();
    public String c;
    public DataHolder d;
    public ParcelFileDescriptor q;
    public long x;
    public byte[] y;

    static {
        Class<SafeBrowsingData> cls = SafeBrowsingData.class;
    }

    public SafeBrowsingData() {
        this.c = null;
        this.d = null;
        this.q = null;
        this.x = 0;
        this.y = null;
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.c = str;
        this.d = dataHolder;
        this.q = parcelFileDescriptor;
        this.x = j;
        this.y = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.q;
        j.a(this, parcel, i);
        this.q = null;
    }
}
