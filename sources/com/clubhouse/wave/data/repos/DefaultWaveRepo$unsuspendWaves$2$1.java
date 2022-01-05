package com.clubhouse.wave.data.repos;

import com.clubhouse.wave.data.models.local.SentWave;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: DefaultWaveRepo.kt */
public final class DefaultWaveRepo$unsuspendWaves$2$1 extends Lambda implements l<SentWave, SentWave> {
    public static final DefaultWaveRepo$unsuspendWaves$2$1 c = new DefaultWaveRepo$unsuspendWaves$2$1();

    public DefaultWaveRepo$unsuspendWaves$2$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        SentWave sentWave = (SentWave) obj;
        if (sentWave == null) {
            return null;
        }
        return sentWave.a(false);
    }
}
