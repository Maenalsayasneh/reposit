package m0.r.t.a.r.k.b;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

/* compiled from: ProtoEnumFlagsUtils.kt */
public final /* synthetic */ class t {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        ProtoBuf$MemberKind.values();
        int[] iArr = new int[4];
        iArr[ProtoBuf$MemberKind.DECLARATION.ordinal()] = 1;
        iArr[ProtoBuf$MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
        iArr[ProtoBuf$MemberKind.DELEGATION.ordinal()] = 3;
        iArr[ProtoBuf$MemberKind.SYNTHESIZED.ordinal()] = 4;
        a = iArr;
        CallableMemberDescriptor.Kind.values();
        int[] iArr2 = new int[4];
        iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
        iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
        iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
        iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
        ProtoBuf$Visibility.values();
        int[] iArr3 = new int[6];
        iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
        iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
        iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
        iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
        iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
        iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
        b = iArr3;
    }
}
