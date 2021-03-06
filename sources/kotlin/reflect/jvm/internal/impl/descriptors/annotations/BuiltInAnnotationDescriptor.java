package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import i0.j.f.p.h;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.m.v;

/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class BuiltInAnnotationDescriptor implements c {
    public final f a;
    public final b b;
    public final Map<d, g<?>> c;
    public final m0.c d = h.G2(LazyThreadSafetyMode.PUBLICATION, new BuiltInAnnotationDescriptor$type$2(this));

    public BuiltInAnnotationDescriptor(f fVar, b bVar, Map<d, ? extends g<?>> map) {
        i.e(fVar, "builtIns");
        i.e(bVar, "fqName");
        i.e(map, "allValueArguments");
        this.a = fVar;
        this.b = bVar;
        this.c = map;
    }

    public Map<d, g<?>> a() {
        return this.c;
    }

    public b d() {
        return this.b;
    }

    public v getType() {
        Object value = this.d.getValue();
        i.d(value, "pyright 2010-2017 JetBrains s.r.o.\n *\n * Licensed under the Apache License, Version 2.0 (the \"License\");\n * you may not use this file except in compliance with the License.\n * You may obtain a copy of the License at\n *\n * http://www.apache.org/licenses/LICENSE-2.0\n *\n * Unless required by applicable law or agreed to in writing, software\n * distributed under the License is distributed on an \"AS IS\" BASIS,\n * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n * See the License for the specific language governing permissions and\n * limitations under the License.\n */\n\npackage org.jetbrains.kotlin.descriptors.annotations\n\nimport org.jetbrains.kotlin.builtins.KotlinBuiltIns\nimport org.jetbrains.kotlin.descriptors.SourceElement\nimport org.jetbrains.kotlin.name.FqName\nimport org.jetbrains.kotlin.name.Name\nimport org.jetbrains.kotlin.resolve.constants.ConstantValue\nimport org.jetbrains.kotlin.types.KotlinType\nimport kotlin.LazyThreadSafetyMode.PUBLICATION\n\nclass BuiltInAnnotationDescriptor(\n        private val builtIns: KotlinBuiltIns,\n        override val fqName: FqName,\n        override val allValueArguments: Map<Name, ConstantValue<*>>\n) : AnnotationDescriptor {\n    override val type: KotlinType by lazy(PUBLICATION) {\n        builtIns.getBuiltInClassByFqName(fqName).defaultType\n    }");
        return (v) value;
    }

    public h0 r() {
        h0 h0Var = h0.a;
        i.d(h0Var, "NO_SOURCE");
        return h0Var;
    }
}
