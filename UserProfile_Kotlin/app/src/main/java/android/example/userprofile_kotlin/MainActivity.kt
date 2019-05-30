package android.example.userprofile_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Using the type 'var' - this creates the variable called nameText linked to the findView
         * this is then set using the .text which is similar to setText (refer to Java method)
         *
         *  Using Java this is how we do it...
         *  TextView nameText = (TextView) findViewById(R.id.name);
         *  nameText.setText(getString(R.string.name));
         *
         */

        var titleText = findViewById<TextView>(R.id.title)
        titleText.text = resources.getString(R.string.title)

        var nameText = findViewById<TextView>(R.id.name)
        nameText.text = resources.getString(R.string.name)+(" Peter")


        var ageText = findViewById<TextView>(R.id.age)
        ageText.text = resources.getString(R.string.age) + ( 25)

        var locationText = findViewById<TextView>(R.id.location)
        locationText.text = resources.getString(R.string.location) + (" London")

    }
}
