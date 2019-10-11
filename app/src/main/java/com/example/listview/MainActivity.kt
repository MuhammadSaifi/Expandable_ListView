package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val item= mutableListOf<String>(
        "Lahore",
        "Karachi",
        "Islamabad",
        "Multan",
        "Faislabad",
        "Muzafargarh",
        "Rawalpindi",
        "Jhang",
        "Layyah",
        "Gujranwala",
        "Gujrat",
        "Muree",
        "BahawalNagar",
        "ShakarGarh",
        "Sialkot",
        "Zafarwaal")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item)
        listview.adapter = adapter
        listview.setOnItemClickListener { adapterView, view, position, id ->
            if(position==0){
               val intent =Intent(this,Lahore::class.java)
                startActivity(intent)
            }
            if(position==1){
                val intent =Intent(this,Karachi::class.java)
                startActivity(intent)
            }
            if(position==2){
                val intent =Intent(this,Islamabad::class.java)
                startActivity(intent)
            }
            if(position==3){
                val intent =Intent(this,Multan::class.java)
                startActivity(intent)
            }
            if(position==4){
                val intent =Intent(this,Faislabad::class.java)
                startActivity(intent)
            }
            if(position==5){
                val intent =Intent(this,Muzafargarh::class.java)
                startActivity(intent)
            }
            if(position==6){
                val intent =Intent(this,Rawalpindi::class.java)
                startActivity(intent)
            }
            if(position==7){
                val intent =Intent(this,Jhang::class.java)
                startActivity(intent)
            }
            if(position==8){
                val intent =Intent(this,Layyah::class.java)
                startActivity(intent)
            }
            if(position==9){
                val intent =Intent(this,Gujranwala::class.java)
                startActivity(intent)
            }
            if(position==10){
                val intent =Intent(this,Gujrat::class.java)
                startActivity(intent)
            }
            if(position==11){
                val intent =Intent(this,Murree::class.java)
                startActivity(intent)
            }
            if(position==12){
                val intent =Intent(this,BahawalNagar::class.java)
                startActivity(intent)
            }
            if(position==13){
                val intent =Intent(this,Shakargarh::class.java)
                startActivity(intent)
            }
            if(position==14){
                val intent =Intent(this,Sialkot::class.java)
                startActivity(intent)
            }
            if(position==15){
                val intent =Intent(this,Zafarwaal::class.java)
                startActivity(intent)
            }
        }
    }

}
