package h0.m.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import h0.m.a.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat */
public class a {
    public static final Object a = new Object();
    public static volatile a b;
    public final ReadWriteLock c;
    public final Set<d> d;
    public int e = 3;
    public final Handler f;
    public final b g;
    public final f h;
    public final int i;

    /* renamed from: h0.m.a.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiCompat */
    public static final class C0056a extends b {
        public volatile c b;
        public volatile f c;

        /* renamed from: h0.m.a.a$a$a  reason: collision with other inner class name */
        /* compiled from: EmojiCompat */
        public class C0057a extends g {
            public C0057a() {
            }

            public void a(f fVar) {
                C0056a aVar = C0056a.this;
                aVar.c = fVar;
                f fVar2 = aVar.c;
                h hVar = new h();
                Objects.requireNonNull(aVar.a);
                Objects.requireNonNull(aVar.a);
                aVar.b = new c(fVar2, hVar, false, (int[]) null);
                aVar.a.e();
            }
        }

        public C0056a(a aVar) {
            super(aVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: android.text.Spannable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: android.text.SpannableString} */
        /* JADX WARNING: type inference failed for: r7v4 */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ all -> 0x014f }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[Catch:{ all -> 0x014f }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0148  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.CharSequence a(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r3 = r20
                r4 = r16
                h0.m.a.c r5 = r4.b
                java.util.Objects.requireNonNull(r5)
                boolean r6 = r1 instanceof h0.m.b.i
                if (r6 == 0) goto L_0x0019
                r7 = r1
                h0.m.b.i r7 = (h0.m.b.i) r7
                r7.a()
            L_0x0019:
                r7 = 0
                if (r6 != 0) goto L_0x003a
                boolean r8 = r1 instanceof android.text.Spannable     // Catch:{ all -> 0x014f }
                if (r8 == 0) goto L_0x0021
                goto L_0x003a
            L_0x0021:
                boolean r8 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x014f }
                if (r8 == 0) goto L_0x003d
                r8 = r1
                android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x014f }
                int r9 = r0 + -1
                int r10 = r2 + 1
                java.lang.Class<h0.m.a.d> r11 = h0.m.a.d.class
                int r8 = r8.nextSpanTransition(r9, r10, r11)     // Catch:{ all -> 0x014f }
                if (r8 > r2) goto L_0x003d
                android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x014f }
                r7.<init>(r1)     // Catch:{ all -> 0x014f }
                goto L_0x003d
            L_0x003a:
                r7 = r1
                android.text.Spannable r7 = (android.text.Spannable) r7     // Catch:{ all -> 0x014f }
            L_0x003d:
                r8 = 0
                if (r7 == 0) goto L_0x006b
                java.lang.Class<h0.m.a.d> r9 = h0.m.a.d.class
                java.lang.Object[] r9 = r7.getSpans(r0, r2, r9)     // Catch:{ all -> 0x014f }
                h0.m.a.d[] r9 = (h0.m.a.d[]) r9     // Catch:{ all -> 0x014f }
                if (r9 == 0) goto L_0x006b
                int r10 = r9.length     // Catch:{ all -> 0x014f }
                if (r10 <= 0) goto L_0x006b
                int r10 = r9.length     // Catch:{ all -> 0x014f }
                r11 = r8
            L_0x004f:
                if (r11 >= r10) goto L_0x006b
                r12 = r9[r11]     // Catch:{ all -> 0x014f }
                int r13 = r7.getSpanStart(r12)     // Catch:{ all -> 0x014f }
                int r14 = r7.getSpanEnd(r12)     // Catch:{ all -> 0x014f }
                if (r13 == r2) goto L_0x0060
                r7.removeSpan(r12)     // Catch:{ all -> 0x014f }
            L_0x0060:
                int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x014f }
                int r2 = java.lang.Math.max(r14, r2)     // Catch:{ all -> 0x014f }
                int r11 = r11 + 1
                goto L_0x004f
            L_0x006b:
                if (r0 == r2) goto L_0x0146
                int r9 = r17.length()     // Catch:{ all -> 0x014f }
                if (r0 < r9) goto L_0x0075
                goto L_0x0146
            L_0x0075:
                r9 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r9) goto L_0x008a
                if (r7 == 0) goto L_0x008a
                int r9 = r7.length()     // Catch:{ all -> 0x014f }
                java.lang.Class<h0.m.a.d> r10 = h0.m.a.d.class
                java.lang.Object[] r9 = r7.getSpans(r8, r9, r10)     // Catch:{ all -> 0x014f }
                h0.m.a.d[] r9 = (h0.m.a.d[]) r9     // Catch:{ all -> 0x014f }
                int r9 = r9.length     // Catch:{ all -> 0x014f }
                int r3 = r3 - r9
            L_0x008a:
                h0.m.a.c$b r9 = new h0.m.a.c$b     // Catch:{ all -> 0x014f }
                h0.m.a.f r10 = r5.b     // Catch:{ all -> 0x014f }
                h0.m.a.f$a r10 = r10.c     // Catch:{ all -> 0x014f }
                boolean r11 = r5.d     // Catch:{ all -> 0x014f }
                int[] r12 = r5.e     // Catch:{ all -> 0x014f }
                r9.<init>(r10, r11, r12)     // Catch:{ all -> 0x014f }
                int r10 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x014f }
                r11 = r8
            L_0x009c:
                r12 = r10
                r10 = r0
            L_0x009e:
                r13 = 33
                r14 = 2
                r15 = 1
                if (r0 >= r2) goto L_0x00f9
                if (r11 >= r3) goto L_0x00f9
                int r8 = r9.a(r12)     // Catch:{ all -> 0x014f }
                if (r8 == r15) goto L_0x00e7
                if (r8 == r14) goto L_0x00db
                r14 = 3
                if (r8 == r14) goto L_0x00b2
                goto L_0x00f7
            L_0x00b2:
                if (r21 != 0) goto L_0x00be
                h0.m.a.f$a r8 = r9.d     // Catch:{ all -> 0x014f }
                h0.m.a.b r8 = r8.b     // Catch:{ all -> 0x014f }
                boolean r8 = r5.b(r1, r10, r0, r8)     // Catch:{ all -> 0x014f }
                if (r8 != 0) goto L_0x00d8
            L_0x00be:
                if (r7 != 0) goto L_0x00c5
                android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x014f }
                r7.<init>(r1)     // Catch:{ all -> 0x014f }
            L_0x00c5:
                h0.m.a.f$a r8 = r9.d     // Catch:{ all -> 0x014f }
                h0.m.a.b r8 = r8.b     // Catch:{ all -> 0x014f }
                h0.m.a.a$h r14 = r5.a     // Catch:{ all -> 0x014f }
                java.util.Objects.requireNonNull(r14)     // Catch:{ all -> 0x014f }
                h0.m.a.g r14 = new h0.m.a.g     // Catch:{ all -> 0x014f }
                r14.<init>(r8)     // Catch:{ all -> 0x014f }
                r7.setSpan(r14, r10, r0, r13)     // Catch:{ all -> 0x014f }
                int r11 = r11 + 1
            L_0x00d8:
                r10 = r12
                r8 = 0
                goto L_0x009c
            L_0x00db:
                int r8 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x014f }
                int r0 = r0 + r8
                if (r0 >= r2) goto L_0x00f7
                int r12 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x014f }
                goto L_0x00f7
            L_0x00e7:
                int r0 = java.lang.Character.codePointAt(r1, r10)     // Catch:{ all -> 0x014f }
                int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x014f }
                int r0 = r0 + r10
                if (r0 >= r2) goto L_0x00f6
                int r12 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x014f }
            L_0x00f6:
                r10 = r0
            L_0x00f7:
                r8 = 0
                goto L_0x009e
            L_0x00f9:
                int r2 = r9.a     // Catch:{ all -> 0x014f }
                if (r2 != r14) goto L_0x010f
                h0.m.a.f$a r2 = r9.c     // Catch:{ all -> 0x014f }
                h0.m.a.b r2 = r2.b     // Catch:{ all -> 0x014f }
                if (r2 == 0) goto L_0x010f
                int r2 = r9.f     // Catch:{ all -> 0x014f }
                if (r2 > r15) goto L_0x010d
                boolean r2 = r9.c()     // Catch:{ all -> 0x014f }
                if (r2 == 0) goto L_0x010f
            L_0x010d:
                r8 = r15
                goto L_0x0110
            L_0x010f:
                r8 = 0
            L_0x0110:
                if (r8 == 0) goto L_0x0139
                if (r11 >= r3) goto L_0x0139
                if (r21 != 0) goto L_0x0120
                h0.m.a.f$a r2 = r9.c     // Catch:{ all -> 0x014f }
                h0.m.a.b r2 = r2.b     // Catch:{ all -> 0x014f }
                boolean r2 = r5.b(r1, r10, r0, r2)     // Catch:{ all -> 0x014f }
                if (r2 != 0) goto L_0x0139
            L_0x0120:
                if (r7 != 0) goto L_0x0128
                android.text.SpannableString r2 = new android.text.SpannableString     // Catch:{ all -> 0x014f }
                r2.<init>(r1)     // Catch:{ all -> 0x014f }
                r7 = r2
            L_0x0128:
                h0.m.a.f$a r2 = r9.c     // Catch:{ all -> 0x014f }
                h0.m.a.b r2 = r2.b     // Catch:{ all -> 0x014f }
                h0.m.a.a$h r3 = r5.a     // Catch:{ all -> 0x014f }
                java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x014f }
                h0.m.a.g r3 = new h0.m.a.g     // Catch:{ all -> 0x014f }
                r3.<init>(r2)     // Catch:{ all -> 0x014f }
                r7.setSpan(r3, r10, r0, r13)     // Catch:{ all -> 0x014f }
            L_0x0139:
                if (r7 != 0) goto L_0x013c
                r7 = r1
            L_0x013c:
                if (r6 == 0) goto L_0x0144
                r0 = r1
                h0.m.b.i r0 = (h0.m.b.i) r0
                r0.b()
            L_0x0144:
                r1 = r7
                goto L_0x014e
            L_0x0146:
                if (r6 == 0) goto L_0x014e
                r0 = r1
                h0.m.b.i r0 = (h0.m.b.i) r0
                r0.b()
            L_0x014e:
                return r1
            L_0x014f:
                r0 = move-exception
                if (r6 == 0) goto L_0x0157
                h0.m.b.i r1 = (h0.m.b.i) r1
                r1.b()
            L_0x0157:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.m.a.a.C0056a.a(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        public void b(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            h0.a0.a.a.b bVar = this.c.a;
            int a = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? bVar.b.getInt(a + bVar.a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }

        public void c() {
            try {
                ((e.b) this.a.h).c(new C0057a());
            } catch (Throwable th) {
                this.a.d(th);
            }
        }
    }

    /* compiled from: EmojiCompat */
    public static class b {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public CharSequence a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        public void b(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class c {
        public final f a;

        public c(f fVar) {
            g0.a.b.b.a.m(fVar, "metadataLoader cannot be null.");
            this.a = fVar;
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class d {
        public void a() {
        }
    }

    /* compiled from: EmojiCompat */
    public static class e implements Runnable {
        public final List<d> c;
        public final Throwable d;
        public final int q;

        public e(Collection<d> collection, int i, Throwable th) {
            g0.a.b.b.a.m(collection, "initCallbacks cannot be null");
            this.c = new ArrayList(collection);
            this.q = i;
            this.d = th;
        }

        public void run() {
            int size = this.c.size();
            int i = 0;
            if (this.q != 1) {
                while (i < size) {
                    Objects.requireNonNull(this.c.get(i));
                    i++;
                }
                return;
            }
            while (i < size) {
                this.c.get(i).a();
                i++;
            }
        }
    }

    /* compiled from: EmojiCompat */
    public interface f {
    }

    /* compiled from: EmojiCompat */
    public static abstract class g {
        public abstract void a(f fVar);
    }

    /* compiled from: EmojiCompat */
    public static class h {
    }

    public a(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        Objects.requireNonNull(cVar);
        this.i = -16711936;
        this.h = cVar.a;
        this.f = new Handler(Looper.getMainLooper());
        this.d = new h0.f.c(0);
        C0056a aVar = new C0056a(this);
        this.g = aVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (b() == 0) {
                aVar.c();
            }
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public static a a() {
        a aVar;
        synchronized (a) {
            if (b != null) {
                aVar = b;
            } else {
                throw new IllegalStateException("EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            }
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r11 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a8, code lost:
        if (r10 != -1) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x00f5
            if (r9 < 0) goto L_0x00f5
            if (r10 >= 0) goto L_0x000a
            goto L_0x00f5
        L_0x000a:
            int r2 = android.text.Selection.getSelectionStart(r8)
            int r3 = android.text.Selection.getSelectionEnd(r8)
            r4 = -1
            if (r2 == r4) goto L_0x001c
            if (r3 == r4) goto L_0x001c
            if (r2 == r3) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r5 = r1
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            if (r5 == 0) goto L_0x0021
            goto L_0x00f5
        L_0x0021:
            if (r11 == 0) goto L_0x00ab
            int r9 = java.lang.Math.max(r9, r1)
            int r11 = r8.length()
            if (r2 < 0) goto L_0x0062
            if (r11 >= r2) goto L_0x0030
            goto L_0x0062
        L_0x0030:
            if (r9 >= 0) goto L_0x0033
            goto L_0x0062
        L_0x0033:
            r11 = r1
        L_0x0034:
            if (r9 != 0) goto L_0x0037
            goto L_0x0063
        L_0x0037:
            int r2 = r2 + -1
            if (r2 >= 0) goto L_0x0040
            if (r11 == 0) goto L_0x003e
            goto L_0x0062
        L_0x003e:
            r2 = r1
            goto L_0x0063
        L_0x0040:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x0050
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x004d
            goto L_0x0062
        L_0x004d:
            int r9 = r9 + -1
            goto L_0x0033
        L_0x0050:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0059
            int r9 = r9 + -1
            goto L_0x0034
        L_0x0059:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r11 = r0
            goto L_0x0034
        L_0x0062:
            r2 = r4
        L_0x0063:
            int r9 = java.lang.Math.max(r10, r1)
            int r10 = r8.length()
            if (r3 < 0) goto L_0x00a5
            if (r10 >= r3) goto L_0x0070
            goto L_0x00a5
        L_0x0070:
            if (r9 >= 0) goto L_0x0073
            goto L_0x00a5
        L_0x0073:
            r11 = r1
        L_0x0074:
            if (r9 != 0) goto L_0x0078
            r10 = r3
            goto L_0x00a6
        L_0x0078:
            if (r3 < r10) goto L_0x007d
            if (r11 == 0) goto L_0x00a6
            goto L_0x00a5
        L_0x007d:
            char r5 = r8.charAt(r3)
            if (r11 == 0) goto L_0x008f
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x008a
            goto L_0x00a5
        L_0x008a:
            int r9 = r9 + -1
            int r3 = r3 + 1
            goto L_0x0073
        L_0x008f:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x009a
            int r9 = r9 + -1
            int r3 = r3 + 1
            goto L_0x0074
        L_0x009a:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x00a1
            goto L_0x00a5
        L_0x00a1:
            int r3 = r3 + 1
            r11 = r0
            goto L_0x0074
        L_0x00a5:
            r10 = r4
        L_0x00a6:
            if (r2 == r4) goto L_0x00f5
            if (r10 != r4) goto L_0x00b9
            goto L_0x00f5
        L_0x00ab:
            int r2 = r2 - r9
            int r2 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r3, r9)
        L_0x00b9:
            java.lang.Class<h0.m.a.d> r9 = h0.m.a.d.class
            java.lang.Object[] r9 = r8.getSpans(r2, r10, r9)
            h0.m.a.d[] r9 = (h0.m.a.d[]) r9
            if (r9 == 0) goto L_0x00f5
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00f5
            int r11 = r9.length
            r3 = r1
        L_0x00c8:
            if (r3 >= r11) goto L_0x00df
            r4 = r9[r3]
            int r5 = r8.getSpanStart(r4)
            int r4 = r8.getSpanEnd(r4)
            int r2 = java.lang.Math.min(r5, r2)
            int r10 = java.lang.Math.max(r4, r10)
            int r3 = r3 + 1
            goto L_0x00c8
        L_0x00df:
            int r9 = java.lang.Math.max(r2, r1)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            goto L_0x00f6
        L_0x00f5:
            r0 = r1
        L_0x00f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.a.a.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public int b() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.c.writeLock().lock();
        try {
            this.e = 2;
            arrayList.addAll(this.d);
            this.d.clear();
            this.c.writeLock().unlock();
            this.f.post(new e(arrayList, this.e, th));
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void e() {
        ArrayList arrayList = new ArrayList();
        this.c.writeLock().lock();
        try {
            this.e = 1;
            arrayList.addAll(this.d);
            this.d.clear();
            this.c.writeLock().unlock();
            this.f.post(new e(arrayList, this.e, (Throwable) null));
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence f(CharSequence charSequence) {
        return g(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    public CharSequence g(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        if (b() == 1) {
            g0.a.b.b.a.l(i2, "start cannot be negative");
            g0.a.b.b.a.l(i3, "end cannot be negative");
            g0.a.b.b.a.l(i4, "maxEmojiCount cannot be negative");
            g0.a.b.b.a.j(i2 <= i3, "start should be <= than end");
            if (charSequence == null) {
                return charSequence;
            }
            g0.a.b.b.a.j(i2 <= charSequence.length(), "start should be < than charSequence length");
            g0.a.b.b.a.j(i3 <= charSequence.length(), "end should be < than charSequence length");
            if (charSequence.length() == 0 || i2 == i3) {
                return charSequence;
            }
            return this.g.a(charSequence, i2, i3, i4, i5 == 1);
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public void h(d dVar) {
        g0.a.b.b.a.m(dVar, "initCallback cannot be null");
        this.c.writeLock().lock();
        try {
            int i2 = this.e;
            if (i2 != 1) {
                if (i2 != 2) {
                    this.d.add(dVar);
                }
            }
            Handler handler = this.f;
            g0.a.b.b.a.m(dVar, "initCallback cannot be null");
            handler.post(new e(Arrays.asList(new d[]{dVar}), i2, (Throwable) null));
        } finally {
            this.c.writeLock().unlock();
        }
    }
}
