package i0.o.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

/* compiled from: Stats */
public class x {
    public final HandlerThread a;
    public final d b;
    public final Handler c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;

    /* compiled from: Stats */
    public static class a extends Handler {
        public final x a;

        /* renamed from: i0.o.a.x$a$a  reason: collision with other inner class name */
        /* compiled from: Stats */
        public class C0221a implements Runnable {
            public final /* synthetic */ Message c;

            public C0221a(a aVar, Message message) {
                this.c = message;
            }

            public void run() {
                StringBuilder P0 = i0.d.a.a.a.P0("Unhandled stats message.");
                P0.append(this.c.what);
                throw new AssertionError(P0.toString());
            }
        }

        public a(Looper looper, x xVar) {
            super(looper);
            this.a = xVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.d++;
            } else if (i == 1) {
                this.a.e++;
            } else if (i == 2) {
                x xVar = this.a;
                long j = (long) message.arg1;
                int i2 = xVar.m + 1;
                xVar.m = i2;
                long j2 = xVar.g + j;
                xVar.g = j2;
                xVar.j = j2 / ((long) i2);
            } else if (i == 3) {
                x xVar2 = this.a;
                long j3 = (long) message.arg1;
                xVar2.n++;
                long j4 = xVar2.h + j3;
                xVar2.h = j4;
                xVar2.k = j4 / ((long) xVar2.m);
            } else if (i != 4) {
                Picasso.a.post(new C0221a(this, message));
            } else {
                x xVar3 = this.a;
                xVar3.l++;
                long longValue = ((Long) message.obj).longValue() + xVar3.f;
                xVar3.f = longValue;
                xVar3.i = longValue / ((long) xVar3.l);
            }
        }
    }

    public x(d dVar) {
        this.b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.a = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = b0.a;
        a0 a0Var = new a0(looper);
        a0Var.sendMessageDelayed(a0Var.obtainMessage(), 1000);
        this.c = new a(handlerThread.getLooper(), this);
    }

    public y a() {
        return new y(this.b.a(), this.b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }
}
