package i0.j.c.n.f;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.e.b;
import com.instabug.chat.e.d;
import com.instabug.library.Instabug;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.internal.storage.cache.CacheChangedListener;
import com.instabug.library.internal.storage.cache.CacheManager;
import i0.j.c.h.l;
import io.reactivex.subjects.PublishSubject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ChatsPresenter */
public class e extends BasePresenter<d> implements c, CacheChangedListener<b>, i0.j.c.m.b {
    public PublishSubject<Long> c;
    public k0.b.w.a d;

    /* compiled from: ChatsPresenter */
    public class a implements Runnable {
        public final /* synthetic */ List c;

        public a(List list) {
            this.c = list;
        }

        public void run() {
            if (Instabug.getApplicationContext() != null) {
                l.a().g(Instabug.getApplicationContext(), this.c);
            }
        }
    }

    public e(d dVar) {
        super(dVar);
    }

    public void b() {
        PublishSubject<Long> publishSubject = new PublishSubject<>();
        this.c = publishSubject;
        k0.b.l<Long> s = publishSubject.e(300, TimeUnit.MILLISECONDS).s(k0.b.v.a.a.a());
        f fVar = new f(this);
        s.c(fVar);
        this.d = fVar;
        CacheManager.getInstance().subscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
        i0.j.c.m.a d2 = i0.j.c.m.a.d();
        if (!d2.b.contains(this)) {
            d2.b.add(this);
        }
        m();
    }

    public final void k(long j) {
        PublishSubject<Long> publishSubject = this.c;
        if (publishSubject != null) {
            publishSubject.b(Long.valueOf(j));
        }
    }

    public final void m() {
        ArrayList arrayList;
        d dVar;
        synchronized (this) {
            if (ChatsCacheManager.getCache() != null) {
                arrayList = new ArrayList(ChatsCacheManager.getValidChats());
            } else {
                arrayList = new ArrayList();
            }
            Collections.sort(arrayList, Collections.reverseOrder(new b.C0097b()));
        }
        Collections.sort(arrayList, Collections.reverseOrder(new b.C0097b()));
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (dVar = (d) weakReference.get()) != null) {
            dVar.H(arrayList);
            dVar.l();
        }
    }

    public void onCacheInvalidated() {
        k(System.currentTimeMillis());
    }

    public void onCachedItemAdded(Object obj) {
        b bVar = (b) obj;
        k(System.currentTimeMillis());
    }

    public void onCachedItemRemoved(Object obj) {
        b bVar = (b) obj;
        k(System.currentTimeMillis());
    }

    public void onCachedItemUpdated(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        k(System.currentTimeMillis());
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_RETURN_ANNOTATION"})
    public List<d> onNewMessagesReceived(List<d> list) {
        d dVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null || ((Fragment) dVar.getViewContext()).getActivity() == null) {
            return null;
        }
        if (dVar.c()) {
            l.a().e(((Fragment) dVar.getViewContext()).getActivity());
            return null;
        } else if (Instabug.getApplicationContext() == null) {
            return null;
        } else {
            PresentationManager.getInstance().show(new a(list));
            return null;
        }
    }

    public void s() {
        CacheManager.getInstance().unSubscribe(ChatsCacheManager.CHATS_MEMORY_CACHE_KEY, this);
        i0.j.c.m.a.d().b.remove(this);
        k0.b.w.a aVar = this.d;
        if (aVar != null && !aVar.isDisposed()) {
            this.d.dispose();
        }
    }
}
