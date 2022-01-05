package com.instabug.library.n.b.a;

import com.instabug.library.util.DeviceStateProvider;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionProfilerTimeline */
public class e implements Serializable {
    public long Y1 = DeviceStateProvider.getTotalStorage();
    public Collection<f> c = new ConcurrentLinkedQueue();
    public Collection<f> d = new ConcurrentLinkedQueue();
    public Collection<f> q = new ConcurrentLinkedQueue();
    public Collection<f> x = new ConcurrentLinkedQueue();
    public Collection<f> y = new ConcurrentLinkedQueue();

    public static ConcurrentLinkedQueue<f> a(Collection<f> collection, int i) {
        ConcurrentLinkedQueue<f> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedQueue concurrentLinkedQueue2 = collection instanceof ConcurrentLinkedQueue ? (ConcurrentLinkedQueue) collection : new ConcurrentLinkedQueue(collection);
        if (concurrentLinkedQueue2.size() < i) {
            concurrentLinkedQueue.addAll(concurrentLinkedQueue2);
            return concurrentLinkedQueue;
        }
        while (concurrentLinkedQueue2.size() > i) {
            concurrentLinkedQueue2.poll();
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            f fVar = (f) concurrentLinkedQueue2.poll();
            if (fVar == null) {
                break;
            }
            concurrentLinkedQueue.add(fVar);
        }
        concurrentLinkedQueue2.clear();
        concurrentLinkedQueue2.addAll(concurrentLinkedQueue);
        return concurrentLinkedQueue;
    }

    public static void c(Collection<f> collection, float f) {
        ConcurrentLinkedQueue concurrentLinkedQueue = collection instanceof ConcurrentLinkedQueue ? (ConcurrentLinkedQueue) collection : new ConcurrentLinkedQueue(collection);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            double round = ((double) Math.round(((double) ((long) ((((float) i) / f) * 60000.0f))) / 10.0d)) / 100.0d;
            if (fVar != null) {
                fVar.c = round;
                linkedList.add(fVar);
            }
            i++;
        }
        collection.clear();
        collection.addAll(linkedList);
    }

    public final JSONObject b(Collection<f> collection) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = (collection instanceof ConcurrentLinkedQueue ? (ConcurrentLinkedQueue) collection : new ConcurrentLinkedQueue(collection)).iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null) {
                jSONArray.put((Object) fVar.a());
            }
        }
        jSONObject.put("timeline", (Object) jSONArray);
        return jSONObject;
    }

    public e d() {
        e eVar = new e();
        eVar.c = a(this.c, 30);
        eVar.d = a(this.d, 30);
        eVar.q = a(this.q, 30);
        eVar.x = a(this.x, 120);
        eVar.y = a(this.y, 120);
        eVar.Y1 = this.Y1;
        return eVar;
    }
}
