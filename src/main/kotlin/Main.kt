fun main(){
//    name("I am a student")
    name()




}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.

fun name(word:String){
    var stmt = "I am a student"


//}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements

fun numArray(){
    var value  = arrayOf(30,20,27,25,5)
    println(value.min())
    println(value.max())

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun name(){
    var nameArray = arrayOf("Nairobi","Mombasa","Kisumu")
    println(nameArray.contentToString())

}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class calculator(){
    fun addition(num1:Int, num2:Int):Int{
        var sum = num1+num2
        return sum
    }
}