package com.instabug.library.core.eventbus;

import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import k0.b.l;
import k0.b.y.d;
import k0.b.z.b.a;

public class EventBus<T> {
    private final PublishSubject<T> subject;

    public class a implements d<Throwable> {
        public void b(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            InstabugSDKLogger.e(this, th.getMessage(), th);
        }
    }

    public EventBus(PublishSubject<T> publishSubject) {
        this.subject = publishSubject;
    }

    public l<T> getEventObservable() {
        return this.subject;
    }

    public boolean hasObservers() {
        return ((PublishSubject.PublishDisposable[]) this.subject.q.get()).length != 0;
    }

    public <E extends T> l<E> observeEvents(Class<E> cls) {
        PublishSubject<T> publishSubject = this.subject;
        Objects.requireNonNull(publishSubject);
        Objects.requireNonNull(cls, "clazz is null");
        l<T> i = publishSubject.i(new a.d(cls));
        Objects.requireNonNull(i);
        return i.p(new a.c(cls));
    }

    public <E extends T> void post(E e) {
        try {
            this.subject.b(e);
        } catch (Throwable th) {
            InstabugSDKLogger.e(this, th.getMessage(), th);
        }
    }

    public k0.b.w.a subscribe(d<? super T> dVar) {
        return this.subject.t(dVar, new a(), k0.b.z.b.a.c, k0.b.z.b.a.d);
    }

    public EventBus() {
        this(new PublishSubject());
    }
}
