package h0.q;

import androidx.lifecycle.LiveData;
import h0.q.w;

/* compiled from: Transformations */
public class i0 implements z<X> {
    public LiveData<Y> a;
    public final /* synthetic */ h0.c.a.c.a b;
    public final /* synthetic */ w c;

    /* compiled from: Transformations */
    public class a implements z<Y> {
        public a() {
        }

        public void onChanged(Y y) {
            i0.this.c.setValue(y);
        }
    }

    public i0(h0.c.a.c.a aVar, w wVar) {
        this.b = aVar;
        this.c = wVar;
    }

    public void onChanged(X x) {
        w.a k;
        LiveData<Y> liveData = (LiveData) this.b.apply(x);
        LiveData<Y> liveData2 = this.a;
        if (liveData2 != liveData) {
            if (!(liveData2 == null || (k = this.c.a.k(liveData2)) == null)) {
                k.a.removeObserver(k);
            }
            this.a = liveData;
            if (liveData != null) {
                this.c.a(liveData, new a());
            }
        }
    }
}
