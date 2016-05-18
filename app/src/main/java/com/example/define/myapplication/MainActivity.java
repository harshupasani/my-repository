package com.example.define.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.nispok.snackbar.Snackbar;

import java.net.URL;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;
    ImageButton imageButton;
    ImageView imageView;
    Toolbar toolbar;
   // Snackbar snack = new Snackbar(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
//        editText = (EditText) findViewById(R.id.edit);
//        button = (Button) findViewById(R.id.button);
 //       imageButton = (ImageButton) findViewById(R.id.imagebutton);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);

        setSupportActionBar(toolbar);


/*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText());
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Image Button Clicked", LENGTH_LONG).show();
               // snack = Snackbar.with(getApplicationContext()).duration(LENGTH_SHORT);
               try{
                URL url = new URL("https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiKnY-QnePMAhUEPRQKHXDJDp4QjRwIBw&url=http%3A%2F%2Fwww.idolator.com%2F7612516%2Fadele-hello-full-song-25&psig=AFQjCNEZxTHXpQBnT5oALfXRCK040n7f8Q&ust=1463647213557239");
                Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());

                imageView.setImageBitmap(bmp);
               }
               catch (Exception e){
                   Log.e("Exception in Imageview:", e.toString());
               }

            }
        });

*/

    }
}
