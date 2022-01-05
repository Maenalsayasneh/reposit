package com.instabug.chat.synchronization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.cache.ReadQueueCacheManager;
import com.instabug.chat.eventbus.ChatTimeUpdatedEventBus;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
public class SynchronizationManager {
    private static volatile SynchronizationManager INSTANCE = null;
    private static final String MISSING_MESSAGES = "missing_messages";
    private static final long STOP_PULLING = -1;
    private static final String TTL = "ttl";
    private k0.b.w.a chatTimeDisposable;
    private k0.b.y.d<Long> chattingTimeUpdateAction = new b();
    /* access modifiers changed from: private */
    public Handler handler;
    private boolean isSyncing = false;
    /* access modifiers changed from: private */
    public boolean shouldSync = false;
    /* access modifiers changed from: private */
    public k0.b.y.d<Long> syncAction = new a();
    /* access modifiers changed from: private */
    public e syncRunnable;

    public class a implements k0.b.y.d<Long> {
        public a() {
        }

        public void b(Object obj) throws Exception {
            Long l = (Long) obj;
            if (((!SynchronizationManager.this.shouldSync || SynchronizationManager.this.handler == null || SynchronizationManager.this.syncRunnable == null) ? false : true) && SynchronizationManager.this.handler != null && SynchronizationManager.this.syncRunnable != null) {
                InstabugSDKLogger.v(this, "Waiting " + l + " seconds until the  next sync");
                SynchronizationManager.this.handler.postDelayed(SynchronizationManager.this.syncRunnable, l.longValue() * 1000);
            }
        }
    }

    public class b implements k0.b.y.d<Long> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            Long l = (Long) obj;
            SynchronizationManager.this.sync();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context c;

        public c(Context context) {
            this.c = context;
        }

        public void run() {
            Handler unused = SynchronizationManager.this.handler = new Handler();
            SynchronizationManager synchronizationManager = SynchronizationManager.this;
            e unused2 = synchronizationManager.syncRunnable = new e(this.c);
            SynchronizationManager.this.subscribeToChatTimeUpdatedEvents();
        }
    }

    public class d implements Request.Callbacks<RequestResponse, Throwable> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ k0.b.y.d b;
        public final /* synthetic */ List c;

        public d(Context context, k0.b.y.d dVar, List list) {
            this.a = context;
            this.b = dVar;
            this.c = list;
        }

        public void onFailed(Object obj) {
            Throwable th = (Throwable) obj;
            SynchronizationManager.this.handleFailureResponse(this.b);
        }

        public void onSucceeded(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            if (requestResponse != null) {
                SynchronizationManager.this.handleSuccessResponse(requestResponse, this.a, this.b);
            }
            SynchronizationManager.this.clearReadMessages(this.c);
        }
    }

    public class e implements Runnable {
        public WeakReference<Context> c;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                WeakReference<Context> weakReference = e.this.c;
                if (weakReference == null || weakReference.get() == null) {
                    try {
                        SynchronizationManager.this.syncAction.b(Long.valueOf(i0.j.c.l.a.N()));
                    } catch (Exception e) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Exception was occurred,");
                        P0.append(e.getMessage());
                        InstabugSDKLogger.e(this, P0.toString());
                    }
                } else {
                    e eVar = e.this;
                    SynchronizationManager.this.syncMessages((Context) eVar.c.get(), SynchronizationManager.this.syncAction);
                }
            }
        }

        public e(Context context) {
            this.c = new WeakReference<>(context);
        }

        public void run() {
            PoolProvider.postIOTaskWithCheck(new a());
        }
    }

    private SynchronizationManager(Context context) {
        PoolProvider.postMainThreadTask(new c(context));
    }

    /* access modifiers changed from: private */
    public void clearReadMessages(List<i0.j.c.f.c> list) {
        ReadQueueCacheManager.getInstance().notify(list);
    }

    public static synchronized SynchronizationManager getInstance() {
        SynchronizationManager synchronizationManager;
        synchronized (SynchronizationManager.class) {
            if (INSTANCE == null && Instabug.getApplicationContext() != null) {
                init(Instabug.getApplicationContext());
            }
            synchronizationManager = INSTANCE;
        }
        return synchronizationManager;
    }

    public static SynchronizationManager getInstanceUnModified() {
        return INSTANCE;
    }

    /* access modifiers changed from: private */
    public void handleFailureResponse(k0.b.y.d<Long> dVar) {
        InstabugSDKLogger.v(this, "Something went wrong while sync messages");
        this.isSyncing = false;
        try {
            dVar.b(Long.valueOf(i0.j.c.l.a.N()));
        } catch (Exception e2) {
            StringBuilder P0 = i0.d.a.a.a.P0("Exception was occurred,");
            P0.append(e2.getMessage());
            InstabugSDKLogger.e(this, P0.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0154 A[Catch:{ JSONException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015e A[Catch:{ JSONException -> 0x01ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleReceivedMessages(android.content.Context r20, org.json.JSONArray r21, boolean r22) throws org.json.JSONException {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = 0
            org.json.JSONObject[] r3 = new org.json.JSONObject[r0]
            int r4 = r21.length()
            if (r4 == 0) goto L_0x0053
            java.lang.String r3 = "new "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            int r4 = r21.length()
            r3.append(r4)
            java.lang.String r4 = " messages received"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.v(r1, r3)
            int r3 = r21.length()
            org.json.JSONObject[] r4 = new org.json.JSONObject[r3]
            r5 = r0
        L_0x002d:
            int r6 = r21.length()
            if (r5 >= r6) goto L_0x003e
            r6 = r21
            org.json.JSONObject r7 = r6.getJSONObject(r5)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x002d
        L_0x003e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "messages count:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.instabug.library.util.InstabugSDKLogger.v(r1, r3)
            r3 = r4
        L_0x0053:
            i0.j.c.m.a r4 = i0.j.c.m.a.d()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "read_at"
            java.lang.String r6 = "messaged_at"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r0
        L_0x0064:
            int r0 = r3.length
            if (r8 >= r0) goto L_0x01d7
            r0 = r3[r8]     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r9 = "attachments"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r10 = "actions"
            org.json.JSONArray r10 = r0.getJSONArray(r10)     // Catch:{ JSONException -> 0x01ba }
            com.instabug.chat.e.d r11 = new com.instabug.chat.e.d     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r12 = "id"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r13 = com.instabug.library.user.UserManagerWrapper.getUserName()     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r14 = com.instabug.library.user.UserManagerWrapper.getUserEmail()     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r15 = com.instabug.library.core.InstabugCore.getPushNotificationToken()     // Catch:{ JSONException -> 0x01ba }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r12 = "chat_number"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x01ba }
            r11.d = r12     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r12 = "body"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x01ba }
            r11.q = r12     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r12 = "from"
            org.json.JSONObject r12 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r13 = "name"
            java.lang.String r12 = r12.getString(r13)     // Catch:{ JSONException -> 0x01ba }
            r11.x = r12     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r12 = "avatar"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x01ba }
            r11.y = r12     // Catch:{ JSONException -> 0x01ba }
            com.instabug.chat.e.d$c r12 = com.instabug.chat.e.d.c.SYNCED     // Catch:{ JSONException -> 0x01ba }
            r11.e2 = r12     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r12 = r0.getString(r6)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r13 = "null"
            java.lang.String r14 = ""
            if (r12 == 0) goto L_0x00f0
            java.lang.String r12 = r0.getString(r6)     // Catch:{ JSONException -> 0x01ba }
            boolean r12 = r12.equals(r14)     // Catch:{ JSONException -> 0x01ba }
            if (r12 != 0) goto L_0x00f0
            java.lang.String r12 = r0.getString(r6)     // Catch:{ JSONException -> 0x01ba }
            boolean r12 = r12.equals(r13)     // Catch:{ JSONException -> 0x01ba }
            if (r12 != 0) goto L_0x00f0
            java.lang.String r12 = r0.getString(r6)     // Catch:{ JSONException -> 0x01ba }
            java.util.Date r12 = com.instabug.library.util.InstabugDateFormatter.getDate(r12)     // Catch:{ JSONException -> 0x01ba }
            if (r12 == 0) goto L_0x00f0
            java.lang.String r12 = r0.getString(r6)     // Catch:{ JSONException -> 0x01ba }
            java.util.Date r12 = com.instabug.library.util.InstabugDateFormatter.getDate(r12)     // Catch:{ JSONException -> 0x01ba }
            long r15 = r12.getTime()     // Catch:{ JSONException -> 0x01ba }
            r17 = 1000(0x3e8, double:4.94E-321)
            long r1 = r15 / r17
            r11.Y1 = r1     // Catch:{ JSONException -> 0x01ba }
        L_0x00f0:
            java.lang.String r1 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ba }
            if (r1 == 0) goto L_0x0126
            java.lang.String r1 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ba }
            boolean r1 = r1.equals(r14)     // Catch:{ JSONException -> 0x01ba }
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ba }
            boolean r1 = r1.equals(r13)     // Catch:{ JSONException -> 0x01ba }
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ba }
            java.util.Date r1 = com.instabug.library.util.InstabugDateFormatter.getDate(r1)     // Catch:{ JSONException -> 0x01ba }
            if (r1 == 0) goto L_0x0126
            java.lang.String r1 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ba }
            java.util.Date r1 = com.instabug.library.util.InstabugDateFormatter.getDate(r1)     // Catch:{ JSONException -> 0x01ba }
            long r1 = r1.getTime()     // Catch:{ JSONException -> 0x01ba }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r12
            r11.b(r1)     // Catch:{ JSONException -> 0x01ba }
        L_0x0126:
            java.lang.String r1 = "direction"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x0163
            int r1 = r0.hashCode()     // Catch:{ JSONException -> 0x01ba }
            r2 = 57076464(0x366eaf0, float:6.786062E-37)
            if (r1 == r2) goto L_0x0147
            r2 = 1941740409(0x73bc9b79, float:2.9886022E31)
            if (r1 == r2) goto L_0x013d
            goto L_0x0151
        L_0x013d:
            java.lang.String r1 = "inbound"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x0151
            r0 = 0
            goto L_0x0152
        L_0x0147:
            java.lang.String r1 = "outbound"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x01ba }
            if (r0 == 0) goto L_0x0151
            r0 = 1
            goto L_0x0152
        L_0x0151:
            r0 = -1
        L_0x0152:
            if (r0 == 0) goto L_0x015e
            r1 = 1
            if (r0 == r1) goto L_0x0158
            goto L_0x0163
        L_0x0158:
            com.instabug.chat.e.d$b r0 = com.instabug.chat.e.d.b.OUTBOUND     // Catch:{ JSONException -> 0x01ba }
            r11.a(r0)     // Catch:{ JSONException -> 0x01ba }
            goto L_0x0163
        L_0x015e:
            com.instabug.chat.e.d$b r0 = com.instabug.chat.e.d.b.INBOUND     // Catch:{ JSONException -> 0x01ba }
            r11.a(r0)     // Catch:{ JSONException -> 0x01ba }
        L_0x0163:
            int r0 = r9.length()     // Catch:{ JSONException -> 0x01ba }
            int r0 = r0 + -1
        L_0x0169:
            if (r0 < 0) goto L_0x0196
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r2 = "metadata"
            org.json.JSONObject r2 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x01ba }
            com.instabug.chat.e.a r12 = new com.instabug.chat.e.a     // Catch:{ JSONException -> 0x01ba }
            r12.<init>()     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r13 = "url"
            java.lang.String r1 = r1.getString(r13)     // Catch:{ JSONException -> 0x01ba }
            r12.q = r1     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r1 = "synced"
            r12.y = r1     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r1 = "file_type"
            java.lang.String r1 = r2.getString(r1)     // Catch:{ JSONException -> 0x01ba }
            r12.x = r1     // Catch:{ JSONException -> 0x01ba }
            java.util.ArrayList<com.instabug.chat.e.a> r1 = r11.b2     // Catch:{ JSONException -> 0x01ba }
            r1.add(r12)     // Catch:{ JSONException -> 0x01ba }
            int r0 = r0 + -1
            goto L_0x0169
        L_0x0196:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01ba }
            int r0 = r0 + -1
        L_0x019c:
            if (r0 < 0) goto L_0x01b6
            org.json.JSONObject r1 = r10.getJSONObject(r0)     // Catch:{ JSONException -> 0x01ba }
            com.instabug.chat.e.e r2 = new com.instabug.chat.e.e     // Catch:{ JSONException -> 0x01ba }
            r2.<init>()     // Catch:{ JSONException -> 0x01ba }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x01ba }
            r2.fromJson(r1)     // Catch:{ JSONException -> 0x01ba }
            java.util.ArrayList<com.instabug.chat.e.e> r1 = r11.c2     // Catch:{ JSONException -> 0x01ba }
            r1.add(r2)     // Catch:{ JSONException -> 0x01ba }
            int r0 = r0 + -1
            goto L_0x019c
        L_0x01b6:
            r7.add(r11)     // Catch:{ JSONException -> 0x01ba }
            goto L_0x01cf
        L_0x01ba:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse message number "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.instabug.library.util.InstabugSDKLogger.e(r4, r1, r0)
        L_0x01cf:
            int r8 = r8 + 1
            r1 = r19
            r2 = r20
            goto L_0x0064
        L_0x01d7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            java.util.Iterator r0 = r7.iterator()
        L_0x01e0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0274
            java.lang.Object r2 = r0.next()
            com.instabug.chat.e.d r2 = (com.instabug.chat.e.d) r2
            com.instabug.chat.e.d r3 = r4.f(r2)
            if (r3 == 0) goto L_0x0216
            java.lang.String r5 = r3.c
            java.lang.String r6 = r2.c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0216
            com.instabug.chat.e.d$c r5 = r3.e2
            com.instabug.chat.e.d$c r6 = com.instabug.chat.e.d.c.SYNCED
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0216
            java.util.ArrayList<com.instabug.chat.e.a> r3 = r3.b2
            int r3 = r3.size()
            java.util.ArrayList<com.instabug.chat.e.a> r5 = r2.b2
            int r5 = r5.size()
            if (r3 != r5) goto L_0x0216
            r3 = 1
            goto L_0x0217
        L_0x0216:
            r3 = 0
        L_0x0217:
            if (r3 != 0) goto L_0x0256
            boolean r3 = r4.g(r2)
            if (r3 != 0) goto L_0x0256
            com.instabug.chat.e.d r3 = r4.f(r2)
            if (r3 == 0) goto L_0x0249
            java.lang.String r5 = r3.c
            java.lang.String r6 = r2.c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0249
            com.instabug.chat.e.d$c r5 = r3.e2
            com.instabug.chat.e.d$c r6 = com.instabug.chat.e.d.c.SENT
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0249
            java.util.ArrayList<com.instabug.chat.e.a> r3 = r3.b2
            int r3 = r3.size()
            java.util.ArrayList<com.instabug.chat.e.a> r5 = r2.b2
            int r5 = r5.size()
            if (r3 == r5) goto L_0x0249
            r3 = 1
            goto L_0x024a
        L_0x0249:
            r3 = 0
        L_0x024a:
            if (r3 != 0) goto L_0x0256
            boolean r3 = r2.c()
            if (r3 != 0) goto L_0x0256
            boolean r3 = r2.Z1
            if (r3 == 0) goto L_0x01e0
        L_0x0256:
            java.lang.String r3 = "Message "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            java.lang.String r5 = r2.toString()
            r3.append(r5)
            java.lang.String r5 = " removed from list to be notified"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r4, r3)
            r1.remove(r2)
            goto L_0x01e0
        L_0x0274:
            if (r22 == 0) goto L_0x02e0
            java.lang.String r0 = "START Invalidate Cache"
            com.instabug.library.util.InstabugSDKLogger.v(r4, r0)
            java.util.List r0 = com.instabug.chat.cache.ChatsCacheManager.getNotSentMessages()
            com.instabug.library.internal.storage.cache.InMemoryCache r2 = com.instabug.chat.cache.ChatsCacheManager.getCache()
            if (r2 == 0) goto L_0x0288
            r2.invalidate()
        L_0x0288:
            java.lang.String r2 = "finish Invalidate Cache"
            com.instabug.library.util.InstabugSDKLogger.v(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0296:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02da
            java.lang.Object r3 = r0.next()
            com.instabug.chat.e.d r3 = (com.instabug.chat.e.d) r3
            java.util.Iterator r5 = r7.iterator()
        L_0x02a6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02c0
            java.lang.Object r6 = r5.next()
            com.instabug.chat.e.d r6 = (com.instabug.chat.e.d) r6
            java.lang.String r8 = r3.d
            if (r8 == 0) goto L_0x02a6
            java.lang.String r6 = r6.d
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x02a6
            r5 = 1
            goto L_0x02c1
        L_0x02c0:
            r5 = 0
        L_0x02c1:
            if (r5 == 0) goto L_0x02c6
            r2.add(r3)
        L_0x02c6:
            com.instabug.chat.e.d$c r5 = r3.e2
            com.instabug.chat.e.d$c r6 = com.instabug.chat.e.d.c.SENT
            if (r5 != r6) goto L_0x0296
            com.instabug.chat.e.d r5 = r4.a(r3, r7)
            if (r5 == 0) goto L_0x0296
            com.instabug.chat.e.d r3 = r4.a(r3, r7)
            r2.remove(r3)
            goto L_0x0296
        L_0x02da:
            r3 = r20
            r4.e(r3, r2)
            goto L_0x02e5
        L_0x02e0:
            r3 = r20
            r4.e(r3, r7)
        L_0x02e5:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x030c
            i0.j.c.l.b r0 = i0.j.c.l.b.a()
            java.lang.Runnable r0 = r0.c
            if (r0 == 0) goto L_0x030c
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x0306 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0306 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0306 }
            i0.j.c.l.b r2 = i0.j.c.l.b.a()     // Catch:{ Exception -> 0x0306 }
            java.lang.Runnable r2 = r2.c     // Catch:{ Exception -> 0x0306 }
            r0.post(r2)     // Catch:{ Exception -> 0x0306 }
            goto L_0x030c
        L_0x0306:
            r0 = move-exception
            java.lang.String r2 = "new message runnable failed to run."
            com.instabug.library.util.InstabugSDKLogger.e(r4, r2, r0)
        L_0x030c:
            java.util.List<i0.j.c.m.b> r0 = r4.b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03bd
            i0.j.c.l.c r0 = i0.j.c.l.c.a()
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r2 = "ibc__notifications_state"
            r3 = 1
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L_0x03a8
            java.lang.String r0 = "Number of listeners to notify "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.util.List<i0.j.c.m.b> r2 = r4.b
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.v(r4, r0)
            java.util.List<i0.j.c.m.b> r0 = r4.b
            int r0 = r0.size()
            int r0 = r0 + -1
        L_0x0341:
            if (r0 < 0) goto L_0x03bc
            java.util.List<i0.j.c.m.b> r2 = r4.b
            java.lang.Object r2 = r2.get(r0)
            i0.j.c.m.b r2 = (i0.j.c.m.b) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Notifying listener "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r4, r3)
            if (r1 == 0) goto L_0x03bc
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x03bc
            java.lang.String r3 = "Notifying listener with "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            int r5 = r1.size()
            r3.append(r5)
            java.lang.String r5 = " message(s)"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r4, r3)
            java.util.List r1 = r2.onNewMessagesReceived(r1)
            java.lang.String r2 = "Notified listener remained "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            if (r1 == 0) goto L_0x0395
            int r3 = r1.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0396
        L_0x0395:
            r3 = 0
        L_0x0396:
            r2.append(r3)
            java.lang.String r3 = " message(s) to be sent to next listener"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.instabug.library.util.InstabugSDKLogger.d(r4, r2)
            int r0 = r0 + -1
            goto L_0x0341
        L_0x03a8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Chat notification disabled, messages that would not be notified "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.instabug.library.util.InstabugSDKLogger.v(r4, r0)
        L_0x03bc:
            return
        L_0x03bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No one is listening for unread messages"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.synchronization.SynchronizationManager.handleReceivedMessages(android.content.Context, org.json.JSONArray, boolean):void");
    }

    /* access modifiers changed from: private */
    public void handleSuccessResponse(RequestResponse requestResponse, Context context, k0.b.y.d<Long> dVar) {
        InstabugSDKLogger.v(this, "Chats synced successfully");
        boolean z = false;
        this.isSyncing = false;
        try {
            Object responseBody = requestResponse.getResponseBody();
            if (responseBody instanceof String) {
                JSONArray parseReceivedMessages = parseReceivedMessages((String) responseBody);
                if (requestResponse.getResponseCode() == 203) {
                    z = true;
                }
                handleReceivedMessages(context, parseReceivedMessages, z);
                handleTTL(parseTTL((String) responseBody), dVar);
            }
        } catch (Exception e2) {
            InstabugSDKLogger.e(this, e2.getMessage(), e2);
            try {
                dVar.b(Long.valueOf(i0.j.c.l.a.N()));
            } catch (Exception e3) {
                StringBuilder P0 = i0.d.a.a.a.P0("Exception was occurred,");
                P0.append(e3.getMessage());
                InstabugSDKLogger.e(this, P0.toString());
            }
        }
    }

    private void handleTTL(long j, k0.b.y.d<Long> dVar) {
        InstabugSDKLogger.v(this, "Next TTL: " + j);
        if (j != -1) {
            i0.j.c.l.c.a().b.edit().putLong("ibc_ttl", j).apply();
            try {
                dVar.b(Long.valueOf(j));
            } catch (Exception e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Exception was occurred,");
                P0.append(e2.getMessage());
                InstabugSDKLogger.e(this, P0.toString());
            }
        }
    }

    public static void init(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizationManager(context);
        }
    }

    private boolean isFeaturesFetchedBefore() {
        return InstabugCore.isFeaturesFetchedBefore();
    }

    private boolean isSyncing() {
        return this.isSyncing;
    }

    private JSONArray parseReceivedMessages(String str) throws JSONException {
        return new JSONObject(str).getJSONArray(MISSING_MESSAGES);
    }

    private long parseTTL(String str) throws JSONException {
        return new JSONObject(str).getLong("ttl");
    }

    /* access modifiers changed from: private */
    public void subscribeToChatTimeUpdatedEvents() {
        this.chatTimeDisposable = ChatTimeUpdatedEventBus.getInstance().subscribe(this.chattingTimeUpdateAction);
    }

    /* access modifiers changed from: private */
    public void syncMessages(Context context, k0.b.y.d<Long> dVar) {
        if (NetworkManager.isOnline(context)) {
            try {
                this.isSyncing = true;
                Context context2 = context;
                i0.j.c.k.d.d.a().b(context2, ChatsCacheManager.getLastMessageMessagedAt(), ChatsCacheManager.getTotalMessagesCount(), ReadQueueCacheManager.getInstance().getReadMessagesArray(), new d(context, dVar, ReadQueueCacheManager.getInstance().getAll()));
            } catch (JSONException unused) {
                handleFailureResponse(dVar);
            }
        } else {
            InstabugSDKLogger.w(this, "device is offline, can't sync");
            try {
                dVar.b(Long.valueOf(i0.j.c.l.a.N()));
            } catch (Exception e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Exception was occurred,");
                P0.append(e2.getMessage());
                InstabugSDKLogger.e(this, P0.toString());
            }
        }
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public static void tearDown() {
        INSTANCE = null;
    }

    private void unSubscribeToChatTimeUpdatedEvents() {
        k0.b.w.a aVar = this.chatTimeDisposable;
        if (aVar != null && !aVar.isDisposed()) {
            this.chatTimeDisposable.dispose();
        }
    }

    public boolean isChatFeatureEnabled() {
        return InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == Feature.State.ENABLED && (InstabugCore.isFeatureEnabled(Feature.CHATS) || InstabugCore.isFeatureEnabled(Feature.REPLIES));
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    @SuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public void release() {
        stop();
        unSubscribeToChatTimeUpdatedEvents();
        this.handler = null;
        this.syncRunnable = null;
        INSTANCE = null;
    }

    public void stop() {
        e eVar;
        this.shouldSync = false;
        Handler handler2 = this.handler;
        if (handler2 != null && (eVar = this.syncRunnable) != null) {
            handler2.removeCallbacks(eVar);
        }
    }

    public void sync() {
        if (this.handler != null && this.syncRunnable != null && isChatFeatureEnabled() && !isSyncing()) {
            stop();
            this.shouldSync = true;
            this.handler.post(this.syncRunnable);
        }
    }
}
