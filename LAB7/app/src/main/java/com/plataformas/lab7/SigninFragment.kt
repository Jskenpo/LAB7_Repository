package com.plataformas.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class SigninFragment : Fragment(R.layout.fragment_signin) {

    lateinit var textinput : TextInputLayout
    lateinit var bot : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textinput = view.findViewById(R.id.textinput_signin)
        bot = view.findViewById(R.id.btnSignin)
        listeners()

    }

    private fun listeners() {
        bot.setOnClickListener(){
            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(mail = textinput.editText!!.text.toString())
            requireView().findNavController().navigate(action)
        }
    }
}