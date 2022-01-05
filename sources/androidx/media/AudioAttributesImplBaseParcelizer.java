package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.k(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.k(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.k(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.k(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        int i = audioAttributesImplBase.a;
        versionedParcel.p(1);
        versionedParcel.t(i);
        int i2 = audioAttributesImplBase.b;
        versionedParcel.p(2);
        versionedParcel.t(i2);
        int i3 = audioAttributesImplBase.c;
        versionedParcel.p(3);
        versionedParcel.t(i3);
        int i4 = audioAttributesImplBase.d;
        versionedParcel.p(4);
        versionedParcel.t(i4);
    }
}
