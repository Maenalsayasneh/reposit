package m0.r.t.a.r.o;

import i0.j.f.p.h;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.utils.JavaTypeEnhancementState$description$2;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import m0.c;
import m0.n.b.i;

/* compiled from: JavaTypeEnhancementState.kt */
public final class g {
    public static final ReportLevel a;
    public static final g b;
    public final ReportLevel c;
    public final ReportLevel d;
    public final Map<String, ReportLevel> e;
    public final boolean f;
    public final ReportLevel g;
    public final c h;
    public final boolean i;
    public final boolean j;

    static {
        ReportLevel reportLevel = ReportLevel.WARN;
        a = reportLevel;
        new g(reportLevel, (ReportLevel) null, m0.j.g.o(), false, (ReportLevel) null, 24);
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        b = new g(reportLevel2, reportLevel2, m0.j.g.o(), false, (ReportLevel) null, 24);
        ReportLevel reportLevel3 = ReportLevel.STRICT;
        new g(reportLevel3, reportLevel3, m0.j.g.o(), false, (ReportLevel) null, 24);
    }

    public g(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, boolean z, ReportLevel reportLevel3, int i2) {
        boolean z2 = true;
        z = (i2 & 8) != 0 ? true : z;
        ReportLevel reportLevel4 = (i2 & 16) != 0 ? a : null;
        i.e(reportLevel, "globalJsr305Level");
        i.e(map, "userDefinedLevelForSpecificJsr305Annotation");
        i.e(reportLevel4, "jspecifyReportLevel");
        this.c = reportLevel;
        this.d = reportLevel2;
        this.e = map;
        this.f = z;
        this.g = reportLevel4;
        this.h = h.H2(new JavaTypeEnhancementState$description$2(this));
        ReportLevel reportLevel5 = ReportLevel.IGNORE;
        boolean z3 = reportLevel == reportLevel5 && reportLevel2 == reportLevel5;
        this.i = z3;
        if (!z3 && reportLevel4 != reportLevel5) {
            z2 = false;
        }
        this.j = z2;
    }
}
