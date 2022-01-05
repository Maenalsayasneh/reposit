package com.airbnb.epoxy;

import com.airbnb.epoxy.ModelList;

public class ControllerModelList extends ModelList {
    public static final ModelList.d q = new a();

    public class a implements ModelList.d {
    }

    public ControllerModelList(int i) {
        super(i);
        if (!this.c) {
            this.c = true;
            return;
        }
        throw new IllegalStateException("Notifications already paused");
    }
}
