package com.example.administrator.calculator_3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;
import java.util.Vector;

public class HexConvertingActivity extends AppCompatActivity implements OnClickListener{

    public static final int[] buttonNumber={
            R.id.hexnumber_C,R.id.hexnumber_D,R.id.hexnumber_E,R.id.hexnumber_F,
            R.id.hexnumber_8,R.id.hexnumber_9,R.id.hexnumber_A,R.id.hexnumber_B,
            R.id.hexnumber_4,R.id.hexnumber_5,R.id.hexnumber_6,R.id.hexnumber_7,
            R.id.hexnumber_0,R.id.hexnumber_1,R.id.hexnumber_2,R.id.hexnumber_3,
            R.id.from_hex,R.id.hex_delete,R.id.to_hex, R.id.hex_clear,R.id.hex_equal
    };
    public static final String[] hex={"2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
    public Button[] button;
    public EditText show_1;
    public Editable editable;
    public int index;
    public TextView show_2;
    public Vector<String> vector;
    private int count;
    public int index1;
    public int index2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hex);

        show_1 =(EditText) findViewById(R.id.hex_1);
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            show_1.setInputType(InputType.TYPE_NULL);
        }
        else
        {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
           /* try
            {
                Class<EditText> cls = EditText.class;
                Method setSoftInputShownOnFocus = cls.getMethod("setSoftInputShownOnFocus", boolean.class);
                setSoftInputShownOnFocus.setAccessible(true);
                setSoftInputShownOnFocus.invoke(show_1, false);
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            try
            {
                Class<EditText> cls = EditText.class;
                Method setShowSoftInputOnFocus;
                setShowSoftInputOnFocus = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
                setShowSoftInputOnFocus.setAccessible(true);
                setShowSoftInputOnFocus.invoke(show_1, false);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        show_1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v)
            {
                count=0;
            }}
        );
        show_2=(TextView) findViewById(R.id.hex_2) ;
        vector=new Vector<String>();
        count=0;
        index1=8;
        index2=8;
        button=new Button[buttonNumber.length];
        for(int i=0;i<buttonNumber.length;i++)
        {
            button[i]=(Button) findViewById(buttonNumber[i]);
            button[i].setOnClickListener(this);
        }
    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.hexnumber_0:
            {
                if(Double.parseDouble(button[16].getText().toString())>0) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "0");
                }
                break;
            }
            case R.id.hexnumber_1:
            {
                if(Double.parseDouble(button[16].getText().toString())>1) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "1");
                }
                break;
            }
            case R.id.hexnumber_2:
            {
                if(Double.parseDouble(button[16].getText().toString())>2) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "2");
                }
                break;
            }
            case R.id.hexnumber_3:
            {
                if(Double.parseDouble(button[16].getText().toString())>3) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "3");
                }
                break;
            }
            case R.id.hexnumber_4:
            {
                if(Double.parseDouble(button[16].getText().toString())>4) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "4");
                }
                break;
            }
            case R.id.hexnumber_5:
            {
                if(Double.parseDouble(button[16].getText().toString())>5) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "5");
                }
                break;
            }
            case R.id.hexnumber_6:
            {
                if(Double.parseDouble(button[16].getText().toString())>6) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "6");
                }
                break;
            }
            case R.id.hexnumber_7:
            {
                if(Double.parseDouble(button[16].getText().toString())>7) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "7");
                }
                break;
            }
            case R.id.hexnumber_8:
            {
                if(Double.parseDouble(button[16].getText().toString())>8) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "8");
                }
                break;
            }
            case R.id.hexnumber_9:
            {
                if(Double.parseDouble(button[16].getText().toString())>9) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "9");
                }
                break;
            }
            case R.id.hexnumber_A:
            {
                if(Double.parseDouble(button[16].getText().toString())>10) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "A");
                }
                break;
            }
            case R.id.hexnumber_B:
            {
                if(Double.parseDouble(button[16].getText().toString())>11) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "B");
                }
                break;
            }
            case R.id.hexnumber_C:
            {
                if(Double.parseDouble(button[16].getText().toString())>12) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "C");
                }
                break;
            }
            case R.id.hexnumber_D:
            {
                if(Double.parseDouble(button[16].getText().toString())>13) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "D");
                }
                break;
            }
            case R.id.hexnumber_E:
            {
                if(Double.parseDouble(button[16].getText().toString())>14) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "E");
                }
                break;
            }
            case R.id.hexnumber_F:
            {
                if(Double.parseDouble(button[16].getText().toString())>15) {
                    if (count == 1) {
                        count = 0;
                        show_1.setText("");
                    }
                    show_2.setText("");
                    index = show_1.getSelectionStart();
                    editable = show_1.getText();
                    editable.insert(index, "F");
                }
                break;
            }
            case R.id.hex_delete:
            {
                show_2.setText("");
                count=0;
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                if(index>0)
                    editable.delete(index-1,index);
                break;
            }
            case R.id.hex_clear:
            {
                count=0;
                show_1.setText("");
                show_2.setText("");
                break;
            }
            case R.id.from_hex:
            {
                count=0;
                AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
                AlertDialog alertDialog = alertDialogBuilder.create();
                ButtonOnClickListerner btncl=new ButtonOnClickListerner(1);
                alertDialogBuilder.setSingleChoiceItems(hex, 0,btncl);
                alertDialogBuilder.show();
                show_2.setText("");
                show_1.setText("");
                break;
            }
            case R.id.to_hex:
            {
                count=0;
                AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
                AlertDialog alertDialog = alertDialogBuilder.create();
                ButtonOnClickListerner btncl=new ButtonOnClickListerner(2);
                alertDialogBuilder.setSingleChoiceItems(hex, 0,btncl);
                alertDialogBuilder.show();
                show_2.setText("");
                show_1.setText("");
                break;
            }
            case R.id.hex_equal:
            {
                count=1;
                String s1=show_1.getText().toString();
                String s2=f(s1,Integer.parseInt(button[16].getText().toString()),Integer.parseInt(button[18].getText().toString()));
                show_2.setText(s2);
                break;
            }
        }
    }
    private String f(String s1,int in,int out)
    {
        int len=s1.length();
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=h1(s1.charAt(i))*Math.pow(in,len-1-i);
        }
        StringBuffer s2=new StringBuffer();
        String ssum=String.valueOf(sum);
        len=ssum.length();
        for(;sum>0;sum=sum/out)
            s2.insert(0,h2(sum%out));
        return s2.toString();
    }
    private int h1(char a)
    {
        switch (a)
        {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                ;
        }
        return -1;
    }
    private char h2(int a)
    {
        switch (a)
        {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                ;
        }
        return 'G';
    }
    class ButtonOnClickListerner implements DialogInterface.OnClickListener{
        private int ident;
        public ButtonOnClickListerner(int i)
        {
            ident=i;
        }
        public void onClick(DialogInterface dialog, int which) {
            if(ident==1)
            {
                index1=which;
                button[16].setText(hex[index1]);
            }
            else if(ident==2) {
                index2 = which;
                button[18].setText(hex[index2]);
            }
                dialog.cancel();
        }
    }
}

