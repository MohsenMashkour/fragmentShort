package com.mkrdeveloper.fragmentshort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.mkrdeveloper.fragmentshort.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container,false)

        binding.apply {
            tvFragment.setOnClickListener {
                Toast.makeText(context,"Subscribe please",Toast.LENGTH_SHORT).show()
            }

            btn.setOnClickListener {  }
        }

        return binding.root


    }


}