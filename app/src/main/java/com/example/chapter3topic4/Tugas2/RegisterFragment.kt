package com.example.chapter3topic4.Tugas2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.chapter3topic4.R
import kotlinx.android.synthetic.main.fragment_register_2.*

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnRegister.setOnClickListener {
            var nama = nameRegister.text.toString()
            var username = usernameRegister.text.toString()
            var password = passRegister.text.toString()
            var bundle = Bundle()
            bundle.putString("nama", nama)
            bundle.putString("username", username)
            bundle.putString("password", password)

            Navigation.findNavController(view).navigate(R.id.action_registerFragment2_to_loginFragment2, bundle)
        }
    }
}