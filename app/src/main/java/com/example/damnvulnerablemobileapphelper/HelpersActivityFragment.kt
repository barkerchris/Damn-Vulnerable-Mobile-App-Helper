package com.example.damnvulnerablemobileapphelper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.damnvulnerablemobileapphelper.databinding.FragmentHelpersActivityBinding


class HelpersActivityFragment : Fragment() {

    private var _binding: FragmentHelpersActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpersActivityBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnHelpersActivityOpen.setOnClickListener {
            val intent = Intent("com.example.damnvulnerablemobileapp.OPEN_INFO")
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}