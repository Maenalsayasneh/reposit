package io.reactivex.internal.util;

import java.io.Serializable;
import k0.b.p;
import k0.b.w.a;
import s0.b.b;

public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        public final a c;

        public DisposableNotification(a aVar) {
            this.c = aVar;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("NotificationLite.Disposable[");
            P0.append(this.c);
            P0.append("]");
            return P0.toString();
        }
    }

    public static final class ErrorNotification implements Serializable {
        public final Throwable c;

        public ErrorNotification(Throwable th) {
            this.c = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ErrorNotification)) {
                return false;
            }
            Throwable th = this.c;
            Throwable th2 = ((ErrorNotification) obj).c;
            if (th == th2 || (th != null && th.equals(th2))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("NotificationLite.Error[");
            P0.append(this.c);
            P0.append("]");
            return P0.toString();
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        public final b c;

        public SubscriptionNotification(b bVar) {
            this.c = bVar;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("NotificationLite.Subscription[");
            P0.append(this.c);
            P0.append("]");
            return P0.toString();
        }
    }

    public static <T> boolean accept(Object obj, s0.b.a<? super T> aVar) {
        if (obj == COMPLETE) {
            aVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            aVar.onError(((ErrorNotification) obj).c);
            return true;
        } else {
            aVar.b(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, s0.b.a<? super T> aVar) {
        if (obj == COMPLETE) {
            aVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            aVar.onError(((ErrorNotification) obj).c);
            return true;
        } else if (obj instanceof SubscriptionNotification) {
            aVar.a(((SubscriptionNotification) obj).c);
            return false;
        } else {
            aVar.b(obj);
            return false;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(a aVar) {
        return new DisposableNotification(aVar);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static a getDisposable(Object obj) {
        return ((DisposableNotification) obj).c;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).c;
    }

    public static b getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).c;
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(b bVar) {
        return new SubscriptionNotification(bVar);
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, p<? super T> pVar) {
        if (obj == COMPLETE) {
            pVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            pVar.onError(((ErrorNotification) obj).c);
            return true;
        } else {
            pVar.b(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, p<? super T> pVar) {
        if (obj == COMPLETE) {
            pVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            pVar.onError(((ErrorNotification) obj).c);
            return true;
        } else if (obj instanceof DisposableNotification) {
            pVar.a(((DisposableNotification) obj).c);
            return false;
        } else {
            pVar.b(obj);
            return false;
        }
    }
}
