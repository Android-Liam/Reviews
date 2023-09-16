
package com.example.reviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.reviews.databinding.RegisterMainBinding

class RegisterMainActivity : AppCompatActivity() {

    private lateinit var binding: RegisterMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RegisterMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val input_name: String = binding.inputNickname.text.toString()
            val input_id: String = binding.inputId.text.toString()
            val input_pwd: String = binding.inputPwd.text.toString()
            val input_pwdCheck: String = binding.inputPwdCheck.text.toString()

            Log.d("Log", "NickName : $input_name\nId : $input_id\nPwd : $input_pwd\n" +
                    "PwdCheck : $input_pwdCheck")
            val data = SendRegisterDataClass(input_name, input_id, input_pwd, input_pwdCheck)
            sendDataToServer(data)
        }


    }

}
