package com.minimaldev.android.lottieproj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView = findViewById(R.id.animation_view);

        animationView.setImageAssetsFolder("images/");
        animationView.setAnimation("sun.json");
        animationView.loop(true);
        animationView.playAnimation();

        LottieAnimationView moonView = findViewById(R.id.moon_view);

        moonView.setImageAssetsFolder("moon/");
        moonView.setAnimation("moon.json");
        moonView.loop(true);
        moonView.playAnimation();

        LottieAnimationView cloudy = findViewById(R.id.cloud_view);

        cloudy.setImageAssetsFolder("cloudy/");
        cloudy.setAnimation("cloudy.json");
        cloudy.loop(true);
        cloudy.playAnimation();

        LottieAnimationView cloudymoon = findViewById(R.id.cloudmoon_view);

        cloudymoon.setImageAssetsFolder("cloudymoon/");
        cloudymoon.setAnimation("cloudymoon.json");
        cloudymoon.loop(true);
        cloudymoon.playAnimation();

        LottieAnimationView fogday = findViewById(R.id.fogday_view);

        fogday.setImageAssetsFolder("fogday/");
        fogday.setAnimation("fogday.json");
        fogday.loop(true);
        fogday.playAnimation();

        LottieAnimationView fognight = findViewById(R.id.fognight_view);

        fognight.setImageAssetsFolder("fognight/");
        fognight.setAnimation("fognight.json");
        fognight.loop(true);
        fognight.playAnimation();

        LottieAnimationView overcast = findViewById(R.id.overcast_view);

        overcast.setImageAssetsFolder("overcast/");
        overcast.setAnimation("overcast.json");
        overcast.loop(true);
        overcast.playAnimation();

        LottieAnimationView rainy = findViewById(R.id.rainy_view);

        rainy.setImageAssetsFolder("rainy/");
        rainy.setAnimation("rainy.json");
        rainy.loop(true);
        rainy.playAnimation();

        LottieAnimationView snowday = findViewById(R.id.snowday_view);

        snowday.setImageAssetsFolder("snowday/");
        snowday.setAnimation("snowday.json");
        snowday.loop(true);
        snowday.playAnimation();

        LottieAnimationView snownight = findViewById(R.id.snownight_view);

        snownight.setImageAssetsFolder("snownight/");
        snownight.setAnimation("snownight.json");
        snownight.loop(true);
        snownight.playAnimation();

        LottieAnimationView thunder = findViewById(R.id.thunder_view);

        thunder.setImageAssetsFolder("thunder/");
        thunder.setAnimation("thunder.json");
        thunder.loop(true);
        thunder.playAnimation();

    }
}
