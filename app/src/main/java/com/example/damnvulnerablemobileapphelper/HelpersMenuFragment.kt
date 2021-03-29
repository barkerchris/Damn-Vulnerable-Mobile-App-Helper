package com.example.damnvulnerablemobileapphelper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.damnvulnerablemobileapphelper.databinding.FragmentHelpersMenuBinding

class HelpersMenuFragment : Fragment() {

    private var _binding: FragmentHelpersMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpersMenuBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnHelpersBroadcast.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_helpersMenuFragment_to_helpersBroadcastFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}