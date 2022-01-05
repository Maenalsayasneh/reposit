package m0.r.t.a.r.b.k;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.e.b.p;
import m0.r.t.a.r.g.c;

/* compiled from: JvmBuiltInsSignatures.kt */
public final class k {
    public static final k a;
    public static final Set<String> b;
    public static final Set<String> c;
    public static final Set<String> d;
    public static final Set<String> e;
    public static final Set<String> f;
    public static final Set<String> g;

    static {
        k kVar = new k();
        a = kVar;
        p pVar = p.a;
        b = g.e0(pVar.e("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        Objects.requireNonNull(kVar);
        List<JvmPrimitiveType> K = g.K(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : K) {
            String b2 = jvmPrimitiveType.getWrapperFqName().g().b();
            i.d(b2, "it.wrapperFqName.shortName().asString()");
            g.b(linkedHashSet, pVar.d(b2, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        c = g.d0(g.d0(g.d0(g.d0(g.d0(g.d0(linkedHashSet, pVar.e("List", "sort(Ljava/util/Comparator;)V")), pVar.d("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), pVar.d("Double", "isInfinite()Z", "isNaN()Z")), pVar.d("Float", "isInfinite()Z", "isNaN()Z")), pVar.d("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), pVar.d("CharSequence", "isEmpty()Z"));
        p pVar2 = p.a;
        d = g.d0(g.d0(g.d0(g.d0(g.d0(g.d0(pVar2.d("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), pVar2.e("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), pVar2.d("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), pVar2.d("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), pVar2.e("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), pVar2.e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), pVar2.e("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        e = g.d0(g.d0(pVar2.e("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), pVar2.e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), pVar2.e("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Objects.requireNonNull(a);
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List<JvmPrimitiveType> K2 = g.K(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (JvmPrimitiveType wrapperFqName : K2) {
            String b3 = wrapperFqName.getWrapperFqName().g().b();
            i.d(b3, "it.wrapperFqName.shortName().asString()");
            String[] a2 = pVar2.a("Ljava/lang/String;");
            String[] strArr = new String[a2.length];
            System.arraycopy(a2, 0, strArr, 0, a2.length);
            g.b(linkedHashSet2, pVar2.d(b3, strArr));
        }
        String[] a3 = pVar2.a("D");
        String[] strArr2 = new String[a3.length];
        System.arraycopy(a3, 0, strArr2, 0, a3.length);
        Set<T> d0 = g.d0(linkedHashSet2, pVar2.d("Float", strArr2));
        String[] a4 = pVar2.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        String[] strArr3 = new String[a4.length];
        System.arraycopy(a4, 0, strArr3, 0, a4.length);
        f = g.d0(d0, pVar2.d("String", strArr3));
        p pVar3 = p.a;
        String[] a5 = pVar3.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        String[] strArr4 = new String[a5.length];
        System.arraycopy(a5, 0, strArr4, 0, a5.length);
        g = pVar3.d("Throwable", strArr4);
    }

    public final boolean a(c cVar) {
        i.e(cVar, "fqName");
        if (!i.a(cVar, g.a.h)) {
            m0.r.t.a.r.b.g gVar = m0.r.t.a.r.b.g.a;
            i.e(cVar, "arrayFqName");
            if (!(g.a.f51p0.get(cVar) != null)) {
                return false;
            }
        }
        return true;
    }
}
