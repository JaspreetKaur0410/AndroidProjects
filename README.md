# AndroidProjects
The apps that helps to develop the sound knowledge and hands-on expereince for Android/Kotlin fundamentals.

# Fragments And Navigation - Talks about following topics -
1. Fragments
2. Navigation Components
3. Safe Args

## Dependencies
1. To use Navigation - following dependency is used -
'''
implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
2. To use Safe Args - following dependency & plugin is used - (mentioned later as well)
'''dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
   plugins {
    id 'androidx.navigation.safeargs.kotlin'
}
   '''

### Fragments
1. Fragment is re-usable class implementing a portion of Activity
2. Following Fragments implemented in the code -
  * Welcome Fragment
  * Message Fragment
  * Encrypt Fragment

### Navigation Components - Navigation has 3 main components -
1. Navigation Graph - It defines possible navigation paths(Implemented as nav_graph in the project). It is under the res/navigation folder.
2. Navigation Host - Display Destinations. Navigation componnet comes with built-in fragment - "NavHost Freagment"
3. Navigation Controller - Controls which destination is displayed

### Safe Args
1. To send the data from one fragment to another - following dependency and plugin is used -
'''dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
   plugins {
    id 'androidx.navigation.safeargs.kotlin'
}
   '''
2. The data can be send using Directions class which is provided by above plugin
3. The data is recieved by using Args





