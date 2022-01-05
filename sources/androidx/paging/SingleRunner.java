package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import m0.n.b.i;
import n0.a.f1;
import n0.a.k2.b;
import n0.a.k2.d;

/* compiled from: SingleRunner.kt */
public final class SingleRunner {
    public final Holder a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Landroidx/paging/SingleRunner;", "c", "Landroidx/paging/SingleRunner;", "getRunner", "()Landroidx/paging/SingleRunner;", "runner", "<init>", "(Landroidx/paging/SingleRunner;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SingleRunner.kt */
    public static final class CancelIsolatedRunnerException extends CancellationException {
        public final SingleRunner c;

        public CancelIsolatedRunnerException(SingleRunner singleRunner) {
            i.e(singleRunner, "runner");
            this.c = singleRunner;
        }
    }

    /* compiled from: SingleRunner.kt */
    public static final class Holder {
        public final b a = d.a(false, 1);
        public f1 b;
        public int c;
        public final SingleRunner d;
        public final boolean e;

        public Holder(SingleRunner singleRunner, boolean z) {
            i.e(singleRunner, "singleRunner");
            this.d = singleRunner;
            this.e = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ all -> 0x005f }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(n0.a.f1 r6, m0.l.c<? super m0.i> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.SingleRunner$Holder$onFinish$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = (androidx.paging.SingleRunner$Holder$onFinish$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.SingleRunner$Holder$onFinish$1 r0 = new androidx.paging.SingleRunner$Holder$onFinish$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r6 = r0.Y1
                n0.a.k2.b r6 = (n0.a.k2.b) r6
                java.lang.Object r1 = r0.y
                n0.a.f1 r1 = (n0.a.f1) r1
                java.lang.Object r0 = r0.x
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                i0.j.f.p.h.d4(r7)
                r7 = r6
                r6 = r1
                goto L_0x0053
            L_0x0036:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003e:
                i0.j.f.p.h.d4(r7)
                n0.a.k2.b r7 = r5.a
                r0.x = r5
                r0.y = r6
                r0.Y1 = r7
                r0.d = r3
                java.lang.Object r0 = r7.a(r4, r0)
                if (r0 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r0 = r5
            L_0x0053:
                n0.a.f1 r1 = r0.b     // Catch:{ all -> 0x005f }
                if (r6 != r1) goto L_0x0059
                r0.b = r4     // Catch:{ all -> 0x005f }
            L_0x0059:
                m0.i r6 = m0.i.a     // Catch:{ all -> 0x005f }
                r7.b(r4)
                return r6
            L_0x005f:
                r6 = move-exception
                r7.b(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.a(n0.a.f1, m0.l.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[Catch:{ all -> 0x00b3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[Catch:{ all -> 0x00b3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(int r10, n0.a.f1 r11, m0.l.c<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1
                if (r0 == 0) goto L_0x0013
                r0 = r12
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.d = r1
                goto L_0x0018
            L_0x0013:
                androidx.paging.SingleRunner$Holder$tryEnqueue$1 r0 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0054
                if (r2 == r5) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                int r10 = r0.Z1
                java.lang.Object r11 = r0.Y1
                n0.a.k2.b r11 = (n0.a.k2.b) r11
                java.lang.Object r1 = r0.y
                n0.a.f1 r1 = (n0.a.f1) r1
                java.lang.Object r0 = r0.x
                androidx.paging.SingleRunner$Holder r0 = (androidx.paging.SingleRunner.Holder) r0
                i0.j.f.p.h.d4(r12)     // Catch:{ all -> 0x00b3 }
                goto L_0x00a5
            L_0x003a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0042:
                int r10 = r0.Z1
                java.lang.Object r11 = r0.Y1
                n0.a.k2.b r11 = (n0.a.k2.b) r11
                java.lang.Object r2 = r0.y
                n0.a.f1 r2 = (n0.a.f1) r2
                java.lang.Object r6 = r0.x
                androidx.paging.SingleRunner$Holder r6 = (androidx.paging.SingleRunner.Holder) r6
                i0.j.f.p.h.d4(r12)
                goto L_0x006d
            L_0x0054:
                i0.j.f.p.h.d4(r12)
                n0.a.k2.b r12 = r9.a
                r0.x = r9
                r0.y = r11
                r0.Y1 = r12
                r0.Z1 = r10
                r0.d = r5
                java.lang.Object r2 = r12.a(r4, r0)
                if (r2 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x006d:
                n0.a.f1 r12 = r6.b     // Catch:{ all -> 0x00b3 }
                if (r12 == 0) goto L_0x0084
                boolean r7 = r12.a()     // Catch:{ all -> 0x00b3 }
                if (r7 == 0) goto L_0x0084
                int r7 = r6.c     // Catch:{ all -> 0x00b3 }
                if (r7 < r10) goto L_0x0084
                if (r7 != r10) goto L_0x0082
                boolean r7 = r6.e     // Catch:{ all -> 0x00b3 }
                if (r7 == 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r5 = 0
                goto L_0x00ab
            L_0x0084:
                if (r12 == 0) goto L_0x0090
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r7 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch:{ all -> 0x00b3 }
                androidx.paging.SingleRunner r8 = r6.d     // Catch:{ all -> 0x00b3 }
                r7.<init>(r8)     // Catch:{ all -> 0x00b3 }
                r12.b(r7)     // Catch:{ all -> 0x00b3 }
            L_0x0090:
                if (r12 == 0) goto L_0x00a7
                r0.x = r6     // Catch:{ all -> 0x00b3 }
                r0.y = r2     // Catch:{ all -> 0x00b3 }
                r0.Y1 = r11     // Catch:{ all -> 0x00b3 }
                r0.Z1 = r10     // Catch:{ all -> 0x00b3 }
                r0.d = r3     // Catch:{ all -> 0x00b3 }
                java.lang.Object r12 = r12.l(r0)     // Catch:{ all -> 0x00b3 }
                if (r12 != r1) goto L_0x00a3
                return r1
            L_0x00a3:
                r1 = r2
                r0 = r6
            L_0x00a5:
                r6 = r0
                r2 = r1
            L_0x00a7:
                r6.b = r2     // Catch:{ all -> 0x00b3 }
                r6.c = r10     // Catch:{ all -> 0x00b3 }
            L_0x00ab:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00b3 }
                r11.b(r4)
                return r10
            L_0x00b3:
                r10 = move-exception
                r11.b(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.b(int, n0.a.f1, m0.l.c):java.lang.Object");
        }
    }

    public SingleRunner() {
        this.a = new Holder(this, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r5, m0.n.a.l<? super m0.l.c<? super m0.i>, ? extends java.lang.Object> r6, m0.l.c<? super m0.i> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.SingleRunner$runInIsolation$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.SingleRunner$runInIsolation$1 r0 = (androidx.paging.SingleRunner$runInIsolation$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SingleRunner$runInIsolation$1 r0 = new androidx.paging.SingleRunner$runInIsolation$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.x
            androidx.paging.SingleRunner r5 = (androidx.paging.SingleRunner) r5
            i0.j.f.p.h.d4(r7)     // Catch:{ CancelIsolatedRunnerException -> 0x002b }
            goto L_0x0050
        L_0x002b:
            r6 = move-exception
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            i0.j.f.p.h.d4(r7)
            androidx.paging.SingleRunner$runInIsolation$2 r7 = new androidx.paging.SingleRunner$runInIsolation$2     // Catch:{ CancelIsolatedRunnerException -> 0x0049 }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ CancelIsolatedRunnerException -> 0x0049 }
            r0.x = r4     // Catch:{ CancelIsolatedRunnerException -> 0x0049 }
            r0.d = r3     // Catch:{ CancelIsolatedRunnerException -> 0x0049 }
            java.lang.Object r5 = m0.r.t.a.r.m.a1.a.P0(r7, r0)     // Catch:{ CancelIsolatedRunnerException -> 0x0049 }
            if (r5 != r1) goto L_0x0050
            return r1
        L_0x0049:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004c:
            androidx.paging.SingleRunner r7 = r6.c
            if (r7 != r5) goto L_0x0053
        L_0x0050:
            m0.i r5 = m0.i.a
            return r5
        L_0x0053:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.a(int, m0.n.a.l, m0.l.c):java.lang.Object");
    }

    public SingleRunner(boolean z, int i) {
        this.a = new Holder(this, (i & 1) != 0 ? true : z);
    }
}
