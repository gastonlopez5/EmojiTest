package com.example.emojiapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.vanniktech.emoji.EmojiPopup;
import com.vanniktech.emoji.EmojiTextView;

public class MainActivity extends AppCompatActivity {

    private ImageView bt_emoji, bt_send;
    private EditText et_emoji;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_emoji = findViewById(R.id.bt_emoji);
        bt_send = findViewById(R.id.bt_sent);
        et_emoji = findViewById(R.id.et_emoji);
        linearLayout = findViewById(R.id.linear_layout);

        EmojiPopup popup = EmojiPopup.Builder.fromRootView(findViewById(R.id.linear_layout)).build(et_emoji);

        bt_emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.toggle();
            }
        });

        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmojiTextView emojiTextView = (EmojiTextView) LayoutInflater
                        .from(v.getContext())
                        .inflate(R.layout.emoji_text_view, linearLayout, false);

                emojiTextView.setText(et_emoji.getText().toString());

                linearLayout.addView(emojiTextView);

                et_emoji.getText().clear();
            }
        });
    }
}