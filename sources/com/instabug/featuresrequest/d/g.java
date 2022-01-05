package com.instabug.featuresrequest.d;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: TimelineResponse */
public class g implements Cacheable, Serializable {
    public long c;
    public ArrayList<f> d;

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("featureId")) {
            this.c = jSONObject.getLong("featureId");
        }
        if (jSONObject.has("timeline")) {
            JSONArray jSONArray = jSONObject.getJSONArray("timeline");
            ArrayList<f> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getJSONObject(i).has("type")) {
                    if (jSONArray.getJSONObject(i).getString("type").equals("comment")) {
                        a aVar = new a();
                        aVar.fromJson(jSONArray.getJSONObject(i).toString());
                        arrayList.add(aVar);
                    } else {
                        e eVar = new e();
                        eVar.fromJson(jSONArray.getJSONObject(i).toString());
                        arrayList.add(eVar);
                    }
                }
            }
            this.d = arrayList;
        }
    }

    public String toJson() throws JSONException {
        JSONObject put = new JSONObject().put("featureId", this.c);
        ArrayList<f> arrayList = this.d;
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof a) {
                jSONArray.put((Object) new JSONObject(((a) arrayList.get(i)).toJson()));
            } else {
                jSONArray.put((Object) new JSONObject(((e) arrayList.get(i)).toJson()));
            }
        }
        return put.put("timeline", (Object) jSONArray).toString();
    }
}
