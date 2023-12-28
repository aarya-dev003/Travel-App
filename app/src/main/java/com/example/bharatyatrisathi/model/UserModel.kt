package com.example.bharatyatrisathi.model

class UserModel {
    var name:String?= null
    var email:String?= null
    var password:String?= null
    var image:String?= null


    constructor()
    constructor(name: String?, email: String?, password: String?, image: String?) {
        this.name = name
        this.email = email
        this.password = password
        this.image = image
    }

    constructor(name: String?, email: String?, password: String?) {
        this.name = name
        this.email = email
        this.password = password
    }

    constructor(email: String?, password: String?) {
        this.email = email
        this.password = password
    }


}