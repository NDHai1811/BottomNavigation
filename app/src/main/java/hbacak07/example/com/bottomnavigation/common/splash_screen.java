package hbacak07.example.com.bottomnavigation.common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import hbacak07.example.com.bottomnavigation.MainActivity;
import hbacak07.example.com.bottomnavigation.R;

public class splash_screen extends AppCompatActivity {

    private static int DELAY_TIME =5000;

    //tạo các biến giá trị
    ImageView backgroundimg;
    TextView powered;

    //Animations
    Animation sideanim,bottomanim;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        backgroundimg =findViewById(R.id.background_image);
        powered=findViewById(R.id.powered);

        //Anim
        sideanim= AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        backgroundimg.setAnimation(sideanim);
        powered.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },DELAY_TIME);

    }
}
