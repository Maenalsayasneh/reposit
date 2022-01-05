package m0.r.t.a.r.e.b.t;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.e.a.q;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.j.p.f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class a implements j.c {
    public static final boolean a = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public static final Map<m0.r.t.a.r.g.a, KotlinClassHeader.Kind> b;
    public int[] c = null;
    public m0.r.t.a.r.f.d.a.c d = null;
    public String e = null;
    public int f = 0;
    public String g = null;
    public String[] h = null;
    public String[] i = null;
    public String[] j = null;
    public KotlinClassHeader.Kind k = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public static abstract class b implements j.b {
        public final List<String> a = new ArrayList();

        public void a() {
            e((String[]) this.a.toArray(new String[0]));
        }

        public void b(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        public void c(m0.r.t.a.r.g.a aVar, m0.r.t.a.r.g.d dVar) {
        }

        public void d(f fVar) {
        }

        public abstract void e(String[] strArr);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public class c implements j.a {
        public c(C0263a aVar) {
        }

        public static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a() {
        }

        public void b(m0.r.t.a.r.g.d dVar, f fVar) {
            if (dVar == null) {
                g(0);
                throw null;
            }
        }

        public void c(m0.r.t.a.r.g.d dVar, Object obj) {
            if (dVar != null) {
                String b = dVar.b();
                if ("k".equals(b)) {
                    if (obj instanceof Integer) {
                        a.this.k = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(b)) {
                    if (obj instanceof int[]) {
                        a.this.c = (int[]) obj;
                    }
                } else if ("bv".equals(b)) {
                    if (obj instanceof int[]) {
                        a.this.d = new m0.r.t.a.r.f.d.a.c((int[]) obj);
                    }
                } else if ("xs".equals(b)) {
                    if (obj instanceof String) {
                        a.this.e = (String) obj;
                    }
                } else if ("xi".equals(b)) {
                    if (obj instanceof Integer) {
                        a.this.f = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(b) && (obj instanceof String)) {
                    a.this.g = (String) obj;
                }
            }
        }

        public void d(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.g.a aVar, m0.r.t.a.r.g.d dVar2) {
            if (dVar == null) {
                g(3);
                throw null;
            }
        }

        public j.a e(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.g.a aVar) {
            if (dVar != null) {
                return null;
            }
            g(6);
            throw null;
        }

        public j.b f(m0.r.t.a.r.g.d dVar) {
            if (dVar != null) {
                String b = dVar.b();
                if ("d1".equals(b)) {
                    return new b(this);
                }
                if ("d2".equals(b)) {
                    return new c(this);
                }
                return null;
            }
            g(2);
            throw null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public class d implements j.a {
        public d(C0263a aVar) {
        }

        public static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a() {
        }

        public void b(m0.r.t.a.r.g.d dVar, f fVar) {
            if (dVar == null) {
                g(0);
                throw null;
            }
        }

        public void c(m0.r.t.a.r.g.d dVar, Object obj) {
            if (dVar != null) {
                String b = dVar.b();
                if ("version".equals(b)) {
                    if (obj instanceof int[]) {
                        a aVar = a.this;
                        int[] iArr = (int[]) obj;
                        aVar.c = iArr;
                        if (aVar.d == null) {
                            aVar.d = new m0.r.t.a.r.f.d.a.c(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(b)) {
                    a.this.e = obj instanceof String ? (String) obj : null;
                }
            }
        }

        public void d(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.g.a aVar, m0.r.t.a.r.g.d dVar2) {
            if (dVar == null) {
                g(3);
                throw null;
            }
        }

        public j.a e(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.g.a aVar) {
            if (dVar != null) {
                return null;
            }
            g(6);
            throw null;
        }

        public j.b f(m0.r.t.a.r.g.d dVar) {
            if (dVar != null) {
                String b = dVar.b();
                if (MessageExtension.FIELD_DATA.equals(b) || "filePartClassNames".equals(b)) {
                    return new d(this);
                }
                if ("strings".equals(b)) {
                    return new e(this);
                }
                return null;
            }
            g(2);
            throw null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public void a() {
    }

    public j.a b(m0.r.t.a.r.g.a aVar, h0 h0Var) {
        KotlinClassHeader.Kind kind;
        if (aVar.b().equals(q.a)) {
            return new c((C0263a) null);
        }
        if (a || this.k != null || (kind = b.get(aVar)) == null) {
            return null;
        }
        this.k = kind;
        return new d((C0263a) null);
    }
}
