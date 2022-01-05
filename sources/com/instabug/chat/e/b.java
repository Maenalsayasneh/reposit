package com.instabug.chat.e;

import android.annotation.SuppressLint;
import com.instabug.chat.e.d;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.model.BaseReport;
import com.instabug.library.model.State;
import com.instabug.library.user.UserManagerWrapper;
import i0.j.c.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: Chat */
public class b extends BaseReport implements Cacheable, Serializable {
    public String c;
    public State d;
    public ArrayList<d> q;
    public a x;

    /* compiled from: Chat */
    public enum a {
        WAITING_ATTACHMENT_MESSAGE,
        READY_TO_BE_SENT,
        LOGS_READY_TO_BE_UPLOADED,
        SENT,
        NOT_AVAILABLE
    }

    /* renamed from: com.instabug.chat.e.b$b  reason: collision with other inner class name */
    /* compiled from: Chat */
    public static class C0097b implements Comparator<b>, Serializable {
        public int compare(Object obj, Object obj2) {
            return new Date(((b) obj).b()).compareTo(new Date(((b) obj2).b()));
        }
    }

    public b(String str, State state, a aVar) {
        this.c = str;
        this.d = null;
        this.x = aVar;
        this.q = new ArrayList<>();
    }

    public d a() {
        ArrayList<d> arrayList = this.q;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        Collections.sort(this.q, new d.a(2));
        ArrayList<d> arrayList2 = this.q;
        return arrayList2.get(arrayList2.size() - 1);
    }

    public long b() {
        if (a() != null) {
            return a().Y1;
        }
        return 0;
    }

    public String c() {
        d g = g();
        if (g != null) {
            return g.y;
        }
        return null;
    }

    public String d() {
        d g = g();
        if (g != null) {
            return g.x;
        }
        if (this.q.size() == 0) {
            return "";
        }
        ArrayList<d> arrayList = this.q;
        return arrayList.get(arrayList.size() - 1).x;
    }

    public String e() {
        String d2 = d();
        if (d2 == null || d2.equals("") || d2.equals(" ") || d2.equals("null") || a() == null || a().c()) {
            return c.a();
        }
        return d2;
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public boolean equals(Object obj) {
        State state;
        State state2;
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (String.valueOf(bVar.c).equals(this.c) && bVar.x == this.x && (((state = bVar.d) == null && this.d == null) || !((state2 = this.d) == null || state == null || !state.equals(state2)))) {
                for (int i = 0; i < bVar.q.size(); i++) {
                    if (!bVar.q.get(i).equals(this.q.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f() {
        Iterator<d> it = this.q.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!it.next().Z1) {
                i++;
            }
        }
        return i;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.c = jSONObject.getString("id");
            h();
        }
        if (jSONObject.has("messages")) {
            JSONArray jSONArray = jSONObject.getJSONArray("messages");
            ArrayList<d> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                d dVar = new d(UserManagerWrapper.getUserName(), UserManagerWrapper.getUserEmail(), InstabugCore.getPushNotificationToken());
                dVar.fromJson(jSONArray.getJSONObject(i).toString());
                arrayList.add(dVar);
            }
            this.q = arrayList;
            h();
        }
        if (jSONObject.has("chat_state")) {
            this.x = a.valueOf(jSONObject.getString("chat_state"));
        }
        if (jSONObject.has("state")) {
            State state = new State();
            state.fromJson(jSONObject.getString("state"));
            this.d = state;
        }
    }

    public final d g() {
        d dVar;
        int size = this.q.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.q.get(size).e2 == d.c.SYNCED) {
                    dVar = this.q.get(size);
                    break;
                }
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar == null || !dVar.c()) {
            return dVar;
        }
        Iterator<d> it = this.q.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (!next.c()) {
                return next;
            }
        }
        return null;
    }

    public String getId() {
        return this.c;
    }

    public State getState() {
        return this.d;
    }

    public final void h() {
        for (int i = 0; i < this.q.size(); i++) {
            this.q.get(i).d = this.c;
        }
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public BaseReport setId(String str) {
        this.c = str;
        h();
        return this;
    }

    public BaseReport setState(State state) {
        this.d = state;
        return this;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("id", (Object) this.c);
        ArrayList<d> arrayList = this.q;
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put((Object) new JSONObject(arrayList.get(i).toJson()));
        }
        put.put("messages", (Object) jSONArray);
        a aVar = this.x;
        if (aVar != null) {
            jSONObject.put("chat_state", (Object) aVar.toString());
        }
        State state = this.d;
        if (state != null) {
            jSONObject.put("state", (Object) state.toJson());
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Chat:[");
        P0.append(this.c);
        P0.append(" chatState: ");
        P0.append(this.x);
        P0.append("]");
        return P0.toString();
    }

    public b(String str) {
        this.c = str;
        this.q = new ArrayList<>();
        this.x = a.SENT;
    }

    public b() {
        this.x = a.NOT_AVAILABLE;
        this.q = new ArrayList<>();
    }
}
