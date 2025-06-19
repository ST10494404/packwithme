package vcmsa.ci.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ViewActivity : AppCompatActivity() {

    // Safely initialize via lazy, with default empty lists to avoid nulls
    private val itemNames by lazy { intent.getStringArrayListExtra("itemNames") ?: arrayListOf() }
    private val categories by lazy { intent.getStringArrayListExtra("categories") ?: arrayListOf() }
    private val quantities by lazy { intent.getIntegerArrayListExtra("quantities") ?: arrayListOf() }
    private val comments by lazy { intent.getStringArrayListExtra("comments") ?: arrayListOf() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val displayText = findViewById<TextView>(R.id.displayText)
        val showAllButton = findViewById<Button>(R.id.showAllButton)
        val filterButton = findViewById<Button>(R.id.filterButton)
        val backButton = findViewById<Button>(R.id.backButton)

        showAllButton.setOnClickListener {
            val sb = StringBuilder("Full Packing List:\n")
            for (i in itemNames.indices) {
                sb.append("Item: ${itemNames[i]}, ")
                    .append("Category: ${categories.getOrNull(i) ?: "?"}, ")
                    .append("Quantity: ${quantities.getOrNull(i) ?: 0}, ")
                    .append("Comments: ${comments.getOrNull(i) ?: ""}\n")
            }
            displayText.text = sb.toString()
        }

        filterButton.setOnClickListener {
            displayText.text = filterHighQuantityItems()
        }

        backButton.setOnClickListener {
            finish()
        }
    }

    private fun filterHighQuantityItems(): String {
        val sb = StringBuilder("Items with quantity ≥ 2:\n")
        for (i in itemNames.indices) {
            val qty = quantities.getOrNull(i) ?: continue
            if (qty >= 2) {
                sb.append("${itemNames[i]} (Quantity: $qty)\n")
            }
        }
        return sb.toString()
    }
}
