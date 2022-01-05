package com.instabug.library.n.b.a;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConnectivityState */
public class b extends f {
    public String d;
    public String q;

    public static Collection<f> c(JSONArray jSONArray) throws JSONException {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            b bVar = new b();
            bVar.c = jSONObject.getDouble("t");
            bVar.d = jSONObject.getString("v");
            if (jSONObject.has("name")) {
                bVar.q = jSONObject.getString("name");
            }
            concurrentLinkedQueue.add(bVar);
        }
        return concurrentLinkedQueue;
    }

    public JSONObject a() throws JSONException {
        JSONObject b = b(this.d);
        String str = this.q;
        if (str != null) {
            b.put("name", (Object) str);
        }
        return b;
    }
}
