package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun silnia(n: Int): Int
        {
            if (n>=1)
            { return n*silnia(n-1)
            }
            return 1
        }
        var i=1
        findViewById<Button>(R.id.next).setOnClickListener{
            if (i==1)
                { findViewById<ImageView>(R.id.Imagees).setImageResource(R.drawable.imagee2)
                i=2
                }
            else {
                if (i==2)
                    { findViewById<ImageView>(R.id.Imagees).setImageResource(R.drawable.imagee3)
                    i=3
                    }
                else{
                    if (i==3)
                        { findViewById<ImageView>(R.id.Imagees).setImageResource(R.drawable.imagee1)
                        i=1
                        }
                    }
                }
        }
        findViewById<Button>(R.id.last).setOnClickListener{
            if (i==1)
            { findViewById<ImageView>(R.id.Imagees).setImageResource(R.drawable.imagee2)
                i=2
            }
            else {
                if (i==2)
                { findViewById<ImageView>(R.id.Imagees).setImageResource(R.drawable.imagee3)
                    i=3
                }
                else{
                    if (i==3)
                    { findViewById<ImageView>(R.id.Imagees).setImageResource(R.drawable.imagee1)
                        i=1
                    }
                    }
                }
        }
        var sil=0
        var txtliczba=findViewById<TextView>(R.id.liczba)
        var txtwynik=findViewById<TextView>(R.id.wynikSil)
        findViewById<Button>(R.id.plus).setOnClickListener{
            sil +=1
            if(sil>10)
            {
                sil=10
            }
            txtliczba.text=sil.toString()
        }
        findViewById<Button>(R.id.minus).setOnClickListener{
            sil -=1
            if(sil<0)
            {
                sil=0
            }
            txtliczba.text=sil.toString()
        }
        findViewById<Button>(R.id.silnia).setOnClickListener {
            var wynik=silnia(sil)
            txtwynik.text=wynik.toString()

        }
    }
}