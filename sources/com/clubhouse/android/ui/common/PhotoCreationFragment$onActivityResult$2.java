package com.clubhouse.android.ui.common;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PhotoCreationFragment.kt */
public final class PhotoCreationFragment$onActivityResult$2 extends Lambda implements l<j, i> {
    public static final PhotoCreationFragment$onActivityResult$2 c = new PhotoCreationFragment$onActivityResult$2();

    public PhotoCreationFragment$onActivityResult$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showNegativeBanner");
        jVar.d(R.string.common_error_try_again);
        return i.a;
    }
}
