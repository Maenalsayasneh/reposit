package i0.j.c.n.f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instabug.chat.R;
import com.instabug.chat.e.d;
import com.instabug.library.ui.custom.CircularImageView;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ChatsAdapter */
public class b extends BaseAdapter {
    public List<com.instabug.chat.e.b> c;

    /* compiled from: ChatsAdapter */
    public static class a {
        public final TextView a;
        public final CircularImageView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final LinearLayout f;

        public a(View view) {
            this.f = (LinearLayout) view.findViewById(R.id.conversation_list_item_container);
            this.a = (TextView) view.findViewById(R.id.instabug_txt_message_sender);
            this.b = (CircularImageView) view.findViewById(R.id.instabug_message_sender_avatar);
            this.c = (TextView) view.findViewById(R.id.instabug_txt_message_time);
            this.e = (TextView) view.findViewById(R.id.instabug_unread_messages_count);
            this.d = (TextView) view.findViewById(R.id.instabug_txt_message_snippet);
        }
    }

    public b(List<com.instabug.chat.e.b> list) {
        this.c = list;
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i) {
        return this.c.get(i);
    }

    public long getItemId(int i) {
        return (long) this.c.get(i).c.hashCode();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        String str;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_conversation_list_item, viewGroup, false);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        Context context = view.getContext();
        com.instabug.chat.e.b bVar = this.c.get(i);
        InstabugSDKLogger.v(this, "Binding chat " + bVar + " to view");
        Collections.sort(bVar.q, new d.a());
        d a2 = bVar.a();
        if (a2 == null || (str = a2.q) == null || TextUtils.isEmpty(str.trim()) || a2.q.equals("null")) {
            if (a2 != null && a2.b2.size() > 0) {
                ArrayList<com.instabug.chat.e.a> arrayList = a2.b2;
                String str2 = arrayList.get(arrayList.size() - 1).x;
                if (str2 != null) {
                    str2.hashCode();
                    char c2 = 65535;
                    switch (str2.hashCode()) {
                        case -831439762:
                            if (str2.equals("image_gallery")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 93166550:
                            if (str2.equals("audio")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 112202875:
                            if (str2.equals("video")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1698911340:
                            if (str2.equals("extra_image")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1710800780:
                            if (str2.equals("extra_video")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 1830389646:
                            if (str2.equals("video_gallery")) {
                                c2 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 3:
                            aVar.d.setText(com.instabug.library.R.string.instabug_str_image);
                            break;
                        case 1:
                            aVar.d.setText(com.instabug.library.R.string.instabug_str_audio);
                            break;
                        case 2:
                        case 4:
                        case 5:
                            aVar.d.setText(com.instabug.library.R.string.instabug_str_video);
                            break;
                    }
                }
            }
        } else {
            aVar.d.setText(a2.q);
        }
        String d = bVar.d();
        if (d == null || d.equals("") || d.equals("null") || a2 == null || a2.c()) {
            aVar.a.setText(bVar.e());
        } else {
            InstabugSDKLogger.v(this, "chat SenderName: " + d);
            aVar.a.setText(d);
        }
        aVar.c.setText(InstabugDateFormatter.formatConversationLastMessageDate(bVar.b()));
        if (bVar.f() != 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.instabug.library.R.attr.instabug_unread_message_background_color, typedValue, true);
            aVar.f.setBackgroundColor(typedValue.data);
            Drawable drawable = h0.i.b.a.getDrawable(context, com.instabug.library.R.drawable.ibg_core_bg_white_oval);
            if (drawable != null) {
                aVar.e.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(drawable));
            }
            aVar.e.setText(String.valueOf(bVar.f()));
            aVar.e.setVisibility(0);
        } else {
            aVar.f.setBackgroundColor(0);
            aVar.e.setVisibility(8);
        }
        if (bVar.c() != null) {
            PoolProvider.postIOTask(new a(bVar, context, aVar));
        } else {
            aVar.b.setImageResource(R.drawable.ibg_core_ic_avatar);
        }
        return view;
    }
}
