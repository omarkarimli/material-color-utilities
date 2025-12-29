package com.omarkarimli.material.color.utilities.utils

actual fun String.format(red: Int, green: Int, blue: Int): String {
  return String.format(this, red, green, blue)
}
