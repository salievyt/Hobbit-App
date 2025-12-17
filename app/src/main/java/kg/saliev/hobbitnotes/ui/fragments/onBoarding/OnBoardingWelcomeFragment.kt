package kg.saliev.hobbitnotes.ui.fragments.onBoarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kg.saliev.hobbitnotes.MainActivity
import kg.saliev.hobbitnotes.R
import kg.saliev.hobbitnotes.databinding.FragmentOnBoardingWelcomeBinding
import kg.saliev.hobbitnotes.ui.activitys.onboard.OnBoardActivity
import java.util.ArrayList

class OnBoardingWelcomeFragment : Fragment() {


    private val binding: FragmentOnBoardingWelcomeBinding by lazy {
        FragmentOnBoardingWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.nextButton.setOnClickListener {}
        binding.skip.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

//      binding.nextButton.findNavController().navigate(R.id.action_onBoardingWelcomeFragment_to_onBoardingFeatureFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val navController = findNavController()
        binding.nextButton.setOnClickListener {
            navController.navigate(R.id.action_onBoardingWelcomeFragment_to_onBoardingFeatureFragment)
        }
        return binding.root
    }
}