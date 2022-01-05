package m0.r.t.a.r.k.b;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: ProtoEnumFlags.kt */
public final class s {
    public static final s a = new s();

    /* compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            ProtoBuf$Modality.values();
            int[] iArr = new int[4];
            iArr[ProtoBuf$Modality.FINAL.ordinal()] = 1;
            iArr[ProtoBuf$Modality.OPEN.ordinal()] = 2;
            iArr[ProtoBuf$Modality.ABSTRACT.ordinal()] = 3;
            iArr[ProtoBuf$Modality.SEALED.ordinal()] = 4;
            a = iArr;
            Modality.values();
            int[] iArr2 = new int[4];
            iArr2[Modality.FINAL.ordinal()] = 1;
            iArr2[Modality.OPEN.ordinal()] = 2;
            iArr2[Modality.ABSTRACT.ordinal()] = 3;
            iArr2[Modality.SEALED.ordinal()] = 4;
            ProtoBuf$Visibility.values();
            int[] iArr3 = new int[6];
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            ProtoBuf$Class.Kind.values();
            int[] iArr4 = new int[7];
            iArr4[ProtoBuf$Class.Kind.CLASS.ordinal()] = 1;
            iArr4[ProtoBuf$Class.Kind.INTERFACE.ordinal()] = 2;
            iArr4[ProtoBuf$Class.Kind.ENUM_CLASS.ordinal()] = 3;
            iArr4[ProtoBuf$Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            iArr4[ProtoBuf$Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[ProtoBuf$Class.Kind.OBJECT.ordinal()] = 6;
            iArr4[ProtoBuf$Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            b = iArr4;
            ClassKind.values();
            int[] iArr5 = new int[6];
            iArr5[ClassKind.CLASS.ordinal()] = 1;
            iArr5[ClassKind.INTERFACE.ordinal()] = 2;
            iArr5[ClassKind.ENUM_CLASS.ordinal()] = 3;
            iArr5[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            iArr5[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[ClassKind.OBJECT.ordinal()] = 6;
            ProtoBuf$TypeParameter.Variance.values();
            int[] iArr6 = new int[3];
            iArr6[ProtoBuf$TypeParameter.Variance.IN.ordinal()] = 1;
            iArr6[ProtoBuf$TypeParameter.Variance.OUT.ordinal()] = 2;
            iArr6[ProtoBuf$TypeParameter.Variance.INV.ordinal()] = 3;
            c = iArr6;
            ProtoBuf$Type.Argument.Projection.values();
            int[] iArr7 = new int[4];
            iArr7[ProtoBuf$Type.Argument.Projection.IN.ordinal()] = 1;
            iArr7[ProtoBuf$Type.Argument.Projection.OUT.ordinal()] = 2;
            iArr7[ProtoBuf$Type.Argument.Projection.INV.ordinal()] = 3;
            iArr7[ProtoBuf$Type.Argument.Projection.STAR.ordinal()] = 4;
            d = iArr7;
            Variance.values();
            int[] iArr8 = new int[3];
            iArr8[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr8[Variance.OUT_VARIANCE.ordinal()] = 2;
            iArr8[Variance.INVARIANT.ordinal()] = 3;
        }
    }

    public final Modality a(ProtoBuf$Modality protoBuf$Modality) {
        int i = protoBuf$Modality == null ? -1 : a.a[protoBuf$Modality.ordinal()];
        if (i == 1) {
            return Modality.FINAL;
        }
        if (i == 2) {
            return Modality.OPEN;
        }
        if (i == 3) {
            return Modality.ABSTRACT;
        }
        if (i != 4) {
            return Modality.FINAL;
        }
        return Modality.SEALED;
    }
}
