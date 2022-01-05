package i0.j.e.t0;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoggingSettings */
public class d implements Cacheable {
    public static final long c = TimeUnit.HOURS.toSeconds(12);
    public Set<String> Y1;
    public Set<String> Z1;
    public int d = 1;
    public int q = 7;
    public int x = 20000;
    public long y = c;

    public void a(JSONObject jSONObject) throws JSONException {
        this.d = 0;
        this.q = jSONObject.optInt("retention_days", 7);
        this.x = jSONObject.optInt("size_limit", 20000);
        this.y = (long) jSONObject.optInt("upload_interval");
        this.Z1 = b(jSONObject.getJSONObject("uuids"));
        this.Y1 = b(jSONObject.getJSONObject("emails"));
    }

    public final Set<String> b(JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        if (jSONObject == null) {
            return hashSet;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys != null && keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public void fromJson(String str) throws JSONException {
        a(new JSONObject(str));
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("level", this.d).put("size_limit", this.x).put("upload_interval", this.y).put("retention_days", this.q).put("uuids", (Object) this.Z1).put("emails", (Object) this.Y1);
        return jSONObject.toString();
    }
}
