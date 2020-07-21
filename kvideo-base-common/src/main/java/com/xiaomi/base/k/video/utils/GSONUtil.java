package com.xiaomi.base.k.video.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;


/**
 * 操作json的工具类
 *
 * @author: jianglianglong
 * @Date: 2020/4/3 10:45
 */
public class GSONUtil {

    public static final Gson GSON = new Gson();
    private static final Logger LOGGER = LoggerFactory.getLogger(GSONUtil.class);

    private GSONUtil() {
    }

    /**
     * 转为jsonString
     *
     * @param o
     * @return
     */
    public static String toString(Object o) {
        return toString(o, "");
    }

    /**
     * 转为jsonString
     *
     * @param o
     * @param defaultString
     * @return
     */
    public static String toString(Object o, String defaultString) {
        try {
            return GSON.toJson(o);
        } catch (Exception e) {
            LOGGER.error("write to string error", e);
            return defaultString;
        }
    }

    /**
     * 反序列化为对象，不带泛型
     *
     * @param s
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T toObject(String s, Class<T> tClass) {
        return toObject(s, null, tClass);
    }

    /**
     * 反序列化为对象，不带泛型
     *
     * @param s
     * @param defaultValue
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T toObject(String s, T defaultValue, Class<T> tClass) {

        try {
            return GSON.fromJson(s, tClass);
        } catch (JsonSyntaxException e) {
            LOGGER.error("fromJson exception", e);
            return defaultValue;
        }
    }

    /**
     * 反序列化为对象，带泛型
     *
     * @param s
     * @param type
     * @return
     */
    public static <T> T toObject(String s, Type type) {
        return toObject(s, null, type);
    }

    /**
     * 反序列化为对象，带泛型
     *
     * @param s
     * @param defaultValue
     * @param type
     * @return
     */
    public static <T> T toObject(String s, T defaultValue, Type type) {
        try {
            return GSON.fromJson(s, type);
        } catch (Exception e) {
            LOGGER.error("fromJson", e);
        }
        return defaultValue;
    }
//
//    /**
//     * 反序列化对象，返回list
//     * @param jsonString
//     * @param tClass
//     * @param <T>
//     * @return
//     * @throws IOException
//     */
//    public static <T> List<T> ofList(String jsonString, Class<T> tClass) throws IOException {
//
//        if(StringUtils.isBlank(jsonString)){
//            return null;
//        }
//        GSON.toJson()
//        JavaType javaType = MAPPER.getTypeFactory().constructParametrizedType(ArrayList.class,ArrayList.class,tClass);
//        return MAPPER.readValue(jsonString,javaType);
//    }

}
