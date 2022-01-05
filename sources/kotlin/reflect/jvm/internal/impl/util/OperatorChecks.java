package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.text.Regex;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.n.a;
import m0.r.t.a.r.n.b;
import m0.r.t.a.r.n.d;
import m0.r.t.a.r.n.e;
import m0.r.t.a.r.n.f;
import m0.r.t.a.r.n.h;
import m0.r.t.a.r.n.i;
import m0.r.t.a.r.n.j;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks extends a {
    public static final OperatorChecks a = new OperatorChecks();
    public static final List<d> b;

    static {
        m0.r.t.a.r.g.d dVar = i.i;
        f.b bVar = f.b.b;
        b[] bVarArr = {bVar, new j.a(1)};
        m0.r.t.a.r.g.d dVar2 = i.j;
        b[] bVarArr2 = {bVar, new j.a(2)};
        m0.r.t.a.r.g.d dVar3 = i.a;
        h hVar = h.a;
        e eVar = e.a;
        b[] bVarArr3 = {bVar, hVar, new j.a(2), eVar};
        m0.r.t.a.r.g.d dVar4 = i.b;
        b[] bVarArr4 = {bVar, hVar, new j.a(3), eVar};
        m0.r.t.a.r.g.d dVar5 = i.c;
        b[] bVarArr5 = {bVar, hVar, new j.b(2), eVar};
        m0.r.t.a.r.g.d dVar6 = i.g;
        b[] bVarArr6 = {bVar};
        m0.r.t.a.r.g.d dVar7 = i.f;
        j.d dVar8 = j.d.b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.d;
        b[] bVarArr7 = {bVar, dVar8, hVar, returnsBoolean};
        m0.r.t.a.r.g.d dVar9 = i.h;
        j.c cVar = j.c.b;
        b[] bVarArr8 = {bVar, cVar};
        m0.r.t.a.r.g.d dVar10 = i.k;
        b[] bVarArr9 = {bVar, cVar};
        m0.r.t.a.r.g.d dVar11 = i.l;
        b[] bVarArr10 = {bVar, cVar, returnsBoolean};
        m0.r.t.a.r.g.d dVar12 = i.y;
        b[] bVarArr11 = {bVar, dVar8, hVar};
        m0.r.t.a.r.g.d dVar13 = i.d;
        b[] bVarArr12 = {f.a.b};
        m0.r.t.a.r.g.d dVar14 = i.e;
        b[] bVarArr13 = {bVar, ReturnsCheck.ReturnsInt.d, dVar8, hVar};
        Set<m0.r.t.a.r.g.d> set = i.G;
        b[] bVarArr14 = {bVar, dVar8, hVar};
        Set<m0.r.t.a.r.g.d> set2 = i.F;
        b[] bVarArr15 = {bVar, cVar};
        List K = g.K(i.n, i.o);
        b[] bVarArr16 = {bVar};
        Set<m0.r.t.a.r.g.d> set3 = i.H;
        b[] bVarArr17 = {bVar, ReturnsCheck.ReturnsUnit.d, dVar8, hVar};
        Regex regex = i.m;
        b[] bVarArr18 = {bVar, cVar};
        Checks$3 checks$3 = Checks$3.c;
        m0.n.b.i.e(regex, "regex");
        m0.n.b.i.e(bVarArr18, "checks");
        m0.n.b.i.e(checks$3, "additionalChecks");
        b[] bVarArr19 = new b[2];
        System.arraycopy(bVarArr18, 0, bVarArr19, 0, 2);
        b = g.K(new d(dVar, bVarArr, (l) null, 4), new d(dVar2, bVarArr2, (l<? super r, String>) OperatorChecks$checks$1.c), new d(dVar3, bVarArr3, (l) null, 4), new d(dVar4, bVarArr4, (l) null, 4), new d(dVar5, bVarArr5, (l) null, 4), new d(dVar6, bVarArr6, (l) null, 4), new d(dVar7, bVarArr7, (l) null, 4), new d(dVar9, bVarArr8, (l) null, 4), new d(dVar10, bVarArr9, (l) null, 4), new d(dVar11, bVarArr10, (l) null, 4), new d(dVar12, bVarArr11, (l) null, 4), new d(dVar13, bVarArr12, (l<? super r, String>) OperatorChecks$checks$2.c), new d(dVar14, bVarArr13, (l) null, 4), new d((Collection) set, bVarArr14, (l) null, 4), new d((Collection) set2, bVarArr15, (l) null, 4), new d((Collection<m0.r.t.a.r.g.d>) K, bVarArr16, (l<? super r, String>) OperatorChecks$checks$3.c), new d((Collection) set3, bVarArr17, (l) null, 4), new d((m0.r.t.a.r.g.d) null, regex, (Collection<m0.r.t.a.r.g.d>) null, checks$3, bVarArr19));
    }

    public List<d> a() {
        return b;
    }
}
