package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import i0.d.a.a.a;

@TargetApi(21)
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("AudioAttributesCompat: audioattributes=");
        P0.append(this.a);
        return P0.toString();
    }
}
