package com.instabug.featuresrequest.eventbus;

import android.annotation.SuppressLint;
import com.instabug.featuresrequest.d.b;
import com.instabug.library.core.eventbus.EventBus;

public class FeatureRequestsEventBus extends EventBus<b> {
    private static volatile FeatureRequestsEventBus featureRequestsEventBus;

    private FeatureRequestsEventBus() {
        if (featureRequestsEventBus != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class");
        }
    }

    public static FeatureRequestsEventBus getInstance() {
        if (featureRequestsEventBus == null) {
            synchronized (FeatureRequestsEventBus.class) {
                if (featureRequestsEventBus == null) {
                    featureRequestsEventBus = new FeatureRequestsEventBus();
                }
            }
        }
        return featureRequestsEventBus;
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public static void tearDown() {
        featureRequestsEventBus = null;
    }

    public FeatureRequestsEventBus readResolve() {
        return getInstance();
    }
}
