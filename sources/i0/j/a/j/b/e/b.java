package i0.j.a.j.b.e;

import android.annotation.SuppressLint;
import i0.h.a.b.h.f.n;
import i0.j.a.d.b.f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
/* compiled from: UiTraceMapperImpl */
public class b implements a {
    public JSONArray c(List<f> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (f next : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(n.a, (Object) next.b);
            jSONObject.put("dmus", next.c);
            jSONObject.put("ldd", next.d);
            jSONObject.put("sdd", next.e);
            jSONObject.put("ud", next.a);
            jSONObject.put("st", next.f);
            jSONObject.put("rr", next.g);
            int i = next.i;
            if (i != -1) {
                jSONObject.put("bl", i);
            }
            String str = next.k;
            if (str != null) {
                jSONObject.put("cn", (Object) str);
            }
            String str2 = next.h;
            if (str2 != null) {
                jSONObject.put("snt", (Object) str2);
            }
            String str3 = next.m;
            if (str3 != null) {
                jSONObject.put("o", (Object) str3);
            }
            String str4 = next.l;
            if (str4 != null) {
                jSONObject.put("mn", (Object) str4);
            }
            Boolean bool = next.j;
            if (bool != null) {
                jSONObject.put("pws", (Object) bool);
            }
            jSONArray.put((Object) jSONObject);
        }
        return jSONArray;
    }
}
