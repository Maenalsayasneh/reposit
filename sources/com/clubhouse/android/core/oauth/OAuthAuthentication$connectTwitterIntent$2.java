package com.clubhouse.android.core.oauth;

import android.content.Intent;
import android.net.Uri;
import com.clubhouse.android.core.R;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import o0.a.a.d;
import o0.a.a.g;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;

@c(c = "com.clubhouse.android.core.oauth.OAuthAuthentication$connectTwitterIntent$2", f = "OAuthAuthentication.kt", l = {}, m = "invokeSuspend")
/* compiled from: OAuthAuthentication.kt */
public final class OAuthAuthentication$connectTwitterIntent$2 extends SuspendLambda implements p<f0, m0.l.c<? super Intent>, Object> {
    public final /* synthetic */ OAuthAuthentication c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuthAuthentication$connectTwitterIntent$2(OAuthAuthentication oAuthAuthentication, m0.l.c<? super OAuthAuthentication$connectTwitterIntent$2> cVar) {
        super(2, cVar);
        this.c = oAuthAuthentication;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new OAuthAuthentication$connectTwitterIntent$2(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new OAuthAuthentication$connectTwitterIntent$2(this.c, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        try {
            OAuthAuthentication oAuthAuthentication = this.c;
            DefaultOAuthProvider defaultOAuthProvider = oAuthAuthentication.e;
            DefaultOAuthConsumer defaultOAuthConsumer = oAuthAuthentication.d;
            Objects.requireNonNull(oAuthAuthentication.b);
            defaultOAuthProvider.e(defaultOAuthConsumer, "https://www.clubhouse.com/callback/twitter", new String[0]);
            OAuthAuthentication oAuthAuthentication2 = this.c;
            String str = oAuthAuthentication2.d.q;
            g gVar = new g(Uri.parse(oAuthAuthentication2.a.getString(R.string.twitter_auth_url)), Uri.parse(this.c.a.getString(R.string.twitter_acess_token_url)));
            Objects.requireNonNull(this.c.b);
            Objects.requireNonNull(this.c.b);
            d.b bVar = new d.b(gVar, "NyJhARWVYU1X3qJZtC2154xSI", "token", Uri.parse("https://www.clubhouse.com/callback/twitter"));
            bVar.o = a.w0(h.S2(new Pair("oauth_token", str)), d.a);
            return this.c.c.a(bVar.a());
        } catch (Exception e) {
            v0.a.a.d.w(e, "Something went wrong with retrieving a twitter request token", new Object[0]);
            return null;
        }
    }
}
