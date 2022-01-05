package i0.j.e.l0.b.k.j;

import com.instabug.library.internal.b.i.a;
import i0.j.e.l0.b.k.g;
import i0.j.e.l0.b.k.h;
import i0.j.e.l0.b.k.i;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: LogFileDisposalPolicy */
public class b extends c {
    public final /* synthetic */ String a;
    public final /* synthetic */ g[] b;
    public final /* synthetic */ a c;

    public b(String str, g[] gVarArr, a aVar) {
        this.a = str;
        this.b = gVarArr;
        this.c = aVar;
    }

    public a a() {
        return this.c;
    }

    public Collection<g> b() {
        return Arrays.asList(this.b);
    }

    public i c() {
        return new h(new e(), this.a);
    }
}
