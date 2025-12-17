package kg.saliev.hobbitnotes.ui.fragments.onBoarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.saliev.hobbitnotes.MainActivity
import kg.saliev.hobbitnotes.R
import kg.saliev.hobbitnotes.databinding.FragmentOnBoardingLastBinding


class OnBoardingLastFragment : Fragment() {

    val binding: FragmentOnBoardingLastBinding by lazy {
        FragmentOnBoardingLastBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.useButton.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root



    }

}