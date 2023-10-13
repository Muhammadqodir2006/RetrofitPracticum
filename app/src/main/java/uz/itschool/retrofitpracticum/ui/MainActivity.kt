package uz.itschool.retrofitpracticum.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import coil.load
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.itschool.retrofitpracticum.R
import uz.itschool.retrofitpracticum.model.Login
import uz.itschool.retrofitpracticum.model.PrD
import uz.itschool.retrofitpracticum.model.Product
import uz.itschool.retrofitpracticum.model.User
import uz.itschool.retrofitpracticum.networking.APIClient
import uz.itschool.retrofitpracticum.networking.APIService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = APIClient.getInstance().create(APIService::class.java)

//        val l = Login("kminchelle", "0lelplR")
        api.all().enqueue(object : Callback<PrD>{
            override fun onFailure(call: Call<PrD>, t: Throwable) {
                Log.d("TAG", "onFailure: $t")
            }

            override fun onResponse(call: Call<PrD>, response: Response<PrD>) {
                Log.d("TAG", "${response.body()!!.prdoucts}")
//                findViewById<TextView>(R.id.usernameTV).text = response.body()!!.toString()
            }
        })
    }
}