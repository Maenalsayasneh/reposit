package i0.j.f.l;

import com.instabug.library.network.Request;
import com.instabug.library.util.TimeUtils;
import i0.j.f.l.i.a;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnnouncementManager */
public class b implements Request.Callbacks<JSONObject, Throwable> {
    public final /* synthetic */ g a;

    public b(g gVar) {
        this.a = gVar;
    }

    public void onFailed(Object obj) {
        this.a.d((Throwable) obj);
    }

    public void onSucceeded(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            a a2 = a.a();
            long currentTimeMillis = TimeUtils.currentTimeMillis();
            Objects.requireNonNull(a2);
            if (i0.j.f.l.i.b.a() != null) {
                i0.j.f.l.i.b a3 = i0.j.f.l.i.b.a();
                a3.c.putLong("announcements_last_fetch_time", currentTimeMillis);
                a3.c.apply();
            }
            if (jSONObject != null) {
                JSONArray jSONArray = jSONObject.getJSONArray("published");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    com.instabug.survey.e.c.a aVar = new com.instabug.survey.e.c.a();
                    aVar.fromJson(jSONObject2.toString());
                    arrayList.add(aVar);
                }
                g.c(this.a, arrayList);
                return;
            }
            this.a.d(new NullPointerException("json response is null"));
        } catch (JSONException e) {
            this.a.d(e);
        }
    }
}
