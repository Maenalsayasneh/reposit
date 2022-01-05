package i0.j.a.j.b.d;

import android.text.TextUtils;
import i0.h.a.b.h.f.n;
import i0.j.a.d.b.c;
import i0.j.a.d.b.d;
import i0.j.a.d.b.e;
import i0.j.a.d.b.f;
import i0.j.a.j.b.a.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionMapperImpl */
public class b implements a {
    public a a = new a();
    public i0.j.a.j.b.c.a b = new i0.j.a.j.b.c.a();
    public i0.j.a.j.b.b.a c;
    public i0.j.a.j.b.e.a d;

    public b() {
        i0.j.a.j.b.b.a aVar;
        i0.j.a.j.b.e.a aVar2;
        Class<i0.j.a.g.a> cls = i0.j.a.g.a.class;
        synchronized (cls) {
            aVar = new i0.j.a.j.b.b.a();
        }
        this.c = aVar;
        synchronized (cls) {
            WeakReference<i0.j.a.j.b.e.a> weakReference = i0.j.a.g.a.o;
            if (weakReference == null || weakReference.get() == null) {
                i0.j.a.g.a.o = new WeakReference<>(new i0.j.a.j.b.e.b());
            }
            aVar2 = (i0.j.a.j.b.e.a) i0.j.a.g.a.o.get();
        }
        this.d = aVar2;
    }

    public JSONArray c(List<d> list) throws JSONException {
        JSONArray jSONArray;
        String str;
        String str2;
        JSONArray jSONArray2;
        Iterator<d> it;
        JSONArray jSONArray3;
        String str3;
        String str4;
        JSONArray jSONArray4;
        e eVar;
        e eVar2;
        e eVar3;
        Iterator<d> it2;
        JSONArray jSONArray5;
        Iterator<i0.j.a.d.b.a> it3;
        JSONObject jSONObject;
        String str5;
        String str6;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        e eVar4;
        JSONArray jSONArray6 = new JSONArray();
        Iterator<d> it4 = list.iterator();
        while (it4.hasNext()) {
            d next = it4.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sid", (Object) next.b);
            jSONObject4.put("os", (Object) next.c);
            jSONObject4.put("uid", (Object) next.e);
            jSONObject4.put("av", (Object) next.d);
            jSONObject4.put("st", next.g);
            jSONObject4.put("sec", next.i);
            long j = next.f;
            if (j > 0) {
                jSONObject4.put("sd", j);
            }
            List<i0.j.a.d.b.b> list2 = next.j;
            if (list2 == null || list2.isEmpty()) {
                jSONArray = null;
            } else {
                a aVar = this.a;
                List<i0.j.a.d.b.b> list3 = next.j;
                Objects.requireNonNull(aVar);
                jSONArray = new JSONArray();
                for (i0.j.a.d.b.b next2 : list3) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("t", (Object) next2.b);
                    jSONObject5.put("st", next2.d);
                    jSONObject5.put("dmus", next2.e);
                    jSONObject5.put("sn", (Object) next2.c);
                    if (next2.f != null) {
                        jSONObject5.put("stgs", (Object) new JSONObject((Map<?, ?>) next2.f));
                    }
                    jSONArray.put((Object) jSONObject5);
                }
            }
            String str7 = "dcsl";
            String str8 = "dcrl";
            if (jSONArray != null || ((eVar4 = next.n) != null && eVar4.b > 0)) {
                JSONObject jSONObject6 = new JSONObject();
                if (jSONArray != null) {
                    jSONObject6.put("ll", (Object) jSONArray);
                }
                e eVar5 = next.n;
                if (eVar5 != null) {
                    int i = eVar5.f;
                    if (i != 0) {
                        jSONObject6.put(str8, i);
                    }
                    e eVar6 = next.n;
                    int size = (eVar6.b - eVar6.f) - next.j.size();
                    if (size != 0) {
                        jSONObject6.put(str7, size);
                    }
                }
                jSONObject4.put("ls", (Object) jSONObject6);
            }
            List<i0.j.a.d.b.a> list4 = next.m;
            if (list4 == null || list4.isEmpty()) {
                jSONArray2 = jSONArray6;
                it = it4;
                str2 = str7;
                str = str8;
                jSONArray3 = null;
            } else {
                i0.j.a.j.b.c.a aVar2 = this.b;
                List<i0.j.a.d.b.a> list5 = next.m;
                Objects.requireNonNull(aVar2);
                jSONArray3 = new JSONArray();
                Iterator<i0.j.a.d.b.a> it5 = list5.iterator();
                while (it5.hasNext()) {
                    i0.j.a.d.b.a next3 = it5.next();
                    JSONObject jSONObject7 = new JSONObject();
                    String str9 = next3.c;
                    if (str9 != null) {
                        it2 = it4;
                        jSONObject7.put("m", (Object) str9.toLowerCase());
                    } else {
                        it2 = it4;
                    }
                    String str10 = next3.b;
                    if (str10 != null) {
                        jSONObject7.put("u", (Object) str10);
                    }
                    if (!TextUtils.isEmpty(next3.m)) {
                        jSONObject7.put("ra", (Object) next3.m);
                    }
                    if (!TextUtils.isEmpty(next3.n)) {
                        jSONObject7.put("ca", (Object) next3.n);
                    }
                    int i2 = next3.i;
                    if (next3.j != null) {
                        jSONObject = new JSONObject();
                        it3 = it5;
                        jSONArray5 = jSONArray6;
                        jSONObject.put("e", (Object) next3.j);
                    } else {
                        jSONArray5 = jSONArray6;
                        it3 = it5;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        jSONObject7.put("cse", (Object) jSONObject);
                    } else if (i2 > 0) {
                        jSONObject7.put("sc", i2);
                    }
                    if (next3.k <= 0 && next3.f == null && next3.d == null) {
                        str6 = str7;
                        str5 = str8;
                        jSONObject2 = null;
                    } else {
                        jSONObject2 = new JSONObject();
                        str6 = str7;
                        str5 = str8;
                        long j2 = next3.k;
                        if (j2 > 0) {
                            jSONObject2.put("ps", j2);
                        }
                        String str11 = next3.d;
                        if (str11 != null) {
                            jSONObject2.put("h", (Object) aVar2.a(str11));
                        }
                        String str12 = next3.f;
                        if (str12 != null) {
                            jSONObject2.put("ct", (Object) aVar2.a(str12));
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject7.put("rq", (Object) jSONObject2);
                    }
                    if (next3.l <= 0 && next3.g == null && next3.e == null) {
                        jSONObject3 = null;
                    } else {
                        jSONObject3 = new JSONObject();
                        long j3 = next3.l;
                        if (j3 > 0) {
                            jSONObject3.put("ps", j3);
                        }
                        String str13 = next3.e;
                        if (str13 != null) {
                            jSONObject3.put("h", (Object) aVar2.a(str13));
                        }
                        String str14 = next3.g;
                        if (str14 != null) {
                            jSONObject3.put("ct", (Object) aVar2.a(str14));
                        }
                    }
                    if (jSONObject3 != null) {
                        jSONObject7.put("rs", (Object) jSONObject3);
                    }
                    long j4 = next3.h;
                    if (j4 > 0) {
                        jSONObject7.put("rt", j4);
                    }
                    jSONObject7.put("bg", next3.o);
                    Long l = next3.a;
                    if (l != null) {
                        jSONObject7.put("st", (Object) l);
                    }
                    jSONArray3.put((Object) jSONObject7);
                    it4 = it2;
                    it5 = it3;
                    jSONArray6 = jSONArray5;
                    str7 = str6;
                    str8 = str5;
                }
                jSONArray2 = jSONArray6;
                it = it4;
                str2 = str7;
                str = str8;
            }
            if (jSONArray3 != null || ((eVar3 = next.n) != null && eVar3.c > 0)) {
                JSONObject jSONObject8 = new JSONObject();
                if (jSONArray3 != null) {
                    jSONObject8.put("nl", (Object) jSONArray3);
                }
                e eVar7 = next.n;
                if (eVar7 != null) {
                    int i3 = eVar7.g;
                    str3 = str;
                    if (i3 != 0) {
                        jSONObject8.put(str3, i3);
                    }
                    e eVar8 = next.n;
                    int size2 = (eVar8.c - eVar8.g) - next.m.size();
                    str4 = str2;
                    if (size2 != 0) {
                        jSONObject8.put(str4, size2);
                    }
                } else {
                    str4 = str2;
                    str3 = str;
                }
                jSONObject4.put("nts", (Object) jSONObject8);
            } else {
                str4 = str2;
                str3 = str;
            }
            List<c> list6 = next.k;
            if (list6 == null || list6.isEmpty()) {
                jSONArray4 = null;
            } else {
                i0.j.a.j.b.b.a aVar3 = this.c;
                List<c> list7 = next.k;
                Objects.requireNonNull(aVar3);
                jSONArray4 = new JSONArray();
                for (c next4 : list7) {
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put(n.a, (Object) next4.b);
                    jSONObject9.put("st", next4.c);
                    jSONObject9.put("dmus", next4.d);
                    if (next4.e != null) {
                        jSONObject9.put("att", (Object) new JSONObject((Map<?, ?>) next4.e));
                    }
                    jSONObject9.put("bg", next4.f);
                    jSONArray4.put((Object) jSONObject9);
                }
            }
            if (jSONArray4 != null || ((eVar2 = next.n) != null && eVar2.a > 0)) {
                JSONObject jSONObject10 = new JSONObject();
                if (jSONArray4 != null) {
                    jSONObject10.put("tl", (Object) jSONArray4);
                }
                e eVar9 = next.n;
                if (eVar9 != null) {
                    int i4 = eVar9.e;
                    if (i4 != 0) {
                        jSONObject10.put(str3, i4);
                    }
                    e eVar10 = next.n;
                    int size3 = (eVar10.a - eVar10.e) - next.k.size();
                    if (size3 != 0) {
                        jSONObject10.put(str4, size3);
                    }
                }
                jSONObject4.put("ts", (Object) jSONObject10);
            }
            List<f> list8 = next.l;
            JSONArray c2 = (list8 == null || list8.isEmpty()) ? null : this.d.c(next.l);
            if (c2 != null || ((eVar = next.n) != null && eVar.d > 0)) {
                JSONObject jSONObject11 = new JSONObject();
                if (c2 != null) {
                    jSONObject11.put("uil", (Object) c2);
                }
                e eVar11 = next.n;
                if (eVar11 != null) {
                    int i5 = eVar11.h;
                    if (i5 != 0) {
                        jSONObject11.put(str3, i5);
                    }
                    e eVar12 = next.n;
                    int size4 = (eVar12.d - eVar12.h) - next.l.size();
                    if (size4 != 0) {
                        jSONObject11.put(str4, size4);
                    }
                }
                jSONObject4.put("uis", (Object) jSONObject11);
            }
            jSONArray6 = jSONArray2;
            jSONArray6.put((Object) jSONObject4);
            it4 = it;
        }
        return jSONArray6;
    }
}
