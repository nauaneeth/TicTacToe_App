package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val p = Play()
        binding.b0.setOnClickListener {
            if(checkFilled(binding.b0.text.toString())==0) {
                binding.b0.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b0.text.toString())
            }
        }
        binding.b1.setOnClickListener {
            if(checkFilled(binding.b1.text.toString())==0) {
                binding.b1.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b1.text.toString())
            }
        }
        binding.b2.setOnClickListener {
            if(checkFilled(binding.b2.text.toString())==0) {
                binding.b2.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b2.text.toString())
            }
        }
        binding.b3.setOnClickListener {
            if(checkFilled(binding.b3.text.toString())==0) {
                binding.b3.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b3.text.toString())
            }
        }
        binding.b4.setOnClickListener {
            if(checkFilled(binding.b4.text.toString())==0) {
                binding.b4.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b4.text.toString())
            }
        }
        binding.b5.setOnClickListener {
            if(checkFilled(binding.b5.text.toString())==0) {
                binding.b5.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b5.text.toString())
            }
        }
        binding.b6.setOnClickListener {
            if(checkFilled(binding.b6.text.toString())==0) {
                binding.b6.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b6.text.toString())
            }
        }
        binding.b7.setOnClickListener {
            if(checkFilled(binding.b7.text.toString())==0) {
                binding.b7.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b7.text.toString())
            }
        }
        binding.b8.setOnClickListener {
            if(checkFilled(binding.b8.text.toString())==0) {
                binding.b8.text = p.whatPut(binding.playerText.text.toString())
                checkWin()
                switchText(binding.b8.text.toString())
            }
        }


    }

    private fun win(c:Int)
    {
        when(c) {
            0 -> Toast.makeText(applicationContext, "Tie", Toast.LENGTH_LONG).show()
            1 -> Toast.makeText(applicationContext, "Winner: Player 1", Toast.LENGTH_LONG).show()
            2 -> Toast.makeText(applicationContext, "Winner: Player 2", Toast.LENGTH_LONG).show()
        }


        binding.b0.text=""
        binding.b1.text=""
        binding.b2.text=""
        binding.b3.text=""
        binding.b4.text=""
        binding.b5.text=""
        binding.b6.text=""
        binding.b7.text=""
        binding.b8.text=""
    }

    fun checkWin()
    {
        val a=binding.b0.text.toString()
        val b=binding.b1.text.toString()
        val c=binding.b2.text.toString()
        val d=binding.b3.text.toString()
        val e=binding.b4.text.toString()
        val f=binding.b5.text.toString()
        val g=binding.b6.text.toString()
        val h=binding.b7.text.toString()
        val i=binding.b8.text.toString()
        if((a=="x"&&b=="x"&&c=="x")
                ||(d=="x"&&e=="x"&&f=="x")
                ||(g=="x"&&h=="x"&&i=="x")
                ||(a=="x"&&d=="x"&&g=="x")
                ||(b=="x"&&e=="x"&&h=="x")
                ||(c=="x"&&f=="x"&&i=="x")
                ||(a=="x"&&e=="x"&&i=="x")
                ||(c=="x"&&e=="x"&&g=="x"))
        {
            win(1)
        }
        else if((a=="0"&&b=="0"&&c=="0")
                ||(d=="0"&&e=="0"&&f=="0")
                ||(g=="0"&&h=="0"&&i=="0")
                ||(a=="0"&&d=="0"&&g=="0")
                ||(b=="0"&&e=="0"&&h=="0")
                ||(c=="0"&&f=="0"&&i=="0")
                ||(a=="0"&&e=="0"&&i=="0")
                ||(c=="0"&&e=="0"&&g=="0"))
        {
            win(2)
        }
        else if(a!=""&&b!=""&&c!=""&&d!=""&&e!=""&&f!=""&&g!=""&&h!=""&&i!="")
        {
            win(0)
        }
            
    }

    private fun switchText(c: String) {
        when (c) {
            "x" -> binding.playerText.text = "Player 2's Turn"
            "0" -> binding.playerText.text = "Player 1's Turn"
        }
    }

    private fun checkFilled(c: String):Int {
        if (c=="x"||c=="0")
        {
            Toast.makeText(applicationContext, "Box Already Filled", Toast.LENGTH_SHORT).show()
        }
        return when (c) {
            "x","0" -> (1)
            else-> (0)
        }
    }
}

class Play
{
    fun whatPut(a:String):String
    {
        if((Integer.parseInt((a[7]).toString()))==1)
        {
            Log.d("hi","it works1\n")
            return("x")
        }
        else
        {
            Log.d("hi","it works2\n")
            return("0")
        }

    }
}