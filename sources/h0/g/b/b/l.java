package h0.g.b.b;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.g.b.a.c;
import h0.g.c.c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: MotionConstrainedPoint */
public class l implements Comparable<l> {
    public float Y1 = 0.0f;
    public float Z1 = 0.0f;
    public float a2 = 1.0f;
    public float b2 = 1.0f;
    public float c = 1.0f;
    public float c2 = Float.NaN;
    public int d = 0;
    public float d2 = Float.NaN;
    public float e2 = 0.0f;
    public float f2 = 0.0f;
    public float g2 = 0.0f;
    public float h2 = Float.NaN;
    public float i2 = Float.NaN;
    public LinkedHashMap<String, ConstraintAttribute> j2 = new LinkedHashMap<>();
    public int q;
    public float x = 0.0f;
    public float y = 0.0f;

    public void a(HashMap<String, c> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            c cVar = hashMap.get(next);
            next.hashCode();
            char c3 = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                        c3 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c3 = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c3 = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c3 = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c3 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c3 = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c3 = 13;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f3 = 0.0f;
            switch (c3) {
                case 0:
                    if (!Float.isNaN(this.Y1)) {
                        f3 = this.Y1;
                    }
                    cVar.b(i, f3);
                    break;
                case 1:
                    if (!Float.isNaN(this.Z1)) {
                        f3 = this.Z1;
                    }
                    cVar.b(i, f3);
                    break;
                case 2:
                    if (!Float.isNaN(this.e2)) {
                        f3 = this.e2;
                    }
                    cVar.b(i, f3);
                    break;
                case 3:
                    if (!Float.isNaN(this.f2)) {
                        f3 = this.f2;
                    }
                    cVar.b(i, f3);
                    break;
                case 4:
                    if (!Float.isNaN(this.g2)) {
                        f3 = this.g2;
                    }
                    cVar.b(i, f3);
                    break;
                case 5:
                    if (!Float.isNaN(this.i2)) {
                        f3 = this.i2;
                    }
                    cVar.b(i, f3);
                    break;
                case 6:
                    if (!Float.isNaN(this.a2)) {
                        f = this.a2;
                    }
                    cVar.b(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.b2)) {
                        f = this.b2;
                    }
                    cVar.b(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.c2)) {
                        f3 = this.c2;
                    }
                    cVar.b(i, f3);
                    break;
                case 9:
                    if (!Float.isNaN(this.d2)) {
                        f3 = this.d2;
                    }
                    cVar.b(i, f3);
                    break;
                case 10:
                    if (!Float.isNaN(this.y)) {
                        f3 = this.y;
                    }
                    cVar.b(i, f3);
                    break;
                case 11:
                    if (!Float.isNaN(this.x)) {
                        f3 = this.x;
                    }
                    cVar.b(i, f3);
                    break;
                case 12:
                    if (!Float.isNaN(this.h2)) {
                        f3 = this.h2;
                    }
                    cVar.b(i, f3);
                    break;
                case 13:
                    if (!Float.isNaN(this.c)) {
                        f = this.c;
                    }
                    cVar.b(i, f);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(InstabugDbContract.COMMA_SEP)[1];
                        if (!this.j2.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.j2.get(str);
                            if (!(cVar instanceof c.b)) {
                                Log.e("MotionPaths", next + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.b() + cVar);
                                break;
                            } else {
                                ((c.b) cVar).f.append(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public void b(View view) {
        this.q = view.getVisibility();
        this.c = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.x = view.getElevation();
        this.y = view.getRotation();
        this.Y1 = view.getRotationX();
        this.Z1 = view.getRotationY();
        this.a2 = view.getScaleX();
        this.b2 = view.getScaleY();
        this.c2 = view.getPivotX();
        this.d2 = view.getPivotY();
        this.e2 = view.getTranslationX();
        this.f2 = view.getTranslationY();
        this.g2 = view.getTranslationZ();
    }

    public int compareTo(Object obj) {
        Objects.requireNonNull((l) obj);
        return Float.compare(0.0f, 0.0f);
    }

    public final boolean e(float f, float f3) {
        if (Float.isNaN(f) || Float.isNaN(f3)) {
            if (Float.isNaN(f) != Float.isNaN(f3)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f3) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public void f(Rect rect, h0.g.c.c cVar, int i, int i3) {
        float f;
        rect.width();
        rect.height();
        c.a h = cVar.h(i3);
        c.d dVar = h.c;
        int i4 = dVar.c;
        this.d = i4;
        int i5 = dVar.b;
        this.q = i5;
        if (i5 == 0 || i4 != 0) {
            f = dVar.d;
        } else {
            f = 0.0f;
        }
        this.c = f;
        c.e eVar = h.f;
        boolean z = eVar.n;
        this.x = eVar.o;
        this.y = eVar.c;
        this.Y1 = eVar.d;
        this.Z1 = eVar.e;
        this.a2 = eVar.f;
        this.b2 = eVar.g;
        this.c2 = eVar.h;
        this.d2 = eVar.i;
        this.e2 = eVar.k;
        this.f2 = eVar.l;
        this.g2 = eVar.m;
        h0.g.a.g.a.c.c(h.d.e);
        this.h2 = h.d.j;
        this.i2 = h.c.e;
        for (String next : h.g.keySet()) {
            ConstraintAttribute constraintAttribute = h.g.get(next);
            if (constraintAttribute.d()) {
                this.j2.put(next, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f3 = this.y + 90.0f;
            this.y = f3;
            if (f3 > 180.0f) {
                this.y = f3 - 360.0f;
                return;
            }
            return;
        }
        this.y -= 90.0f;
    }

    public void g(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        b(view);
    }
}
