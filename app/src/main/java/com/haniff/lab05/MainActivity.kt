package com.haniff.lab05

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.haniff.lab05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ActivityMain => Reverse of our activity name (Main Activity)
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            var pizzaSizeprice = 0.0
            var toppingPrice = 0.0

            when{
                //isCheck is the property to see if an item is selected
                binding.smallRadioBtn.isChecked -> pizzaSizeprice = 5.0
                binding.mediumRadioBtn.isChecked -> pizzaSizeprice = 10.0
                binding.largeRadioBtn.isChecked -> pizzaSizeprice = 15.0

            }

            //Multiple toppings can be selected, if, (not if else if)
            if(binding.onionsbox.isChecked){
                toppingPrice += 1.0
            }

            if(binding.olivesbox.isChecked){
                toppingPrice += 2.0
            }

            if(binding.mushroomsbox.isChecked){
                toppingPrice += 3.0
            }

            binding.total.text = "Total Price: RM ${pizzaSizeprice + toppingPrice}"
        }
    }
}