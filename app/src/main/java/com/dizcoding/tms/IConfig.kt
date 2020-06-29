package com.dizcoding.tms

interface IConfig {
    companion object {
        const val API_BASE_URL = ""
        const val API_IMAGE_URL = ""
        const val BASE_DYNAMIC_LINK = ""
        const val KEY_CALLER_API_SOURCE = 1
        const val BASE64_CAMERA_FRONT_KEY = "camera_front64"
        const val BASE64_CAMERA_KEY = "camera_back64"
        const val BASE64_CAMERA_SELFIE_KEY = "camera_selfie64"
        const val REQUEST_CODE_CAMERA_RESULT = 101
        const val REQUEST_CODE_GALLERY_RESULT = 102
        const val REQUEST_CODE_SHARE_CONTENT = 212
        const val KEY_CALLER_API_SUMMARY = 10
        const val USER_SERVICE_URL = ""
        const val CONTENT_SERVICE_URL = ""
        const val GOOGLE_KEY_API = ""
    }
}