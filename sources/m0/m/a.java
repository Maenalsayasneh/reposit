package m0.m;

import java.lang.reflect.Method;
import kotlin.random.Random;
import m0.n.b.i;
import m0.p.b;

/* compiled from: PlatformImplementations.kt */
public class a {

    /* renamed from: m0.m.a$a  reason: collision with other inner class name */
    /* compiled from: PlatformImplementations.kt */
    public static final class C0243a {
        public static final Method a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r6v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
            if (m0.n.b.i.a(r6, r0) != false) goto L_0x0039;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                m0.n.b.i.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                java.lang.String r5 = "it"
                r6 = 0
                if (r4 >= r2) goto L_0x0040
                r7 = r1[r4]
                java.lang.String r8 = "addSuppressed"
                boolean r8 = i0.d.a.a.a.z(r7, r5, r8)
                r9 = 1
                if (r8 == 0) goto L_0x0038
                java.lang.Class[] r8 = r7.getParameterTypes()
                java.lang.String r10 = "it.parameterTypes"
                m0.n.b.i.d(r8, r10)
                java.lang.String r10 = "$this$singleOrNull"
                m0.n.b.i.e(r8, r10)
                int r10 = r8.length
                if (r10 != r9) goto L_0x0031
                r6 = r8[r3]
            L_0x0031:
                boolean r6 = m0.n.b.i.a(r6, r0)
                if (r6 == 0) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r9 = r3
            L_0x0039:
                if (r9 == 0) goto L_0x003d
                r6 = r7
                goto L_0x0040
            L_0x003d:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0040:
                a = r6
                int r0 = r1.length
            L_0x0043:
                if (r3 >= r0) goto L_0x0053
                r2 = r1[r3]
                java.lang.String r4 = "getSuppressed"
                boolean r2 = i0.d.a.a.a.z(r2, r5, r4)
                if (r2 == 0) goto L_0x0050
                goto L_0x0053
            L_0x0050:
                int r3 = r3 + 1
                goto L_0x0043
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.m.a.C0243a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        Method method = C0243a.a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public Random b() {
        return new b();
    }
}
