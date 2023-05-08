package com.example.resepfood.ui.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
class Makanan  (
    var nama : String? = null,
    var desc : String? = null,
    var gambar: Int = 0
) : Parcelable