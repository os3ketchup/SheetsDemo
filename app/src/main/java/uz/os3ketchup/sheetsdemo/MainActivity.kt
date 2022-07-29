package uz.os3ketchup.sheetsdemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.os3ketchup.sheetsdemo.databinding.ActivityMainBinding
import uz.os3ketchup.sheetsdemo.models.Information
import uz.os3ketchup.sheetsdemo.retrofit.Constants
import uz.os3ketchup.sheetsdemo.retrofit.MyService


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val t = Constants.getRetrofit().create(MyService::class.java)
        t.groupList()
      .enqueue(object : Callback<List<Information>> {

            override fun onResponse(
                call: Call<List<Information>>,
                response: Response<List<Information>>
            ) {
                if (response.isSuccessful) {
                    binding.rvSheet.text = response.body().toString()
                    Toast.makeText(this@MainActivity, "success", Toast.LENGTH_SHORT).show()
                } else {
                    binding.rvSheet.text = response.code().toString()
                    Log.i("codes", "whats wrong: ${response.code()} ")
                }
            }

            override fun onFailure(call: Call<List<Information>>, t: Throwable) {

            }
        })
    }

}