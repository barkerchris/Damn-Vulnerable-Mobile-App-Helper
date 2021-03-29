package com.example.damnvulnerablemobileapphelper

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.damnvulnerablemobileapphelper.databinding.FragmentHelpersBroadcastBinding


class HelpersBroadcastFragment : Fragment() {

    private var _binding: FragmentHelpersBroadcastBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpersBroadcastBinding.inflate(inflater, container, false)

        val filter = IntentFilter("com.example.damnvulnerablemobileapp.SEND_BROADCAST")
        filter.priority = 2147483647
        activity?.registerReceiver(broadcastReceiver, filter)

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
        activity?.unregisterReceiver(broadcastReceiver)
    }

    private val broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent?.action.equals("com.example.damnvulnerablemobileapp.SEND_BROADCAST")) {
                val username = intent?.getStringExtra("com.example.damnvulnerablemobileapp.USERNAME")
                val password = intent?.getStringExtra("com.example.damnvulnerablemobileapp.PASSWORD")
                binding.txtHelpersUsername.text = username
                binding.txtHelpersPassword.text = password
            }
        }
    }

}