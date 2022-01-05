package com.instabug.apm.model;

import i0.j.a.h.c.c;
import java.util.concurrent.Executor;

public class APMNetworkLog {
    private String Carrier;
    private String errorMessage;
    private boolean executedInBackground;
    private Executor executor = i0.j.a.g.a.f("network_log_thread_executor");
    /* access modifiers changed from: private */
    public long id = -1;
    private String method = "get";
    /* access modifiers changed from: private */
    public i0.j.a.h.c.a networkLogHandler = new c();
    private String radio;
    private long requestBodySize;
    private String requestContentType;
    private String requestHeaders;
    private long responseBodySize;
    private int responseCode;
    private String responseContentType;
    private String responseHeaders;
    private Long startTime;
    private long totalDuration;
    private String url;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
            r10 = (android.telephony.TelephonyManager) r10.getSystemService(com.stripe.android.model.PaymentMethod.BillingDetails.PARAM_PHONE);
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                com.instabug.apm.model.APMNetworkLog r0 = com.instabug.apm.model.APMNetworkLog.this
                long r0 = r0.id
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                java.lang.String r1 = "dangling_apm_network_log"
                r4 = 1
                r5 = 0
                if (r0 != 0) goto L_0x0155
                com.instabug.apm.model.APMNetworkLog r0 = com.instabug.apm.model.APMNetworkLog.this
                i0.j.a.h.c.a r6 = r0.networkLogHandler
                com.instabug.apm.model.APMNetworkLog r7 = com.instabug.apm.model.APMNetworkLog.this
                i0.j.a.h.c.c r6 = (i0.j.a.h.c.c) r6
                java.util.Objects.requireNonNull(r6)
                boolean r8 = com.instabug.library.Instabug.isBuilt()
                if (r8 == 0) goto L_0x0151
                i0.j.a.e.b r8 = i0.j.a.g.a.g()
                i0.j.a.h.d.c r9 = r6.d
                i0.j.a.h.d.d r9 = (i0.j.a.h.d.d) r9
                i0.j.a.d.b.d r9 = r9.f
                i0.j.a.e.c r8 = (i0.j.a.e.c) r8
                boolean r10 = r8.h()
                if (r10 == 0) goto L_0x0151
                android.content.Context r10 = i0.j.a.g.a.m()
                r11 = 0
                if (r10 == 0) goto L_0x0078
                java.lang.String r12 = "connectivity"
                java.lang.Object r10 = r10.getSystemService(r12)
                android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
                if (r10 == 0) goto L_0x0078
                android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()
                if (r10 == 0) goto L_0x0078
                boolean r12 = r10.isConnected()
                if (r12 != 0) goto L_0x0053
                goto L_0x0078
            L_0x0053:
                int r12 = r10.getType()
                if (r12 != r4) goto L_0x005c
                java.lang.String r10 = "wifi"
                goto L_0x0079
            L_0x005c:
                int r12 = r10.getType()
                if (r12 != 0) goto L_0x0078
                int r10 = r10.getSubtype()
                switch(r10) {
                    case 1: goto L_0x0075;
                    case 2: goto L_0x0075;
                    case 3: goto L_0x0072;
                    case 4: goto L_0x0075;
                    case 5: goto L_0x0072;
                    case 6: goto L_0x0072;
                    case 7: goto L_0x0075;
                    case 8: goto L_0x0072;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x0072;
                    case 11: goto L_0x0075;
                    case 12: goto L_0x0072;
                    case 13: goto L_0x006f;
                    case 14: goto L_0x0072;
                    case 15: goto L_0x0072;
                    case 16: goto L_0x0075;
                    case 17: goto L_0x0072;
                    case 18: goto L_0x006f;
                    case 19: goto L_0x006f;
                    case 20: goto L_0x006c;
                    default: goto L_0x0069;
                }
            L_0x0069:
                java.lang.String r10 = "UNKNOWN"
                goto L_0x0079
            L_0x006c:
                java.lang.String r10 = "5G"
                goto L_0x0079
            L_0x006f:
                java.lang.String r10 = "4G"
                goto L_0x0079
            L_0x0072:
                java.lang.String r10 = "3G"
                goto L_0x0079
            L_0x0075:
                java.lang.String r10 = "2G"
                goto L_0x0079
            L_0x0078:
                r10 = r11
            L_0x0079:
                r7.setRadio(r10)
                android.content.Context r10 = i0.j.a.g.a.m()
                if (r10 == 0) goto L_0x0091
                java.lang.String r12 = "phone"
                java.lang.Object r10 = r10.getSystemService(r12)
                android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
                if (r10 == 0) goto L_0x0091
                java.lang.String r10 = r10.getSimOperatorName()
                goto L_0x0092
            L_0x0091:
                r10 = r11
            L_0x0092:
                r7.setCarrier(r10)
                if (r9 != 0) goto L_0x00e8
                r7.setExecutedInBackground(r4)
                i0.j.a.d.a.c.a r4 = r6.b
                i0.j.a.d.a.c.b r4 = (i0.j.a.d.a.c.b) r4
                com.instabug.library.internal.storage.cache.db.DatabaseManager r5 = r4.a
                if (r5 == 0) goto L_0x00b2
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r5 = r5.openDatabase()
                android.content.ContentValues r4 = r4.a(r7)
                long r9 = r5.insert(r1, r11, r4)
                r5.close()
                goto L_0x00b3
            L_0x00b2:
                r9 = r2
            L_0x00b3:
                int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r1 == 0) goto L_0x00e6
                i0.j.a.n.a.a r1 = r6.c
                java.lang.String r2 = "Network request added to dangling table: "
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                java.lang.String r3 = r7.getUrl()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.a(r2)
                i0.j.a.d.a.c.a r1 = r6.b
                long r2 = r8.i()
                i0.j.a.d.a.c.b r1 = (i0.j.a.d.a.c.b) r1
                com.instabug.library.internal.storage.cache.db.DatabaseManager r4 = r1.a
                if (r4 == 0) goto L_0x00e6
                java.lang.String r4 = "delete from dangling_apm_network_log where log_id not in ( select log_id from dangling_apm_network_log order by log_id desc limit "
                java.lang.String r5 = " )"
                java.lang.String r2 = i0.d.a.a.a.l0(r4, r2, r5)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = r1.a
                i0.d.a.a.a.o(r1, r2)
            L_0x00e6:
                r2 = r9
                goto L_0x0151
            L_0x00e8:
                r7.setExecutedInBackground(r5)
                i0.j.a.d.a.c.c r1 = r6.a
                java.lang.String r5 = r9.a
                i0.j.a.d.a.c.d r1 = (i0.j.a.d.a.c.d) r1
                long r10 = r1.b(r5, r7)
                int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r1 == 0) goto L_0x0150
                i0.j.a.n.a.a r1 = r6.c
                java.lang.String r2 = "Network request added to network table: "
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                java.lang.String r3 = r7.getUrl()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.a(r2)
                i0.j.a.d.a.d.f r1 = r6.e
                if (r1 == 0) goto L_0x0145
                java.lang.String r2 = r9.a
                r1.l(r2, r4)
                i0.j.a.d.a.c.c r1 = r6.a
                java.lang.String r2 = r9.a
                long r3 = r8.d()
                i0.j.a.d.a.c.d r1 = (i0.j.a.d.a.c.d) r1
                int r1 = r1.a(r2, r3)
                if (r1 <= 0) goto L_0x0145
                i0.j.a.n.a.a r2 = r6.c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Network requests dropped count: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                r2.a(r3)
                i0.j.a.d.a.d.f r2 = r6.e
                java.lang.String r3 = r9.a
                r2.g(r3, r1)
            L_0x0145:
                i0.j.a.d.a.c.c r1 = r6.a
                long r2 = r8.i()
                i0.j.a.d.a.c.d r1 = (i0.j.a.d.a.c.d) r1
                r1.c(r2)
            L_0x0150:
                r2 = r10
            L_0x0151:
                long unused = r0.id = r2
                goto L_0x01c3
            L_0x0155:
                com.instabug.apm.model.APMNetworkLog r0 = com.instabug.apm.model.APMNetworkLog.this
                i0.j.a.h.c.a r0 = r0.networkLogHandler
                com.instabug.apm.model.APMNetworkLog r2 = com.instabug.apm.model.APMNetworkLog.this
                i0.j.a.h.c.c r0 = (i0.j.a.h.c.c) r0
                java.util.Objects.requireNonNull(r0)
                boolean r3 = com.instabug.library.Instabug.isBuilt()
                if (r3 == 0) goto L_0x01c3
                i0.j.a.e.b r3 = i0.j.a.g.a.g()
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                boolean r3 = r3.h()
                if (r3 == 0) goto L_0x01c3
                boolean r3 = r2.executedInBackground()
                java.lang.String r6 = "log_id = ?"
                if (r3 == 0) goto L_0x019f
                i0.j.a.d.a.c.a r0 = r0.b
                i0.j.a.d.a.c.b r0 = (i0.j.a.d.a.c.b) r0
                com.instabug.library.internal.storage.cache.db.DatabaseManager r3 = r0.a
                if (r3 == 0) goto L_0x01c3
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r3 = r3.openDatabase()
                android.content.ContentValues r0 = r0.a(r2)
                java.lang.String[] r4 = new java.lang.String[r4]
                long r7 = r2.getId()
                java.lang.String r2 = java.lang.String.valueOf(r7)
                r4[r5] = r2
                r3.update(r1, r0, r6, r4)
                r3.close()
                goto L_0x01c3
            L_0x019f:
                i0.j.a.d.a.c.c r0 = r0.a
                i0.j.a.d.a.c.d r0 = (i0.j.a.d.a.c.d) r0
                com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = r0.a
                if (r1 == 0) goto L_0x01c3
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r1 = r1.openDatabase()
                android.content.ContentValues r0 = r0.d(r2)
                java.lang.String[] r3 = new java.lang.String[r4]
                long r7 = r2.getId()
                java.lang.String r2 = java.lang.String.valueOf(r7)
                r3[r5] = r2
                java.lang.String r2 = "apm_network_log"
                r1.update(r2, r0, r6, r3)
                r1.close()
            L_0x01c3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.apm.model.APMNetworkLog.a.run():void");
        }
    }

    public boolean executedInBackground() {
        return this.executedInBackground;
    }

    public String getCarrier() {
        return this.Carrier;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public long getId() {
        return this.id;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRadio() {
        return this.radio;
    }

    public long getRequestBodySize() {
        return this.requestBodySize;
    }

    public String getRequestContentType() {
        return this.requestContentType;
    }

    public String getRequestHeaders() {
        return this.requestHeaders;
    }

    public long getResponseBodySize() {
        return this.responseBodySize;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getResponseContentType() {
        return this.responseContentType;
    }

    public String getResponseHeaders() {
        return this.responseHeaders;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public String getUrl() {
        return this.url;
    }

    public void insert() {
        this.executor.execute(new a());
    }

    public void setCarrier(String str) {
        this.Carrier = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExecutedInBackground(boolean z) {
        this.executedInBackground = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRadio(String str) {
        this.radio = str;
    }

    public void setRequestBodySize(long j) {
        this.requestBodySize = j;
    }

    public void setRequestContentType(String str) {
        this.requestContentType = str;
    }

    public void setRequestHeaders(String str) {
        this.requestHeaders = str;
    }

    public void setResponseBodySize(long j) {
        this.responseBodySize = j;
    }

    public void setResponseCode(int i) {
        this.responseCode = i;
    }

    public void setResponseContentType(String str) {
        this.responseContentType = str;
    }

    public void setResponseHeaders(String str) {
        this.responseHeaders = str;
    }

    public void setStartTime(Long l) {
        this.startTime = l;
    }

    public void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
