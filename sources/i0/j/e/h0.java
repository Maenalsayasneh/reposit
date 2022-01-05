package i0.j.e;

import com.instabug.library.tracking.ActivityLifeCycleEvent;
import k0.b.y.d;

/* compiled from: SessionManager */
public class h0 implements d<ActivityLifeCycleEvent> {
    public final /* synthetic */ i0 c;

    public h0(i0 i0Var) {
        this.c = i0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.Object r4) throws java.lang.Exception {
        /*
            r3 = this;
            com.instabug.library.tracking.ActivityLifeCycleEvent r4 = (com.instabug.library.tracking.ActivityLifeCycleEvent) r4
            int[] r0 = i0.j.e.i0.a.a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L_0x0069
            r1 = 2
            if (r4 == r1) goto L_0x0011
            goto L_0x0070
        L_0x0011:
            i0.j.e.i0 r4 = r3.c
            java.util.Objects.requireNonNull(r4)
            android.content.Context r1 = com.instabug.library.Instabug.getApplicationContext()
            if (r1 == 0) goto L_0x0024
            i0.j.e.z r2 = i0.j.e.z.j()
            r2.k(r1)
            goto L_0x002b
        L_0x0024:
            java.lang.String r1 = "SessionManager"
            java.lang.String r2 = "unable to saveFeaturesToSharedPreferences due to null appContext"
            com.instabug.library.util.InstabugSDKLogger.w(r1, r2)
        L_0x002b:
            int r1 = r4.c
            int r1 = r1 - r0
            r4.c = r1
            if (r1 != 0) goto L_0x0070
            android.content.Context r1 = com.instabug.library.Instabug.getApplicationContext()
            if (r1 == 0) goto L_0x0070
            android.content.Context r1 = com.instabug.library.Instabug.getApplicationContext()
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            if (r1 == 0) goto L_0x0062
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0051:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r1.next()
            android.app.ActivityManager$RunningServiceInfo r2 = (android.app.ActivityManager.RunningServiceInfo) r2
            boolean r2 = r2.foreground
            if (r2 == 0) goto L_0x0051
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0070
            r4.a()
            goto L_0x0070
        L_0x0069:
            i0.j.e.i0 r4 = r3.c
            int r1 = r4.c
            int r1 = r1 + r0
            r4.c = r1
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.h0.b(java.lang.Object):void");
    }
}
