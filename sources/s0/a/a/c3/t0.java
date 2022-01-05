package s0.a.a.c3;

import i0.d.a.a.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.SimpleTimeZone;
import s0.a.a.a0;
import s0.a.a.d;
import s0.a.a.i;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.t1;

public class t0 extends m implements d {
    public r c;

    public t0(r rVar) {
        if ((rVar instanceof a0) || (rVar instanceof i)) {
            this.c = rVar;
            return;
        }
        throw new IllegalArgumentException("unknown object passed to Time");
    }

    public static t0 t(Object obj) {
        if (obj == null || (obj instanceof t0)) {
            return (t0) obj;
        }
        if (obj instanceof a0) {
            return new t0((a0) obj);
        }
        if (obj instanceof i) {
            return new t0((i) obj);
        }
        throw new IllegalArgumentException(a.c0(obj, a.P0("unknown object in factory: ")));
    }

    public r c() {
        return this.c;
    }

    public Date s() {
        try {
            r rVar = this.c;
            if (!(rVar instanceof a0)) {
                return ((i) rVar).D();
            }
            a0 a0Var = (a0) rVar;
            Objects.requireNonNull(a0Var);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            return t1.a(simpleDateFormat.parse(a0Var.B()));
        } catch (ParseException e) {
            StringBuilder P0 = a.P0("invalid date string: ");
            P0.append(e.getMessage());
            throw new IllegalStateException(P0.toString());
        }
    }

    public String toString() {
        return u();
    }

    public String u() {
        r rVar = this.c;
        return rVar instanceof a0 ? ((a0) rVar).B() : ((i) rVar).G();
    }
}
