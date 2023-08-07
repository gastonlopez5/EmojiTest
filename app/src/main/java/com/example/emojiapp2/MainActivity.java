package com.example.emojiapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.vanniktech.emoji.EmojiPopup;
import com.vanniktech.emoji.EmojiTextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_emoji;
    private EditText et_emoji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_emoji = findViewById(R.id.btn_emoji);
        et_emoji = findViewById(R.id.et_emoji);

        btn_emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.layout_emoji, null);
//                builder.setView(view);
//
//                AlertDialog dialog = builder.create();
//                dialog.show();

                EmojiPopup popup = EmojiPopup.Builder.fromRootView(view.findViewById(R.id.root_view)).build(et_emoji);
                popup.show();





//                EmojiTextView emojiTextView = (EmojiTextView) LayoutInflater
//                        .from(v.getContext())
//                        .inflate(R.layout.emoji_text_view, R.id.linear_layout, false);
//
//                emojiTextView.setText(et_emoji.getText().toString());
//
//                linearLayout.addView(emojiTextView);
//
//                et_emoji.getText().clear();
            }
        });
    }
}