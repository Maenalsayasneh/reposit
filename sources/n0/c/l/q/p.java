package n0.c.l.q;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.WriteMode;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.m.a1.a;
import n0.c.f;
import n0.c.i.c;
import n0.c.i.d;
import n0.c.i.g;
import n0.c.i.h;
import n0.c.k.b;
import n0.c.l.e;
import n0.c.l.g;

/* compiled from: Polymorphic.kt */
public final class p {
    public static final f a(g gVar, f fVar, Object obj) {
        f r1 = a.r1((b) fVar, gVar, obj);
        String str = gVar.d().b.i;
        n0.c.i.g f = r1.getDescriptor().f();
        i.e(f, "kind");
        if (f instanceof g.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        } else if (f instanceof d) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        } else if (!(f instanceof c)) {
            return r1;
        } else {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final <T> T b(e eVar, n0.c.b<T> bVar) {
        String str;
        i.e(eVar, "$this$decodeSerializableValuePolymorphic");
        i.e(bVar, "deserializer");
        if (!(bVar instanceof b) || eVar.d().b.h) {
            return bVar.deserialize(eVar);
        }
        JsonElement i = eVar.i();
        SerialDescriptor descriptor = bVar.getDescriptor();
        if (i instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) i;
            String str2 = eVar.d().b.i;
            JsonElement jsonElement = (JsonElement) jsonObject.get(str2);
            String b = jsonElement != null ? a.P1(jsonElement).b() : null;
            i.e(eVar, "decoder");
            n0.c.b c = eVar.a().c(((b) bVar).a(), b);
            if (c != null) {
                n0.c.l.a d = eVar.d();
                i.e(d, "$this$readPolymorphicJson");
                i.e(str2, "discriminator");
                i.e(jsonObject, "element");
                i.e(c, "deserializer");
                return new j(d, jsonObject, str2, c.getDescriptor()).B(c);
            }
            if (b == null) {
                str = "missing class discriminator ('null')";
            } else {
                str = "class discriminator '" + b + '\'';
            }
            throw a.q(-1, i0.d.a.a.a.n0("Polymorphic serializer was not found for ", str), jsonObject.toString());
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Expected ");
        P0.append(m.a(JsonObject.class));
        P0.append(" as the serialized body of ");
        P0.append(descriptor.a());
        P0.append(", but had ");
        P0.append(m.a(i.getClass()));
        throw a.p(-1, P0.toString());
    }

    public static final WriteMode c(n0.c.l.a aVar, SerialDescriptor serialDescriptor) {
        i.e(aVar, "$this$switchMode");
        i.e(serialDescriptor, "desc");
        n0.c.i.g f = serialDescriptor.f();
        if (f instanceof c) {
            return WriteMode.POLY_OBJ;
        }
        if (i.a(f, h.b.a)) {
            return WriteMode.LIST;
        }
        if (!i.a(f, h.c.a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor h = serialDescriptor.h(0);
        n0.c.i.g f2 = h.f();
        if ((f2 instanceof d) || i.a(f2, g.b.a)) {
            return WriteMode.MAP;
        }
        if (aVar.b.d) {
            return WriteMode.LIST;
        }
        throw a.m(h);
    }
}
