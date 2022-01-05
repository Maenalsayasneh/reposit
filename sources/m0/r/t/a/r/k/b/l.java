package m0.r.t.a.r.k.b;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.r.t.a.r.c.d;

/* compiled from: ErrorReporter */
public interface l {
    public static final l a = new a();

    /* compiled from: ErrorReporter */
    public static class a implements l {
        public static /* synthetic */ void c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                c(2);
                throw null;
            }
        }

        public void b(d dVar, List<String> list) {
            if (dVar == null) {
                c(0);
                throw null;
            }
        }
    }

    void a(CallableMemberDescriptor callableMemberDescriptor);

    void b(d dVar, List<String> list);
}
