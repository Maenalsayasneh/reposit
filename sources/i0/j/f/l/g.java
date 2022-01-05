package i0.j.f.l;

import android.content.Context;
import com.instabug.library.PresentationManager;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.e.c.a;
import i0.j.f.m.c;
import java.util.List;
import java.util.Objects;

/* compiled from: AnnouncementManager */
public class g {
    public static g a;
    public Context b;
    public h c;

    public g(Context context) {
        this.b = context;
        if (context != null) {
            PoolProvider.postIOTask(new a(this));
        } else {
            InstabugSDKLogger.e(this, "Context is null.");
        }
    }

    public static g a(Context context) {
        if (a == null) {
            a = new g(context);
            InstabugSDKLogger.d("AnnouncementManager", "Announcement Manager initialized");
        }
        return a;
    }

    public static void b(g gVar, a aVar) {
        Objects.requireNonNull(gVar);
        c a2 = c.a();
        a2.b = new i0.j.f.m.a(a2, aVar);
        PresentationManager.getInstance().show(a2.b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(i0.j.f.l.g r9, java.util.List r10) {
        /*
            java.util.Objects.requireNonNull(r9)
            java.lang.String r0 = "AnnouncementManager"
            java.lang.String r1 = "Announcement Fetching Passed"
            com.instabug.library.util.InstabugSDKLogger.d(r0, r1)
            boolean r0 = com.instabug.library.Instabug.isEnabled()
            if (r0 != 0) goto L_0x0019
            java.lang.Class<i0.j.f.l.g> r9 = i0.j.f.l.g.class
            java.lang.String r10 = "Instabug SDK is disabled."
            com.instabug.library.util.InstabugSDKLogger.d(r9, r10)
            goto L_0x0191
        L_0x0019:
            android.content.Context r0 = r9.b
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = com.instabug.library.util.LocaleUtils.getCurrentLocaleResolved(r0)
            i0.j.f.l.i.b r1 = i0.j.f.l.i.b.a()
            if (r1 != 0) goto L_0x0028
            goto L_0x0038
        L_0x0028:
            i0.j.f.l.i.b r1 = i0.j.f.l.i.b.a()
            android.content.SharedPreferences$Editor r2 = r1.c
            java.lang.String r3 = "announcement_last_retrieved_locale"
            r2.putString(r3, r0)
            android.content.SharedPreferences$Editor r0 = r1.c
            r0.apply()
        L_0x0038:
            java.util.Iterator r0 = r10.iterator()
        L_0x003c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r0.next()
            com.instabug.survey.e.c.a r1 = (com.instabug.survey.e.c.a) r1
            int r2 = r1.q
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L_0x005e
            i0.j.f.l.i.a r2 = i0.j.f.l.i.a.a()
            com.instabug.survey.f.c.i r1 = r1.a2
            com.instabug.survey.f.c.g r1 = r1.q
            com.instabug.survey.f.c.h r1 = r1.y
            int r1 = r1.x
            java.util.Objects.requireNonNull(r2)
            goto L_0x003c
        L_0x005e:
            r3 = 100
            if (r2 != r3) goto L_0x003c
            i0.j.f.l.i.a r2 = i0.j.f.l.i.a.a()
            com.instabug.survey.f.c.i r1 = r1.a2
            com.instabug.survey.f.c.g r1 = r1.q
            com.instabug.survey.f.c.h r1 = r1.y
            int r1 = r1.x
            java.util.Objects.requireNonNull(r2)
            goto L_0x003c
        L_0x0072:
            java.util.List r0 = com.instabug.survey.announcements.cache.AnnouncementCacheManager.getAllAnnouncement()
            java.lang.String r1 = com.instabug.library.user.UserManagerWrapper.getUserUUID()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0083:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x00a2
            java.lang.Object r3 = r0.next()
            com.instabug.survey.e.c.a r3 = (com.instabug.survey.e.c.a) r3
            boolean r5 = r10.contains(r3)
            if (r5 != 0) goto L_0x0083
            long r5 = r3.c
            com.instabug.survey.f.c.i r3 = com.instabug.survey.common.userInteractions.UserInteractionCacheManager.retrieveUserInteraction(r5, r1, r4)
            if (r3 == 0) goto L_0x0083
            r2.add(r3)
            goto L_0x0083
        L_0x00a2:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00ab
            com.instabug.survey.common.userInteractions.UserInteractionCacheManager.deleteBulkOfUserInteractions(r2)
        L_0x00ab:
            java.util.List r0 = com.instabug.survey.announcements.cache.AnnouncementCacheManager.getAllAnnouncement()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cf
            java.lang.Object r1 = r0.next()
            com.instabug.survey.e.c.a r1 = (com.instabug.survey.e.c.a) r1
            boolean r2 = r10.contains(r1)
            if (r2 != 0) goto L_0x00b3
            long r1 = r1.c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.instabug.survey.announcements.cache.AnnouncementCacheManager.deleteAnnouncement(r1)
            goto L_0x00b3
        L_0x00cf:
            java.util.Iterator r10 = r10.iterator()
        L_0x00d3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r10.next()
            com.instabug.survey.e.c.a r0 = (com.instabug.survey.e.c.a) r0
            if (r0 == 0) goto L_0x00d3
            long r1 = r0.c
            boolean r1 = com.instabug.survey.announcements.cache.AnnouncementCacheManager.isAnnouncementExist(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0118
            long r5 = r0.c
            com.instabug.survey.e.c.a r1 = com.instabug.survey.announcements.cache.AnnouncementCacheManager.getAnnouncement(r5)
            if (r1 != 0) goto L_0x00f3
            goto L_0x00fb
        L_0x00f3:
            boolean r3 = r1.y
            boolean r5 = r0.y
            if (r3 == r5) goto L_0x00fb
            r3 = r4
            goto L_0x00fc
        L_0x00fb:
            r3 = r2
        L_0x00fc:
            if (r1 != 0) goto L_0x00ff
            goto L_0x0110
        L_0x00ff:
            com.instabug.survey.f.c.b r5 = r0.Z1
            java.lang.String r5 = r5.q
            if (r5 == 0) goto L_0x0110
            com.instabug.survey.f.c.b r1 = r1.Z1
            java.lang.String r1 = r1.q
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0110
            r2 = r4
        L_0x0110:
            if (r3 != 0) goto L_0x0114
            if (r2 == 0) goto L_0x00d3
        L_0x0114:
            com.instabug.survey.announcements.cache.AnnouncementCacheManager.insertOrUpdatePausedOrLocale(r0, r3, r2)
            goto L_0x00d3
        L_0x0118:
            boolean r1 = r0.y
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = "downloading announcement assets for: "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            long r5 = r0.c
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "INSTABUG"
            com.instabug.library.util.InstabugSDKLogger.d(r3, r1)
            java.util.ArrayList<com.instabug.survey.e.c.c> r1 = r0.x
            java.lang.Object r1 = r1.get(r2)
            com.instabug.survey.e.c.c r1 = (com.instabug.survey.e.c.c) r1
            java.util.ArrayList<com.instabug.survey.e.c.e> r3 = r1.y
            if (r3 != 0) goto L_0x013e
            r1 = 0
            goto L_0x017a
        L_0x013e:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayList<com.instabug.survey.e.c.e> r5 = r1.y
            int r5 = r5.size()
            r3.<init>(r5)
        L_0x0149:
            java.util.ArrayList<com.instabug.survey.e.c.e> r5 = r1.y
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x0179
            java.util.ArrayList<com.instabug.survey.e.c.e> r5 = r1.y
            java.lang.Object r5 = r5.get(r2)
            com.instabug.survey.e.c.e r5 = (com.instabug.survey.e.c.e) r5
            java.lang.String r6 = r5.x
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0176
            long r6 = r1.x
            i0.j.f.b.a.c r8 = new i0.j.f.b.a.c
            r8.<init>(r5, r6)
            io.reactivex.internal.operators.observable.ObservableCreate r5 = new io.reactivex.internal.operators.observable.ObservableCreate
            r5.<init>(r8)
            k0.b.l r5 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r5)
            r3.add(r5)
        L_0x0176:
            int r2 = r2 + 1
            goto L_0x0149
        L_0x0179:
            r1 = r3
        L_0x017a:
            if (r1 != 0) goto L_0x017d
            goto L_0x0189
        L_0x017d:
            k0.b.l r1 = k0.b.l.q(r1)
            i0.j.f.b.a.b r2 = new i0.j.f.b.a.b
            r2.<init>(r0)
            r1.c(r2)
        L_0x0189:
            com.instabug.survey.announcements.cache.AnnouncementCacheManager.addAnnouncement(r0)
            goto L_0x00d3
        L_0x018e:
            r9.f()
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.l.g.c(i0.j.f.l.g, java.util.List):void");
    }

    public final void d(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("Announcement Fetching Failed due to ");
        P0.append(th.getMessage());
        InstabugSDKLogger.d(g.class, P0.toString());
        f();
    }

    public final h e() {
        if (this.c == null) {
            this.c = new h(InstabugDeviceProperties.getAppVersionName(this.b), InstabugDeviceProperties.getAppVersion(this.b));
        }
        return this.c;
    }

    public final void f() {
        List<a> announcementsByType = AnnouncementCacheManager.getAnnouncementsByType(101);
        List<a> announcementsByType2 = AnnouncementCacheManager.getAnnouncementsByType(100);
        if (announcementsByType.size() > 0) {
            for (a e : announcementsByType) {
                if (e.e()) {
                    a a2 = e().a();
                    if (a2 != null) {
                        PoolProvider.postIOTask(new c(this, a2));
                        return;
                    }
                    return;
                }
            }
        }
        if (announcementsByType2.size() > 0) {
            PoolProvider.postIOTask(new d(this));
        }
    }
}
