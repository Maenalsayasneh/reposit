package i0.j.a.d.a.c;

import android.content.ContentValues;
import com.instabug.apm.model.APMNetworkLog;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.g.a;

/* compiled from: NetworkLogCacheHandlerImpl */
public class d implements c {
    public DatabaseManager a = a.p();

    public int a(String str, long j) {
        if (this.a == null) {
            return -1;
        }
        String o02 = i0.d.a.a.a.o0("session_id = ? AND log_id NOT IN (", "SELECT log_id FROM apm_network_log where session_id = ? ORDER BY log_id DESC LIMIT ?", ")");
        String[] strArr = {str, str, String.valueOf(j)};
        SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
        int delete = openDatabase.delete(InstabugDbContract.APMNetworkLogEntry.TABLE_NAME, o02, strArr);
        openDatabase.close();
        return delete;
    }

    public long b(String str, APMNetworkLog aPMNetworkLog) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager == null) {
            return -1;
        }
        SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
        ContentValues d = d(aPMNetworkLog);
        d.put("session_id", str);
        long insert = openDatabase.insert(InstabugDbContract.APMNetworkLogEntry.TABLE_NAME, (String) null, d);
        openDatabase.close();
        return insert;
    }

    public void c(long j) {
        if (this.a != null) {
            i0.d.a.a.a.o(this.a, i0.d.a.a.a.l0("delete from apm_network_log where log_id not in ( select log_id from apm_network_log order by log_id desc limit ", j, " )"));
        }
    }

    public final ContentValues d(APMNetworkLog aPMNetworkLog) {
        ContentValues contentValues = new ContentValues();
        if (aPMNetworkLog.getStartTime() != null) {
            contentValues.put("start_time", aPMNetworkLog.getStartTime());
        }
        if (aPMNetworkLog.getUrl() != null) {
            contentValues.put("url", aPMNetworkLog.getUrl());
        }
        if (aPMNetworkLog.getMethod() != null) {
            contentValues.put("method", aPMNetworkLog.getMethod());
        }
        if (aPMNetworkLog.getRequestContentType() != null) {
            contentValues.put("request_content_type", aPMNetworkLog.getRequestContentType());
        }
        if (aPMNetworkLog.getResponseContentType() != null) {
            contentValues.put("response_content_type", aPMNetworkLog.getResponseContentType());
        }
        if (aPMNetworkLog.getErrorMessage() != null) {
            contentValues.put("error_message", aPMNetworkLog.getErrorMessage());
        }
        if (aPMNetworkLog.getRadio() != null) {
            contentValues.put("radio", aPMNetworkLog.getRadio());
        }
        if (aPMNetworkLog.getCarrier() != null) {
            contentValues.put("carrier", aPMNetworkLog.getCarrier());
        }
        contentValues.put("duration", Long.valueOf(aPMNetworkLog.getTotalDuration()));
        contentValues.put("response_code", Integer.valueOf(aPMNetworkLog.getResponseCode()));
        contentValues.put("request_body_size", Long.valueOf(aPMNetworkLog.getRequestBodySize()));
        contentValues.put("response_body_size", Long.valueOf(aPMNetworkLog.getResponseBodySize()));
        if (aPMNetworkLog.getErrorMessage() != null) {
            contentValues.put("error_message", aPMNetworkLog.getErrorMessage());
        }
        if (aPMNetworkLog.getRadio() != null) {
            contentValues.put("radio", aPMNetworkLog.getRadio());
        }
        if (aPMNetworkLog.getCarrier() != null) {
            contentValues.put("carrier", aPMNetworkLog.getCarrier());
        }
        contentValues.put("executed_on_background", Integer.valueOf(aPMNetworkLog.executedInBackground() ? 1 : 0));
        return contentValues;
    }
}
