package id.himtif.android.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import id.himtif.android.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //Variabel
    private lateinit var edtPertama : EditText
    private lateinit var edtKedua : EditText
    private lateinit var btnTambah : Button
    private lateinit var btnKurang : Button
    private lateinit var btnKali : Button
    private lateinit var btnBagi : Button
    private lateinit var tvhasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeView()

    }

    private fun initializeView(){
        edtPertama = findViewById(R.id.edtNumberOne)
        edtKedua = findViewById(R.id.edtAngkaKedua)
        btnTambah = findViewById(R.id.btnTambah)
        btnKurang = findViewById(R.id.btnKurang)
        btnKali = findViewById(R.id.btnKali)
        btnBagi = findViewById(R.id.btnBagi)
        tvhasil = findViewById(R.id.tvResult)

        btnTambah.setOnClickListener(this)
        btnKurang.setOnClickListener(this)
        btnKali.setOnClickListener(this)
        btnBagi.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnTambah -> tambah()
            R.id.btnKurang -> kurang()
            R.id.btnKali -> kali()
            R.id.btnBagi -> bagi()
        }

    }

    private fun tambah(){
        val inputPertama = edtPertama.text.toString().trim()
        val inputKedua = edtKedua.text.toString().trim()

        val result = inputPertama.toDouble() + inputKedua.toDouble()
        tvhasil.text = result.toString()
    }

    private fun kurang(){
        val inputPertama = edtPertama.text.toString().trim()
        val inputKedua = edtKedua.text.toString().trim()

        val result = inputPertama.toDouble() - inputKedua.toDouble()
        tvhasil.text = result.toString()
    }

    private fun kali(){
        val inputPertama = edtPertama.text.toString().trim()
        val inputKedua = edtKedua.text.toString().trim()

        val result = inputPertama.toDouble() * inputKedua.toDouble()
        tvhasil.text = result.toString()
    }

    private fun bagi(){
        val inputPertama = edtPertama.text.toString().trim()
        val inputKedua = edtKedua.text.toString().trim()

        val result = inputPertama.toDouble() / inputKedua.toDouble()
        tvhasil.text = result.toString()
    }

}