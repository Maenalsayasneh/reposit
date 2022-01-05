package com.clubhouse.android.shared;

/* compiled from: Experimentation.kt */
public enum Experiment {
    UniversalSearch("auto-exp-universal-search");
    
    private final String key;

    private Experiment(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
