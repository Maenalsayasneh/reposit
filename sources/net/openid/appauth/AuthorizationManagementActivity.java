package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import net.openid.appauth.AuthorizationException;
import o0.a.a.b;
import o0.a.a.r.a;
import org.json.JSONException;

public class AuthorizationManagementActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public PendingIntent Y1;
    public boolean d = false;
    public Intent q;
    public b x;
    public PendingIntent y;

    public final void a(Bundle bundle) {
        if (bundle == null) {
            a.e("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.q = (Intent) bundle.getParcelable("authIntent");
        this.d = bundle.getBoolean("authStarted", false);
        this.y = (PendingIntent) bundle.getParcelable("completeIntent");
        this.Y1 = (PendingIntent) bundle.getParcelable("cancelIntent");
        b bVar = null;
        try {
            String string = bundle.getString("authRequest", (String) null);
            if (string != null) {
                bVar = m0.r.t.a.r.m.a1.a.j3(string);
            }
            this.x = bVar;
        } catch (JSONException unused) {
            b(this.Y1, AuthorizationException.a.a.c(), 0);
        }
    }

    public final void b(PendingIntent pendingIntent, Intent intent, int i) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                a.b("Failed to send cancel intent", e);
            }
        } else {
            setResult(i, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a(getIntent().getExtras());
        } else {
            a(bundle);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: o0.a.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: o0.a.a.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: o0.a.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: o0.a.a.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r19 = this;
            r0 = r19
            super.onResume()
            boolean r1 = r0.d
            r2 = 1
            if (r1 != 0) goto L_0x0012
            android.content.Intent r1 = r0.q
            r0.startActivity(r1)
            r0.d = r2
            return
        L_0x0012:
            android.content.Intent r1 = r19.getIntent()
            android.net.Uri r1 = r1.getData()
            r3 = 0
            if (r1 == 0) goto L_0x01ca
            android.content.Intent r1 = r19.getIntent()
            android.net.Uri r1 = r1.getData()
            java.util.Set r4 = r1.getQueryParameterNames()
            java.lang.String r5 = "error"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0071
            int r2 = net.openid.appauth.AuthorizationException.c
            java.lang.String r9 = r1.getQueryParameter(r5)
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r1.getQueryParameter(r2)
            java.lang.String r4 = "error_uri"
            java.lang.String r4 = r1.getQueryParameter(r4)
            java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> r5 = net.openid.appauth.AuthorizationException.a.k
            java.lang.Object r5 = r5.get(r9)
            net.openid.appauth.AuthorizationException r5 = (net.openid.appauth.AuthorizationException) r5
            if (r5 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.a.i
        L_0x0050:
            net.openid.appauth.AuthorizationException r13 = new net.openid.appauth.AuthorizationException
            int r7 = r5.d
            int r8 = r5.q
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            java.lang.String r2 = r5.y
        L_0x005b:
            r10 = r2
            if (r4 == 0) goto L_0x0063
            android.net.Uri r2 = android.net.Uri.parse(r4)
            goto L_0x0065
        L_0x0063:
            android.net.Uri r2 = r5.Y1
        L_0x0065:
            r11 = r2
            r12 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.content.Intent r2 = r13.c()
            goto L_0x01ae
        L_0x0071:
            o0.a.a.b r4 = r0.x
            boolean r5 = r4 instanceof o0.a.a.d
            java.lang.String r6 = "state"
            r7 = 0
            if (r5 == 0) goto L_0x014d
            r9 = r4
            o0.a.a.d r9 = (o0.a.a.d) r9
            java.lang.String r4 = "authorization request cannot be null"
            m0.r.t.a.r.m.a1.a.z0(r9, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r10 = r1.getQueryParameter(r6)
            if (r10 == 0) goto L_0x0092
            java.lang.String r4 = "state must not be empty"
            m0.r.t.a.r.m.a1.a.y0(r10, r4)
        L_0x0092:
            java.lang.String r4 = "token_type"
            java.lang.String r11 = r1.getQueryParameter(r4)
            if (r11 == 0) goto L_0x009f
            java.lang.String r4 = "tokenType must not be empty"
            m0.r.t.a.r.m.a1.a.y0(r11, r4)
        L_0x009f:
            java.lang.String r4 = "code"
            java.lang.String r12 = r1.getQueryParameter(r4)
            if (r12 == 0) goto L_0x00ac
            java.lang.String r4 = "authorizationCode must not be empty"
            m0.r.t.a.r.m.a1.a.y0(r12, r4)
        L_0x00ac:
            java.lang.String r4 = "access_token"
            java.lang.String r13 = r1.getQueryParameter(r4)
            if (r13 == 0) goto L_0x00b9
            java.lang.String r4 = "accessToken must not be empty"
            m0.r.t.a.r.m.a1.a.y0(r13, r4)
        L_0x00b9:
            java.lang.String r4 = "expires_in"
            java.lang.String r4 = r1.getQueryParameter(r4)
            if (r4 == 0) goto L_0x00ca
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x00cb
        L_0x00ca:
            r4 = r7
        L_0x00cb:
            if (r4 != 0) goto L_0x00cf
            r14 = r7
            goto L_0x00e3
        L_0x00cf:
            long r5 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = r4.longValue()
            long r14 = r8.toMillis(r14)
            long r14 = r14 + r5
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r14 = r4
        L_0x00e3:
            java.lang.String r4 = "id_token"
            java.lang.String r15 = r1.getQueryParameter(r4)
            if (r15 == 0) goto L_0x00f0
            java.lang.String r4 = "idToken cannot be empty"
            m0.r.t.a.r.m.a1.a.y0(r15, r4)
        L_0x00f0:
            java.lang.String r4 = "scope"
            java.lang.String r4 = r1.getQueryParameter(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00fd
            goto L_0x0105
        L_0x00fd:
            java.lang.String r5 = " +"
            java.lang.String[] r4 = r4.split(r5)
            if (r4 != 0) goto L_0x0108
        L_0x0105:
            r16 = r7
            goto L_0x0111
        L_0x0108:
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.String r7 = m0.r.t.a.r.m.a1.a.C2(r4)
            goto L_0x0105
        L_0x0111:
            java.util.Set<java.lang.String> r4 = o0.a.a.e.a
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r6 = r1.getQueryParameterNames()
            java.util.Iterator r6 = r6.iterator()
        L_0x0120:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r4.contains(r7)
            if (r8 != 0) goto L_0x0120
            java.lang.String r8 = r1.getQueryParameter(r7)
            r5.put(r7, r8)
            goto L_0x0120
        L_0x013a:
            java.util.Set<java.lang.String> r4 = o0.a.a.e.a
            java.util.Map r4 = m0.r.t.a.r.m.a1.a.w0(r5, r4)
            o0.a.a.e r5 = new o0.a.a.e
            java.util.Map r17 = java.util.Collections.unmodifiableMap(r4)
            r18 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0167
        L_0x014d:
            boolean r5 = r4 instanceof o0.a.a.i
            if (r5 == 0) goto L_0x01c2
            o0.a.a.i r4 = (o0.a.a.i) r4
            java.lang.String r5 = "request cannot be null"
            m0.r.t.a.r.m.a1.a.z0(r4, r5)
            java.lang.String r5 = r1.getQueryParameter(r6)
            java.lang.String r6 = "state cannot be null or empty"
            m0.r.t.a.r.m.a1.a.y0(r5, r6)
            o0.a.a.j r6 = new o0.a.a.j
            r6.<init>(r4, r5, r7)
            r5 = r6
        L_0x0167:
            o0.a.a.b r4 = r0.x
            java.lang.String r4 = r4.a()
            if (r4 != 0) goto L_0x0175
            java.lang.String r4 = r5.a()
            if (r4 != 0) goto L_0x018d
        L_0x0175:
            o0.a.a.b r4 = r0.x
            java.lang.String r4 = r4.a()
            if (r4 == 0) goto L_0x01aa
            o0.a.a.b r4 = r0.x
            java.lang.String r4 = r4.a()
            java.lang.String r6 = r5.a()
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x01aa
        L_0x018d:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r5.a()
            r4[r3] = r5
            o0.a.a.b r5 = r0.x
            java.lang.String r5 = r5.a()
            r4[r2] = r5
            java.lang.String r2 = "State returned in authorization response (%s) does not match state from request (%s) - discarding response"
            o0.a.a.r.a.e(r2, r4)
            net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.a.j
            android.content.Intent r2 = r2.c()
            goto L_0x01ae
        L_0x01aa:
            android.content.Intent r2 = r5.b()
        L_0x01ae:
            if (r2 != 0) goto L_0x01b8
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Failed to extract OAuth2 response from redirect"
            o0.a.a.r.a.b(r2, r1)
            goto L_0x01ed
        L_0x01b8:
            r2.setData(r1)
            android.app.PendingIntent r1 = r0.y
            r3 = -1
            r0.b(r1, r2, r3)
            goto L_0x01ed
        L_0x01c2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Malformed request or uri"
            r1.<init>(r2)
            throw r1
        L_0x01ca:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Authorization flow canceled by user"
            o0.a.a.r.a.a(r2, r1)
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.b.a
            net.openid.appauth.AuthorizationException r2 = new net.openid.appauth.AuthorizationException
            int r5 = r1.d
            int r6 = r1.q
            java.lang.String r7 = r1.x
            java.lang.String r8 = r1.y
            android.net.Uri r9 = r1.Y1
            r10 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.content.Intent r1 = r2.c()
            android.app.PendingIntent r2 = r0.Y1
            r0.b(r2, r1, r3)
        L_0x01ed:
            r19.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.AuthorizationManagementActivity.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.d);
        bundle.putParcelable("authIntent", this.q);
        bundle.putString("authRequest", this.x.b().toString());
        bundle.putParcelable("completeIntent", this.y);
        bundle.putParcelable("cancelIntent", this.Y1);
    }
}
