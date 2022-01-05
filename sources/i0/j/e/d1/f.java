package i0.j.e.d1;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.InvocationSettings;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.m0.c;
import i0.j.e.m0.d.k;
import java.util.Objects;

/* compiled from: ShakeDetector */
public class f implements SensorEventListener {
    public float Y1;
    public a Z1;
    public int a2 = InvocationSettings.SHAKE_DEFAULT_THRESHOLD;
    public SensorManager c;
    public Sensor d;
    public long q = 0;
    public float x;
    public float y;

    /* compiled from: ShakeDetector */
    public interface a {
    }

    public f(Context context, a aVar) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.c = sensorManager;
        this.d = sensorManager.getDefaultSensor(1);
        this.Z1 = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.q;
            if (j > 400) {
                if ((Math.abs(((((f + f2) + f3) - this.x) - this.y) - this.Y1) / ((float) j)) * 10000.0f > ((float) this.a2)) {
                    k kVar = (k) this.Z1;
                    Objects.requireNonNull(kVar);
                    InstabugSDKLogger.d("ShakeInvoker", "Shake detected, invoking SDK");
                    InvocationManager.getInstance().setLastUsedInvoker(kVar);
                    ((c) kVar.d).c((Uri) null);
                }
                this.q = currentTimeMillis;
                this.x = f;
                this.y = f2;
                this.Y1 = f3;
            }
        }
    }
}
