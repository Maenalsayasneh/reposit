package i0.j.c.f;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ReadMessage */
public class c implements Cacheable {
    public String c;
    public long d;
    public String q;

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!String.valueOf(cVar.c).equals(String.valueOf(this.c)) || !String.valueOf(cVar.q).equals(String.valueOf(this.q)) || cVar.d != this.d) {
            return false;
        }
        return true;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("chat_number")) {
            this.c = jSONObject.getString("chat_number");
        }
        if (jSONObject.has("message_id")) {
            this.q = jSONObject.getString("message_id");
        }
        if (jSONObject.has("read_at")) {
            this.d = jSONObject.getLong("read_at");
        }
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("read_at", this.d);
        String str = this.c;
        if (str != null) {
            jSONObject.put("chat_number", (Object) str);
        }
        String str2 = this.q;
        if (str2 != null) {
            jSONObject.put("message_id", (Object) str2);
        }
        return jSONObject.toString();
    }
}
