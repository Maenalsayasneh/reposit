package h0.v.a;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.i.g0.b;
import h0.i.i.g0.c;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class x extends h0.i.i.a {
    public final RecyclerView a;
    public final a b;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends h0.i.i.a {
        public final x a;
        public Map<View, h0.i.i.a> b = new WeakHashMap();

        public a(x xVar) {
            this.a = xVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public c getAccessibilityNodeProvider(View view) {
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
            if (this.a.a() || this.a.a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
                return;
            }
            this.a.a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, bVar);
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, bVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            h0.i.i.a aVar = this.b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.a.a() || this.a.a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.a.a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            h0.i.i.a aVar = this.b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.a = recyclerView;
        a aVar = this.b;
        if (aVar != null) {
            this.b = aVar;
        } else {
            this.b = new a(this);
        }
    }

    public boolean a() {
        return this.a.hasPendingAdapterUpdates();
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        if (!a() && this.a.getLayoutManager() != null) {
            this.a.getLayoutManager().onInitializeAccessibilityNodeInfo(bVar);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (a() || this.a.getLayoutManager() == null) {
            return false;
        }
        return this.a.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
