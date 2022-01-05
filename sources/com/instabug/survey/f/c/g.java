package com.instabug.survey.f.c;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.model.session.SessionParameter;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import com.instabug.library.util.filters.Filters;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Target */
public class g implements Cacheable, Serializable {
    public d Y1 = new d();
    public String Z1 = "and";
    public ArrayList<c> c = new ArrayList<>();
    public ArrayList<c> d = new ArrayList<>();
    public ArrayList<c> q = new ArrayList<>();
    public ArrayList<a> x = new ArrayList<>();
    public h y = new h();

    public static JSONObject a(g gVar) throws JSONException {
        return new JSONObject(gVar.toJson());
    }

    public static g b(String str) throws JSONException {
        g gVar = new g();
        gVar.fromJson(str);
        return gVar;
    }

    public ArrayList<c> c() {
        return (ArrayList) Filters.applyOn(this.c).apply(new i0.j.f.p.g()).thenGet();
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("primitive_types")) {
            this.c = c.a(jSONObject.getJSONArray("primitive_types"));
        }
        if (jSONObject.has(SessionParameter.CUSTOM_ATTRIBUTES)) {
            this.d = c.a(jSONObject.getJSONArray(SessionParameter.CUSTOM_ATTRIBUTES));
        }
        if (jSONObject.has("user_events")) {
            this.q = c.a(jSONObject.getJSONArray("user_events"));
        }
        if (jSONObject.has("events")) {
            this.x = a.a(jSONObject.getJSONArray("events"));
        }
        if (jSONObject.has("operator")) {
            this.Z1 = jSONObject.getString("operator");
        }
        if (jSONObject.has("trigger")) {
            String jSONObject2 = jSONObject.getJSONObject("trigger").toString();
            h hVar = new h();
            JSONObject jSONObject3 = new JSONObject(jSONObject2);
            hVar.d = jSONObject3.optInt("trigger_type", 0);
            hVar.x = jSONObject3.optInt("trigger_after", InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT);
            if (jSONObject3.has("user_event")) {
                hVar.q = jSONObject3.getString("user_event");
            }
            if (jSONObject3.has("trigger_status")) {
                hVar.c = jSONObject3.getInt("trigger_status");
            }
            if (jSONObject3.has("trigger_after")) {
                hVar.x = jSONObject3.getInt("trigger_after");
            }
            this.y = hVar;
        }
        if (jSONObject.has("frequency")) {
            String jSONObject4 = jSONObject.getJSONObject("frequency").toString();
            d dVar = new d();
            JSONObject jSONObject5 = new JSONObject(jSONObject4);
            if (jSONObject5.has("frequency_type")) {
                dVar.c = jSONObject5.getInt("frequency_type");
            }
            dVar.d = jSONObject5.optInt("showing_surveys_interval", 30);
            this.Y1 = dVar;
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("primitive_types", (Object) c.b(this.c)).put(SessionParameter.CUSTOM_ATTRIBUTES, (Object) c.b(this.d)).put("user_events", (Object) c.b(this.q)).put("events", (Object) a.b(this.x));
        h hVar = this.y;
        Objects.requireNonNull(hVar);
        JSONObject put2 = put.put("trigger", (Object) new JSONObject().put("user_event", (Object) hVar.q).put("trigger_type", hVar.d).put("trigger_after", hVar.x).put("trigger_status", hVar.c));
        d dVar = this.Y1;
        Objects.requireNonNull(dVar);
        put2.put("frequency", (Object) new JSONObject().put("frequency_type", dVar.c).put("showing_surveys_interval", dVar.d)).put("operator", (Object) this.Z1);
        return jSONObject.toString();
    }
}
