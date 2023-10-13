package uz.itschool.retrofitpracticum.networking

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import uz.itschool.retrofitpracticum.model.Login
import uz.itschool.retrofitpracticum.model.PrD
import uz.itschool.retrofitpracticum.model.Product
import uz.itschool.retrofitpracticum.model.User

interface APIService {

//    @POST("/auth/login")
//    fun login(@Body login : Login):Call<User>

    @GET("/products")
    fun all():Call<PrD>
}