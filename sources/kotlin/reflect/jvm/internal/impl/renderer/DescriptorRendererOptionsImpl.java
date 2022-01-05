package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.n.b.i;
import m0.n.b.m;
import m0.o.d;
import m0.r.k;
import m0.r.t.a.r.i.a;
import m0.r.t.a.r.i.b;
import m0.r.t.a.r.i.c;

/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class DescriptorRendererOptionsImpl implements b {
    public static final /* synthetic */ k<Object>[] a;
    public final d A;
    public final d B;
    public final d C;
    public final d D;
    public final d E;
    public final d F;
    public final d G;
    public final d H;
    public final d I;
    public final d J;
    public final d K;
    public final d L;
    public final d M = new c((Object) null, (Object) null, this);
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d R;
    public final d S;
    public final d T;
    public final d U;
    public final d V;
    public final d W;
    public boolean b;
    public final d c;
    public final d d;
    public final d e;
    public final d f;
    public final d g;
    public final d h;
    public final d i;
    public final d j;
    public final d k;
    public final d l;
    public final d m;
    public final d n;
    public final d o;
    public final d p;
    public final d q;
    public final d r;
    public final d s;
    public final d t;
    public final d u;
    public final d v;
    public final d w;
    public final d x;
    public final d y;
    public final d z;

    static {
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        a = new k[]{m.b(new MutablePropertyReference1Impl(m.a(cls), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "withDefinedIn", "getWithDefinedIn()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "modifiers", "getModifiers()Ljava/util/Set;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "startFromName", "getStartFromName()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "debugMode", "getDebugMode()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "verbose", "getVerbose()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "unitReturnType", "getUnitReturnType()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "withoutReturnType", "getWithoutReturnType()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "enhancedTypes", "getEnhancedTypes()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "normalizedVisibilities", "getNormalizedVisibilities()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderDefaultModality", "getRenderDefaultModality()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "includePropertyConstant", "getIncludePropertyConstant()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "withoutTypeParameters", "getWithoutTypeParameters()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "withoutSuperTypes", "getWithoutSuperTypes()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "receiverAfterName", "getReceiverAfterName()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderTypeExpansions", "getRenderTypeExpansions()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "renderFunctionContracts", "getRenderFunctionContracts()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), m.b(new MutablePropertyReference1Impl(m.a(cls), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        a.c cVar = a.c.a;
        this.c = new c(cVar, cVar, this);
        Boolean bool = Boolean.TRUE;
        this.d = new c(bool, bool, this);
        this.e = new c(bool, bool, this);
        Set<DescriptorRendererModifier> set = DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS;
        this.f = new c(set, set, this);
        Boolean bool2 = Boolean.FALSE;
        this.g = new c(bool2, bool2, this);
        this.h = new c(bool2, bool2, this);
        this.i = new c(bool2, bool2, this);
        this.j = new c(bool2, bool2, this);
        this.k = new c(bool2, bool2, this);
        this.l = new c(bool, bool, this);
        this.m = new c(bool2, bool2, this);
        this.n = new c(bool2, bool2, this);
        this.o = new c(bool2, bool2, this);
        this.p = new c(bool, bool, this);
        this.q = new c(bool, bool, this);
        this.r = new c(bool2, bool2, this);
        this.s = new c(bool2, bool2, this);
        this.t = new c(bool2, bool2, this);
        this.u = new c(bool2, bool2, this);
        this.v = new c(bool2, bool2, this);
        this.w = new c(bool2, bool2, this);
        this.x = new c(bool2, bool2, this);
        DescriptorRendererOptionsImpl$typeNormalizer$2 descriptorRendererOptionsImpl$typeNormalizer$2 = DescriptorRendererOptionsImpl$typeNormalizer$2.c;
        this.y = new c(descriptorRendererOptionsImpl$typeNormalizer$2, descriptorRendererOptionsImpl$typeNormalizer$2, this);
        DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 descriptorRendererOptionsImpl$defaultParameterValueRenderer$2 = DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.c;
        this.z = new c(descriptorRendererOptionsImpl$defaultParameterValueRenderer$2, descriptorRendererOptionsImpl$defaultParameterValueRenderer$2, this);
        this.A = new c(bool, bool, this);
        OverrideRenderingPolicy overrideRenderingPolicy = OverrideRenderingPolicy.RENDER_OPEN;
        this.B = new c(overrideRenderingPolicy, overrideRenderingPolicy, this);
        DescriptorRenderer.b.a aVar = DescriptorRenderer.b.a.a;
        this.C = new c(aVar, aVar, this);
        RenderingFormat renderingFormat = RenderingFormat.PLAIN;
        this.D = new c(renderingFormat, renderingFormat, this);
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = ParameterNameRenderingPolicy.ALL;
        this.E = new c(parameterNameRenderingPolicy, parameterNameRenderingPolicy, this);
        this.F = new c(bool2, bool2, this);
        this.G = new c(bool2, bool2, this);
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = PropertyAccessorRenderingPolicy.DEBUG;
        this.H = new c(propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy, this);
        this.I = new c(bool2, bool2, this);
        this.J = new c(bool2, bool2, this);
        EmptySet emptySet = EmptySet.c;
        this.K = new c(emptySet, emptySet, this);
        m0.r.t.a.r.i.d dVar = m0.r.t.a.r.i.d.a;
        Set<m0.r.t.a.r.g.b> set2 = m0.r.t.a.r.i.d.b;
        this.L = new c(set2, set2, this);
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS;
        this.N = new c(annotationArgumentsRenderingPolicy, annotationArgumentsRenderingPolicy, this);
        this.O = new c(bool2, bool2, this);
        this.P = new c(bool, bool, this);
        this.Q = new c(bool, bool, this);
        this.R = new c(bool2, bool2, this);
        this.S = new c(bool, bool, this);
        this.T = new c(bool, bool, this);
        new c(bool2, bool2, this);
        this.U = new c(bool2, bool2, this);
        this.V = new c(bool2, bool2, this);
        this.W = new c(bool, bool, this);
    }

    public void a(Set<m0.r.t.a.r.g.b> set) {
        i.e(set, "<set-?>");
        this.L.setValue(this, a[35], set);
    }

    public void b(boolean z2) {
        this.g.setValue(this, a[4], Boolean.valueOf(z2));
    }

    public void c(Set<? extends DescriptorRendererModifier> set) {
        i.e(set, "<set-?>");
        this.f.setValue(this, a[3], set);
    }

    public void d(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        i.e(parameterNameRenderingPolicy, "<set-?>");
        this.E.setValue(this, a[28], parameterNameRenderingPolicy);
    }

    public void e(boolean z2) {
        this.d.setValue(this, a[1], Boolean.valueOf(z2));
    }

    public boolean f() {
        return ((Boolean) this.n.getValue(this, a[11])).booleanValue();
    }

    public void g(a aVar) {
        i.e(aVar, "<set-?>");
        this.c.setValue(this, a[0], aVar);
    }

    public void h(boolean z2) {
        this.x.setValue(this, a[21], Boolean.valueOf(z2));
    }

    public void i(boolean z2) {
        this.i.setValue(this, a[6], Boolean.valueOf(z2));
    }

    public void j(boolean z2) {
        this.G.setValue(this, a[30], Boolean.valueOf(z2));
    }

    public void k(boolean z2) {
        this.F.setValue(this, a[29], Boolean.valueOf(z2));
    }

    public void l(RenderingFormat renderingFormat) {
        i.e(renderingFormat, "<set-?>");
        this.D.setValue(this, a[27], renderingFormat);
    }

    public void m(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        i.e(annotationArgumentsRenderingPolicy, "<set-?>");
        this.N.setValue(this, a[37], annotationArgumentsRenderingPolicy);
    }

    public Set<m0.r.t.a.r.g.b> n() {
        return (Set) this.L.getValue(this, a[35]);
    }

    public boolean o() {
        return ((Boolean) this.i.getValue(this, a[6])).booleanValue();
    }

    public void p(boolean z2) {
        this.w.setValue(this, a[20], Boolean.valueOf(z2));
    }

    public AnnotationArgumentsRenderingPolicy q() {
        return (AnnotationArgumentsRenderingPolicy) this.N.getValue(this, a[37]);
    }
}
