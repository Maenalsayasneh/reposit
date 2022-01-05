package com.instabug.library.n.b.a;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MemoryUsage */
public class c extends f {
    public long d;
    public long q;

    public c(long j) {
        this.d = j;
    }

    public static Collection<f> c(JSONArray jSONArray) throws JSONException {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            c cVar = new c(jSONObject.getLong("v"));
            if (jSONObject.has("total")) {
                cVar.q = jSONObject.getLong("total");
            }
            cVar.c = jSONObject.getDouble("t");
            concurrentLinkedQueue.add(cVar);
        }
        return concurrentLinkedQueue;
    }

    public JSONObject a() throws JSONException {
        JSONObject b = b(Long.valueOf(this.d));
        long j = this.q;
        if (j > 0) {
            b.put("total", j);
        }
        return b;
    }

    public c(long j, long j2) {
        this.d = j;
        this.q = j2;
    }
}
