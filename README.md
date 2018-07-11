# Payment_app
Not Completed yet.

Android Jetpack
I am building a simple payment app just to use Android's new set of library called "Jetpack" with firebase.
Jetpack is a set of libraries, tools and architectural guidance to help make it quick and easy to build great Android apps.
It provides common infrastructure code so you can focus on what makes your app unique.
In this project, I am going to use some jetpack libraries like Navigation, ViewModel, Fragment, live data, Room, Slices, Animations and Transitions. I also used Kotlin instead of java.

Before starting please follow the link to refer for jetpack documentation : https://developer.android.com/jetpack/

To use this library you need to implement some dependencies into your project.  
       
       // LiveData + ViewModel
       implementation "android.arch.lifecycle:extensions:$rootProject.archLifecycleVersion"

       // Navigation
       implementation 'androidx.navigation:navigation-fragment:' + rootProject.navigationVersion
       implementation 'androidx.navigation:navigation-ui:' + rootProject.navigationVersion

 But if using this is giving you any error then implement the version directly like this  
 
       implementation "android.arch.navigation:navigation-fragment-ktx:1.0.0-alpha01"
       implementation "android.arch.navigation:navigation-ui-ktx:1.0.0-alpha01"
       
 here you can get the latest version value https://developer.android.com/kotlin/ktx
 
 This is my navigation graph 
![alt tag](https://github.com/Deepanshu625/Payment_app/blob/master/Screenshots/Screenshot%20from%202018-07-11%2012-32-06.png "Navigation Graph")
