package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView n1;
    TextView n2;
    TextView n3;
    TextView n4;
    TextView n5;
    TextView n6;
    EditText s1;
    EditText s2;
    EditText s3;
    Button b1;
    Button b2;
    Button b3;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    Button c;
    int tru;
    int fal;
    int w;
    int num1;
    int num2;
    int sum12;
    int an1;
    int an2;
    int an3;
    int num3;
    int num4;
    int sum124;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(TextView) findViewById(R.id.n1);
        n2=(TextView) findViewById(R.id.n2);
        n3=(TextView) findViewById(R.id.n3);
        n4=(TextView) findViewById(R.id.n4);
        n5=(TextView) findViewById(R.id.n5);
        n6=(TextView) findViewById(R.id.n6);
        s1=(EditText) findViewById(R.id.s1);
        s2=(EditText) findViewById(R.id.s2);
        s3=(EditText) findViewById(R.id.s3);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        iv1=(ImageView) findViewById(R.id.iv1);
        iv2=(ImageView) findViewById(R.id.iv2);
        iv3=(ImageView) findViewById(R.id.iv3);
        c=(Button) findViewById(R.id.c);
        tru=R.drawable.tru;
        fal=R.drawable.fal;
        w=R.drawable.w;

    }

    public void son(View view) {
        num1= (int) (Math.random()*(100-1+1)+1);
        num2= (int) (Math.random()*(100-1+1)+1);
        n1.setText(""+num1);
        n2.setText(""+num2);
        sum12=num1+num2;
        iv1.setImageResource(w);
        iv2.setImageResource(w);
        iv3.setImageResource(w);
        n3.setText("number 3");
        n4.setText("number 4");
        n5.setText("number 5");
        n6.setText("number 6");
        count=0;
    }

    public void c1(View view) {
        num3= (int) (Math.random()*(100-1+1)+1);
        String su1=s1.getText().toString();
        if(su1.equals(""))
        {
            Toast.makeText(this, "Enter The Sum!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            an1=Integer.parseInt(su1);
            if(an1==sum12)
            {
                iv1.setImageResource(tru);
                count++;
                n3.setText(""+sum12);
                n4.setText(""+num3);
            }
            else
            {
                iv1.setImageResource(fal);
                n3.setText(""+sum12);
                n4.setText(""+num3);
            }
        }
    }

    public void c2(View view) {
        num4= (int) (Math.random()*(100-1+1)+1);
        sum124=sum12+num3;
        String su2=s2.getText().toString();
        if(su2.equals(""))
        {
            Toast.makeText(this, "Enter The Sum!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            an2=Integer.parseInt(su2);
            if(an2==sum124)
            {
                iv2.setImageResource(tru);
                count++;
            }
            else
            {
                iv2.setImageResource(fal);
            }
            n5.setText(""+sum124);
            n6.setText(""+num4);
        }
    }

    public void c3(View view) {
        String su3=s3.getText().toString();
        int sum1245=sum124+num4;
        if(su3.equals(""))
        {
            Toast.makeText(this, "Enter The Sum!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            an3=Integer.parseInt(su3);
            if(an3==sum1245)
            {
                iv3.setImageResource(tru);
                count++;
            }
            else
            {
                iv3.setImageResource(fal);
            }
            Toast.makeText(this, "Well done, you're done the game! you did "+count+"/3", Toast.LENGTH_LONG).show();
        }
    }
}
