package com.android.fragmentsandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class MessageFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val startbtn = view.findViewById<Button>(R.id.btn_start)

        startbtn.setOnClickListener(){
            /* if no message passed*/
//            view.findNavController().navigate(R.id.action_welcomeFragment_to_messageFragment)

            /* if message passed */
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message = "jjjsss")
            view.findNavController().navigate(action)
        }

        return view;
    }
}