package i0.o.a;

import com.squareup.picasso.Picasso;
import i0.o.a.b0;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PicassoExecutorService */
public class s extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService */
    public static final class a extends FutureTask<c> implements Comparable<a> {
        public final c c;

        public a(c cVar) {
            super(cVar, (Object) null);
            this.c = cVar;
        }

        public int compareTo(Object obj) {
            c cVar = this.c;
            Picasso.Priority priority = cVar.p2;
            c cVar2 = ((a) obj).c;
            Picasso.Priority priority2 = cVar2.p2;
            return priority == priority2 ? cVar.y - cVar2.y : priority2.ordinal() - priority.ordinal();
        }
    }

    public s() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b0.b());
    }

    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
