package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.b.e.i.g;
import h0.b.e.i.n;

public class NavigationMenuView extends RecyclerView implements n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public void b(g gVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
