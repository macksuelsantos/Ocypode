package com.ocypode.sample;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.ocypode.core.activity.robo.AbstractActionBarActivity;

public class SplashScreenActivity extends AbstractActionBarActivity {

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        final TextView textViewTimer = (TextView) findViewById(R.id.activity_splash_screen_text_view_timer);

        CountDownTimer countDownTimer = new CountDownTimer(4000, 250) {
            @Override
            public void onTick(long millisUntilFinished) {
                textViewTimer.setText("Redirecting... " + (millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                pushActivity(HomeActivity.class);
            }
        };

        countDownTimer.start();
    }
}
