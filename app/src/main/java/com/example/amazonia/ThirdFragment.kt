package com.example.amazonia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.amazonia.R
import com.example.amazonia.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflamos el layout al crear la vista
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Generamos un número aleatorio entre 1 y 2
        val pago = (0 until 2).random()

        //Si el número aleatorio ha sido el 1, el pedido se ha realizado correctamente
        if(pago == 1) {
            binding.buttonThird.setOnClickListener {
                findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment) //Navegamos al fragmento 4.
            }
        }else{ //Si el número aleatorio ha sido el 2, ha habido un error en el pago
            binding.buttonThird.setOnClickListener {
                findNavController().navigate(R.id.action_thirdFragment_to_fifthFragment) //Navegamos al fragmento 5.
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}