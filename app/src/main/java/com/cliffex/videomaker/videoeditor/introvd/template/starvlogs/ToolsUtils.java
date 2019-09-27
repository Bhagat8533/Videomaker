package com.introvd.template.starvlogs;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

public class ToolsUtils {
    private static Toast myToast;

    public static Drawable getDrawbaableByName(Context context, String name) {
        return context.getResources().getDrawable(context.getResources().getIdentifier(name, "drawable", context.getPackageName()));
    }

    public static void launchToMaketAppPro(Context mContext, String paketname) {
        try {
            mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + paketname)));
        } catch (ActivityNotFoundException e) {
            try {
                mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + paketname)));
            } catch (Exception e2) {
                showToast(mContext, "unable to find market app");
            }
        }
    }

    public static void showToast(Context mContext, String text) {
        if (myToast != null) {
            myToast.cancel();
        } else {
            myToast = new Toast(mContext);
        }
        myToast = Toast.makeText(mContext, text, 0);
        myToast.show();
    }

    public static int findViewId(Context context, String nameId) {
        return context.getResources().getIdentifier(nameId, "id", context.getPackageName());
    }

    public static int getIdLayout(Context context, String nameLayout) {
        return context.getResources().getIdentifier(nameLayout, "layout", context.getPackageName());
    }

    public static int getIdColor(Context context, String nameLayout) {
        return context.getResources().getIdentifier(nameLayout, "color", context.getPackageName());
    }

    public static int getIdFromRaw(Context context, String nameLayout) {
        return context.getResources().getIdentifier(nameLayout, "raw", context.getPackageName());
    }

    public static AnimationDrawable getFrame(Context mcontext, int number) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        DecimalFormat formatter = new DecimalFormat("00");
        for (int i = 0; i < number; i++) {
            animationDrawable.addFrame(mcontext.getResources().getDrawable(getIdDrawable(mcontext, "gift_animation_" + formatter.format((long) (i + 1)))), 100);
        }
        return animationDrawable;
    }

    public static int getIdDrawable(Context context, String nameLayout) {
        return context.getResources().getIdentifier(nameLayout, "drawable", context.getPackageName());
    }

    public static int getIdString(Context context, String nameLayout) {
        return context.getResources().getIdentifier(nameLayout, "string", context.getPackageName());
    }

    public static int getIdFromAnim(Context context, String namAnim) {
        return context.getResources().getIdentifier(namAnim, "anim", context.getPackageName());
    }

    public static int getIdFromAsset(Context context, String nameAsset) {
        return context.getResources().getIdentifier(nameAsset, "raw", context.getPackageName());
    }

    public static void setFontForTextView(Context context, TextView view) {
        view.setTypeface(Typeface.createFromAsset(context.getAssets(), "newfonts/product-sans.ttf"));
    }

    public static void setFontForButon(Context context, Button view) {
        view.setTypeface(Typeface.createFromAsset(context.getAssets(), "newfonts/product-sans.ttf"));
    }

    public static Drawable getDrawableFromAssets(Context context, String name) {
        Log.e("test", " name = " + name);
        InputStream ims = null;
        try {
            ims = context.getAssets().open(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Drawable.createFromStream(ims, null);
    }

    public static void goneView(Activity activity, String name) {
        activity.findViewById(findViewId(activity, name)).setVisibility(8);
    }

    public static void visibleView(Activity activity, String name) {
        activity.findViewById(findViewId(activity, name)).setVisibility(0);
    }

    public static boolean checkInstalled(String packagename, Context context) {
        try {
            context.getPackageManager().getPackageInfo(packagename, 0);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static void gotoMarket(String pkm, Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + pkm)));
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + pkm)));
        }
    }
}
