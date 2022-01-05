package i0.o.a;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: Dispatcher */
public class i {
    public final b a;
    public final Context b;
    public final ExecutorService c;
    public final j d;
    public final Map<String, c> e = new LinkedHashMap();
    public final Map<Object, a> f = new WeakHashMap();
    public final Map<Object, a> g = new WeakHashMap();
    public final Set<Object> h = new LinkedHashSet();
    public final Handler i;
    public final Handler j;
    public final d k;
    public final x l;
    public final List<c> m;
    public final c n;
    public final boolean o;
    public boolean p;

    /* compiled from: Dispatcher */
    public static class a extends Handler {
        public final i a;

        /* renamed from: i0.o.a.i$a$a  reason: collision with other inner class name */
        /* compiled from: Dispatcher */
        public class C0220a implements Runnable {
            public final /* synthetic */ Message c;

            public C0220a(a aVar, Message message) {
                this.c = message;
            }

            public void run() {
                StringBuilder P0 = i0.d.a.a.a.P0("Unknown handler message received: ");
                P0.append(this.c.what);
                throw new AssertionError(P0.toString());
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.a = iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r3v64, types: [java.util.List] */
        /* JADX WARNING: type inference failed for: r3v69 */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x0034, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x02ed  */
        /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                int r2 = r1.what
                r3 = 0
                java.lang.String r4 = "canceled"
                java.lang.String r5 = ""
                java.lang.String r7 = "Dispatcher"
                switch(r2) {
                    case 1: goto L_0x03ce;
                    case 2: goto L_0x0358;
                    case 3: goto L_0x0010;
                    case 4: goto L_0x0321;
                    case 5: goto L_0x025a;
                    case 6: goto L_0x024e;
                    case 7: goto L_0x01ea;
                    case 8: goto L_0x0010;
                    case 9: goto L_0x0143;
                    case 10: goto L_0x0135;
                    case 11: goto L_0x0065;
                    case 12: goto L_0x001c;
                    default: goto L_0x0010;
                }
            L_0x0010:
                android.os.Handler r2 = com.squareup.picasso.Picasso.a
                i0.o.a.i$a$a r3 = new i0.o.a.i$a$a
                r3.<init>(r0, r1)
                r2.post(r3)
                goto L_0x03d8
            L_0x001c:
                java.lang.Object r1 = r1.obj
                i0.o.a.i r2 = r0.a
                java.util.Set<java.lang.Object> r4 = r2.h
                boolean r4 = r4.remove(r1)
                if (r4 != 0) goto L_0x002a
                goto L_0x03d8
            L_0x002a:
                java.util.Map<java.lang.Object, i0.o.a.a> r4 = r2.g
                java.util.Collection r4 = r4.values()
                java.util.Iterator r4 = r4.iterator()
            L_0x0034:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0056
                java.lang.Object r5 = r4.next()
                i0.o.a.a r5 = (i0.o.a.a) r5
                java.lang.Object r6 = r5.j
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L_0x0034
                if (r3 != 0) goto L_0x004f
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x004f:
                r3.add(r5)
                r4.remove()
                goto L_0x0034
            L_0x0056:
                if (r3 == 0) goto L_0x03d8
                android.os.Handler r1 = r2.j
                r2 = 13
                android.os.Message r2 = r1.obtainMessage(r2, r3)
                r1.sendMessage(r2)
                goto L_0x03d8
            L_0x0065:
                java.lang.Object r1 = r1.obj
                i0.o.a.i r2 = r0.a
                java.util.Set<java.lang.Object> r3 = r2.h
                boolean r3 = r3.add(r1)
                if (r3 != 0) goto L_0x0073
                goto L_0x03d8
            L_0x0073:
                java.util.Map<java.lang.String, i0.o.a.c> r3 = r2.e
                java.util.Collection r3 = r3.values()
                java.util.Iterator r3 = r3.iterator()
            L_0x007d:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x03d8
                java.lang.Object r5 = r3.next()
                i0.o.a.c r5 = (i0.o.a.c) r5
                com.squareup.picasso.Picasso r9 = r5.Y1
                boolean r9 = r9.p
                i0.o.a.a r10 = r5.h2
                java.util.List<i0.o.a.a> r11 = r5.i2
                if (r11 == 0) goto L_0x009b
                boolean r12 = r11.isEmpty()
                if (r12 != 0) goto L_0x009b
                r12 = 1
                goto L_0x009c
            L_0x009b:
                r12 = 0
            L_0x009c:
                if (r10 != 0) goto L_0x00a1
                if (r12 != 0) goto L_0x00a1
                goto L_0x007d
            L_0x00a1:
                java.lang.String r13 = "' was paused"
                java.lang.String r14 = "because tag '"
                java.lang.String r15 = "paused"
                if (r10 == 0) goto L_0x00da
                java.lang.Object r6 = r10.j
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L_0x00da
                r5.d(r10)
                java.util.Map<java.lang.Object, i0.o.a.a> r6 = r2.g
                java.lang.Object r8 = r10.d()
                r6.put(r8, r10)
                if (r9 == 0) goto L_0x00da
                i0.o.a.t r6 = r10.b
                java.lang.String r6 = r6.b()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r14)
                r8.append(r1)
                r8.append(r13)
                java.lang.String r8 = r8.toString()
                i0.o.a.b0.f(r7, r15, r6, r8)
            L_0x00da:
                if (r12 == 0) goto L_0x011f
                int r6 = r11.size()
                r8 = 1
                int r6 = r6 - r8
            L_0x00e2:
                if (r6 < 0) goto L_0x011f
                java.lang.Object r8 = r11.get(r6)
                i0.o.a.a r8 = (i0.o.a.a) r8
                java.lang.Object r10 = r8.j
                boolean r10 = r10.equals(r1)
                if (r10 != 0) goto L_0x00f3
                goto L_0x011c
            L_0x00f3:
                r5.d(r8)
                java.util.Map<java.lang.Object, i0.o.a.a> r10 = r2.g
                java.lang.Object r12 = r8.d()
                r10.put(r12, r8)
                if (r9 == 0) goto L_0x011c
                i0.o.a.t r8 = r8.b
                java.lang.String r8 = r8.b()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r14)
                r10.append(r1)
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                i0.o.a.b0.f(r7, r15, r8, r10)
            L_0x011c:
                int r6 = r6 + -1
                goto L_0x00e2
            L_0x011f:
                boolean r6 = r5.b()
                if (r6 == 0) goto L_0x007d
                r3.remove()
                if (r9 == 0) goto L_0x007d
                java.lang.String r5 = i0.o.a.b0.c(r5)
                java.lang.String r6 = "all actions paused"
                i0.o.a.b0.f(r7, r4, r5, r6)
                goto L_0x007d
            L_0x0135:
                i0.o.a.i r2 = r0.a
                int r1 = r1.arg1
                r3 = 1
                if (r1 != r3) goto L_0x013e
                r6 = 1
                goto L_0x013f
            L_0x013e:
                r6 = 0
            L_0x013f:
                r2.p = r6
                goto L_0x03d8
            L_0x0143:
                java.lang.Object r1 = r1.obj
                android.net.NetworkInfo r1 = (android.net.NetworkInfo) r1
                i0.o.a.i r2 = r0.a
                java.util.concurrent.ExecutorService r3 = r2.c
                boolean r4 = r3 instanceof i0.o.a.s
                if (r4 == 0) goto L_0x01ab
                i0.o.a.s r3 = (i0.o.a.s) r3
                java.util.Objects.requireNonNull(r3)
                r4 = 3
                if (r1 == 0) goto L_0x01a5
                boolean r6 = r1.isConnectedOrConnecting()
                if (r6 != 0) goto L_0x015e
                goto L_0x01a5
            L_0x015e:
                int r6 = r1.getType()
                if (r6 == 0) goto L_0x017d
                r8 = 1
                if (r6 == r8) goto L_0x0175
                r8 = 6
                if (r6 == r8) goto L_0x0175
                r8 = 9
                if (r6 == r8) goto L_0x0175
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L_0x01ab
            L_0x0175:
                r4 = 4
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L_0x01ab
            L_0x017d:
                int r6 = r1.getSubtype()
                switch(r6) {
                    case 1: goto L_0x018e;
                    case 2: goto L_0x018e;
                    case 3: goto L_0x019d;
                    case 4: goto L_0x019d;
                    case 5: goto L_0x019d;
                    case 6: goto L_0x019d;
                    default: goto L_0x0184;
                }
            L_0x0184:
                switch(r6) {
                    case 12: goto L_0x019d;
                    case 13: goto L_0x0196;
                    case 14: goto L_0x0196;
                    case 15: goto L_0x0196;
                    default: goto L_0x0187;
                }
            L_0x0187:
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L_0x01ab
            L_0x018e:
                r4 = 1
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L_0x01ab
            L_0x0196:
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L_0x01ab
            L_0x019d:
                r4 = 2
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L_0x01ab
            L_0x01a5:
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
            L_0x01ab:
                if (r1 == 0) goto L_0x03d8
                boolean r1 = r1.isConnected()
                if (r1 == 0) goto L_0x03d8
                java.util.Map<java.lang.Object, i0.o.a.a> r1 = r2.f
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x03d8
                java.util.Map<java.lang.Object, i0.o.a.a> r1 = r2.f
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L_0x01c5:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x03d8
                java.lang.Object r3 = r1.next()
                i0.o.a.a r3 = (i0.o.a.a) r3
                r1.remove()
                com.squareup.picasso.Picasso r4 = r3.a
                boolean r4 = r4.p
                if (r4 == 0) goto L_0x01e5
                i0.o.a.t r4 = r3.b
                java.lang.String r4 = r4.b()
                java.lang.String r6 = "replaying"
                i0.o.a.b0.f(r7, r6, r4, r5)
            L_0x01e5:
                r4 = 0
                r2.e(r3, r4)
                goto L_0x01c5
            L_0x01ea:
                i0.o.a.i r1 = r0.a
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List<i0.o.a.c> r3 = r1.m
                r2.<init>(r3)
                java.util.List<i0.o.a.c> r3 = r1.m
                r3.clear()
                android.os.Handler r1 = r1.j
                r3 = 8
                android.os.Message r3 = r1.obtainMessage(r3, r2)
                r1.sendMessage(r3)
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L_0x020e
                goto L_0x03d8
            L_0x020e:
                r1 = 0
                java.lang.Object r1 = r2.get(r1)
                i0.o.a.c r1 = (i0.o.a.c) r1
                com.squareup.picasso.Picasso r1 = r1.Y1
                boolean r1 = r1.p
                if (r1 == 0) goto L_0x03d8
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0224:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0243
                java.lang.Object r3 = r2.next()
                i0.o.a.c r3 = (i0.o.a.c) r3
                int r4 = r1.length()
                if (r4 <= 0) goto L_0x023b
                java.lang.String r4 = ", "
                r1.append(r4)
            L_0x023b:
                java.lang.String r3 = i0.o.a.b0.c(r3)
                r1.append(r3)
                goto L_0x0224
            L_0x0243:
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "delivered"
                i0.o.a.b0.f(r7, r2, r1, r5)
                goto L_0x03d8
            L_0x024e:
                java.lang.Object r1 = r1.obj
                i0.o.a.c r1 = (i0.o.a.c) r1
                i0.o.a.i r2 = r0.a
                r3 = 0
                r2.d(r1, r3)
                goto L_0x03d8
            L_0x025a:
                java.lang.Object r1 = r1.obj
                i0.o.a.c r1 = (i0.o.a.c) r1
                i0.o.a.i r2 = r0.a
                java.util.Objects.requireNonNull(r2)
                java.util.concurrent.Future<?> r4 = r1.k2
                if (r4 == 0) goto L_0x026f
                boolean r4 = r4.isCancelled()
                if (r4 == 0) goto L_0x026f
                r4 = 1
                goto L_0x0270
            L_0x026f:
                r4 = 0
            L_0x0270:
                if (r4 == 0) goto L_0x0274
                goto L_0x03d8
            L_0x0274:
                java.util.concurrent.ExecutorService r4 = r2.c
                boolean r4 = r4.isShutdown()
                if (r4 == 0) goto L_0x0282
                r4 = 0
                r2.d(r1, r4)
                goto L_0x03d8
            L_0x0282:
                r4 = 0
                boolean r6 = r2.o
                if (r6 == 0) goto L_0x0297
                android.content.Context r3 = r2.b
                java.lang.StringBuilder r6 = i0.o.a.b0.a
                java.lang.String r6 = "connectivity"
                java.lang.Object r3 = r3.getSystemService(r6)
                android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            L_0x0297:
                boolean r6 = r2.p
                int r8 = r1.o2
                if (r8 <= 0) goto L_0x029f
                r9 = 1
                goto L_0x02a0
            L_0x029f:
                r9 = r4
            L_0x02a0:
                if (r9 != 0) goto L_0x02a4
                r3 = r4
                goto L_0x02ae
            L_0x02a4:
                r9 = 1
                int r8 = r8 - r9
                r1.o2 = r8
                i0.o.a.v r8 = r1.g2
                boolean r3 = r8.g(r6, r3)
            L_0x02ae:
                if (r3 == 0) goto L_0x02d8
                com.squareup.picasso.Picasso r3 = r1.Y1
                boolean r3 = r3.p
                if (r3 == 0) goto L_0x02bf
                java.lang.String r3 = i0.o.a.b0.c(r1)
                java.lang.String r4 = "retrying"
                i0.o.a.b0.f(r7, r4, r3, r5)
            L_0x02bf:
                java.lang.Exception r3 = r1.m2
                boolean r3 = r3 instanceof com.squareup.picasso.NetworkRequestHandler.ContentLengthException
                if (r3 == 0) goto L_0x02ce
                int r3 = r1.f2
                com.squareup.picasso.NetworkPolicy r4 = com.squareup.picasso.NetworkPolicy.NO_CACHE
                int r4 = r4.index
                r3 = r3 | r4
                r1.f2 = r3
            L_0x02ce:
                java.util.concurrent.ExecutorService r2 = r2.c
                java.util.concurrent.Future r2 = r2.submit(r1)
                r1.k2 = r2
                goto L_0x03d8
            L_0x02d8:
                boolean r3 = r2.o
                if (r3 == 0) goto L_0x02e7
                i0.o.a.v r3 = r1.g2
                java.util.Objects.requireNonNull(r3)
                boolean r3 = r3 instanceof com.squareup.picasso.NetworkRequestHandler
                if (r3 == 0) goto L_0x02e7
                r3 = 1
                goto L_0x02e8
            L_0x02e7:
                r3 = r4
            L_0x02e8:
                r2.d(r1, r3)
                if (r3 == 0) goto L_0x03d8
                i0.o.a.a r3 = r1.h2
                if (r3 == 0) goto L_0x02ff
                java.lang.Object r5 = r3.d()
                if (r5 == 0) goto L_0x02ff
                r6 = 1
                r3.k = r6
                java.util.Map<java.lang.Object, i0.o.a.a> r6 = r2.f
                r6.put(r5, r3)
            L_0x02ff:
                java.util.List<i0.o.a.a> r1 = r1.i2
                if (r1 == 0) goto L_0x03d8
                int r3 = r1.size()
                r6 = r4
            L_0x0308:
                if (r6 >= r3) goto L_0x03d8
                java.lang.Object r4 = r1.get(r6)
                i0.o.a.a r4 = (i0.o.a.a) r4
                java.lang.Object r5 = r4.d()
                if (r5 == 0) goto L_0x031e
                r7 = 1
                r4.k = r7
                java.util.Map<java.lang.Object, i0.o.a.a> r7 = r2.f
                r7.put(r5, r4)
            L_0x031e:
                int r6 = r6 + 1
                goto L_0x0308
            L_0x0321:
                java.lang.Object r1 = r1.obj
                i0.o.a.c r1 = (i0.o.a.c) r1
                i0.o.a.i r2 = r0.a
                java.util.Objects.requireNonNull(r2)
                int r3 = r1.e2
                boolean r3 = com.squareup.picasso.MemoryPolicy.shouldWriteToMemoryCache(r3)
                if (r3 == 0) goto L_0x033b
                i0.o.a.d r3 = r2.k
                java.lang.String r4 = r1.c2
                android.graphics.Bitmap r5 = r1.j2
                r3.set(r4, r5)
            L_0x033b:
                java.util.Map<java.lang.String, i0.o.a.c> r3 = r2.e
                java.lang.String r4 = r1.c2
                r3.remove(r4)
                r2.a(r1)
                com.squareup.picasso.Picasso r2 = r1.Y1
                boolean r2 = r2.p
                if (r2 == 0) goto L_0x03d8
                java.lang.String r1 = i0.o.a.b0.c(r1)
                java.lang.String r2 = "batched"
                java.lang.String r3 = "for completion"
                i0.o.a.b0.f(r7, r2, r1, r3)
                goto L_0x03d8
            L_0x0358:
                java.lang.Object r1 = r1.obj
                i0.o.a.a r1 = (i0.o.a.a) r1
                i0.o.a.i r2 = r0.a
                java.util.Objects.requireNonNull(r2)
                java.lang.String r3 = r1.i
                java.util.Map<java.lang.String, i0.o.a.c> r6 = r2.e
                java.lang.Object r6 = r6.get(r3)
                i0.o.a.c r6 = (i0.o.a.c) r6
                if (r6 == 0) goto L_0x038a
                r6.d(r1)
                boolean r6 = r6.b()
                if (r6 == 0) goto L_0x038a
                java.util.Map<java.lang.String, i0.o.a.c> r6 = r2.e
                r6.remove(r3)
                com.squareup.picasso.Picasso r3 = r1.a
                boolean r3 = r3.p
                if (r3 == 0) goto L_0x038a
                i0.o.a.t r3 = r1.b
                java.lang.String r3 = r3.b()
                i0.o.a.b0.f(r7, r4, r3, r5)
            L_0x038a:
                java.util.Set<java.lang.Object> r3 = r2.h
                java.lang.Object r5 = r1.j
                boolean r3 = r3.contains(r5)
                if (r3 == 0) goto L_0x03ae
                java.util.Map<java.lang.Object, i0.o.a.a> r3 = r2.g
                java.lang.Object r5 = r1.d()
                r3.remove(r5)
                com.squareup.picasso.Picasso r3 = r1.a
                boolean r3 = r3.p
                if (r3 == 0) goto L_0x03ae
                i0.o.a.t r3 = r1.b
                java.lang.String r3 = r3.b()
                java.lang.String r5 = "because paused request got canceled"
                i0.o.a.b0.f(r7, r4, r3, r5)
            L_0x03ae:
                java.util.Map<java.lang.Object, i0.o.a.a> r2 = r2.f
                java.lang.Object r1 = r1.d()
                java.lang.Object r1 = r2.remove(r1)
                i0.o.a.a r1 = (i0.o.a.a) r1
                if (r1 == 0) goto L_0x03d8
                com.squareup.picasso.Picasso r2 = r1.a
                boolean r2 = r2.p
                if (r2 == 0) goto L_0x03d8
                i0.o.a.t r1 = r1.b
                java.lang.String r1 = r1.b()
                java.lang.String r2 = "from replaying"
                i0.o.a.b0.f(r7, r4, r1, r2)
                goto L_0x03d8
            L_0x03ce:
                java.lang.Object r1 = r1.obj
                i0.o.a.a r1 = (i0.o.a.a) r1
                i0.o.a.i r2 = r0.a
                r3 = 1
                r2.e(r1, r3)
            L_0x03d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.o.a.i.a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: Dispatcher */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: Dispatcher */
    public static class c extends BroadcastReceiver {
        public final i a;

        public c(i iVar) {
            this.a = iVar;
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        i iVar = this.a;
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        Handler handler = iVar.i;
                        handler.sendMessage(handler.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    StringBuilder sb = b0.a;
                    i iVar2 = this.a;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    Handler handler2 = iVar2.i;
                    handler2.sendMessage(handler2.obtainMessage(9, activeNetworkInfo));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.content.Context r6, java.util.concurrent.ExecutorService r7, android.os.Handler r8, i0.o.a.j r9, i0.o.a.d r10, i0.o.a.x r11) {
        /*
            r5 = this;
            r5.<init>()
            i0.o.a.i$b r0 = new i0.o.a.i$b
            r0.<init>()
            r5.a = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            java.lang.StringBuilder r2 = i0.o.a.b0.a
            i0.o.a.a0 r2 = new i0.o.a.a0
            r2.<init>(r1)
            android.os.Message r1 = r2.obtainMessage()
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.sendMessageDelayed(r1, r3)
            r5.b = r6
            r5.c = r7
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.e = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.g = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r5.h = r7
            i0.o.a.i$a r7 = new i0.o.a.i$a
            android.os.Looper r0 = r0.getLooper()
            r7.<init>(r0, r5)
            r5.i = r7
            r5.d = r9
            r5.j = r8
            r5.k = r10
            r5.l = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 4
            r7.<init>(r8)
            r5.m = r7
            android.content.ContentResolver r7 = r6.getContentResolver()
            r8 = 1
            r9 = 0
            java.lang.String r10 = "airplane_mode_on"
            int r7 = android.provider.Settings.Global.getInt(r7, r10, r9)     // Catch:{ NullPointerException | SecurityException -> 0x006c }
            if (r7 == 0) goto L_0x006c
            r7 = r8
            goto L_0x006d
        L_0x006c:
            r7 = r9
        L_0x006d:
            r5.p = r7
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = r6.checkCallingOrSelfPermission(r7)
            if (r6 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r8 = r9
        L_0x0079:
            r5.o = r8
            i0.o.a.i$c r6 = new i0.o.a.i$c
            r6.<init>(r5)
            r5.n = r6
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r8 = "android.intent.action.AIRPLANE_MODE"
            r7.addAction(r8)
            i0.o.a.i r8 = r6.a
            boolean r8 = r8.o
            if (r8 == 0) goto L_0x0097
            java.lang.String r8 = "android.net.conn.CONNECTIVITY_CHANGE"
            r7.addAction(r8)
        L_0x0097:
            i0.o.a.i r8 = r6.a
            android.content.Context r8 = r8.b
            r8.registerReceiver(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.a.i.<init>(android.content.Context, java.util.concurrent.ExecutorService, android.os.Handler, i0.o.a.j, i0.o.a.d, i0.o.a.x):void");
    }

    public final void a(c cVar) {
        Future<?> future = cVar.k2;
        if (!(future != null && future.isCancelled())) {
            Bitmap bitmap = cVar.j2;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.m.add(cVar);
            if (!this.i.hasMessages(7)) {
                this.i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    public void b(c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    public void c(c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    public void d(c cVar, boolean z) {
        if (cVar.Y1.p) {
            String c2 = b0.c(cVar);
            StringBuilder P0 = i0.d.a.a.a.P0("for error");
            P0.append(z ? " (will replay)" : "");
            b0.f("Dispatcher", "batched", c2, P0.toString());
        }
        this.e.remove(cVar.c2);
        a(cVar);
    }

    public void e(a aVar, boolean z) {
        if (this.h.contains(aVar.j)) {
            this.g.put(aVar.d(), aVar);
            if (aVar.a.p) {
                String b2 = aVar.b.b();
                StringBuilder P0 = i0.d.a.a.a.P0("because tag '");
                P0.append(aVar.j);
                P0.append("' is paused");
                b0.f("Dispatcher", "paused", b2, P0.toString());
                return;
            }
            return;
        }
        c cVar = this.e.get(aVar.i);
        if (cVar != null) {
            boolean z2 = cVar.Y1.p;
            t tVar = aVar.b;
            if (cVar.h2 == null) {
                cVar.h2 = aVar;
                if (z2) {
                    List<a> list = cVar.i2;
                    if (list == null || list.isEmpty()) {
                        b0.f("Hunter", "joined", tVar.b(), "to empty hunter");
                    } else {
                        b0.f("Hunter", "joined", tVar.b(), b0.d(cVar, "to "));
                    }
                }
            } else {
                if (cVar.i2 == null) {
                    cVar.i2 = new ArrayList(3);
                }
                cVar.i2.add(aVar);
                if (z2) {
                    b0.f("Hunter", "joined", tVar.b(), b0.d(cVar, "to "));
                }
                Picasso.Priority priority = aVar.b.s;
                if (priority.ordinal() > cVar.p2.ordinal()) {
                    cVar.p2 = priority;
                }
            }
        } else if (!this.c.isShutdown()) {
            c e2 = c.e(aVar.a, this, this.k, this.l, aVar);
            e2.k2 = this.c.submit(e2);
            this.e.put(aVar.i, e2);
            if (z) {
                this.f.remove(aVar.d());
            }
            if (aVar.a.p) {
                b0.f("Dispatcher", "enqueued", aVar.b.b(), "");
            }
        } else if (aVar.a.p) {
            b0.f("Dispatcher", "ignored", aVar.b.b(), "because shut down");
        }
    }
}
