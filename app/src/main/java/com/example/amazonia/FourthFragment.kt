package com.example.amazonia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.amazonia.databinding.FragmentFourthBinding
import com.example.amazonia.databinding.FragmentThirdBinding


class FourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Como el pedido ya está realizado, al pulsar el botón Inicio,
        // volvemos al primer fragmento.
        binding.buttonFourth.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_FirstFragment)
        }
    }
}