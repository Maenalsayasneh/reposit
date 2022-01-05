package com.instabug.library.model;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import i0.j.e.q0.c;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkLog {
    public static final String CONTENT_TYPE = "content-type";
    public static final String HTML = "text/html";
    public static final String JSON = "application/json";
    public static final String LIMIT_ERROR = "{\"InstabugNetworkLog Error\":\"Response body exceeded limit\"}";
    public static final String PLAIN_TEXT = "text/plain";
    public static final String PROTOBUF = "application/protobuf";
    public static final int SQL_RECORD_CHAR_LIMIT = 500000;
    public static final String XML_1 = "application/xml";
    public static final String XML_2 = "text/xml";
    private String date;
    private String method;
    private String request;
    private String requestHeaders;
    private String response;
    private int responseCode;
    private String responseHeaders;
    private long totalDuration;
    private String url;

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkLog)) {
            return false;
        }
        NetworkLog networkLog = (NetworkLog) obj;
        if (this.responseCode != networkLog.responseCode) {
            return false;
        }
        String str = this.date;
        if (str == null ? networkLog.date != null : !str.equals(networkLog.date)) {
            return false;
        }
        String str2 = this.url;
        if (str2 == null ? networkLog.url != null : !str2.equals(networkLog.url)) {
            return false;
        }
        String str3 = this.request;
        if (str3 == null ? networkLog.request != null : !str3.equals(networkLog.request)) {
            return false;
        }
        String str4 = this.response;
        if (str4 == null ? networkLog.response != null : !str4.equals(networkLog.response)) {
            return false;
        }
        String str5 = this.method;
        if (str5 == null ? networkLog.method != null : !str5.equals(networkLog.method)) {
            return false;
        }
        if (this.totalDuration != networkLog.totalDuration) {
            return false;
        }
        String str6 = this.responseHeaders;
        if (str6 == null ? networkLog.responseHeaders != null : !str6.equals(networkLog.responseHeaders)) {
            return false;
        }
        String str7 = this.requestHeaders;
        String str8 = networkLog.requestHeaders;
        if (str7 != null) {
            return str7.equals(str8);
        }
        if (str8 == null) {
            return true;
        }
        return false;
    }

    public String getDate() {
        return this.date;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRequest() {
        return this.request;
    }

    public String getRequestHeaders() {
        return this.requestHeaders;
    }

    public String getResponse() {
        return this.response;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getResponseHeaders() {
        return this.responseHeaders;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.date;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.request;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.response;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.method;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.responseCode) * 31;
        String str6 = this.responseHeaders;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.requestHeaders;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return Long.valueOf(this.totalDuration).hashCode() + ((hashCode6 + i) * 31);
    }

    public long insert() {
        long j;
        synchronized (c.class) {
            InstabugSDKLogger.d("InstabugNetworkLogDbHelper", "insert");
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("url", getUrl());
                contentValues.put(InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST, getRequest());
                contentValues.put("method", getMethod());
                contentValues.put(InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE, getResponse());
                contentValues.put("status", "" + getResponseCode());
                contentValues.put("date", getDate());
                contentValues.put(InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS, getRequestHeaders());
                contentValues.put("response_headers", getResponseHeaders());
                contentValues.put(InstabugDbContract.NetworkLogEntry.COLUMN_NETWORK_TIME, Long.valueOf(getTotalDuration()));
                j = openDatabase.insert(InstabugDbContract.NetworkLogEntry.TABLE_NAME, (String) null, contentValues);
                openDatabase.close();
            } catch (Exception e) {
                try {
                    InstabugSDKLogger.e("InstabugNetworkLogDbHelper", e.getMessage(), e);
                    j = -1;
                } finally {
                    openDatabase.close();
                }
            }
        }
        return j;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRequest(String str) {
        this.request = str;
    }

    public void setRequestHeaders(String str) {
        this.requestHeaders = str;
    }

    public void setResponse(String str) {
        this.response = str;
    }

    public void setResponseCode(int i) {
        this.responseCode = i;
    }

    public void setResponseHeaders(String str) {
        this.responseHeaders = str;
    }

    public void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("date", (Object) getDate());
        jSONObject.put("method", (Object) getMethod());
        jSONObject.put("status", getResponseCode());
        jSONObject.put("url", (Object) getUrl());
        jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_NETWORK_TIME, getTotalDuration());
        try {
            jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS, (Object) new JSONObject(getRequestHeaders()));
        } catch (Exception unused) {
            jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS, (Object) getRequestHeaders());
        }
        try {
            jSONObject.put("response_headers", (Object) new JSONObject(getResponseHeaders()));
        } catch (Exception unused2) {
            jSONObject.put("response_headers", (Object) getResponseHeaders());
        }
        try {
            jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST, (Object) new JSONObject(getRequest()));
        } catch (Exception unused3) {
            jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST, (Object) getRequest());
        }
        try {
            jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE, (Object) new JSONObject(getResponse()));
        } catch (Exception unused4) {
            jSONObject.put(InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE, (Object) getResponse());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder P0 = a.P0("NetworkLog{date='");
        a.r(P0, this.date, '\'', ", url='");
        a.r(P0, this.url, '\'', ", request='");
        a.r(P0, this.request, '\'', ", method='");
        a.r(P0, this.method, '\'', ", responseCode=");
        P0.append(this.responseCode);
        P0.append(", headers='");
        a.r(P0, this.requestHeaders, '\'', ", response='");
        a.r(P0, this.response, '\'', ", response_headers='");
        a.r(P0, this.responseHeaders, '\'', ", totalDuration='");
        P0.append(this.totalDuration);
        P0.append('\'');
        P0.append('}');
        return P0.toString();
    }
}
