package src.main.kotlin.modele

open class Primal_post(var author: Users, var content: String, var like: Int, var dislike: Int)

class Post_media(author: Users,content_media: String,like: Int,dislike: Int, media: String): Primal_post(author,content_media,like,dislike)
