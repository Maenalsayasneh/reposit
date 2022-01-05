package k0.b;

import k0.b.w.a;

/* compiled from: MaybeObserver */
public interface i<T> {
    void a(a aVar);

    void onComplete();

    void onError(Throwable th);

    void onSuccess(T t);
}
