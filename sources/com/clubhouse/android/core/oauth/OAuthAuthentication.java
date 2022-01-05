package com.clubhouse.android.core.oauth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.clubhouse.android.core.R;
import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.e.b.f3.e;
import java.util.Arrays;
import java.util.Objects;
import m0.l.c;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;
import o0.a.a.d;
import o0.a.a.f;
import o0.a.a.g;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;

/* compiled from: OAuthAuthentication.kt */
public final class OAuthAuthentication {
    public final Context a;
    public final e b;
    public final f c;
    public final DefaultOAuthConsumer d = new DefaultOAuthConsumer("NyJhARWVYU1X3qJZtC2154xSI", "ylFImLBFaOE362uwr4jut8S8gXGWh93S1TUKbkfh7jDIPse02o");
    public final DefaultOAuthProvider e;

    public OAuthAuthentication(Context context, e eVar) {
        i.e(context, "context");
        i.e(eVar, "environment");
        this.a = context;
        this.b = eVar;
        this.c = new f(context);
        this.e = new DefaultOAuthProvider(context.getString(R.string.twitter_request_token_url), context.getString(R.string.twitter_acess_token_url), context.getString(R.string.twitter_auth_url));
    }

    public final Intent a() {
        g gVar = new g(Uri.parse(this.a.getString(R.string.instagram_auth_url)), Uri.parse(""));
        Objects.requireNonNull(this.b);
        Objects.requireNonNull(this.b);
        d.b bVar = new d.b(gVar, "1352866981588597", PaymentMethodOptionsParams.Blik.PARAM_CODE, Uri.parse("https://www.clubhouse.com/callback/instagram"));
        if (TextUtils.isEmpty("user_profile")) {
            bVar.h = null;
        } else {
            String[] split = "user_profile".split(" +");
            if (split == null) {
                split = new String[0];
            }
            bVar.h = a.C2(Arrays.asList(split));
        }
        Intent a2 = this.c.a(bVar.a());
        i.d(a2, "authorizationService.getAuthorizationRequestIntent(requestBuilder.build())");
        return a2;
    }

    public final Object b(c<? super Intent> cVar) {
        return a.k4(m0.c, new OAuthAuthentication$connectTwitterIntent$2(this, (c<? super OAuthAuthentication$connectTwitterIntent$2>) null), cVar);
    }

    public final Object c(String str, c<? super i0.e.b.a3.c.a> cVar) {
        return a.k4(m0.c, new OAuthAuthentication$requestTwitterSession$2(this, str, (c<? super OAuthAuthentication$requestTwitterSession$2>) null), cVar);
    }
}
