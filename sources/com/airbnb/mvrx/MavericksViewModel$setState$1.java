package com.airbnb.mvrx;

import i0.b.b.j;
import i0.b.b.z;
import i0.d.a.a.a;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$onEach$1;
import m0.n.a.l;
import m0.n.b.i;
import m0.s.h;
import m0.s.q;

/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$setState$1 extends Lambda implements l<S, S> {
    public final /* synthetic */ MavericksViewModel c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$setState$1(MavericksViewModel mavericksViewModel, l lVar) {
        super(1);
        this.c = mavericksViewModel;
        this.d = lVar;
    }

    public Object invoke(Object obj) {
        R r;
        boolean z;
        j jVar = (j) obj;
        i.e(jVar, "$receiver");
        j jVar2 = (j) this.d.invoke(jVar);
        j jVar3 = (j) this.d.invoke(jVar);
        boolean z2 = true;
        if (!i.a(jVar2, jVar3)) {
            Field[] declaredFields = jVar2.getClass().getDeclaredFields();
            i.d(declaredFields, "firstState::class.java.declaredFields");
            h w = i0.j.f.p.h.w(declaredFields);
            MavericksViewModel$setState$1$changedProp$1 mavericksViewModel$setState$1$changedProp$1 = MavericksViewModel$setState$1$changedProp$1.c;
            i.e(w, "$this$onEach");
            i.e(mavericksViewModel$setState$1$changedProp$1, "action");
            q qVar = (q) SequencesKt___SequencesKt.g(w, new SequencesKt___SequencesKt$onEach$1(mavericksViewModel$setState$1$changedProp$1));
            Iterator<T> it = qVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r = null;
                    break;
                }
                r = qVar.b.invoke(it.next());
                Field field = (Field) r;
                try {
                    z = !i.a(field.get(jVar2), field.get(jVar3));
                    continue;
                } catch (Throwable unused) {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Field field2 = (Field) r;
            if (field2 != null) {
                StringBuilder P0 = a.P0("Impure reducer set on ");
                P0.append(this.c.getClass().getSimpleName());
                P0.append("! ");
                P0.append(field2.getName());
                P0.append(" changed from ");
                P0.append(field2.get(jVar2));
                P0.append(' ');
                P0.append("to ");
                P0.append(field2.get(jVar3));
                P0.append(". ");
                P0.append("Ensure that your state properties properly implement hashCode.");
                throw new IllegalArgumentException(P0.toString());
            }
            StringBuilder P02 = a.P0("Impure reducer set on ");
            P02.append(this.c.getClass().getSimpleName());
            P02.append("! Differing states were provided by the same reducer.");
            P02.append("Ensure that your state properties properly implement hashCode. First state: ");
            P02.append(jVar2);
            P02.append(" -> Second state: ");
            P02.append(jVar3);
            throw new IllegalArgumentException(P02.toString());
        }
        z<S> zVar = this.c.h;
        if (zVar != null) {
            i.e(jVar2, "newState");
            z.a<S> aVar = zVar.a;
            if (aVar.a != aVar.hashCode()) {
                z2 = false;
            }
            if (z2) {
                zVar.a = new z.a<>(jVar2);
            } else {
                throw new IllegalArgumentException((aVar.b.getClass().getSimpleName() + " was mutated. State classes should be immutable.").toString());
            }
        }
        return jVar2;
    }
}
