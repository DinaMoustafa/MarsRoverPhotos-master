package com.udacity.toyapps.marsroverphotos

data class Result(val photos: List<Photo>)
data class Photo(val img_src: String, val earth_date: String)


