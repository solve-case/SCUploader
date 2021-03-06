package com.example.scuploader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_first_year_subjects.*

class FirstYearSubjects : AppCompatActivity() {

    var subjectCode="sdf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_year_subjects)


        val bundle: Bundle? = intent.extras
        val year = bundle!!.getString("yearcode")
        Toast.makeText(this, year, Toast.LENGTH_SHORT).show()



        choose_subject_1.setOnClickListener {
            val intent = Intent(this, UploadActivity::class.java)
            intent.putExtra("subcode", subjectCode)
            intent.putExtra("yearcode", year)

            startActivity(intent)
        }
    }


    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.sdf ->
                    if (checked) {
                       subjectCode="sdf"
                    }
                R.id.physics ->
                    if (checked) {
                        subjectCode="physics"
                    }
                R.id.maths ->
                    if (checked) {
                        subjectCode="maths"
                    }
                R.id.es ->
                    if (checked) {
                        subjectCode="es"
                    }
                R.id.sdflab ->
                    if (checked) {
                        subjectCode="sdflab"
                    }
                R.id.pvlab ->
                    if (checked) {
                        subjectCode="pvlab"
                    }
                R.id.esvlab ->
                    if (checked) {
                        subjectCode="esvlab"
                    }
                R.id.edd ->
                    if (checked) {
                        subjectCode="edd"
                    }
                R.id.workshop ->
                    if (checked) {
                        subjectCode="workshop"
                    }
            }
        }

    }
}
