package com.instabug.library.instacapture.screenshot;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FieldHelper {
    private static final String FIELD_NAME_GLOBAL = "mGlobal";
    private static final String FIELD_NAME_PARAMS = "mParams";
    private static final String FIELD_NAME_ROOTS = "mRoots";
    private static final String FIELD_NAME_VIEW = "mView";
    private static final String FIELD_NAME_WINDOW_MANAGER = "mWindowManager";
    private static int[] outLocation = new int[2];

    private FieldHelper() {
    }

    public static Field findField(String str, Class cls) throws NoSuchFieldException {
        Class cls2 = cls;
        while (cls2 != null && cls2 != Object.class) {
            for (Field field : cls2.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            cls2 = cls2.getSuperclass();
        }
        StringBuilder T0 = a.T0("Field: ", str, " is not found in class: ");
        T0.append(cls.toString());
        throw new NoSuchFieldException(T0.toString());
    }

    private static Object getFieldValue(String str, Object obj) throws NoSuchFieldException, IllegalAccessException {
        Field field;
        if (str.equals(FIELD_NAME_WINDOW_MANAGER)) {
            field = findField(str, obj.getClass());
        } else {
            field = obj.getClass().getDeclaredField(str);
        }
        field.setAccessible(true);
        return field.get(obj);
    }

    public static List<RootViewInfo> getRootViews(Activity activity, int[] iArr) {
        boolean z;
        Class<FieldHelper> cls = FieldHelper.class;
        ArrayList arrayList = new ArrayList();
        try {
            Object fieldValue = getFieldValue(FIELD_NAME_GLOBAL, activity.getWindowManager());
            Object fieldValue2 = getFieldValue(FIELD_NAME_ROOTS, fieldValue);
            Object fieldValue3 = getFieldValue(FIELD_NAME_PARAMS, fieldValue);
            Object[] array = ((List) fieldValue2).toArray();
            List list = (List) fieldValue3;
            WindowManager.LayoutParams[] layoutParamsArr = (WindowManager.LayoutParams[]) list.toArray(new WindowManager.LayoutParams[list.size()]);
            for (int i = 0; i < array.length; i++) {
                try {
                    View view = (View) getFieldValue(FIELD_NAME_VIEW, array[i]);
                    if (iArr != null) {
                        z = false;
                        for (int i2 : iArr) {
                            if (i2 == view.getId()) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (view.getVisibility() == 0 && !z) {
                        arrayList.add(new RootViewInfo(view, getViewRect(view), layoutParamsArr[i]));
                    }
                } catch (Exception e) {
                    InstabugSDKLogger.e(cls, "Screenshot capturing failed in one of the viewRoots", e);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            InstabugSDKLogger.e(cls, "Can't fine one of (WindowManager, rootObjects, paramsObject) field name so screenshot capturing failed", e2);
            return arrayList;
        }
    }

    private static Rect getViewRect(View view) {
        view.getLocationOnScreen(outLocation);
        int[] iArr = outLocation;
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }
}
