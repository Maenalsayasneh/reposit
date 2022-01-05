package com.instabug.crash;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.anr.e.a;
import com.instabug.anr.network.InstabugAnrUploaderService;
import com.instabug.crash.network.InstabugCrashesUploaderService;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class CrashPlugin extends Plugin implements com.instabug.anr.a {
    /* access modifiers changed from: private */
    public com.instabug.anr.b anrDetectorThread;
    public k0.b.w.a subscribe;

    public class a implements Runnable {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        public void run() {
            Context context = this.c;
            synchronized (com.instabug.crash.d.a.class) {
                com.instabug.crash.d.a.a = new com.instabug.crash.d.a();
                com.instabug.crash.d.c.a = new com.instabug.crash.d.c(context);
            }
            CrashPlugin.this.checkEncryptorVersion();
            CrashPlugin.this.subscribeOnSDKEvents();
        }
    }

    public class b implements k0.b.y.d<SDKCoreEvent> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            String type = sDKCoreEvent.getType();
            type.hashCode();
            char c2 = 65535;
            boolean z = false;
            switch (type.hashCode()) {
                case -290659267:
                    if (type.equals(SDKCoreEvent.Feature.TYPE_FEATURES)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3599307:
                    if (type.equals("user")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1843485230:
                    if (type.equals(SDKCoreEvent.Network.TYPE_NETWORK)) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    if (!sDKCoreEvent.getValue().equals(SDKCoreEvent.Feature.VALUE_FETCHED) && !sDKCoreEvent.getValue().equals(SDKCoreEvent.Feature.VALUE_UPDATED)) {
                        return;
                    }
                    if (CrashPlugin.this.isAnrEnabled()) {
                        if (CrashPlugin.this.anrDetectorThread == null) {
                            CrashPlugin.this.startAnrDetection();
                            return;
                        }
                        return;
                    } else if (CrashPlugin.this.anrDetectorThread != null) {
                        CrashPlugin.this.anrDetectorThread.interrupt();
                        com.instabug.anr.b unused = CrashPlugin.this.anrDetectorThread = null;
                        return;
                    } else {
                        return;
                    }
                case 1:
                    if (sDKCoreEvent.getValue().equals(SDKCoreEvent.User.VALUE_LOGGED_OUT)) {
                        CrashPlugin.this.clearUserActivities();
                        return;
                    }
                    return;
                case 2:
                    if (sDKCoreEvent.getValue().equals(SDKCoreEvent.Network.VALUE_ACTIVATED)) {
                        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.ENABLED) {
                            z = true;
                        }
                        if (z) {
                            CrashPlugin.this.startCrashesUploaderService();
                        }
                        if (CrashPlugin.this.isAnrEnabled()) {
                            CrashPlugin.this.startAnrsUploaderService();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context c;

        public c(Context context) {
            this.c = context;
        }

        public void run() {
            if (this.c != null) {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                int queryNumEntries = (int) openDatabase.queryNumEntries(InstabugDbContract.AnrEntry.TABLE_NAME);
                openDatabase.close();
                if (queryNumEntries > 0 && NetworkManager.isOnline(this.c)) {
                    Intent intent = new Intent(this.c, InstabugAnrUploaderService.class);
                    Context context = this.c;
                    int i = InstabugAnrUploaderService.c;
                    InstabugBackgroundService.enqueueInstabugWork(context, InstabugAnrUploaderService.class, 24680, intent);
                }
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ Context c;

        public d(Context context) {
            this.c = context;
        }

        public void run() {
            int i;
            if (this.c != null) {
                synchronized (i0.j.c.l.a.class) {
                    SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                    try {
                        i = (int) openDatabase.queryNumEntries(InstabugDbContract.CrashEntry.TABLE_NAME);
                        openDatabase.close();
                    } catch (Exception e) {
                        try {
                            InstabugSDKLogger.e("CrashReportsDbHelper", e.toString(), e);
                            i = 0;
                        } finally {
                            openDatabase.close();
                        }
                    }
                }
                if (i > 0) {
                    if (i > 100) {
                        CrashPlugin.this.trimCrashes();
                    }
                    if (NetworkManager.isOnline(this.c)) {
                        Context context = this.c;
                        Intent intent = new Intent(this.c, InstabugCrashesUploaderService.class);
                        int i2 = InstabugCrashesUploaderService.c;
                        InstabugBackgroundService.enqueueInstabugWork(context, InstabugCrashesUploaderService.class, 2582, intent);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void checkEncryptorVersion() {
        boolean z;
        synchronized (com.instabug.crash.d.a.a()) {
            if (com.instabug.crash.d.c.a() == null) {
                z = false;
            } else {
                z = com.instabug.crash.d.c.a().b.getBoolean("ib_first_run_after_updating_encryptor", true);
            }
        }
        if (z) {
            synchronized (i0.j.c.l.a.class) {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                openDatabase.beginTransaction();
                try {
                    openDatabase.delete(InstabugDbContract.CrashEntry.TABLE_NAME, (String) null, (String[]) null);
                    openDatabase.setTransactionSuccessful();
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
            synchronized (com.instabug.crash.d.a.a()) {
                if (com.instabug.crash.d.c.a() != null) {
                    com.instabug.crash.d.c.a().b.edit().putBoolean("ib_first_run_after_updating_encryptor", false).apply();
                }
            }
        }
    }

    private void setExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    /* access modifiers changed from: private */
    public void startAnrsUploaderService() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                PoolProvider.postIOTask(new c(context));
            } else {
                InstabugSDKLogger.e(this, "Couldn't start ANRs uploader Service because Context is null.");
            }
        } else {
            InstabugSDKLogger.e(this, "Couldn't start ANRs uploader Service because Context WeakReference is null.");
        }
    }

    /* access modifiers changed from: private */
    public void startCrashesUploaderService() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                PoolProvider.postIOTask(new d(context));
            } else {
                InstabugSDKLogger.e(this, "Context is null.");
            }
        } else {
            InstabugSDKLogger.e(this, "Context WeakReference is null.");
        }
    }

    /* access modifiers changed from: private */
    public void trimCrashes() {
        if (Instabug.getApplicationContext() != null) {
            List<com.instabug.crash.c.a> q = i0.j.c.l.a.q(Instabug.getApplicationContext());
            while (true) {
                ArrayList arrayList = (ArrayList) q;
                if (arrayList.size() > 100) {
                    com.instabug.crash.c.a aVar = (com.instabug.crash.c.a) arrayList.get(0);
                    State state = aVar.y;
                    if (!(state == null || state.getUri() == null)) {
                        i0.j.c.l.a.x(aVar.y.getUri());
                    }
                    i0.j.c.l.a.C(aVar);
                    i0.j.c.l.a.F(aVar.c);
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        }
    }

    public void clearUserActivities() {
        if (com.instabug.crash.d.c.a() != null) {
            com.instabug.crash.d.c.a().b.edit().putLong("last_crash_time", 0).apply();
        }
    }

    public com.instabug.anr.b getAnrDetectorThread() {
        return this.anrDetectorThread;
    }

    public long getLastActivityTime() {
        long j;
        synchronized (com.instabug.crash.d.a.a()) {
            if (com.instabug.crash.d.c.a() == null) {
                j = -1;
            } else {
                j = com.instabug.crash.d.c.a().b.getLong("last_crash_time", 0);
            }
        }
        return j;
    }

    public k0.b.w.a getSDKEventSubscriber() {
        return SDKCoreEventSubscriber.subscribe(new b());
    }

    public void init(Context context) {
        super.init(context);
        setExceptionHandler();
    }

    public boolean isAnrEnabled() {
        if (!(InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.ENABLED) || !isAnrStateEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isAnrStateEnabled() {
        return InstabugCore.getFeatureState(Feature.ANR_REPORTING) == Feature.State.ENABLED;
    }

    public void onAnrDetected(com.instabug.anr.e.a aVar) {
        aVar.e = 1;
        synchronized (com.instabug.anr.d.a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ANR_MAIN_THREAD_DATA, aVar.b);
                contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ANR_REST_OF_THREADS_DATA, aVar.c);
                contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ANR_UPLOAD_STATE, Integer.valueOf(aVar.e));
                State state = aVar.g;
                if (!(state == null || state.getUri() == null)) {
                    contentValues.put("state", aVar.g.getUri().toString());
                }
                contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ID, aVar.a);
                contentValues.put(InstabugDbContract.AnrEntry.COLUMN_ANR_LONG_MESSAGE, aVar.h);
                for (Attachment next : aVar.d) {
                    long insert = AttachmentsDbHelper.insert(next, aVar.a);
                    if (insert != -1) {
                        next.setId(insert);
                    }
                }
                openDatabase.insert(InstabugDbContract.AnrEntry.TABLE_NAME, (String) null, contentValues);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        Context appContext = getAppContext();
        if (appContext != null && NetworkManager.isOnline(appContext)) {
            Intent intent = new Intent(appContext, InstabugAnrUploaderService.class);
            int i = InstabugAnrUploaderService.c;
            InstabugBackgroundService.enqueueInstabugWork(appContext, InstabugAnrUploaderService.class, 24680, intent);
        }
    }

    public void sleep() {
        com.instabug.anr.b bVar = this.anrDetectorThread;
        if (bVar != null) {
            bVar.interrupt();
            this.anrDetectorThread = null;
        }
    }

    public void start(Context context) {
        PoolProvider.postIOTaskWithCheck(new a(context));
    }

    public void startAnrDetection() {
        if (Instabug.isEnabled()) {
            com.instabug.anr.b bVar = new com.instabug.anr.b(this, new a.C0091a(), new com.instabug.anr.c());
            this.anrDetectorThread = bVar;
            bVar.start();
        }
    }

    public void stop() {
        k0.b.w.a aVar = this.subscribe;
        if (aVar != null) {
            aVar.dispose();
        }
        synchronized (com.instabug.crash.d.a.class) {
            synchronized (com.instabug.crash.d.b.class) {
            }
            com.instabug.crash.d.c.a = null;
            com.instabug.crash.d.a.a = null;
        }
        this.anrDetectorThread = null;
    }

    public void subscribeOnSDKEvents() {
        this.subscribe = getSDKEventSubscriber();
    }

    public void wake() {
        if (isAnrEnabled() && this.anrDetectorThread == null) {
            startAnrDetection();
        }
    }
}
