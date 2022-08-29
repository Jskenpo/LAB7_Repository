package com.plataformas.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val arg : HomeFragmentArgs by navArgs()
    lateinit var texto : TextView
    lateinit var bot : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        texto = view.findViewById(R.id.Info)
        bot = view.findViewById(R.id.update)

        texto.text= String.format("Hola %s, necesitamos que actualices tu perfil",arg.mail)
    }


}



