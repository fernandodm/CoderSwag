package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_detail_product.*

class DetailProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)

        var product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        var resourceId = resources.getIdentifier(product.image, "drawable", packageName)

        imageView.setImageResource(resourceId)
        priceTxt.text = product.price
        tallTxt.text = "Tall: ${product.tall}"
        descriptionTxt.text = "Description: ${product.title}"
    }
}
