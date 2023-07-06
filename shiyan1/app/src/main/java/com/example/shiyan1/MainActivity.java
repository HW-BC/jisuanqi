package com.example.shiyan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dot,btn_sum,btn_sub,btn_mult,btn_div,btn_clr,btn_equ,btn_fu,btn_kf,btn_chu100;
    private TextView cal_result;
    private boolean isClickequ=false;
    private String strnum1,strnum2="";
    private double num1,num2=0.0;
    private String op="";
    private double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        绑定
        cal_result=findViewById(R.id.result);
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_dot=findViewById(R.id.dot);
        btn_sum=findViewById(R.id.btn_sum);
        btn_sub=findViewById(R.id.btn_sub);
        btn_mult=findViewById(R.id.btn_mult);
        btn_div=findViewById(R.id.btn_div);
        btn_clr=findViewById(R.id.btn_c);
        btn_equ=findViewById(R.id.btn_equ);
        btn_fu=findViewById(R.id.btn_fu);
        btn_kf=findViewById(R.id.btn_kf);
        btn_chu100=findViewById(R.id.btn_chu100);
//        监听器
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_fu.setOnClickListener(this);
        btn_kf.setOnClickListener(this);
        btn_chu100.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_0){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"0");
        }
        else if(view.getId()==R.id.btn_1){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"1");
        }
        else if(view.getId()==R.id.btn_2){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"2");
        }
        else if(view.getId()==R.id.btn_3){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"3");
        }
        else if(view.getId()==R.id.btn_4){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"4");
        }
        else if(view.getId()==R.id.btn_5){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"5");
        }
        else if(view.getId()==R.id.btn_6){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"6");
        }
        else if(view.getId()==R.id.btn_7){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"7");
        }
        else if(view.getId()==R.id.btn_8){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"8");
        }
        else if(view.getId()==R.id.btn_9){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+"9");
        }
//        清零
        else if(view.getId()==R.id.btn_c){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText("");
        }
//        点
        else if(view.getId()==R.id.dot){
            if(isClickequ){
                cal_result.setText("");
                isClickequ=false;
            }
            cal_result.setText(cal_result.getText().toString()+".");
        }
//操作符
//        加法
        else if(view.getId()==R.id.btn_sum){
//            点击加法后，把当前的数字保存下来
            strnum1=cal_result.getText().toString();
//            如果为空
            if(strnum1.equals("")){
                return;
            }
//            非空则转化成double
            num1= Double.parseDouble(strnum1);
            cal_result.setText("");
            op="+";
            isClickequ=false;
        }
        //        减法
        else if(view.getId()==R.id.btn_sub){
//            点击减法后，把当前的数字保存下来
            strnum1=cal_result.getText().toString();
//            如果为空
            if(strnum1.equals("")){
                return;
            }
//            非空则转化成double
            num1= Double.parseDouble(strnum1);
            cal_result.setText("");
            op="-";
            isClickequ=false;
        }
        //        乘法
        else if(view.getId()==R.id.btn_mult){
//            点击乘法后，把当前的数字保存下来
            strnum1=cal_result.getText().toString();
//            如果为空
            if(strnum1.equals("")){
                return;
            }
//            非空则转化成double
            num1= Double.parseDouble(strnum1);
            cal_result.setText("");
            op="*";
            isClickequ=false;
        }
        //        除法
        else if(view.getId()==R.id.btn_div){
//            点击除法后，把当前的数字保存下来
            strnum1=cal_result.getText().toString();
//            如果为空
            if(strnum1.equals("")){
                return;
            }
//            非空则转化成double
            num1= Double.parseDouble(strnum1);
            cal_result.setText("");
            op="/";
            isClickequ=false;
        }
//        变换正负
        else if(view.getId()==R.id.btn_fu){
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            result = 0.0-num1;
            cal_result.setText(result + "");
            op = "";
            isClickequ = false;
        }
//        开方
        else if (view.getId()==R.id.btn_kf) {
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            if(num1 > 0){
                result = Math.sqrt(num1);
                cal_result.setText(result + "");
            }else{
//                toast发送消息
                Toast.makeText(getApplicationContext(), "开方运算对象不能为负数", Toast.LENGTH_SHORT).show();
            }
            op = "";
            isClickequ = false;
        }

        //        除100
        else if (view.getId()==R.id.btn_chu100) {
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            result = num1/100;
            cal_result.setText(result + "");
            op = "";
            isClickequ = false;
        }

//        等于
        else if(view.getId()==R.id.btn_equ){
//            保存第二个运算数
            strnum2=cal_result.getText().toString();
            if(strnum1.equals("")){
                return;
            }
            num2= Double.parseDouble(strnum2);
            cal_result.setText("");
            switch(op){
                case "+":
                    result=num1+num2;
//                    精度参考手机上的计算器，保留小数点后13位
                    DecimalFormat jia = new DecimalFormat("#.#############");
                    String jiaResult = jia.format(result);
//                    cal_result.setText(num1+op+num2+"="+jiaResult+"");
                    cal_result.setText(jiaResult+"");
                    //cal_result.setText(result+"");
                    break;
                case "-":
                    result=num1-num2;
                    DecimalFormat jian = new DecimalFormat("#.#############");
                    String jianResult = jian.format(result);
                    cal_result.setText(jianResult+"");
                   // cal_result.setText(result+"");
                    break;
                case "*":
                    result=num1*num2;
                    DecimalFormat cheng = new DecimalFormat("#.#############");
                    String chengResult = cheng.format(result);
                    cal_result.setText(chengResult+"");
//                    cal_result.setText(result+"");
                    break;
                case "/":
                    if(num2==0){
                        cal_result.setText("除数不为0");
                        break;
                    }
                    result=num1/num2;
                    DecimalFormat chu = new DecimalFormat("#.#############");
                    String chuResult = chu.format(result);
                    cal_result.setText(chuResult+"");
                    break;
                default:
                    result=0.0;
                    cal_result.setText(result+"");
                    break;
            }
            op="";
            isClickequ=true;
        }
    }
}