package com.stripe.android.stripe3ds2.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Stripe3ds2AuthParams;
import g0.a.b.b.a;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/ParcelUtils;", "", "Landroid/os/Parcelable;", "SOURCE", "source", "Landroid/os/Parcelable$Creator;", "creator", "copy", "(Landroid/os/Parcelable;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;", "Source", "get$3ds2sdk_release", "(Landroid/os/Parcelable;)Landroid/os/Parcelable;", "get", "", "KEY", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ParcelUtils.kt */
public final class ParcelUtils {
    public static final ParcelUtils INSTANCE = new ParcelUtils();
    private static final String KEY = "parcelable";

    private ParcelUtils() {
    }

    public static final <SOURCE extends Parcelable> SOURCE copy(SOURCE source, Parcelable.Creator<SOURCE> creator) {
        i.e(source, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(creator, "creator");
        Parcel obtain = Parcel.obtain();
        i.d(obtain, "Parcel.obtain()");
        source.writeToParcel(obtain, source.describeContents());
        obtain.setDataPosition(0);
        SOURCE createFromParcel = creator.createFromParcel(obtain);
        i.d(createFromParcel, "creator.createFromParcel(parcel)");
        return (Parcelable) createFromParcel;
    }

    public final <Source extends Parcelable> Source get$3ds2sdk_release(Source source) {
        i.e(source, Stripe3ds2AuthParams.FIELD_SOURCE);
        Source parcelable = a.g(new Pair(KEY, source)).getParcelable(KEY);
        if (parcelable != null) {
            return parcelable;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
