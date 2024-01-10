package com.example.febflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Messege2 extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.com.Febflix.extra.REPLY";

    private EditText mReply;
    private TextView mTextMessage; // Tambahkan TextView untuk text_message

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messege2);

        mReply = findViewById(R.id.editText_second);
        mTextMessage = findViewById(R.id.text_message); // Inisialisasi text_message

        Intent intent = getIntent();
        String message = intent.getStringExtra(Messege1.EXTRA_MESSAGE);

        mTextMessage.setText(message); // Set teks pada text_message
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
