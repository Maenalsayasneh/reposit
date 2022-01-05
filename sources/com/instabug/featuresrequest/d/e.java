package com.instabug.featuresrequest.d;

import com.instabug.featuresrequest.d.b;
import com.instabug.featuresrequest.d.f;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StatusChange */
public class e extends f {
    public String Y1 = "#000000";
    public b.a q;
    public b.a x;
    public String y = "#000000";

    public e() {
        b.a aVar = b.a.Open;
        this.q = aVar;
        this.x = aVar;
    }

    public void fromJson(String str) throws JSONException {
        InstabugSDKLogger.addVerboseLog("StatusChange", str);
        JSONObject jSONObject = new JSONObject(str);
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
        if (jSONObject.has("old_status")) {
            int i = jSONObject.getInt("old_status");
            if (i == 0) {
                this.q = b.a.Open;
            } else if (i == 1) {
                this.q = b.a.Planned;
            } else if (i == 2) {
                this.q = b.a.InProgress;
            } else if (i == 3) {
                this.q = b.a.Completed;
            } else if (i == 4) {
                this.q = b.a.MaybeLater;
            }
        }
        if (jSONObject.has("new_status")) {
            int i2 = jSONObject.getInt("new_status");
            if (i2 == 0) {
                this.x = b.a.Open;
            } else if (i2 == 1) {
                this.x = b.a.Planned;
            } else if (i2 == 2) {
                this.x = b.a.InProgress;
            } else if (i2 == 3) {
                this.x = b.a.Completed;
            } else if (i2 == 4) {
                this.x = b.a.MaybeLater;
            }
        }
        if (jSONObject.has("new_status_color")) {
            this.y = jSONObject.getString("new_status_color");
        }
        if (jSONObject.has("old_status_color")) {
            this.Y1 = jSONObject.getString("old_status_color");
        }
    }

    public String toJson() throws JSONException {
        return new JSONObject().put("created_at", this.d).put("type", (Object) this.c).put("old_status", this.q.a()).put("new_status", this.x.a()).put("old_status_color", (Object) this.Y1).put("new_status_color", (Object) this.y).toString();
    }
}
