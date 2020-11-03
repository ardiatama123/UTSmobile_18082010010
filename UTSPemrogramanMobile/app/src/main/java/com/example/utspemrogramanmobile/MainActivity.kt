package com.example.utspemrogramanmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        myrecyclerview.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        myrecyclerview.setHasFixedSize(true)
        myrecyclerview.adapter = adapter_fakultas(data, { onItem: data_fakultas ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: data_fakultas) {
        val showDetailActivityIntent = Intent(this, detail_fakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<data_fakultas> {
        val rvList = ArrayList<data_fakultas>()
        rvList.add(
            data_fakultas(
                R.drawable.upn,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer\n" +
                        "adalah satu dari dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            data_fakultas(
                R.drawable.upn,
                "Fakultas Teknik",
                "Fakultas Teknik\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",

                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            data_fakultas(
                R.drawable.upn,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        rvList.add(
            data_fakultas(
                R.drawable.upn,
                "Fakultas Pertanian",
                "Fakultas Pertanian\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            data_fakultas(
                R.drawable.rizal,
                "Profil Saya",
                "Nama : M Rizal Abdullah Rozi\n"+
                        "TTL : Magetan, 03 Juli 2000\n" +
                        "Alamat : Perumahan Pesona Permata Ungu Blok D no 21, Krian, Sidoarjo\n" +
                        "Nomor Telepon : 085704712640\n" +
                        "Email : zalrizal040416@gmail.com\n" +
                        "Github : https://github.com/MRizalAbdullahRozi\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Watugolong 2 Krian \n" +
                        "\t\t 2. SMP Al Islam Krian \n" +
                        "\t\t 3. SMK Telekomunikasi DU \n\n" +
                        "Appreciation : -"
            )
        )
        return rvList
    }
}
