package i0.j.a.d.a.c;

import android.content.ContentValues;
import com.instabug.apm.model.APMNetworkLog;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;

/* compiled from: DanglingNetworkLogCacheHandlerImpl */
public class b implements a {
    public final DatabaseManager a;

    public b(DatabaseManager databaseManager) {
        this.a = databaseManager;
    }

    public final ContentValues a(APMNetworkLog aPMNetworkLog) {
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
        if (aPMNetworkLog.getRequestHeaders() != null) {
            contentValues.put("request_headers", aPMNetworkLog.getRequestHeaders());
        }
        if (aPMNetworkLog.getRequestContentType() != null) {
            contentValues.put("request_content_type", aPMNetworkLog.getRequestContentType());
        }
        if (aPMNetworkLog.getResponseHeaders() != null) {
            contentValues.put("response_headers", aPMNetworkLog.getResponseHeaders());
        }
        if (aPMNetworkLog.getResponseContentType() != null) {
            contentValues.put("response_content_type", aPMNetworkLog.getResponseContentType());
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
        contentValues.put("executed_on_background", Boolean.valueOf(aPMNetworkLog.executedInBackground()));
        return contentValues;
    }
}
