package com.tw.apistackbase.utils;

import java.lang.reflect.Field;

public class ObjectJudge {
    public static boolean isObjectNull(Object object, String... exceptFileNames) throws Exception {
        Class c = object.getClass();
        Field[] fields = c.getFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (null != exceptFileNames) {
                for (int i = 0; i < fields.length; i++) {
                    if (field.getName().equals(exceptFileNames[i])) {
                        Object fieldValue = field.get(object);
                        if (fieldValue == null || "".equals(fieldValue) || object.equals(0)) {
                            return true;
                        }
                    }
                }

            }else{
                Object fieldValue = field.get(object);
                if (fieldValue == null || "".equals(fieldValue) || object.equals(0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
