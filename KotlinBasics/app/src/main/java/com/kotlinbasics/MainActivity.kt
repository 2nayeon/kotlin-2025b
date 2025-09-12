package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme
import java.security.KeyStore.TrustedCertificateEntry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week02Variables()
    }
}

fun week02Functions(){
    // println("Week02 Functions")

    // fun greet(name: String) = "Hello, $name!"

    // println(greet(name: "Android Developer"))
}

fun week02Variables(){
    // println("Week02 Variables")

    // val courseName="Mobile Programming"
    // courseName="IoT Programming" -> val는 상수선언이라 변경 못함

    // var week=1
    // week=2
    // println("Course: $courseName")
    // println("Week: $week")

    println("== Kotlin Variables ==")

    // val name: String="Android"
    val name="Android"
    var version=8.1
    println("Hello $name $version")

    val age: Int=22
    val height: Double=177.7
    val isStudent: Boolean=true

    println("Age: $age, Height: $height, Student: $isStudent")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}