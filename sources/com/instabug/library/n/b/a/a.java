package com.instabug.library.n.b.a;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BatteryState */
public class a extends f {
    public float d;
    public boolean q;

    public a(float f, boolean z) {
        this.d = f;
        this.q = z;
    }

    public JSONObject a() throws JSONException {
        JSONObject b = b(Float.valueOf(this.d));
        b.put("plugged", this.q);
        return b;
    }
}
