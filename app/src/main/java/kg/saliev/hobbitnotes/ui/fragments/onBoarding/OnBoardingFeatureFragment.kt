package kg.saliev.hobbitnotes.ui.fragments.onBoarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.saliev.hobbitnotes.MainActivity
import kg.saliev.hobbitnotes.R
import kg.saliev.hobbitnotes.databinding.FragmentOnBoardingFeatureBinding

class OnBoardingFeatureFragment : Fragment() {

    private val binding: FragmentOnBoardingFeatureBinding by lazy {
        FragmentOnBoardingFeatureBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.skip.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
        val navController = findNavController()
        binding.nextButton.setOnClickListener {
            navController.navigate(R.id.action_onBoardingFeatureFragment_to_onBoardingLastFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}