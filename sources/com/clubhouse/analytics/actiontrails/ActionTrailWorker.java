package com.clubhouse.analytics.actiontrails;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.clubhouse.android.data.network.ServerDataSource;
import kotlin.Metadata;
import m0.n.b.i;
import n0.c.l.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/clubhouse/analytics/actiontrails/ActionTrailWorker;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$a;", "g", "(Lm0/l/c;)Ljava/lang/Object;", "Li0/e/a/a;", "d2", "Li0/e/a/a;", "analytics", "Li0/k/a/a;", "b2", "Li0/k/a/a;", "cache", "Lcom/clubhouse/android/data/network/ServerDataSource;", "c2", "Lcom/clubhouse/android/data/network/ServerDataSource;", "fetcher", "Ln0/c/l/a;", "a2", "Ln0/c/l/a;", "json", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln0/c/l/a;Li0/k/a/a;Lcom/clubhouse/android/data/network/ServerDataSource;Li0/e/a/a;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: ActionTrailWorker.kt */
public final class ActionTrailWorker extends CoroutineWorker {
    public final a a2;
    public final i0.k.a.a b2;
    public final ServerDataSource c2;
    public final i0.e.a.a d2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionTrailWorker(Context context, WorkerParameters workerParameters, a aVar, i0.k.a.a aVar2, ServerDataSource serverDataSource, i0.e.a.a aVar3) {
        super(context, workerParameters);
        i.e(context, "context");
        i.e(workerParameters, "params");
        i.e(aVar, "json");
        i.e(aVar2, "cache");
        i.e(serverDataSource, "fetcher");
        i.e(aVar3, "analytics");
        this.a2 = aVar;
        this.b2 = aVar2;
        this.c2 = serverDataSource;
        this.d2 = aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(m0.l.c<? super androidx.work.ListenableWorker.a> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.clubhouse.analytics.actiontrails.ActionTrailWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.clubhouse.analytics.actiontrails.ActionTrailWorker$doWork$1 r0 = (com.clubhouse.analytics.actiontrails.ActionTrailWorker$doWork$1) r0
            int r1 = r0.Y1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y1 = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.analytics.actiontrails.ActionTrailWorker$doWork$1 r0 = new com.clubhouse.analytics.actiontrails.ActionTrailWorker$doWork$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.Y1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r1 = r0.q
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r0.d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.c
            com.clubhouse.analytics.actiontrails.ActionTrailWorker r0 = (com.clubhouse.analytics.actiontrails.ActionTrailWorker) r0
            i0.j.f.p.h.d4(r14)     // Catch:{ all -> 0x0035 }
            goto L_0x00ec
        L_0x0035:
            r14 = move-exception
            goto L_0x011f
        L_0x0038:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0040:
            i0.j.f.p.h.d4(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            i0.k.a.a r2 = r13.b2     // Catch:{ all -> 0x011b }
            java.util.Set r2 = i0.e.a.c.a.a(r2)     // Catch:{ all -> 0x011b }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x011b }
        L_0x0052:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x011b }
            if (r6 == 0) goto L_0x00c2
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x011b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x011b }
            n0.c.l.a r7 = r13.a2     // Catch:{ all -> 0x00b6 }
            i0.k.a.a r8 = r13.b2     // Catch:{ all -> 0x00b6 }
            java.lang.String r9 = "<this>"
            m0.n.b.i.e(r8, r9)     // Catch:{ all -> 0x00b6 }
            java.lang.String r9 = "key"
            m0.n.b.i.e(r6, r9)     // Catch:{ all -> 0x00b6 }
            i0.k.a.a$e r8 = r8.f(r6)     // Catch:{ all -> 0x00b6 }
            java.io.InputStream[] r8 = r8.c     // Catch:{ all -> 0x00b6 }
            r8 = r8[r3]     // Catch:{ all -> 0x00b6 }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ all -> 0x00b6 }
            java.nio.charset.Charset r10 = i0.k.a.c.b     // Catch:{ all -> 0x00b6 }
            r9.<init>(r8, r10)     // Catch:{ all -> 0x00b6 }
            java.io.StringWriter r8 = new java.io.StringWriter     // Catch:{ all -> 0x00b1 }
            r8.<init>()     // Catch:{ all -> 0x00b1 }
            r10 = 1024(0x400, float:1.435E-42)
            char[] r10 = new char[r10]     // Catch:{ all -> 0x00b1 }
        L_0x0084:
            int r11 = r9.read(r10)     // Catch:{ all -> 0x00b1 }
            r12 = -1
            if (r11 == r12) goto L_0x008f
            r8.write(r10, r3, r11)     // Catch:{ all -> 0x00b1 }
            goto L_0x0084
        L_0x008f:
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b1 }
            r9.close()     // Catch:{ all -> 0x00b6 }
            java.lang.String r9 = "get(key).getString(0)"
            m0.n.b.i.d(r8, r9)     // Catch:{ all -> 0x00b6 }
            n0.c.l.q.d r9 = r7.b     // Catch:{ all -> 0x00b6 }
            n0.c.m.b r9 = r9.k     // Catch:{ all -> 0x00b6 }
            java.lang.Class<com.clubhouse.android.data.models.local.ActionTrail> r10 = com.clubhouse.android.data.models.local.ActionTrail.class
            m0.r.n r10 = m0.n.b.m.e(r10)     // Catch:{ all -> 0x00b6 }
            kotlinx.serialization.KSerializer r9 = m0.r.t.a.r.m.a1.a.u3(r9, r10)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r7 = r7.b(r9, r8)     // Catch:{ all -> 0x00b6 }
            r14.add(r7)     // Catch:{ all -> 0x00b6 }
            goto L_0x0052
        L_0x00b1:
            r7 = move-exception
            r9.close()     // Catch:{ all -> 0x00b6 }
            throw r7     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r7 = move-exception
            i0.k.a.a r8 = r13.b2     // Catch:{ all -> 0x011b }
            r8.v(r6)     // Catch:{ all -> 0x011b }
            v0.a.a$b r6 = v0.a.a.d     // Catch:{ all -> 0x011b }
            r6.e(r7)     // Catch:{ all -> 0x011b }
            goto L_0x0052
        L_0x00c2:
            boolean r5 = r14.isEmpty()     // Catch:{ all -> 0x011b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x010e
            com.clubhouse.android.data.network.ServerDataSource r5 = r13.c2     // Catch:{ all -> 0x011b }
            com.clubhouse.android.data.models.remote.request.RecordActionTrailsRequest r6 = new com.clubhouse.android.data.models.remote.request.RecordActionTrailsRequest     // Catch:{ all -> 0x011b }
            r6.<init>(r14)     // Catch:{ all -> 0x011b }
            r0.c = r13     // Catch:{ all -> 0x011b }
            r0.d = r14     // Catch:{ all -> 0x011b }
            r0.q = r2     // Catch:{ all -> 0x011b }
            r0.Y1 = r4     // Catch:{ all -> 0x011b }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x011b }
            com.clubhouse.android.data.network.ServerDataSource$recordActionTrails$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$recordActionTrails$2     // Catch:{ all -> 0x011b }
            r8 = 0
            r7.<init>(r5, r6, r8)     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r5.a(r7, r0)     // Catch:{ all -> 0x011b }
            if (r0 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            r1 = r2
            r2 = r14
            r14 = r0
            r0 = r13
        L_0x00ec:
            com.clubhouse.android.shared.Result r14 = (com.clubhouse.android.shared.Result) r14     // Catch:{ all -> 0x0035 }
            java.lang.Object r14 = r14.a()     // Catch:{ all -> 0x0035 }
            com.clubhouse.android.data.models.remote.response.EmptySuccessResponse r14 = (com.clubhouse.android.data.models.remote.response.EmptySuccessResponse) r14     // Catch:{ all -> 0x0035 }
            boolean r14 = r14.a     // Catch:{ all -> 0x0035 }
            if (r14 == 0) goto L_0x0110
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x00fc:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0110
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0035 }
            i0.k.a.a r5 = r0.b2     // Catch:{ all -> 0x0035 }
            r5.v(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x00fc
        L_0x010e:
            r0 = r13
            r2 = r14
        L_0x0110:
            androidx.work.ListenableWorker$a$c r14 = new androidx.work.ListenableWorker$a$c     // Catch:{ all -> 0x0035 }
            r14.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "{\n            val eventIds = cache.allKeys()\n            for (key in eventIds) {\n                try {\n                    actionTrails.add(json.decodeFromString(cache.getString(key)))\n                } catch (error: Throwable) {\n                    cache.remove(key)\n                    Timber.e(error)\n                }\n            }\n            if (actionTrails.isNotEmpty()) {\n                val response = fetcher.recordActionTrails(RecordActionTrailsRequest(actionTrails))\n                    .getDataOrThrow()\n                if (response.success) {\n                    eventIds.forEach { cache.remove(it) }\n                }\n            }\n            Result.success()\n        }"
            m0.n.b.i.d(r14, r1)     // Catch:{ all -> 0x0035 }
            goto L_0x015d
        L_0x011b:
            r0 = move-exception
            r2 = r14
            r14 = r0
            r0 = r13
        L_0x011f:
            v0.a.a$b r1 = v0.a.a.d
            r1.w(r14)
            i0.e.a.a r0 = r0.d2
            r1 = 2
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r14 = r14.getLocalizedMessage()
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r6 = "error"
            r5.<init>(r6, r14)
            r1[r3] = r5
            int r14 = r2.size()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r14)
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r3 = "count"
            r14.<init>(r3, r2)
            r1[r4] = r14
            java.util.Map r14 = m0.j.g.N(r1)
            com.clubhouse.analytics.AmplitudeAnalytics r0 = (com.clubhouse.analytics.AmplitudeAnalytics) r0
            java.lang.String r1 = "Server-RecordActionTrail-Error"
            r0.b(r1, r14)
            androidx.work.ListenableWorker$a$a r14 = new androidx.work.ListenableWorker$a$a
            r14.<init>()
            java.lang.String r0 = "{\n            Timber.w(error)\n            analytics.trackEvent(\n                Network.ActionTrailError, mapOf(\n                    \"error\" to error.localizedMessage,\n                    \"count\" to actionTrails.size\n                )\n            )\n            Result.failure()\n        }"
            m0.n.b.i.d(r14, r0)
        L_0x015d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.analytics.actiontrails.ActionTrailWorker.g(m0.l.c):java.lang.Object");
    }
}
