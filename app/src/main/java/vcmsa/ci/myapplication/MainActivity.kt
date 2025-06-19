package vcmsa.ci.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Parallel arrays (retained structure)
    private val itemNames = arrayListOf<String>()
    private val categories = arrayListOf<String>()
    private val quantities = arrayListOf<Int>()
    private val comments = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemNameInput = findViewById<EditText>(R.id.itemNameInput)
        val categoryInput = findViewById<EditText>(R.id.categoryInput)
        val quantityInput = findViewById<EditText>(R.id.quantityInput)
        val commentsInput = findViewById<EditText>(R.id.commentsInput)
        val addButton = findViewById<Button>(R.id.addButton)
        val viewButton = findViewById<Button>(R.id.viewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        addButton.setOnClickListener {
            // Safely parse quantity to avoid crashes (toIntOrNull returns null if invalid) :contentReference[oaicite:1]{index=1}
            val quantity = quantityInput.text.toString().toIntOrNull() ?: 0

            itemNames.add(itemNameInput.text.toString())
            categories.add(categoryInput.text.toString())
            quantities.add(quantity)
            comments.add(commentsInput.text.toString())

            Toast.makeText(this, "Item added!", Toast.LENGTH_SHORT).show()
        }

        viewButton.setOnClickListener {
            val intent = Intent(this, ViewActivity::class.java).apply {
                putStringArrayListExtra("itemNames", itemNames)
                putStringArrayListExtra("categories", ArrayList(categories))
                // Must be ArrayList<Int> to avoid Intent cast errors :contentReference[oaicite:2]{index=2}
                putIntegerArrayListExtra("quantities", ArrayList(quantities))
                putStringArrayListExtra("comments", comments)
            }
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}