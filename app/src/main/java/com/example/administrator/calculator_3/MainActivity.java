package com.example.administrator.calculator_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Vector;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int[] buttonNumber={
            R.id.power_2,R.id.sin_2,R.id.cos_2,R.id.tan_2, R.id.delete_2,R.id.clear_2,
            R.id.factorial_2,R.id.left_bracket_2,R.id.right_bracket_2,R.id.ln_2,R.id.multiply_2,
            R.id.number7_2, R.id.number8_2, R.id.number9_2, R.id.lg_2,R.id.divide_2,
            R.id.number4_2, R.id.number5_2, R.id.number6_2, R.id.power_2,R.id.add_2,
            R.id.number1_2, R.id.number2_2, R.id.number3_2, R.id.ex_2,R.id.subtract_2,
            R.id.percent_2,R.id.number0_2, R.id.point_2,R.id.PI_2,R.id.equal_2
    };
    public Button[] button;
    public EditText show_1;
    public Editable editable;
    public int index;
    public TextView show_2;
    public Vector<String> vector;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        show_1 =(EditText) findViewById(R.id.show_1);
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            show_1.setInputType(InputType.TYPE_NULL);
        }
        else
        {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
            /*try
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

        show_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                count=0;
            }}
                );
        show_2=(TextView) findViewById(R.id.show_2) ;
        vector=new Vector<String>();
        count=0;
        button=new Button[buttonNumber.length];
        for(int i=0;i<buttonNumber.length;i++)
        {
            button[i]=(Button) findViewById(buttonNumber[i]);
            button[i].setOnClickListener(this);
        }

    }
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.sin_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"sin(");
                break;
            case R.id.cos_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"cos(");
                break;
            case R.id.tan_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"tan(");
                break;
            case R.id.delete_2:
                show_2.setText("");
                count=0;
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                if(index>0)
                    editable.delete(index-1,index);
                break;
            case R.id.clear_2:
                count=0;
                show_1.setText("");
                show_2.setText("");
                break;
            case R.id.factorial_2:
                if(count==1)
                {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"!");
                break;
            case R.id.left_bracket_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"(");
                break;
            case R.id.right_bracket_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,")");
                break;
            case R.id.ln_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"ln(");
                break;
            case R.id.multiply_2:
                if(count==1)
                {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"*");
                break;
            case R.id.number7_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"7");
                break;
            case R.id.number8_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"8");
                break;
            case R.id.number9_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"9");
                break;
            case R.id.lg_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"lg(");
                break;
            case R.id.divide_2:
                if(count==1)
                {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"/");
                break;
            case R.id.number4_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"4");
                break;
            case R.id.number5_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"5");
                break;
            case R.id.number6_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"6");
                break;
            case R.id.power_2:
                if(count==1)
                {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"^(");
                break;
            case R.id.add_2:
                if(count==1)
                {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"+");
                break;
            case R.id.number1_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"1");
                break;
            case R.id.number2_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"2");
                break;
            case R.id.number3_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"3");
                break;
            case R.id.ex_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"e");
                break;
            case R.id.subtract_2:
                if(count==1) {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"-");
                break;
            case R.id.percent_2:
                if(count==1) {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"%");
                break;
            case R.id.number0_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"0");
                break;
            case R.id.point_2:
                if(count==1) {
                    count = 0;
                    show_1.setText(show_2.getText());
                    show_1.setSelection(show_1.getText().length());
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,".");
                break;
            case R.id.PI_2:
                if(count==1)
                {
                    count=0;
                    show_1.setText("");
                }
                show_2.setText("");
                index=show_1.getSelectionStart();
                editable=show_1.getText();
                editable.insert(index,"π");
                break;
            case R.id.equal_2:
                count=1;
                String sstring =show_1.getText().toString();
                if(sstring.length()==0) break;
                transvector(sstring);
                int s=0,t=0;
                String string =calculate(vector,sstring,t,s);
                show_2.setText(string);
                show_1.setSelection(sstring.length());

        }
    }
    public void transvector(String string)
    {
        int len,left,right;
        for(len=string.length(),left=0,right=0;right<len;) {
            if (string.charAt(right) == '-' || string.charAt(right) == '+' || string.charAt(right) == '*' || string.charAt(right) == '/'
                    || string.charAt(right) == '('|| string.charAt(right) == ')'|| string.charAt(right) == '^'||string.charAt(right) == '!'
                    ||string.charAt(right) == '%') {
                if(right-left>0)
                    vector.add(string.substring(left,right));
                vector.add(string.substring(right, right+1));
                left = right + 1;
                right = left;
            }
            else if(string.charAt(right) == 'π')
            {
                if(right-left>0)
                {
                    vector.add(string.substring(left,right));
                    vector.add("*");
                }
                vector.add(String.valueOf(Math.PI));
                left = right + 1;
                right = left;
            }
            else if(string.charAt(right) == 'e')
            {
                if(right-left>0)
                {
                    vector.add(string.substring(left,right));
                    vector.add("*");
                }
                vector.add(String.valueOf(Math.E));
                left = right + 1;
                right = left;
            }
            else if(string.charAt(right) == 's' || string.charAt(right) == 'c'|| string.charAt(right) == 't')
            {
                if(right-left>0)
                {
                    vector.add(string.substring(left,right));
                    vector.add("*");
                }
                vector.add(string.substring(right, right+3));
                left = right + 3;
                right = left;
            }
            else if(string.charAt(right) == 'l')
            {
                if(right-left>0)
                {
                    vector.add(string.substring(left,right));
                    vector.add("*");
                }
                vector.add(string.substring(right, right+2));
                left = right + 2;
                right = left;
            }
            else
            {
                if (right == len - 1) {
                    vector.add(string.substring(left, right+1));
                    right++;
                }
                else right++;
            }
        }
    }
    private String calculate(Vector<String> vector,String string,int t,int s)
    {
        int l,r,c;
        if(vector.elementAt(0).equals("-")||vector.elementAt(0).equals("+"))
            vector.insertElementAt("0",0);
        for(l=0,r=0,c=0;c<vector.size();c++)
            if(vector.elementAt(c).equals("(")) l++;
            else if(vector.elementAt(c).equals(")")) r++;
        if(l<r)
        {
            vector.removeAllElements();
            Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
        }
        else
        {
            int i;
            for(i=0;i<l-r;i++)
                vector.add(")");
        }
        while(t<5&&vector.size()>0)
        {

            switch (t){
                case 0:
                {
                    int temp=0;
                    for(s=0;s<vector.size();s++)
                    {
                        if(vector.elementAt(s).equals(")"))
                        {
                            temp++;
                            int ss;
                            for(ss=s;ss>=0;ss--)
                            {
                                if(vector.elementAt(ss).equals("("))
                                {
                                    int tlen=s-ss-1,i;
                                    Vector<String> v=new Vector<String>();
                                    for(i=0;i<tlen;i++)
                                        v.add(vector.elementAt(ss+1+i));
                                    String s1=null;
                                    String s2=calculate(v,s1,0,0);
                                    vector.setElementAt(s2,ss);
                                    for(i=0;i<=tlen;i++)
                                        vector.remove(ss+1);
                                    break;
                                }
                            }
                            if(ss<0)
                            {
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
                            }
                            break;
                        }
                    }
                    if(temp==0) t=1;
                    break;
                }
                case 1:
                {
                    int temp=0;
                    for(s=0;s<vector.size();s++)
                    {
                        if(vector.elementAt(s).equals("!")||vector.elementAt(s).equals("%"))
                        {
                            temp++;
                            if(s==0||vector.elementAt(s-1).equals("+")||vector.elementAt(s-1).equals("-")||vector.elementAt(s-1).equals("*")||vector.elementAt(s-1).equals("/")||vector.elementAt(s-1).equals("+")
                                    ||vector.elementAt(s-1).equals("sin")||vector.elementAt(s-1).equals("cos")||vector.elementAt(s-1).equals("tan")||vector.elementAt(s-1).equals("^")
                                    ||vector.elementAt(s-1).equals("ln")||vector.elementAt(s-1).equals("lg"))
                            {
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
                                break;
                            }
                            if(vector.elementAt(s).equals("!"))
                            {
                                double z=f(Double.parseDouble(vector.elementAt(s-1)));
                                if(z==-1)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                                else if(z==0)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                                vector.setElementAt((new BigDecimal(z).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                vector.removeElementAt(s-1);
                                break;
                            }
                            else if(vector.elementAt(s).equals("%"))
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Double.parseDouble(vector.elementAt(s-1))/100).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s-1);
                                    break;
                                } catch (Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                    if(temp==0) t=2;
                    break;
                }
                case 2:
                {
                    int temp=0;
                    for(s=vector.size()-1;s>=0;s--)
                    {
                        if(vector.elementAt(s).equals("^")||vector.elementAt(s).equals("sin")||vector.elementAt(s).equals("cos") ||vector.elementAt(s).equals("tan")
                                ||vector.elementAt(s).equals("ln") ||vector.elementAt(s).equals("lg"))
                        {
                            temp++;
                            if(s==vector.size()-1||vector.elementAt(s+1).equals("-") || vector.elementAt(s+1).equals("+")||vector.elementAt(s+1).equals("*") || vector.elementAt(s+1).equals("/")
                                    ||vector.elementAt(s).equals("^")&&(s==0||vector.elementAt(s-1).equals("+")||vector.elementAt(s-1).equals("-")||vector.elementAt(s-1).equals("*")
                                    ||vector.elementAt(s-1).equals("/")||vector.elementAt(s-1).equals("sin")||vector.elementAt(s-1).equals("cos")||vector.elementAt(s-1).equals("tan")))
                            {
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
                                break;
                            }
                            if(vector.elementAt(s).equals("sin"))
                            {
                                try{
                                    vector.setElementAt((new BigDecimal(Math.sin((Double.parseDouble(vector.elementAt(s+1))))).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s+1);
                                    break;
                                } catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                            else if(vector.elementAt(s).equals("cos"))
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Math.cos((Double.parseDouble(vector.elementAt(s+1))))).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s+1);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                            else if(vector.elementAt(s).equals("tan"))
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Math.tan((Double.parseDouble(vector.elementAt(s+1))))).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s+1);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                            else if(vector.elementAt(s).equals("ln"))
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Math.log((Double.parseDouble(vector.elementAt(s+1))))).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s+1);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                            else if(vector.elementAt(s).equals("lg"))
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Math.log((Double.parseDouble(vector.elementAt(s+1))))/Math.log(10.0)).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s+1);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                            else if(vector.elementAt(s).equals("^"))
                            {
                                try
                                {

                                    vector.setElementAt((new BigDecimal(Math.pow(Double.parseDouble(vector.elementAt(s-1)),Double.parseDouble(vector.elementAt(s+1)))).setScale(5, RoundingMode.HALF_UP)).toString(),s);
                                    vector.removeElementAt(s-1);
                                    vector.removeElementAt(s);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                        }
                    }
                    if(temp==0) t=3;
                    break;
                }
                case 3:
                {
                    int temp=0;
                    for(s=0;s<vector.size();s++)
                    {
                        if(vector.elementAt(s).equals("*"))
                        {
                            if(s==0||s==vector.size()-1||vector.elementAt(s-1).equals("-") ||vector.elementAt(s-1).equals("+")|| vector.elementAt(s-1).equals("*") ||vector.elementAt(s-1).equals("/")
                                    ||vector.elementAt(s+1).equals("-") || vector.elementAt(s+1).equals("+")||vector.elementAt(s+1).equals("*") || vector.elementAt(s+1).equals("/"))
                            {
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
                                break;
                            }
                            else
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Double.parseDouble(vector.elementAt(s - 1)) * Double.parseDouble(vector.elementAt(s + 1))).setScale(5, RoundingMode.HALF_UP)).toString(), s);
                                    vector.removeElementAt(s - 1);
                                    vector.removeElementAt(s);
                                    temp = 1;
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                        }
                        else if(vector.elementAt(s).equals("/"))
                        {
                            if(s==0||s==vector.size()-1||vector.elementAt(s-1).equals("-") ||vector.elementAt(s-1).equals("+")|| vector.elementAt(s-1).equals("*") ||vector.elementAt(s-1).equals("/")
                                    ||Double.parseDouble(vector.elementAt(s+1))==0||vector.elementAt(s+1).equals("-") || vector.elementAt(s+1).equals("+")||vector.elementAt(s+1).equals("*") || vector.elementAt(s+1).equals("/")){
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this, "GO WRONG!", Toast.LENGTH_LONG).show();
                                break;
                            }
                            else
                            {
                                try
                                {
                                    vector.setElementAt((new BigDecimal(Double.parseDouble(vector.elementAt(s - 1)) / Double.parseDouble(vector.elementAt(s + 1))).setScale(5, RoundingMode.HALF_UP)).toString(), s);
                                    vector.removeElementAt(s - 1);
                                    vector.removeElementAt(s);
                                    temp = 1;
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                        }
                    }
                    if(temp==0) t=4;
                    break;
                }
                case 4:
                {
                    int temp=0;
                    for(s=0;s<vector.size();s++)
                    {
                        if(vector.elementAt(s).equals("+"))
                        {
                            temp++;
                            if(s==vector.size()-1||vector.elementAt(s-1).equals("-") ||vector.elementAt(s-1).equals("+")|| vector.elementAt(s-1).equals("*") ||vector.elementAt(s-1).equals("/")
                                    ||vector.elementAt(s+1).equals("-") || vector.elementAt(s+1).equals("+")||vector.elementAt(s+1).equals("*") || vector.elementAt(s+1).equals("/"))
                            {
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this,"GO WRONG!",Toast.LENGTH_LONG).show();
                                break;
                            }
                            else
                            {
                                try {
                                    vector.setElementAt((new BigDecimal(Double.parseDouble(vector.elementAt(s - 1)) + Double.parseDouble(vector.elementAt(s + 1))).setScale(5, RoundingMode.HALF_UP)).toString(), s);
                                    vector.removeElementAt(s - 1);
                                    vector.removeElementAt(s);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                        }
                        else if(vector.elementAt(s).equals("-"))
                        {
                            temp++;
                            if (s==vector.size()-1||vector.elementAt(s-1).equals("-") ||vector.elementAt(s-1).equals("+")|| vector.elementAt(s-1).equals("*") ||vector.elementAt(s-1).equals("/")
                                    ||vector.elementAt(s+1).equals("-") || vector.elementAt(s+1).equals("+")||vector.elementAt(s+1).equals("*") || vector.elementAt(s+1).equals("/")) {
                                vector.removeAllElements();
                                Toast.makeText(MainActivity.this, "GO WRONG!", Toast.LENGTH_LONG).show();
                                break;
                            }
                            else {
                                try {
                                    vector.setElementAt((new BigDecimal(Double.parseDouble(vector.elementAt(s - 1)) - Double.parseDouble(vector.elementAt(s + 1))).setScale(5, RoundingMode.HALF_UP)).toString(), s);
                                    vector.removeElementAt(s - 1);
                                    vector.removeElementAt(s);
                                    break;
                                }catch(Exception E)
                                {
                                    vector.removeAllElements();
                                    Toast.makeText(MainActivity.this,"Overflow!",Toast.LENGTH_LONG).show();
                                    break;
                                }
                            }
                        }
                    }
                    if(temp==0) t=5;
                }
            }
        }
        if(vector.size()==1) {
            double sum=Double.parseDouble(vector.elementAt(0));
            double sum2=Math.abs(sum);
            if(sum2>=1000000||sum2>0&&sum2<=0.00000001)
                string = (new DecimalFormat("#.####E0")).format(sum);
            else if(String.valueOf(sum).length()>10)
                string=String.valueOf(sum).substring(0,10);
            else string=String.valueOf(sum);
            vector.removeAllElements();
        }
        else if(vector.size()>1)
        {
            vector.removeAllElements();
            Toast.makeText(MainActivity.this, "GO WRONG!", Toast.LENGTH_LONG).show();
            string ="";
        }
        else string="";
        return string;
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId())
        {
            case R.id.hex_converter:
                Intent intent1=new Intent(MainActivity.this,HexConvertingActivity.class);
                startActivity(intent1);
                break;
            case R.id.define_function:
                Intent intent2=new Intent(MainActivity.this,DefiningFunctionActivity.class);
                startActivity(intent2);
                break;
        }
        return true;
    }
    private double f(double x)
    {
        int y=(int) x;
        if((x-y)!=0||x<0)return -1;
        double z;
        for(z=1;x>1;x--)
            if(Double.MAX_VALUE/x<z)
                return 0;
            else z=z*x;
        return z;
    }
}

