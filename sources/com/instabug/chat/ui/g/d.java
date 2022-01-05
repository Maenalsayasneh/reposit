package com.instabug.chat.ui.g;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.instabug.chat.R;
import com.instabug.chat.ui.ChatActivity;
import com.instabug.library.Feature;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.ToolbarFragment;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PlaceHolderUtils;
import i0.j.c.n.f.b;
import i0.j.c.n.f.c;
import i0.j.c.n.f.e;
import java.util.ArrayList;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: ChatsFragment */
public class d extends ToolbarFragment<c> implements i0.j.c.n.f.d, AdapterView.OnItemClickListener {
    public b c;
    public ArrayList<com.instabug.chat.e.b> d;
    public a q;

    /* compiled from: ChatsFragment */
    public interface a {
        void f(String str);
    }

    public void H(ArrayList<com.instabug.chat.e.b> arrayList) {
        this.d = arrayList;
    }

    public boolean c() {
        if (getFragmentManager() != null) {
            return getFragmentManager().I(R.id.instabug_fragment_container) instanceof d;
        }
        return false;
    }

    public int getContentLayout() {
        return R.layout.instabug_fragment_chats;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public String getTitle() {
        return PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.CONVERSATIONS_LIST_TITLE, getString(R.string.instabug_str_conversations));
    }

    public void initContentViews(View view, Bundle bundle) {
        view.findViewById(R.id.instabug_btn_toolbar_right).setVisibility(8);
        ListView listView = (ListView) view.findViewById(R.id.instabug_lst_chats);
        listView.setOnItemClickListener(this);
        b bVar = new b(this.d);
        this.c = bVar;
        listView.setAdapter(bVar);
        int i = R.id.instabug_btn_toolbar_left;
        if (view.findViewById(i) != null) {
            view.findViewById(i).setTag(R.id.TAG_BTN_CLOSE, "instabug_btn_close");
        }
    }

    public void l() {
        b bVar = this.c;
        bVar.c = this.d;
        bVar.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (InstabugCore.isFeatureEnabled(Feature.REPLIES)) {
            InstabugCore.isFeatureEnabled(Feature.CHATS);
        }
        setRetainInstance(true);
        if (getActivity() != null && (getActivity() instanceof ChatActivity)) {
            this.q = (a) getActivity();
        }
        this.presenter = new e(this);
        this.d = new ArrayList<>();
    }

    public void onDoneButtonClicked() {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        StringBuilder P0 = i0.d.a.a.a.P0("Chat id: ");
        P0.append(((com.instabug.chat.e.b) adapterView.getItemAtPosition(i)).c);
        InstabugSDKLogger.v(d.class, P0.toString());
        a aVar = this.q;
        if (aVar != null) {
            aVar.f(((com.instabug.chat.e.b) adapterView.getItemAtPosition(i)).c);
        }
    }

    public void onStart() {
        super.onStart();
        P p = this.presenter;
        if (p != null) {
            ((c) p).b();
        }
    }

    public void onStop() {
        super.onStop();
        P p = this.presenter;
        if (p != null) {
            ((c) p).s();
        }
    }
}
