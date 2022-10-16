package com.example.assessmentweeknine.ui.Me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.assessmentweeknine.databinding.FragmentMeBinding

class MeFragment : Fragment() {

    private lateinit var binding: FragmentMeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val meViewModel =
            ViewModelProvider(this).get(MeViewModel::class.java)

        binding = FragmentMeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMe
        meViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}