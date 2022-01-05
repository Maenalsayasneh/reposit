package com.clubhouse.android.di;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FragmentKey.kt */
public final class FragmentKeyKt$addFragment$1$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ Class<? extends Fragment> c;
    public final /* synthetic */ Parcelable d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentKeyKt$addFragment$1$1(Class<? extends Fragment> cls, Parcelable parcelable) {
        super(1);
        this.c = cls;
        this.d = parcelable;
    }

    public Object invoke(Object obj) {
        Bundle bundle;
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        Class<? extends Fragment> cls = this.c;
        Parcelable parcelable = this.d;
        if (parcelable == null) {
            bundle = null;
        } else {
            m0.n.b.i.e(parcelable, "arg");
            bundle = new Bundle();
            bundle.putParcelable("mavericks:arg", parcelable);
        }
        c0Var.d(cls, bundle, (String) null);
        return i.a;
    }
}
