package com.example.gfcalls

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var subprocess = nullds();
        var but1 = findViewById<Button>(R.id.button1) as Button;
        var but2 = findViewById<Button>(R.id.button2) as Button;
        var but3 = findViewById<Button>(R.id.button3) as Button;
        var but4 = findViewById<Button>(R.id.button4) as Button;
        var but5 = findViewById<Button>(R.id.button5) as Button;
        var but6 = findViewById<Button>(R.id.button6) as Button;
        var but7 = findViewById<Button>(R.id.button7) as Button;
        var but8 = findViewById<Button>(R.id.button8) as Button;
        var but9 = findViewById<Button>(R.id.button9) as Button;
        var but10 = findViewById<Button>(R.id.button10) as Button;
        var but11 = findViewById<Button>(R.id.button11) as Button;
        var but12 = findViewById<Button>(R.id.button12) as Button;
        var but13 = findViewById<Button>(R.id.button13) as Button;
        var but14 = findViewById<Button>(R.id.button14) as Button;
        var but15 = findViewById<Button>(R.id.button15) as Button;
        var but16 = findViewById<Button>(R.id.button16) as Button;
        var but17 = findViewById<Button>(R.id.button17) as Button;
        var but18 = findViewById<Button>(R.id.button18) as Button;
        val textvi = findViewById<TextView>(R.id.textView) as TextView;
        var data:String="";
        fun backspace(inval:String){
            data=inval;
            textvi.text = data;
        }
        fun updatemain(datain:String){
            data+=datain;
            textvi.text = data;
        }
        fun cleanup(){
            data="";
            updatemain("");
        }
        but1.setOnClickListener{
            updatemain("1");
        }
        but2.setOnClickListener{
            updatemain("2");

        }
        but3.setOnClickListener{
            updatemain("3")
        }
        but4.setOnClickListener{
        updatemain("4");
        }
        but5.setOnClickListener{
            updatemain("5")
        }
        but6.setOnClickListener{
            updatemain("6")
        }
        but7.setOnClickListener{
            updatemain("7")
        }
        but8.setOnClickListener{
            updatemain("8")
        }
        but9.setOnClickListener{
            updatemain("9")
        }
        but11.setOnClickListener{
        updatemain("0")
        }
        but12.setOnClickListener{
            try {


                if (data[(data.length - 1)].toString() == ".") {
                    Toast.makeText(applicationContext, "😂👌", Toast.LENGTH_SHORT).show()
                } else {
                    updatemain(".")
                }
            }catch (e:Exception){
                Toast.makeText(applicationContext, "🎉🎉", Toast.LENGTH_SHORT).show()

            }

        }
        but13.setOnClickListener {
            try {


                if (data[(data.length - 1)].toString() == "/") {
                    Toast.makeText(applicationContext, "😂👌", Toast.LENGTH_SHORT).show()
                } else {
                    updatemain("/")
                }
            }catch (e:Exception){
                Toast.makeText(applicationContext, "🎉🎉", Toast.LENGTH_SHORT).show()

            }
//            updatemain("/")
        }
        but14.setOnClickListener {
            try {


                if (data[(data.length - 1)].toString() == "*") {
                    Toast.makeText(applicationContext, "😂👌", Toast.LENGTH_SHORT).show()
                } else {
                    updatemain("*")
                }
            }catch (e:Exception){
                Toast.makeText(applicationContext, "🎉🎉", Toast.LENGTH_SHORT).show()

            }
//            updatemain("*");
        }
        but15.setOnClickListener {

            try {


                if (data[(data.length - 1)].toString() == "-") {
                    Toast.makeText(applicationContext, "😂👌", Toast.LENGTH_SHORT).show()
                } else {
                    updatemain("-")
                }
            }catch (e:Exception){
                Toast.makeText(applicationContext, "🎉🎉", Toast.LENGTH_SHORT).show()

            }
//            updatemain("-");
        }
        but16.setOnClickListener {

            try {


                if (data[(data.length - 1)].toString() == "+") {
                    Toast.makeText(applicationContext, "😂👌", Toast.LENGTH_SHORT).show()
                } else {
                    updatemain("+")
                }
            }catch (e:Exception){
                Toast.makeText(applicationContext, "🎉🎉", Toast.LENGTH_SHORT).show()

            };
//            updatemain("+");
        }
        but10.setOnClickListener {
            cleanup();
        }
        but18.setOnClickListener {
            var dataset:String = "";
            val cached:String = data;
            var a =nullds();
            var retu = a.removeLastChar(cached).toString()
            backspace(retu)

        }
        but17.setOnClickListener {
            try {


                val result = EvaluateString().evaluate(data);
                cleanup();
                updatemain(result.toString());
            }catch (e:Exception){
                Toast.makeText(applicationContext, e.toString() , Toast.LENGTH_SHORT).show()
            }
        }



    }
}