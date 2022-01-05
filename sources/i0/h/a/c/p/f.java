package i0.h.a.c.p;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: FloatingActionButtonImpl */
public class f implements TypeEvaluator<Float> {
    public FloatEvaluator a = new FloatEvaluator();

    public f(e eVar) {
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.a.evaluate(f, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
