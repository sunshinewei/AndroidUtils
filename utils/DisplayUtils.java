package com.example.myapplication;

import android.content.Context;

/**
 * Created by Administrator on 2016/11/22.
 * 控件尺寸，文字大小不变在应用程序中的工具类
 */
public class DisplayUtils {

    /**将px值转换为dp值，保证尺寸大小不变
     * @param context
     * @param pxValue px值
     * @return
     */
    public static int px2dp(Context context,float pxValue){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int) (pxValue/scale+0.5f);
    }

    /**将dp值转换为px值
     * @param context
     * @param dpValue
     * @return
     */
    public static int dp2px(Context context,float dpValue){
        float scale=context.getResources().getDisplayMetrics().density;
        return (int) (dpValue*scale+0.5f);
    }

    /**将px值转化为sp值
     * @param context
     * @param pxValue
     * @return
     */
    public static int px2sp(Context context,float pxValue){
        float fontScale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue/fontScale+0.5f);
    }

    /**将sp值转换为px值保证文字大小不变
     * @param context
     * @param spValue
     * @return
     */
    public static int sp2px(Context context,float spValue){
        float fontScale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue*fontScale+0.5f);
    }


}
