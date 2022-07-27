package com.kt.project.sjzl

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kt.project.R


class GuideDigitalExhibitionActivity : AppCompatActivity() {

    private lateinit var textView1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_de)


        textView1 = findViewById(R.id.tv1)
        textView1.setOnClickListener {
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }

        var textView2:TextView = findViewById(R.id.tv2)
        textView2.setOnClickListener {
            val intent = Intent(this, MyInfoActivity::class.java)
            startActivity(intent)
        }

        var textView3:TextView = findViewById(R.id.tv3)
        textView3.setOnClickListener {
            val intent = Intent(this, AccountSecurityActivity::class.java)
            startActivity(intent)
        }

        var textView4:TextView = findViewById(R.id.tv4)
        textView4.setOnClickListener {
            val intent = Intent(this, ChangePhoneActivity::class.java)
            startActivity(intent)
        }

        var textView5:TextView = findViewById(R.id.tv5)
        textView5.setOnClickListener {
            val intent = Intent(this, ModifyPasswordActivity::class.java)
            startActivity(intent)
        }

        var textView6:TextView = findViewById(R.id.tv6)
        textView6.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)
        }

        var textView7:TextView = findViewById(R.id.tv7)
        textView7.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        var textView8:TextView = findViewById(R.id.tv8)
        textView8.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        var textView9:TextView = findViewById(R.id.tv9)
        textView9.setOnClickListener {
            val intent = Intent(this, BindMobileActivity::class.java)
            startActivity(intent)
        }

        var textView10:TextView = findViewById(R.id.tv10)
        textView10.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        var textView11:TextView = findViewById(R.id.tv11)
        textView11.setOnClickListener {
            val intent = Intent(this, MyWareHouseActivity::class.java)
            startActivity(intent)
        }

        var textView12:TextView = findViewById(R.id.tv12)
        textView12.setOnClickListener {
            val intent = Intent(this, CanvasDetailsActivity::class.java)
            startActivity(intent)
        }

        var textView13:TextView = findViewById(R.id.tv13)
        textView13.setOnClickListener {
            val intent = Intent(this, AudioDetailsActivity::class.java)
            startActivity(intent)
        }

        var textView14:TextView = findViewById(R.id.tv14)
        textView14.setOnClickListener {
            val intent = Intent(this, VideoDetailsActivity::class.java)
            startActivity(intent)
        }

        var textView15:TextView = findViewById(R.id.tv15)
        textView15.setOnClickListener {
            val intent = Intent(this, ModelDiagramActivity::class.java)
            startActivity(intent)
        }

        var textView16:TextView = findViewById(R.id.tv16)
        textView16.setOnClickListener {
            val intent = Intent(this, UploadAudioActivity::class.java)
            startActivity(intent)
        }

        var textView17:TextView = findViewById(R.id.tv17)
        textView17.setOnClickListener {
            val intent = Intent(this, UploadVideoActivity::class.java)
            startActivity(intent)
        }

        var textView18:TextView = findViewById(R.id.tv18)
        textView18.setOnClickListener {
            val intent = Intent(this, UploadCanvasActivity::class.java)
            startActivity(intent)
        }

        var textView19:TextView = findViewById(R.id.tv19)
        textView19.setOnClickListener {
            val intent = Intent(this, UploadModelActivity::class.java)
            startActivity(intent)
        }

    }
}