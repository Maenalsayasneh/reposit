package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends Fragment {
    public View Y1;
    public TextView Z1;
    public View a2;
    public View b2;
    public final Handler c = new Handler();
    public boolean c2;
    public final Runnable d = new a();
    public final AdapterView.OnItemClickListener q = new b();
    public ListAdapter x;
    public ListView y;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ListView listView = ListFragment.this.y;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListView listView = (ListView) adapterView;
            ListFragment.this.J0();
        }
    }

    public final void I0() {
        if (this.y == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.y = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.Z1 = textView;
                    if (textView == null) {
                        this.Y1 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.a2 = view.findViewById(16711682);
                    this.b2 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.y = listView;
                        View view2 = this.Y1;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.c2 = true;
                this.y.setOnItemClickListener(this.q);
                ListAdapter listAdapter = this.x;
                boolean z = false;
                if (listAdapter != null) {
                    this.x = null;
                    boolean z2 = 0 != 0;
                    this.x = listAdapter;
                    ListView listView2 = this.y;
                    if (listView2 != null) {
                        listView2.setAdapter(listAdapter);
                        if (!this.c2 && !z2) {
                            if (requireView().getWindowToken() != null) {
                                z = true;
                            }
                            K0(true, z);
                        }
                    }
                } else if (this.a2 != null) {
                    K0(false, false);
                }
                this.c.post(this.d);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public void J0() {
    }

    public final void K0(boolean z, boolean z2) {
        I0();
        View view = this.a2;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.c2 != z) {
            this.c2 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.b2.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.b2.clearAnimation();
                }
                this.a2.setVisibility(8);
                this.b2.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.b2.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.b2.clearAnimation();
            }
            this.a2.setVisibility(0);
            this.b2.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.c.removeCallbacks(this.d);
        this.y = null;
        this.c2 = false;
        this.b2 = null;
        this.a2 = null;
        this.Y1 = null;
        this.Z1 = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        I0();
    }
}
