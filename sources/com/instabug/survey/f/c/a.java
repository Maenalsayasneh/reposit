package com.instabug.survey.f.c;

import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ActionEvent */
public class a implements Cacheable, Serializable {
    public C0111a c;
    public long d;
    public int q;

    /* renamed from: com.instabug.survey.f.c.a$a  reason: collision with other inner class name */
    /* compiled from: ActionEvent */
    public enum C0111a {
        SHOW("show"),
        DISMISS("dismiss"),
        SUBMIT("submit"),
        RATE("rate"),
        UNDEFINED("undefined");
        
        private final String event;

        private C0111a(String str) {
            this.event = str;
        }

        public String toString() {
            return this.event;
        }
    }

    public a() {
    }

    public static ArrayList<a> a(JSONArray jSONArray) throws JSONException {
        ArrayList<a> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            a aVar = new a();
            aVar.fromJson(jSONArray.getJSONObject(i).toString());
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static JSONArray b(ArrayList<a> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null) {
                    jSONArray.put((Object) new JSONObject(arrayList.get(i).toJson()));
                }
            }
        }
        return jSONArray;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("event_type")) {
            String string = jSONObject.getString("event_type");
            string.hashCode();
            char c2 = 65535;
            switch (string.hashCode()) {
                case -891535336:
                    if (string.equals("submit")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3493088:
                    if (string.equals("rate")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3529469:
                    if (string.equals("show")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1671672458:
                    if (string.equals("dismiss")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.c = C0111a.SUBMIT;
                    break;
                case 1:
                    this.c = C0111a.RATE;
                    break;
                case 2:
                    this.c = C0111a.SHOW;
                    break;
                case 3:
                    this.c = C0111a.DISMISS;
                    break;
                default:
                    this.c = C0111a.UNDEFINED;
                    break;
            }
        }
        if (jSONObject.has("index")) {
            this.q = jSONObject.getInt("index");
        }
        if (jSONObject.has("timestamp")) {
            this.d = jSONObject.getLong("timestamp");
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", (Object) this.c.toString());
        jSONObject.put("index", this.q);
        jSONObject.put("timestamp", this.d);
        return jSONObject.toString();
    }

    public a(C0111a aVar, long j, int i) {
        this.c = aVar;
        this.d = j;
        this.q = i;
    }
}
