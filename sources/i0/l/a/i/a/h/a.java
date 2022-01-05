package i0.l.a.i.a.h;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import java.util.List;
import java.util.Map;

/* compiled from: ContainerFactory */
public interface a {
    public static final a a = new C0197a();

    /* renamed from: i0.l.a.i.a.h.a$a  reason: collision with other inner class name */
    /* compiled from: ContainerFactory */
    public class C0197a implements a {
        public List<Object> a() {
            return new JSONArray();
        }

        public Map<String, Object> b() {
            return new JSONObject();
        }
    }

    List<Object> a();

    Map<String, Object> b();
}
