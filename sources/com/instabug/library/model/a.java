package com.instabug.library.model;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConsoleLog */
public class a implements Cacheable, Serializable {
    public String c;
    public long d;

    public static long a(String str) {
        try {
            Date parse = new SimpleDateFormat(InstabugLog.LOG_MESSAGE_DATE_FORMAT, Locale.US).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            Calendar instance2 = Calendar.getInstance();
            instance2.set(2, instance.get(2));
            instance2.set(5, instance.get(5));
            instance2.set(11, instance.get(11));
            instance2.set(12, instance.get(12));
            instance2.set(13, instance.get(13));
            instance2.set(14, instance.get(14));
            return instance2.getTimeInMillis();
        } catch (ParseException e) {
            StringBuilder T0 = i0.d.a.a.a.T0("parsing error happened when trying to parse Console log message date: ", str, ", error message: ");
            T0.append(e.getMessage());
            InstabugSDKLogger.w("ConsoleLog", T0.toString());
            return 0;
        }
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("timestamp")) {
            if (StringUtility.isNumeric(jSONObject.getString("timestamp"))) {
                this.d = jSONObject.getLong("timestamp");
            } else {
                this.d = a(jSONObject.getString("timestamp"));
            }
        }
        if (jSONObject.has(InstabugDbContract.BugEntry.COLUMN_MESSAGE)) {
            this.c = jSONObject.getString(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", this.d);
        jSONObject.put(InstabugDbContract.BugEntry.COLUMN_MESSAGE, (Object) this.c);
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ConsoleLog{timeStamp='");
        P0.append(this.d);
        P0.append('\'');
        P0.append(", message='");
        P0.append(this.c);
        P0.append('\'');
        P0.append('}');
        return P0.toString();
    }
}
