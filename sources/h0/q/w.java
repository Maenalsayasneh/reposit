package h0.q;

import androidx.lifecycle.LiveData;
import h0.c.a.b.b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData */
public class w<T> extends y<T> {
    public b<LiveData<?>, a<?>> a = new b<>();

    /* compiled from: MediatorLiveData */
    public static class a<V> implements z<V> {
        public final LiveData<V> a;
        public final z<? super V> b;
        public int c = -1;

        public a(LiveData<V> liveData, z<? super V> zVar) {
            this.a = liveData;
            this.b = zVar;
        }

        public void onChanged(V v) {
            if (this.c != this.a.getVersion()) {
                this.c = this.a.getVersion();
                this.b.onChanged(v);
            }
        }
    }

    public <S> void a(LiveData<S> liveData, z<? super S> zVar) {
        a aVar = new a(liveData, zVar);
        a j = this.a.j(liveData, aVar);
        if (j != null && j.b != zVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (j == null && hasActiveObservers()) {
            liveData.observeForever(aVar);
        }
    }

    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.a.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.a.observeForever(aVar);
            } else {
                return;
            }
        }
    }

    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.a.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.a.removeObserver(aVar);
            } else {
                return;
            }
        }
    }
}
