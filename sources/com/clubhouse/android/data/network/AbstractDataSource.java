package com.clubhouse.android.data.network;

import android.content.Context;
import com.clubhouse.android.data.R;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import q0.f0;
import t0.h;

/* compiled from: AbstractDataSource.kt */
public abstract class AbstractDataSource {
    public final h<f0, ErrorResponse> a;
    public final Context b;
    public final String c;
    public final String d;

    public AbstractDataSource(h<f0, ErrorResponse> hVar, Context context) {
        i.e(hVar, "converter");
        i.e(context, "context");
        this.a = hVar;
        this.b = context;
        String string = context.getString(R.string.network_error);
        i.d(string, "context.getString(R.string.network_error)");
        this.c = string;
        String string2 = context.getString(R.string.common_error_try_again);
        i.d(string2, "context.getString(R.string.common_error_try_again)");
        this.d = string2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object a(m0.n.a.l<? super m0.l.c<? super t0.v<T>>, ? extends java.lang.Object> r6, m0.l.c<? super com.clubhouse.android.shared.Result<? extends T>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.network.AbstractDataSource$getResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.network.AbstractDataSource$getResult$1 r0 = (com.clubhouse.android.data.network.AbstractDataSource$getResult$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.AbstractDataSource$getResult$1 r0 = new com.clubhouse.android.data.network.AbstractDataSource$getResult$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.network.AbstractDataSource r6 = (com.clubhouse.android.data.network.AbstractDataSource) r6
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x002c }
            goto L_0x0046
        L_0x002c:
            r7 = move-exception
            goto L_0x00f6
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            r0.c = r5     // Catch:{ all -> 0x00f3 }
            r0.x = r3     // Catch:{ all -> 0x00f3 }
            java.lang.Object r7 = r6.invoke(r0)     // Catch:{ all -> 0x00f3 }
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r6 = r5
        L_0x0046:
            t0.v r7 = (t0.v) r7     // Catch:{ all -> 0x002c }
            boolean r0 = r7.a()
            if (r0 != 0) goto L_0x00c8
            q0.f0 r0 = r7.c
            java.lang.String r1 = "Network error: "
            if (r0 == 0) goto L_0x00a5
            t0.h<q0.f0, com.clubhouse.android.data.models.remote.response.error.ErrorResponse> r2 = r6.a     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x0092 }
            com.clubhouse.android.data.models.remote.response.error.ErrorResponse r2 = (com.clubhouse.android.data.models.remote.response.error.ErrorResponse) r2     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x0060
            r3 = 0
            goto L_0x0064
        L_0x0060:
            java.lang.String r3 = r2.a()     // Catch:{ all -> 0x0092 }
        L_0x0064:
            if (r3 != 0) goto L_0x006a
            q0.e0 r7 = r7.a     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r7.x     // Catch:{ all -> 0x0092 }
        L_0x006a:
            java.lang.String r7 = m0.n.b.i.k(r1, r3)     // Catch:{ all -> 0x0092 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0092 }
            v0.a.a$b r4 = v0.a.a.d     // Catch:{ all -> 0x0092 }
            r4.i(r7, r1)     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x0087
            com.clubhouse.android.shared.Result$a r7 = new com.clubhouse.android.shared.Result$a     // Catch:{ all -> 0x0092 }
            com.clubhouse.android.data.network.NetworkException r1 = new com.clubhouse.android.data.network.NetworkException     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "errorMessage"
            m0.n.b.i.d(r3, r2)     // Catch:{ all -> 0x0092 }
            r1.<init>(r3)     // Catch:{ all -> 0x0092 }
            r7.<init>(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0091
        L_0x0087:
            com.clubhouse.android.shared.Result$b r7 = new com.clubhouse.android.shared.Result$b     // Catch:{ all -> 0x0092 }
            com.clubhouse.android.data.network.ErrorResponseException r1 = new com.clubhouse.android.data.network.ErrorResponseException     // Catch:{ all -> 0x0092 }
            r1.<init>(r2)     // Catch:{ all -> 0x0092 }
            r7.<init>(r1)     // Catch:{ all -> 0x0092 }
        L_0x0091:
            return r7
        L_0x0092:
            com.clubhouse.android.shared.Result$a r7 = new com.clubhouse.android.shared.Result$a
            com.clubhouse.android.data.network.NetworkException r1 = new com.clubhouse.android.data.network.NetworkException
            java.lang.String r0 = r0.string()
            java.lang.String r6 = r6.b(r0)
            r1.<init>(r6)
            r7.<init>(r1)
            goto L_0x00c7
        L_0x00a5:
            q0.e0 r0 = r7.a
            java.lang.String r0 = r0.x
            java.lang.String r0 = m0.n.b.i.k(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            v0.a.a$b r2 = v0.a.a.d
            r2.i(r0, r1)
            com.clubhouse.android.shared.Result$a r0 = new com.clubhouse.android.shared.Result$a
            com.clubhouse.android.data.network.NetworkException r1 = new com.clubhouse.android.data.network.NetworkException
            q0.e0 r7 = r7.a
            java.lang.String r7 = r7.x
            java.lang.String r6 = r6.b(r7)
            r1.<init>(r6)
            r0.<init>(r1)
            r7 = r0
        L_0x00c7:
            return r7
        L_0x00c8:
            T r0 = r7.b
            if (r0 == 0) goto L_0x00d2
            com.clubhouse.android.shared.Result$c r6 = new com.clubhouse.android.shared.Result$c
            r6.<init>(r0)
            goto L_0x00f2
        L_0x00d2:
            java.lang.String r0 = "Null response body for response: "
            java.lang.String r0 = m0.n.b.i.k(r0, r7)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            v0.a.a$b r2 = v0.a.a.d
            r2.i(r0, r1)
            com.clubhouse.android.shared.Result$a r0 = new com.clubhouse.android.shared.Result$a
            com.clubhouse.android.data.network.NullBodyException r1 = new com.clubhouse.android.data.network.NullBodyException
            q0.e0 r7 = r7.a
            java.lang.String r7 = r7.x
            java.lang.String r6 = r6.b(r7)
            r1.<init>(r6)
            r0.<init>(r1)
            r6 = r0
        L_0x00f2:
            return r6
        L_0x00f3:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x00f6:
            v0.a.a$b r0 = v0.a.a.d
            r0.i(r7)
            android.content.Context r7 = r6.b
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r7, r0)
            java.lang.String r0 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            java.util.Objects.requireNonNull(r7, r0)
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7
            android.net.NetworkInfo r7 = r7.getActiveNetworkInfo()
            if (r7 != 0) goto L_0x0116
            goto L_0x011d
        L_0x0116:
            boolean r7 = r7.isConnectedOrConnecting()
            if (r7 != r3) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r3 = r4
        L_0x011e:
            if (r3 != 0) goto L_0x012d
            com.clubhouse.android.shared.Result$a r7 = new com.clubhouse.android.shared.Result$a
            com.clubhouse.android.data.network.ConnectionException r0 = new com.clubhouse.android.data.network.ConnectionException
            java.lang.String r6 = r6.c
            r0.<init>(r6)
            r7.<init>(r0)
            goto L_0x0139
        L_0x012d:
            com.clubhouse.android.shared.Result$a r7 = new com.clubhouse.android.shared.Result$a
            com.clubhouse.android.data.network.ConnectionException r0 = new com.clubhouse.android.data.network.ConnectionException
            java.lang.String r6 = r6.d
            r0.<init>(r6)
            r7.<init>(r0)
        L_0x0139:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.AbstractDataSource.a(m0.n.a.l, m0.l.c):java.lang.Object");
    }

    public final String b(String str) {
        boolean z = false;
        if (str != null && (!StringsKt__IndentKt.o(str))) {
            z = true;
        }
        if (z) {
            return str;
        }
        return this.d;
    }
}
