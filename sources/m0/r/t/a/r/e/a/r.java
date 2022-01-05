package m0.r.t.a.r.e.a;

import java.util.LinkedHashSet;
import java.util.List;
import m0.j.g;
import m0.r.t.a.r.g.b;

/* compiled from: JvmAnnotationNames.kt */
public final class r {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final List<b> d;
    public static final b e;
    public static final b f = new b("javax.annotation.CheckForNull");
    public static final List<b> g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final List<b> l = g.K(q.k, q.l);
    public static final List<b> m = g.K(q.j, q.m);

    static {
        b bVar = new b("org.jspecify.annotations.Nullable");
        a = bVar;
        b bVar2 = new b("org.jspecify.annotations.NullnessUnspecified");
        b = bVar2;
        b bVar3 = new b("org.jspecify.annotations.DefaultNonNull");
        c = bVar3;
        List<b> K = g.K(q.i, new b("androidx.annotation.Nullable"), new b("android.support.annotation.Nullable"), new b("android.annotation.Nullable"), new b("com.android.annotations.Nullable"), new b("org.eclipse.jdt.annotation.Nullable"), new b("org.checkerframework.checker.nullness.qual.Nullable"), new b("javax.annotation.Nullable"), new b("javax.annotation.CheckForNull"), new b("edu.umd.cs.findbugs.annotations.CheckForNull"), new b("edu.umd.cs.findbugs.annotations.Nullable"), new b("edu.umd.cs.findbugs.annotations.PossiblyNull"), new b("io.reactivex.annotations.Nullable"));
        d = K;
        b bVar4 = new b("javax.annotation.Nonnull");
        e = bVar4;
        List<b> K2 = g.K(q.h, new b("edu.umd.cs.findbugs.annotations.NonNull"), new b("androidx.annotation.NonNull"), new b("android.support.annotation.NonNull"), new b("android.annotation.NonNull"), new b("com.android.annotations.NonNull"), new b("org.eclipse.jdt.annotation.NonNull"), new b("org.checkerframework.checker.nullness.qual.NonNull"), new b("lombok.NonNull"), new b("io.reactivex.annotations.NonNull"));
        g = K2;
        b bVar5 = new b("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        h = bVar5;
        b bVar6 = new b("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        i = bVar6;
        b bVar7 = new b("androidx.annotation.RecentlyNullable");
        j = bVar7;
        b bVar8 = new b("androidx.annotation.RecentlyNonNull");
        k = bVar8;
        g.e0(g.e0(g.e0(g.e0(g.e0(g.e0(g.e0(g.d0(g.e0(g.d0(new LinkedHashSet(), K), bVar4), K2), bVar5), bVar6), bVar7), bVar8), bVar), bVar2), bVar3);
    }
}
