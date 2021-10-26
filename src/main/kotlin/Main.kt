package src.main.kotlin
import src.main.kotlin.modele



fun main(){
    val o = Users("bal", "kkkk","kkk")
    val post = Post_media(o, "blabla",1,2,"C:zaeza")
    println('r')
    println(o.username)
    println(post.author.username)
}
fun createNewUser(username : String, password: String,date: String){
    val newUser = Users(username,password,date)
    //append new user to database

}