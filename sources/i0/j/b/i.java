package i0.j.b;

import com.instabug.bug.OnSdkDismissedCallback$DismissType;
import com.instabug.library.OnSdkDismissCallback;
import i0.j.b.s.b;
import java.util.Objects;

/* compiled from: ReportingPluginWrapper */
public class i {

    /* compiled from: ReportingPluginWrapper */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.bug.OnSdkDismissedCallback$DismissType.values()
                r0 = 3
                int[] r1 = new int[r0]
                a = r1
                com.instabug.bug.OnSdkDismissedCallback$DismissType r2 = com.instabug.bug.OnSdkDismissedCallback$DismissType.CANCEL     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r2 = com.instabug.bug.OnSdkDismissedCallback$DismissType.SUBMIT     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r2 = com.instabug.bug.OnSdkDismissedCallback$DismissType.ADD_ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.b.i.a.<clinit>():void");
        }
    }

    public static OnSdkDismissCallback.DismissType a(OnSdkDismissedCallback$DismissType onSdkDismissedCallback$DismissType) {
        int i = a.a[onSdkDismissedCallback$DismissType.ordinal()];
        if (i == 2) {
            return OnSdkDismissCallback.DismissType.SUBMIT;
        }
        if (i != 3) {
            return OnSdkDismissCallback.DismissType.CANCEL;
        }
        return OnSdkDismissCallback.DismissType.ADD_ATTACHMENT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instabug.library.OnSdkDismissCallback.ReportType b(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = -191501435(0xfffffffff495eb85, float:-9.502309E31)
            if (r0 == r4) goto L_0x003a
            r4 = 97908(0x17e74, float:1.37198E-40)
            if (r0 == r4) goto L_0x0030
            r4 = 253684815(0xf1eec4f, float:7.835513E-30)
            if (r0 == r4) goto L_0x0026
            r4 = 1621082316(0x609fc0cc, float:9.20914E19)
            if (r0 == r4) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r0 = "ask a question"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0044
            r5 = r2
            goto L_0x0045
        L_0x0026:
            java.lang.String r0 = "not-available"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0044
            r5 = r1
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "bug"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0044
            r5 = 1
            goto L_0x0045
        L_0x003a:
            java.lang.String r0 = "feedback"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0044
            r5 = r3
            goto L_0x0045
        L_0x0044:
            r5 = -1
        L_0x0045:
            if (r5 == r3) goto L_0x0054
            if (r5 == r2) goto L_0x0051
            if (r5 == r1) goto L_0x004e
            com.instabug.library.OnSdkDismissCallback$ReportType r5 = com.instabug.library.OnSdkDismissCallback.ReportType.BUG
            return r5
        L_0x004e:
            com.instabug.library.OnSdkDismissCallback$ReportType r5 = com.instabug.library.OnSdkDismissCallback.ReportType.OTHER
            return r5
        L_0x0051:
            com.instabug.library.OnSdkDismissCallback$ReportType r5 = com.instabug.library.OnSdkDismissCallback.ReportType.QUESTION
            return r5
        L_0x0054:
            com.instabug.library.OnSdkDismissCallback$ReportType r5 = com.instabug.library.OnSdkDismissCallback.ReportType.FEEDBACK
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.b.i.b(java.lang.String):com.instabug.library.OnSdkDismissCallback$ReportType");
    }

    public static boolean c(String str) {
        Objects.requireNonNull(i0.j.b.s.a.h());
        return b.a().l.b.get(str).booleanValue();
    }
}
