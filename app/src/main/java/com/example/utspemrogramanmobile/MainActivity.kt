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
                R.drawable.kunti,
                "Profil Saya",
                "Nama : Ananda Lakunti Ardiatama\n"+
                        "TTL : Wonogiri, 11 Desember 1999\n" +
                        "Alamat :Bangsri, RT 04 RW 02, Sukodono\n" +
                        "Nomor Telepon : 081249209120\n" +
                        "Email : anandalakuntiardiatama@gmail.com\n" +
                        "Github : https://github.com/ardiatama123\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Jemundo 2 \n" +
                        "\t\t 2. SMP Negeri 2 Taman \n" +
                        "\t\t 3. SMK YPM 3 Taman \n\n" +
                        "Prestasi : Juara 1 Vlog Polresta Sidoarjo"
            )
        )
        return rvList
    }
}
