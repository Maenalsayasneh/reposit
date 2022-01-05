package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import m0.r.t.a.r.e.a.x.e;
import m0.r.t.a.r.e.a.x.h;
import m0.r.t.a.r.e.a.x.i;
import m0.r.t.a.r.e.b.p;

/* compiled from: predefinedEnhancementInfo.kt */
public final class PredefinedEnhancementInfoKt {
    public static final e a = new e(NullabilityQualifier.NULLABLE, (MutabilityQualifier) null, false, false, 8);
    public static final e b;
    public static final e c;
    public static final Map<String, h> d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        b = new e(nullabilityQualifier, (MutabilityQualifier) null, false, false, 8);
        c = new e(nullabilityQualifier, (MutabilityQualifier) null, true, false, 8);
        p pVar = p.a;
        String g = pVar.g("Object");
        String f = pVar.f("Predicate");
        String f2 = pVar.f("Function");
        String f3 = pVar.f("Consumer");
        String f4 = pVar.f("BiFunction");
        String f5 = pVar.f("BiConsumer");
        String f6 = pVar.f("UnaryOperator");
        String h = pVar.h("stream/Stream");
        String h2 = pVar.h("Optional");
        i iVar = new i();
        new i.a(iVar, pVar.h("Iterator")).a("forEachRemaining", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1(f3));
        new i.a(iVar, pVar.g("Iterable")).a("spliterator", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1(pVar));
        i.a aVar = new i.a(iVar, pVar.h("Collection"));
        aVar.a("removeIf", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$1(f));
        aVar.a("stream", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$2(h));
        aVar.a("parallelStream", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3(h));
        new i.a(iVar, pVar.h("List")).a("replaceAll", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$4$1(f6));
        i.a aVar2 = new i.a(iVar, pVar.h("Map"));
        aVar2.a("forEach", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$1(f5));
        aVar2.a("putIfAbsent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$2(g));
        aVar2.a("replace", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3(g));
        aVar2.a("replace", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$4(g));
        aVar2.a("replaceAll", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$5(f4));
        aVar2.a("compute", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$6(g, f4));
        aVar2.a("computeIfAbsent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7(g, f2));
        aVar2.a("computeIfPresent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8(g, f4));
        aVar2.a("merge", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9(g, f4));
        i.a aVar3 = new i.a(iVar, h2);
        aVar3.a("empty", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$1(h2));
        aVar3.a("of", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$2(g, h2));
        aVar3.a("ofNullable", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3(g, h2));
        aVar3.a("get", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$4(g));
        aVar3.a("ifPresent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$5(f3));
        new i.a(iVar, pVar.g("ref/Reference")).a("get", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$7$1(g));
        new i.a(iVar, f).a("test", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$8$1(g));
        new i.a(iVar, pVar.f("BiPredicate")).a("test", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$9$1(g));
        new i.a(iVar, f3).a("accept", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$10$1(g));
        new i.a(iVar, f5).a("accept", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$11$1(g));
        new i.a(iVar, f2).a("apply", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$12$1(g));
        new i.a(iVar, f4).a("apply", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1(g));
        new i.a(iVar, pVar.f("Supplier")).a("get", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$14$1(g));
        d = iVar.a;
    }
}
