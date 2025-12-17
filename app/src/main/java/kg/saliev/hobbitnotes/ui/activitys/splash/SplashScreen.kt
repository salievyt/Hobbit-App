package kg.saliev.hobbitnotes.ui.activitys.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kg.saliev.hobbitnotes.MainActivity
import kg.saliev.hobbitnotes.R
import kg.saliev.hobbitnotes.ui.activitys.onboard.OnBoardActivity
import kg.saliev.hobbitnotes.ui.auth.activity.AuthActivity

class SplashScreen : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Handler(Looper.getMainLooper()).postDelayed({
//            val intent = Intent(this, MainActivity::class.java)
//            val intent = Intent(this, OnBoardActivity::class.java)
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}