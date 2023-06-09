fun main() {
    string("Melvin","Glenah","Darlene","Phylis")

    cities()

    nums()

    println(strings("Edwin","Bonvick","Evans","Lindsay").contentToString())

    cars()
}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun string(name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())
}
//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun cities() {
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for (city in cities) {
        println(city.capitalize())
    }
}
//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun nums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers.contentToString())
    for(num in numbers)
        println(num)
}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun strings(name1:String,name2:String,name3:String,name4:String):Array<String>{
    var names=arrayOf(name1,name2,name3,name4)
    return names
}
//looping through elements
fun cars(){
    var cars=arrayOf("volvo","jeep","porsche","range")
    for(x in cars) {
        println(x)
    }
}