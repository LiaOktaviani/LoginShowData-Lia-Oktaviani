import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextJurusan: EditText
    private lateinit var buttonSubmit: Button
    private lateinit var textViewResult: TextView
    private lateinit var textViewUserData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextJurusan = findViewById(R.id.editTextJurusan)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        textViewResult = findViewById(R.id.textViewResult)
        textViewUserData = findViewById(R.id.textViewUserData)

        val userDataList = mutableListOf<String>()

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val jurusan = editTextJurusan.text.toString()

            if (name.isNotEmpty() && jurusan.isNotEmpty()) {
                val userData = "Nama: $name, Jurusan: $jurusan"
                userDataList.add(userData)
                showUserData()
            } else {
                textViewUserData.text = "Mohon masukkan data dengan lengkap."
            }
        }
    }

    private fun showUserData() {
        var userDataText = "Data Pengguna:\n"
        for (userData in userDataList) {
            userDataText += "$userData\n"
        }
        textViewUserData.text = userDataText
    }
}
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextJurusan: EditText
    private lateinit var buttonSubmit: Button
    private lateinit var textViewResult: TextView
    private lateinit var textViewUserData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextJurusan = findViewById(R.id.editTextJurusan)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        textViewResult = findViewById(R.id.textViewResult)
        textViewUserData = findViewById(R.id.textViewUserData)

        val userDataList = mutableListOf<String>()

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val jurusan = editTextJurusan.text.toString()

            if (name.isNotEmpty() && jurusan.isNotEmpty()) {
                val userData = "Nama: $name, Jurusan: $jurusan"
                userDataList.add(userData)
                showUserData()
            } else {
                textViewUserData.text = "Mohon masukkan data dengan lengkap."
            }
        }
    }

    private fun showUserData() {
        var userDataText = "Data Pengguna:\n"
        for (userData in userDataList) {
            userDataText += "$userData\n"
        }
        textViewUserData.text = userDataText
    }
}