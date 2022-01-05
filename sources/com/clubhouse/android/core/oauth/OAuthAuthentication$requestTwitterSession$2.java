package com.clubhouse.android.core.oauth;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.a3.c.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import oauth.signpost.basic.DefaultOAuthConsumer;

@c(c = "com.clubhouse.android.core.oauth.OAuthAuthentication$requestTwitterSession$2", f = "OAuthAuthentication.kt", l = {}, m = "invokeSuspend")
/* compiled from: OAuthAuthentication.kt */
public final class OAuthAuthentication$requestTwitterSession$2 extends SuspendLambda implements p<f0, m0.l.c<? super a>, Object> {
    public final /* synthetic */ OAuthAuthentication c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuthAuthentication$requestTwitterSession$2(OAuthAuthentication oAuthAuthentication, String str, m0.l.c<? super OAuthAuthentication$requestTwitterSession$2> cVar) {
        super(2, cVar);
        this.c = oAuthAuthentication;
        this.d = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new OAuthAuthentication$requestTwitterSession$2(this.c, this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new OAuthAuthentication$requestTwitterSession$2(this.c, this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        try {
            OAuthAuthentication oAuthAuthentication = this.c;
            oAuthAuthentication.e.d(oAuthAuthentication.d, this.d, new String[0]);
            OAuthAuthentication oAuthAuthentication2 = this.c;
            DefaultOAuthConsumer defaultOAuthConsumer = oAuthAuthentication2.d;
            String str = defaultOAuthConsumer.q;
            String str2 = defaultOAuthConsumer.x.d;
            String b = oAuthAuthentication2.e.x.b(InstabugDbContract.AppLaunchEntry.COLUMN_SCREEN_NAME);
            if (b == null) {
                b = "";
            }
            m0.n.b.i.d(str, "token");
            m0.n.b.i.d(str2, "tokenSecret");
            return new a(b, str, str2);
        } catch (Exception e) {
            v0.a.a.d.w(e, "Something went wrong with retrieving a twitter session", new Object[0]);
            return null;
        }
    }
}
