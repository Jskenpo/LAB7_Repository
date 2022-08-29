package com.plataformas.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputLayout


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val arg : HomeFragmentArgs by navArgs()
    lateinit var inputText: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inputText = view.findViewById(R.id.inputText_profile)
        inputText.editText!!.setText(arg.mail)
    }


}