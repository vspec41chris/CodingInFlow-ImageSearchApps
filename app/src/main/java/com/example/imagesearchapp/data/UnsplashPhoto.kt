package com.example.imagesearchapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val urls: UnpslashPhotoUrls,
    val user: UnsplashUser
) : Parcelable {

    @Parcelize
    data class UnpslashPhotoUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String
    ) : Parcelable

    @Parcelize
    data class UnsplashUser(
        val name: String,
        internal val username: String
    ) : Parcelable {

        val attributionUrl get() = "https://unsplash.com/$username?utm_source=your_app_name&utm_medium=referral"
    }
}
