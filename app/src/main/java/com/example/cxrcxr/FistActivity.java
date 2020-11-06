package com.example.cxrcxr;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FistActivity extends AppCompatActivity {

    public FistActivity() {
        super();
    }

    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if (resultCode == RESULT_OK){
                String msg = data.getStringExtra("msg");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("","");
        setContentView(R.layout.buttonlayout);
        Button button1 = findViewById(R.id.Button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent intent = new Intent();
                intent.setData(Uri.parse("tel:18981870236"));
                startActivity(intent);*/


                Intent intent = new Intent(FistActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                Message msg = new Message("张三", "M", 20);
                bundle.putParcelable("msg", msg);
                intent.putExtra("Message", bundle);
                startActivity(intent);
            }
        });





    }
}
