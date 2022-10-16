package com.example.assessmentweeknine.ui.MyFriends

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.assessmentweeknine.databinding.FragmentMyfriendsBinding

class MyFriendsFragment : Fragment() {

    private lateinit var _binding: FragmentMyfriendsBinding

    //This is only valid in the onCreate view and
    //onDestroyView.

    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myFriendViewModel =
            ViewModelProvider(this).get(MyFriendsViewModel::class.java)

        _binding = FragmentMyfriendsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyFriends
        myFriendViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}