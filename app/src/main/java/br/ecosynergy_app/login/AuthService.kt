package br.ecosynergy_app.login

import android.service.autofill.UserData
import br.ecosynergy_app.home.UserResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface AuthService {
    @POST("auth/signin")
    suspend fun loginUser(@Body loginUserRequest: LoginRequest):LoginResponse

    @GET("users/check")
    suspend fun checkUser(@Query("email") email: String): LoginResponse

    @POST("users/register")
    suspend fun registerUser(@Body userData: GoogleUserData): LoginResponse
}
