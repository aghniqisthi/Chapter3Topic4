package com.example.chapter3topic4.Tugas2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.chapter3topic4.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login_2.*
import kotlinx.android.synthetic.main.fragment_register_2.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this`  fragment
        return inflater.inflate(R.layout.fragment_login_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLogin.setOnClickListener {
            var getNama = arguments?.getString("nama")
            var getUsername = arguments?.getString("username")
            var getPass = arguments?.getString("password")

            var Username = usernameLogin.text.toString()
            var Password = passLogin.text.toString()

            if(getNama!= null){
                if(Username.equals(getUsername)){
                    if(Password.equals(getPass)){
                        var bundle = Bundle()
                        bundle.putString("nama", getNama)
                        Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                        Navigation.findNavController(view).navigate(R.id.action_loginFragment2_to_homeFragment2, bundle)
                    }
                    else Toast.makeText(context, "Login Failed! Wrong Password!", Toast.LENGTH_LONG).show()
                }
                else Toast.makeText(context, "Login Failed! Wrong Username!", Toast.LENGTH_LONG).show()
            }
            else Toast.makeText(context, "Login Failed! Register First!", Toast.LENGTH_LONG).show()
        }
        textToRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment2_to_registerFragment2)
        }
    }
}