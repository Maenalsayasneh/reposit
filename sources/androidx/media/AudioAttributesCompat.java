package androidx.media;

import android.util.SparseIntArray;
import h0.d0.b;

public class AudioAttributesCompat implements b {
    public static final SparseIntArray a;
    public AudioAttributesImpl b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.b;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.b);
        }
        if (audioAttributesCompat.b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString();
    }
}
