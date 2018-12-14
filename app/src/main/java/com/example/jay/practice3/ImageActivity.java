package com.example.jay.practice3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;

public class ImageActivity extends AppCompatActivity {

    private ImageView imgView;
    private Button imgbtn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imgView = (ImageView) findViewById(R.id.imgView);
        imgbtn2 = (Button) findViewById(R.id.imgbtn2);

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(); // 시스템 내에 들어있는 사진 파일들 불러오기
                intent.setType("image/*");// 이미지의 타입을 가지고 있는 파일들을 모두 불러온다
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1) { // Intent가 건네준 코드 번호를 받아서, 그 값이 요청한 값과 같다면
            // 요청에 성공한다면,
            if (resultCode == RESULT_OK) {
                try {
                    InputStream is = getContentResolver().openInputStream(data.getData()); // 선택한 이미지에서
                    Bitmap bitmap = BitmapFactory.decodeStream(is); // 비트맵을 생성
                    is.close();
                    imgView.setImageBitmap(bitmap); // 이미지를 이미지뷰에 넣어준다
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
