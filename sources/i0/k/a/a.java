package i0.k.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache */
public final class a implements Closeable {
    public static final Pattern c = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final OutputStream d = new b();
    public final File Y1;
    public final int Z1;
    public long a2;
    public final int b2;
    public long c2 = 0;
    public Writer d2;
    public final LinkedHashMap<String, d> e2 = new LinkedHashMap<>(0, 0.75f, true);
    public int f2;
    public long g2 = 0;
    public final ThreadPoolExecutor h2 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable<Void> i2 = new C0194a();
    public final File q;
    public final File x;
    public final File y;

    /* renamed from: i0.k.a.a$a  reason: collision with other inner class name */
    /* compiled from: DiskLruCache */
    public class C0194a implements Callable<Void> {
        public C0194a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                i0.k.a.a r0 = i0.k.a.a.this
                monitor-enter(r0)
                i0.k.a.a r1 = i0.k.a.a.this     // Catch:{ all -> 0x0023 }
                java.io.Writer r2 = r1.d2     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.y()     // Catch:{ all -> 0x0023 }
                i0.k.a.a r1 = i0.k.a.a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.i()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                i0.k.a.a r1 = i0.k.a.a.this     // Catch:{ all -> 0x0023 }
                r1.q()     // Catch:{ all -> 0x0023 }
                i0.k.a.a r1 = i0.k.a.a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f2 = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.k.a.a.C0194a.call():java.lang.Object");
        }
    }

    /* compiled from: DiskLruCache */
    public static class b extends OutputStream {
        public void write(int i) throws IOException {
        }
    }

    /* compiled from: DiskLruCache */
    public final class d {
        public final String a;
        public final long[] b;
        public boolean c;
        public c d;
        public long e;

        public d(String str, C0194a aVar) {
            this.a = str;
            this.b = new long[a.this.b2];
        }

        public File a(int i) {
            File file = a.this.q;
            return new File(file, this.a + "." + i);
        }

        public File b(int i) {
            File file = a.this.q;
            return new File(file, this.a + "." + i + ".tmp");
        }

        public String c() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        public final IOException d(String[] strArr) throws IOException {
            StringBuilder P0 = i0.d.a.a.a.P0("unexpected journal line: ");
            P0.append(Arrays.toString(strArr));
            throw new IOException(P0.toString());
        }
    }

    /* compiled from: DiskLruCache */
    public final class e implements Closeable {
        public final InputStream[] c;

        public e(a aVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, C0194a aVar2) {
            this.c = inputStreamArr;
        }

        public void close() {
            for (InputStream a : this.c) {
                c.a(a);
            }
        }
    }

    public a(File file, int i, int i3, long j) {
        File file2 = file;
        this.q = file2;
        this.Z1 = i;
        this.x = new File(file2, "journal");
        this.y = new File(file2, "journal.tmp");
        this.Y1 = new File(file2, "journal.bkp");
        this.b2 = i3;
        this.a2 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(i0.k.a.a r9, i0.k.a.a.c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            i0.k.a.a$d r0 = r10.a     // Catch:{ all -> 0x00fa }
            i0.k.a.a$c r1 = r0.d     // Catch:{ all -> 0x00fa }
            if (r1 != r10) goto L_0x00f4
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.c     // Catch:{ all -> 0x00fa }
            if (r2 != 0) goto L_0x0046
            r2 = r1
        L_0x000f:
            int r3 = r9.b2     // Catch:{ all -> 0x00fa }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.b     // Catch:{ all -> 0x00fa }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fa }
            if (r3 == 0) goto L_0x002c
            java.io.File r3 = r0.b(r2)     // Catch:{ all -> 0x00fa }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fa }
            if (r3 != 0) goto L_0x0029
            r10.a()     // Catch:{ all -> 0x00fa }
            monitor-exit(r9)
            goto L_0x00f3
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.a()     // Catch:{ all -> 0x00fa }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r11.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fa }
            r11.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fa }
            r10.<init>(r11)     // Catch:{ all -> 0x00fa }
            throw r10     // Catch:{ all -> 0x00fa }
        L_0x0046:
            int r10 = r9.b2     // Catch:{ all -> 0x00fa }
            if (r1 >= r10) goto L_0x0076
            java.io.File r10 = r0.b(r1)     // Catch:{ all -> 0x00fa }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x0073
            java.io.File r2 = r0.a(r1)     // Catch:{ all -> 0x00fa }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fa }
            long[] r10 = r0.b     // Catch:{ all -> 0x00fa }
            r3 = r10[r1]     // Catch:{ all -> 0x00fa }
            long r5 = r2.length()     // Catch:{ all -> 0x00fa }
            long[] r10 = r0.b     // Catch:{ all -> 0x00fa }
            r10[r1] = r5     // Catch:{ all -> 0x00fa }
            long r7 = r9.c2     // Catch:{ all -> 0x00fa }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.c2 = r7     // Catch:{ all -> 0x00fa }
            goto L_0x0073
        L_0x0070:
            e(r10)     // Catch:{ all -> 0x00fa }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f2     // Catch:{ all -> 0x00fa }
            r1 = 1
            int r10 = r10 + r1
            r9.f2 = r10     // Catch:{ all -> 0x00fa }
            r10 = 0
            r0.d = r10     // Catch:{ all -> 0x00fa }
            boolean r10 = r0.c     // Catch:{ all -> 0x00fa }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b6
            r0.c = r1     // Catch:{ all -> 0x00fa }
            java.io.Writer r10 = r9.d2     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r1.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x00fa }
            r1.append(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r0.c()     // Catch:{ all -> 0x00fa }
            r1.append(r3)     // Catch:{ all -> 0x00fa }
            r1.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fa }
            r10.write(r1)     // Catch:{ all -> 0x00fa }
            if (r11 == 0) goto L_0x00d8
            long r10 = r9.g2     // Catch:{ all -> 0x00fa }
            r1 = 1
            long r1 = r1 + r10
            r9.g2 = r1     // Catch:{ all -> 0x00fa }
            r0.e = r10     // Catch:{ all -> 0x00fa }
            goto L_0x00d8
        L_0x00b6:
            java.util.LinkedHashMap<java.lang.String, i0.k.a.a$d> r10 = r9.e2     // Catch:{ all -> 0x00fa }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00fa }
            r10.remove(r11)     // Catch:{ all -> 0x00fa }
            java.io.Writer r10 = r9.d2     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r11.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x00fa }
            r11.append(r0)     // Catch:{ all -> 0x00fa }
            r11.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fa }
            r10.write(r11)     // Catch:{ all -> 0x00fa }
        L_0x00d8:
            java.io.Writer r10 = r9.d2     // Catch:{ all -> 0x00fa }
            r10.flush()     // Catch:{ all -> 0x00fa }
            long r10 = r9.c2     // Catch:{ all -> 0x00fa }
            long r0 = r9.a2     // Catch:{ all -> 0x00fa }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00eb
            boolean r10 = r9.i()     // Catch:{ all -> 0x00fa }
            if (r10 == 0) goto L_0x00f2
        L_0x00eb:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.h2     // Catch:{ all -> 0x00fa }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.i2     // Catch:{ all -> 0x00fa }
            r10.submit(r11)     // Catch:{ all -> 0x00fa }
        L_0x00f2:
            monitor-exit(r9)
        L_0x00f3:
            return
        L_0x00f4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fa }
            r10.<init>()     // Catch:{ all -> 0x00fa }
            throw r10     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.a.a.a(i0.k.a.a, i0.k.a.a$c, boolean):void");
    }

    public static void e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void w(File file, File file2, boolean z) throws IOException {
        if (z) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void b() {
        if (this.d2 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() throws IOException {
        if (this.d2 != null) {
            Iterator it = new ArrayList(this.e2.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).d;
                if (cVar != null) {
                    cVar.a();
                }
            }
            y();
            this.d2.close();
            this.d2 = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f2++;
        r11.d2.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (i() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r11.h2.submit(r11.i2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        return new i0.k.a.a.e(r11, r12, r0.e, r8, r0.b, (i0.k.a.a.C0194a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized i0.k.a.a.e f(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.b()     // Catch:{ all -> 0x0081 }
            r11.z(r12)     // Catch:{ all -> 0x0081 }
            java.util.LinkedHashMap<java.lang.String, i0.k.a.a$d> r0 = r11.e2     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0081 }
            i0.k.a.a$d r0 = (i0.k.a.a.d) r0     // Catch:{ all -> 0x0081 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.c     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r11)
            return r1
        L_0x001a:
            int r2 = r11.b2     // Catch:{ all -> 0x0081 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0081 }
            r2 = 0
            r3 = r2
        L_0x0020:
            int r4 = r11.b2     // Catch:{ FileNotFoundException -> 0x006f }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006f }
            java.io.File r5 = r0.a(r3)     // Catch:{ FileNotFoundException -> 0x006f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006f }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r11.f2     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 1
            r11.f2 = r1     // Catch:{ all -> 0x0081 }
            java.io.Writer r1 = r11.d2     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r12)     // Catch:{ all -> 0x0081 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0081 }
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            boolean r1 = r11.i()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r11.h2     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.i2     // Catch:{ all -> 0x0081 }
            r1.submit(r2)     // Catch:{ all -> 0x0081 }
        L_0x0060:
            i0.k.a.a$e r1 = new i0.k.a.a$e     // Catch:{ all -> 0x0081 }
            long r6 = r0.e     // Catch:{ all -> 0x0081 }
            long[] r9 = r0.b     // Catch:{ all -> 0x0081 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0081 }
            monitor-exit(r11)
            return r1
        L_0x006f:
            int r12 = r11.b2     // Catch:{ all -> 0x0081 }
            if (r2 >= r12) goto L_0x007f
            r12 = r8[r2]     // Catch:{ all -> 0x0081 }
            if (r12 == 0) goto L_0x007f
            r12 = r8[r2]     // Catch:{ all -> 0x0081 }
            i0.k.a.c.a(r12)     // Catch:{ all -> 0x0081 }
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007f:
            monitor-exit(r11)
            return r1
        L_0x0081:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.a.a.f(java.lang.String):i0.k.a.a$e");
    }

    public final boolean i() {
        int i = this.f2;
        return i >= 2000 && i >= this.e2.size();
    }

    public final void k() throws IOException {
        e(this.y);
        Iterator<d> it = this.e2.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.b2) {
                    this.c2 += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.b2) {
                    e(next.a(i));
                    e(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f2 = r0 - r9.e2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x006c=Splitter:B:20:0x006c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            i0.k.a.b r1 = new i0.k.a.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.x
            r2.<init>(r3)
            java.nio.charset.Charset r3 = i0.k.a.c.a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.b()     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r1.b()     // Catch:{ all -> 0x009a }
            java.lang.String r4 = r1.b()     // Catch:{ all -> 0x009a }
            java.lang.String r5 = r1.b()     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r1.b()     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x006c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x006c
            int r7 = r9.Z1     // Catch:{ all -> 0x009a }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x009a }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            int r4 = r9.b2     // Catch:{ all -> 0x009a }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x009a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.b()     // Catch:{ EOFException -> 0x005f }
            r9.n(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, i0.k.a.a$d> r2 = r9.e2     // Catch:{ all -> 0x009a }
            int r2 = r2.size()     // Catch:{ all -> 0x009a }
            int r0 = r0 - r2
            r9.f2 = r0     // Catch:{ all -> 0x009a }
            i0.k.a.c.a(r1)
            return
        L_0x006c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r7.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x009a }
            r7.append(r2)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r3)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r5)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r6)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x009a }
            r4.<init>(r0)     // Catch:{ all -> 0x009a }
            throw r4     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            i0.k.a.c.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.a.a.l():void");
    }

    public final void n(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.e2.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            d dVar = this.e2.get(str2);
            if (dVar == null) {
                dVar = new d(str2, (C0194a) null);
                this.e2.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.c = true;
                dVar.d = null;
                if (split.length == a.this.b2) {
                    int i3 = 0;
                    while (i3 < split.length) {
                        try {
                            dVar.b[i3] = Long.parseLong(split[i3]);
                            i3++;
                        } catch (NumberFormatException unused) {
                            dVar.d(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.d(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.d = new c(dVar, (C0194a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(i0.d.a.a.a.n0("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(i0.d.a.a.a.n0("unexpected journal line: ", str));
        }
    }

    public final synchronized void q() throws IOException {
        Writer writer = this.d2;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.y), c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.Z1));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.b2));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.e2.values()) {
                if (next.d != null) {
                    bufferedWriter.write("DIRTY " + next.a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.a + next.c() + 10);
                }
            }
            bufferedWriter.close();
            if (this.x.exists()) {
                w(this.x, this.Y1, true);
            }
            w(this.y, this.x, false);
            this.Y1.delete();
            this.d2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.x, true), c.a));
        } finally {
            bufferedWriter.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean v(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.b()     // Catch:{ all -> 0x008a }
            r7.z(r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, i0.k.a.a$d> r0 = r7.e2     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            i0.k.a.a$d r0 = (i0.k.a.a.d) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            i0.k.a.a$c r2 = r0.d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0017
            goto L_0x0088
        L_0x0017:
            int r2 = r7.b2     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0053
            java.io.File r2 = r0.a(r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r0.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.c2     // Catch:{ all -> 0x008a }
            long[] r4 = r0.b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            long r2 = r2 - r5
            r7.c2 = r2     // Catch:{ all -> 0x008a }
            r2 = 0
            r4[r1] = r2     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0053:
            int r0 = r7.f2     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f2 = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.d2     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r2.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, i0.k.a.a$d> r0 = r7.e2     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.i()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.h2     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.i2     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.a.a.v(java.lang.String):boolean");
    }

    public final void y() throws IOException {
        while (this.c2 > this.a2) {
            v((String) this.e2.entrySet().iterator().next().getKey());
        }
    }

    public final void z(String str) {
        if (!c.matcher(str).matches()) {
            throw new IllegalArgumentException(i0.d.a.a.a.o0("keys must match regex [a-z0-9_-]{1,64}: \"", str, "\""));
        }
    }

    /* compiled from: DiskLruCache */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar, C0194a aVar) {
            boolean[] zArr;
            this.a = dVar;
            if (dVar.c) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.b2];
            }
            this.b = zArr;
        }

        public void a() throws IOException {
            a.a(a.this, this, false);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream b(int r5) throws java.io.IOException {
            /*
                r4 = this;
                i0.k.a.a r0 = i0.k.a.a.this
                monitor-enter(r0)
                i0.k.a.a$d r1 = r4.a     // Catch:{ all -> 0x003a }
                i0.k.a.a$c r2 = r1.d     // Catch:{ all -> 0x003a }
                if (r2 != r4) goto L_0x0034
                boolean r2 = r1.c     // Catch:{ all -> 0x003a }
                if (r2 != 0) goto L_0x0012
                boolean[] r2 = r4.b     // Catch:{ all -> 0x003a }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x003a }
            L_0x0012:
                java.io.File r5 = r1.b(r5)     // Catch:{ all -> 0x003a }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x001c }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x001c }
                goto L_0x0028
            L_0x001c:
                i0.k.a.a r1 = i0.k.a.a.this     // Catch:{ all -> 0x003a }
                java.io.File r1 = r1.q     // Catch:{ all -> 0x003a }
                r1.mkdirs()     // Catch:{ all -> 0x003a }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0030 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0030 }
            L_0x0028:
                i0.k.a.a$c$a r5 = new i0.k.a.a$c$a     // Catch:{ all -> 0x003a }
                r2 = 0
                r5.<init>(r1, r2)     // Catch:{ all -> 0x003a }
                monitor-exit(r0)     // Catch:{ all -> 0x003a }
                return r5
            L_0x0030:
                java.io.OutputStream r5 = i0.k.a.a.d     // Catch:{ all -> 0x003a }
                monitor-exit(r0)     // Catch:{ all -> 0x003a }
                return r5
            L_0x0034:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003a }
                r5.<init>()     // Catch:{ all -> 0x003a }
                throw r5     // Catch:{ all -> 0x003a }
            L_0x003a:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003a }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.k.a.a.c.b(int):java.io.OutputStream");
        }

        /* renamed from: i0.k.a.a$c$a  reason: collision with other inner class name */
        /* compiled from: DiskLruCache */
        public class C0195a extends FilterOutputStream {
            public C0195a(OutputStream outputStream, C0194a aVar) {
                super(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }
    }
}
