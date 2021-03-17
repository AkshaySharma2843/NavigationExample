Navigation Example With Fragment Component is a Android Library to create a proper Bottom Navigation Using Fragment Component Using Java.

# NavigationExampleWithFragmentComponent

This Repository is for Beginner in Android who is learning Bottom Navigation using Fragment Componet and Java.

Most of the example available on internet is created using kotlin so i created this using java you can use this repository for learning and you can directly copy this on your projects. 


![ezgif com-gif-maker](https://user-images.githubusercontent.com/54305068/111461800-ad995d80-8743-11eb-8253-2ccfaa358bec.gif)

You can also overview the fragment component directly from google documentation

First Add These Dependancies in your Build Gradle App level.
#DependanciesForFragmentComponent


def nav_version = "2.3.4"

    // Java language implementation
    implementation "androidx.navigation:navigation-fragment:$nav_version"
    implementation "androidx.navigation:navigation-ui:$nav_version"

    // Feature module Support
    implementation "androidx.navigation:navigation-dynamic-features-fragment:$nav_version"

    // Testing Navigation
    androidTestImplementation "androidx.navigation:navigation-testing:$nav_version"

    // Jetpack Compose Integration
    implementation "androidx.navigation:navigation-compose:1.0.0-alpha09"

You have to make res Directory navigation and menu in your android res, you can also get it from my Project
navigation graph will be going to look like this

![nav_graph](https://user-images.githubusercontent.com/54305068/111463124-3fee3100-8745-11eb-8784-0382937bf11c.PNG)

you can add these fragment from new Destination option given in top left side.


