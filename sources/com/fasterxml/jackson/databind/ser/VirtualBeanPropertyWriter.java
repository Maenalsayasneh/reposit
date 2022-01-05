package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.n.j;
import i0.f.a.c.p.e;
import i0.f.a.c.r.k.b;
import java.io.Serializable;

public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    public VirtualBeanPropertyWriter() {
    }

    public void m(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Object p = p(obj, jsonGenerator, iVar);
        if (p == null) {
            g<Object> gVar = this.g2;
            if (gVar != null) {
                gVar.f(null, jsonGenerator, iVar);
            } else {
                jsonGenerator.c0();
            }
        } else {
            g<Object> gVar2 = this.f2;
            if (gVar2 == null) {
                Class<?> cls = p.getClass();
                b bVar = this.i2;
                g<Object> c = bVar.c(cls);
                gVar2 = c == null ? d(bVar, cls, iVar) : c;
            }
            Object obj2 = this.k2;
            if (obj2 != null) {
                if (BeanPropertyWriter.q == obj2) {
                    if (gVar2.d(iVar, p)) {
                        g<Object> gVar3 = this.g2;
                        if (gVar3 != null) {
                            gVar3.f(null, jsonGenerator, iVar);
                            return;
                        } else {
                            jsonGenerator.c0();
                            return;
                        }
                    }
                } else if (obj2.equals(p)) {
                    g<Object> gVar4 = this.g2;
                    if (gVar4 != null) {
                        gVar4.f(null, jsonGenerator, iVar);
                        return;
                    } else {
                        jsonGenerator.c0();
                        return;
                    }
                }
            }
            if (p != obj || !h(jsonGenerator, iVar, gVar2)) {
                e eVar = this.h2;
                if (eVar == null) {
                    gVar2.f(p, jsonGenerator, iVar);
                } else {
                    gVar2.g(p, jsonGenerator, iVar, eVar);
                }
            }
        }
    }

    public void n(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception {
        Object p = p(obj, jsonGenerator, iVar);
        if (p != null) {
            g<Object> gVar = this.f2;
            if (gVar == null) {
                Class<?> cls = p.getClass();
                b bVar = this.i2;
                g<Object> c = bVar.c(cls);
                gVar = c == null ? d(bVar, cls, iVar) : c;
            }
            Object obj2 = this.k2;
            if (obj2 != null) {
                if (BeanPropertyWriter.q == obj2) {
                    if (gVar.d(iVar, p)) {
                        return;
                    }
                } else if (obj2.equals(p)) {
                    return;
                }
            }
            if (p != obj || !h(jsonGenerator, iVar, gVar)) {
                jsonGenerator.Z(this.x);
                e eVar = this.h2;
                if (eVar == null) {
                    gVar.f(p, jsonGenerator, iVar);
                } else {
                    gVar.g(p, jsonGenerator, iVar, eVar);
                }
            }
        } else if (this.g2 != null) {
            jsonGenerator.Z(this.x);
            this.g2.f(null, jsonGenerator, iVar);
        }
    }

    public abstract Object p(Object obj, JsonGenerator jsonGenerator, i iVar) throws Exception;

    public abstract VirtualBeanPropertyWriter q(MapperConfig<?> mapperConfig, i0.f.a.c.n.b bVar, j jVar, JavaType javaType);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r0.d;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VirtualBeanPropertyWriter(i0.f.a.c.n.j r12, i0.f.a.c.t.a r13, com.fasterxml.jackson.databind.JavaType r14, i0.f.a.c.g<?> r15, i0.f.a.c.p.e r16, com.fasterxml.jackson.databind.JavaType r17, com.fasterxml.jackson.annotation.JsonInclude.Value r18, java.lang.Class<?>[] r19) {
        /*
            r11 = this;
            r0 = r18
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r12.w()
            if (r0 != 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = r0.d
            com.fasterxml.jackson.annotation.JsonInclude$Include r3 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
            if (r1 == r3) goto L_0x0015
            com.fasterxml.jackson.annotation.JsonInclude$Include r3 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r1 == r3) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r8 = r1
            if (r0 != 0) goto L_0x001d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x001b:
            r9 = r0
            goto L_0x0031
        L_0x001d:
            com.fasterxml.jackson.annotation.JsonInclude$Include r0 = r0.d
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
            if (r0 == r1) goto L_0x002f
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
            if (r0 == r1) goto L_0x002f
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r0 != r1) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.q
            goto L_0x001b
        L_0x002f:
            r0 = 0
            goto L_0x001b
        L_0x0031:
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter.<init>(i0.f.a.c.n.j, i0.f.a.c.t.a, com.fasterxml.jackson.databind.JavaType, i0.f.a.c.g, i0.f.a.c.p.e, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.annotation.JsonInclude$Value, java.lang.Class[]):void");
    }
}
