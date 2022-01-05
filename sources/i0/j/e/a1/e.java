package i0.j.e.a1;

import com.instabug.library.model.StepType;
import com.instabug.library.util.InstabugDateFormatter;
import i0.d.a.a.a;
import i0.j.e.t0.h;
import java.util.ArrayList;

/* compiled from: InstabugTrackingStepsProvider */
public class e {
    public static e a;
    public ArrayList<h> b = new ArrayList<>(100);
    public String c = "";
    public String d = "";

    public static e c() {
        if (a == null) {
            a = new e();
        }
        return a;
    }

    public void a(String str, String str2) {
        this.c = str;
        h hVar = new h();
        hVar.a = InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds();
        hVar.c = str2;
        StringBuilder sb = new StringBuilder();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1705165623:
                if (str2.equals(StepType.ACTIVITY_DESTROYED)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1647502663:
                if (str2.equals(StepType.APPLICATION_CREATED)) {
                    c2 = 1;
                    break;
                }
                break;
            case -1643440744:
                if (str2.equals(StepType.ACTIVITY_CREATED)) {
                    c2 = 2;
                    break;
                }
                break;
            case -1574447993:
                if (str2.equals(StepType.ACTIVITY_RESUMED)) {
                    c2 = 3;
                    break;
                }
                break;
            case -274213071:
                if (str2.equals(StepType.ACTIVITY_STARTED)) {
                    c2 = 4;
                    break;
                }
                break;
            case -261347203:
                if (str2.equals(StepType.ACTIVITY_STOPPED)) {
                    c2 = 5;
                    break;
                }
                break;
            case 3213533:
                if (str2.equals(StepType.OPEN_DIALOG)) {
                    c2 = 6;
                    break;
                }
                break;
            case 26863710:
                if (str2.equals(StepType.ACTIVITY_PAUSED)) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                sb.append(str);
                sb.append(" was destroyed.");
                break;
            case 1:
            case 2:
                sb.append(str);
                sb.append(" was created.");
                break;
            case 3:
                sb.append(str);
                sb.append(" was resumed.");
                break;
            case 4:
                sb.append(str);
                sb.append(" was started.");
                break;
            case 5:
                sb.append(str);
                sb.append(" was stopped.");
                break;
            case 6:
                a.s(sb, "In container ", str, ": dialog ", str);
                sb.append(" was displayed.");
                break;
            case 7:
                sb.append(str);
                sb.append(" was paused.");
                break;
        }
        hVar.b = sb.toString();
        hVar.d = str;
        hVar.e = null;
        hVar.f = null;
        d();
        this.b.add(hVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            r4.c = r5
            i0.j.e.t0.h r0 = new i0.j.e.t0.h
            r0.<init>()
            long r1 = com.instabug.library.util.InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds()
            r0.a = r1
            r0.c = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r8.hashCode()
            int r2 = r8.hashCode()
            switch(r2) {
                case -1933282175: goto L_0x007b;
                case -1431942979: goto L_0x0070;
                case -1382777347: goto L_0x0065;
                case -1023412878: goto L_0x005a;
                case -1010547010: goto L_0x004f;
                case -730405706: goto L_0x0044;
                case 3213533: goto L_0x0039;
                case 1855874739: goto L_0x002e;
                case 1971319496: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0086
        L_0x0020:
            java.lang.String r2 = "FRAGMENT_RESUMED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x002a
            goto L_0x0086
        L_0x002a:
            r8 = 8
            goto L_0x0087
        L_0x002e:
            java.lang.String r2 = "FRAGMENT_ATTACHED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0037
            goto L_0x0086
        L_0x0037:
            r8 = 7
            goto L_0x0087
        L_0x0039:
            java.lang.String r2 = "OPEN_DIALOG"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0042
            goto L_0x0086
        L_0x0042:
            r8 = 6
            goto L_0x0087
        L_0x0044:
            java.lang.String r2 = "FRAGMENT_VISIBILITY_CHANGED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x004d
            goto L_0x0086
        L_0x004d:
            r8 = 5
            goto L_0x0087
        L_0x004f:
            java.lang.String r2 = "FRAGMENT_STOPPED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0058
            goto L_0x0086
        L_0x0058:
            r8 = 4
            goto L_0x0087
        L_0x005a:
            java.lang.String r2 = "FRAGMENT_STARTED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0063
            goto L_0x0086
        L_0x0063:
            r8 = 3
            goto L_0x0087
        L_0x0065:
            java.lang.String r2 = "FRAGMENT_PAUSED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x006e
            goto L_0x0086
        L_0x006e:
            r8 = 2
            goto L_0x0087
        L_0x0070:
            java.lang.String r2 = "FRAGMENT_VIEW_CREATED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0079
            goto L_0x0086
        L_0x0079:
            r8 = 1
            goto L_0x0087
        L_0x007b:
            java.lang.String r2 = "FRAGMENT_DETACHED"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r8 = 0
            goto L_0x0087
        L_0x0086:
            r8 = -1
        L_0x0087:
            java.lang.String r2 = ": fragment "
            java.lang.String r3 = "In activity "
            switch(r8) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00dc;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a1;
                case 7: goto L_0x0098;
                case 8: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x00ed
        L_0x008f:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was resumed."
            r1.append(r6)
            goto L_0x00ed
        L_0x0098:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was attached."
            r1.append(r6)
            goto L_0x00ed
        L_0x00a1:
            java.lang.String r6 = "In container "
            java.lang.String r7 = ": dialog "
            i0.d.a.a.a.s(r1, r6, r5, r7, r5)
            java.lang.String r6 = " was displayed."
            r1.append(r6)
            goto L_0x00ed
        L_0x00ae:
            java.lang.String r8 = ": visibility of fragment "
            i0.d.a.a.a.s(r1, r3, r6, r8, r5)
            java.lang.String r6 = " changed, "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = "."
            r1.append(r6)
            goto L_0x00ed
        L_0x00c1:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was stopped."
            r1.append(r6)
            goto L_0x00ed
        L_0x00ca:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was started."
            r1.append(r6)
            goto L_0x00ed
        L_0x00d3:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was paused."
            r1.append(r6)
            goto L_0x00ed
        L_0x00dc:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was created."
            r1.append(r6)
            goto L_0x00ed
        L_0x00e5:
            i0.d.a.a.a.s(r1, r3, r6, r2, r5)
            java.lang.String r6 = " was detached."
            r1.append(r6)
        L_0x00ed:
            java.lang.String r6 = r1.toString()
            r0.b = r6
            r0.d = r5
            r5 = 0
            r0.e = r5
            r0.f = r5
            r4.d()
            java.util.ArrayList<i0.j.e.t0.h> r5 = r4.b
            r5.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.a1.e.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void d() {
        if (this.b.size() >= 100) {
            this.b.remove(0);
        }
    }
}
