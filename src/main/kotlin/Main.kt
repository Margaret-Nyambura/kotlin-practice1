fun main(){
    getLength("school")

    println(divide(24,4))

    println(word("Mary"))

    println(average(5, 5, 5))

    println(person("Deborah", 56, "pink"))


}

//write a function that takes a string as a parameter and prints the length of the string
fun getLength(name:String){
    println(name.length)
}

//write a function that takes in two numbers as parameter and returns their division
fun divide(num1:Int, num2:Int):Int{
    return num1 / num2
}

//write a function that takes a string as a parameter and returns the string in reverse order
fun word(name:String):String{
    return name.reversed()
}

//write a program that calculates the average of three numbers
fun average(num1:Int, num2:Int, num3:Int):Int{
    return (num1 + num2 + num3)/3
}

//write a program that prompts a user enter their name, age and favourite colour and prints out a message with all information
fun person(x:String, y:Int, z:String):String{
    return "My name is $x, I am $y years old. My favourite colour is $z"
}