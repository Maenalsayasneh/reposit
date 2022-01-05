package com.instabug.featuresrequest.d;

import android.annotation.SuppressLint;
import com.instabug.featuresrequest.d.f;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: Comment */
public class a extends f {
    public String Y1;
    public String Z1;
    public String a2;
    public boolean b2 = true;
    public String c2;
    public long q;
    public String x;
    public boolean y;

    public void fromJson(String str) throws JSONException {
        InstabugSDKLogger.addVerboseLog("Comment", str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.q = jSONObject.getLong("id");
        }
        if (jSONObject.has("created_at")) {
            this.d = jSONObject.getLong("created_at");
        }
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -144558306) {
                if (hashCode == 950398559 && string.equals("comment")) {
                    c = 1;
                }
            } else if (string.equals("state_change")) {
                c = 2;
            }
            if (c != 2) {
                this.c = f.a.COMMENT;
            } else {
                this.c = f.a.STATUS_CHANE;
            }
        }
        if (jSONObject.has("uuid")) {
            this.a2 = jSONObject.getString("uuid");
        }
        if (jSONObject.has("body")) {
            this.x = jSONObject.getString("body");
        }
        if (jSONObject.has("admin")) {
            this.y = jSONObject.getBoolean("admin");
        }
        if (jSONObject.has("commenter_name")) {
            this.Y1 = jSONObject.getString("commenter_name");
        }
        if (jSONObject.has("avatar")) {
            this.Z1 = jSONObject.getString("avatar");
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.q).put("created_at", this.d).put("type", (Object) this.c);
        jSONObject.put("uuid", (Object) this.a2);
        jSONObject.put("body", (Object) this.x);
        jSONObject.put("admin", this.y);
        jSONObject.put("commenter_name", (Object) this.Y1);
        jSONObject.put("avatar", (Object) this.Z1);
        return jSONObject.toString();
    }
}
