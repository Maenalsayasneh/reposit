package com.clubhouse.android.extensions;

import com.clubhouse.app.R;
import i0.e.b.a3.f.j;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: OAuthExtensions.kt */
public final class OAuthExtensions$showTwitterConnectError$1 extends Lambda implements l<j, i> {
    public static final OAuthExtensions$showTwitterConnectError$1 c = new OAuthExtensions$showTwitterConnectError$1();

    public OAuthExtensions$showTwitterConnectError$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        m0.n.b.i.e(jVar, "$this$showNegativeBanner");
        jVar.d(R.string.twitter_connect_error);
        return i.a;
    }
}
