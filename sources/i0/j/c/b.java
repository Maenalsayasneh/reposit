package i0.j.c;

import android.content.Context;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import k0.b.y.d;

/* compiled from: ChatPluginWrapper */
public final class b implements d<SDKCoreEvent> {
    public final /* synthetic */ Context c;

    public b(Context context) {
        this.c = context;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r1.equals("user") == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r9 = (com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent) r9
            android.content.Context r0 = r8.c
            com.instabug.library.Feature r1 = com.instabug.library.Feature.IN_APP_MESSAGING
            com.instabug.library.Feature$State r1 = com.instabug.library.core.InstabugCore.getFeatureState(r1)
            com.instabug.library.Feature$State r2 = com.instabug.library.Feature.State.ENABLED
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0012
            r1 = r4
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            if (r1 == 0) goto L_0x00f2
            java.lang.String r1 = r9.getType()
            r1.hashCode()
            r2 = -1
            int r5 = r1.hashCode()
            r6 = 3
            r7 = 2
            switch(r5) {
                case 3599307: goto L_0x0048;
                case 1738700944: goto L_0x003d;
                case 1843485230: goto L_0x0032;
                case 1984987798: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0050
        L_0x0027:
            java.lang.String r3 = "session"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0030
            goto L_0x0050
        L_0x0030:
            r3 = r6
            goto L_0x0051
        L_0x0032:
            java.lang.String r3 = "network"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x003b
            goto L_0x0050
        L_0x003b:
            r3 = r7
            goto L_0x0051
        L_0x003d:
            java.lang.String r3 = "invocation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0046
            goto L_0x0050
        L_0x0046:
            r3 = r4
            goto L_0x0051
        L_0x0048:
            java.lang.String r5 = "user"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r3 = r2
        L_0x0051:
            java.lang.String r1 = "Context was null during Chats retrieval from DB."
            java.lang.String r2 = "Chats/CoreEventsHandler"
            if (r3 == 0) goto L_0x00ce
            if (r3 == r4) goto L_0x00c4
            if (r3 == r7) goto L_0x009f
            if (r3 == r6) goto L_0x005f
            goto L_0x00f2
        L_0x005f:
            java.lang.String r3 = r9.getValue()
            java.lang.String r4 = "started"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x007a
            i0.j.c.e.a r3 = new i0.j.c.e.a
            r3.<init>(r0)
            com.instabug.library.util.threading.PoolProvider.postIOTask(r3)
            com.instabug.chat.synchronization.SynchronizationManager r3 = com.instabug.chat.synchronization.SynchronizationManager.getInstance()
            r3.sync()
        L_0x007a:
            java.lang.String r9 = r9.getValue()
            java.lang.String r3 = "finished"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x00f2
            i0.j.c.c.b()
            if (r0 == 0) goto L_0x0094
            i0.j.c.d r9 = new i0.j.c.d
            r9.<init>(r0)
            com.instabug.library.util.threading.PoolProvider.postIOTask(r9)
            goto L_0x0097
        L_0x0094:
            com.instabug.library.util.InstabugSDKLogger.e(r2, r1)
        L_0x0097:
            com.instabug.chat.synchronization.SynchronizationManager r9 = com.instabug.chat.synchronization.SynchronizationManager.getInstance()
            r9.stop()
            goto L_0x00f2
        L_0x009f:
            java.lang.String r9 = r9.getValue()
            java.lang.String r3 = "activated"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x00f2
            i0.j.c.c.b()
            if (r0 == 0) goto L_0x00b9
            i0.j.c.d r9 = new i0.j.c.d
            r9.<init>(r0)
            com.instabug.library.util.threading.PoolProvider.postIOTask(r9)
            goto L_0x00bc
        L_0x00b9:
            com.instabug.library.util.InstabugSDKLogger.e(r2, r1)
        L_0x00bc:
            com.instabug.chat.synchronization.SynchronizationManager r9 = com.instabug.chat.synchronization.SynchronizationManager.getInstance()
            r9.sync()
            goto L_0x00f2
        L_0x00c4:
            java.lang.String r9 = r9.getValue()
            java.lang.String r0 = "invoked"
            r9.equals(r0)
            goto L_0x00f2
        L_0x00ce:
            java.lang.String r0 = r9.getValue()
            java.lang.String r1 = "logged_in"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e1
            com.instabug.chat.synchronization.SynchronizationManager r0 = com.instabug.chat.synchronization.SynchronizationManager.getInstance()
            r0.sync()
        L_0x00e1:
            java.lang.String r9 = r9.getValue()
            java.lang.String r0 = "logged_out"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x00f2
            r0 = 0
            i0.j.c.l.a.t(r0)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.c.b.b(java.lang.Object):void");
    }
}
