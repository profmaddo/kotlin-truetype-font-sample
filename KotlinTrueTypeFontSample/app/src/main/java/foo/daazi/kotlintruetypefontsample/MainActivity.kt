package foo.daazi.kotlintruetypefontsample

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val txtRiscoRabisco: TextView? = null
    val txtMariaLucia: TextView? = null
    val btnAnjaEliane: Button? = null

    // Resource assets
    // Nome da pasta com as fontes
    var fontsPath = "fonts/"
    var fontTTFAnjaEliane = "Anja_Eliane.ttf"
    var fontTTFMariaLucia = "Maria_lucia.ttf"
    var fontTTFRiscoRabisco = "risco_rabisco.ttf"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val typefaceMariaLucia = Typeface.createFromAsset(applicationContext.assets, fontsPath + fontTTFMariaLucia)
        val typefaceAnjaEliane = Typeface.createFromAsset(applicationContext.assets, fontsPath + fontTTFAnjaEliane)
        val typefaceRabisco = Typeface.createFromAsset(applicationContext.assets, fontsPath + fontTTFRiscoRabisco)
        
        txtRiscoRabisco?.typeface = typefaceRabisco
        txtMariaLucia?.typeface = typefaceMariaLucia
        btnAnjaEliane?.typeface = typefaceAnjaEliane

    }
}