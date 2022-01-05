package i0.e.b.d3;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.clubhouse.android.core.ui.BaseFragment;
import com.clubhouse.android.extensions.OAuthExtensions$showInstagramConnectError$1;
import h0.a.f.a;
import h0.b0.v;
import i0.e.b.g3.u.t5;
import i0.e.b.g3.u.x4;
import java.util.Set;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import o0.a.a.e;
import org.json.JSONException;

/* compiled from: lambda */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ i0.e.b.a3.b.a a;
    public final /* synthetic */ BaseFragment b;

    public /* synthetic */ c(i0.e.b.a3.b.a aVar, BaseFragment baseFragment) {
        this.a = aVar;
        this.b = baseFragment;
    }

    public final void onActivityResult(Object obj) {
        e eVar;
        String str;
        i0.e.b.a3.b.a aVar = this.a;
        BaseFragment baseFragment = this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        i.e(aVar, "$viewModel");
        i.e(baseFragment, "$this_registerForInstagramOAuthResult");
        aVar.p(x4.a);
        int i = activityResult.c;
        boolean z = true;
        if (i == -1) {
            Intent intent = activityResult.d;
            if (intent == null) {
                i.e(baseFragment, "<this>");
                v0.a.a.d.w((Throwable) null, "Instagram OAuth error", new Object[0]);
                v.f2(baseFragment, OAuthExtensions$showInstagramConnectError$1.c);
                return;
            }
            try {
                Set<String> set = e.a;
                m0.r.t.a.r.m.a1.a.z0(intent, "dataIntent must not be null");
                if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
                    eVar = null;
                } else {
                    eVar = e.c(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
                }
                if (eVar == null) {
                    str = null;
                } else {
                    str = eVar.e;
                }
                if (str != null) {
                    if (!StringsKt__IndentKt.o(str)) {
                        z = false;
                    }
                }
                if (z) {
                    i.e(baseFragment, "<this>");
                    v0.a.a.d.w((Throwable) null, "Instagram OAuth error", new Object[0]);
                    v.f2(baseFragment, OAuthExtensions$showInstagramConnectError$1.c);
                    return;
                }
                aVar.p(new t5(str));
            } catch (JSONException e) {
                throw new IllegalArgumentException("Intent contains malformed auth response", e);
            } catch (Exception e2) {
                i.e(baseFragment, "<this>");
                v0.a.a.d.w(e2, "Instagram OAuth error", new Object[0]);
                v.f2(baseFragment, OAuthExtensions$showInstagramConnectError$1.c);
            }
        } else if (i != 0) {
            i.e(baseFragment, "<this>");
            v0.a.a.d.w((Throwable) null, "Instagram OAuth error", new Object[0]);
            v.f2(baseFragment, OAuthExtensions$showInstagramConnectError$1.c);
        }
    }
}
