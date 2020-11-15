package com.amar.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//  Annotations are useful because they add additional info to classes, methods, or parameters.
//  Annotations are always declared with an @ symbol. In this case, add the @StringRes annotation
//  to your string resource ID property and @DrawableRes annotation to your drawable resource
//  ID property. Then you will get a warning if you supply the wrong type of resource ID.
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
}