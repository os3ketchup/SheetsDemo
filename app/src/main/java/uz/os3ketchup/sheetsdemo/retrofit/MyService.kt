package uz.os3ketchup.sheetsdemo.retrofit

import retrofit2.Call
import retrofit2.http.GET
import uz.os3ketchup.sheetsdemo.models.Information

interface MyService {
   /* @GET("s/id/exec")
   *//*fun getInformation(@Query("action")getUsers:String):Call<List<Information>>*/

    @GET("exec?action=getUsers")
    fun groupList(): Call<List<Information>>
}