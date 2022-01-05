package com.airbnb.epoxy;

import i0.b.a.o;
import i0.b.a.t;
import java.util.List;

public class SimpleEpoxyController extends o {
    private List<? extends t<?>> currentModels;
    private boolean insideSetModels;

    public final void buildModels() {
        if (isBuildingModels()) {
            add(this.currentModels);
            return;
        }
        throw new IllegalEpoxyUsage("You cannot call `buildModels` directly. Call `setModels` instead.");
    }

    public final void requestModelBuild() {
        if (this.insideSetModels) {
            super.requestModelBuild();
            return;
        }
        throw new IllegalEpoxyUsage("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
    }

    public void setModels(List<? extends t<?>> list) {
        this.currentModels = list;
        this.insideSetModels = true;
        requestModelBuild();
        this.insideSetModels = false;
    }
}
