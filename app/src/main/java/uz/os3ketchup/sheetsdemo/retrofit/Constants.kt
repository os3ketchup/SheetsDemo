package uz.os3ketchup.sheetsdemo.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Constants {
   const val KEY = "OFjfzYBqPXbF2jgbNKNgG7dkZZp_soeoFBS7e6BD8IkgDWCcw3v2pNl-Q3FdFopXswHDrfmsC_BMNY-5AmZ1bg5bZS6m9qJvOJmA1Yb3SEsKFZqtv3DaNYcMrmhZHmUMWojr9NvTBuBLhyHCd5hHa8l6aT5qzV3hsrNEdQczBaylvsKmXAO6aKIXPHLZs5_CFxvaPsa2sknzSJ7OwoIeurgqSCsPOSZSg1qoaV5FEWHJmFT3rh99dgtBHn44AOQP9fnK6RNm5-Q"
  const val LIB = "M8NvYLmAvzKNQFqR-cnHMzIsU-mYqYqLV"
  private const  val BASE_URL = "https://script.google.com/macros/s/AKfycbyiVYoPeRt4LE7ONYg0BL6YjwL2F-ifUlhIqq0ATlLg8DW5d0kIVvXXsW-2lZyj4BY9/"
  fun getRetrofit(): Retrofit{
    return Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl(BASE_URL)
      .build()
  }
}