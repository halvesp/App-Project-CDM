package com.firstproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingAnimation {

    private Activity activity;
    private AlertDialog animation;

    LoadingAnimation(Activity myActivity){
        activity = myActivity;
    }
    void startLoadingAnimation(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loading_animation, null));
        builder.setCancelable(false);

        animation = builder.create();
        animation.show();
    }
    void stopAnimation(){
        animation.dismiss();
    }
}
