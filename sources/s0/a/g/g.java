package s0.a.g;

import java.security.AccessControlException;
import java.security.PrivilegedAction;
import java.security.Security;

public class g {
    public static final ThreadLocal a = new ThreadLocal();

    public static class a implements PrivilegedAction {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        public Object run() {
            return Security.getProperty(this.a);
        }
    }

    public static class b implements PrivilegedAction {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        public Object run() {
            return System.getProperty(this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r0 = (java.lang.String) r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r1) {
        /*
            s0.a.g.g$a r0 = new s0.a.g.g$a
            r0.<init>(r1)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.ThreadLocal r0 = a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            s0.a.g.g$b r0 = new s0.a.g.g$b
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.g.g.a(java.lang.String):java.lang.String");
    }

    public static boolean b(String str) {
        try {
            return d(a(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean c(String str, boolean z) {
        try {
            String a2 = a(str);
            if (z) {
                return d(a2);
            }
            if (a2 == null) {
                return false;
            }
            if (a2.length() != 5) {
                return false;
            }
            if (a2.charAt(0) != 'f' && a2.charAt(0) != 'F') {
                return false;
            }
            if (a2.charAt(1) != 'a' && a2.charAt(1) != 'A') {
                return false;
            }
            if (a2.charAt(2) != 'l' && a2.charAt(2) != 'L') {
                return false;
            }
            if (a2.charAt(3) == 's' || a2.charAt(3) == 'S') {
                return a2.charAt(4) == 'e' || a2.charAt(4) == 'E';
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean d(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 't' && str.charAt(0) != 'T') {
            return false;
        }
        if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
            return false;
        }
        if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
            return str.charAt(3) == 'e' || str.charAt(3) == 'E';
        }
        return false;
    }
}
