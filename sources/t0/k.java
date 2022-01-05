package t0;

import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.KotlinNullPointerException;
import m0.n.b.i;
import n0.a.m;
import q0.b0;
import retrofit2.HttpException;
import retrofit2.Invocation;

/* compiled from: KotlinExtensions.kt */
public final class k implements f<T> {
    public final /* synthetic */ m a;

    public k(m mVar) {
        this.a = mVar;
    }

    public void onFailure(d<T> dVar, Throwable th) {
        i.f(dVar, NotificationCompat.CATEGORY_CALL);
        i.f(th, "t");
        this.a.resumeWith(h.l0(th));
    }

    public void onResponse(d<T> dVar, v<T> vVar) {
        i.f(dVar, NotificationCompat.CATEGORY_CALL);
        i.f(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (vVar.a()) {
            T t = vVar.b;
            if (t == null) {
                b0 request = dVar.request();
                Class<Invocation> cls = Invocation.class;
                Objects.requireNonNull(request);
                i.e(cls, "type");
                Invocation cast = cls.cast(request.f.get(cls));
                if (cast != null) {
                    i.b(cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = cast.method();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    i.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    i.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    this.a.resumeWith(h.l0(new KotlinNullPointerException(sb.toString())));
                    return;
                }
                i.l();
                throw null;
            }
            this.a.resumeWith(t);
            return;
        }
        this.a.resumeWith(h.l0(new HttpException(vVar)));
    }
}
