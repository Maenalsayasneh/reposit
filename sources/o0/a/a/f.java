package o0.a.a;

import android.content.Context;
import o0.a.a.p.b;

/* compiled from: AuthorizationService */
public class f {
    public Context a;
    public final o0.a.a.p.f b;
    public final b c;

    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6 A[Catch:{ NameNotFoundException -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db A[Catch:{ NameNotFoundException -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r14) {
        /*
            r13 = this;
            o0.a.a.a r0 = o0.a.a.a.a
            java.util.Objects.requireNonNull(r0)
            android.content.Intent r0 = o0.a.a.p.d.a
            android.content.pm.PackageManager r0 = r14.getPackageManager()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Intent r2 = o0.a.a.p.d.a
            r3 = 0
            android.content.pm.ResolveInfo r4 = r0.resolveActivity(r2, r3)
            r5 = 0
            if (r4 == 0) goto L_0x001f
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            java.lang.String r4 = r4.packageName
            goto L_0x0020
        L_0x001f:
            r4 = r5
        L_0x0020:
            r6 = 131136(0x20040, float:1.8376E-40)
            java.util.List r2 = r0.queryIntentActivities(r2, r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00e0
            java.lang.Object r6 = r2.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.IntentFilter r7 = r6.filter
            java.lang.String r8 = "android.intent.action.VIEW"
            boolean r7 = r7.hasAction(r8)
            r8 = 1
            if (r7 == 0) goto L_0x0086
            android.content.IntentFilter r7 = r6.filter
            java.lang.String r9 = "android.intent.category.BROWSABLE"
            boolean r7 = r7.hasCategory(r9)
            if (r7 == 0) goto L_0x0086
            android.content.IntentFilter r7 = r6.filter
            java.util.Iterator r7 = r7.schemesIterator()
            if (r7 != 0) goto L_0x0055
            goto L_0x0086
        L_0x0055:
            android.content.IntentFilter r7 = r6.filter
            java.util.Iterator r7 = r7.authoritiesIterator()
            if (r7 == 0) goto L_0x005e
            goto L_0x0086
        L_0x005e:
            android.content.IntentFilter r7 = r6.filter
            java.util.Iterator r7 = r7.schemesIterator()
            r9 = r3
            r10 = r9
        L_0x0066:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0086
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "http"
            boolean r12 = r12.equals(r11)
            r9 = r9 | r12
            java.lang.String r12 = "https"
            boolean r11 = r12.equals(r11)
            r10 = r10 | r11
            if (r9 == 0) goto L_0x0066
            if (r10 == 0) goto L_0x0066
            r7 = r8
            goto L_0x0087
        L_0x0086:
            r7 = r3
        L_0x0087:
            if (r7 != 0) goto L_0x008a
            goto L_0x002b
        L_0x008a:
            android.content.pm.ActivityInfo r7 = r6.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r7 = r7.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            r9 = 64
            android.content.pm.PackageInfo r7 = r0.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ActivityInfo r9 = r6.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r9 = r9.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x002b }
            r10.<init>()     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r11 = "android.support.customtabs.action.CustomTabsService"
            r10.setAction(r11)     // Catch:{ NameNotFoundException -> 0x002b }
            r10.setPackage(r9)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ResolveInfo r9 = r0.resolveService(r10, r3)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r9 == 0) goto L_0x00ad
            r9 = r8
            goto L_0x00ae
        L_0x00ad:
            r9 = r3
        L_0x00ae:
            if (r9 == 0) goto L_0x00c6
            o0.a.a.p.b r9 = new o0.a.a.p.b     // Catch:{ NameNotFoundException -> 0x002b }
            r9.<init>(r7, r8)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ActivityInfo r10 = r6.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r10 = r10.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            boolean r10 = r10.equals(r4)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r10 == 0) goto L_0x00c3
            r1.add(r3, r9)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x00c7
        L_0x00c3:
            r1.add(r9)     // Catch:{ NameNotFoundException -> 0x002b }
        L_0x00c6:
            r8 = r3
        L_0x00c7:
            o0.a.a.p.b r9 = new o0.a.a.p.b     // Catch:{ NameNotFoundException -> 0x002b }
            r9.<init>(r7, r3)     // Catch:{ NameNotFoundException -> 0x002b }
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r6 = r6.packageName     // Catch:{ NameNotFoundException -> 0x002b }
            boolean r6 = r6.equals(r4)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r6 == 0) goto L_0x00db
            r1.add(r8, r9)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x002b
        L_0x00db:
            r1.add(r9)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x002b
        L_0x00e0:
            java.util.Iterator r0 = r1.iterator()
            r1 = r5
        L_0x00e5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ff
            java.lang.Object r2 = r0.next()
            o0.a.a.p.b r2 = (o0.a.a.p.b) r2
            java.lang.Boolean r4 = r2.d
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00fb
            r1 = r2
            goto L_0x00ff
        L_0x00fb:
            if (r1 != 0) goto L_0x00e5
            r1 = r2
            goto L_0x00e5
        L_0x00ff:
            o0.a.a.p.f r0 = new o0.a.a.p.f
            r0.<init>(r14)
            r13.<init>()
            r13.a = r14
            r13.b = r0
            r13.c = r1
            if (r1 == 0) goto L_0x014f
            java.lang.Boolean r14 = r1.d
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x014f
            java.lang.String r14 = r1.a
            monitor-enter(r0)
            h0.d.a.d r1 = r0.d     // Catch:{ all -> 0x014c }
            if (r1 == 0) goto L_0x0120
            monitor-exit(r0)
            goto L_0x014f
        L_0x0120:
            o0.a.a.p.e r1 = new o0.a.a.p.e     // Catch:{ all -> 0x014c }
            r1.<init>(r0)     // Catch:{ all -> 0x014c }
            r0.d = r1     // Catch:{ all -> 0x014c }
            java.lang.ref.WeakReference<android.content.Context> r1 = r0.a     // Catch:{ all -> 0x014c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x014c }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x014c }
            if (r1 == 0) goto L_0x0139
            h0.d.a.d r2 = r0.d     // Catch:{ all -> 0x014c }
            boolean r14 = h0.d.a.c.a(r1, r14, r2)     // Catch:{ all -> 0x014c }
            if (r14 != 0) goto L_0x014a
        L_0x0139:
            java.lang.String r14 = "Unable to bind custom tabs service"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x014c }
            o0.a.a.r.a r2 = o0.a.a.r.a.c()     // Catch:{ all -> 0x014c }
            r3 = 4
            r2.d(r3, r5, r14, r1)     // Catch:{ all -> 0x014c }
            java.util.concurrent.CountDownLatch r14 = r0.c     // Catch:{ all -> 0x014c }
            r14.countDown()     // Catch:{ all -> 0x014c }
        L_0x014a:
            monitor-exit(r0)
            goto L_0x014f
        L_0x014c:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.a.f.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0105  */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent a(o0.a.a.d r9) {
        /*
            r8 = this;
            o0.a.a.p.f r0 = r8.b
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            r2 = 0
            java.util.concurrent.CountDownLatch r3 = r0.c     // Catch:{ InterruptedException -> 0x0011 }
            r4 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0011 }
            r3.await(r4, r6)     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0022
        L_0x0011:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            o0.a.a.r.a r4 = o0.a.a.r.a.c()
            r5 = 4
            java.lang.String r6 = "Interrupted while waiting for browser connection"
            r4.d(r5, r1, r6, r3)
            java.util.concurrent.CountDownLatch r3 = r0.c
            r3.countDown()
        L_0x0022:
            java.util.concurrent.atomic.AtomicReference<h0.d.a.c> r0 = r0.b
            java.lang.Object r0 = r0.get()
            h0.d.a.c r0 = (h0.d.a.c) r0
            if (r0 != 0) goto L_0x002d
            goto L_0x004f
        L_0x002d:
            h0.d.a.b r3 = new h0.d.a.b
            r3.<init>(r0)
            g0.a.a.b r4 = r0.a     // Catch:{ RemoteException -> 0x0045 }
            boolean r4 = r4.K(r3)     // Catch:{ RemoteException -> 0x0045 }
            if (r4 != 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            h0.d.a.e r4 = new h0.d.a.e
            g0.a.a.b r5 = r0.a
            android.content.ComponentName r0 = r0.b
            r4.<init>(r5, r3, r0, r1)
            goto L_0x0046
        L_0x0045:
            r4 = r1
        L_0x0046:
            if (r4 != 0) goto L_0x0050
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "Failed to create custom tabs session through custom tabs client"
            o0.a.a.r.a.e(r3, r0)
        L_0x004f:
            r4 = r1
        L_0x0050:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.<init>(r3)
            java.lang.String r5 = "android.support.customtabs.extra.SESSION"
            if (r4 == 0) goto L_0x007f
            android.content.ComponentName r6 = r4.c
            java.lang.String r6 = r6.getPackageName()
            r0.setPackage(r6)
            g0.a.a.a r6 = r4.b
            g0.a.a.a$a r6 = (g0.a.a.a.C0007a) r6
            java.util.Objects.requireNonNull(r6)
            android.app.PendingIntent r4 = r4.d
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            androidx.core.app.BundleCompat.putBinder(r7, r5, r6)
            if (r4 == 0) goto L_0x007c
            java.lang.String r6 = "android.support.customtabs.extra.SESSION_ID"
            r7.putParcelable(r6, r4)
        L_0x007c:
            r0.putExtras(r7)
        L_0x007f:
            boolean r4 = r0.hasExtra(r5)
            if (r4 != 0) goto L_0x0090
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            androidx.core.app.BundleCompat.putBinder(r4, r5, r1)
            r0.putExtras(r4)
        L_0x0090:
            r4 = 1
            java.lang.String r5 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r0.putExtra(r5, r4)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r0.putExtras(r5)
            java.lang.String r5 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r0.putExtra(r5, r2)
            o0.a.a.p.b r5 = r8.c
            if (r5 == 0) goto L_0x0105
            android.net.Uri r5 = r9.d()
            o0.a.a.p.b r6 = r8.c
            java.lang.Boolean r6 = r6.d
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00b6
            goto L_0x00bb
        L_0x00b6:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
        L_0x00bb:
            o0.a.a.p.b r3 = r8.c
            java.lang.String r3 = r3.a
            r0.setPackage(r3)
            r0.setData(r5)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r0.getPackage()
            r3[r2] = r5
            o0.a.a.p.b r2 = r8.c
            java.lang.Boolean r2 = r2.d
            java.lang.String r2 = r2.toString()
            r3[r4] = r2
            java.lang.String r2 = "Using %s as browser for auth, custom tab = %s"
            o0.a.a.r.a.a(r2, r3)
            android.content.Context r2 = r8.a
            int r3 = net.openid.appauth.AuthorizationManagementActivity.c
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<net.openid.appauth.AuthorizationManagementActivity> r4 = net.openid.appauth.AuthorizationManagementActivity.class
            r3.<init>(r2, r4)
            java.lang.String r2 = "authIntent"
            r3.putExtra(r2, r0)
            org.json.JSONObject r9 = r9.b()
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "authRequest"
            r3.putExtra(r0, r9)
            java.lang.String r9 = "completeIntent"
            r3.putExtra(r9, r1)
            java.lang.String r9 = "cancelIntent"
            r3.putExtra(r9, r1)
            return r3
        L_0x0105:
            android.content.ActivityNotFoundException r9 = new android.content.ActivityNotFoundException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.a.f.a(o0.a.a.d):android.content.Intent");
    }
}
