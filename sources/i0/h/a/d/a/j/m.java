package i0.h.a.d.a.j;

public final class m<ResultT> {
    public final p<ResultT> a = new p<>();

    public final void a(Exception exc) {
        p<ResultT> pVar = this.a;
        synchronized (pVar.a) {
            if (!pVar.c) {
                pVar.c = true;
                pVar.e = exc;
                pVar.b.b(pVar);
            }
        }
    }

    public final void b(ResultT resultt) {
        p<ResultT> pVar = this.a;
        synchronized (pVar.a) {
            if (!pVar.c) {
                pVar.c = true;
                pVar.d = resultt;
                pVar.b.b(pVar);
            }
        }
    }
}
