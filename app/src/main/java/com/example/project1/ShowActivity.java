package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import static com.example.project1.Constant.USER_IMAGE_ID;


public class ShowActivity extends AppCompatActivity {
    private TextView tvName, tvSecName, tvEmail;
    private ImageView imBD;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_layout);
        init();
        getIntentMain();
    }
    private void init()
    {
        imBD = findViewById(R.id.imBD);
        tvName = findViewById(R.id.tvName);
        tvSecName = findViewById(R.id.tvSecName);
        tvEmail = findViewById(R.id.tvEmail);
    }
    private void getIntentMain()
    {
        Intent i = getIntent();
        if(i != null)
        {
            Picasso.get().load(i.getStringExtra(USER_IMAGE_ID)).into(imBD);
            tvName.setText(i.getStringExtra(Constant.USER_NAME));
            tvSecName.setText(i.getStringExtra(Constant.USER_SEC_NAME));
            tvEmail.setText(i.getStringExtra(Constant.USER_EMAIL));
        }
    }
}