package com.example.uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_input.*
import org.json.JSONArray

class Input : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        var terimaData1 = intent.getStringExtra("data1")
        var terimaData2 = intent.getStringExtra("data2")
        var terimaData3 = intent.getStringExtra("data3")
        var terimaData4 = intent.getStringExtra("data4")
        var terimaData5 = intent.getStringExtra("data5")
        var terimaData6 = intent.getStringExtra("data6")

        isiData1.setText("$terimaData1")
        isiData2.setText("$terimaData2")
        isiData3.setText("$terimaData3")
        isiData4.setText("$terimaData4")
        isiData5.setText("$terimaData5")

        btnSubmitUpload.setOnClickListener {
            var data1 =isiData1.text.toString()
            var data2 =isiData2.text.toString()
            var data3 =isiData3.text.toString()
            var data4 =isiData4.text.toString()
            var data5 =isiData5.text.toString()

            postInput(data1,data2,data3,data4,data5)

            val inten = Intent(this, Tampil::class.java)
            startActivity(inten)
        }
    }

    fun postInput(data1_1: String, data2_2: String, data3_3: String, data4_4: String, data5_5: String) {
        AndroidNetworking.post("http://192.30.10.1/php/input.php")
            .addBodyParameter("id_berita", data1_1)
            .addBodyParameter("judul_berita", data2_2)
            .addBodyParameter("waktu_berita", data3_3)
            .addBodyParameter("penulis_berita", data4_4)
            .addBodyParameter("isi_berita", data5_5)

            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {}
                override fun onError(anError: ANError?) {}

            })
    }
}