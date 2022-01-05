package com.instabug.survey.f.c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseLocalization */
public class b implements Serializable {
    public boolean c = false;
    public List<String> d;
    public String q;

    public void a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.d = arrayList;
    }

    public void b(JSONObject jSONObject) throws JSONException {
        this.c = jSONObject.optBoolean("localized", false);
        this.q = jSONObject.optString("current_locale");
        if (jSONObject.has("locales")) {
            a(jSONObject.getJSONArray("locales"));
        }
    }

    public List<String> c() {
        List<String> list = this.d;
        return list == null ? Collections.emptyList() : list;
    }

    public void d(JSONObject jSONObject) throws JSONException {
        jSONObject.put("localized", this.c);
        List<String> list = this.d;
        if (list != null) {
            jSONObject.put("locales", (Object) list);
        }
        String str = this.q;
        if (str != null) {
            jSONObject.put("current_locale", (Object) str);
        }
    }
}
