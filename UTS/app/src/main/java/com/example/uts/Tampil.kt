package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.uts.MainActivity
import kotlinx.android.synthetic.main.activity_tampil.*
import org.json.JSONObject

class Tampil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil)

        btnBack.setOnClickListener{
            val inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }

        getAllJadwal()

        btnToInput.setOnClickListener {
            var data1 = id.text.toString()
            var data2 = judul.text.toString()
            var data3 = waktu.text.toString()
            var data4 = penulis.text.toString()
            var data5 = isi.text.toString()
            val inten = Intent(this, Tampil::class.java)
            inten.putExtra("data1", data1)
            inten.putExtra("data2", data2)
            inten.putExtra("data3", data3)
            inten.putExtra("data4", data4)
            inten.putExtra("data5", data5)

            startActivity(inten)
        }
    }

    fun getAllJadwal() {
        var isi1:String
        var isi2:String
        var isi3:String
        var isi4:String
        var isi5:String

        AndroidNetworking.get("http://192.128.121.1/php/tampil.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener{
                override fun onResponse(response: JSONObject) {
                    Log.e("_kotlinResp", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("id"))
                        Log.e("_kotlinTitle", jsonObject.optString("judul"))
                        Log.e("_kotlinTitle", jsonObject.optString("waktu"))
                        Log.e("_kotlinTitle", jsonObject.optString("penulis"))
                        Log.e("_kotlinTitle", jsonObject.optString("isi"))

                        isi1 =  jsonObject.optString("id")
                        isi2 =  jsonObject.optString("judul")
                        isi3 =  jsonObject.optString("waktu")
                        isi4 =  jsonObject.optString("penulis")
                        isi5 = jsonObject.optString("isi")

                        id.setText(isi1)
                        judul.setText(isi2)
                        waktu.setText(isi3)
                        penulis.setText(isi4)
                        isi.setText(isi5)
                    }
                }

                override fun onError(anError: ANError?) {
                    Log.i("_err", anError.toString())
                }
            })
    }

}
