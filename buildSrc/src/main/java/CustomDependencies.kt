/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

object CustomVersions {
    const val dagger ="2.25.4"

    const val retrofit="2.6.0"

    const val okhttp="3.13.1"

    const val android_state="1.4.1"

    const val elevationimageview="2.4"   //带有阴影的image view
    //弹出框
    const val base_popup="2.2.1"

    const val gson="2.8.6"

    const val switchbutton="2.0.0"

    const val browser="1.0.0"

    const val immersionbar="3.0.0"
}

@Suppress("unused")
object CustomDeps {
    const val dagger="com.google.dagger:dagger:${CustomVersions.dagger}"
    const val dagger_compiler="com.google.dagger:dagger-compiler:${CustomVersions.dagger}"

    const val retrofit2="com.squareup.retrofit2:retrofit:${CustomVersions.retrofit}"
    const val retrofit2_gson_converter="com.squareup.retrofit2:converter-gson:${CustomVersions.retrofit}"

    const val okhttp="com.squareup.okhttp3:okhttp:${CustomVersions.okhttp}"
    const val okhttp_logging_interceptor="com.squareup.okhttp3:logging-interceptor:${CustomVersions.okhttp}"
    const val okhttp_dnsoverhttps="com.squareup.okhttp3:okhttp-dnsoverhttps:${CustomVersions.okhttp}"

    const val android_state="com.evernote:android-state:${CustomVersions.android_state}"
    const val android_state_compiler="com.evernote:android-state-processor:${CustomVersions.android_state}"

    const val elevationimageview="com.qhutch.elevationimageview:elevationimageview:${CustomVersions.elevationimageview}"

    const val base_popup="com.github.razerdp:BasePopup:${CustomVersions.base_popup}"
    const val base_popup_androidx="com.github.razerdp:BasePopup-compat-androidx:${CustomVersions.base_popup}"

    const val gson="com.google.code.gson:gson:${CustomVersions.gson}"
    const val switchbutton="com.kyleduo.switchbutton:library:${CustomVersions.switchbutton}"
    const val browser="androidx.browser:browser:${CustomVersions.browser}"

    const val immersionbar="com.gyf.immersionbar:immersionbar:${CustomVersions.immersionbar}"
    const val immersionbar_components="com.gyf.immersionbar:immersionbar-components:${CustomVersions.immersionbar}"
    const val immersionbar_ktx="com.gyf.immersionbar:immersionbar-ktx:${CustomVersions.immersionbar}"
}
