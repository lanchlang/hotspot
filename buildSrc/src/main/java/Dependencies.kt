/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

object Versions {
    const val kotlin = "1.3.61"
    const val coroutines = "1.3.3"
    const val android_gradle_plugin = "3.5.0"
    const val sentry = "1.7.10"
    const val leakcanary = "2.0"
    const val leanplum = "5.2.3"
    const val osslicenses_plugin = "0.9.5"
    const val osslicenses_library = "17.0.0"

    const val androidx_appcompat = "1.1.0"
    const val androidx_biometric = "1.0.1"
    const val androidx_coordinator_layout = "1.1.0-beta01"
    const val androidx_constraint_layout = "2.0.0-beta2"
    const val androidx_preference = "1.1.0"
    const val androidx_legacy = "1.0.0"
    const val androidx_annotation = "1.1.0"
    const val androidx_lifecycle = "2.2.0-rc02"
    const val androidx_fragment = "1.2.0-beta02"
    const val androidx_navigation = "2.2.0-beta01"
    const val androidx_recyclerview = "1.1.0-beta04"
    const val androidx_testing = "1.2.1-alpha02"
    const val androidx_test_ext = "1.0.0"
    const val androidx_core = "1.2.0-beta01"
    const val androidx_paging = "2.1.0"
    const val androidx_transition = "1.3.0-beta01"
    const val androidx_work = "2.2.0"
    const val google_material = "1.1.0-beta01"

    const val mozilla_android_components = "27.0.0-SNAPSHOT"
    // Note that android-components also depends on application-services,
    // and in fact is our main source of appservices-related functionality.
    // The version number below tracks the application-services version
    // that we depend on directly for the fenix-megazord (and for it's
    // forUnitTest variant), and it's important that it be kept in
    // sync with the version used by android-components above.
    const val mozilla_appservices = "0.44.0"

    const val mozilla_glean = "19.0.0"

    const val adjust = "4.18.3"
    const val installreferrer = "1.0"

    const val junit = "4.12"
    const val mockito = "2.24.5"
    const val mockk = "1.9.kotlin12"
    const val assertk = "0.19"

    const val espresso_version = "3.2.0"
    const val mockwebserver = "3.11.0"
    const val orchestrator = "1.3.0-alpha02"
    const val tools_test_rules = "1.3.0-alpha02"
    const val tools_test_runner = "1.3.0-alpha02"
    const val uiautomator = "2.2.0"
    const val robolectric = "4.2.1"

    const val google_ads_id_version = "16.0.0"

    const val airbnb_lottie = "3.0.7"
}

@Suppress("unused")
object Deps {
    const val tools_androidgradle = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val tools_kotlingradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val kotlin_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val allopen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"
    const val sentry = "io.sentry:sentry-android:${Versions.sentry}"
    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"

    const val leanplum = "com.leanplum:leanplum-core:${Versions.leanplum}"

    const val androidx_annotation = "androidx.annotation:annotation:${Versions.androidx_annotation}"
    const val androidx_biometric = "androidx.biometric:biometric:${Versions.androidx_biometric}"
    const val androidx_fragment = "androidx.fragment:fragment-ktx:${Versions.androidx_fragment}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
    const val androidx_coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.androidx_coordinator_layout}"
    const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraint_layout}"
    const val androidx_legacy = "androidx.legacy:legacy-support-v4:${Versions.androidx_legacy}"
    const val androidx_lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidx_lifecycle}"
    const val androidx_lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidx_lifecycle}"
    const val androidx_lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidx_lifecycle}"
    const val androidx_lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidx_lifecycle}"
    const val androidx_paging = "androidx.paging:paging-runtime-ktx:${Versions.androidx_paging}"
    const val androidx_preference = "androidx.preference:preference-ktx:${Versions.androidx_preference}"
    const val androidx_safeargs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidx_navigation}"
    const val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation}"
    const val androidx_navigation_ui = "androidx.navigation:navigation-ui:${Versions.androidx_navigation}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"
    const val androidx_core = "androidx.core:core:${Versions.androidx_core}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.androidx_core}"
    const val androidx_transition = "androidx.transition:transition:${Versions.androidx_transition}"
    const val androidx_work_ktx = "androidx.work:work-runtime-ktx:${Versions.androidx_work}"
    const val androidx_work_testing = "androidx.work:work-testing:${Versions.androidx_work}"
    const val google_material = "com.google.android.material:material:${Versions.google_material}"

    const val adjust = "com.adjust.sdk:adjust-android:${Versions.adjust}"
    const val installreferrer = "com.android.installreferrer:installreferrer:${Versions.installreferrer}"

    const val junit = "junit:junit:${Versions.junit}"
    const val mockito_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockito_android = "org.mockito:mockito-android:${Versions.mockito}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val assertk = "com.willowtreeapps.assertk:assertk-jvm:${Versions.assertk}"

    const val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso_version}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_version}"
    const val espresso_idling_resources = "androidx.test.espresso:espresso-idling-resource:${Versions.espresso_version}"
    const val espresso_intents = "androidx.test.espresso:espresso-intents:${Versions.espresso_version}"
    const val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"
    const val orchestrator = "androidx.test:orchestrator:${Versions.orchestrator}"
    const val tools_test_rules = "androidx.test:rules:${Versions.tools_test_rules}"
    const val tools_test_runner = "androidx.test:runner:${Versions.tools_test_runner}"
    const val uiautomator = "androidx.test.uiautomator:uiautomator:${Versions.uiautomator}"
    const val androidx_junit = "androidx.test.ext:junit:${Versions.androidx_test_ext}"
    const val androidx_test_core = "androidx.test:core:${Versions.androidx_testing}"
}
