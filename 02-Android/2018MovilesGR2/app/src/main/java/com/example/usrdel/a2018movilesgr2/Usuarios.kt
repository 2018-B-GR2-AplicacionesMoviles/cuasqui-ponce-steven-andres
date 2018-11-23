package com.example.usrdel.a2018movilesgr2

import android.os.Parcel
import android.os.Parcelable

class Usuarios(public var nombre: String,
              var edad: Int,

              var salario: Double) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),

            parcel.readDouble()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeInt(edad)

        parcel.writeDouble(salario)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "${nombre}"
    }

    companion object CREATOR : Parcelable.Creator<Usuarios> {
        override fun createFromParcel(parcel: Parcel): Usuarios {
            return Usuarios(parcel)
        }

        override fun newArray(size: Int): Array<Usuarios?> {
            return arrayOfNulls(size)
        }
    }
}