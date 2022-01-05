package io.reactivex.subjects;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.b.e0.c;
import k0.b.p;
import k0.b.w.a;

public final class PublishSubject<T> extends c<T> {
    public static final PublishDisposable[] c = new PublishDisposable[0];
    public static final PublishDisposable[] d = new PublishDisposable[0];
    public final AtomicReference<PublishDisposable<T>[]> q = new AtomicReference<>(d);
    public Throwable x;

    public static final class PublishDisposable<T> extends AtomicBoolean implements a {
        public final p<? super T> c;
        public final PublishSubject<T> d;

        public PublishDisposable(p<? super T> pVar, PublishSubject<T> publishSubject) {
            this.c = pVar;
            this.d = publishSubject;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.d.w(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public void a(a aVar) {
        if (this.q.get() == c) {
            aVar.dispose();
        }
    }

    public void b(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.q.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.c.b(t);
            }
        }
    }

    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.q.get();
        PublishDisposable<T>[] publishDisposableArr2 = c;
        if (publishDisposableArr != publishDisposableArr2) {
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.q.getAndSet(publishDisposableArr2)) {
                if (!publishDisposable.get()) {
                    publishDisposable.c.onComplete();
                }
            }
        }
    }

    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.q.get();
        PublishDisposable<T>[] publishDisposableArr2 = c;
        if (publishDisposableArr == publishDisposableArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.x = th;
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.q.getAndSet(publishDisposableArr2)) {
            if (publishDisposable.get()) {
                RxJavaPlugins.onError(th);
            } else {
                publishDisposable.c.onError(th);
            }
        }
    }

    public void u(p<? super T> pVar) {
        boolean z;
        PublishDisposable publishDisposable = new PublishDisposable(pVar, this);
        pVar.a(publishDisposable);
        while (true) {
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) this.q.get();
            z = false;
            if (publishDisposableArr != c) {
                int length = publishDisposableArr.length;
                PublishDisposable[] publishDisposableArr2 = new PublishDisposable[(length + 1)];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
                publishDisposableArr2[length] = publishDisposable;
                if (this.q.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.x;
            if (th != null) {
                pVar.onError(th);
            } else {
                pVar.onComplete();
            }
        } else if (publishDisposable.get()) {
            w(publishDisposable);
        }
    }

    public void w(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.q.get();
            if (publishDisposableArr != c && publishDisposableArr != d) {
                int length = publishDisposableArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (publishDisposableArr[i] == publishDisposable) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishDisposableArr2 = d;
                    } else {
                        PublishDisposable[] publishDisposableArr3 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                        System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                        publishDisposableArr2 = publishDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.q.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }
}
