package com.plataformas.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class LoginFragment : Fragment(R.layout.fragment_login) {

    lateinit var signin: Button
    lateinit var signup: Button
    lateinit var inputText: TextInputLayout


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signin = view.findViewById(R.id.login)
        signup = view.findViewById(R.id.signin)
        inputText = view.findViewById(R.id.textinput)

        listeners()

    }

    private fun listeners() {
        signin.setOnClickListener(){
            var correo: String = inputText.editText!!.text.toString()
            if(correo == "jcdurini@uvg.edu.gt"){
                val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(mail= correo)
                view?.findNavController()?.navigate(action)
            }else{
                Toast.makeText(context, "El correo ingresado no es correcto", Toast.LENGTH_LONG).show()
            }

        }

        signup.setOnClickListener(){
            val action = LoginFragmentDirections.actionLoginFragmentToSigninFragment()
            requireView().findNavController().navigate(action)
        }

    }
}