package h0.g.b.b;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames */
public class g {
    public static HashMap<String, Constructor<? extends d>> a;
    public HashMap<Integer, ArrayList<d>> b = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        a = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            a.put("KeyPosition", h.class.getConstructor(new Class[0]));
            a.put("KeyCycle", f.class.getConstructor(new Class[0]));
            a.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            a.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public g() {
    }

    public void a(n nVar) {
        ArrayList arrayList = this.b.get(Integer.valueOf(nVar.c));
        if (arrayList != null) {
            nVar.w.addAll(arrayList);
        }
        ArrayList arrayList2 = this.b.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                String str = ((ConstraintLayout.a) nVar.b.getLayoutParams()).X;
                String str2 = dVar.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    nVar.w.add(dVar);
                }
            }
        }
    }

    public void b(d dVar) {
        if (!this.b.containsKey(Integer.valueOf(dVar.b))) {
            this.b.put(Integer.valueOf(dVar.b), new ArrayList());
        }
        ArrayList arrayList = this.b.get(Integer.valueOf(dVar.b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        d dVar;
        Exception e;
        try {
            int eventType = xmlPullParser.getEventType();
            d dVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (a.containsKey(name)) {
                        try {
                            Constructor constructor = a.get(name);
                            if (constructor != null) {
                                dVar = (d) constructor.newInstance(new Object[0]);
                                try {
                                    dVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    b(dVar);
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                dVar2 = dVar;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception e3) {
                            d dVar3 = dVar2;
                            e = e3;
                            dVar = dVar3;
                            Log.e("KeyFrames", "unable to create ", e);
                            dVar2 = dVar;
                            eventType = xmlPullParser.next();
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(dVar2 == null || (hashMap2 = dVar2.e) == null)) {
                            ConstraintAttribute.f(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || dVar2 == null || (hashMap = dVar2.e) == null)) {
                        ConstraintAttribute.f(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
