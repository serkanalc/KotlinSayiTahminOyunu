package com.example.udemydeneme

import java.util.*
import kotlin.random.Random

fun main(){

    var girdi=Scanner(System.`in`)
    var hak= 3
    var rastgeleSayı= Random.nextInt(0,101)

    while(true){
        if (hak==0){
            print("Deneme Hakkınız Bitti :( \nRastgele sayı -> $rastgeleSayı")
            break
        }
        else {
            print("tahmininizi giriniz:")
            var sayı = girdi.nextInt()
            
            if (sayı < rastgeleSayı) {
                println("daha büyük bir sayı dene")
                hak -= 1
                println("Kalan hakkınız $hak")
                continue
            }
            
            if(sayı>rastgeleSayı){
                println("daha küçük bir sayı dene")
                hak -= 1
                println("Kalan hakkınız $hak")
                continue
            }
            
            else{
                println("tebrikler doğru sayıyı buldunuz")
                break
            }
        }
    }
}
