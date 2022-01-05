package com.instabug.library.logging;

import android.content.Context;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.core.eventbus.UserEventsEventBus;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.user.UserEvent;
import com.instabug.library.user.UserEventParam;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.Action;
import com.instabug.library.util.memory.MemoryGuard;
import com.instabug.library.util.memory.MemoryUtils;
import com.instabug.library.util.memory.predicate.MemoryNotLowPredicate;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class InstabugUserEventLogger {
    private static final int USER_EVENT_COUNT_LIMIT = 1000;
    private static volatile InstabugUserEventLogger instabugUserEventLogger;
    /* access modifiers changed from: private */
    public List<UserEvent> userEvents = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public ConcurrentHashMap<String, Integer> userEventsCount = new ConcurrentHashMap<>();

    public class a implements Runnable {
        public final /* synthetic */ String c;
        public final /* synthetic */ UserEventParam[] d;

        public a(String str, UserEventParam[] userEventParamArr) {
            this.c = str;
            this.d = userEventParamArr;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("logUserEvent", i0.d.a.a.a.O("eventIdentifier", String.class), i0.d.a.a.a.O("userEventParams", UserEventParam.class));
            if (z.j().h(Feature.USER_EVENTS) == Feature.State.ENABLED) {
                UserEvent date = new UserEvent().setEventIdentifier(this.c).setDate(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
                for (UserEventParam addParam : this.d) {
                    date.addParam(addParam);
                }
                if (InstabugUserEventLogger.this.userEvents.size() >= 1000) {
                    InstabugUserEventLogger.this.userEvents.remove(0);
                }
                InstabugUserEventLogger.this.userEvents.add(date);
                Integer num = (Integer) InstabugUserEventLogger.this.userEventsCount.get(this.c);
                if (num != null) {
                    InstabugUserEventLogger.this.userEventsCount.put(this.c, Integer.valueOf(num.intValue() + 1));
                } else {
                    InstabugUserEventLogger.this.userEventsCount.put(this.c, 1);
                }
                InstabugUserEventLogger.this.runInsertionHandler(i0.j.e.c1.b.C(), !i0.j.e.c1.b.G());
            }
        }
    }

    public class b implements Action {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public void onAffirmed() {
            try {
                for (Map.Entry entry : InstabugUserEventLogger.this.userEventsCount.entrySet()) {
                    InstabugUserEventLogger.this.incrementEventLoggingCount((String) entry.getKey(), ((Integer) entry.getValue()).intValue(), this.a, this.b);
                }
                InstabugUserEventLogger.this.userEventsCount.clear();
            } catch (OutOfMemoryError e) {
                if (e.getMessage() != null) {
                    InstabugSDKLogger.e(InstabugUserEventLogger.class, e.getMessage());
                }
            }
        }

        public void onDenied() throws Throwable {
            InstabugSDKLogger.e(this, "Failed to update user events due to low memory");
        }
    }

    private InstabugUserEventLogger() {
    }

    public static InstabugUserEventLogger getInstance() {
        if (instabugUserEventLogger == null) {
            instabugUserEventLogger = new InstabugUserEventLogger();
        }
        return instabugUserEventLogger;
    }

    /* access modifiers changed from: private */
    public void incrementEventLoggingCount(String str, int i, String str2, boolean z) {
        i0.j.c.l.a.d(str, i0.j.c.l.a.G(str, i0.j.e.c1.b.C()) + i, str2, z);
        UserEventsEventBus.getInstance().post(new UserEvent().setEventIdentifier(str));
    }

    /* access modifiers changed from: private */
    public void runInsertionHandler(String str, boolean z) {
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null && !MemoryUtils.isLowMemory(applicationContext)) {
            MemoryGuard.from(applicationContext).withPredicate(new MemoryNotLowPredicate()).doAction(new b(str, z));
        }
    }

    public void clearAll() throws IllegalStateException {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("clearAll", new Api.Parameter[0]);
        this.userEvents.clear();
    }

    public void clearLoggingData() throws IllegalStateException {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("clearLoggingData", new Api.Parameter[0]);
        String C = i0.j.e.c1.b.C();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        String[] strArr = {C};
        try {
            openDatabase.beginTransaction();
            openDatabase.delete(InstabugDbContract.UserEventEntry.TABLE_NAME, "uuid=?", strArr);
            openDatabase.setTransactionSuccessful();
        } finally {
            openDatabase.endTransaction();
            openDatabase.close();
        }
    }

    public int getLoggingEventCount(String str) {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("getLoggingEventCount", i0.d.a.a.a.O("userEventIdentifier", String.class));
        return i0.j.c.l.a.G(str, i0.j.e.c1.b.C());
    }

    public List<UserEvent> getUserEvents() throws IllegalStateException {
        return this.userEvents;
    }

    public synchronized void logUserEvent(String str, UserEventParam... userEventParamArr) {
        PoolProvider.getUserEventLoggerExecuter().execute(new a(str, userEventParamArr));
    }
}
