package com.example.resepfood.ui.home

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.resepfood.DetailMakanan
import com.example.resepfood.R
import com.example.resepfood.databinding.FragmentDashboardBinding
import com.example.resepfood.databinding.FragmentHomeBinding
import com.example.resepfood.ui.adapter.AdapterMakan
import com.example.resepfood.ui.dashboard.DashboardViewModel
import com.example.resepfood.ui.model.Makanan

class HomeFragment : Fragment() {

    lateinit var rvMakan: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view:View = inflater.inflate(R.layout.fragment_home, container, false)

        rvMakan = view.findViewById(R.id.rv_makan)

        val LayoutManager = LinearLayoutManager(activity)
        LayoutManager.orientation = LinearLayoutManager.VERTICAL

        rvMakan.adapter = AdapterMakan(arrMakanan)
        rvMakan.layoutManager = LayoutManager

        return view
    }

    val arrMakanan: ArrayList<Makanan>get(){
        val arr = ArrayList<Makanan>()
        val m1 = Makanan()
        m1.nama = "Gulai Ikan Patin"
        m1.desc = "Gulai Ikan Patinn adalah masakan yang diolah menggunakan tempoyak yaitu daging buah yang telah di fermentasi, namun dapat digantikan juga dengan santan untuk menghindari bau dan rasa tempoyaknya yang cukup menyengat."
        m1.gambar = R.drawable.makan1

        val m2 = Makanan()
        m2.nama = "Gulai Cipuik"
        m2.desc = "Gulai Siput sendiri dalam bahasa dialek Kuantan Singingi disebut dengan “Gulai Cipuik”, sedang dalam bahasa Melayu Rokan disebut dengan Rengkitang."
        m2.gambar = R.drawable.makan2

        val m3 = Makanan()
        m3.nama = "Gulai Cipuik"
        m3.desc = "Gulai Siput sendiri dalam bahasa dialek Kuantan Singingi disebut dengan “Gulai Cipuik”, sedang dalam bahasa Melayu Rokan disebut dengan Rengkitang."
        m3.gambar = R.drawable.makan3

        val m4 = Makanan()
        m4.nama = "Nasi lemak"
        m4.desc = "Nasi lemak adalah nasi yang dimasak menggunakan santan kelapa sehingga rasanya menjadi gurih, selain itu, kerap kali ditambahkan juga daun pandan dalam proses pembuatannya untuk memperkuat aroma."
        m4.gambar = R.drawable.makan4

        val m5 = Makanan()
        m5.nama = "Lopek Bugi"
        m5.desc = "Lapek Bugih (dari bahasa Minangkabau: Lepat Bugis) merupakan salah satu kue tradisional Minangkabau yang terbuat dari tepung ketan yang dikukus dan dibungkus daun pisang."
        m5.gambar = R.drawable.makan5

        val m6 = Makanan()
        m6.nama = "Tarempa"
        m6.desc = "Mie Tarempa merupakan salah satu kuliner yang cukup populer di Kota Batam. Mie Tarempa cukup berbeda, jika dibandingkan dengan beberapa mie yang dikenal masyarakat pada umumnya."
        m6.gambar = R.drawable.makan6

        val m7 = Makanan()
        m7.nama = "Mie lendir"
        m7.desc = "Mie Lendir merupakan makanan khas Pulau Batam dan Pulau Bintan, Provinsi Kepulauan Riau. Makanan ini terdiri dari mie kuning yang direbus bersama taoge dan disajikan bersama sebutir telur rebus yang dibelah dua, kemudian disiram dengan kuah kacang yang kental."
        m7.gambar = R.drawable.makan7

        val m8 = Makanan()
        m8.nama = "Ikan Cuka"
        m8.desc = "Ikan Cuka adalah hidangan khas Riau berbahan dasar ikan tenggiri dengan balutan bumbu merah."
        m8.gambar = R.drawable.makan8

        val m9 = Makanan()
        m9.nama = "Ikan Tongkol Asam Padeh"
        m9.desc = "Gulai ikan asam padeh adalah suatu masakan Minangkabau yang memiliki cita rasa pedas dan asam. Gulai ikan asam padeh ini merupakan salah satu kuliner dari Sumatra Barat."
        m9.gambar = R.drawable.makan9

        val m10 = Makanan()
        m10.nama = "Ayam Kemangi"
        m10.desc = "Citarasa dari daun kemangi memang mampu menyedapkan setiap masakan. Tak terkecuali menu ayam dengan bumbu pedas ini."
        m10.gambar = R.drawable.makan10

        arr.add(m1)
        arr.add(m2)
        arr.add(m3)
        arr.add(m4)
        arr.add(m5)
        arr.add(m6)
        arr.add(m7)
        arr.add(m8)
        arr.add(m9)
        arr.add(m10)

        return arr

    }


}