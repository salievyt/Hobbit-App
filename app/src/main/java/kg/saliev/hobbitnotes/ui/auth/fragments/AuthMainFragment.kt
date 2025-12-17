package kg.saliev.hobbitnotes.ui.auth.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.saliev.hobbitnotes.R
import kg.saliev.hobbitnotes.databinding.FragmentAuthMainBinding
import kg.saliev.hobbitnotes.ui.activitys.onboard.OnBoardActivity

class AuthMainFragment : Fragment() {

    val binding: FragmentAuthMainBinding by lazy {
        FragmentAuthMainBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.joinBtn.setOnClickListener {
            val intent = Intent(context, OnBoardActivity::class.java)
            startActivity(intent)
        }

    }

}