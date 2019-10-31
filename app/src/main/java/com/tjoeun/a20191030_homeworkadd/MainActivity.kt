package com.tjoeun.a20191030_homeworkadd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actBtn.setOnClickListener {
            var user = actId.text.toString()
            var password = actPass.text.toString()

            Log.d("로그",user)
            Log.d("로그",password)


            //Kotiln은 == 연산자 자체가 찾아가서 내용물을 확인하도록 되어 있다
            //Kotlin은 === 연산자도 지원 (JAVA의 ==과 동일한 기능, 포인터 주소 비교)
            if ("Admin".equals(user) && password == "1234") {
                Toast.makeText(this, "관리자로 로그인 합니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "아이디 혹은 비밀번호가 잘못 되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }

        actBtn.setOnLongClickListener{
            var user = actId.text.toString()
            var password = actPass.text.toString()

            var message = "로그인한 아이디 : "+user+" 비밀번호 : "+password+" 입니다"
            Log.d("로그",user)
            Log.d("로그",password)


            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            return@setOnLongClickListener false
        }
    }
}
