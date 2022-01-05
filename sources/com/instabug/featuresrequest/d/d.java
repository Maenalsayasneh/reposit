package com.instabug.featuresrequest.d;

import android.annotation.SuppressLint;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NewComment */
public class d extends a {
    @SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
    public String d2;
    public long e2;

    public d(long j, String str, String str2, String str3) {
        this.e2 = j;
        this.d = System.currentTimeMillis() / 1000;
        this.Y1 = str2;
        this.d2 = str3;
        this.x = str;
    }

    public void fromJson(String str) throws JSONException {
        super.fromJson(str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("email")) {
            this.d2 = jSONObject.getString("email");
        }
        if (jSONObject.has("feature_id")) {
            this.e2 = jSONObject.getLong("feature_id");
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject(super.toJson());
        jSONObject.put("feature_id", this.e2);
        jSONObject.put("email", (Object) this.d2);
        return jSONObject.toString();
    }
}
