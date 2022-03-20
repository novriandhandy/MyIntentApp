package com.example.myintentapp

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract

class Person (
        val Name: String?,
        val Age: Int?,
        val Email: String?,
        val City: String?,
        val Hp: Int?

    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Name)
        parcel.writeValue(Age)
        parcel.writeString(Email)
        parcel.writeString(City)
        parcel.writeValue(Hp)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}