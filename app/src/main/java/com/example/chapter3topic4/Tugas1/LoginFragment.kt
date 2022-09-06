package com.example.chapter3topic4.Tugas1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapter3topic4.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnKeHome.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment)
        }
        btnKeRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }
        btnKeHelp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_helpFragment)
        }
        btnKeChatCs.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_chatCSFragment)
        }
        btnKeLupaPass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_lupaPassFragment)
        }
    }


}