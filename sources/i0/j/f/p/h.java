package i0.j.f.p;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.session.config.SessionsConfigParameter;
import com.instabug.library.ui.custom.MaterialMenuDrawable;
import com.instabug.survey.models.Survey;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.Requirement;
import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.sinch.verification.utils.permission.Permission;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.theartofdev.edmodo.cropper.R;
import h0.q.m0;
import h0.v.a.k;
import i0.d.a.a.a;
import i0.n.a.b;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidParameterSpecException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k0.b.q;
import k0.b.y.e;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.SafePublicationLazyImpl;
import kotlin.SynchronizedLazyImpl;
import kotlin.UnsafeLazyImpl;
import kotlin.collections.ArraysKt___ArraysKt$withIndex$1;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$signature$1;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$2;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.l;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.q0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t;
import m0.r.t.a.r.c.t0.b0;
import m0.r.t.a.r.c.t0.d0;
import m0.r.t.a.r.c.t0.g0;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v0.b.r;
import m0.r.t.a.r.c.w;
import m0.r.t.a.r.c.x;
import m0.r.t.a.r.d.a.c;
import m0.r.t.a.r.e.a.o;
import m0.r.t.a.r.e.a.w.y;
import m0.r.t.a.r.e.b.i;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.c0;
import m0.r.t.a.r.m.f0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.l0;
import m0.r.t.a.r.m.p0;
import m0.r.t.a.r.m.r0;
import m0.r.t.a.r.m.s;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.t0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.j;
import m0.r.t.a.r.m.z0.k;
import m0.r.t.a.r.o.j;
import m0.s.p;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.b.i0.n;
import s0.a.b.k0.y0;

/* compiled from: SurveysFilterFunctions */
public final class h {
    public static BouncyCastleProvider a;
    public static Thread b;
    public static volatile e<Callable<q>, q> c;
    public static volatile e<q, q> d;

    /* JADX WARNING: type inference failed for: r3v0, types: [m0.r.t.a.r.c.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.c.a0 A(m0.r.t.a.r.m.v r5, m0.r.t.a.r.c.g r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0059
            boolean r1 = m0.r.t.a.r.m.p.j(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x0059
        L_0x000a:
            java.util.List r1 = r6.t()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.L()
            if (r2 != 0) goto L_0x003c
            java.util.List r2 = r5.H0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0026
            m0.r.t.a.r.j.d.t(r6)
        L_0x0026:
            m0.r.t.a.r.c.a0 r1 = new m0.r.t.a.r.c.a0
            java.util.List r2 = r5.H0()
            java.util.List r5 = r5.H0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003c:
            java.util.List r2 = r5.H0()
            java.util.List r7 = r2.subList(r7, r1)
            m0.r.t.a.r.c.a0 r2 = new m0.r.t.a.r.c.a0
            m0.r.t.a.r.c.i r3 = r6.b()
            boolean r4 = r3 instanceof m0.r.t.a.r.c.g
            if (r4 == 0) goto L_0x0051
            r0 = r3
            m0.r.t.a.r.c.g r0 = (m0.r.t.a.r.c.g) r0
        L_0x0051:
            m0.r.t.a.r.c.a0 r5 = A(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.A(m0.r.t.a.r.m.v, m0.r.t.a.r.c.g, int):m0.r.t.a.r.c.a0");
    }

    public static c A0(f fVar, b bVar) {
        Object obj;
        i.e(fVar, "this");
        i.e(bVar, "fqName");
        Iterator it = fVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i.a(((c) obj).d(), bVar)) {
                break;
            }
        }
        return (c) obj;
    }

    public static PrimitiveType A1(m0.r.t.a.r.m.x0.c cVar, j jVar) {
        i.e(cVar, "this");
        i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            m0.r.t.a.r.c.f c2 = ((j0) jVar).c();
            Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return m0.r.t.a.r.b.f.s((d) c2);
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static boolean A2(byte[] bArr, int i, int i2) {
        return i3(bArr, i, i2) == 0;
    }

    public static final d A3(u uVar, b bVar, m0.r.t.a.r.d.a.b bVar2) {
        l lVar;
        MemberScope w0;
        i.e(uVar, "<this>");
        i.e(bVar, "fqName");
        i.e(bVar2, "lookupLocation");
        if (bVar.d()) {
            return null;
        }
        b e = bVar.e();
        i.d(e, "fqName.parent()");
        MemberScope o = uVar.M(e).o();
        m0.r.t.a.r.g.d g = bVar.g();
        i.d(g, "fqName.shortName()");
        m0.r.t.a.r.c.f f = o.f(g, bVar2);
        d dVar = f instanceof d ? (d) f : null;
        if (dVar != null) {
            return dVar;
        }
        b e2 = bVar.e();
        i.d(e2, "fqName.parent()");
        d A3 = A3(uVar, e2, bVar2);
        if (A3 == null || (w0 = A3.w0()) == null) {
            lVar = null;
        } else {
            m0.r.t.a.r.g.d g2 = bVar.g();
            i.d(g2, "fqName.shortName()");
            lVar = w0.f(g2, bVar2);
        }
        if (lVar instanceof d) {
            return (d) lVar;
        }
        return null;
    }

    public static g A4(m0.r.t.a.r.m.z0.l lVar, m0.r.t.a.r.m.z0.f fVar) {
        i.e(lVar, "this");
        i.e(fVar, "receiver");
        m0.r.t.a.r.m.z0.d g = lVar.g(fVar);
        if (g != null) {
            return lVar.m(g);
        }
        g a2 = lVar.a(fVar);
        i.c(a2);
        return a2;
    }

    public static <M extends Member> void B(m0.r.t.a.q.c<? extends M> cVar, Object[] objArr) {
        i.e(objArr, "args");
        if (S0(cVar) != objArr.length) {
            StringBuilder P0 = a.P0("Callable expects ");
            P0.append(S0(cVar));
            P0.append(" arguments, but ");
            throw new IllegalArgumentException(a.u0(P0, objArr.length, " were provided."));
        }
    }

    public static m0.r.t.a.r.c.v0.b.b B0(m0.r.t.a.r.c.v0.b.e eVar, b bVar) {
        Annotation[] declaredAnnotations;
        i.e(eVar, "this");
        i.e(bVar, "fqName");
        AnnotatedElement u = eVar.u();
        if (u == null || (declaredAnnotations = u.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C0(declaredAnnotations, bVar);
    }

    public static PrimitiveType B1(m0.r.t.a.r.m.x0.c cVar, j jVar) {
        i.e(cVar, "this");
        i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            m0.r.t.a.r.c.f c2 = ((j0) jVar).c();
            Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return m0.r.t.a.r.b.f.u((d) c2);
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static String B2(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    sb.append(", ");
                } else if (i == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    public static <D extends CallableMemberDescriptor> Collection<D> B3(m0.r.t.a.r.g.d dVar, Collection<D> collection, Collection<D> collection2, d dVar2, m0.r.t.a.r.k.b.l lVar, OverridingUtil overridingUtil, boolean z) {
        if (dVar == null) {
            c(12);
            throw null;
        } else if (collection == null) {
            c(13);
            throw null;
        } else if (collection2 == null) {
            c(14);
            throw null;
        } else if (dVar2 == null) {
            c(15);
            throw null;
        } else if (lVar == null) {
            c(16);
            throw null;
        } else if (overridingUtil != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            overridingUtil.h(dVar, collection, collection2, dVar2, new m0.r.t.a.r.e.a.s.a(lVar, linkedHashSet, z));
            return linkedHashSet;
        } else {
            c(17);
            throw null;
        }
    }

    public static final a0 B4(v vVar) {
        i.e(vVar, "<this>");
        v0 L0 = vVar.L0();
        if (L0 instanceof m0.r.t.a.r.m.q) {
            return ((m0.r.t.a.r.m.q) L0).q;
        }
        if (L0 instanceof a0) {
            return (a0) L0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static <T> void C(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    public static final m0.r.t.a.r.c.v0.b.b C0(Annotation[] annotationArr, b bVar) {
        Annotation annotation;
        i.e(annotationArr, "<this>");
        i.e(bVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (i.a(ReflectClassUtilKt.b(l1(N0(annotation))).b(), bVar)) {
                break;
            }
            i++;
        }
        if (annotation == null) {
            return null;
        }
        return new m0.r.t.a.r.c.v0.b.b(annotation);
    }

    public static final int C1(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - V2(V2(i2, i3) - V2(i, i3), i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            int i4 = -i3;
            return i2 + V2(V2(i, i4) - V2(i2, i4), i4);
        }
    }

    public static final <T> Iterator<T> C2(T[] tArr) {
        i.e(tArr, "array");
        return new m0.n.b.a(tArr);
    }

    public static <D extends CallableMemberDescriptor> Collection<D> C3(m0.r.t.a.r.g.d dVar, Collection<D> collection, Collection<D> collection2, d dVar2, m0.r.t.a.r.k.b.l lVar, OverridingUtil overridingUtil) {
        if (dVar == null) {
            c(0);
            throw null;
        } else if (collection == null) {
            c(1);
            throw null;
        } else if (collection2 == null) {
            c(2);
            throw null;
        } else if (dVar2 == null) {
            c(3);
            throw null;
        } else if (lVar == null) {
            c(4);
            throw null;
        } else if (overridingUtil != null) {
            return B3(dVar, collection, collection2, dVar2, lVar, overridingUtil, false);
        } else {
            c(5);
            throw null;
        }
    }

    public static void C4() {
        if (!RxJavaPlugins.isFailOnNonBlockingScheduler()) {
            return;
        }
        if ((Thread.currentThread() instanceof k0.b.z.g.f) || RxJavaPlugins.onBeforeBlocking()) {
            StringBuilder P0 = a.P0("Attempt to block on a Scheduler ");
            P0.append(Thread.currentThread().getName());
            P0.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(P0.toString());
        }
    }

    public static void D(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final d D0(u uVar, m0.r.t.a.r.g.a aVar) {
        i.e(uVar, "<this>");
        i.e(aVar, "classId");
        m0.r.t.a.r.c.f E0 = E0(uVar, aVar);
        if (E0 instanceof d) {
            return (d) E0;
        }
        return null;
    }

    public static m0.r.t.a.r.m.z0.f D1(m0.r.t.a.r.m.x0.c cVar, k kVar) {
        i.e(cVar, "this");
        i.e(kVar, "receiver");
        if (kVar instanceof m0) {
            return m0.r.t.a.r.m.a1.a.V1((m0) kVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + m.a(kVar.getClass())).toString());
    }

    public static final <T, A extends Appendable> A D2(T[] tArr, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, m0.n.a.l<? super T, ? extends CharSequence> lVar) {
        i.e(tArr, "$this$joinTo");
        i.e(a2, "buffer");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            m0.r.t.a.r.m.a1.a.O(a2, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> D3(m0.r.t.a.r.g.d dVar, Collection<D> collection, Collection<D> collection2, d dVar2, m0.r.t.a.r.k.b.l lVar, OverridingUtil overridingUtil) {
        if (collection == null) {
            c(7);
            throw null;
        } else if (dVar2 == null) {
            c(9);
            throw null;
        } else if (lVar == null) {
            c(10);
            throw null;
        } else if (overridingUtil != null) {
            return B3(dVar, collection, collection2, dVar2, lVar, overridingUtil, true);
        } else {
            c(11);
            throw null;
        }
    }

    public static /* synthetic */ void D4(i0.n.a.c cVar, String str, Throwable th, int i, Object obj) {
        int i2 = i & 2;
        cVar.a(str, (Throwable) null);
    }

    public static final m0.r.t.a.r.e.a.u.c E(m0.r.t.a.r.e.a.u.c cVar, m0.r.t.a.r.c.i iVar, y yVar, int i, m0.c<o> cVar2) {
        m0.r.t.a.r.e.a.u.f fVar;
        m0.r.t.a.r.e.a.u.a aVar = cVar.a;
        if (yVar == null) {
            fVar = null;
        } else {
            fVar = new LazyJavaTypeParameterResolver(cVar, iVar, yVar, i);
        }
        if (fVar == null) {
            fVar = cVar.b;
        }
        return new m0.r.t.a.r.e.a.u.c(aVar, fVar, cVar2);
    }

    public static final m0.r.t.a.r.c.f E0(u uVar, m0.r.t.a.r.g.a aVar) {
        m0.r.t.a.r.c.f fVar;
        i.e(uVar, "<this>");
        i.e(aVar, "classId");
        t<m0.r.t.a.r.j.l> tVar = m0.r.t.a.r.j.m.a;
        i.e(uVar, "<this>");
        m0.r.t.a.r.j.l lVar = (m0.r.t.a.r.j.l) uVar.D0(m0.r.t.a.r.j.m.a);
        u a2 = lVar == null ? null : lVar.a(uVar);
        if (a2 == null) {
            b h = aVar.h();
            i.d(h, "classId.packageFqName");
            m0.r.t.a.r.c.y M = uVar.M(h);
            List<m0.r.t.a.r.g.d> f = aVar.i().f();
            i.d(f, "classId.relativeClassName.pathSegments()");
            MemberScope o = M.o();
            Object u = m0.j.g.u(f);
            i.d(u, "segments.first()");
            fVar = o.f((m0.r.t.a.r.g.d) u, NoLookupLocation.FROM_DESERIALIZATION);
            if (fVar == null) {
                return null;
            }
            for (m0.r.t.a.r.g.d next : f.subList(1, f.size())) {
                if (!(fVar instanceof d)) {
                    return null;
                }
                MemberScope w0 = ((d) fVar).w0();
                i.d(next, "name");
                m0.r.t.a.r.c.f f2 = w0.f(next, NoLookupLocation.FROM_DESERIALIZATION);
                if (f2 instanceof d) {
                    fVar = (d) f2;
                    continue;
                } else {
                    fVar = null;
                    continue;
                }
                if (fVar == null) {
                    return null;
                }
            }
        } else {
            b h2 = aVar.h();
            i.d(h2, "classId.packageFqName");
            m0.r.t.a.r.c.y M2 = a2.M(h2);
            List<m0.r.t.a.r.g.d> f3 = aVar.i().f();
            i.d(f3, "classId.relativeClassName.pathSegments()");
            MemberScope o2 = M2.o();
            Object u2 = m0.j.g.u(f3);
            i.d(u2, "segments.first()");
            m0.r.t.a.r.c.f f4 = o2.f((m0.r.t.a.r.g.d) u2, NoLookupLocation.FROM_DESERIALIZATION);
            if (f4 != null) {
                Iterator<m0.r.t.a.r.g.d> it = f3.subList(1, f3.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    m0.r.t.a.r.g.d next2 = it.next();
                    if (f4 instanceof d) {
                        MemberScope w02 = ((d) f4).w0();
                        i.d(next2, "name");
                        m0.r.t.a.r.c.f f5 = w02.f(next2, NoLookupLocation.FROM_DESERIALIZATION);
                        if (f5 instanceof d) {
                            f4 = (d) f5;
                            continue;
                        } else {
                            f4 = null;
                            continue;
                        }
                        if (f4 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            f4 = null;
            if (f4 != null) {
                return f4;
            }
            b h3 = aVar.h();
            i.d(h3, "classId.packageFqName");
            m0.r.t.a.r.c.y M3 = uVar.M(h3);
            List<m0.r.t.a.r.g.d> f6 = aVar.i().f();
            i.d(f6, "classId.relativeClassName.pathSegments()");
            MemberScope o3 = M3.o();
            Object u3 = m0.j.g.u(f6);
            i.d(u3, "segments.first()");
            m0.r.t.a.r.c.f f7 = o3.f((m0.r.t.a.r.g.d) u3, NoLookupLocation.FROM_DESERIALIZATION);
            if (f7 == null) {
                return null;
            }
            for (m0.r.t.a.r.g.d next3 : f6.subList(1, f6.size())) {
                if (!(fVar instanceof d)) {
                    return null;
                }
                MemberScope w03 = ((d) fVar).w0();
                i.d(next3, "name");
                m0.r.t.a.r.c.f f8 = w03.f(next3, NoLookupLocation.FROM_DESERIALIZATION);
                if (f8 instanceof d) {
                    f7 = (d) f8;
                    continue;
                } else {
                    f7 = null;
                    continue;
                }
                if (f7 == null) {
                    return null;
                }
            }
        }
        return fVar;
    }

    public static List<String> E1(Map<String, Object> map, String str) throws ParseException {
        String[] strArr;
        List<Object> j1 = j1(map, str);
        if (j1 == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) j1.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                throw new ParseException(a.o0("JSON object member with key \"", str, "\" is not an array of strings"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public static String E2(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, m0.n.a.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) != 0 ? "" : charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str3 = (i2 & 16) != 0 ? "..." : null;
        m0.n.a.l lVar2 = (i2 & 32) != 0 ? null : lVar;
        i.e(objArr, "$this$joinToString");
        i.e(charSequence5, "separator");
        i.e(str, "prefix");
        i.e(str2, "postfix");
        i.e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        D2(objArr, sb, charSequence5, str, str2, i3, str3, lVar2);
        String sb2 = sb.toString();
        i.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final ProtoBuf$Type E3(ProtoBuf$Function protoBuf$Function, m0.r.t.a.r.f.c.e eVar) {
        i.e(protoBuf$Function, "<this>");
        i.e(eVar, "typeTable");
        if (protoBuf$Function.z()) {
            ProtoBuf$Type protoBuf$Type = protoBuf$Function.b2;
            i.d(protoBuf$Type, "returnType");
            return protoBuf$Type;
        }
        if ((protoBuf$Function.y & 16) == 16) {
            return eVar.a(protoBuf$Function.c2);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final <T> Iterable<m0.j.l<T>> E4(T[] tArr) {
        i.e(tArr, "$this$withIndex");
        return new m0.j.m(new ArraysKt___ArraysKt$withIndex$1(tArr));
    }

    public static m0.r.t.a.r.e.a.u.c F(m0.r.t.a.r.e.a.u.c cVar, m0.r.t.a.r.c.e eVar, y yVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            yVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        i.e(cVar, "<this>");
        i.e(eVar, "containingDeclaration");
        return E(cVar, eVar, yVar, i, G2(LazyThreadSafetyMode.NONE, new ContextKt$childForClassOrPackage$1(cVar, eVar)));
    }

    public static final m0.r.t.a.r.e.b.j F0(m0.r.t.a.r.e.b.i iVar, m0.r.t.a.r.g.a aVar) {
        i.e(iVar, "<this>");
        i.e(aVar, "classId");
        i.a c2 = iVar.c(aVar);
        if (c2 == null) {
            return null;
        }
        return c2.a();
    }

    public static m0.r.t.a.r.m.z0.f F1(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar) {
        o0 o0Var;
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        if (fVar instanceof v) {
            v vVar = (v) fVar;
            int i = m0.r.t.a.r.j.e.a;
            m0.n.b.i.e(vVar, "<this>");
            m0.n.b.i.e(vVar, "<this>");
            m0.r.t.a.r.c.f c2 = vVar.I0().c();
            if (!(c2 instanceof d)) {
                c2 = null;
            }
            d dVar = (d) c2;
            if (dVar == null) {
                o0Var = null;
            } else {
                o0Var = m0.r.t.a.r.j.e.e(dVar);
            }
            if (o0Var == null) {
                return null;
            }
            return TypeSubstitutor.d(vVar).k(o0Var.getType(), Variance.INVARIANT);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public static final <T> T F2(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            return tArr[t1(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final ProtoBuf$Type F3(ProtoBuf$Property protoBuf$Property, m0.r.t.a.r.f.c.e eVar) {
        m0.n.b.i.e(protoBuf$Property, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        if (protoBuf$Property.z()) {
            ProtoBuf$Type protoBuf$Type = protoBuf$Property.b2;
            m0.n.b.i.d(protoBuf$Type, "returnType");
            return protoBuf$Type;
        }
        if ((protoBuf$Property.y & 16) == 16) {
            return eVar.a(protoBuf$Property.c2);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static g F4(m0.r.t.a.r.m.x0.c cVar, g gVar, boolean z) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "receiver");
        if (gVar instanceof a0) {
            return ((a0) gVar).M0(z);
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    public static m0.r.t.a.r.e.a.u.c G(m0.r.t.a.r.e.a.u.c cVar, m0.r.t.a.r.c.i iVar, y yVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(iVar, "containingDeclaration");
        m0.n.b.i.e(yVar, "typeParameterOwner");
        return E(cVar, iVar, yVar, i, cVar.c);
    }

    public static final d G0(u uVar, m0.r.t.a.r.g.a aVar, NotFoundClasses notFoundClasses) {
        m0.n.b.i.e(uVar, "<this>");
        m0.n.b.i.e(aVar, "classId");
        m0.n.b.i.e(notFoundClasses, "notFoundClasses");
        d D0 = D0(uVar, aVar);
        if (D0 != null) {
            return D0;
        }
        return notFoundClasses.a(aVar, SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.g(m0.r.t.a.r.m.a1.a.C1(aVar, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.c), FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2.c)));
    }

    public static m0.r.t.a.r.m.z0.f G1(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.i iVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(iVar, "receiver");
        if (iVar instanceof m0.r.t.a.r.m.m0) {
            return ((m0.r.t.a.r.m.m0) iVar).getType().L0();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + m.a(iVar.getClass())).toString());
    }

    public static final <T> m0.c<T> G2(LazyThreadSafetyMode lazyThreadSafetyMode, m0.n.a.a<? extends T> aVar) {
        m0.n.b.i.e(lazyThreadSafetyMode, SessionsConfigParameter.SYNC_MODE);
        m0.n.b.i.e(aVar, "initializer");
        int ordinal = lazyThreadSafetyMode.ordinal();
        if (ordinal == 0) {
            return new SynchronizedLazyImpl(aVar, (Object) null, 2);
        }
        if (ordinal == 1) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (ordinal == 2) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int G3(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public static final v0 G4(v0 v0Var, v vVar) {
        m0.n.b.i.e(v0Var, "<this>");
        if (vVar == null) {
            return v0Var;
        }
        if (v0Var instanceof a0) {
            return new c0((a0) v0Var, vVar);
        }
        if (v0Var instanceof m0.r.t.a.r.m.q) {
            return new s((m0.r.t.a.r.m.q) v0Var, vVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void H(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m(th, th2);
            }
        }
    }

    public static final <T> T H0(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static k H1(m0.r.t.a.r.m.x0.c cVar, j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            m0.r.t.a.r.c.f c2 = ((j0) jVar).c();
            if (c2 instanceof m0) {
                return (m0) c2;
            }
            return null;
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static final <T> m0.c<T> H2(m0.n.a.a<? extends T> aVar) {
        m0.n.b.i.e(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar, (Object) null, 2);
    }

    public static final <T> T H3(Context context, Permission permission, m0.n.a.a<? extends T> aVar, m0.n.a.a<m0.i> aVar2) {
        m0.n.b.i.e(context, "$this$runIfPermissionGranted");
        m0.n.b.i.e(permission, "permission");
        m0.n.b.i.e(aVar, "grantedBlock");
        m0.n.b.i.e(aVar2, "notGrantedBlock");
        if (t2(context, permission)) {
            return aVar.invoke();
        }
        aVar2.invoke();
        return null;
    }

    public static p0 H4(p0 p0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        m0.n.b.i.e(p0Var, "<this>");
        if (!(p0Var instanceof m0.r.t.a.r.m.t)) {
            return new m0.r.t.a.r.j.o.a.d(z, p0Var);
        }
        m0.r.t.a.r.m.t tVar = (m0.r.t.a.r.m.t) p0Var;
        m0[] m0VarArr = tVar.b;
        m0.r.t.a.r.m.m0[] m0VarArr2 = tVar.c;
        m0.n.b.i.e(m0VarArr2, "$this$zip");
        m0.n.b.i.e(m0VarArr, RecaptchaActionType.OTHER);
        int min = Math.min(m0VarArr2.length, m0VarArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(new Pair(m0VarArr2[i2], m0VarArr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(d0((m0.r.t.a.r.m.m0) pair.c, (m0) pair.d));
        }
        Object[] array = arrayList2.toArray(new m0.r.t.a.r.m.m0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new m0.r.t.a.r.m.t(m0VarArr, (m0.r.t.a.r.m.m0[]) array, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = j4((r0 = b1(r2)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object I(java.lang.Object r1, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
        /*
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r2, r0)
            boolean r0 = r2 instanceof m0.r.t.a.r.c.c0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            m0.r.t.a.r.c.p0 r0 = (m0.r.t.a.r.c.p0) r0
            boolean r0 = m0.r.t.a.r.j.e.d(r0)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            m0.r.t.a.r.m.v r0 = b1(r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Class r0 = j4(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.reflect.Method r2 = J1(r0, r2)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r2.invoke(r1, r0)
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.I(java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor):java.lang.Object");
    }

    public static final <T> T I0(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$firstOrNull");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static URI I1(Map<String, Object> map, String str) throws ParseException {
        String str2 = (String) h1(map, str, String.class);
        if (str2 == null) {
            return null;
        }
        try {
            return new URI(str2);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static <T> m0.r.t.a.k<T> I2(m0.n.a.a<T> aVar) {
        return new m0.r.t.a.k<>(aVar);
    }

    public static int I3(int i) throws IntegerOverflowException {
        long j = ((long) i) * 8;
        int i2 = (int) j;
        if (((long) i2) == j) {
            return i2;
        }
        throw new IntegerOverflowException();
    }

    public static final void J(w wVar, b bVar, Collection<m0.r.t.a.r.c.v> collection) {
        m0.n.b.i.e(wVar, "<this>");
        m0.n.b.i.e(bVar, "fqName");
        m0.n.b.i.e(collection, "packageFragments");
        if (wVar instanceof x) {
            ((x) wVar).b(bVar, collection);
        } else {
            collection.addAll(wVar.a(bVar));
        }
    }

    public static final Set<m0.r.t.a.r.g.d> J0(Iterable<? extends MemberScope> iterable) {
        m0.n.b.i.e(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (MemberScope e : iterable) {
            Set<m0.r.t.a.r.g.d> e2 = e.e();
            if (e2 == null) {
                return null;
            }
            m0.j.g.b(hashSet, e2);
        }
        return hashSet;
    }

    public static final Method J1(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        m0.n.b.i.e(cls, "$this$getUnboxMethod");
        m0.n.b.i.e(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            m0.n.b.i.d(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static <T> m0.r.t.a.j<T> J2(T t, m0.n.a.a<T> aVar) {
        if (aVar != null) {
            return new m0.r.t.a.j<>(t, aVar);
        }
        a(1);
        throw null;
    }

    public static int J3(byte[] bArr) throws IntegerOverflowException {
        if (bArr == null) {
            return 0;
        }
        return I3(bArr.length);
    }

    public static final <T> int K(Iterable<? extends T> iterable, int i) {
        m0.n.b.i.e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static <T> T K0(Context context, Class<T> cls) {
        return L0(context.getApplicationContext(), cls);
    }

    public static final <T> Object K1(m0.r.t.a.r.l.h hVar, m0.r.k kVar) {
        m0.n.b.i.e(hVar, "<this>");
        m0.n.b.i.e(kVar, "p");
        return hVar.invoke();
    }

    public static <T> m0.r.t.a.j<T> K2(m0.n.a.a<T> aVar) {
        return J2((Object) null, aVar);
    }

    public static final <T> T K3(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<T> D0;
        m0.n.b.i.e(set, "<this>");
        m0.n.b.i.e(t, "low");
        m0.n.b.i.e(t2, "high");
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (!m0.n.b.i.a(t4, t) || !m0.n.b.i.a(t3, t2)) {
                return t3 == null ? t4 : t3;
            }
            return null;
        }
        if (!(t3 == null || (D0 = m0.j.g.D0(m0.j.g.e0(set, t3))) == null)) {
            set = D0;
        }
        return m0.j.g.k0(set);
    }

    public static final <T extends Comparable<?>> int L(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> T L0(Object obj, Class<T> cls) {
        if (obj instanceof j0.a.b.a) {
            return cls.cast(obj);
        }
        if (obj instanceof j0.a.b.b) {
            return L0(((j0.a.b.b) obj).U(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), j0.a.b.a.class, j0.a.b.b.class}));
    }

    public static TypeVariance L1(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.i iVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(iVar, "receiver");
        if (iVar instanceof m0.r.t.a.r.m.m0) {
            Variance b2 = ((m0.r.t.a.r.m.m0) iVar).b();
            m0.n.b.i.d(b2, "this.projectionKind");
            return W(b2);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + m.a(iVar.getClass())).toString());
    }

    public static final <T> List<T> L2(T t) {
        List<T> singletonList = Collections.singletonList(t);
        m0.n.b.i.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final NullabilityQualifier L3(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        m0.n.b.i.e(set, "<this>");
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) K3(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }

    public static final f M(f fVar, f fVar2) {
        m0.n.b.i.e(fVar, "first");
        m0.n.b.i.e(fVar2, "second");
        if (fVar.isEmpty()) {
            return fVar2;
        }
        if (fVar2.isEmpty()) {
            return fVar;
        }
        return new CompositeAnnotations(fVar, fVar2);
    }

    public static m0.r.t.a.r.m.z0.i M0(m0.r.t.a.r.m.z0.l lVar, m0.r.t.a.r.m.z0.h hVar, int i) {
        m0.n.b.i.e(lVar, "this");
        m0.n.b.i.e(hVar, "receiver");
        if (hVar instanceof g) {
            return lVar.n((m0.r.t.a.r.m.z0.f) hVar, i);
        }
        if (hVar instanceof ArgumentList) {
            Object obj = ((ArgumentList) hVar).get(i);
            m0.n.b.i.d(obj, "get(index)");
            return (m0.r.t.a.r.m.z0.i) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + m.a(hVar.getClass())).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<m0.r.t.a.r.f.c.f> M1(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor r21) {
        /*
            java.lang.String r0 = "this"
            r1 = r21
            m0.n.b.i.e(r1, r0)
            m0.r.t.a.r.h.l r0 = r21.A()
            m0.r.t.a.r.f.c.c r2 = r21.Y()
            m0.r.t.a.r.f.c.g r1 = r21.X()
            java.lang.String r3 = "proto"
            m0.n.b.i.e(r0, r3)
            java.lang.String r3 = "nameResolver"
            m0.n.b.i.e(r2, r3)
            java.lang.String r4 = "table"
            m0.n.b.i.e(r1, r4)
            boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class
            if (r5 == 0) goto L_0x002b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class) r0
            java.util.List<java.lang.Integer> r0 = r0.p2
            goto L_0x004e
        L_0x002b:
            boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r5 == 0) goto L_0x0034
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r0
            java.util.List<java.lang.Integer> r0 = r0.a2
            goto L_0x004e
        L_0x0034:
            boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            if (r5 == 0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r0
            java.util.List<java.lang.Integer> r0 = r0.i2
            goto L_0x004e
        L_0x003d:
            boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property
            if (r5 == 0) goto L_0x0046
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r0
            java.util.List<java.lang.Integer> r0 = r0.j2
            goto L_0x004e
        L_0x0046:
            boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias
            if (r5 == 0) goto L_0x014f
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias) r0
            java.util.List<java.lang.Integer> r0 = r0.g2
        L_0x004e:
            java.lang.String r5 = "ids"
            m0.n.b.i.d(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x005c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x014e
            java.lang.Object r6 = r0.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.String r7 = "id"
            m0.n.b.i.d(r6, r7)
            int r6 = r6.intValue()
            m0.n.b.i.e(r2, r3)
            m0.n.b.i.e(r1, r4)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r7 = r1.c
            java.lang.Object r6 = m0.j.g.z(r7, r6)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement) r6
            if (r6 != 0) goto L_0x0084
            r7 = 0
            goto L_0x0147
        L_0x0084:
            int r8 = r6.x
            r9 = 1
            r8 = r8 & r9
            r10 = 0
            if (r8 != r9) goto L_0x008d
            r8 = r9
            goto L_0x008e
        L_0x008d:
            r8 = r10
        L_0x008e:
            if (r8 == 0) goto L_0x0097
            int r8 = r6.y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            int r11 = r6.x
            r12 = 2
            r11 = r11 & r12
            if (r11 != r12) goto L_0x00a0
            r11 = r9
            goto L_0x00a1
        L_0x00a0:
            r11 = r10
        L_0x00a1:
            if (r11 == 0) goto L_0x00aa
            int r11 = r6.Y1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00ab
        L_0x00aa:
            r11 = 0
        L_0x00ab:
            r13 = 16
            r14 = 8
            if (r11 == 0) goto L_0x00cc
            m0.r.t.a.r.f.c.f$a r8 = new m0.r.t.a.r.f.c.f$a
            int r15 = r11.intValue()
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r16 = r11.intValue()
            int r7 = r16 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r11 = r11.intValue()
            int r11 = r11 >> r13
            r11 = r11 & 255(0xff, float:3.57E-43)
            r8.<init>(r15, r7, r11)
            goto L_0x00ee
        L_0x00cc:
            if (r8 == 0) goto L_0x00ec
            m0.r.t.a.r.f.c.f$a r7 = new m0.r.t.a.r.f.c.f$a
            int r11 = r8.intValue()
            r11 = r11 & 7
            int r15 = r8.intValue()
            int r15 = r15 >> 3
            r15 = r15 & 15
            int r8 = r8.intValue()
            int r8 = r8 >> 7
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r7.<init>(r11, r15, r8)
            r16 = r7
            goto L_0x00f0
        L_0x00ec:
            m0.r.t.a.r.f.c.f$a r8 = m0.r.t.a.r.f.c.f.a.b
        L_0x00ee:
            r16 = r8
        L_0x00f0:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level r7 = r6.Z1
            m0.n.b.i.c(r7)
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x010b
            if (r7 == r9) goto L_0x0108
            if (r7 != r12) goto L_0x0102
            kotlin.DeprecationLevel r7 = kotlin.DeprecationLevel.HIDDEN
            goto L_0x010d
        L_0x0102:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0108:
            kotlin.DeprecationLevel r7 = kotlin.DeprecationLevel.ERROR
            goto L_0x010d
        L_0x010b:
            kotlin.DeprecationLevel r7 = kotlin.DeprecationLevel.WARNING
        L_0x010d:
            r18 = r7
            int r7 = r6.x
            r7 = r7 & r14
            if (r7 != r14) goto L_0x0116
            r7 = r9
            goto L_0x0117
        L_0x0116:
            r7 = r10
        L_0x0117:
            if (r7 == 0) goto L_0x0122
            int r7 = r6.a2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r19 = r7
            goto L_0x0124
        L_0x0122:
            r19 = 0
        L_0x0124:
            int r7 = r6.x
            r7 = r7 & r13
            if (r7 != r13) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r9 = r10
        L_0x012b:
            if (r9 == 0) goto L_0x0136
            int r7 = r6.b2
            java.lang.String r7 = r2.b(r7)
            r20 = r7
            goto L_0x0138
        L_0x0136:
            r20 = 0
        L_0x0138:
            m0.r.t.a.r.f.c.f r7 = new m0.r.t.a.r.f.c.f
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind r6 = r6.c2
            java.lang.String r8 = "info.versionKind"
            m0.n.b.i.d(r6, r8)
            r15 = r7
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x0147:
            if (r7 == 0) goto L_0x005c
            r5.add(r7)
            goto L_0x005c
        L_0x014e:
            return r5
        L_0x014f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "Unexpected declaration: "
            java.lang.String r0 = m0.n.b.i.k(r2, r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.M1(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor):java.util.List");
    }

    public static final i0.n.a.c M2(Object obj) {
        m0.n.b.i.e(obj, "$this$logger");
        Set<i0.n.a.a> set = i0.n.a.b.a;
        m0.n.b.i.e(obj, "type");
        String simpleName = obj.getClass().getSimpleName();
        m0.n.b.i.d(simpleName, "type::class.java.simpleName");
        return new b.a(simpleName);
    }

    public static final <H> Collection<H> M3(Collection<? extends H> collection, m0.n.a.l<? super H, ? extends m0.r.t.a.r.c.a> lVar) {
        m0.n.b.i.e(collection, "<this>");
        m0.n.b.i.e(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        m0.r.t.a.r.o.j a2 = j.b.a();
        while (!linkedList.isEmpty()) {
            Object u = m0.j.g.u(linkedList);
            m0.r.t.a.r.o.j a3 = j.b.a();
            Collection<H> g = OverridingUtil.g(u, linkedList, lVar, new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(a3));
            m0.n.b.i.d(g, "val conflictedHandles = SmartSet.create<H>()\n\n        val overridableGroup =\n            OverridingUtil.extractMembersOverridableInBothWays(nextHandle, queue, descriptorByHandle) { conflictedHandles.add(it) }");
            ArrayList arrayList = (ArrayList) g;
            if (arrayList.size() != 1 || !a3.isEmpty()) {
                Object s = OverridingUtil.s(g, lVar);
                m0.n.b.i.d(s, "selectMostSpecificMember(overridableGroup, descriptorByHandle)");
                m0.r.t.a.r.c.a aVar = (m0.r.t.a.r.c.a) lVar.invoke(s);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    m0.n.b.i.d(next, "it");
                    if (!OverridingUtil.k(aVar, (m0.r.t.a.r.c.a) lVar.invoke(next))) {
                        a3.add(next);
                    }
                }
                if (!a3.isEmpty()) {
                    a2.addAll(a3);
                }
                a2.add(s);
            } else {
                Object i02 = m0.j.g.i0(g);
                m0.n.b.i.d(i02, "overridableGroup.single()");
                a2.add(i02);
            }
        }
        return a2;
    }

    public static byte[] N(SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        Mac mac;
        if (provider != null) {
            try {
                mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
            } catch (NoSuchAlgorithmException e) {
                StringBuilder P0 = a.P0("Unsupported HMAC algorithm: ");
                P0.append(e.getMessage());
                throw new JOSEException(P0.toString(), e);
            } catch (InvalidKeyException e2) {
                StringBuilder P02 = a.P0("Invalid HMAC key: ");
                P02.append(e2.getMessage());
                throw new JOSEException(P02.toString(), e2);
            }
        } else {
            mac = Mac.getInstance(secretKey.getAlgorithm());
        }
        mac.init(secretKey);
        mac.update(bArr);
        return mac.doFinal();
    }

    public static final <T extends Annotation> m0.r.d<? extends T> N0(T t) {
        m0.n.b.i.e(t, "$this$annotationClass");
        Class<? extends Annotation> annotationType = t.annotationType();
        m0.n.b.i.d(annotationType, "(this as java.lang.annot…otation).annotationType()");
        m0.r.d<? extends T> r1 = r1(annotationType);
        Objects.requireNonNull(r1, "null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        return r1;
    }

    public static q0 N1(r rVar) {
        m0.n.b.i.e(rVar, "this");
        int C = rVar.C();
        if (Modifier.isPublic(C)) {
            return Visibilities.g.a;
        }
        if (Modifier.isPrivate(C)) {
            return Visibilities.d.a;
        }
        if (!Modifier.isProtected(C)) {
            return m0.r.t.a.r.c.u0.a.a;
        }
        if (Modifier.isStatic(C)) {
            return m0.r.t.a.r.c.u0.c.a;
        }
        return m0.r.t.a.r.c.u0.b.a;
    }

    public static g N2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.d dVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(dVar, "receiver");
        if (dVar instanceof m0.r.t.a.r.m.q) {
            return ((m0.r.t.a.r.m.q) dVar).d;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + m.a(dVar.getClass())).toString());
    }

    public static final <T> Set<T> N3(T t) {
        Set<T> singleton = Collections.singleton(t);
        m0.n.b.i.d(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    public static final List<m0> O(m0.r.t.a.r.c.g gVar) {
        List<m0> list;
        m0.r.t.a.r.c.i iVar;
        j0 i;
        m0.n.b.i.e(gVar, "<this>");
        List<m0> t = gVar.t();
        m0.n.b.i.d(t, "declaredTypeParameters");
        if (!gVar.L() && !(gVar.b() instanceof m0.r.t.a.r.c.a)) {
            return t;
        }
        m0.s.h<m0.r.t.a.r.c.i> l = DescriptorUtilsKt.l(gVar);
        TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 = TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.c;
        m0.n.b.i.e(l, "$this$takeWhile");
        m0.n.b.i.e(typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1, "predicate");
        List j = SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.f(SequencesKt___SequencesKt.d(new p(l, typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2.c), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3.c));
        Iterator<m0.r.t.a.r.c.i> it = DescriptorUtilsKt.l(gVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            iVar = it.next();
            if (iVar instanceof d) {
                break;
            }
        }
        d dVar = (d) iVar;
        if (!(dVar == null || (i = dVar.i()) == null)) {
            list = i.getParameters();
        }
        if (list == null) {
            list = EmptyList.c;
        }
        if (!j.isEmpty() || !list.isEmpty()) {
            List<T> Z = m0.j.g.Z(j, list);
            ArrayList arrayList = new ArrayList(K(Z, 10));
            for (T t2 : Z) {
                m0.n.b.i.d(t2, "it");
                arrayList.add(new m0.r.t.a.r.c.b(t2, gVar, t.size()));
            }
            return m0.j.g.Z(t, arrayList);
        }
        List<m0> t3 = gVar.t();
        m0.n.b.i.d(t3, "declaredTypeParameters");
        return t3;
    }

    public static o0 O0(m0.r.t.a.r.g.d dVar, d dVar2) {
        if (dVar == null) {
            c(19);
            throw null;
        } else if (dVar2 != null) {
            Collection<m0.r.t.a.r.c.c> k = dVar2.k();
            if (k.size() != 1) {
                return null;
            }
            for (o0 next : k.iterator().next().h()) {
                if (next.getName().equals(dVar)) {
                    return next;
                }
            }
            return null;
        } else {
            c(20);
            throw null;
        }
    }

    public static boolean O1(f fVar, m0.r.t.a.r.g.b bVar) {
        m0.n.b.i.e(fVar, "this");
        m0.n.b.i.e(bVar, "fqName");
        return fVar.f(bVar) != null;
    }

    public static g O2(m0.r.t.a.r.m.z0.l lVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(lVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        m0.r.t.a.r.m.z0.d g = lVar.g(fVar);
        if (g != null) {
            return lVar.x(g);
        }
        g a2 = lVar.a(fVar);
        m0.n.b.i.c(a2);
        return a2;
    }

    public static boolean O3(AtomicReference<k0.b.w.a> atomicReference, k0.b.w.a aVar, Class<?> cls) {
        Objects.requireNonNull(aVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, aVar)) {
            return true;
        }
        aVar.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        String name = cls.getName();
        RxJavaPlugins.onError(new ProtocolViolationException("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
        return false;
    }

    public static final m0.r.t.a.r.m.z0.f P(r0 r0Var, m0.r.t.a.r.m.z0.f fVar, HashSet<m0.r.t.a.r.m.z0.j> hashSet) {
        m0.r.t.a.r.m.z0.f P;
        m0.r.t.a.r.m.z0.j d2 = r0Var.d(fVar);
        if (!hashSet.add(d2)) {
            return null;
        }
        k e = r0Var.e(d2);
        if (e != null) {
            P = P(r0Var, r0Var.c(e), hashSet);
            if (P == null) {
                return null;
            }
            if (!r0Var.r(P) && r0Var.q(fVar)) {
                return r0Var.w(P);
            }
        } else if (!r0Var.k(d2)) {
            return fVar;
        } else {
            m0.r.t.a.r.m.z0.f l = r0Var.l(fVar);
            if (l == null || (P = P(r0Var, l, hashSet)) == null) {
                return null;
            }
            if (r0Var.r(fVar)) {
                if (r0Var.r(P)) {
                    return fVar;
                }
                return (!(P instanceof g) || !r0Var.y((g) P)) ? r0Var.w(P) : fVar;
            }
        }
        return P;
    }

    public static List<m0.r.t.a.r.c.v0.b.b> P0(m0.r.t.a.r.c.v0.b.e eVar) {
        m0.n.b.i.e(eVar, "this");
        AnnotatedElement u = eVar.u();
        Annotation[] declaredAnnotations = u == null ? null : u.getDeclaredAnnotations();
        if (declaredAnnotations == null) {
            return EmptyList.c;
        }
        return Q0(declaredAnnotations);
    }

    public static boolean P1(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar, m0.r.t.a.r.g.b bVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        m0.n.b.i.e(bVar, "fqName");
        if (fVar instanceof v) {
            return ((v) fVar).getAnnotations().n(bVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public static final a0 P2(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        v0 L0 = vVar.L0();
        if (L0 instanceof m0.r.t.a.r.m.q) {
            return ((m0.r.t.a.r.m.q) L0).d;
        }
        if (L0 instanceof a0) {
            return (a0) L0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean P3(TypeComponentPosition typeComponentPosition) {
        m0.n.b.i.e(typeComponentPosition, "<this>");
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }

    public static final String Q(d dVar, m0.r.t.a.r.e.b.q<?> qVar) {
        m0.n.b.i.e(dVar, "klass");
        m0.n.b.i.e(qVar, "typeMappingConfiguration");
        String b2 = qVar.b(dVar);
        if (b2 != null) {
            return b2;
        }
        m0.r.t.a.r.c.i b3 = dVar.b();
        m0.n.b.i.d(b3, "klass.containingDeclaration");
        m0.r.t.a.r.g.d name = dVar.getName();
        m0.r.t.a.r.g.d dVar2 = m0.r.t.a.r.g.f.a;
        if (name == null || name.d) {
            name = m0.r.t.a.r.g.f.c;
        }
        d dVar3 = null;
        if (name != null) {
            String e = name.e();
            m0.n.b.i.d(e, "safeIdentifier(klass.name).identifier");
            if (b3 instanceof m0.r.t.a.r.c.v) {
                m0.r.t.a.r.g.b d2 = ((m0.r.t.a.r.c.v) b3).d();
                if (d2.d()) {
                    return e;
                }
                StringBuilder sb = new StringBuilder();
                String b4 = d2.b();
                m0.n.b.i.d(b4, "fqName.asString()");
                sb.append(StringsKt__IndentKt.A(b4, '.', '/', false, 4));
                sb.append('/');
                sb.append(e);
                return sb.toString();
            }
            if (b3 instanceof d) {
                dVar3 = (d) b3;
            }
            if (dVar3 != null) {
                String d3 = qVar.d(dVar3);
                if (d3 == null) {
                    d3 = Q(dVar3, qVar);
                }
                return d3 + '$' + e;
            }
            throw new IllegalArgumentException("Unexpected container: " + b3 + " for " + dVar);
        }
        m0.r.t.a.r.g.f.a(0);
        throw null;
    }

    public static final List<m0.r.t.a.r.c.v0.b.b> Q0(Annotation[] annotationArr) {
        m0.n.b.i.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation bVar : annotationArr) {
            arrayList.add(new m0.r.t.a.r.c.v0.b.b(bVar));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean Q1(m0.r.t.a.r.c.d r11, m0.r.t.a.r.c.a r12) {
        /*
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r11, r0)
            java.lang.String r0 = "specialCallableDescriptor"
            m0.n.b.i.e(r12, r0)
            m0.r.t.a.r.c.i r12 = r12.b()
            m0.r.t.a.r.c.d r12 = (m0.r.t.a.r.c.d) r12
            m0.r.t.a.r.m.a0 r12 = r12.q()
            java.lang.String r0 = "specialCallableDescriptor.containingDeclaration as ClassDescriptor).defaultType"
            m0.n.b.i.d(r12, r0)
            m0.r.t.a.r.c.d r11 = m0.r.t.a.r.j.d.l(r11)
        L_0x001d:
            r0 = 0
            if (r11 == 0) goto L_0x015f
            boolean r1 = r11 instanceof m0.r.t.a.r.e.a.t.d
            if (r1 != 0) goto L_0x0159
            m0.r.t.a.r.m.a0 r1 = r11.q()
            r2 = 0
            if (r1 == 0) goto L_0x0155
            m0.r.t.a.r.m.x0.m r3 = new m0.r.t.a.r.m.x0.m
            r3.<init>()
            java.lang.String r4 = "subtype"
            m0.n.b.i.e(r1, r4)
            java.lang.String r4 = "supertype"
            m0.n.b.i.e(r12, r4)
            java.lang.String r4 = "typeCheckingProcedureCallbacks"
            m0.n.b.i.e(r3, r4)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            m0.r.t.a.r.m.x0.l r5 = new m0.r.t.a.r.m.x0.l
            r5.<init>(r1, r2)
            r4.add(r5)
            m0.r.t.a.r.m.j0 r1 = r12.I0()
        L_0x0050:
            boolean r5 = r4.isEmpty()
            r6 = 1
            if (r5 != 0) goto L_0x014a
            java.lang.Object r5 = r4.poll()
            m0.r.t.a.r.m.x0.l r5 = (m0.r.t.a.r.m.x0.l) r5
            m0.r.t.a.r.m.v r7 = r5.a
            m0.r.t.a.r.m.j0 r8 = r7.I0()
            boolean r9 = r3.b(r8, r1)
            if (r9 == 0) goto L_0x0128
            boolean r2 = r7.J0()
            m0.r.t.a.r.m.x0.l r4 = r5.b
        L_0x006f:
            if (r4 == 0) goto L_0x00ea
            m0.r.t.a.r.m.v r5 = r4.a
            java.util.List r8 = r5.H0()
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0082
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0082
            goto L_0x00a1
        L_0x0082:
            java.util.Iterator r8 = r8.iterator()
        L_0x0086:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00a1
            java.lang.Object r9 = r8.next()
            m0.r.t.a.r.m.m0 r9 = (m0.r.t.a.r.m.m0) r9
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = r9.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r9 == r10) goto L_0x009c
            r9 = r6
            goto L_0x009d
        L_0x009c:
            r9 = r0
        L_0x009d:
            if (r9 == 0) goto L_0x0086
            r8 = r6
            goto L_0x00a2
        L_0x00a1:
            r8 = r0
        L_0x00a2:
            if (r8 == 0) goto L_0x00c6
            m0.r.t.a.r.m.l0$a r8 = m0.r.t.a.r.m.l0.b
            m0.r.t.a.r.m.p0 r8 = r8.a(r5)
            m0.r.t.a.r.m.p0 r8 = H4(r8, r0, r6)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r8 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            m0.r.t.a.r.m.v r7 = r8.i(r7, r9)
            java.lang.String r8 = "TypeConstructorSubstitution.create(currentType)\n                            .wrapWithCapturingSubstitution().buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)"
            m0.n.b.i.d(r7, r8)
            m0.r.t.a.r.m.b1.a r7 = m0.r.t.a.r.m.a1.a.S(r7)
            T r7 = r7.b
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            goto L_0x00db
        L_0x00c6:
            m0.r.t.a.r.m.l0$a r8 = m0.r.t.a.r.m.l0.b
            m0.r.t.a.r.m.p0 r8 = r8.a(r5)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r8 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            m0.r.t.a.r.m.v r7 = r8.i(r7, r9)
            java.lang.String r8 = "{\n                    TypeConstructorSubstitution.create(currentType)\n                            .buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)\n                }"
            m0.n.b.i.d(r7, r8)
        L_0x00db:
            if (r2 != 0) goto L_0x00e6
            boolean r2 = r5.J0()
            if (r2 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r2 = r0
            goto L_0x00e7
        L_0x00e6:
            r2 = r6
        L_0x00e7:
            m0.r.t.a.r.m.x0.l r4 = r4.b
            goto L_0x006f
        L_0x00ea:
            m0.r.t.a.r.m.j0 r4 = r7.I0()
            boolean r5 = r3.b(r4, r1)
            if (r5 == 0) goto L_0x00f9
            m0.r.t.a.r.m.v r2 = m0.r.t.a.r.m.s0.j(r7, r2)
            goto L_0x014a
        L_0x00f9:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r12 = "Type constructors should be equals!\nsubstitutedSuperType: "
            java.lang.StringBuilder r12 = i0.d.a.a.a.P0(r12)
            java.lang.String r0 = t0(r4)
            r12.append(r0)
            java.lang.String r0 = ", \n\nsupertype: "
            r12.append(r0)
            java.lang.String r0 = t0(r1)
            r12.append(r0)
            java.lang.String r0 = " \n"
            r12.append(r0)
            boolean r0 = r3.b(r4, r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0128:
            java.util.Collection r6 = r8.b()
            java.util.Iterator r6 = r6.iterator()
        L_0x0130:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0050
            java.lang.Object r7 = r6.next()
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            m0.r.t.a.r.m.x0.l r8 = new m0.r.t.a.r.m.x0.l
            java.lang.String r9 = "immediateSupertype"
            m0.n.b.i.d(r7, r9)
            r8.<init>(r7, r5)
            r4.add(r8)
            goto L_0x0130
        L_0x014a:
            if (r2 == 0) goto L_0x014d
            r0 = r6
        L_0x014d:
            if (r0 == 0) goto L_0x0159
            boolean r11 = m0.r.t.a.r.b.f.A(r11)
            r11 = r11 ^ r6
            return r11
        L_0x0155:
            m0.r.t.a.r.m.x0.n.a(r0)
            throw r2
        L_0x0159:
            m0.r.t.a.r.c.d r11 = m0.r.t.a.r.j.d.l(r11)
            goto L_0x001d
        L_0x015f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.Q1(m0.r.t.a.r.c.d, m0.r.t.a.r.c.a):boolean");
    }

    public static m0.r.t.a.r.m.z0.f Q2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        g a2 = cVar.a(fVar);
        return a2 == null ? fVar : cVar.j(a2, true);
    }

    public static final String Q3(m0.r.t.a.r.e.b.p pVar, d dVar, String str) {
        String str2;
        m0.n.b.i.e(pVar, "<this>");
        m0.n.b.i.e(dVar, "classDescriptor");
        m0.n.b.i.e(str, "jvmDescriptor");
        m0.n.b.i.e(dVar, "<this>");
        m0.r.t.a.r.b.k.c cVar = m0.r.t.a.r.b.k.c.a;
        m0.r.t.a.r.g.c j = DescriptorUtilsKt.h(dVar).j();
        m0.n.b.i.d(j, "fqNameSafe.toUnsafe()");
        m0.r.t.a.r.g.a h = cVar.h(j);
        if (h == null) {
            str2 = Q(dVar, m0.r.t.a.r.e.b.r.a);
        } else {
            str2 = m0.r.t.a.r.j.s.b.b(h).e();
            m0.n.b.i.d(str2, "byClassId(it).internalName");
        }
        return pVar.i(str2, str);
    }

    public static byte[] R(byte[] bArr) throws IntegerOverflowException {
        return ByteBuffer.allocate(8).putLong((long) J3(bArr)).array();
    }

    public static m0.r.t.a.r.m.z0.i R0(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar, int i) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        if (fVar instanceof v) {
            return ((v) fVar).H0().get(i);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public static final boolean R1(ProtoBuf$Function protoBuf$Function) {
        m0.n.b.i.e(protoBuf$Function, "<this>");
        return protoBuf$Function.x() || protoBuf$Function.y();
    }

    public static final int R2(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final char R3(char[] cArr) {
        m0.n.b.i.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [m0.r.t.a.r.e.a.k] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v8, types: [m0.r.t.a.r.e.a.k] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.e.a.o S(m0.r.t.a.r.e.a.u.c r12, m0.r.t.a.r.c.r0.f r13) {
        /*
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r12, r0)
            java.lang.String r0 = "additionalAnnotations"
            m0.n.b.i.e(r13, r0)
            m0.r.t.a.r.e.a.u.a r0 = r12.a
            m0.r.t.a.r.o.g r0 = r0.v
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0017
            m0.r.t.a.r.e.a.o r12 = r12.a()
            return r12
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0020:
            boolean r1 = r13.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0198
            java.lang.Object r1 = r13.next()
            m0.r.t.a.r.c.r0.c r1 = (m0.r.t.a.r.c.r0.c) r1
            m0.r.t.a.r.e.a.u.a r5 = r12.a
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver r5 = r5.q
            java.util.Objects.requireNonNull(r5)
            java.lang.String r6 = "annotationDescriptor"
            m0.n.b.i.e(r1, r6)
            m0.r.t.a.r.o.g r7 = r5.a
            boolean r7 = r7.j
            if (r7 == 0) goto L_0x0042
            goto L_0x0073
        L_0x0042:
            java.util.Map<m0.r.t.a.r.g.b, m0.r.t.a.r.e.a.k> r7 = m0.r.t.a.r.e.a.a.g
            m0.r.t.a.r.g.b r8 = r1.d()
            java.lang.Object r7 = r7.get(r8)
            m0.r.t.a.r.e.a.k r7 = (m0.r.t.a.r.e.a.k) r7
            if (r7 != 0) goto L_0x0051
            goto L_0x0073
        L_0x0051:
            java.util.Map<m0.r.t.a.r.g.b, m0.r.t.a.r.e.a.k> r8 = m0.r.t.a.r.e.a.a.f
            m0.r.t.a.r.g.b r9 = r1.d()
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L_0x0062
            m0.r.t.a.r.o.g r8 = r5.a
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r8 = r8.g
            goto L_0x0066
        L_0x0062:
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r8 = r5.b(r1)
        L_0x0066:
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r9 = kotlin.reflect.jvm.internal.impl.utils.ReportLevel.IGNORE
            if (r8 == r9) goto L_0x006c
            r9 = r3
            goto L_0x006d
        L_0x006c:
            r9 = r2
        L_0x006d:
            if (r9 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r8 = r4
        L_0x0071:
            if (r8 != 0) goto L_0x0075
        L_0x0073:
            r10 = r4
            goto L_0x0092
        L_0x0075:
            m0.r.t.a.r.e.a.x.g r9 = r7.a
            boolean r8 = r8.isWarning()
            m0.r.t.a.r.e.a.x.g r8 = m0.r.t.a.r.e.a.x.g.a(r9, r4, r8, r3)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r9 = r7.b
            boolean r7 = r7.c
            java.lang.String r10 = "nullabilityQualifier"
            m0.n.b.i.e(r8, r10)
            java.lang.String r10 = "qualifierApplicabilityTypes"
            m0.n.b.i.e(r9, r10)
            m0.r.t.a.r.e.a.k r10 = new m0.r.t.a.r.e.a.k
            r10.<init>(r8, r9, r7)
        L_0x0092:
            if (r10 != 0) goto L_0x0190
            m0.n.b.i.e(r1, r6)
            m0.r.t.a.r.o.g r6 = r5.a
            boolean r6 = r6.i
            if (r6 == 0) goto L_0x009f
            goto L_0x0149
        L_0x009f:
            m0.r.t.a.r.c.d r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.e(r1)
            if (r6 != 0) goto L_0x00a6
            goto L_0x00b3
        L_0x00a6:
            m0.r.t.a.r.c.r0.f r7 = r6.getAnnotations()
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.a.c
            boolean r7 = r7.n(r8)
            if (r7 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r6 = r4
        L_0x00b4:
            if (r6 != 0) goto L_0x00b8
            goto L_0x0149
        L_0x00b8:
            m0.r.t.a.r.c.d r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.e(r1)
            m0.n.b.i.c(r7)
            m0.r.t.a.r.c.r0.f r7 = r7.getAnnotations()
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.a.c
            m0.r.t.a.r.c.r0.c r7 = r7.f(r8)
            m0.n.b.i.c(r7)
            java.util.Map r7 = r7.a()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00dd:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x010a
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            m0.r.t.a.r.g.d r10 = (m0.r.t.a.r.g.d) r10
            java.lang.Object r9 = r9.getValue()
            m0.r.t.a.r.j.p.g r9 = (m0.r.t.a.r.j.p.g) r9
            m0.r.t.a.r.g.d r11 = m0.r.t.a.r.e.a.q.b
            boolean r10 = m0.n.b.i.a(r10, r11)
            if (r10 == 0) goto L_0x0104
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 r10 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1.c
            java.util.List r9 = r5.a(r9, r10)
            goto L_0x0106
        L_0x0104:
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.c
        L_0x0106:
            m0.j.g.b(r8, r9)
            goto L_0x00dd
        L_0x010a:
            java.util.Iterator r7 = r8.iterator()
            r8 = r2
        L_0x010f:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0123
            java.lang.Object r9 = r7.next()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r9 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r9
            int r9 = r9.ordinal()
            int r9 = r3 << r9
            r8 = r8 | r9
            goto L_0x010f
        L_0x0123:
            m0.r.t.a.r.c.r0.f r6 = r6.getAnnotations()
            java.util.Iterator r6 = r6.iterator()
        L_0x012b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0144
            java.lang.Object r7 = r6.next()
            r9 = r7
            m0.r.t.a.r.c.r0.c r9 = (m0.r.t.a.r.c.r0.c) r9
            m0.r.t.a.r.c.r0.c r9 = r5.d(r9)
            if (r9 == 0) goto L_0x0140
            r9 = r3
            goto L_0x0141
        L_0x0140:
            r9 = r2
        L_0x0141:
            if (r9 == 0) goto L_0x012b
            goto L_0x0145
        L_0x0144:
            r7 = r4
        L_0x0145:
            m0.r.t.a.r.c.r0.c r7 = (m0.r.t.a.r.c.r0.c) r7
            if (r7 != 0) goto L_0x014b
        L_0x0149:
            r6 = r4
            goto L_0x0150
        L_0x014b:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$a r6 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$a
            r6.<init>(r7, r8)
        L_0x0150:
            if (r6 != 0) goto L_0x0153
            goto L_0x0191
        L_0x0153:
            m0.r.t.a.r.c.r0.c r7 = r6.a
            java.util.List r6 = r6.a()
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r1 = r5.c(r1)
            if (r1 != 0) goto L_0x0163
            kotlin.reflect.jvm.internal.impl.utils.ReportLevel r1 = r5.b(r7)
        L_0x0163:
            boolean r5 = r1.isIgnore()
            if (r5 == 0) goto L_0x016a
            goto L_0x0191
        L_0x016a:
            m0.r.t.a.r.e.a.u.a r5 = r12.a
            m0.r.t.a.r.e.a.u.b r5 = r5.t
            boolean r5 = r5.b()
            m0.r.t.a.r.e.a.u.a r8 = r12.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r8 = r8.r
            m0.r.t.a.r.e.a.x.g r5 = r8.b(r7, r5, r2)
            if (r5 != 0) goto L_0x017e
            r1 = r4
            goto L_0x0186
        L_0x017e:
            boolean r1 = r1.isWarning()
            m0.r.t.a.r.e.a.x.g r1 = m0.r.t.a.r.e.a.x.g.a(r5, r4, r1, r3)
        L_0x0186:
            if (r1 != 0) goto L_0x0189
            goto L_0x0191
        L_0x0189:
            m0.r.t.a.r.e.a.k r4 = new m0.r.t.a.r.e.a.k
            r3 = 4
            r4.<init>(r1, r6, r2, r3)
            goto L_0x0191
        L_0x0190:
            r4 = r10
        L_0x0191:
            if (r4 == 0) goto L_0x0020
            r0.add(r4)
            goto L_0x0020
        L_0x0198:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x01a3
            m0.r.t.a.r.e.a.o r12 = r12.a()
            return r12
        L_0x01a3:
            m0.r.t.a.r.e.a.o r13 = r12.a()
            if (r13 != 0) goto L_0x01aa
            goto L_0x01b4
        L_0x01aa:
            java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, m0.r.t.a.r.e.a.k> r13 = r13.a
            if (r13 != 0) goto L_0x01af
            goto L_0x01b4
        L_0x01af:
            java.util.EnumMap r4 = new java.util.EnumMap
            r4.<init>(r13)
        L_0x01b4:
            if (r4 != 0) goto L_0x01bd
            java.util.EnumMap r4 = new java.util.EnumMap
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r13 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class
            r4.<init>(r13)
        L_0x01bd:
            java.util.Iterator r13 = r0.iterator()
        L_0x01c1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = r13.next()
            m0.r.t.a.r.e.a.k r0 = (m0.r.t.a.r.e.a.k) r0
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r1 = r0.b
            java.util.Iterator r1 = r1.iterator()
        L_0x01d3:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01c1
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r2 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r2
            r4.put(r2, r0)
            r2 = r3
            goto L_0x01d3
        L_0x01e4:
            if (r2 != 0) goto L_0x01eb
            m0.r.t.a.r.e.a.o r12 = r12.a()
            goto L_0x01f0
        L_0x01eb:
            m0.r.t.a.r.e.a.o r12 = new m0.r.t.a.r.e.a.o
            r12.<init>(r4)
        L_0x01f0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.S(m0.r.t.a.r.e.a.u.c, m0.r.t.a.r.c.r0.f):m0.r.t.a.r.e.a.o");
    }

    public static final int S0(m0.r.t.a.q.c<?> cVar) {
        m0.n.b.i.e(cVar, "$this$arity");
        return cVar.b().size();
    }

    public static final boolean S1(ProtoBuf$Property protoBuf$Property) {
        m0.n.b.i.e(protoBuf$Property, "<this>");
        return protoBuf$Property.x() || protoBuf$Property.y();
    }

    public static final <K, V> Map<K, V> S2(Pair<? extends K, ? extends V> pair) {
        m0.n.b.i.e(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c, pair.d);
        m0.n.b.i.d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <T> T S3(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$single");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static byte[] T(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public static Base64URL T0(Map<String, Object> map, String str) throws ParseException {
        String str2 = (String) h1(map, str, String.class);
        if (str2 == null) {
            return null;
        }
        return new Base64URL(str2);
    }

    public static boolean T1(m0.r.t.a.r.m.x0.c cVar, g gVar, g gVar2) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "a");
        m0.n.b.i.e(gVar2, "b");
        if (!(gVar instanceof a0)) {
            throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
        } else if (gVar2 instanceof a0) {
            return ((a0) gVar).H0() == ((a0) gVar2).H0();
        } else {
            throw new IllegalArgumentException(a.I0(gVar2, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar2, ", ")).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017e, code lost:
        if (r6 != false) goto L_0x0192;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object T2(m0.r.t.a.r.m.v r19, m0.r.t.a.r.e.b.g r20, m0.r.t.a.r.e.b.s r21, m0.r.t.a.r.e.b.q r22, m0.n.a.q r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "kotlinType"
            m0.n.b.i.e(r0, r5)
            java.lang.String r5 = "factory"
            m0.n.b.i.e(r1, r5)
            java.lang.String r5 = "mode"
            m0.n.b.i.e(r2, r5)
            java.lang.String r6 = "typeMappingConfiguration"
            m0.n.b.i.e(r3, r6)
            java.lang.String r6 = "writeGenericType"
            m0.n.b.i.e(r4, r6)
            m0.r.t.a.r.m.v r6 = r3.e(r0)
            if (r6 != 0) goto L_0x0321
            boolean r6 = m0.r.t.a.r.b.e.h(r19)
            if (r6 == 0) goto L_0x00c6
            boolean r5 = r22.f()
            m0.r.t.a.r.c.t0.w r6 = m0.r.t.a.r.b.h.a
            java.lang.String r6 = "suspendFunType"
            m0.n.b.i.e(r0, r6)
            m0.r.t.a.r.b.e.h(r19)
            m0.r.t.a.r.b.f r7 = m0.r.t.a.r.m.a1.a.F1(r19)
            m0.r.t.a.r.c.r0.f r8 = r19.getAnnotations()
            m0.r.t.a.r.m.v r9 = m0.r.t.a.r.b.e.d(r19)
            java.util.List r6 = m0.r.t.a.r.b.e.f(r19)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = K(r6, r11)
            r10.<init>(r11)
            java.util.Iterator r6 = r6.iterator()
        L_0x005c:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0070
            java.lang.Object r11 = r6.next()
            m0.r.t.a.r.m.m0 r11 = (m0.r.t.a.r.m.m0) r11
            m0.r.t.a.r.m.v r11 = r11.getType()
            r10.add(r11)
            goto L_0x005c
        L_0x0070:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r6 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.c.r0.f$a r6 = m0.r.t.a.r.c.r0.f.i
            java.util.Objects.requireNonNull(r6)
            m0.r.t.a.r.c.r0.f r11 = m0.r.t.a.r.c.r0.f.a.b
            if (r5 == 0) goto L_0x0082
            m0.r.t.a.r.c.t0.w r5 = m0.r.t.a.r.b.h.b
            m0.r.t.a.r.m.j0 r5 = r5.i()
            goto L_0x0088
        L_0x0082:
            m0.r.t.a.r.c.t0.w r5 = m0.r.t.a.r.b.h.a
            m0.r.t.a.r.m.j0 r5 = r5.i()
        L_0x0088:
            r12 = r5
            java.lang.String r5 = "if (isReleaseCoroutines) FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE.typeConstructor\n                    else FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL.typeConstructor"
            m0.n.b.i.d(r12, r5)
            m0.r.t.a.r.m.v r5 = m0.r.t.a.r.b.e.e(r19)
            m0.r.t.a.r.m.m0 r5 = m0.r.t.a.r.m.a1.a.Y(r5)
            java.util.List r13 = L2(r5)
            r14 = 0
            r15 = 0
            r16 = 16
            m0.r.t.a.r.m.a0 r5 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r11, r12, r13, r14, r15, r16)
            java.util.List r10 = m0.j.g.a0(r10, r5)
            r11 = 0
            m0.r.t.a.r.b.f r5 = m0.r.t.a.r.m.a1.a.F1(r19)
            m0.r.t.a.r.m.a0 r12 = r5.p()
            java.lang.String r5 = "suspendFunType.builtIns.nullableAnyType"
            m0.n.b.i.d(r12, r5)
            r13 = 0
            m0.r.t.a.r.m.a0 r5 = m0.r.t.a.r.b.e.a(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r19.J0()
            m0.r.t.a.r.m.a0 r0 = r5.M0(r0)
            java.lang.Object r0 = T2(r0, r1, r2, r3, r4)
            return r0
        L_0x00c6:
            m0.r.t.a.r.m.x0.k r6 = m0.r.t.a.r.m.x0.k.a
            java.lang.String r7 = "<this>"
            m0.n.b.i.e(r6, r7)
            java.lang.String r8 = "type"
            m0.n.b.i.e(r0, r8)
            java.lang.String r9 = "typeFactory"
            m0.n.b.i.e(r1, r9)
            m0.n.b.i.e(r2, r5)
            m0.r.t.a.r.m.z0.j r5 = t4(r6, r0)
            boolean r9 = d2(r6, r5)
            r10 = 0
            java.lang.String r11 = "possiblyPrimitiveType"
            java.lang.String r12 = "["
            r13 = 0
            r14 = 1
            if (r9 != 0) goto L_0x00ed
            goto L_0x0192
        L_0x00ed:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r9 = B1(r6, r5)
            if (r9 == 0) goto L_0x0123
            java.lang.Object r5 = r1.f(r9)
            boolean r9 = s2(r6, r0)
            if (r9 != 0) goto L_0x0113
            m0.n.b.i.e(r6, r7)
            m0.n.b.i.e(r0, r8)
            m0.r.t.a.r.g.b r8 = m0.r.t.a.r.e.a.q.o
            java.lang.String r9 = "ENHANCED_NULLABILITY_ANNOTATION"
            m0.n.b.i.d(r8, r9)
            boolean r6 = P1(r6, r0, r8)
            if (r6 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r6 = r13
            goto L_0x0114
        L_0x0113:
            r6 = r14
        L_0x0114:
            m0.n.b.i.e(r1, r7)
            m0.n.b.i.e(r5, r11)
            if (r6 == 0) goto L_0x0120
            java.lang.Object r5 = r1.d(r5)
        L_0x0120:
            r10 = r5
            goto L_0x0192
        L_0x0123:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r8 = A1(r6, r5)
            if (r8 == 0) goto L_0x013a
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get((kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r8)
            java.lang.String r5 = r5.getDesc()
            java.lang.String r5 = m0.n.b.i.k(r12, r5)
            java.lang.Object r10 = r1.b(r5)
            goto L_0x0192
        L_0x013a:
            boolean r8 = z2(r6, r5)
            if (r8 == 0) goto L_0x0192
            m0.r.t.a.r.g.c r5 = W0(r6, r5)
            if (r5 != 0) goto L_0x0148
            r5 = r10
            goto L_0x014e
        L_0x0148:
            m0.r.t.a.r.b.k.c r6 = m0.r.t.a.r.b.k.c.a
            m0.r.t.a.r.g.a r5 = r6.h(r5)
        L_0x014e:
            if (r5 == 0) goto L_0x0192
            boolean r6 = r2.j
            if (r6 != 0) goto L_0x0181
            m0.r.t.a.r.b.k.c r6 = m0.r.t.a.r.b.k.c.a
            java.util.List<m0.r.t.a.r.b.k.c$a> r6 = m0.r.t.a.r.b.k.c.m
            boolean r8 = r6 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0163
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x0163
            goto L_0x017d
        L_0x0163:
            java.util.Iterator r6 = r6.iterator()
        L_0x0167:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x017d
            java.lang.Object r8 = r6.next()
            m0.r.t.a.r.b.k.c$a r8 = (m0.r.t.a.r.b.k.c.a) r8
            m0.r.t.a.r.g.a r8 = r8.a
            boolean r8 = m0.n.b.i.a(r8, r5)
            if (r8 == 0) goto L_0x0167
            r6 = r14
            goto L_0x017e
        L_0x017d:
            r6 = r13
        L_0x017e:
            if (r6 == 0) goto L_0x0181
            goto L_0x0192
        L_0x0181:
            m0.r.t.a.r.j.s.b r5 = m0.r.t.a.r.j.s.b.b(r5)
            java.lang.String r5 = r5.e()
            java.lang.String r6 = "byClassId(classId).internalName"
            m0.n.b.i.d(r5, r6)
            java.lang.Object r10 = r1.c(r5)
        L_0x0192:
            if (r10 != 0) goto L_0x030f
            m0.r.t.a.r.m.j0 r5 = r19.I0()
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r6 == 0) goto L_0x01b1
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r5 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r5
            m0.r.t.a.r.m.v r0 = r5.a
            if (r0 != 0) goto L_0x01a8
            java.util.LinkedHashSet<m0.r.t.a.r.m.v> r0 = r5.b
            m0.r.t.a.r.m.v r0 = r3.c(r0)
        L_0x01a8:
            m0.r.t.a.r.m.v r0 = m0.r.t.a.r.m.a1.a.h3(r0)
            java.lang.Object r0 = T2(r0, r1, r2, r3, r4)
            return r0
        L_0x01b1:
            m0.r.t.a.r.c.f r5 = r5.c()
            if (r5 == 0) goto L_0x0303
            boolean r6 = m0.r.t.a.r.m.p.j(r5)
            if (r6 == 0) goto L_0x01c9
            java.lang.String r2 = "error/NonExistentClass"
            java.lang.Object r1 = r1.c(r2)
            m0.r.t.a.r.c.d r5 = (m0.r.t.a.r.c.d) r5
            r3.g(r0, r5)
            return r1
        L_0x01c9:
            boolean r6 = r5 instanceof m0.r.t.a.r.c.d
            if (r6 == 0) goto L_0x0242
            boolean r8 = m0.r.t.a.r.b.f.z(r19)
            if (r8 == 0) goto L_0x0242
            java.util.List r5 = r19.H0()
            int r5 = r5.size()
            if (r5 != r14) goto L_0x023a
            java.util.List r0 = r19.H0()
            java.lang.Object r0 = r0.get(r13)
            m0.r.t.a.r.m.m0 r0 = (m0.r.t.a.r.m.m0) r0
            m0.r.t.a.r.m.v r5 = r0.getType()
            java.lang.String r6 = "memberProjection.type"
            m0.n.b.i.d(r5, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r0.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r6 != r7) goto L_0x01ff
            java.lang.String r0 = "java/lang/Object"
            java.lang.Object r0 = r1.c(r0)
            goto L_0x022d
        L_0x01ff:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.b()
            java.lang.String r6 = "memberProjection.projectionKind"
            m0.n.b.i.d(r0, r6)
            java.lang.String r6 = "effectiveVariance"
            m0.n.b.i.e(r0, r6)
            boolean r6 = r2.f
            if (r6 == 0) goto L_0x0212
            goto L_0x0228
        L_0x0212:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0224
            if (r0 == r14) goto L_0x021f
            m0.r.t.a.r.e.b.s r0 = r2.i
            if (r0 != 0) goto L_0x0229
            goto L_0x0228
        L_0x021f:
            m0.r.t.a.r.e.b.s r0 = r2.k
            if (r0 != 0) goto L_0x0229
            goto L_0x0228
        L_0x0224:
            m0.r.t.a.r.e.b.s r0 = r2.l
            if (r0 != 0) goto L_0x0229
        L_0x0228:
            r0 = r2
        L_0x0229:
            java.lang.Object r0 = T2(r5, r1, r0, r3, r4)
        L_0x022d:
            java.lang.String r0 = r1.a(r0)
            java.lang.String r0 = m0.n.b.i.k(r12, r0)
            java.lang.Object r0 = r1.b(r0)
            return r0
        L_0x023a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "arrays must have one type argument"
            r0.<init>(r1)
            throw r0
        L_0x0242:
            if (r6 == 0) goto L_0x02d3
            boolean r6 = m0.r.t.a.r.j.e.b(r5)
            if (r6 == 0) goto L_0x0287
            boolean r6 = r2.e
            if (r6 != 0) goto L_0x0287
            m0.r.t.a.r.m.x0.k r6 = m0.r.t.a.r.m.x0.k.a
            m0.n.b.i.e(r6, r7)
            java.lang.String r7 = "inlineClassType"
            m0.n.b.i.e(r0, r7)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            m0.r.t.a.r.m.z0.f r6 = P(r6, r0, r7)
            m0.r.t.a.r.m.v r6 = (m0.r.t.a.r.m.v) r6
            if (r6 == 0) goto L_0x0287
            m0.r.t.a.r.e.b.s r0 = new m0.r.t.a.r.e.b.s
            boolean r8 = r2.d
            boolean r10 = r2.f
            boolean r11 = r2.g
            boolean r12 = r2.h
            m0.r.t.a.r.e.b.s r13 = r2.i
            boolean r14 = r2.j
            m0.r.t.a.r.e.b.s r15 = r2.k
            m0.r.t.a.r.e.b.s r2 = r2.l
            r9 = 1
            r17 = 0
            r18 = 512(0x200, float:7.175E-43)
            r7 = r0
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = T2(r6, r1, r0, r3, r4)
            return r0
        L_0x0287:
            boolean r6 = r2.f
            if (r6 == 0) goto L_0x029d
            r6 = r5
            m0.r.t.a.r.c.d r6 = (m0.r.t.a.r.c.d) r6
            m0.r.t.a.r.g.d r7 = m0.r.t.a.r.b.f.a
            m0.r.t.a.r.g.c r7 = m0.r.t.a.r.b.g.a.X
            boolean r6 = m0.r.t.a.r.b.f.c(r6, r7)
            if (r6 == 0) goto L_0x029d
            java.lang.Object r1 = r20.e()
            goto L_0x02cf
        L_0x029d:
            m0.r.t.a.r.c.d r5 = (m0.r.t.a.r.c.d) r5
            m0.r.t.a.r.c.d r6 = r5.a()
            java.lang.String r7 = "descriptor.original"
            m0.n.b.i.d(r6, r7)
            java.lang.Object r6 = r3.a(r6)
            if (r6 != 0) goto L_0x02ce
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r6 = r5.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r7 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r6 != r7) goto L_0x02bc
            m0.r.t.a.r.c.i r5 = r5.b()
            m0.r.t.a.r.c.d r5 = (m0.r.t.a.r.c.d) r5
        L_0x02bc:
            m0.r.t.a.r.c.d r5 = r5.a()
            java.lang.String r6 = "enumClassIfEnumEntry.original"
            m0.n.b.i.d(r5, r6)
            java.lang.String r3 = Q(r5, r3)
            java.lang.Object r1 = r1.c(r3)
            goto L_0x02cf
        L_0x02ce:
            r1 = r6
        L_0x02cf:
            r4.invoke(r0, r1, r2)
            return r1
        L_0x02d3:
            boolean r6 = r5 instanceof m0.r.t.a.r.c.m0
            if (r6 == 0) goto L_0x02e4
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            m0.r.t.a.r.m.v r0 = m0.r.t.a.r.m.a1.a.V1(r5)
            m0.n.a.q<java.lang.Object, java.lang.Object, java.lang.Object, m0.i> r4 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.b
            java.lang.Object r0 = T2(r0, r1, r2, r3, r4)
            return r0
        L_0x02e4:
            boolean r6 = r5 instanceof m0.r.t.a.r.c.l0
            if (r6 == 0) goto L_0x02f7
            boolean r6 = r2.m
            if (r6 == 0) goto L_0x02f7
            m0.r.t.a.r.c.l0 r5 = (m0.r.t.a.r.c.l0) r5
            m0.r.t.a.r.m.a0 r0 = r5.U()
            java.lang.Object r0 = T2(r0, r1, r2, r3, r4)
            return r0
        L_0x02f7:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unknown type "
            java.lang.String r0 = m0.n.b.i.k(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0303:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "no descriptor for type constructor of "
            java.lang.String r0 = m0.n.b.i.k(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x030f:
            boolean r3 = r2.d
            m0.n.b.i.e(r1, r7)
            m0.n.b.i.e(r10, r11)
            if (r3 == 0) goto L_0x031d
            java.lang.Object r10 = r1.d(r10)
        L_0x031d:
            r4.invoke(r0, r10, r2)
            return r10
        L_0x0321:
            java.lang.Object r0 = T2(r6, r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.T2(m0.r.t.a.r.m.v, m0.r.t.a.r.e.b.g, m0.r.t.a.r.e.b.s, m0.r.t.a.r.e.b.q, m0.n.a.q):java.lang.Object");
    }

    public static int T3(m0.r.t.a.r.m.z0.l lVar, m0.r.t.a.r.m.z0.h hVar) {
        m0.n.b.i.e(lVar, "this");
        m0.n.b.i.e(hVar, "receiver");
        if (hVar instanceof g) {
            return lVar.b((m0.r.t.a.r.m.z0.f) hVar);
        }
        if (hVar instanceof ArgumentList) {
            return ((ArgumentList) hVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + hVar + ", " + m.a(hVar.getClass())).toString());
    }

    public static final <T> boolean U(T[] tArr, T t) {
        m0.n.b.i.e(tArr, "$this$contains");
        return Y1(tArr, t) >= 0;
    }

    public static final Object U0(KPropertyImpl.a<?, ?> aVar) {
        m0.n.b.i.e(aVar, "$this$boundReceiver");
        KPropertyImpl<?> t = aVar.t();
        return I(t.d2, t.p());
    }

    public static int U1(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static final CallableMemberDescriptor.Kind U2(m0.r.t.a.r.k.b.s sVar, ProtoBuf$MemberKind protoBuf$MemberKind) {
        m0.n.b.i.e(sVar, "<this>");
        int i = protoBuf$MemberKind == null ? -1 : m0.r.t.a.r.k.b.t.a[protoBuf$MemberKind.ordinal()];
        if (i == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return CallableMemberDescriptor.Kind.DELEGATION;
        }
        if (i != 4) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        return CallableMemberDescriptor.Kind.SYNTHESIZED;
    }

    public static final <T> void U3(List<T> list, Comparator<? super T> comparator) {
        m0.n.b.i.e(list, "$this$sortWith");
        m0.n.b.i.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final <T> Collection<T> V(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        m0.n.b.i.e(iterable, "$this$convertToSetForSetOperationWith");
        m0.n.b.i.e(iterable2, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return m0.j.g.t0(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return collection.size() > 2 && (collection instanceof ArrayList) ? m0.j.g.t0(iterable) : collection;
    }

    public static Uri V0(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    public static int V1(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static final int V2(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final <T> List<T> V3(T[] tArr, Comparator<? super T> comparator) {
        m0.n.b.i.e(tArr, "$this$sortedWith");
        m0.n.b.i.e(comparator, "comparator");
        m0.n.b.i.e(tArr, "$this$sortedArrayWith");
        m0.n.b.i.e(comparator, "comparator");
        if (!(tArr.length == 0)) {
            tArr = Arrays.copyOf(tArr, tArr.length);
            m0.n.b.i.d(tArr, "java.util.Arrays.copyOf(this, size)");
            m0.n.b.i.e(tArr, "$this$sortWith");
            m0.n.b.i.e(comparator, "comparator");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return m0.j.g.d(tArr);
    }

    public static final TypeVariance W(Variance variance) {
        m0.n.b.i.e(variance, "<this>");
        int ordinal = variance.ordinal();
        if (ordinal == 0) {
            return TypeVariance.INV;
        }
        if (ordinal == 1) {
            return TypeVariance.IN;
        }
        if (ordinal == 2) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static m0.r.t.a.r.g.c W0(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            m0.r.t.a.r.c.f c2 = ((j0) jVar).c();
            Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return DescriptorUtilsKt.i((d) c2);
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static int W1(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                return U1(b2, bArr[i]);
            }
            if (i3 == 2) {
                return V1(b2, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else if (b2 > -12) {
            return -1;
        } else {
            return b2;
        }
    }

    public static final long W2(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    public static final v W3(m0 m0Var) {
        m0.n.b.i.e(m0Var, "<this>");
        List<m0> parameters = ((m0.r.t.a.r.c.g) m0Var.b()).i().getParameters();
        m0.n.b.i.d(parameters, "classDescriptor.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(K(parameters, 10));
        for (m0 i : parameters) {
            arrayList.add(i.i());
        }
        TypeSubstitutor e = TypeSubstitutor.e(new f0(arrayList));
        List<v> upperBounds = m0Var.getUpperBounds();
        m0.n.b.i.d(upperBounds, "this.upperBounds");
        v k = e.k((v) m0.j.g.u(upperBounds), Variance.OUT_VARIANCE);
        if (k != null) {
            return k;
        }
        a0 m = DescriptorUtilsKt.f(m0Var).m();
        m0.n.b.i.d(m, "builtIns.defaultBound");
        return m;
    }

    public static final void X(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(a.j0("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    public static final m0.r.t.a.r.g.a X0(m0.r.t.a.r.f.c.c cVar, int i) {
        m0.n.b.i.e(cVar, "<this>");
        m0.r.t.a.r.g.a f = m0.r.t.a.r.g.a.f(cVar.a(i), cVar.c(i));
        m0.n.b.i.d(f, "fromString(getQualifiedClassName(index), isLocalClassName(index))");
        return f;
    }

    public static final int X1(int[] iArr, int i) {
        m0.n.b.i.e(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final long X2(Random random, m0.q.h hVar) {
        m0.n.b.i.e(random, "$this$nextLong");
        m0.n.b.i.e(hVar, "range");
        if (!hVar.isEmpty()) {
            long j = hVar.d;
            if (j < RecyclerView.FOREVER_NS) {
                return random.d(hVar.c, j + 1);
            }
            long j2 = hVar.c;
            if (j2 > Long.MIN_VALUE) {
                return random.d(j2 - 1, j) + 1;
            }
            return random.c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + hVar);
    }

    public static void X3(Activity activity) {
        Intent intent;
        String string = activity.getString(R.string.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!i2(activity)) {
            ArrayList arrayList2 = new ArrayList();
            Uri V0 = V0(activity);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo next : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = next.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(next.activityInfo.packageName);
                if (V0 != null) {
                    intent3.putExtra("output", V0);
                }
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        List<Intent> g1 = g1(packageManager, "android.intent.action.GET_CONTENT", false);
        if (((ArrayList) g1).size() == 0) {
            g1 = g1(packageManager, "android.intent.action.PICK", false);
        }
        arrayList.addAll(g1);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, string);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        activity.startActivityForResult(createChooser, 200);
    }

    public static long Y(InputStream inputStream, OutputStream outputStream, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        m0.n.b.i.e(inputStream, "$this$copyTo");
        m0.n.b.i.e(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static Collection Y0(m0.r.t.a.r.j.u.h hVar, m0.r.t.a.r.j.u.d dVar, m0.n.a.l lVar, int i, Object obj) {
        m0.n.a.l<m0.r.t.a.r.g.d, Boolean> lVar2;
        if ((i & 1) != 0) {
            dVar = m0.r.t.a.r.j.u.d.m;
        }
        if ((i & 2) != 0) {
            Objects.requireNonNull(MemberScope.a);
            lVar2 = MemberScope.Companion.b;
        } else {
            lVar2 = null;
        }
        return hVar.g(dVar, lVar2);
    }

    public static final <T> int Y1(T[] tArr, T t) {
        m0.n.b.i.e(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (m0.n.b.i.a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final ProtoBuf$Type Y2(ProtoBuf$Type protoBuf$Type, m0.r.t.a.r.f.c.e eVar) {
        m0.n.b.i.e(protoBuf$Type, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        if (protoBuf$Type.A()) {
            return protoBuf$Type.h2;
        }
        if ((protoBuf$Type.y & 512) == 512) {
            return eVar.a(protoBuf$Type.i2);
        }
        return null;
    }

    public static byte[] Y3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static final List<o0> Z(Collection<m0.r.t.a.r.e.a.t.j> collection, Collection<? extends o0> collection2, m0.r.t.a.r.c.a aVar) {
        m0.n.b.i.e(collection, "newValueParametersTypes");
        m0.n.b.i.e(collection2, "oldValueParameters");
        m0.n.b.i.e(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<Pair<T, R>> F0 = m0.j.g.F0(collection, collection2);
        ArrayList arrayList = new ArrayList(K(F0, 10));
        Iterator it = ((ArrayList) F0).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m0.r.t.a.r.e.a.t.j jVar = (m0.r.t.a.r.e.a.t.j) pair.c;
            o0 o0Var = (o0) pair.d;
            int g = o0Var.g();
            f annotations = o0Var.getAnnotations();
            m0.r.t.a.r.g.d name = o0Var.getName();
            m0.n.b.i.d(name, "oldParameter.name");
            v vVar = jVar.a;
            boolean z = jVar.b;
            boolean a0 = o0Var.a0();
            boolean W = o0Var.W();
            v g2 = o0Var.k0() != null ? DescriptorUtilsKt.k(aVar).m().g(jVar.a) : null;
            h0 r = o0Var.r();
            m0.n.b.i.d(r, "oldParameter.source");
            arrayList.add(new ValueParameterDescriptorImpl(aVar, (o0) null, g, annotations, name, vVar, z, a0, W, g2, r));
        }
        return arrayList;
    }

    public static Map<Integer, List<String>> Z0() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        HashMap hashMap2 = hashMap;
        ArrayList j1 = a.j1(arrayList, "VI", 1, hashMap2, arrayList, 2);
        j1.add("RU");
        j1.add("KZ");
        hashMap.put(7, j1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("EG");
        hashMap.put(36, a.h1(34, hashMap, a.h1(33, hashMap, a.h1(32, hashMap, a.h1(31, hashMap, a.h1(30, hashMap, a.h1(27, hashMap, a.h1(20, hashMap, arrayList2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add("IT");
        arrayList3.add("VA");
        hashMap.put(43, a.h1(41, hashMap, a.h1(40, hashMap, a.h1(39, hashMap, arrayList3, 1, "RO"), 1, "CH"), 1, "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, a.h1(45, hashMap, arrayList5, 1, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, a.h1(58, hashMap, a.h1(57, hashMap, a.h1(56, hashMap, a.h1(55, hashMap, a.h1(54, hashMap, a.h1(53, hashMap, a.h1(52, hashMap, a.h1(51, hashMap, a.h1(49, hashMap, a.h1(48, hashMap, a.h1(47, hashMap, arrayList6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        ArrayList j12 = a.j1(arrayList7, "CX", 61, hashMap2, arrayList7, 1);
        ArrayList j13 = a.j1(j12, "ID", 62, hashMap2, j12, 1);
        ArrayList j14 = a.j1(j13, "PH", 63, hashMap2, j13, 1);
        ArrayList j15 = a.j1(j14, "NZ", 64, hashMap2, j14, 1);
        ArrayList j16 = a.j1(j15, "SG", 65, hashMap2, j15, 1);
        ArrayList j17 = a.j1(j16, "TH", 66, hashMap2, j16, 1);
        ArrayList j18 = a.j1(j17, "JP", 81, hashMap2, j17, 1);
        ArrayList j19 = a.j1(j18, "KR", 82, hashMap2, j18, 1);
        ArrayList j110 = a.j1(j19, "VN", 84, hashMap2, j19, 1);
        ArrayList j111 = a.j1(j110, "CN", 86, hashMap2, j110, 1);
        ArrayList j112 = a.j1(j111, "TR", 90, hashMap2, j111, 1);
        ArrayList j113 = a.j1(j112, "IN", 91, hashMap2, j112, 1);
        ArrayList j114 = a.j1(j113, "PK", 92, hashMap2, j113, 1);
        ArrayList j115 = a.j1(j114, "AF", 93, hashMap2, j114, 1);
        ArrayList j116 = a.j1(j115, "LK", 94, hashMap2, j115, 1);
        ArrayList j117 = a.j1(j116, "MM", 95, hashMap2, j116, 1);
        ArrayList j118 = a.j1(j117, "IR", 98, hashMap2, j117, 1);
        ArrayList j119 = a.j1(j118, "SS", 211, hashMap2, j118, 2);
        j119.add("MA");
        j119.add("EH");
        hashMap.put(212, j119);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("DZ");
        hashMap.put(261, a.h1(260, hashMap, a.h1(258, hashMap, a.h1(257, hashMap, a.h1(256, hashMap, a.h1(255, hashMap, a.h1(254, hashMap, a.h1(253, hashMap, a.h1(252, hashMap, a.h1(251, hashMap, a.h1(k.d.DEFAULT_SWIPE_ANIMATION_DURATION, hashMap, a.h1(249, hashMap, a.h1(248, hashMap, a.h1(247, hashMap, a.h1(246, hashMap, a.h1(245, hashMap, a.h1(244, hashMap, a.h1(243, hashMap, a.h1(242, hashMap, a.h1(241, hashMap, a.h1(240, hashMap, a.h1(239, hashMap, a.h1(238, hashMap, a.h1(237, hashMap, a.h1(236, hashMap, a.h1(235, hashMap, a.h1(234, hashMap, a.h1(233, hashMap, a.h1(232, hashMap, a.h1(231, hashMap, a.h1(230, hashMap, a.h1(229, hashMap, a.h1(228, hashMap, a.h1(227, hashMap, a.h1(226, hashMap, a.h1(225, hashMap, a.h1(224, hashMap, a.h1(223, hashMap, a.h1(222, hashMap, a.h1(221, hashMap, a.h1(220, hashMap, a.h1(218, hashMap, a.h1(216, hashMap, a.h1(213, hashMap, arrayList8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        ArrayList arrayList9 = new ArrayList(2);
        arrayList9.add("RE");
        arrayList9.add("YT");
        hashMap.put(269, a.h1(268, hashMap, a.h1(267, hashMap, a.h1(266, hashMap, a.h1(265, hashMap, a.h1(264, hashMap, a.h1(263, hashMap, a.h1(262, hashMap, arrayList9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        ArrayList arrayList10 = new ArrayList(2);
        arrayList10.add("SH");
        arrayList10.add("TA");
        hashMap.put(357, a.h1(356, hashMap, a.h1(355, hashMap, a.h1(354, hashMap, a.h1(353, hashMap, a.h1(352, hashMap, a.h1(351, hashMap, a.h1(350, hashMap, a.h1(299, hashMap, a.h1(298, hashMap, a.h1(297, hashMap, a.h1(291, hashMap, a.h1(290, hashMap, arrayList10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("FI");
        arrayList11.add("AX");
        hashMap.put(509, a.h1(508, hashMap, a.h1(507, hashMap, a.h1(506, hashMap, a.h1(505, hashMap, a.h1(504, hashMap, a.h1(503, hashMap, a.h1(502, hashMap, a.h1(501, hashMap, a.h1(500, hashMap, a.h1(423, hashMap, a.h1(421, hashMap, a.h1(420, hashMap, a.h1(389, hashMap, a.h1(387, hashMap, a.h1(386, hashMap, a.h1(385, hashMap, a.h1(383, hashMap, a.h1(382, hashMap, a.h1(381, hashMap, a.h1(380, hashMap, a.h1(378, hashMap, a.h1(377, hashMap, a.h1(376, hashMap, a.h1(375, hashMap, a.h1(374, hashMap, a.h1(373, hashMap, a.h1(372, hashMap, a.h1(371, hashMap, a.h1(370, hashMap, a.h1(359, hashMap, a.h1(358, hashMap, arrayList11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        ArrayList arrayList12 = new ArrayList(3);
        arrayList12.add("GP");
        arrayList12.add("BL");
        ArrayList j120 = a.j1(arrayList12, "MF", 590, hashMap2, arrayList12, 1);
        ArrayList j121 = a.j1(j120, "BO", 591, hashMap2, j120, 1);
        ArrayList j122 = a.j1(j121, "GY", 592, hashMap2, j121, 1);
        ArrayList j123 = a.j1(j122, "EC", 593, hashMap2, j122, 1);
        ArrayList j124 = a.j1(j123, "GF", 594, hashMap2, j123, 1);
        ArrayList j125 = a.j1(j124, "PY", 595, hashMap2, j124, 1);
        ArrayList j126 = a.j1(j125, "MQ", 596, hashMap2, j125, 1);
        ArrayList j127 = a.j1(j126, "SR", 597, hashMap2, j126, 1);
        ArrayList j128 = a.j1(j127, "UY", 598, hashMap2, j127, 2);
        j128.add("CW");
        j128.add("BQ");
        hashMap.put(599, j128);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("TL");
        hashMap.put(998, a.h1(996, hashMap, a.h1(995, hashMap, a.h1(994, hashMap, a.h1(993, hashMap, a.h1(992, hashMap, a.h1(979, hashMap, a.h1(977, hashMap, a.h1(976, hashMap, a.h1(975, hashMap, a.h1(974, hashMap, a.h1(973, hashMap, a.h1(972, hashMap, a.h1(971, hashMap, a.h1(970, hashMap, a.h1(968, hashMap, a.h1(967, hashMap, a.h1(966, hashMap, a.h1(965, hashMap, a.h1(964, hashMap, a.h1(963, hashMap, a.h1(962, hashMap, a.h1(961, hashMap, a.h1(960, hashMap, a.h1(888, hashMap, a.h1(886, hashMap, a.h1(883, hashMap, a.h1(882, hashMap, a.h1(881, hashMap, a.h1(880, hashMap, a.h1(878, hashMap, a.h1(870, hashMap, a.h1(856, hashMap, a.h1(855, hashMap, a.h1(853, hashMap, a.h1(852, hashMap, a.h1(850, hashMap, a.h1(808, hashMap, a.h1(MaterialMenuDrawable.DEFAULT_TRANSFORM_DURATION, hashMap, a.h1(692, hashMap, a.h1(691, hashMap, a.h1(690, hashMap, a.h1(689, hashMap, a.h1(688, hashMap, a.h1(687, hashMap, a.h1(686, hashMap, a.h1(685, hashMap, a.h1(683, hashMap, a.h1(682, hashMap, a.h1(681, hashMap, a.h1(680, hashMap, a.h1(679, hashMap, a.h1(678, hashMap, a.h1(677, hashMap, a.h1(676, hashMap, a.h1(675, hashMap, a.h1(674, hashMap, a.h1(673, hashMap, a.h1(672, hashMap, a.h1(670, hashMap, arrayList13, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static /* synthetic */ void Z1(i0.n.a.c cVar, String str, Throwable th, int i, Object obj) {
        int i2 = i & 2;
        cVar.b(str, (Throwable) null);
    }

    public static final List<m0.r.t.a.r.c.v> Z2(w wVar, m0.r.t.a.r.g.b bVar) {
        m0.n.b.i.e(wVar, "<this>");
        m0.n.b.i.e(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        J(wVar, bVar, arrayList);
        return arrayList;
    }

    public static TypeSubstitutor Z3(List<m0> list, p0 p0Var, m0.r.t.a.r.c.i iVar, List<m0> list2) {
        if (p0Var == null) {
            e(1);
            throw null;
        } else if (iVar == null) {
            e(2);
            throw null;
        } else if (list2 != null) {
            TypeSubstitutor a4 = a4(list, p0Var, iVar, list2, (boolean[]) null);
            if (a4 != null) {
                return a4;
            }
            throw new AssertionError("Substitution failed");
        } else {
            e(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final m0.r.t.a.r.e.a.u.c a0(m0.r.t.a.r.e.a.u.c cVar, f fVar) {
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(fVar, "additionalAnnotations");
        return fVar.isEmpty() ? cVar : new m0.r.t.a.r.e.a.u.c(cVar.a, cVar.b, G2(LazyThreadSafetyMode.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(cVar, fVar)));
    }

    public static final v a1(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        if (vVar instanceof t0) {
            return ((t0) vVar).E();
        }
        return null;
    }

    public static final v0 a2(v0 v0Var, v vVar) {
        m0.n.b.i.e(v0Var, "<this>");
        m0.n.b.i.e(vVar, "origin");
        return G4(v0Var, a1(vVar));
    }

    public static List<X509Certificate> a3(List<Base64> list) throws ParseException {
        X509Certificate x509Certificate;
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                try {
                    x509Certificate = g3(list.get(i).a());
                } catch (CertificateException unused) {
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    linkedList.add(x509Certificate);
                } else {
                    throw new ParseException(a.e0("Invalid X.509 certificate at position ", i), 0);
                }
            }
        }
        return linkedList;
    }

    public static TypeSubstitutor a4(List<m0> list, p0 p0Var, m0.r.t.a.r.c.i iVar, List<m0> list2, boolean[] zArr) {
        p0 p0Var2 = p0Var;
        List<m0> list3 = list2;
        if (list == null) {
            e(5);
            throw null;
        } else if (p0Var2 == null) {
            e(6);
            throw null;
        } else if (iVar == null) {
            e(7);
            throw null;
        } else if (list3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (m0 next : list) {
                g0 L0 = g0.L0(iVar, next.getAnnotations(), next.B(), next.l(), next.getName(), i, h0.a, next.g0());
                hashMap.put(next.i(), new m0.r.t.a.r.m.o0(L0.q()));
                hashMap2.put(next, L0);
                list3.add(L0);
                i++;
            }
            l0.a aVar = l0.b;
            m0.n.b.i.e(hashMap, "map");
            TypeSubstitutor f = TypeSubstitutor.f(p0Var2, l0.a.c(aVar, hashMap, false, 2));
            for (m0 next2 : list) {
                g0 g0Var = (g0) hashMap2.get(next2);
                for (v next3 : next2.getUpperBounds()) {
                    v k = f.k(next3, Variance.IN_VARIANCE);
                    if (k == null) {
                        return null;
                    }
                    if (!(k == next3 || zArr == null)) {
                        zArr[0] = true;
                    }
                    g0Var.J0(k);
                }
                g0Var.K0();
                g0Var.f2 = true;
            }
            return f;
        } else {
            e(8);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static n b0(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        s0.a.b.e0.a aVar = new s0.a.b.e0.a();
        aVar.init(z, new y0(secretKey.getEncoded()));
        n nVar = new n(aVar);
        nVar.init(z, new s0.a.b.k0.a(new y0(secretKey.getEncoded()), 128, bArr, bArr2));
        return nVar;
    }

    public static final v b1(CallableMemberDescriptor callableMemberDescriptor) {
        m0.r.t.a.r.c.f0 l02 = callableMemberDescriptor.l0();
        m0.r.t.a.r.c.f0 e0 = callableMemberDescriptor.e0();
        if (l02 != null) {
            return l02.getType();
        }
        if (e0 == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof m0.r.t.a.r.c.h) {
            return e0.getType();
        }
        m0.r.t.a.r.c.i b2 = callableMemberDescriptor.b();
        if (!(b2 instanceof d)) {
            b2 = null;
        }
        d dVar = (d) b2;
        if (dVar != null) {
            return dVar.q();
        }
        return null;
    }

    public static final <T> m0.l.c<T> b2(m0.l.c<? super T> cVar) {
        m0.l.c<Object> intercepted;
        m0.n.b.i.e(cVar, "$this$intercepted");
        ContinuationImpl continuationImpl = (ContinuationImpl) (!(cVar instanceof ContinuationImpl) ? null : cVar);
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? cVar : intercepted;
    }

    public static Map<String, Object> b3(String str) throws ParseException {
        try {
            Object a2 = new i0.l.a.i.a.h.d(640).a(str);
            if (a2 instanceof JSONObject) {
                return (JSONObject) a2;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e) {
            StringBuilder P0 = a.P0("Invalid JSON: ");
            P0.append(e.getMessage());
            throw new ParseException(P0.toString(), 0);
        } catch (Exception e2) {
            throw new ParseException(a.a0(e2, a.P0("Unexpected exception: ")), 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r0.charAt(r2.length()) == '.') goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.r.g.b b4(m0.r.t.a.r.g.b r5, m0.r.t.a.r.g.b r6) {
        /*
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r5, r0)
            java.lang.String r1 = "prefix"
            m0.n.b.i.e(r6, r1)
            m0.n.b.i.e(r5, r0)
            java.lang.String r0 = "packageName"
            m0.n.b.i.e(r6, r0)
            boolean r0 = m0.n.b.i.a(r5, r6)
            r1 = 1
            if (r0 == 0) goto L_0x001a
            goto L_0x0047
        L_0x001a:
            boolean r0 = r6.d()
            if (r0 == 0) goto L_0x0021
            goto L_0x0047
        L_0x0021:
            java.lang.String r0 = r5.b()
            java.lang.String r2 = "this.asString()"
            m0.n.b.i.d(r0, r2)
            java.lang.String r2 = r6.b()
            java.lang.String r3 = "packageName.asString()"
            m0.n.b.i.d(r2, r3)
            r3 = 0
            r4 = 2
            boolean r4 = kotlin.text.StringsKt__IndentKt.J(r0, r2, r3, r4)
            if (r4 == 0) goto L_0x0048
            int r2 = r2.length()
            char r0 = r0.charAt(r2)
            r2 = 46
            if (r0 != r2) goto L_0x0048
        L_0x0047:
            r3 = r1
        L_0x0048:
            if (r3 == 0) goto L_0x0080
            boolean r0 = r6.d()
            if (r0 == 0) goto L_0x0051
            goto L_0x0080
        L_0x0051:
            boolean r0 = m0.n.b.i.a(r5, r6)
            if (r0 == 0) goto L_0x005f
            m0.r.t.a.r.g.b r5 = m0.r.t.a.r.g.b.a
            java.lang.String r6 = "ROOT"
            m0.n.b.i.d(r5, r6)
            goto L_0x0080
        L_0x005f:
            m0.r.t.a.r.g.b r0 = new m0.r.t.a.r.g.b
            java.lang.String r5 = r5.b()
            java.lang.String r2 = "asString()"
            m0.n.b.i.d(r5, r2)
            java.lang.String r6 = r6.b()
            int r6 = r6.length()
            int r6 = r6 + r1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            m0.n.b.i.d(r5, r6)
            r0.<init>((java.lang.String) r5)
            r5 = r0
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.b4(m0.r.t.a.r.g.b, m0.r.t.a.r.g.b):m0.r.t.a.r.g.b");
    }

    public static /* synthetic */ void c(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 18 ? 3 : 2)];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static final <T> T c0(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        m0.n.b.i.e(cls, "annotationClass");
        m0.n.b.i.e(map, "values");
        m0.n.b.i.e(list, "methods");
        AnnotationConstructorCallerKt$createAnnotationInstance$2 annotationConstructorCallerKt$createAnnotationInstance$2 = new AnnotationConstructorCallerKt$createAnnotationInstance$2(cls, list, map);
        m0.c H2 = H2(new AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2(map));
        m0.c H22 = H2(new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new m0.r.t.a.q.a(cls, H22, (m0.r.k) null, H2, (m0.r.k) null, annotationConstructorCallerKt$createAnnotationInstance$2, map));
        Objects.requireNonNull(newProxyInstance, "null cannot be cast to non-null type T");
        return newProxyInstance;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T c1(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.e<M, T> eVar) {
        m0.n.b.i.e(extendableMessage, "<this>");
        m0.n.b.i.e(eVar, "extension");
        if (extendableMessage.n(eVar)) {
            return extendableMessage.m(eVar);
        }
        return null;
    }

    public static final boolean c2(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        return vVar.I0() instanceof m0.r.t.a.r.j.o.a.b;
    }

    public static Algorithm c3(Map<String, Object> map) throws ParseException {
        String str = (String) h1(map, "alg", String.class);
        Algorithm algorithm = Algorithm.c;
        if (str == null) {
            return null;
        }
        return new Algorithm(str, (Requirement) null);
    }

    public static void c4(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static final m0.r.t.a.r.m.m0 d0(m0.r.t.a.r.m.m0 m0Var, m0 m0Var2) {
        if (m0Var2 == null || m0Var.b() == Variance.INVARIANT) {
            return m0Var;
        }
        if (m0Var2.l() != m0Var.b()) {
            m0.n.b.i.e(m0Var, "typeProjection");
            m0.r.t.a.r.j.o.a.c cVar = new m0.r.t.a.r.j.o.a.c(m0Var);
            Objects.requireNonNull(f.i);
            return new m0.r.t.a.r.m.o0(new m0.r.t.a.r.j.o.a.a(m0Var, cVar, false, f.a.b));
        } else if (!m0Var.c()) {
            return new m0.r.t.a.r.m.o0(m0Var.getType());
        } else {
            m0.r.t.a.r.l.l lVar = LockBasedStorageManager.b;
            m0.n.b.i.d(lVar, "NO_LOCKS");
            return new m0.r.t.a.r.m.o0(new m0.r.t.a.r.m.w(lVar, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(m0Var)));
        }
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T d1(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.e<M, List<T>> eVar, int i) {
        int i2;
        m0.n.b.i.e(extendableMessage, "<this>");
        m0.n.b.i.e(eVar, "extension");
        extendableMessage.w(eVar);
        m0.r.t.a.r.h.f<GeneratedMessageLite.d> fVar = extendableMessage.c;
        GeneratedMessageLite.d dVar = eVar.d;
        Objects.requireNonNull(fVar);
        if (dVar.x) {
            Object f = fVar.f(dVar);
            if (f == null) {
                i2 = 0;
            } else {
                i2 = ((List) f).size();
            }
            if (i >= i2) {
                return null;
            }
            extendableMessage.w(eVar);
            m0.r.t.a.r.h.f<GeneratedMessageLite.d> fVar2 = extendableMessage.c;
            GeneratedMessageLite.d dVar2 = eVar.d;
            Objects.requireNonNull(fVar2);
            if (dVar2.x) {
                Object f2 = fVar2.f(dVar2);
                if (f2 != null) {
                    return eVar.a(((List) f2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public static boolean d2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            return ((j0) jVar).c() instanceof d;
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static Set<KeyOperation> d3(Map<String, Object> map) throws ParseException {
        return KeyOperation.parse(E1(map, "key_ops"));
    }

    public static final void d4(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).c;
        }
    }

    public static /* synthetic */ void e(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static final <T> m0.l.c<m0.i> e0(m0.n.a.l<? super m0.l.c<? super T>, ? extends Object> lVar, m0.l.c<? super T> cVar) {
        m0.n.b.i.e(lVar, "$this$createCoroutineUnintercepted");
        m0.n.b.i.e(cVar, "completion");
        m0.n.b.i.e(cVar, "completion");
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(cVar);
        }
        m0.l.e context = cVar.getContext();
        if (context == EmptyCoroutineContext.c) {
            return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(cVar, cVar, lVar);
        }
        return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(cVar, context, cVar, context, lVar);
    }

    public static m0.r.t.a.r.g.b e1(c cVar) {
        m0.n.b.i.e(cVar, "this");
        d e = DescriptorUtilsKt.e(cVar);
        if (e == null) {
            return null;
        }
        if (m0.r.t.a.r.m.p.j(e)) {
            e = null;
        }
        if (e == null) {
            return null;
        }
        return DescriptorUtilsKt.d(e);
    }

    public static boolean e2(m0.r.t.a.r.c.v0.b.e eVar) {
        m0.n.b.i.e(eVar, "this");
        return false;
    }

    public static KeyType e3(Map<String, Object> map) throws ParseException {
        try {
            return KeyType.a((String) h1(map, "kty", String.class));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static List<Base64> e4(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (obj == null) {
                throw new ParseException(a.g0("The X.509 certificate at position ", i, " must not be null"), 0);
            } else if (obj instanceof String) {
                linkedList.add(new Base64((String) obj));
                i++;
            } else {
                throw new ParseException(a.g0("The X.509 certificate at position ", i, " must be encoded as a Base64 string"), 0);
            }
        }
        return linkedList;
    }

    public static void f(FragmentManager fragmentManager, Fragment fragment, int i, int i2) {
        h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
        aVar.d = i;
        aVar.e = i2;
        aVar.f = 0;
        aVar.g = 0;
        aVar.o(com.instabug.survey.R.id.instabug_fragment_container, fragment, (String) null);
        aVar.h();
    }

    public static final <R, T> m0.l.c<m0.i> f0(m0.n.a.p<? super R, ? super m0.l.c<? super T>, ? extends Object> pVar, R r, m0.l.c<? super T> cVar) {
        m0.n.b.i.e(pVar, "$this$createCoroutineUnintercepted");
        m0.n.b.i.e(cVar, "completion");
        m0.n.b.i.e(cVar, "completion");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r, cVar);
        }
        m0.l.e context = cVar.getContext();
        if (context == EmptyCoroutineContext.c) {
            return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(cVar, cVar, pVar, r);
        }
        return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(cVar, context, cVar, context, pVar, r);
    }

    public static m0.b f1(Fragment fragment, m0.b bVar) {
        j0.a.a.c.b.c a2 = ((j0.a.a.c.b.b) L0(fragment, j0.a.a.c.b.b.class)).a();
        Objects.requireNonNull(a2);
        return a2.a(fragment, fragment.getArguments(), bVar);
    }

    public static final boolean f2(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        return vVar.L0() instanceof m0.r.t.a.r.m.n;
    }

    public static KeyUse f3(Map<String, Object> map) throws ParseException {
        String str = (String) h1(map, "use", String.class);
        KeyUse keyUse = KeyUse.c;
        if (str == null) {
            return null;
        }
        KeyUse keyUse2 = KeyUse.c;
        if (!str.equals(keyUse2.q)) {
            keyUse2 = KeyUse.d;
            if (!str.equals(keyUse2.q)) {
                if (!str.trim().isEmpty()) {
                    keyUse2 = new KeyUse(str);
                } else {
                    throw new ParseException("JWK use value must not be empty or blank", 0);
                }
            }
        }
        return keyUse2;
    }

    public static byte[] f4(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static void g(FragmentManager fragmentManager, Survey survey, int i, int i2) {
        Fragment fragment;
        if (survey.getQuestions().get(0).q == 0) {
            int i3 = com.instabug.survey.ui.i.l.c.a.d2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("survey", survey);
            bundle.putSerializable("question", survey.getQuestions().get(0));
            com.instabug.survey.ui.i.l.c.a aVar = new com.instabug.survey.ui.i.l.c.a();
            aVar.setArguments(bundle);
            f(fragmentManager, aVar, i, i2);
        } else if (survey.getQuestions().get(0).q == 1) {
            f(fragmentManager, com.instabug.survey.ui.i.h.c.a.N0(survey), i, i2);
        } else if (survey.getQuestions().get(0).q == 2) {
            f(fragmentManager, com.instabug.survey.ui.i.k.b.a.N0(survey), i, i2);
        } else if (survey.getQuestions().get(0).q == 3) {
            f(fragmentManager, com.instabug.survey.ui.i.i.b.a.N0(survey), i, i2);
        } else if (survey.getQuestions().get(0).q == 5) {
            if (i0.j.f.o.c.f()) {
                int i4 = com.instabug.survey.ui.h.b.q;
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("KEY_SURVEY_ARGUMENT", survey);
                fragment = new com.instabug.survey.ui.h.b();
                fragment.setArguments(bundle2);
            } else {
                int i5 = com.instabug.survey.ui.h.c.q;
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("KEY_SURVEY_ARGUMENT", survey);
                fragment = new com.instabug.survey.ui.h.c();
                fragment.setArguments(bundle3);
            }
            f(fragmentManager, fragment, i, i2);
        }
    }

    public static m0.r.t.a.r.c.t0.a0 g0(m0.r.t.a.r.c.c0 c0Var, f fVar) {
        if (fVar != null) {
            return n0(c0Var, fVar, true, false, false, c0Var.r());
        }
        d(14);
        throw null;
    }

    public static List<Intent> g1(PackageManager packageManager, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static boolean g2(m0.r.t.a.r.c.r rVar) {
        return rVar.f() == CallableMemberDescriptor.Kind.SYNTHESIZED && m0.r.t.a.r.j.d.q(rVar.b());
    }

    public static X509Certificate g3(byte[] bArr) throws CertificateException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        StringBuilder P0 = a.P0("Not a X.509 certificate: ");
        P0.append(generateCertificate.getType());
        throw new CertificateException(P0.toString());
    }

    public static final <T, C extends Collection<? super T>> C g4(T[] tArr, C c2) {
        m0.n.b.i.e(tArr, "$this$toCollection");
        m0.n.b.i.e(c2, "destination");
        for (T add : tArr) {
            c2.add(add);
        }
        return c2;
    }

    public static final m0.r.t.a.r.g.b h(m0.r.t.a.r.g.b bVar, String str) {
        m0.r.t.a.r.g.b c2 = bVar.c(m0.r.t.a.r.g.d.g(str));
        m0.n.b.i.d(c2, "child(Name.identifier(name))");
        return c2;
    }

    public static b0 h0(m0.r.t.a.r.c.c0 c0Var, f fVar, f fVar2) {
        if (fVar == null) {
            d(1);
            throw null;
        } else if (fVar2 != null) {
            h0 r = c0Var.r();
            if (r != null) {
                return r0(c0Var, fVar, fVar2, true, false, false, c0Var.getVisibility(), r);
            }
            d(6);
            throw null;
        } else {
            d(2);
            throw null;
        }
    }

    public static <T> T h1(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t = map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new ParseException(a.o0("Unexpected type of JSON object member with key \"", str, "\""), 0);
    }

    public static final boolean h2(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        v0 L0 = vVar.L0();
        return (L0 instanceof m0.r.t.a.r.m.o) || ((L0 instanceof m0.r.t.a.r.m.q) && (((m0.r.t.a.r.m.q) L0).P0() instanceof m0.r.t.a.r.m.o));
    }

    public static List<Base64> h3(Map<String, Object> map) throws ParseException {
        List<Base64> e4 = e4(j1(map, "x5c"));
        if (e4 == null || !e4.isEmpty()) {
            return e4;
        }
        return null;
    }

    public static final m0.r.t.a.r.c.p h4(q0 q0Var) {
        m0.n.b.i.e(q0Var, "<this>");
        m0.r.t.a.r.c.p pVar = m0.r.t.a.r.e.a.m.d.get(q0Var);
        if (pVar == null) {
            pVar = m0.r.t.a.r.c.o.h(q0Var);
        }
        m0.n.b.i.d(pVar, "toDescriptorVisibility(this)");
        return pVar;
    }

    public static final m0.r.t.a.r.g.b i(m0.r.t.a.r.g.c cVar, String str) {
        m0.r.t.a.r.g.b i = cVar.c(m0.r.t.a.r.g.d.g(str)).i();
        m0.n.b.i.d(i, "child(Name.identifier(name)).toSafe()");
        return i;
    }

    public static m0.r.t.a.r.c.g0 i0(d dVar) {
        d dVar2 = dVar;
        if (dVar2 != null) {
            f.a aVar = f.i;
            Objects.requireNonNull(aVar);
            f fVar = f.a.b;
            d0 R0 = d0.R0(dVar2, fVar, m0.r.t.a.r.b.g.c, CallableMemberDescriptor.Kind.SYNTHESIZED, dVar.r());
            Objects.requireNonNull(aVar);
            d0 d0Var = R0;
            d0 T0 = d0Var.K0((m0.r.t.a.r.c.f0) null, (m0.r.t.a.r.c.f0) null, Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(R0, (o0) null, 0, fVar, m0.r.t.a.r.g.d.g(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE), DescriptorUtilsKt.f(dVar).v(), false, false, false, (v) null, dVar.r())), dVar.q(), Modality.FINAL, m0.r.t.a.r.c.o.e);
            if (T0 != null) {
                return T0;
            }
            d(25);
            throw null;
        }
        d(24);
        throw null;
    }

    public static Cipher i1(String str, Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    public static boolean i2(Context context) {
        boolean z;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase("android.permission.CAMERA")) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        z = false;
        if (!z || context.checkSelfPermission("android.permission.CAMERA") == 0) {
            return false;
        }
        return true;
    }

    public static int i3(byte[] bArr, int i, int i2) {
        while (r8 < i2 && bArr[r8] >= 0) {
            i = r8 + 1;
        }
        if (r8 >= i2) {
            return 0;
        }
        while (r8 < i2) {
            int i3 = r8 + 1;
            byte b2 = bArr[r8];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i3 >= i2) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        r8 = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                } else if (b2 < -16) {
                    if (i3 >= i2 - 1) {
                        return W1(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        r8 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                } else if (i3 >= i2 - 2) {
                    return W1(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b4 = bArr[i3];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            r8 = i3;
        }
        return 0;
    }

    public static final Class<?> i4(m0.r.t.a.r.c.i iVar) {
        if (!(iVar instanceof d) || !m0.r.t.a.r.j.e.b(iVar)) {
            return null;
        }
        d dVar = (d) iVar;
        Class<?> h = m0.r.t.a.o.h(dVar);
        if (h != null) {
            return h;
        }
        StringBuilder P0 = a.P0("Class object for the class ");
        P0.append(dVar.getName());
        P0.append(" cannot be found (classId=");
        P0.append(DescriptorUtilsKt.g((m0.r.t.a.r.c.f) iVar));
        P0.append(')');
        throw new KotlinReflectionInternalError(P0.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.t.a.q.c j(kotlin.reflect.jvm.internal.KPropertyImpl.a r6, boolean r7) {
        /*
            java.lang.Class<?> r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.c
            kotlin.text.Regex r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.d
            kotlin.reflect.jvm.internal.KPropertyImpl r1 = r6.t()
            java.lang.String r1 = r1.c2
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0014
            m0.r.t.a.q.g r6 = m0.r.t.a.q.g.a
            goto L_0x01ed
        L_0x0014:
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1 r0 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1
            r0.<init>(r6)
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2
            r1.<init>(r6)
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$3 r2 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$3
            r2.<init>(r6, r7, r1, r0)
            m0.r.t.a.n r1 = m0.r.t.a.n.b
            kotlin.reflect.jvm.internal.KPropertyImpl r1 = r6.t()
            m0.r.t.a.r.c.c0 r1 = r1.p()
            m0.r.t.a.c r1 = m0.r.t.a.n.c(r1)
            boolean r3 = r1 instanceof m0.r.t.a.c.C0244c
            if (r3 == 0) goto L_0x015b
            m0.r.t.a.c$c r1 = (m0.r.t.a.c.C0244c) r1
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = r1.d
            r4 = 0
            if (r7 == 0) goto L_0x0045
            boolean r7 = r3.i()
            if (r7 == 0) goto L_0x004e
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r7 = r3.Z1
            goto L_0x004f
        L_0x0045:
            boolean r7 = r3.l()
            if (r7 == 0) goto L_0x004e
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r7 = r3.a2
            goto L_0x004f
        L_0x004e:
            r7 = r4
        L_0x004f:
            if (r7 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.KPropertyImpl r3 = r6.t()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r3 = r3.a2
            m0.r.t.a.r.f.c.c r4 = r1.e
            int r5 = r7.y
            java.lang.String r4 = r4.b(r5)
            m0.r.t.a.r.f.c.c r1 = r1.e
            int r7 = r7.Y1
            java.lang.String r7 = r1.b(r7)
            java.lang.reflect.Method r4 = r3.m(r4, r7)
        L_0x006b:
            if (r4 != 0) goto L_0x010c
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r6.t()
            m0.r.t.a.r.c.c0 r7 = r7.p()
            boolean r7 = m0.r.t.a.r.j.e.d(r7)
            if (r7 == 0) goto L_0x00e1
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r6.t()
            m0.r.t.a.r.c.c0 r7 = r7.p()
            m0.r.t.a.r.c.p r7 = r7.getVisibility()
            m0.r.t.a.r.c.p r0 = m0.r.t.a.r.c.o.d
            boolean r7 = m0.n.b.i.a(r7, r0)
            if (r7 == 0) goto L_0x00e1
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r6.t()
            m0.r.t.a.r.c.c0 r7 = r7.p()
            m0.r.t.a.r.c.i r7 = r7.b()
            java.lang.Class r7 = i4(r7)
            if (r7 == 0) goto L_0x00c5
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.t()
            m0.r.t.a.r.c.c0 r0 = r0.p()
            java.lang.reflect.Method r7 = J1(r7, r0)
            boolean r0 = r6.r()
            if (r0 == 0) goto L_0x00be
            m0.r.t.a.q.f$a r0 = new m0.r.t.a.q.f$a
            java.lang.Object r1 = U0(r6)
            r0.<init>(r7, r1)
            goto L_0x018e
        L_0x00be:
            m0.r.t.a.q.f$b r0 = new m0.r.t.a.q.f$b
            r0.<init>(r7)
            goto L_0x018e
        L_0x00c5:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r0 = "Underlying property of inline class "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.t()
            r0.append(r6)
            java.lang.String r6 = " should have a field"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00e1:
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r6.t()
            m0.r.t.a.k<java.lang.reflect.Field> r7 = r7.Y1
            java.lang.Object r7 = r7.invoke()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 == 0) goto L_0x00f5
            m0.r.t.a.q.d r0 = r2.invoke(r7)
            goto L_0x018e
        L_0x00f5:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r0 = "No accessors or field is found for property "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.t()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x010c:
            int r7 = r4.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x012d
            boolean r7 = r6.r()
            if (r7 == 0) goto L_0x0126
            m0.r.t.a.q.d$g$a r7 = new m0.r.t.a.q.d$g$a
            java.lang.Object r0 = U0(r6)
            r7.<init>(r4, r0)
            goto L_0x012b
        L_0x0126:
            m0.r.t.a.q.d$g$d r7 = new m0.r.t.a.q.d$g$d
            r7.<init>(r4)
        L_0x012b:
            r0 = r7
            goto L_0x018e
        L_0x012d:
            boolean r7 = r0.invoke()
            if (r7 == 0) goto L_0x0145
            boolean r7 = r6.r()
            if (r7 == 0) goto L_0x013f
            m0.r.t.a.q.d$g$b r7 = new m0.r.t.a.q.d$g$b
            r7.<init>(r4)
            goto L_0x012b
        L_0x013f:
            m0.r.t.a.q.d$g$e r7 = new m0.r.t.a.q.d$g$e
            r7.<init>(r4)
            goto L_0x012b
        L_0x0145:
            boolean r7 = r6.r()
            if (r7 == 0) goto L_0x0155
            m0.r.t.a.q.d$g$c r7 = new m0.r.t.a.q.d$g$c
            java.lang.Object r0 = U0(r6)
            r7.<init>(r4, r0)
            goto L_0x012b
        L_0x0155:
            m0.r.t.a.q.d$g$f r7 = new m0.r.t.a.q.d$g$f
            r7.<init>(r4)
            goto L_0x012b
        L_0x015b:
            boolean r0 = r1 instanceof m0.r.t.a.c.a
            if (r0 == 0) goto L_0x0168
            m0.r.t.a.c$a r1 = (m0.r.t.a.c.a) r1
            java.lang.reflect.Field r7 = r1.a
            m0.r.t.a.q.d r0 = r2.invoke(r7)
            goto L_0x018e
        L_0x0168:
            boolean r0 = r1 instanceof m0.r.t.a.c.b
            if (r0 == 0) goto L_0x01ad
            if (r7 == 0) goto L_0x0173
            m0.r.t.a.c$b r1 = (m0.r.t.a.c.b) r1
            java.lang.reflect.Method r7 = r1.a
            goto L_0x0179
        L_0x0173:
            m0.r.t.a.c$b r1 = (m0.r.t.a.c.b) r1
            java.lang.reflect.Method r7 = r1.b
            if (r7 == 0) goto L_0x0198
        L_0x0179:
            boolean r0 = r6.r()
            if (r0 == 0) goto L_0x0189
            m0.r.t.a.q.d$g$a r0 = new m0.r.t.a.q.d$g$a
            java.lang.Object r1 = U0(r6)
            r0.<init>(r7, r1)
            goto L_0x018e
        L_0x0189:
            m0.r.t.a.q.d$g$d r0 = new m0.r.t.a.q.d$g$d
            r0.<init>(r7)
        L_0x018e:
            m0.r.t.a.r.c.b0 r6 = r6.s()
            r7 = 0
            m0.r.t.a.q.c r6 = o0(r0, r6, r7)
            goto L_0x01ed
        L_0x0198:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r7 = "No source found for setter of Java method property: "
            java.lang.StringBuilder r7 = i0.d.a.a.a.P0(r7)
            java.lang.reflect.Method r0 = r1.a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x01ad:
            boolean r0 = r1 instanceof m0.r.t.a.c.d
            if (r0 == 0) goto L_0x021c
            if (r7 == 0) goto L_0x01b8
            m0.r.t.a.c$d r1 = (m0.r.t.a.c.d) r1
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = r1.a
            goto L_0x01be
        L_0x01b8:
            m0.r.t.a.c$d r1 = (m0.r.t.a.c.d) r1
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = r1.b
            if (r7 == 0) goto L_0x0205
        L_0x01be:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r6.t()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.a2
            m0.r.t.a.r.f.d.a.e$b r7 = r7.b
            java.lang.String r1 = r7.a
            java.lang.String r7 = r7.b
            java.lang.reflect.Method r7 = r0.m(r1, r7)
            if (r7 == 0) goto L_0x01ee
            int r0 = r7.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r6.r()
            if (r0 == 0) goto L_0x01e8
            m0.r.t.a.q.d$g$a r0 = new m0.r.t.a.q.d$g$a
            java.lang.Object r6 = U0(r6)
            r0.<init>(r7, r6)
            r6 = r0
            goto L_0x01ed
        L_0x01e8:
            m0.r.t.a.q.d$g$d r6 = new m0.r.t.a.q.d$g$d
            r6.<init>(r7)
        L_0x01ed:
            return r6
        L_0x01ee:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r0 = "No accessor found for property "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.t()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0205:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r0 = "No setter found for property "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            kotlin.reflect.jvm.internal.KPropertyImpl r6 = r6.t()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x021c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.j(kotlin.reflect.jvm.internal.KPropertyImpl$a, boolean):m0.r.t.a.q.c");
    }

    public static m0.r.t.a.r.c.g0 j0(d dVar) {
        if (dVar != null) {
            Objects.requireNonNull(f.i);
            d0 T0 = d0.R0(dVar, f.a.b, m0.r.t.a.r.b.g.b, CallableMemberDescriptor.Kind.SYNTHESIZED, dVar.r()).K0((m0.r.t.a.r.c.f0) null, (m0.r.t.a.r.c.f0) null, Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.f(dVar).h(Variance.INVARIANT, dVar.q()), Modality.FINAL, m0.r.t.a.r.c.o.e);
            if (T0 != null) {
                return T0;
            }
            d(23);
            throw null;
        }
        d(22);
        throw null;
    }

    public static List<Object> j1(Map<String, Object> map, String str) throws ParseException {
        return (List) h1(map, str, List.class);
    }

    public static final boolean j2(d dVar) {
        m0.n.b.i.e(dVar, "<this>");
        return dVar.j() == Modality.FINAL && dVar.f() != ClassKind.ENUM_CLASS;
    }

    public static final m0.r.t.a.r.g.d j3(m0.r.t.a.r.g.d dVar, boolean z) {
        m0.n.b.i.e(dVar, "methodName");
        return k3(dVar, "set", false, z ? "is" : null, 4);
    }

    public static final Class<?> j4(v vVar) {
        m0.n.b.i.e(vVar, "$this$toInlineClass");
        return i4(vVar.I0().c());
    }

    public static final String k(Object obj) {
        StringBuilder P0 = a.P0("ClassicTypeCheckerContext couldn't handle ");
        P0.append(m.a(obj.getClass()));
        P0.append(' ');
        P0.append(obj);
        return P0.toString();
    }

    public static m0.r.t.a.r.c.f0 k0(m0.r.t.a.r.c.a aVar, v vVar, f fVar) {
        if (fVar == null) {
            d(30);
            throw null;
        } else if (vVar == null) {
            return null;
        } else {
            return new m0.r.t.a.r.c.t0.c0(aVar, new m0.r.t.a.r.j.u.i.b(aVar, vVar, (m0.r.t.a.r.j.u.i.d) null), fVar);
        }
    }

    public static Map<String, Object> k1(Map<String, Object> map, String str) throws ParseException {
        return (Map) h1(map, str, JSONObject.class);
    }

    public static final boolean k2(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        return vVar.L0() instanceof m0.r.t.a.r.m.q;
    }

    public static m0.r.t.a.r.g.d k3(m0.r.t.a.r.g.d dVar, String str, boolean z, String str2, int i) {
        Object obj;
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!dVar.d) {
            String e = dVar.e();
            m0.n.b.i.d(e, "methodName.identifier");
            boolean z2 = false;
            if (StringsKt__IndentKt.J(e, str, false, 2) && e.length() != str.length()) {
                char charAt = e.charAt(str.length());
                if (!('a' <= charAt && charAt <= 'z')) {
                    if (str2 != null) {
                        return m0.r.t.a.r.g.d.g(m0.n.b.i.k(str2, StringsKt__IndentKt.x(e, str)));
                    }
                    if (!z) {
                        return dVar;
                    }
                    String x = StringsKt__IndentKt.x(e, str);
                    m0.n.b.i.e(x, "<this>");
                    if (!(x.length() == 0) && m0.r.t.a.r.m.a1.a.A2(x, 0, true)) {
                        if (x.length() == 1 || !m0.r.t.a.r.m.a1.a.A2(x, 1, true)) {
                            m0.n.b.i.e(x, "<this>");
                            if (!(x.length() == 0)) {
                                char charAt2 = x.charAt(0);
                                if ('A' <= charAt2 && charAt2 <= 'Z') {
                                    z2 = true;
                                }
                                if (z2) {
                                    char lowerCase = Character.toLowerCase(charAt2);
                                    String substring = x.substring(1);
                                    m0.n.b.i.d(substring, "(this as java.lang.String).substring(startIndex)");
                                    x = String.valueOf(lowerCase) + substring;
                                }
                            }
                        } else {
                            m0.n.b.i.e(x, "$this$indices");
                            Iterator it = new m0.q.e(0, x.length() - 1).iterator();
                            while (true) {
                                if (!((m0.q.d) it).d) {
                                    obj = null;
                                    break;
                                }
                                obj = ((m0.j.o) it).next();
                                if (!m0.r.t.a.r.m.a1.a.A2(x, ((Number) obj).intValue(), true)) {
                                    break;
                                }
                            }
                            Integer num = (Integer) obj;
                            if (num == null) {
                                x = m0.r.t.a.r.m.a1.a.d4(x, true);
                            } else {
                                int intValue = num.intValue() - 1;
                                String substring2 = x.substring(0, intValue);
                                m0.n.b.i.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                String d4 = m0.r.t.a.r.m.a1.a.d4(substring2, true);
                                String substring3 = x.substring(intValue);
                                m0.n.b.i.d(substring3, "(this as java.lang.String).substring(startIndex)");
                                x = m0.n.b.i.k(d4, substring3);
                            }
                        }
                    }
                    if (m0.r.t.a.r.g.d.i(x)) {
                        return m0.r.t.a.r.g.d.g(x);
                    }
                }
            }
        }
        return null;
    }

    public static String k4(Map<String, ?> map) {
        int i = JSONObject.c;
        return JSONObject.d(map, i0.l.a.i.a.f.a);
    }

    public static final String l(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        m0.n.b.i.d(parameterTypes, "parameterTypes");
        sb.append(E2(parameterTypes, "", "(", ")", 0, (CharSequence) null, RuntimeTypeMapperKt$signature$1.c, 24));
        Class<?> returnType = method.getReturnType();
        m0.n.b.i.d(returnType, "returnType");
        sb.append(ReflectClassUtilKt.c(returnType));
        return sb.toString();
    }

    public static final Object l0(Throwable th) {
        m0.n.b.i.e(th, "exception");
        return new Result.Failure(th);
    }

    public static final <T> Class<T> l1(m0.r.d<T> dVar) {
        m0.n.b.i.e(dVar, "$this$java");
        Class<?> h = ((m0.n.b.c) dVar).h();
        Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.Class<T>");
        return h;
    }

    public static boolean l2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            m0.r.t.a.r.c.f c2 = ((j0) jVar).c();
            Boolean bool = null;
            d dVar = c2 instanceof d ? (d) c2 : null;
            if (dVar != null) {
                bool = Boolean.valueOf(m0.r.t.a.r.j.e.b(dVar));
            }
            return m0.n.b.i.a(bool, Boolean.TRUE);
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static Application l3(j0.a.a.c.d.a aVar) {
        Application application = (Application) aVar.a.getApplicationContext();
        Objects.requireNonNull(application, "Cannot return null from a non-@Nullable @Provides method");
        return application;
    }

    public static final <T> List<T> l4(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return EmptyList.c;
        }
        if (length != 1) {
            return m4(tArr);
        }
        return L2(tArr[0]);
    }

    public static final void m(Throwable th, Throwable th2) {
        m0.n.b.i.e(th, "$this$addSuppressed");
        m0.n.b.i.e(th2, "exception");
        if (th != th2) {
            m0.m.b.a.a(th, th2);
        }
    }

    public static m0.r.t.a.r.m.z0.f m0(m0.r.t.a.r.m.x0.c cVar, g gVar, g gVar2) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "lowerBound");
        m0.n.b.i.e(gVar2, "upperBound");
        if (!(gVar instanceof a0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + m.a(cVar.getClass())).toString());
        } else if (gVar2 instanceof a0) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            return KotlinTypeFactory.c((a0) gVar, (a0) gVar2);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + m.a(cVar.getClass())).toString());
        }
    }

    public static final <T> Class<T> m1(m0.r.d<T> dVar) {
        m0.n.b.i.e(dVar, "$this$javaObjectType");
        Class<?> h = ((m0.n.b.c) dVar).h();
        if (!h.isPrimitive()) {
            return h;
        }
        String name = h.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : h;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return h;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return h;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return h;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return h;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return h;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return h;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return h;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return h;
            default:
                return h;
        }
    }

    public static boolean m2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            return jVar instanceof IntegerLiteralTypeConstructor;
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static Context m3(j0.a.a.c.d.a aVar) {
        Context context = aVar.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public static final <T> List<T> m4(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$toMutableList");
        m0.n.b.i.e(tArr, "$this$asCollection");
        return new ArrayList(new m0.j.d(tArr, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037 A[Catch:{ Exception -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[Catch:{ Exception -> 0x0040 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] n(com.nimbusds.jose.JWEHeader r4, byte[] r5) throws com.nimbusds.jose.JOSEException {
        /*
            com.nimbusds.jose.CompressionAlgorithm r4 = r4.k2
            if (r4 != 0) goto L_0x0005
            return r5
        L_0x0005:
            com.nimbusds.jose.CompressionAlgorithm r0 = com.nimbusds.jose.CompressionAlgorithm.c
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0051
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0040 }
            r4.<init>()     // Catch:{ Exception -> 0x0040 }
            r0 = 0
            java.util.zip.Deflater r1 = new java.util.zip.Deflater     // Catch:{ all -> 0x0033 }
            r2 = 8
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0033 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0031 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0031 }
            r2.write(r5)     // Catch:{ all -> 0x002e }
            r2.close()     // Catch:{ Exception -> 0x0040 }
            r1.end()     // Catch:{ Exception -> 0x0040 }
            byte[] r4 = r4.toByteArray()     // Catch:{ Exception -> 0x0040 }
            return r4
        L_0x002e:
            r4 = move-exception
            r0 = r2
            goto L_0x0035
        L_0x0031:
            r4 = move-exception
            goto L_0x0035
        L_0x0033:
            r4 = move-exception
            r1 = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ Exception -> 0x0040 }
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.end()     // Catch:{ Exception -> 0x0040 }
        L_0x003f:
            throw r4     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            r4 = move-exception
            com.nimbusds.jose.JOSEException r5 = new com.nimbusds.jose.JOSEException
            java.lang.String r0 = "Couldn't compress plain text: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r0 = i0.d.a.a.a.a0(r4, r0)
            r5.<init>(r0, r4)
            throw r5
        L_0x0051:
            com.nimbusds.jose.JOSEException r5 = new com.nimbusds.jose.JOSEException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported compression algorithm: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.n(com.nimbusds.jose.JWEHeader, byte[]):byte[]");
    }

    public static m0.r.t.a.r.c.t0.a0 n0(m0.r.t.a.r.c.c0 c0Var, f fVar, boolean z, boolean z2, boolean z3, h0 h0Var) {
        if (fVar == null) {
            d(18);
            throw null;
        } else if (h0Var != null) {
            return new m0.r.t.a.r.c.t0.a0(c0Var, fVar, c0Var.j(), c0Var.getVisibility(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, (m0.r.t.a.r.c.d0) null, h0Var);
        } else {
            d(19);
            throw null;
        }
    }

    public static final <T> Class<T> n1(m0.r.d<T> dVar) {
        m0.n.b.i.e(dVar, "$this$javaPrimitiveType");
        Class<?> h = ((m0.n.b.c) dVar).h();
        if (h.isPrimitive()) {
            return h;
        }
        String name = h.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static final boolean n2(m0.r.t.a.r.c.c0 c0Var) {
        m0.n.b.i.e(c0Var, "<this>");
        return c0Var.getGetter() == null;
    }

    public static final String n3(Reader reader) {
        m0.n.b.i.e(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        m0.n.b.i.e(reader, "$this$copyTo");
        m0.n.b.i.e(stringWriter, "out");
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        m0.n.b.i.d(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static final <T> Set<T> n4(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.c;
        }
        if (length == 1) {
            return N3(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(R2(tArr.length));
        g4(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean o(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        byte b2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            b2 |= bArr[i] ^ bArr2[i];
        }
        if (b2 == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if ((r0 != null && m0.r.t.a.r.j.e.c(r0)) != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> m0.r.t.a.q.c<M> o0(m0.r.t.a.q.c<? extends M> r5, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, boolean r7) {
        /*
            java.lang.String r0 = "$this$createInlineClassAwareCallerIfNeeded"
            m0.n.b.i.e(r5, r0)
            java.lang.String r0 = "descriptor"
            m0.n.b.i.e(r6, r0)
            boolean r0 = m0.r.t.a.r.j.e.a(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x006b
            java.util.List r0 = r6.h()
            java.lang.String r3 = "descriptor.valueParameters"
            m0.n.b.i.d(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0048
        L_0x0023:
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r0.next()
            m0.r.t.a.r.c.o0 r3 = (m0.r.t.a.r.c.o0) r3
            java.lang.String r4 = "it"
            m0.n.b.i.d(r3, r4)
            m0.r.t.a.r.m.v r3 = r3.getType()
            java.lang.String r4 = "it.type"
            m0.n.b.i.d(r3, r4)
            boolean r3 = m0.r.t.a.r.j.e.c(r3)
            if (r3 == 0) goto L_0x0027
            r0 = r2
        L_0x0048:
            if (r0 != 0) goto L_0x006b
            m0.r.t.a.r.m.v r0 = r6.getReturnType()
            if (r0 == 0) goto L_0x0056
            boolean r0 = m0.r.t.a.r.j.e.c(r0)
            if (r0 == r2) goto L_0x006b
        L_0x0056:
            boolean r0 = r5 instanceof m0.r.t.a.q.b
            if (r0 != 0) goto L_0x006c
            m0.r.t.a.r.m.v r0 = b1(r6)
            if (r0 == 0) goto L_0x0068
            boolean r0 = m0.r.t.a.r.j.e.c(r0)
            if (r0 != r2) goto L_0x0068
            r0 = r2
            goto L_0x0069
        L_0x0068:
            r0 = r1
        L_0x0069:
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r1 = r2
        L_0x006c:
            if (r1 == 0) goto L_0x0074
            m0.r.t.a.q.e r0 = new m0.r.t.a.q.e
            r0.<init>(r6, r5, r7)
            r5 = r0
        L_0x0074:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.o0(m0.r.t.a.q.c, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):m0.r.t.a.q.c");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: m0.r.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final m0.r.d<?> o1(m0.r.e r5) {
        /*
            java.lang.String r0 = "$this$jvmErasure"
            m0.n.b.i.e(r5, r0)
            boolean r0 = r5 instanceof m0.r.d
            if (r0 == 0) goto L_0x000c
            m0.r.d r5 = (m0.r.d) r5
            goto L_0x0072
        L_0x000c:
            boolean r0 = r5 instanceof m0.r.o
            if (r0 == 0) goto L_0x0073
            m0.r.o r5 = (m0.r.o) r5
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r0 = r5.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            r3 = r1
            m0.r.n r3 = (m0.r.n) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            java.util.Objects.requireNonNull(r3, r4)
            kotlin.reflect.jvm.internal.KTypeImpl r3 = (kotlin.reflect.jvm.internal.KTypeImpl) r3
            m0.r.t.a.r.m.v r3 = r3.y
            m0.r.t.a.r.m.j0 r3 = r3.I0()
            m0.r.t.a.r.c.f r3 = r3.c()
            boolean r4 = r3 instanceof m0.r.t.a.r.c.d
            if (r4 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            m0.r.t.a.r.c.d r2 = (m0.r.t.a.r.c.d) r2
            if (r2 == 0) goto L_0x0055
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = r2.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r3 == r4) goto L_0x0055
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r2.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x001a
            r2 = r1
        L_0x0059:
            m0.r.n r2 = (m0.r.n) r2
            if (r2 == 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            java.lang.Object r5 = m0.j.g.w(r5)
            r2 = r5
            m0.r.n r2 = (m0.r.n) r2
        L_0x0065:
            if (r2 == 0) goto L_0x006c
            m0.r.d r5 = p1(r2)
            goto L_0x0072
        L_0x006c:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            m0.r.d r5 = m0.n.b.m.a(r5)
        L_0x0072:
            return r5
        L_0x0073:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.o1(m0.r.e):m0.r.d");
    }

    public static final boolean o2(m0.r.t.a.r.b.b bVar, d dVar) {
        m0.n.b.i.e(bVar, "<this>");
        m0.n.b.i.e(dVar, "classDescriptor");
        if (m0.r.t.a.r.j.d.p(dVar)) {
            Set<m0.r.t.a.r.g.a> set = m0.r.t.a.r.b.b.b;
            m0.r.t.a.r.g.a g = DescriptorUtilsKt.g(dVar);
            if (m0.j.g.f(set, g == null ? null : g.g())) {
                return true;
            }
        }
        return false;
    }

    public static final ProtoBuf$Type o3(ProtoBuf$Function protoBuf$Function, m0.r.t.a.r.f.c.e eVar) {
        m0.n.b.i.e(protoBuf$Function, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        if (protoBuf$Function.x()) {
            return protoBuf$Function.e2;
        }
        if (protoBuf$Function.y()) {
            return eVar.a(protoBuf$Function.f2);
        }
        return null;
    }

    public static final <K, V> Map<K, V> o4(Map<? extends K, ? extends V> map) {
        m0.n.b.i.e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        m0.n.b.i.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static int p(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        if (fVar instanceof v) {
            return ((v) fVar).H0().size();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public static final m0.r.t.a.r.e.a.x.e p0(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        if (!z2 || nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            return new m0.r.t.a.r.e.a.x.e(nullabilityQualifier, mutabilityQualifier, false, z);
        }
        return new m0.r.t.a.r.e.a.x.e(nullabilityQualifier, mutabilityQualifier, true, z);
    }

    public static final m0.r.d<?> p1(m0.r.n nVar) {
        m0.r.d<?> o1;
        m0.n.b.i.e(nVar, "$this$jvmErasure");
        m0.r.e c2 = nVar.c();
        if (c2 != null && (o1 = o1(c2)) != null) {
            return o1;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + nVar);
    }

    public static boolean p2(m0.r.t.a.r.m.x0.c cVar, g gVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "receiver");
        if (gVar instanceof a0) {
            return ((a0) gVar).J0();
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    public static final void p3(m0.r.t.a.r.d.a.c cVar, m0.r.t.a.r.d.a.b bVar, d dVar, m0.r.t.a.r.g.d dVar2) {
        m0.r.t.a.r.d.a.a location;
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(bVar, "from");
        m0.n.b.i.e(dVar, "scopeOwner");
        m0.n.b.i.e(dVar2, "name");
        if (cVar != c.a.a && (location = bVar.getLocation()) != null) {
            Position b2 = cVar.a() ? location.b() : Position.d;
            String a2 = location.a();
            String b3 = m0.r.t.a.r.j.d.g(dVar).b();
            m0.n.b.i.d(b3, "getFqName(scopeOwner).asString()");
            ScopeKind scopeKind = ScopeKind.CLASSIFIER;
            String b4 = dVar2.b();
            m0.n.b.i.d(b4, "name.asString()");
            cVar.b(a2, b2, b3, scopeKind, b4);
        }
    }

    public static final Class<?> p4(ClassLoader classLoader, String str) {
        m0.n.b.i.e(classLoader, "<this>");
        m0.n.b.i.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final <E> E[] q(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final l0 q0(d dVar, d dVar2) {
        m0.n.b.i.e(dVar, "from");
        m0.n.b.i.e(dVar2, "to");
        int size = dVar.t().size();
        int size2 = dVar2.t().size();
        l0.a aVar = l0.b;
        List<m0.r.t.a.r.c.m0> t = dVar.t();
        m0.n.b.i.d(t, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(K(t, 10));
        for (m0.r.t.a.r.c.m0 i : t) {
            arrayList.add(i.i());
        }
        List<m0.r.t.a.r.c.m0> t2 = dVar2.t();
        m0.n.b.i.d(t2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(K(t2, 10));
        for (m0.r.t.a.r.c.m0 q : t2) {
            a0 q2 = q.q();
            m0.n.b.i.d(q2, "it.defaultType");
            arrayList2.add(m0.r.t.a.r.m.a1.a.Y(q2));
        }
        return l0.a.c(aVar, m0.j.g.w0(m0.j.g.F0(arrayList, arrayList2)), false, 2);
    }

    public static final String q1(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2;
        m0.n.b.i.e(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor x1 = m0.r.t.a.r.b.f.A(callableMemberDescriptor) ? x1(callableMemberDescriptor) : null;
        if (x1 == null) {
            callableMemberDescriptor2 = null;
        } else {
            callableMemberDescriptor2 = DescriptorUtilsKt.m(x1);
        }
        if (callableMemberDescriptor2 == null) {
            return null;
        }
        if (callableMemberDescriptor2 instanceof m0.r.t.a.r.c.c0) {
            return ClassicBuiltinSpecialProperties.a.a(callableMemberDescriptor2);
        }
        if (!(callableMemberDescriptor2 instanceof m0.r.t.a.r.c.g0)) {
            return null;
        }
        m0.r.t.a.r.e.a.b bVar = m0.r.t.a.r.e.a.b.m;
        m0.r.t.a.r.c.g0 g0Var = (m0.r.t.a.r.c.g0) callableMemberDescriptor2;
        m0.n.b.i.e(g0Var, "functionDescriptor");
        Map<String, m0.r.t.a.r.g.d> map = SpecialGenericSignatures.j;
        String c2 = m0.r.t.a.r.e.b.n.c(g0Var);
        m0.r.t.a.r.g.d dVar = c2 == null ? null : map.get(c2);
        if (dVar == null) {
            return null;
        }
        return dVar.b();
    }

    public static boolean q2(m0.r.t.a.r.m.z0.l lVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(lVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        return (fVar instanceof g) && lVar.i((g) fVar);
    }

    public static final void q3(m0.r.t.a.r.d.a.c cVar, m0.r.t.a.r.d.a.b bVar, m0.r.t.a.r.c.v vVar, m0.r.t.a.r.g.d dVar) {
        m0.r.t.a.r.d.a.a location;
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(bVar, "from");
        m0.n.b.i.e(vVar, "scopeOwner");
        m0.n.b.i.e(dVar, "name");
        String b2 = vVar.d().b();
        m0.n.b.i.d(b2, "scopeOwner.fqName.asString()");
        String b3 = dVar.b();
        m0.n.b.i.d(b3, "name.asString()");
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(bVar, "from");
        m0.n.b.i.e(b2, "packageFqName");
        m0.n.b.i.e(b3, "name");
        if (cVar != c.a.a && (location = bVar.getLocation()) != null) {
            cVar.b(location.a(), cVar.a() ? location.b() : Position.d, b2, ScopeKind.PACKAGE, b3);
        }
    }

    public static <T, R> boolean q4(k0.b.o<T> oVar, k0.b.p<? super R> pVar, e<? super T, ? extends k0.b.o<? extends R>> eVar) {
        if (!(oVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) oVar).call();
            if (call == null) {
                EmptyDisposable.complete((k0.b.p<?>) pVar);
                return true;
            }
            try {
                Object apply = eVar.apply(call);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                k0.b.o oVar2 = (k0.b.o) apply;
                if (oVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) oVar2).call();
                        if (call2 == null) {
                            EmptyDisposable.complete((k0.b.p<?>) pVar);
                            return true;
                        }
                        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(pVar, call2);
                        pVar.a(observableScalarXMap$ScalarDisposable);
                        observableScalarXMap$ScalarDisposable.run();
                    } catch (Throwable th) {
                        c4(th);
                        EmptyDisposable.error(th, (k0.b.p<?>) pVar);
                        return true;
                    }
                } else {
                    oVar2.c(pVar);
                }
                return true;
            } catch (Throwable th2) {
                c4(th2);
                EmptyDisposable.error(th2, (k0.b.p<?>) pVar);
                return true;
            }
        } catch (Throwable th3) {
            c4(th3);
            EmptyDisposable.error(th3, (k0.b.p<?>) pVar);
            return true;
        }
    }

    public static m0.r.t.a.r.m.z0.b r(m0.r.t.a.r.m.x0.c cVar, g gVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "receiver");
        if (!(gVar instanceof a0)) {
            throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
        } else if (gVar instanceof m0.r.t.a.r.m.i) {
            return (m0.r.t.a.r.m.i) gVar;
        } else {
            return null;
        }
    }

    public static b0 r0(m0.r.t.a.r.c.c0 c0Var, f fVar, f fVar2, boolean z, boolean z2, boolean z3, m0.r.t.a.r.c.p pVar, h0 h0Var) {
        f fVar3 = fVar2;
        if (fVar == null) {
            d(8);
            throw null;
        } else if (fVar3 == null) {
            d(9);
            throw null;
        } else if (pVar == null) {
            d(10);
            throw null;
        } else if (h0Var != null) {
            b0 b0Var = new b0(c0Var, fVar, c0Var.j(), pVar, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, (e0) null, h0Var);
            b0Var.K0(b0.I0(b0Var, c0Var.getType(), fVar2));
            return b0Var;
        } else {
            d(11);
            throw null;
        }
    }

    public static final <T> m0.r.d<T> r1(Class<T> cls) {
        m0.n.b.i.e(cls, "$this$kotlin");
        return m.a(cls);
    }

    public static boolean r2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            return m0.r.t.a.r.b.f.L((j0) jVar, g.a.c);
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String r3(m0.r.t.a.r.g.d r7) {
        /*
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r7, r0)
            boolean r0 = r7.d
            r1 = 0
            java.lang.String r2 = "asString()"
            if (r0 == 0) goto L_0x000d
            goto L_0x0040
        L_0x000d:
            java.lang.String r0 = r7.b()
            m0.n.b.i.d(r0, r2)
            java.util.Set<java.lang.String> r3 = m0.r.t.a.r.i.e.a
            boolean r3 = r3.contains(r0)
            r4 = 1
            if (r3 != 0) goto L_0x003f
            r3 = r1
        L_0x001e:
            int r5 = r0.length()
            if (r3 >= r5) goto L_0x003c
            char r5 = r0.charAt(r3)
            boolean r6 = java.lang.Character.isLetterOrDigit(r5)
            if (r6 != 0) goto L_0x0034
            r6 = 95
            if (r5 == r6) goto L_0x0034
            r5 = r4
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            if (r5 == 0) goto L_0x0039
            r0 = r4
            goto L_0x003d
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003c:
            r0 = r1
        L_0x003d:
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = r4
        L_0x0040:
            if (r1 == 0) goto L_0x0065
            r0 = 96
            java.lang.String r7 = r7.b()
            m0.n.b.i.d(r7, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "`"
            java.lang.String r7 = m0.n.b.i.k(r7, r0)
            goto L_0x006c
        L_0x0065:
            java.lang.String r7 = r7.b()
            m0.n.b.i.d(r7, r2)
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.r3(m0.r.t.a.r.g.d):java.lang.String");
    }

    public static final ProtoBuf$Type r4(ProtoBuf$ValueParameter protoBuf$ValueParameter, m0.r.t.a.r.f.c.e eVar) {
        m0.n.b.i.e(protoBuf$ValueParameter, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        if (protoBuf$ValueParameter.x()) {
            ProtoBuf$Type protoBuf$Type = protoBuf$ValueParameter.a2;
            m0.n.b.i.d(protoBuf$Type, "type");
            return protoBuf$Type;
        }
        if ((protoBuf$ValueParameter.y & 8) == 8) {
            return eVar.a(protoBuf$ValueParameter.b2);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static m0.r.t.a.r.m.z0.c s(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.d dVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(dVar, "receiver");
        if (!(dVar instanceof m0.r.t.a.r.m.q)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + m.a(dVar.getClass())).toString());
        } else if (dVar instanceof m0.r.t.a.r.m.n) {
            return (m0.r.t.a.r.m.n) dVar;
        } else {
            return null;
        }
    }

    public static /* synthetic */ void s0(i0.n.a.c cVar, String str, Throwable th, int i, Object obj) {
        int i2 = i & 2;
        cVar.c(str, (Throwable) null);
    }

    public static final int s1(int[] iArr) {
        m0.n.b.i.e(iArr, "$this$lastIndex");
        return iArr.length - 1;
    }

    public static boolean s2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        if (fVar instanceof v) {
            return s0.g((v) fVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public static final String s3(List<m0.r.t.a.r.g.d> list) {
        m0.n.b.i.e(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (m0.r.t.a.r.g.d next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(r3(next));
        }
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static m0.r.t.a.r.m.z0.j s4(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.g gVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "receiver");
        if (gVar instanceof a0) {
            return ((a0) gVar).I0();
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    public static final m0.r.t.a.r.m.q t(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        return (m0.r.t.a.r.m.q) vVar.L0();
    }

    public static final String t0(j0 j0Var) {
        StringBuilder sb = new StringBuilder();
        u0(m0.n.b.i.k("type: ", j0Var), sb);
        u0(m0.n.b.i.k("hashCode: ", Integer.valueOf(j0Var.hashCode())), sb);
        u0(m0.n.b.i.k("javaClass: ", j0Var.getClass().getCanonicalName()), sb);
        for (m0.r.t.a.r.c.i c2 = j0Var.c(); c2 != null; c2 = c2.b()) {
            u0(m0.n.b.i.k("fqName: ", DescriptorRenderer.a.q(c2)), sb);
            u0(m0.n.b.i.k("javaClass: ", c2.getClass().getCanonicalName()), sb);
        }
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final <T> int t1(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    public static final boolean t2(Context context, Permission permission) {
        m0.n.b.i.e(context, "$this$isPermissionGranted");
        m0.n.b.i.e(permission, "permission");
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(permission, "permission");
        return g0.a.b.b.a.n(context, permission.getAndroidValue()) == 0;
    }

    public static final a0 t3(a0 a0Var, List<? extends m0.r.t.a.r.m.m0> list, f fVar) {
        m0.n.b.i.e(a0Var, "<this>");
        m0.n.b.i.e(list, "newArguments");
        m0.n.b.i.e(fVar, "newAnnotations");
        if (list.isEmpty() && fVar == a0Var.getAnnotations()) {
            return a0Var;
        }
        if (list.isEmpty()) {
            return a0Var.Q0(fVar);
        }
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        return KotlinTypeFactory.g(fVar, a0Var.I0(), list, a0Var.J0(), (m0.r.t.a.r.m.x0.e) null, 16);
    }

    public static m0.r.t.a.r.m.z0.j t4(m0.r.t.a.r.m.z0.l lVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(lVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        m0.r.t.a.r.m.z0.g a2 = lVar.a(fVar);
        if (a2 == null) {
            a2 = lVar.o(fVar);
        }
        return lVar.h(a2);
    }

    public static m0.r.t.a.r.m.z0.d u(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        if (fVar instanceof v) {
            v0 L0 = ((v) fVar).L0();
            if (L0 instanceof m0.r.t.a.r.m.q) {
                return (m0.r.t.a.r.m.q) L0;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    public static final StringBuilder u0(String str, StringBuilder sb) {
        m0.n.b.i.e(str, "<this>");
        m0.n.b.i.e(sb, "$this_anonymous");
        sb.append(str);
        m0.n.b.i.d(sb, "append(value)");
        sb.append(10);
        m0.n.b.i.d(sb, "append('\\n')");
        return sb;
    }

    public static long u1(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) h1(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(a.o0("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static boolean u2(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a2 = curve.getA();
        BigInteger b2 = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a2.multiply(bigInteger)).add(b2).mod(p));
    }

    public static v u3(v vVar, List<m0.r.t.a.r.m.m0> list, f fVar, List list2, int i) {
        if ((i & 1) != 0) {
            list = vVar.H0();
        }
        if ((i & 2) != 0) {
            fVar = vVar.getAnnotations();
        }
        List<m0.r.t.a.r.m.m0> list3 = (i & 4) != 0 ? list : null;
        m0.n.b.i.e(vVar, "<this>");
        m0.n.b.i.e(list, "newArguments");
        m0.n.b.i.e(fVar, "newAnnotations");
        m0.n.b.i.e(list3, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == vVar.H0()) && fVar == vVar.getAnnotations()) {
            return vVar;
        }
        v0 L0 = vVar.L0();
        if (L0 instanceof m0.r.t.a.r.m.q) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            m0.r.t.a.r.m.q qVar = (m0.r.t.a.r.m.q) L0;
            return KotlinTypeFactory.c(t3(qVar.d, list, fVar), t3(qVar.q, list3, fVar));
        } else if (L0 instanceof a0) {
            return t3((a0) L0, list, fVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final int u4(int i, int i2) {
        return m0.n.b.i.g(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final <T> Iterable<T> v(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$asIterable");
        if (tArr.length == 0) {
            return EmptyList.c;
        }
        return new m0.j.h(tArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] v0(byte[] r5) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch:{ all -> 0x0035 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0035 }
            java.util.zip.InflaterInputStream r2 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x0033 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0033 }
            r3.<init>(r5)     // Catch:{ all -> 0x0033 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0033 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0030 }
            r5.<init>()     // Catch:{ all -> 0x0030 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0030 }
        L_0x001a:
            int r3 = r2.read(r0)     // Catch:{ all -> 0x0030 }
            if (r3 <= 0) goto L_0x0025
            r4 = 0
            r5.write(r0, r4, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x001a
        L_0x0025:
            byte[] r5 = r5.toByteArray()     // Catch:{ all -> 0x0030 }
            r2.close()
            r1.end()
            return r5
        L_0x0030:
            r5 = move-exception
            r0 = r2
            goto L_0x0037
        L_0x0033:
            r5 = move-exception
            goto L_0x0037
        L_0x0035:
            r5 = move-exception
            r1 = r0
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.end()
        L_0x0041:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.v0(byte[]):byte[]");
    }

    public static final m0.r.t.a.r.g.d v1(m0.r.t.a.r.f.c.c cVar, int i) {
        m0.n.b.i.e(cVar, "<this>");
        m0.r.t.a.r.g.d f = m0.r.t.a.r.g.d.f(cVar.b(i));
        m0.n.b.i.d(f, "guessByFirstCharacter(getString(index))");
        return f;
    }

    public static boolean v2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.g gVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(gVar, "receiver");
        if (gVar instanceof v) {
            return m0.r.t.a.r.b.f.I((v) gVar);
        }
        throw new IllegalArgumentException(a.I0(gVar, a.W0("ClassicTypeSystemContext couldn't handle: ", gVar, ", ")).toString());
    }

    public static /* synthetic */ a0 v3(a0 a0Var, List<m0.r.t.a.r.m.m0> list, f fVar, int i) {
        if ((i & 1) != 0) {
            list = a0Var.H0();
        }
        if ((i & 2) != 0) {
            fVar = a0Var.getAnnotations();
        }
        return t3(a0Var, list, fVar);
    }

    public static final int v4(long j, long j2) {
        return ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE) ? 1 : ((j ^ Long.MIN_VALUE) == (j2 ^ Long.MIN_VALUE) ? 0 : -1));
    }

    public static final <T> m0.s.h<T> w(T[] tArr) {
        m0.n.b.i.e(tArr, "$this$asSequence");
        if (tArr.length == 0) {
            return m0.s.d.a;
        }
        return new m0.j.i(tArr);
    }

    public static SecretKey w0(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) throws JOSEException {
        try {
            KeyAgreement instance = KeyAgreement.getInstance("ECDH");
            try {
                instance.init(privateKey);
                instance.doPhase(eCPublicKey, true);
                return new SecretKeySpec(instance.generateSecret(), "AES");
            } catch (InvalidKeyException e) {
                StringBuilder P0 = a.P0("Invalid key for ECDH key agreement: ");
                P0.append(e.getMessage());
                throw new JOSEException(P0.toString(), e);
            }
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder P02 = a.P0("Couldn't get an ECDH key agreement instance: ");
            P02.append(e2.getMessage());
            throw new JOSEException(P02.toString(), e2);
        }
    }

    public static final Integer w1(int[] iArr, int i) {
        m0.n.b.i.e(iArr, "$this$getOrNull");
        if (i < 0 || i > s1(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static boolean w2(Context context, Uri uri) {
        boolean z;
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                z = false;
            } catch (Exception unused) {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean w3(v vVar) {
        Boolean bool;
        m0.n.b.i.e(vVar, "<this>");
        m0.r.t.a.r.c.f c2 = vVar.I0().c();
        if (c2 == null) {
            bool = null;
        } else {
            m0.n.b.i.e(c2, "<this>");
            bool = Boolean.valueOf(m0.r.t.a.r.j.e.b(c2) && !m0.n.b.i.a(DescriptorUtilsKt.h((d) c2), m0.r.t.a.r.b.g.h));
        }
        if (m0.n.b.i.a(bool, Boolean.TRUE) || y2(vVar)) {
            return true;
        }
        return false;
    }

    public static String w4(EncryptionMethod encryptionMethod, Collection<EncryptionMethod> collection) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + B2(collection);
    }

    public static final a0 x(v vVar) {
        m0.n.b.i.e(vVar, "<this>");
        v0 L0 = vVar.L0();
        a0 a0Var = L0 instanceof a0 ? (a0) L0 : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(m0.n.b.i.k("This is should be simple type: ", vVar).toString());
    }

    public static final m0.r.t.a.r.c.p x0(m0.r.t.a.r.k.b.s sVar, ProtoBuf$Visibility protoBuf$Visibility) {
        m0.n.b.i.e(sVar, "<this>");
        switch (protoBuf$Visibility == null ? -1 : m0.r.t.a.r.k.b.t.b[protoBuf$Visibility.ordinal()]) {
            case 1:
                m0.r.t.a.r.c.p pVar = m0.r.t.a.r.c.o.d;
                m0.n.b.i.d(pVar, "INTERNAL");
                return pVar;
            case 2:
                m0.r.t.a.r.c.p pVar2 = m0.r.t.a.r.c.o.a;
                m0.n.b.i.d(pVar2, "PRIVATE");
                return pVar2;
            case 3:
                m0.r.t.a.r.c.p pVar3 = m0.r.t.a.r.c.o.b;
                m0.n.b.i.d(pVar3, "PRIVATE_TO_THIS");
                return pVar3;
            case 4:
                m0.r.t.a.r.c.p pVar4 = m0.r.t.a.r.c.o.c;
                m0.n.b.i.d(pVar4, "PROTECTED");
                return pVar4;
            case 5:
                m0.r.t.a.r.c.p pVar5 = m0.r.t.a.r.c.o.e;
                m0.n.b.i.d(pVar5, "PUBLIC");
                return pVar5;
            case 6:
                m0.r.t.a.r.c.p pVar6 = m0.r.t.a.r.c.o.f;
                m0.n.b.i.d(pVar6, "LOCAL");
                return pVar6;
            default:
                m0.r.t.a.r.c.p pVar7 = m0.r.t.a.r.c.o.a;
                m0.n.b.i.d(pVar7, "PRIVATE");
                return pVar7;
        }
    }

    public static final <T extends CallableMemberDescriptor> T x1(T t) {
        m0.n.b.i.e(t, "<this>");
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.a;
        if (!SpecialGenericSignatures.k.contains(t.getName())) {
            m0.r.t.a.r.e.a.c cVar = m0.r.t.a.r.e.a.c.a;
            if (!m0.r.t.a.r.e.a.c.e.contains(DescriptorUtilsKt.m(t).getName())) {
                return null;
            }
        }
        if (t instanceof m0.r.t.a.r.c.c0 ? true : t instanceof m0.r.t.a.r.c.b0) {
            return DescriptorUtilsKt.c(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.c, 1);
        }
        if (t instanceof m0.r.t.a.r.c.g0) {
            return DescriptorUtilsKt.c(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.c, 1);
        }
        return null;
    }

    public static boolean x2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.i iVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(iVar, "receiver");
        if (iVar instanceof m0.r.t.a.r.m.m0) {
            return ((m0.r.t.a.r.m.m0) iVar).c();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + m.a(iVar.getClass())).toString());
    }

    public static final <E> void x3(E[] eArr, int i) {
        m0.n.b.i.e(eArr, "$this$resetAt");
        eArr[i] = null;
    }

    public static String x4(JWEAlgorithm jWEAlgorithm, Collection<JWEAlgorithm> collection) {
        return "Unsupported JWE algorithm " + jWEAlgorithm + ", must be " + B2(collection);
    }

    public static m0.r.t.a.r.m.z0.g y(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.f fVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(fVar, "receiver");
        if (fVar instanceof v) {
            v0 L0 = ((v) fVar).L0();
            if (L0 instanceof a0) {
                return (a0) L0;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + m.a(fVar.getClass())).toString());
    }

    /* JADX WARNING: type inference failed for: r14v3, types: [T, byte[]] */
    public static i0.l.a.f.h.b y0(SecretKey secretKey, i0.l.a.j.b<byte[]> bVar, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        Cipher cipher;
        SecretKeySpec secretKeySpec = secretKey == null ? null : new SecretKeySpec(secretKey.getEncoded(), "AES");
        byte[] bArr3 = (byte[]) bVar.a;
        if (provider != null) {
            try {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                StringBuilder P0 = a.P0("Couldn't create AES/GCM/NoPadding cipher: ");
                P0.append(e.getMessage());
                throw new JOSEException(P0.toString(), e);
            } catch (NoClassDefFoundError unused) {
                n b0 = b0(secretKeySpec, true, bArr3, bArr2);
                byte[] bArr4 = new byte[b0.getOutputSize(bArr.length)];
                int processBytes = b0.processBytes(bArr, 0, bArr.length, bArr4, 0);
                try {
                    int doFinal = (processBytes + b0.doFinal(bArr4, processBytes)) - 16;
                    byte[] bArr5 = new byte[doFinal];
                    byte[] bArr6 = new byte[16];
                    System.arraycopy(bArr4, 0, bArr5, 0, doFinal);
                    System.arraycopy(bArr4, doFinal, bArr6, 0, 16);
                    return new i0.l.a.f.h.b(bArr5, bArr6);
                } catch (InvalidCipherTextException e2) {
                    StringBuilder P02 = a.P0("Couldn't generate GCM authentication tag: ");
                    P02.append(e2.getMessage());
                    throw new JOSEException(P02.toString(), e2);
                }
            }
        } else {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr3));
        cipher.updateAAD(bArr2);
        try {
            byte[] doFinal2 = cipher.doFinal(bArr);
            int length = doFinal2.length - 16;
            byte[] Y3 = Y3(doFinal2, 0, length);
            byte[] Y32 = Y3(doFinal2, length, 16);
            AlgorithmParameters parameters = cipher.getParameters();
            if (parameters != null) {
                try {
                    GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
                    ? iv = gCMParameterSpec.getIV();
                    int tLen = gCMParameterSpec.getTLen();
                    if (J3(iv) != 96) {
                        throw new JOSEException(String.format("IV length of %d bits is required, got %d", new Object[]{96, Integer.valueOf(J3(iv))}));
                    } else if (tLen == 128) {
                        bVar.a = iv;
                        return new i0.l.a.f.h.b(Y3, Y32);
                    } else {
                        throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", new Object[]{128, Integer.valueOf(tLen)}));
                    }
                } catch (InvalidParameterSpecException e3) {
                    throw new JOSEException(e3.getMessage(), e3);
                }
            } else {
                throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
            }
        } catch (BadPaddingException | IllegalBlockSizeException e4) {
            StringBuilder P03 = a.P0("Couldn't encrypt with AES/GCM/NoPadding: ");
            P03.append(e4.getMessage());
            throw new JOSEException(P03.toString(), e4);
        }
    }

    public static final <T extends CallableMemberDescriptor> T y1(T t) {
        m0.n.b.i.e(t, "<this>");
        T x1 = x1(t);
        if (x1 != null) {
            return x1;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.m;
        m0.r.t.a.r.g.d name = t.getName();
        m0.n.b.i.d(name, "name");
        if (!builtinMethodsWithSpecialGenericSignature.b(name)) {
            return null;
        }
        return DescriptorUtilsKt.c(t, false, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.c, 1);
    }

    public static final boolean y2(v vVar) {
        m0.r.t.a.r.c.f c2 = vVar.I0().c();
        m0.r.t.a.r.c.m0 m0Var = c2 instanceof m0.r.t.a.r.c.m0 ? (m0.r.t.a.r.c.m0) c2 : null;
        if (m0Var == null) {
            return false;
        }
        return w3(m0.r.t.a.r.m.a1.a.V1(m0Var));
    }

    public static final <E> void y3(E[] eArr, int i, int i2) {
        m0.n.b.i.e(eArr, "$this$resetRange");
        while (i < i2) {
            x3(eArr, i);
            i++;
        }
    }

    public static String y4(JWSAlgorithm jWSAlgorithm, Collection<JWSAlgorithm> collection) {
        return "Unsupported JWS algorithm " + jWSAlgorithm + ", must be " + B2(collection);
    }

    public static int z(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length * 8;
    }

    public static final <T> void z0(t0.d<T> dVar, t0.w wVar, i0.n.c.a.e.d.a<T> aVar) {
        m0.n.b.i.e(dVar, "$this$enqueue");
        m0.n.b.i.e(wVar, "retrofit");
        m0.n.b.i.e(aVar, "apiCallback");
        dVar.J(new i0.n.c.a.e.d.b(wVar, aVar));
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope z1(m0.r.t.a.r.c.d r3) {
        /*
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r3, r0)
            int r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.a
            m0.n.b.i.e(r3, r0)
            m0.r.t.a.r.m.a0 r3 = r3.q()
            m0.r.t.a.r.m.j0 r3 = r3.I0()
            java.util.Collection r3 = r3.b()
            java.util.Iterator r3 = r3.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r3.next()
            m0.r.t.a.r.m.v r0 = (m0.r.t.a.r.m.v) r0
            boolean r2 = m0.r.t.a.r.b.f.y(r0)
            if (r2 != 0) goto L_0x001a
            m0.r.t.a.r.m.j0 r0 = r0.I0()
            m0.r.t.a.r.c.f r0 = r0.c()
            boolean r2 = m0.r.t.a.r.j.d.o(r0)
            if (r2 == 0) goto L_0x001a
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r0, r3)
            m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            if (r0 != 0) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r3 = r0.Q()
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope
            if (r2 == 0) goto L_0x0052
            r1 = r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope r1 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope) r1
        L_0x0052:
            if (r1 != 0) goto L_0x0058
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope r1 = z1(r0)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.h.z1(m0.r.t.a.r.c.d):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope");
    }

    public static boolean z2(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.j jVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(jVar, "receiver");
        if (jVar instanceof j0) {
            m0.r.t.a.r.c.f c2 = ((j0) jVar).c();
            return m0.n.b.i.a(c2 == null ? null : Boolean.valueOf(m0.r.t.a.r.b.f.M(c2)), Boolean.TRUE);
        }
        throw new IllegalArgumentException(a.J0(jVar, a.X0("ClassicTypeSystemContext couldn't handle: ", jVar, ", ")).toString());
    }

    public static final f z3(m0.r.t.a.r.e.a.u.c cVar, m0.r.t.a.r.e.a.w.d dVar) {
        m0.n.b.i.e(cVar, "<this>");
        m0.n.b.i.e(dVar, "annotationsOwner");
        return new LazyJavaAnnotations(cVar, dVar, false);
    }

    public static m0.r.t.a.r.m.z0.g z4(m0.r.t.a.r.m.x0.c cVar, m0.r.t.a.r.m.z0.d dVar) {
        m0.n.b.i.e(cVar, "this");
        m0.n.b.i.e(dVar, "receiver");
        if (dVar instanceof m0.r.t.a.r.m.q) {
            return ((m0.r.t.a.r.m.q) dVar).q;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + m.a(dVar.getClass())).toString());
    }
}
