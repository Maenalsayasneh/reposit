package i0.h.c.r;

import android.util.Log;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.TokenResult;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.networkv2.request.RequestMethod;
import h0.b0.v;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.g;
import i0.h.c.c;
import i0.h.c.r.p.a;
import i0.h.c.r.p.b;
import i0.h.c.r.p.c;
import i0.h.c.r.q.b;
import i0.h.c.u.h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* compiled from: FirebaseInstallations */
public class f implements g {
    public static final Object a = new Object();
    public static final ThreadFactory b = new a();
    public final c c;
    public final i0.h.c.r.q.c d;
    public final PersistedInstallation e;
    public final n f;
    public final b g;
    public final l h;
    public final Object i = new Object();
    public final ExecutorService j;
    public final ExecutorService k;
    public String l;
    public Set<i0.h.c.r.o.a> m = new HashSet();
    public final List<m> n = new ArrayList();

    /* compiled from: FirebaseInstallations */
    public class a implements ThreadFactory {
        public final AtomicInteger c = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.c.getAndIncrement())}));
        }
    }

    public f(c cVar, i0.h.c.q.b<h> bVar, i0.h.c.q.b<HeartBeatInfo> bVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        cVar.a();
        i0.h.c.r.q.c cVar2 = new i0.h.c.r.q.c(cVar.d, bVar, bVar2);
        PersistedInstallation persistedInstallation = new PersistedInstallation(cVar);
        n c2 = n.c();
        b bVar3 = new b(cVar);
        l lVar = new l();
        this.c = cVar;
        this.d = cVar2;
        this.e = persistedInstallation;
        this.f = c2;
        this.g = bVar3;
        this.h = lVar;
        this.j = threadPoolExecutor;
        this.k = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    public static f f(c cVar) {
        v.u(true, "Null is not a valid value of FirebaseApp.");
        cVar.a();
        return (f) cVar.g.a(g.class);
    }

    public g<k> a(boolean z) {
        h();
        i0.h.a.b.m.h hVar = new i0.h.a.b.m.h();
        i iVar = new i(this.f, hVar);
        synchronized (this.i) {
            this.n.add(iVar);
        }
        b0<TResult> b0Var = hVar.a;
        this.j.execute(new d(this, z));
        return b0Var;
    }

    public final void b(boolean z) {
        i0.h.c.r.p.c b2;
        synchronized (a) {
            c cVar = this.c;
            cVar.a();
            b a2 = b.a(cVar.d, "generatefid.lock");
            try {
                b2 = this.e.b();
                if (b2.i()) {
                    String i2 = i(b2);
                    PersistedInstallation persistedInstallation = this.e;
                    a.b bVar = (a.b) b2.k();
                    bVar.a = i2;
                    bVar.b(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                    b2 = bVar.a();
                    persistedInstallation.a(b2);
                }
            } finally {
                if (a2 != null) {
                    a2.b();
                }
            }
        }
        if (z) {
            a.b bVar2 = (a.b) b2.k();
            bVar2.c = null;
            b2 = bVar2.a();
        }
        l(b2);
        this.k.execute(new e(this, z));
    }

    public final i0.h.c.r.p.c c(i0.h.c.r.p.c cVar) throws FirebaseInstallationsException {
        TokenResult f2;
        i0.h.c.r.q.c cVar2 = this.d;
        String d2 = d();
        i0.h.c.r.p.a aVar = (i0.h.c.r.p.a) cVar;
        String str = aVar.b;
        String g2 = g();
        String str2 = aVar.e;
        if (cVar2.f.a()) {
            URL a2 = cVar2.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{g2, str}));
            int i2 = 0;
            while (i2 <= 1) {
                HttpURLConnection c2 = cVar2.c(a2, d2);
                try {
                    c2.setRequestMethod(RequestMethod.POST);
                    c2.addRequestProperty(Header.AUTHORIZATION, "FIS_v2 " + str2);
                    c2.setDoOutput(true);
                    cVar2.h(c2);
                    int responseCode = c2.getResponseCode();
                    cVar2.f.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f2 = cVar2.f(c2);
                    } else {
                        i0.h.c.r.q.c.b(c2, (String) null, d2, g2);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    b.C0152b bVar = (b.C0152b) TokenResult.a();
                                    bVar.c = TokenResult.ResponseCode.BAD_CONFIG;
                                    f2 = bVar.a();
                                } else {
                                    c2.disconnect();
                                    i2++;
                                }
                            }
                        }
                        b.C0152b bVar2 = (b.C0152b) TokenResult.a();
                        bVar2.c = TokenResult.ResponseCode.AUTH_ERROR;
                        f2 = bVar2.a();
                    }
                    c2.disconnect();
                    i0.h.c.r.q.b bVar3 = (i0.h.c.r.q.b) f2;
                    int ordinal = bVar3.c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.a;
                        long j2 = bVar3.b;
                        long b2 = this.f.b();
                        a.b bVar4 = (a.b) cVar.k();
                        bVar4.c = str3;
                        bVar4.e = Long.valueOf(j2);
                        bVar4.f = Long.valueOf(b2);
                        return bVar4.a();
                    } else if (ordinal == 1) {
                        a.b bVar5 = (a.b) cVar.k();
                        bVar5.g = "BAD CONFIG";
                        bVar5.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                        return bVar5.a();
                    } else if (ordinal == 2) {
                        synchronized (this) {
                            this.l = null;
                        }
                        c.a k2 = cVar.k();
                        k2.b(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
                        return k2.a();
                    } else {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c2.disconnect();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public String d() {
        i0.h.c.c cVar = this.c;
        cVar.a();
        return cVar.f.a;
    }

    public String e() {
        i0.h.c.c cVar = this.c;
        cVar.a();
        return cVar.f.b;
    }

    public String g() {
        i0.h.c.c cVar = this.c;
        cVar.a();
        return cVar.f.g;
    }

    public g<String> getId() {
        String str;
        h();
        synchronized (this) {
            str = this.l;
        }
        if (str != null) {
            return i0.h.a.b.c.m.b.H(str);
        }
        i0.h.a.b.m.h hVar = new i0.h.a.b.m.h();
        j jVar = new j(hVar);
        synchronized (this.i) {
            this.n.add(jVar);
        }
        b0<TResult> b0Var = hVar.a;
        this.j.execute(new c(this));
        return b0Var;
    }

    public final void h() {
        v.y(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v.y(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v.y(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String e2 = e();
        Pattern pattern = n.b;
        v.u(e2.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v.u(n.b.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.e) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String i(i0.h.c.r.p.c r6) {
        /*
            r5 = this;
            i0.h.c.c r0 = r5.c
            r0.a()
            java.lang.String r0 = r0.e
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            i0.h.c.c r0 = r5.c
            r0.a()
            java.lang.String r0 = r0.e
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
        L_0x001e:
            i0.h.c.r.p.a r6 = (i0.h.c.r.p.a) r6
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r6 = r6.c
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r6 != r0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x0032
        L_0x002b:
            i0.h.c.r.l r6 = r5.h
            java.lang.String r6 = r6.a()
            return r6
        L_0x0032:
            i0.h.c.r.p.b r6 = r5.g
            android.content.SharedPreferences r0 = r6.b
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.b     // Catch:{ all -> 0x005d }
            monitor-enter(r1)     // Catch:{ all -> 0x005d }
            android.content.SharedPreferences r2 = r6.b     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x005a }
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0048
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            goto L_0x004d
        L_0x0048:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
        L_0x004d:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0059
            i0.h.c.r.l r6 = r5.h
            java.lang.String r2 = r6.a()
        L_0x0059:
            return r2
        L_0x005a:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005a }
            throw r6     // Catch:{ all -> 0x005d }
        L_0x005d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.r.f.i(i0.h.c.r.p.c):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.h.c.r.p.c j(i0.h.c.r.p.c r23) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            i0.h.c.r.p.a r0 = (i0.h.c.r.p.a) r0
            java.lang.String r2 = r0.b
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0069
            int r2 = r2.length()
            r5 = 11
            if (r2 != r5) goto L_0x0069
            i0.h.c.r.p.b r2 = r1.g
            android.content.SharedPreferences r5 = r2.b
            monitor-enter(r5)
            java.lang.String[] r6 = i0.h.c.r.p.b.a     // Catch:{ all -> 0x0066 }
            int r7 = r6.length     // Catch:{ all -> 0x0066 }
            r8 = r3
        L_0x001d:
            if (r8 >= r7) goto L_0x0064
            r9 = r6[r8]     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r2.c     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r11.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x0066 }
            r11.append(r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0066 }
            r11.append(r9)     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences r10 = r2.b     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = r10.getString(r9, r4)     // Catch:{ all -> 0x0066 }
            if (r9 == 0) goto L_0x0061
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r10 != 0) goto L_0x0061
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x005e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r2.<init>((java.lang.String) r9)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r6 = "token"
            java.lang.String r4 = r2.getString(r6)     // Catch:{ JSONException -> 0x005f }
            goto L_0x005f
        L_0x005e:
            r4 = r9
        L_0x005f:
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0061:
            int r8 = r8 + 1
            goto L_0x001d
        L_0x0064:
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            i0.h.c.r.q.c r2 = r1.d
            java.lang.String r5 = r22.d()
            java.lang.String r0 = r0.b
            java.lang.String r6 = r22.g()
            java.lang.String r7 = r22.e()
            i0.h.c.r.q.d r8 = r2.f
            boolean r8 = r8.a()
            java.lang.String r9 = "Firebase Installations Service is unavailable. Please try again later."
            if (r8 == 0) goto L_0x0177
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r3] = r6
            java.lang.String r11 = "projects/%s/installations"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            java.net.URL r10 = r2.a(r10)
            r11 = r3
        L_0x0093:
            if (r11 > r8) goto L_0x016f
            java.net.HttpURLConnection r12 = r2.c(r10, r5)
            java.lang.String r13 = "POST"
            r12.setRequestMethod(r13)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r12.setDoOutput(r8)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            if (r4 == 0) goto L_0x00a8
            java.lang.String r13 = "x-goog-fis-android-iid-migration-auth"
            r12.addRequestProperty(r13, r4)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
        L_0x00a8:
            r2.g(r12, r0, r7)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            int r13 = r12.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            i0.h.c.r.q.d r14 = r2.f     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r14.b(r13)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r14 = 200(0xc8, float:2.8E-43)
            if (r13 < r14) goto L_0x00be
            r14 = 300(0x12c, float:4.2E-43)
            if (r13 >= r14) goto L_0x00be
            r14 = r8
            goto L_0x00bf
        L_0x00be:
            r14 = r3
        L_0x00bf:
            if (r14 == 0) goto L_0x00c9
            com.google.firebase.installations.remote.InstallationResponse r0 = r2.e(r12)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r12.disconnect()
            goto L_0x00f7
        L_0x00c9:
            i0.h.c.r.q.c.b(r12, r7, r5, r6)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r14 = 429(0x1ad, float:6.01E-43)
            if (r13 == r14) goto L_0x0159
            r14 = 500(0x1f4, float:7.0E-43)
            if (r13 < r14) goto L_0x00da
            r14 = 600(0x258, float:8.41E-43)
            if (r13 >= r14) goto L_0x00da
            goto L_0x0168
        L_0x00da:
            java.lang.String r13 = "Firebase-Installations"
            java.lang.String r14 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r13, r14)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r20 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            i0.h.c.r.q.a r13 = new i0.h.c.r.q.a     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r21 = 0
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r12.disconnect()
            r0 = r13
        L_0x00f7:
            i0.h.c.r.q.a r0 = (i0.h.c.r.q.a) r0
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = r0.e
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0121
            if (r2 != r8) goto L_0x0117
            java.lang.String r0 = "BAD CONFIG"
            i0.h.c.r.p.c$a r2 = r23.k()
            i0.h.c.r.p.a$b r2 = (i0.h.c.r.p.a.b) r2
            r2.g = r0
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
            r2.b(r0)
            i0.h.c.r.p.c r0 = r2.a()
            return r0
        L_0x0117:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r3 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r2, r3)
            throw r0
        L_0x0121:
            java.lang.String r2 = r0.b
            java.lang.String r3 = r0.c
            i0.h.c.r.n r4 = r1.f
            long r4 = r4.b()
            com.google.firebase.installations.remote.TokenResult r6 = r0.d
            java.lang.String r6 = r6.c()
            com.google.firebase.installations.remote.TokenResult r0 = r0.d
            long r7 = r0.d()
            i0.h.c.r.p.c$a r0 = r23.k()
            i0.h.c.r.p.a$b r0 = (i0.h.c.r.p.a.b) r0
            r0.a = r2
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED
            r0.b(r2)
            r0.c = r6
            r0.d = r3
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r0.e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.f = r2
            i0.h.c.r.p.c r0 = r0.a()
            return r0
        L_0x0159:
            com.google.firebase.installations.FirebaseInstallationsException r13 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            java.lang.String r14 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r15 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            r13.<init>(r14, r15)     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
            throw r13     // Catch:{ IOException | AssertionError -> 0x0168, all -> 0x0163 }
        L_0x0163:
            r0 = move-exception
            r12.disconnect()
            throw r0
        L_0x0168:
            r12.disconnect()
            int r11 = r11 + 1
            goto L_0x0093
        L_0x016f:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r9, r2)
            throw r0
        L_0x0177:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r9, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.r.f.j(i0.h.c.r.p.c):i0.h.c.r.p.c");
    }

    public final void k(Exception exc) {
        synchronized (this.i) {
            Iterator<m> it = this.n.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(i0.h.c.r.p.c cVar) {
        synchronized (this.i) {
            Iterator<m> it = this.n.iterator();
            while (it.hasNext()) {
                if (it.next().b(cVar)) {
                    it.remove();
                }
            }
        }
    }
}
