package com.instabug.library.internal.storage.cache;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.Action;
import com.instabug.library.util.memory.MemoryGuard;
import com.instabug.library.util.memory.predicate.CacheFileMemoryAvailablePredicate;
import com.pubnub.api.vendor.FileEncryptionUtil;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class OnDiskCache<V extends Cacheable> extends Cache<String, V> {
    public static final String TAG = "OnDiskCache";
    /* access modifiers changed from: private */
    public Class<V> VClass;
    private final File cacheDir;
    /* access modifiers changed from: private */
    public final File cacheFile;
    /* access modifiers changed from: private */
    public final Charset charset;

    public class a implements Action {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ all -> 0x00a1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0065 A[Catch:{ all -> 0x00a1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0094 A[SYNTHETIC, Splitter:B:36:0x0094] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7 A[SYNTHETIC, Splitter:B:46:0x00a7] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAffirmed() throws java.lang.Throwable {
            /*
                r7 = this;
                com.instabug.library.internal.storage.cache.OnDiskCache r0 = com.instabug.library.internal.storage.cache.OnDiskCache.this
                java.io.File r0 = r0.cacheFile
                monitor-enter(r0)
                r1 = 0
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                com.instabug.library.internal.storage.cache.OnDiskCache r5 = com.instabug.library.internal.storage.cache.OnDiskCache.this     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                java.io.File r5 = r5.cacheFile     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                com.instabug.library.internal.storage.cache.OnDiskCache r5 = com.instabug.library.internal.storage.cache.OnDiskCache.this     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                java.nio.charset.Charset r5 = r5.charset     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            L_0x0023:
                java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x0051 }
                com.instabug.library.internal.storage.cache.OnDiskCache r3 = com.instabug.library.internal.storage.cache.OnDiskCache.this     // Catch:{ Exception -> 0x0051 }
                java.lang.String r3 = r3.getValue(r1)     // Catch:{ Exception -> 0x0051 }
                if (r3 == 0) goto L_0x0049
                boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x0051 }
                if (r4 != 0) goto L_0x0049
                com.instabug.library.internal.storage.cache.OnDiskCache r4 = com.instabug.library.internal.storage.cache.OnDiskCache.this     // Catch:{ Exception -> 0x0051 }
                java.lang.Class r4 = r4.VClass     // Catch:{ Exception -> 0x0051 }
                java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x0051 }
                com.instabug.library.internal.storage.cache.Cacheable r4 = (com.instabug.library.internal.storage.cache.Cacheable) r4     // Catch:{ Exception -> 0x0051 }
                r4.fromJson(r3)     // Catch:{ Exception -> 0x0051 }
                java.util.List r3 = r7.a     // Catch:{ Exception -> 0x0051 }
                r3.add(r4)     // Catch:{ Exception -> 0x0051 }
            L_0x0049:
                if (r1 != 0) goto L_0x0023
                r2.close()     // Catch:{ IOException -> 0x004f }
                goto L_0x009f
            L_0x004f:
                r1 = move-exception
                goto L_0x0098
            L_0x0051:
                r1 = move-exception
                goto L_0x0059
            L_0x0053:
                r2 = move-exception
                goto L_0x00a5
            L_0x0055:
                r2 = move-exception
                r6 = r2
                r2 = r1
                r1 = r6
            L_0x0059:
                boolean r3 = r1 instanceof java.lang.InstantiationException     // Catch:{ all -> 0x00a1 }
                if (r3 == 0) goto L_0x0065
                java.lang.String r3 = "OnDiskCache"
                java.lang.String r4 = "InstantiationException happened while fetching values"
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x00a1 }
                goto L_0x0092
            L_0x0065:
                boolean r3 = r1 instanceof java.lang.IllegalAccessException     // Catch:{ all -> 0x00a1 }
                if (r3 == 0) goto L_0x0071
                java.lang.String r3 = "OnDiskCache"
                java.lang.String r4 = "IllegalAccessException went wrong while fetching"
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x00a1 }
                goto L_0x0092
            L_0x0071:
                boolean r3 = r1 instanceof java.io.IOException     // Catch:{ all -> 0x00a1 }
                if (r3 == 0) goto L_0x007d
                java.lang.String r3 = "OnDiskCache"
                java.lang.String r4 = "IOException went wrong while fetching values"
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x00a1 }
                goto L_0x0092
            L_0x007d:
                boolean r3 = r1 instanceof org.json.JSONException     // Catch:{ all -> 0x00a1 }
                if (r3 == 0) goto L_0x0089
                java.lang.String r3 = "OnDiskCache"
                java.lang.String r4 = "JSONException went wrong while fetching values"
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x00a1 }
                goto L_0x0092
            L_0x0089:
                java.lang.String r3 = "OnDiskCache"
                java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x00a1 }
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x00a1 }
            L_0x0092:
                if (r2 == 0) goto L_0x009f
                r2.close()     // Catch:{ IOException -> 0x004f }
                goto L_0x009f
            L_0x0098:
                java.lang.String r2 = "OnDiskCache"
                java.lang.String r3 = "Failed to close file reader"
                com.instabug.library.util.InstabugSDKLogger.e(r2, r3, r1)     // Catch:{ all -> 0x00b4 }
            L_0x009f:
                monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
                return
            L_0x00a1:
                r1 = move-exception
                r6 = r2
                r2 = r1
                r1 = r6
            L_0x00a5:
                if (r1 == 0) goto L_0x00b3
                r1.close()     // Catch:{ IOException -> 0x00ab }
                goto L_0x00b3
            L_0x00ab:
                r1 = move-exception
                java.lang.String r3 = "OnDiskCache"
                java.lang.String r4 = "Failed to close file reader"
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x00b4 }
            L_0x00b3:
                throw r2     // Catch:{ all -> 0x00b4 }
            L_0x00b4:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.a.onAffirmed():void");
        }

        public void onDenied() throws Throwable {
            InstabugSDKLogger.e(OnDiskCache.TAG, "Failed to read cache values");
        }
    }

    public OnDiskCache(Context context, String str, String str2, Class<V> cls) {
        super(str);
        this.VClass = cls;
        File cacheDir2 = context.getCacheDir();
        this.cacheDir = cacheDir2;
        File file = new File(cacheDir2 + str2);
        this.cacheFile = file;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!file.exists()) {
            try {
                atomicBoolean.set(file.createNewFile());
            } catch (IOException e) {
                InstabugSDKLogger.e(TAG, "Failed to create", e);
            }
        } else {
            atomicBoolean.set(true);
        }
        if (Charset.isSupported(FileEncryptionUtil.ENCODING_UTF_8)) {
            this.charset = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
        } else {
            this.charset = Charset.defaultCharset();
        }
        if (atomicBoolean.get() && !checkCacheValidity()) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061 A[SYNTHETIC, Splitter:B:34:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f A[SYNTHETIC, Splitter:B:41:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0087 A[SYNTHETIC, Splitter:B:54:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0097 A[SYNTHETIC, Splitter:B:63:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkCacheValidity() {
        /*
            r8 = this;
            java.io.File r0 = r8.cacheFile
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "OnDiskCache"
            java.lang.String r2 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.d(r0, r2)
            return r1
        L_0x0013:
            java.io.File r0 = r8.cacheFile
            monitor-enter(r0)
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            java.io.File r6 = r8.cacheFile     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            java.nio.charset.Charset r6 = r8.charset     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x007d, JSONException -> 0x0065, OutOfMemoryError -> 0x0055 }
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x0050, JSONException -> 0x004b, OutOfMemoryError -> 0x0048, all -> 0x0045 }
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = r8.getValue(r2)     // Catch:{ IOException -> 0x0050, JSONException -> 0x004b, OutOfMemoryError -> 0x0048, all -> 0x0045 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0050, JSONException -> 0x004b, OutOfMemoryError -> 0x0048, all -> 0x0045 }
            if (r4 != 0) goto L_0x003f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ IOException -> 0x0050, JSONException -> 0x004b, OutOfMemoryError -> 0x0048, all -> 0x0045 }
            r4.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x0050, JSONException -> 0x004b, OutOfMemoryError -> 0x0048, all -> 0x0045 }
        L_0x003f:
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0092
        L_0x0043:
            r1 = move-exception
            goto L_0x008b
        L_0x0045:
            r1 = move-exception
            r2 = r3
            goto L_0x0095
        L_0x0048:
            r1 = move-exception
            r2 = r3
            goto L_0x0056
        L_0x004b:
            r2 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0066
        L_0x0050:
            r1 = move-exception
            r2 = r3
            goto L_0x007e
        L_0x0053:
            r1 = move-exception
            goto L_0x0095
        L_0x0055:
            r1 = move-exception
        L_0x0056:
            java.lang.String r3 = "OOM while fetching values "
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0053 }
            com.instabug.library.util.InstabugSDKLogger.e(r3, r1)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0092
        L_0x0065:
            r3 = move-exception
        L_0x0066:
            java.lang.String r4 = "OnDiskCache"
            java.lang.String r5 = "JSONException went wrong while fetching values"
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r3)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x007b
        L_0x0073:
            r2 = move-exception
            java.lang.String r3 = "OnDiskCache"
            java.lang.String r4 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r2)     // Catch:{ all -> 0x00a4 }
        L_0x007b:
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            return r1
        L_0x007d:
            r1 = move-exception
        L_0x007e:
            java.lang.String r3 = "OnDiskCache"
            java.lang.String r4 = "IOException went wrong while fetching values"
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0092
        L_0x008b:
            java.lang.String r2 = "OnDiskCache"
            java.lang.String r3 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.e(r2, r3, r1)     // Catch:{ all -> 0x00a4 }
        L_0x0092:
            r1 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            return r1
        L_0x0095:
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00a3
        L_0x009b:
            r2 = move-exception
            java.lang.String r3 = "OnDiskCache"
            java.lang.String r4 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r2)     // Catch:{ all -> 0x00a4 }
        L_0x00a3:
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            throw r1
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.checkCacheValidity():boolean");
    }

    private Action getReadValuesAction(List<V> list) {
        return new a(list);
    }

    public String getKey(String str) {
        if (str == null || str.isEmpty() || !str.contains(":")) {
            return null;
        }
        return str.substring(0, str.indexOf(":"));
    }

    public String getValue(String str) {
        if (str == null || str.isEmpty() || !str.contains(":")) {
            return null;
        }
        return str.substring(str.indexOf(":") + 1);
    }

    public List<V> getValues() {
        ArrayList arrayList = new ArrayList();
        if (!this.cacheFile.exists()) {
            InstabugSDKLogger.addVerboseLog(TAG, "Cache file doesn't exist");
            return arrayList;
        }
        if (Instabug.isBuilt() && Instabug.getApplicationContext() != null) {
            MemoryGuard.from(Instabug.getApplicationContext()).withPredicate(new CacheFileMemoryAvailablePredicate(this.cacheFile)).doAction(getReadValuesAction(arrayList));
        }
        return arrayList;
    }

    public void invalidate() {
        if (this.cacheFile.exists()) {
            InstabugSDKLogger.d(TAG, "Cache file  exist");
            synchronized (this.cacheFile) {
                this.cacheFile.delete();
            }
        }
        try {
            this.cacheFile.createNewFile();
        } catch (IOException e) {
            InstabugSDKLogger.e(TAG, "Failed to create cache file", e);
        }
    }

    public long size() {
        long totalSpace;
        if (!this.cacheFile.exists()) {
            InstabugSDKLogger.d(TAG, "Cache file doesn't exist");
            return -1;
        }
        synchronized (this.cacheFile) {
            totalSpace = this.cacheFile.getTotalSpace();
        }
        return totalSpace;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.BufferedWriter] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.BufferedWriter] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.BufferedWriter] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.io.BufferedWriter] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0193 A[SYNTHETIC, Splitter:B:102:0x0193] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019d A[Catch:{ IOException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c A[SYNTHETIC, Splitter:B:59:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0124 A[Catch:{ IOException -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014e A[SYNTHETIC, Splitter:B:76:0x014e] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0156 A[Catch:{ IOException -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017b A[SYNTHETIC, Splitter:B:90:0x017b] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0183 A[Catch:{ IOException -> 0x017f }] */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    public V delete(java.lang.String r10) {
        /*
            r9 = this;
            java.io.File r0 = r9.cacheFile
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r10 = "OnDiskCache"
            java.lang.String r0 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.d(r10, r0)
            return r1
        L_0x0011:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r9.cacheDir
            r2.append(r3)
            java.lang.String r3 = "/cache.tmp"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.lang.Class<V> r2 = r9.VClass     // Catch:{ InstantiationException -> 0x004a, IllegalAccessException -> 0x0032 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ InstantiationException -> 0x004a, IllegalAccessException -> 0x0032 }
            com.instabug.library.internal.storage.cache.Cacheable r2 = (com.instabug.library.internal.storage.cache.Cacheable) r2     // Catch:{ InstantiationException -> 0x004a, IllegalAccessException -> 0x0032 }
            goto L_0x0062
        L_0x0032:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "IllegalAccessException went wrong while deleting value for key "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "OnDiskCache"
            com.instabug.library.util.InstabugSDKLogger.e(r4, r3, r2)
            goto L_0x0061
        L_0x004a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "InstantiationException happened while deleting value for key "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "OnDiskCache"
            com.instabug.library.util.InstabugSDKLogger.e(r4, r3, r2)
        L_0x0061:
            r2 = r1
        L_0x0062:
            java.io.File r3 = r9.cacheFile
            monitor-enter(r3)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            java.io.File r7 = r9.cacheFile     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            java.nio.charset.Charset r7 = r9.charset     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0161, JSONException -> 0x0134, OutOfMemoryError -> 0x0100, all -> 0x00fc }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
            r8 = 1
            r7.<init>(r0, r8)     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
            java.nio.charset.Charset r8 = r9.charset     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00f3, OutOfMemoryError -> 0x00ef, all -> 0x00ec }
        L_0x008a:
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            java.lang.String r6 = r9.getKey(r1)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            java.lang.String r7 = r9.getValue(r1)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            if (r6 == 0) goto L_0x00ba
            boolean r6 = r6.equals(r10)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            if (r6 == 0) goto L_0x00a6
            if (r2 == 0) goto L_0x00a6
            if (r7 == 0) goto L_0x00a6
            r2.fromJson(r7)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            goto L_0x00ba
        L_0x00a6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            r6.<init>()     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            r6.append(r1)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            java.lang.String r7 = "\n"
            r6.append(r7)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            r5.write(r6)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
        L_0x00ba:
            if (r1 != 0) goto L_0x008a
            java.io.File r1 = r9.cacheFile     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            boolean r1 = r1.delete()     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            if (r1 == 0) goto L_0x00d3
            java.io.File r1 = r9.cacheFile     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            boolean r0 = r0.renameTo(r1)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "OnDiskCache"
            java.lang.String r1 = "Couldn't rename temp cache file"
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00e8, OutOfMemoryError -> 0x00e6, all -> 0x00e4 }
        L_0x00d3:
            r4.close()     // Catch:{ IOException -> 0x00de }
            r5.flush()     // Catch:{ IOException -> 0x00de }
            r5.close()     // Catch:{ IOException -> 0x00de }
            goto L_0x018d
        L_0x00de:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x0197 }
            goto L_0x018d
        L_0x00e4:
            r10 = move-exception
            goto L_0x0132
        L_0x00e6:
            r0 = move-exception
            goto L_0x00f1
        L_0x00e8:
            r0 = move-exception
            goto L_0x00f5
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ec:
            r10 = move-exception
            goto L_0x018f
        L_0x00ef:
            r0 = move-exception
            r5 = r1
        L_0x00f1:
            r1 = r4
            goto L_0x0102
        L_0x00f3:
            r0 = move-exception
            r5 = r1
        L_0x00f5:
            r1 = r4
            goto L_0x0136
        L_0x00f7:
            r0 = move-exception
            r5 = r1
        L_0x00f9:
            r1 = r4
            goto L_0x0163
        L_0x00fc:
            r10 = move-exception
            r0 = r1
            goto L_0x0191
        L_0x0100:
            r0 = move-exception
            r5 = r1
        L_0x0102:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r4.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r6 = "OOM while deleting value for key "
            r4.append(r6)     // Catch:{ all -> 0x0130 }
            r4.append(r10)     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0130 }
            com.instabug.library.util.InstabugSDKLogger.e(r10, r0)     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x0122
            r1.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x0122
        L_0x0120:
            r10 = move-exception
            goto L_0x012c
        L_0x0122:
            if (r5 == 0) goto L_0x018d
            r5.flush()     // Catch:{ IOException -> 0x0120 }
            r5.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x018d
        L_0x012c:
            r10.printStackTrace()     // Catch:{ all -> 0x0197 }
            goto L_0x018d
        L_0x0130:
            r10 = move-exception
            r4 = r1
        L_0x0132:
            r1 = r5
            goto L_0x018f
        L_0x0134:
            r0 = move-exception
            r5 = r1
        L_0x0136:
            java.lang.String r4 = "OnDiskCache"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r6.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "JSONException went wrong while deleting value for key "
            r6.append(r7)     // Catch:{ all -> 0x0130 }
            r6.append(r10)     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x0130 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r10, r0)     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x0154
            r1.close()     // Catch:{ IOException -> 0x0152 }
            goto L_0x0154
        L_0x0152:
            r10 = move-exception
            goto L_0x015d
        L_0x0154:
            if (r5 == 0) goto L_0x018d
            r5.flush()     // Catch:{ IOException -> 0x0152 }
            r5.close()     // Catch:{ IOException -> 0x0152 }
            goto L_0x018d
        L_0x015d:
            r10.printStackTrace()     // Catch:{ all -> 0x0197 }
            goto L_0x018d
        L_0x0161:
            r0 = move-exception
            r5 = r1
        L_0x0163:
            java.lang.String r4 = "OnDiskCache"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r6.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "IOException went wrong while deleting value for key "
            r6.append(r7)     // Catch:{ all -> 0x0130 }
            r6.append(r10)     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x0130 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r10, r0)     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x0181
            r1.close()     // Catch:{ IOException -> 0x017f }
            goto L_0x0181
        L_0x017f:
            r10 = move-exception
            goto L_0x018a
        L_0x0181:
            if (r5 == 0) goto L_0x018d
            r5.flush()     // Catch:{ IOException -> 0x017f }
            r5.close()     // Catch:{ IOException -> 0x017f }
            goto L_0x018d
        L_0x018a:
            r10.printStackTrace()     // Catch:{ all -> 0x0197 }
        L_0x018d:
            monitor-exit(r3)     // Catch:{ all -> 0x0197 }
            return r2
        L_0x018f:
            r0 = r1
            r1 = r4
        L_0x0191:
            if (r1 == 0) goto L_0x019b
            r1.close()     // Catch:{ IOException -> 0x0199 }
            goto L_0x019b
        L_0x0197:
            r10 = move-exception
            goto L_0x01a8
        L_0x0199:
            r0 = move-exception
            goto L_0x01a4
        L_0x019b:
            if (r0 == 0) goto L_0x01a7
            r0.flush()     // Catch:{ IOException -> 0x0199 }
            r0.close()     // Catch:{ IOException -> 0x0199 }
            goto L_0x01a7
        L_0x01a4:
            r0.printStackTrace()     // Catch:{ all -> 0x0197 }
        L_0x01a7:
            throw r10     // Catch:{ all -> 0x0197 }
        L_0x01a8:
            monitor-exit(r3)     // Catch:{ all -> 0x0197 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.delete(java.lang.String):com.instabug.library.internal.storage.cache.Cacheable");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2 A[SYNTHETIC, Splitter:B:48:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3 A[SYNTHETIC, Splitter:B:58:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0101 A[SYNTHETIC, Splitter:B:66:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012b A[SYNTHETIC, Splitter:B:77:0x012b] */
    public V get(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x000b
            java.lang.String r8 = "OnDiskCache"
            java.lang.String r1 = "Key equal null"
            com.instabug.library.util.InstabugSDKLogger.d(r8, r1)
            return r0
        L_0x000b:
            java.io.File r1 = r7.cacheFile
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x001b
            java.lang.String r8 = "OnDiskCache"
            java.lang.String r1 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.d(r8, r1)
            return r0
        L_0x001b:
            java.lang.Class<V> r1 = r7.VClass     // Catch:{ InstantiationException -> 0x003c, IllegalAccessException -> 0x0024 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ InstantiationException -> 0x003c, IllegalAccessException -> 0x0024 }
            com.instabug.library.internal.storage.cache.Cacheable r1 = (com.instabug.library.internal.storage.cache.Cacheable) r1     // Catch:{ InstantiationException -> 0x003c, IllegalAccessException -> 0x0024 }
            goto L_0x0054
        L_0x0024:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IllegalAccessException went wrong while fetching value for key "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "OnDiskCache"
            com.instabug.library.util.InstabugSDKLogger.e(r3, r2, r1)
            goto L_0x0053
        L_0x003c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "InstantiationException happened while fetching value for key "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "OnDiskCache"
            com.instabug.library.util.InstabugSDKLogger.e(r3, r2, r1)
        L_0x0053:
            r1 = r0
        L_0x0054:
            java.io.File r2 = r7.cacheFile
            monitor-enter(r2)
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            java.io.File r6 = r7.cacheFile     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            java.nio.charset.Charset r6 = r7.charset     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00e7, JSONException -> 0x00c9, OutOfMemoryError -> 0x00a6, all -> 0x00a3 }
        L_0x006a:
            java.lang.String r4 = r3.readLine()     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f, OutOfMemoryError -> 0x009d }
            java.lang.String r5 = r7.getKey(r4)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f, OutOfMemoryError -> 0x009d }
            java.lang.String r6 = r7.getValue(r4)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f, OutOfMemoryError -> 0x009d }
            if (r5 == 0) goto L_0x0093
            boolean r5 = r5.equals(r8)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f, OutOfMemoryError -> 0x009d }
            if (r5 == 0) goto L_0x0093
            if (r1 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x0093
            r1.fromJson(r6)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f, OutOfMemoryError -> 0x009d }
            r3.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r8 = move-exception
            java.lang.String r0 = "OnDiskCache"
            java.lang.String r3 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.e(r0, r3, r8)     // Catch:{ all -> 0x0138 }
        L_0x0091:
            monitor-exit(r2)     // Catch:{ all -> 0x0138 }
            return r1
        L_0x0093:
            if (r4 != 0) goto L_0x006a
            r3.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x010c
        L_0x009a:
            r1 = move-exception
            goto L_0x0105
        L_0x009d:
            r1 = move-exception
            goto L_0x00a8
        L_0x009f:
            r1 = move-exception
            goto L_0x00cb
        L_0x00a1:
            r1 = move-exception
            goto L_0x00e9
        L_0x00a3:
            r8 = move-exception
            goto L_0x0129
        L_0x00a6:
            r1 = move-exception
            r3 = r0
        L_0x00a8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r4.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "OOM while fetching value for key "
            r4.append(r5)     // Catch:{ all -> 0x00c6 }
            r4.append(r8)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c6 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r1)     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x010c
        L_0x00c6:
            r8 = move-exception
            r0 = r3
            goto L_0x0129
        L_0x00c9:
            r1 = move-exception
            r3 = r0
        L_0x00cb:
            java.lang.String r4 = "OnDiskCache"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r5.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = "JSONException went wrong while fetching value for key "
            r5.append(r6)     // Catch:{ all -> 0x00c6 }
            r5.append(r8)     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c6 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r1)     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x010c
        L_0x00e7:
            r1 = move-exception
            r3 = r0
        L_0x00e9:
            java.lang.String r4 = "OnDiskCache"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r5.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = "IOException went wrong while fetching value for key "
            r5.append(r6)     // Catch:{ all -> 0x00c6 }
            r5.append(r8)     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c6 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r1)     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x010c
        L_0x0105:
            java.lang.String r3 = "OnDiskCache"
            java.lang.String r4 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r1)     // Catch:{ all -> 0x0138 }
        L_0x010c:
            java.lang.String r1 = "OnDiskCache"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r3.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r4 = "No value found for key "
            r3.append(r4)     // Catch:{ all -> 0x0138 }
            r3.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = ", returning null"
            r3.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0138 }
            com.instabug.library.util.InstabugSDKLogger.d(r1, r8)     // Catch:{ all -> 0x0138 }
            monitor-exit(r2)     // Catch:{ all -> 0x0138 }
            return r0
        L_0x0129:
            if (r0 == 0) goto L_0x0137
            r0.close()     // Catch:{ IOException -> 0x012f }
            goto L_0x0137
        L_0x012f:
            r0 = move-exception
            java.lang.String r1 = "OnDiskCache"
            java.lang.String r3 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.e(r1, r3, r0)     // Catch:{ all -> 0x0138 }
        L_0x0137:
            throw r8     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0138 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.get(java.lang.String):com.instabug.library.internal.storage.cache.Cacheable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r0 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        if (r0 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090 A[Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075, all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V put(java.lang.String r9, V r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x000b
            java.lang.String r9 = "OnDiskCache"
            java.lang.String r10 = "Key equal null"
            com.instabug.library.util.InstabugSDKLogger.d(r9, r10)
            return r0
        L_0x000b:
            if (r10 != 0) goto L_0x0015
            java.lang.String r9 = "OnDiskCache"
            java.lang.String r10 = "Value equal null"
            com.instabug.library.util.InstabugSDKLogger.d(r9, r10)
            return r0
        L_0x0015:
            java.io.File r1 = r8.cacheFile
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0025
            java.lang.String r9 = "OnDiskCache"
            java.lang.String r10 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.d(r9, r10)
            return r0
        L_0x0025:
            com.instabug.library.internal.storage.cache.Cacheable r1 = r8.get((java.lang.String) r9)
            if (r1 == 0) goto L_0x002e
            r8.delete((java.lang.String) r9)
        L_0x002e:
            java.io.File r2 = r8.cacheFile
            monitor-enter(r2)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075 }
            java.io.File r5 = r8.cacheFile     // Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075 }
            r6 = 1
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075 }
            java.nio.charset.Charset r5 = r8.charset     // Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075 }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0091, OutOfMemoryError -> 0x0075 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            java.io.Writer r4 = r0.append(r9)     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            java.lang.String r5 = ":"
            java.io.Writer r4 = r4.append(r5)     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            java.lang.String r5 = r10.toJson()     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            java.io.Writer r4 = r4.append(r5)     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            java.lang.String r5 = "\n"
            r4.append(r5)     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            r0.close()     // Catch:{ IOException -> 0x006e, JSONException -> 0x006b, OutOfMemoryError -> 0x0066, all -> 0x0063 }
            i0.j.e.c1.b.n(r3)     // Catch:{ all -> 0x00bf }
            goto L_0x00b4
        L_0x0063:
            r9 = move-exception
            r0 = r3
            goto L_0x00b9
        L_0x0066:
            r0 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0076
        L_0x006b:
            r9 = move-exception
            r0 = r3
            goto L_0x0092
        L_0x006e:
            r0 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0099
        L_0x0073:
            r9 = move-exception
            goto L_0x00b9
        L_0x0075:
            r3 = move-exception
        L_0x0076:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r4.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "OOM while while setting value for key "
            r4.append(r5)     // Catch:{ all -> 0x0073 }
            r4.append(r9)     // Catch:{ all -> 0x0073 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x0073 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0073 }
            com.instabug.library.util.InstabugSDKLogger.e(r9, r3)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b1
        L_0x0091:
            r9 = move-exception
        L_0x0092:
            r9.printStackTrace()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b1
        L_0x0098:
            r3 = move-exception
        L_0x0099:
            java.lang.String r4 = "OnDiskCache"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r5.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r6 = "Something went wrong while setting value for key "
            r5.append(r6)     // Catch:{ all -> 0x0073 }
            r5.append(r9)     // Catch:{ all -> 0x0073 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x0073 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r9, r3)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x00b4
        L_0x00b1:
            i0.j.e.c1.b.n(r0)     // Catch:{ all -> 0x00bf }
        L_0x00b4:
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00b8
            r10 = r1
        L_0x00b8:
            return r10
        L_0x00b9:
            if (r0 == 0) goto L_0x00be
            i0.j.e.c1.b.n(r0)     // Catch:{ all -> 0x00bf }
        L_0x00be:
            throw r9     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.put(java.lang.String, com.instabug.library.internal.storage.cache.Cacheable):com.instabug.library.internal.storage.cache.Cacheable");
    }

    public void delete() {
        File file = this.cacheFile;
        if (file != null && file.exists()) {
            InstabugSDKLogger.d(TAG, "Cache file  exist");
            synchronized (this.cacheFile) {
                this.cacheFile.delete();
            }
        }
    }
}
