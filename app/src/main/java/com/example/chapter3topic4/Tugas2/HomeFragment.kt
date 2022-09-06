package com.example.chapter3topic4.Tugas2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapter3topic4.R
import kotlinx.android.synthetic.main.fragment_home_2.*
import kotlinx.android.synthetic.main.fragment_login_2.*
import kotlinx.android.synthetic.main.fragment_register_2.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getNama = arguments?.getString("nama")
        txtHaloNama.text = "Halo, $getNama"

        btnHitungUmur.setOnClickListener {
            var tahun = inputTahunLahir.text.toString().toInt()
            var umur = (2022 - tahun).toString()

            var bundle = Bundle()
            bundle.putString("nama", getNama)
            bundle.putString("umur", umur)

            Navigation.findNavController(view).navigate(R.id.action_homeFragment2_to_umurFragment, bundle)
        }

        btnProfile.setOnClickListener{
            var bundle = Bundle()
            bundle.putString("nama", getNama)

            Navigation.findNavController(view).navigate(R.id.action_homeFragment2_to_profileFragment, bundle)
        }
    }
}