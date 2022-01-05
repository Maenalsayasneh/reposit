package okhttp3.internal.cache;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import q0.h0.e.e;
import q0.h0.e.f;
import q0.h0.f.d;
import r0.h;
import r0.y;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {
    public static final Regex c = new Regex("[a-z0-9_-]{1,120}");
    public static final String d = "CLEAN";
    public static final String q = "DIRTY";
    public static final String x = "REMOVE";
    public static final String y = "READ";
    public long Y1;
    public final File Z1;
    public final File a2;
    public final File b2;
    public long c2;
    public h d2;
    public final LinkedHashMap<String, a> e2 = new LinkedHashMap<>(0, 0.75f, true);
    public int f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public long m2;
    public final q0.h0.f.c n2;
    public final c o2;
    public final q0.h0.k.b p2;
    public final File q2;
    public final int r2;
    public final int s2;

    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        public final boolean[] a;
        public boolean b;
        public final a c;
        public final /* synthetic */ DiskLruCache d;

        public Editor(DiskLruCache diskLruCache, a aVar) {
            boolean[] zArr;
            i.e(aVar, "entry");
            this.d = diskLruCache;
            this.c = aVar;
            if (aVar.d) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.s2];
            }
            this.a = zArr;
        }

        public final void a() throws IOException {
            synchronized (this.d) {
                if (!this.b) {
                    if (i.a(this.c.f, this)) {
                        this.d.b(this, false);
                    }
                    this.b = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() throws IOException {
            synchronized (this.d) {
                if (!this.b) {
                    if (i.a(this.c.f, this)) {
                        this.d.b(this, true);
                    }
                    this.b = true;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            if (i.a(this.c.f, this)) {
                DiskLruCache diskLruCache = this.d;
                if (diskLruCache.h2) {
                    diskLruCache.b(this, false);
                } else {
                    this.c.e = true;
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = new r0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            return r5;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0046 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final r0.w d(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.d
                monitor-enter(r0)
                boolean r1 = r4.b     // Catch:{ all -> 0x0059 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x004d
                okhttp3.internal.cache.DiskLruCache$a r1 = r4.c     // Catch:{ all -> 0x0059 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.f     // Catch:{ all -> 0x0059 }
                boolean r1 = m0.n.b.i.a(r1, r4)     // Catch:{ all -> 0x0059 }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001b
                r0.e r5 = new r0.e     // Catch:{ all -> 0x0059 }
                r5.<init>()     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r5
            L_0x001b:
                okhttp3.internal.cache.DiskLruCache$a r1 = r4.c     // Catch:{ all -> 0x0059 }
                boolean r1 = r1.d     // Catch:{ all -> 0x0059 }
                if (r1 != 0) goto L_0x0028
                boolean[] r1 = r4.a     // Catch:{ all -> 0x0059 }
                m0.n.b.i.c(r1)     // Catch:{ all -> 0x0059 }
                r1[r5] = r2     // Catch:{ all -> 0x0059 }
            L_0x0028:
                okhttp3.internal.cache.DiskLruCache$a r1 = r4.c     // Catch:{ all -> 0x0059 }
                java.util.List<java.io.File> r1 = r1.c     // Catch:{ all -> 0x0059 }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0059 }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0059 }
                okhttp3.internal.cache.DiskLruCache r2 = r4.d     // Catch:{ FileNotFoundException -> 0x0046 }
                q0.h0.k.b r2 = r2.p2     // Catch:{ FileNotFoundException -> 0x0046 }
                r0.w r1 = r2.b(r1)     // Catch:{ FileNotFoundException -> 0x0046 }
                q0.h0.e.f r2 = new q0.h0.e.f     // Catch:{ all -> 0x0059 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x0059 }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0059 }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r2
            L_0x0046:
                r0.e r5 = new r0.e     // Catch:{ all -> 0x0059 }
                r5.<init>()     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r5
            L_0x004d:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0059 }
                r1.<init>(r5)     // Catch:{ all -> 0x0059 }
                throw r1     // Catch:{ all -> 0x0059 }
            L_0x0059:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.d(int):r0.w");
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class a {
        public final long[] a;
        public final List<File> b = new ArrayList();
        public final List<File> c = new ArrayList();
        public boolean d;
        public boolean e;
        public Editor f;
        public int g;
        public long h;
        public final String i;
        public final /* synthetic */ DiskLruCache j;

        public a(DiskLruCache diskLruCache, String str) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            this.j = diskLruCache;
            this.i = str;
            this.a = new long[diskLruCache.s2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i2 = diskLruCache.s2;
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(i3);
                this.b.add(new File(diskLruCache.q2, sb.toString()));
                sb.append(".tmp");
                this.c.add(new File(diskLruCache.q2, sb.toString()));
                sb.setLength(length);
            }
        }

        public final b a() {
            DiskLruCache diskLruCache = this.j;
            byte[] bArr = q0.h0.c.a;
            if (!this.d) {
                return null;
            }
            if (!diskLruCache.h2 && (this.f != null || this.e)) {
                return null;
            }
            ArrayList<y> arrayList = new ArrayList<>();
            long[] jArr = (long[]) this.a.clone();
            try {
                int i2 = this.j.s2;
                for (int i3 = 0; i3 < i2; i3++) {
                    y a2 = this.j.p2.a(this.b.get(i3));
                    if (!this.j.h2) {
                        this.g++;
                        a2 = new e(this, a2, a2);
                    }
                    arrayList.add(a2);
                }
                return new b(this.j, this.i, this.h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                for (y d2 : arrayList) {
                    q0.h0.c.d(d2);
                }
                try {
                    this.j.y(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void b(h hVar) throws IOException {
            i.e(hVar, "writer");
            for (long B0 : this.a) {
                hVar.u(32).B0(B0);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class b implements Closeable {
        public final String c;
        public final long d;
        public final List<y> q;
        public final /* synthetic */ DiskLruCache x;

        public b(DiskLruCache diskLruCache, String str, long j, List<? extends y> list, long[] jArr) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            i.e(list, "sources");
            i.e(jArr, "lengths");
            this.x = diskLruCache;
            this.c = str;
            this.d = j;
            this.q = list;
        }

        public void close() {
            for (y d2 : this.q) {
                q0.h0.c.d(d2);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public static final class c extends q0.h0.f.a {
        public final /* synthetic */ DiskLruCache e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(DiskLruCache diskLruCache, String str) {
            super(str, true);
            this.e = diskLruCache;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r1 = r6.e;
            r1.l2 = true;
            r1.d2 = m0.r.t.a.r.m.a1.a.b0(new r0.e());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long a() {
            /*
                r6 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r6.e
                monitor-enter(r0)
                okhttp3.internal.cache.DiskLruCache r1 = r6.e     // Catch:{ all -> 0x003f }
                boolean r2 = r1.i2     // Catch:{ all -> 0x003f }
                r3 = -1
                if (r2 == 0) goto L_0x003d
                boolean r2 = r1.j2     // Catch:{ all -> 0x003f }
                if (r2 == 0) goto L_0x0010
                goto L_0x003d
            L_0x0010:
                r2 = 1
                r1.z()     // Catch:{ IOException -> 0x0015 }
                goto L_0x0019
            L_0x0015:
                okhttp3.internal.cache.DiskLruCache r1 = r6.e     // Catch:{ all -> 0x003f }
                r1.k2 = r2     // Catch:{ all -> 0x003f }
            L_0x0019:
                okhttp3.internal.cache.DiskLruCache r1 = r6.e     // Catch:{ IOException -> 0x002c }
                boolean r1 = r1.k()     // Catch:{ IOException -> 0x002c }
                if (r1 == 0) goto L_0x003b
                okhttp3.internal.cache.DiskLruCache r1 = r6.e     // Catch:{ IOException -> 0x002c }
                r1.w()     // Catch:{ IOException -> 0x002c }
                okhttp3.internal.cache.DiskLruCache r1 = r6.e     // Catch:{ IOException -> 0x002c }
                r5 = 0
                r1.f2 = r5     // Catch:{ IOException -> 0x002c }
                goto L_0x003b
            L_0x002c:
                okhttp3.internal.cache.DiskLruCache r1 = r6.e     // Catch:{ all -> 0x003f }
                r1.l2 = r2     // Catch:{ all -> 0x003f }
                r0.e r2 = new r0.e     // Catch:{ all -> 0x003f }
                r2.<init>()     // Catch:{ all -> 0x003f }
                r0.h r2 = m0.r.t.a.r.m.a1.a.b0(r2)     // Catch:{ all -> 0x003f }
                r1.d2 = r2     // Catch:{ all -> 0x003f }
            L_0x003b:
                monitor-exit(r0)
                return r3
            L_0x003d:
                monitor-exit(r0)
                return r3
            L_0x003f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.c.a():long");
        }
    }

    public DiskLruCache(q0.h0.k.b bVar, File file, int i, int i3, long j, d dVar) {
        i.e(bVar, "fileSystem");
        i.e(file, "directory");
        i.e(dVar, "taskRunner");
        this.p2 = bVar;
        this.q2 = file;
        this.r2 = i;
        this.s2 = i3;
        this.Y1 = j;
        boolean z = false;
        this.n2 = dVar.f();
        this.o2 = new c(this, i0.d.a.a.a.y0(new StringBuilder(), q0.h0.c.g, " Cache"));
        if (j > 0) {
            if (i3 > 0 ? true : z) {
                this.Z1 = new File(file, "journal");
                this.a2 = new File(file, "journal.tmp");
                this.b2 = new File(file, "journal.bkp");
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public final void C(String str) {
        if (!c.a(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public final synchronized void a() {
        if (!(!this.j2)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(okhttp3.internal.cache.DiskLruCache.Editor r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            m0.n.b.i.e(r9, r0)     // Catch:{ all -> 0x0120 }
            okhttp3.internal.cache.DiskLruCache$a r0 = r9.c     // Catch:{ all -> 0x0120 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.f     // Catch:{ all -> 0x0120 }
            boolean r1 = m0.n.b.i.a(r1, r9)     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x0114
            r1 = 0
            if (r10 == 0) goto L_0x0057
            boolean r2 = r0.d     // Catch:{ all -> 0x0120 }
            if (r2 != 0) goto L_0x0057
            int r2 = r8.s2     // Catch:{ all -> 0x0120 }
            r3 = r1
        L_0x001a:
            if (r3 >= r2) goto L_0x0057
            boolean[] r4 = r9.a     // Catch:{ all -> 0x0120 }
            m0.n.b.i.c(r4)     // Catch:{ all -> 0x0120 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0120 }
            if (r4 == 0) goto L_0x003d
            q0.h0.k.b r4 = r8.p2     // Catch:{ all -> 0x0120 }
            java.util.List<java.io.File> r5 = r0.c     // Catch:{ all -> 0x0120 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0120 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0120 }
            boolean r4 = r4.d(r5)     // Catch:{ all -> 0x0120 }
            if (r4 != 0) goto L_0x003a
            r9.a()     // Catch:{ all -> 0x0120 }
            monitor-exit(r8)
            return
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x003d:
            r9.a()     // Catch:{ all -> 0x0120 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            r10.<init>()     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0120 }
            r10.append(r3)     // Catch:{ all -> 0x0120 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0120 }
            r9.<init>(r10)     // Catch:{ all -> 0x0120 }
            throw r9     // Catch:{ all -> 0x0120 }
        L_0x0057:
            int r9 = r8.s2     // Catch:{ all -> 0x0120 }
        L_0x0059:
            if (r1 >= r9) goto L_0x009b
            java.util.List<java.io.File> r2 = r0.c     // Catch:{ all -> 0x0120 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0120 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0120 }
            if (r10 == 0) goto L_0x0093
            boolean r3 = r0.e     // Catch:{ all -> 0x0120 }
            if (r3 != 0) goto L_0x0093
            q0.h0.k.b r3 = r8.p2     // Catch:{ all -> 0x0120 }
            boolean r3 = r3.d(r2)     // Catch:{ all -> 0x0120 }
            if (r3 == 0) goto L_0x0098
            java.util.List<java.io.File> r3 = r0.b     // Catch:{ all -> 0x0120 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0120 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0120 }
            q0.h0.k.b r4 = r8.p2     // Catch:{ all -> 0x0120 }
            r4.e(r2, r3)     // Catch:{ all -> 0x0120 }
            long[] r2 = r0.a     // Catch:{ all -> 0x0120 }
            r4 = r2[r1]     // Catch:{ all -> 0x0120 }
            q0.h0.k.b r2 = r8.p2     // Catch:{ all -> 0x0120 }
            long r2 = r2.h(r3)     // Catch:{ all -> 0x0120 }
            long[] r6 = r0.a     // Catch:{ all -> 0x0120 }
            r6[r1] = r2     // Catch:{ all -> 0x0120 }
            long r6 = r8.c2     // Catch:{ all -> 0x0120 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.c2 = r6     // Catch:{ all -> 0x0120 }
            goto L_0x0098
        L_0x0093:
            q0.h0.k.b r3 = r8.p2     // Catch:{ all -> 0x0120 }
            r3.f(r2)     // Catch:{ all -> 0x0120 }
        L_0x0098:
            int r1 = r1 + 1
            goto L_0x0059
        L_0x009b:
            r9 = 0
            r0.f = r9     // Catch:{ all -> 0x0120 }
            boolean r9 = r0.e     // Catch:{ all -> 0x0120 }
            if (r9 == 0) goto L_0x00a7
            r8.y(r0)     // Catch:{ all -> 0x0120 }
            monitor-exit(r8)
            return
        L_0x00a7:
            int r9 = r8.f2     // Catch:{ all -> 0x0120 }
            r1 = 1
            int r9 = r9 + r1
            r8.f2 = r9     // Catch:{ all -> 0x0120 }
            r0.h r9 = r8.d2     // Catch:{ all -> 0x0120 }
            m0.n.b.i.c(r9)     // Catch:{ all -> 0x0120 }
            boolean r2 = r0.d     // Catch:{ all -> 0x0120 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00d6
            if (r10 == 0) goto L_0x00bd
            goto L_0x00d6
        L_0x00bd:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r10 = r8.e2     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r0.i     // Catch:{ all -> 0x0120 }
            r10.remove(r1)     // Catch:{ all -> 0x0120 }
            java.lang.String r10 = x     // Catch:{ all -> 0x0120 }
            r0.h r10 = r9.K(r10)     // Catch:{ all -> 0x0120 }
            r10.u(r4)     // Catch:{ all -> 0x0120 }
            java.lang.String r10 = r0.i     // Catch:{ all -> 0x0120 }
            r9.K(r10)     // Catch:{ all -> 0x0120 }
            r9.u(r3)     // Catch:{ all -> 0x0120 }
            goto L_0x00f7
        L_0x00d6:
            r0.d = r1     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = d     // Catch:{ all -> 0x0120 }
            r0.h r1 = r9.K(r1)     // Catch:{ all -> 0x0120 }
            r1.u(r4)     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r0.i     // Catch:{ all -> 0x0120 }
            r9.K(r1)     // Catch:{ all -> 0x0120 }
            r0.b(r9)     // Catch:{ all -> 0x0120 }
            r9.u(r3)     // Catch:{ all -> 0x0120 }
            if (r10 == 0) goto L_0x00f7
            long r1 = r8.m2     // Catch:{ all -> 0x0120 }
            r3 = 1
            long r3 = r3 + r1
            r8.m2 = r3     // Catch:{ all -> 0x0120 }
            r0.h = r1     // Catch:{ all -> 0x0120 }
        L_0x00f7:
            r9.flush()     // Catch:{ all -> 0x0120 }
            long r9 = r8.c2     // Catch:{ all -> 0x0120 }
            long r0 = r8.Y1     // Catch:{ all -> 0x0120 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0108
            boolean r9 = r8.k()     // Catch:{ all -> 0x0120 }
            if (r9 == 0) goto L_0x0112
        L_0x0108:
            q0.h0.f.c r9 = r8.n2     // Catch:{ all -> 0x0120 }
            okhttp3.internal.cache.DiskLruCache$c r10 = r8.o2     // Catch:{ all -> 0x0120 }
            r0 = 0
            r2 = 2
            q0.h0.f.c.d(r9, r10, r0, r2)     // Catch:{ all -> 0x0120 }
        L_0x0112:
            monitor-exit(r8)
            return
        L_0x0114:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0120 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0120 }
            r10.<init>(r9)     // Catch:{ all -> 0x0120 }
            throw r10     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.b(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public synchronized void close() throws IOException {
        if (this.i2) {
            if (!this.j2) {
                Collection<a> values = this.e2.values();
                i.d(values, "lruEntries.values");
                Object[] array = values.toArray(new a[0]);
                if (array != null) {
                    for (a aVar : (a[]) array) {
                        Editor editor = aVar.f;
                        if (!(editor == null || editor == null)) {
                            editor.c();
                        }
                    }
                    z();
                    h hVar = this.d2;
                    i.c(hVar);
                    hVar.close();
                    this.d2 = null;
                    this.j2 = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.j2 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor e(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            m0.n.b.i.e(r6, r0)     // Catch:{ all -> 0x0087 }
            r5.i()     // Catch:{ all -> 0x0087 }
            r5.a()     // Catch:{ all -> 0x0087 }
            r5.C(r6)     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r5.e2     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0087 }
            okhttp3.internal.cache.DiskLruCache$a r0 = (okhttp3.internal.cache.DiskLruCache.a) r0     // Catch:{ all -> 0x0087 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0026
            long r3 = r0.h     // Catch:{ all -> 0x0087 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0028
        L_0x0026:
            monitor-exit(r5)
            return r2
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            okhttp3.internal.cache.DiskLruCache$Editor r7 = r0.f     // Catch:{ all -> 0x0087 }
            goto L_0x002e
        L_0x002d:
            r7 = r2
        L_0x002e:
            if (r7 == 0) goto L_0x0032
            monitor-exit(r5)
            return r2
        L_0x0032:
            if (r0 == 0) goto L_0x003a
            int r7 = r0.g     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x003a
            monitor-exit(r5)
            return r2
        L_0x003a:
            boolean r7 = r5.k2     // Catch:{ all -> 0x0087 }
            if (r7 != 0) goto L_0x007b
            boolean r7 = r5.l2     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x0043
            goto L_0x007b
        L_0x0043:
            r0.h r7 = r5.d2     // Catch:{ all -> 0x0087 }
            m0.n.b.i.c(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r8 = q     // Catch:{ all -> 0x0087 }
            r0.h r8 = r7.K(r8)     // Catch:{ all -> 0x0087 }
            r1 = 32
            r0.h r8 = r8.u(r1)     // Catch:{ all -> 0x0087 }
            r0.h r8 = r8.K(r6)     // Catch:{ all -> 0x0087 }
            r1 = 10
            r8.u(r1)     // Catch:{ all -> 0x0087 }
            r7.flush()     // Catch:{ all -> 0x0087 }
            boolean r7 = r5.g2     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x0066
            monitor-exit(r5)
            return r2
        L_0x0066:
            if (r0 != 0) goto L_0x0072
            okhttp3.internal.cache.DiskLruCache$a r0 = new okhttp3.internal.cache.DiskLruCache$a     // Catch:{ all -> 0x0087 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r7 = r5.e2     // Catch:{ all -> 0x0087 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0087 }
        L_0x0072:
            okhttp3.internal.cache.DiskLruCache$Editor r6 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0087 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0087 }
            r0.f = r6     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x007b:
            q0.h0.f.c r6 = r5.n2     // Catch:{ all -> 0x0087 }
            okhttp3.internal.cache.DiskLruCache$c r7 = r5.o2     // Catch:{ all -> 0x0087 }
            r0 = 0
            r8 = 2
            q0.h0.f.c.d(r6, r7, r0, r8)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r2
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.e(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.b f(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            m0.n.b.i.e(r6, r0)     // Catch:{ all -> 0x005b }
            r5.i()     // Catch:{ all -> 0x005b }
            r5.a()     // Catch:{ all -> 0x005b }
            r5.C(r6)     // Catch:{ all -> 0x005b }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r5.e2     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005b }
            okhttp3.internal.cache.DiskLruCache$a r0 = (okhttp3.internal.cache.DiskLruCache.a) r0     // Catch:{ all -> 0x005b }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.String r2 = "lruEntries[key] ?: return null"
            m0.n.b.i.d(r0, r2)     // Catch:{ all -> 0x005b }
            okhttp3.internal.cache.DiskLruCache$b r0 = r0.a()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0057
            int r1 = r5.f2     // Catch:{ all -> 0x005b }
            int r1 = r1 + 1
            r5.f2 = r1     // Catch:{ all -> 0x005b }
            r0.h r1 = r5.d2     // Catch:{ all -> 0x005b }
            m0.n.b.i.c(r1)     // Catch:{ all -> 0x005b }
            java.lang.String r2 = y     // Catch:{ all -> 0x005b }
            r0.h r1 = r1.K(r2)     // Catch:{ all -> 0x005b }
            r2 = 32
            r0.h r1 = r1.u(r2)     // Catch:{ all -> 0x005b }
            r0.h r6 = r1.K(r6)     // Catch:{ all -> 0x005b }
            r1 = 10
            r6.u(r1)     // Catch:{ all -> 0x005b }
            boolean r6 = r5.k()     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x0055
            q0.h0.f.c r6 = r5.n2     // Catch:{ all -> 0x005b }
            okhttp3.internal.cache.DiskLruCache$c r1 = r5.o2     // Catch:{ all -> 0x005b }
            r2 = 0
            r4 = 2
            q0.h0.f.c.d(r6, r1, r2, r4)     // Catch:{ all -> 0x005b }
        L_0x0055:
            monitor-exit(r5)
            return r0
        L_0x0057:
            monitor-exit(r5)
            return r1
        L_0x0059:
            monitor-exit(r5)
            return r1
        L_0x005b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.f(java.lang.String):okhttp3.internal.cache.DiskLruCache$b");
    }

    public synchronized void flush() throws IOException {
        if (this.i2) {
            a();
            z();
            h hVar = this.d2;
            i.c(hVar);
            hVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        i0.j.f.p.h.H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        i0.j.f.p.h.H(r2, (java.lang.Throwable) null);
        r0.f(r1);
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void i() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = q0.h0.c.a     // Catch:{ all -> 0x00b4 }
            boolean r0 = r6.i2     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00b4 }
            java.io.File r1 = r6.b2     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.d(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x002e
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00b4 }
            java.io.File r1 = r6.Z1     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.d(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0025
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00b4 }
            java.io.File r1 = r6.b2     // Catch:{ all -> 0x00b4 }
            r0.f(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x002e
        L_0x0025:
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00b4 }
            java.io.File r1 = r6.b2     // Catch:{ all -> 0x00b4 }
            java.io.File r2 = r6.Z1     // Catch:{ all -> 0x00b4 }
            r0.e(r1, r2)     // Catch:{ all -> 0x00b4 }
        L_0x002e:
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00b4 }
            java.io.File r1 = r6.b2     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "$this$isCivilized"
            m0.n.b.i.e(r0, r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "file"
            m0.n.b.i.e(r1, r2)     // Catch:{ all -> 0x00b4 }
            r0.w r2 = r0.b(r1)     // Catch:{ all -> 0x00b4 }
            r3 = 0
            r4 = 0
            r5 = 1
            r0.f(r1)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            i0.j.f.p.h.H(r2, r3)     // Catch:{ all -> 0x00b4 }
            r0 = r5
            goto L_0x0059
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            i0.j.f.p.h.H(r2, r0)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ all -> 0x00b4 }
        L_0x0052:
            i0.j.f.p.h.H(r2, r3)     // Catch:{ all -> 0x00b4 }
            r0.f(r1)     // Catch:{ all -> 0x00b4 }
            r0 = r4
        L_0x0059:
            r6.h2 = r0     // Catch:{ all -> 0x00b4 }
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00b4 }
            java.io.File r1 = r6.Z1     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.d(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00ad
            r6.q()     // Catch:{ IOException -> 0x006f }
            r6.n()     // Catch:{ IOException -> 0x006f }
            r6.i2 = r5     // Catch:{ IOException -> 0x006f }
            monitor-exit(r6)
            return
        L_0x006f:
            r0 = move-exception
            q0.h0.l.h$a r1 = q0.h0.l.h.c     // Catch:{ all -> 0x00b4 }
            q0.h0.l.h r1 = q0.h0.l.h.a     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r2.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "DiskLruCache "
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.io.File r3 = r6.q2     // Catch:{ all -> 0x00b4 }
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = " is corrupt: "
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00b4 }
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = ", removing"
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b4 }
            r3 = 5
            r1.i(r2, r3, r0)     // Catch:{ all -> 0x00b4 }
            r6.close()     // Catch:{ all -> 0x00a9 }
            q0.h0.k.b r0 = r6.p2     // Catch:{ all -> 0x00a9 }
            java.io.File r1 = r6.q2     // Catch:{ all -> 0x00a9 }
            r0.c(r1)     // Catch:{ all -> 0x00a9 }
            r6.j2 = r4     // Catch:{ all -> 0x00b4 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            r6.j2 = r4     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00ad:
            r6.w()     // Catch:{ all -> 0x00b4 }
            r6.i2 = r5     // Catch:{ all -> 0x00b4 }
            monitor-exit(r6)
            return
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.i():void");
    }

    public final boolean k() {
        int i = this.f2;
        return i >= 2000 && i >= this.e2.size();
    }

    public final h l() throws FileNotFoundException {
        return m0.r.t.a.r.m.a1.a.b0(new f(this.p2.g(this.Z1), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    public final void n() throws IOException {
        this.p2.f(this.a2);
        Iterator<a> it = this.e2.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            i.d(next, "i.next()");
            a aVar = next;
            int i = 0;
            if (aVar.f == null) {
                int i3 = this.s2;
                while (i < i3) {
                    this.c2 += aVar.a[i];
                    i++;
                }
            } else {
                aVar.f = null;
                int i4 = this.s2;
                while (i < i4) {
                    this.p2.f(aVar.b.get(i));
                    this.p2.f(aVar.c.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|(1:21)(1:22)|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.f2 = r7 - r9.e2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.t() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.d2 = l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        i0.j.f.p.h.H(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        i0.j.f.p.h.H(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b6, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0082=Splitter:B:25:0x0082, B:18:0x0064=Splitter:B:18:0x0064} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            q0.h0.k.b r1 = r9.p2
            java.io.File r2 = r9.Z1
            r0.y r1 = r1.a(r2)
            r0.i r1 = m0.r.t.a.r.m.a1.a.c0(r1)
            java.lang.String r2 = r1.e0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r1.e0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = r1.e0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r5 = r1.e0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = r1.e0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = m0.n.b.i.a(r7, r2)     // Catch:{ all -> 0x00b0 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0082
            java.lang.String r7 = "1"
            boolean r7 = m0.n.b.i.a(r7, r3)     // Catch:{ all -> 0x00b0 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0082
            int r7 = r9.r2     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b0 }
            boolean r4 = m0.n.b.i.a(r7, r4)     // Catch:{ all -> 0x00b0 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0082
            int r4 = r9.s2     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b0 }
            boolean r4 = m0.n.b.i.a(r4, r5)     // Catch:{ all -> 0x00b0 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0082
            int r4 = r6.length()     // Catch:{ all -> 0x00b0 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            if (r8 != 0) goto L_0x0082
        L_0x005a:
            java.lang.String r0 = r1.e0()     // Catch:{ EOFException -> 0x0064 }
            r9.v(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r9.e2     // Catch:{ all -> 0x00b0 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b0 }
            int r7 = r7 - r0
            r9.f2 = r7     // Catch:{ all -> 0x00b0 }
            boolean r0 = r1.t()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0077
            r9.w()     // Catch:{ all -> 0x00b0 }
            goto L_0x007d
        L_0x0077:
            r0.h r0 = r9.l()     // Catch:{ all -> 0x00b0 }
            r9.d2 = r0     // Catch:{ all -> 0x00b0 }
        L_0x007d:
            r0 = 0
            i0.j.f.p.h.H(r1, r0)
            return
        L_0x0082:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r7.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b0 }
            r7.append(r2)     // Catch:{ all -> 0x00b0 }
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            r7.append(r3)     // Catch:{ all -> 0x00b0 }
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            r7.append(r5)     // Catch:{ all -> 0x00b0 }
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            r7.append(r6)     // Catch:{ all -> 0x00b0 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b0 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b0 }
            throw r4     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r2 = move-exception
            i0.j.f.p.h.H(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.q():void");
    }

    public final void v(String str) throws IOException {
        String str2;
        int l = StringsKt__IndentKt.l(str, ' ', 0, false, 6);
        if (l != -1) {
            int i = l + 1;
            int l3 = StringsKt__IndentKt.l(str, ' ', i, false, 4);
            if (l3 == -1) {
                str2 = str.substring(i);
                i.d(str2, "(this as java.lang.String).substring(startIndex)");
                String str3 = x;
                if (l == str3.length() && StringsKt__IndentKt.J(str, str3, false, 2)) {
                    this.e2.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, l3);
                i.d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            a aVar = this.e2.get(str2);
            if (aVar == null) {
                aVar = new a(this, str2);
                this.e2.put(str2, aVar);
            }
            if (l3 != -1) {
                String str4 = d;
                if (l == str4.length() && StringsKt__IndentKt.J(str, str4, false, 2)) {
                    String substring = str.substring(l3 + 1);
                    i.d(substring, "(this as java.lang.String).substring(startIndex)");
                    List D = StringsKt__IndentKt.D(substring, new char[]{' '}, false, 0, 6);
                    aVar.d = true;
                    aVar.f = null;
                    i.e(D, "strings");
                    if (D.size() == aVar.j.s2) {
                        try {
                            int size = D.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                aVar.a[i3] = Long.parseLong((String) D.get(i3));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + D);
                        }
                    } else {
                        throw new IOException("unexpected journal line: " + D);
                    }
                }
            }
            if (l3 == -1) {
                String str5 = q;
                if (l == str5.length() && StringsKt__IndentKt.J(str, str5, false, 2)) {
                    aVar.f = new Editor(this, aVar);
                    return;
                }
            }
            if (l3 == -1) {
                String str6 = y;
                if (l == str6.length() && StringsKt__IndentKt.J(str, str6, false, 2)) {
                    return;
                }
            }
            throw new IOException(i0.d.a.a.a.n0("unexpected journal line: ", str));
        }
        throw new IOException(i0.d.a.a.a.n0("unexpected journal line: ", str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        i0.j.f.p.h.H(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void w() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r0.h r0 = r7.d2     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00bb }
        L_0x0008:
            q0.h0.k.b r0 = r7.p2     // Catch:{ all -> 0x00bb }
            java.io.File r1 = r7.a2     // Catch:{ all -> 0x00bb }
            r0.w r0 = r0.b(r1)     // Catch:{ all -> 0x00bb }
            r0.h r0 = m0.r.t.a.r.m.a1.a.b0(r0)     // Catch:{ all -> 0x00bb }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            r0.h r2 = r0.K(r2)     // Catch:{ all -> 0x00b4 }
            r3 = 10
            r2.u(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "1"
            r0.h r2 = r0.K(r2)     // Catch:{ all -> 0x00b4 }
            r2.u(r3)     // Catch:{ all -> 0x00b4 }
            int r2 = r7.r2     // Catch:{ all -> 0x00b4 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b4 }
            r0.B0(r4)     // Catch:{ all -> 0x00b4 }
            r0.u(r3)     // Catch:{ all -> 0x00b4 }
            int r2 = r7.s2     // Catch:{ all -> 0x00b4 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b4 }
            r0.B0(r4)     // Catch:{ all -> 0x00b4 }
            r0.u(r3)     // Catch:{ all -> 0x00b4 }
            r0.u(r3)     // Catch:{ all -> 0x00b4 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r2 = r7.e2     // Catch:{ all -> 0x00b4 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00b4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00b4 }
        L_0x0048:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00b4 }
            okhttp3.internal.cache.DiskLruCache$a r4 = (okhttp3.internal.cache.DiskLruCache.a) r4     // Catch:{ all -> 0x00b4 }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.f     // Catch:{ all -> 0x00b4 }
            r6 = 32
            if (r5 == 0) goto L_0x006c
            java.lang.String r5 = q     // Catch:{ all -> 0x00b4 }
            r0.h r5 = r0.K(r5)     // Catch:{ all -> 0x00b4 }
            r5.u(r6)     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = r4.i     // Catch:{ all -> 0x00b4 }
            r0.K(r4)     // Catch:{ all -> 0x00b4 }
            r0.u(r3)     // Catch:{ all -> 0x00b4 }
            goto L_0x0048
        L_0x006c:
            java.lang.String r5 = d     // Catch:{ all -> 0x00b4 }
            r0.h r5 = r0.K(r5)     // Catch:{ all -> 0x00b4 }
            r5.u(r6)     // Catch:{ all -> 0x00b4 }
            java.lang.String r5 = r4.i     // Catch:{ all -> 0x00b4 }
            r0.K(r5)     // Catch:{ all -> 0x00b4 }
            r4.b(r0)     // Catch:{ all -> 0x00b4 }
            r0.u(r3)     // Catch:{ all -> 0x00b4 }
            goto L_0x0048
        L_0x0081:
            i0.j.f.p.h.H(r0, r1)     // Catch:{ all -> 0x00bb }
            q0.h0.k.b r0 = r7.p2     // Catch:{ all -> 0x00bb }
            java.io.File r1 = r7.Z1     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.d(r1)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0097
            q0.h0.k.b r0 = r7.p2     // Catch:{ all -> 0x00bb }
            java.io.File r1 = r7.Z1     // Catch:{ all -> 0x00bb }
            java.io.File r2 = r7.b2     // Catch:{ all -> 0x00bb }
            r0.e(r1, r2)     // Catch:{ all -> 0x00bb }
        L_0x0097:
            q0.h0.k.b r0 = r7.p2     // Catch:{ all -> 0x00bb }
            java.io.File r1 = r7.a2     // Catch:{ all -> 0x00bb }
            java.io.File r2 = r7.Z1     // Catch:{ all -> 0x00bb }
            r0.e(r1, r2)     // Catch:{ all -> 0x00bb }
            q0.h0.k.b r0 = r7.p2     // Catch:{ all -> 0x00bb }
            java.io.File r1 = r7.b2     // Catch:{ all -> 0x00bb }
            r0.f(r1)     // Catch:{ all -> 0x00bb }
            r0.h r0 = r7.l()     // Catch:{ all -> 0x00bb }
            r7.d2 = r0     // Catch:{ all -> 0x00bb }
            r0 = 0
            r7.g2 = r0     // Catch:{ all -> 0x00bb }
            r7.l2 = r0     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)
            return
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r2 = move-exception
            i0.j.f.p.h.H(r0, r1)     // Catch:{ all -> 0x00bb }
            throw r2     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.w():void");
    }

    public final boolean y(a aVar) throws IOException {
        h hVar;
        i.e(aVar, "entry");
        if (!this.h2) {
            if (aVar.g > 0 && (hVar = this.d2) != null) {
                hVar.K(q);
                hVar.u(32);
                hVar.K(aVar.i);
                hVar.u(10);
                hVar.flush();
            }
            if (aVar.g > 0 || aVar.f != null) {
                aVar.e = true;
                return true;
            }
        }
        Editor editor = aVar.f;
        if (editor != null) {
            editor.c();
        }
        int i = this.s2;
        for (int i3 = 0; i3 < i; i3++) {
            this.p2.f(aVar.b.get(i3));
            long j = this.c2;
            long[] jArr = aVar.a;
            this.c2 = j - jArr[i3];
            jArr[i3] = 0;
        }
        this.f2++;
        h hVar2 = this.d2;
        if (hVar2 != null) {
            hVar2.K(x);
            hVar2.u(32);
            hVar2.K(aVar.i);
            hVar2.u(10);
        }
        this.e2.remove(aVar.i);
        if (k()) {
            q0.h0.f.c.d(this.n2, this.o2, 0, 2);
        }
        return true;
    }

    public final void z() throws IOException {
        boolean z;
        do {
            z = false;
            if (this.c2 > this.Y1) {
                Iterator<a> it = this.e2.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (!next.e) {
                        i.d(next, "toEvict");
                        y(next);
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                this.k2 = false;
                return;
            }
        } while (z);
    }
}
