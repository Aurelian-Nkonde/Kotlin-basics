fun main2() {
    println("from kotlin!")
    var kidWord = "something cool"
    print(kidWord)
    kidWord = "another cool!"
    print("- $kidWord\n")
    val password: String = "this is the password%$$!"
    println(password)

    //integers -> numbers without decimal point
    //floating -> numbers with decimal point
    println(10.00 is Double)
    val int1 = 132
    val int2 = 44
    println("${int2.toDouble()}, ${int1.toFloat()}")
    var numbxx = 10
    println(numbxx++)
    println(++numbxx)
    if(10*2 == 20) println("10*2 == 20: true")
    if(20*2 != 21) println("10*2 == 21: false")
    if(true && true) println("all true")
    if(false || true) println("one is true")
    if(10>11 != true) println("not true")

    val schoolTeacher = if(true) "congrats" else "that's bad"
    println(schoolTeacher)
    val fatherMood: String = if(true){
        "the father is pleased!"
    }else {
        "the father is not pleased!"
    }
    println(fatherMood)
    println(greetUser(""))
    println(greetUser("james"))
    val wordKey = "power"
    when {
        wordKey == "powers" -> println("powers is the word")
        wordKey == "power" -> println("power is the word!")
        else -> println("word key is not found")
    }
    languageRole("french")
    languageRole("shona")
    checkValue(arrayOf(1,2,3))
    checkValue("hello, world")

    //is -> checks if a value is of a certain type
    doSomethingWithValue(324)
    doSomethingWithValue(emptyList<Int>())

    val intX = 190
    val doubleX = 90.43
    val printNumber = {x: Number -> println("$x is a number type")} //upcasting
    printNumber(intX)
    printNumber(doubleX)

    val printNumber2 = {x:Int -> println("$x is an Int")}
    val numberx: Number = 900
    printNumber2(numberx as Int) //down-casting

    var loopx = 0
    while(loopx < 4) {
        print("hello" + if(loopx == 3) "" else ", ")
        loopx++
    }
    println()
    val nothingx = {x: Int -> 20}
    println(nothingx(22) is Int)
    println(totalSum(33,45,78))
    for (i in 1..4){
        print("$i, ")
    }
    println()
    for(i in 1 until 4){
        print("$i, ")
    }
    println()
    for (i in 5 downTo 1){
        print("$i, ")
    }
    println()
    for (i in 6 downTo 2 step 2){
        print("$i, ")
    }
    println()
    println("a or null: ${"a" ?: "a is null"}")
    println("${null ?: "null seen!"}")
    val messageKido: String? = null
    println("${messageKido.isNullOrBlank()}")

    val class1 = Class1()
    println("${class1}, ${class1.printThis()}")
    class1.word = ""
    class1.word = "something soweto"
    println(class1.word)

    val class2 = Class2("something", "world view")
    println("1: ${class2.wordA}, 2: ${class2.wordB}")

    val class3 = Class3("greeting", 899)
    val class3a = Class3("nothing here", "just a word", 900)

    val class4 = Class4("going to win", true)
    println("class4 -> ${class4.word}, ${class4.canFly}")
    val parentOne = ParentOne()
    val childOne = ChildOne()
    childOne.greet()
    parentOne.greetBase()
    childOne.greetBase()

    val programmer1 = Programmer1("ruben", "kotlin")
    println(programmer1.programmerProfile())

    val abstractClass1 = AbstractClass1()
    abstractClass1.word = "the good world!"
    println(abstractClass1.word)
    abstractClass1.nothing()

    val teacherRepo = TeacherRepo()
    teacherRepo.addTeacher(TeacherClass("alice", 43))
    teacherRepo.addTeacher(TeacherClass("alice", 88))
    for (teacher in teacherRepo.getTeachers()){
        println("teacher profile, name: ${teacher.name}, age: ${teacher.age} years old")
    }

    val student1 = Student1("sam", "smith")
    student1.profile()

    val somethingAnything = SomethingAnything()
    somethingAnything.sound()
    somethingAnything.tricking()

    val b1 = B()
    val b2 = B()
    println("b1 - b1: ${b1 == b1}, b1 - b2: ${b1 == b2}")
    println("b1 string: ${b1.toString()}, b2 string: ${b2.toString()}, b1 hashcode: ${b1.hashCode()}, b2 hashcode: ${b2.hashCode()}")

    val c1 = C("good morning", 343)
    println("instance: ${c1}, using tostring: ${c1.toString()}")

    val d1 = D("something is cooking", false)
    println(d1)
    val d2 = d1.copy(canCode = true)
    println(d2)

    val object1 = object {} //object expression
    val object2 = Any()

    val obj1 = object {} // object expression

    val townFarmer1 = TownFarmer("mr james")
    printFarmerGreeting(townFarmer1)
    val farmerObj = object : ITownFarmer{
        override fun greetFarmer() = "hello there, farmer!"
    }
    printFarmerGreeting(farmerObj)


    val diver1 = Diver.Companion.empty()
    println(diver1)
    val diver2 = Diver.empty()
    println(diver2)

    /*
    println("before exception")
    throwCustomException()
    println("after exception")
     */
    usingRequireFunc(34)
    usingRequireFunc(12)
    //usingRequireFunc(9)
    usingCheckFunc("mark")
//    usingCheckFunc("")
    printUserType(UserType.USER)
    printUserType(UserType.ADMIN)
    printUserType(UserType.SUPER_ADMIN)

    for(user in UserType.values()){
        print("$user, ")
    }
    println()
    println("${UserType.valueOf("ADMIN")}")

    printNameAndOrdinal("USER")

    val tele = Telephone("0564356973")
    println(tele.phoneNumber)
    tele.call()
    tele.message()

    println("21 doubled: ${21.double()}")

    val listOfColors: List<String> = listOf("red", "blue")
    val mutableListOfColors: MutableList<String> = mutableListOf("pink", "orange", "gray")
    println("${listOfColors.size}, ${mutableListOfColors.size}")

    val setOfAges: Set<Int> = setOf(22,542,900)
    val mutableSetOfAges: MutableSet<Int> = mutableSetOf(9632, 778,222,1321)
    println(setOfAges)
    println(mutableSetOfAges)

    val mapOfStudents: Map<String, Int> = mapOf("sarah" to 12, "alice" to 10)
    val mutableMapOfStudents: MutableMap<String, Int> = mutableMapOf("andrew" to 23, "jerry" to 20)
    println(mapOfStudents)
    println(mutableMapOfStudents)

    val buddiesList: MutableList<String> = mutableListOf<String>()
    println("size: ${buddiesList.size}, empty?: ${buddiesList.isEmpty()}")
    buddiesList.add("sam")
    buddiesList.add("jack")
    buddiesList.addAll(listOf("aaron", "jasper"))
    println("size: ${buddiesList.size}, empty: ${buddiesList.isEmpty()}")

    println("sam in friend: ${buddiesList.contains("sam")}")
    println("sam in-2 friend: ${"sam" in buddiesList}")
    println("sam not in friend: ${"sam" !in buddiesList}")


}

// collections -> types that represents a group of elements
/*
    list -> represents ordered collection of elements
    set -> represents a collection of unique items
    map -> represents a collection of key-value pairs, keys must be unique
 */

fun Int.double() = this*2

class Telephone(var phoneNumber: String){
    fun call() = println("calling: $phoneNumber")
}
//both member functions and extension functions are refereed to as methods
fun Telephone.message() = println("sending a message to: ${this.phoneNumber}")

fun printNameAndOrdinal(word: String){
    if(UserType.valueOf(word) != null){
        println("name: ${UserType.valueOf(word).name}, ordinal: ${UserType.valueOf(word).ordinal}")
    }else {
        println("this word is not part of the enum!")
    }
}

enum class UserType {
    USER, ADMIN, SUPER_ADMIN
}

fun printUserType(userType: UserType){
    when {
        userType == UserType.USER -> println("just a user!")
        userType == UserType.ADMIN -> println("the admin is here!")
        userType == UserType.SUPER_ADMIN -> println("the big doug in the house!")
    }
}

fun usingRequireFunc(a: Int){
    require(a > 10)
    println("a doubled is: ${a*2}")
}

fun usingCheckFunc(username: String){
    check(username != "")
    println("hello, $username")
}

//all exceptions must extend throwable
class CustomException: Throwable("This is a custom exception, Oops!")
fun throwCustomException(){
    throw CustomException()
}

class Diver {
    companion object {
        fun empty() = Diver()
    }
}


data class TownFarmer(var name: String): ITownFarmer{
    override fun greetFarmer(): String {
        return  "hello farmer, $name"
    }
}
interface  ITownFarmer {
    fun greetFarmer(): String
}
fun printFarmerGreeting(townFarmer: ITownFarmer){
    println(townFarmer.greetFarmer())
}

/*
*   ways of creating an object in kotlin!
*   -> using constructor
*   -> using object expression
*   -> using object declaration
*/

data class C (var word: String, var numb: Int)
data class D(var word: String, var canCode: Boolean)

class B

/*
* public -> visible everywhere
* private -> visible inside the class only
* protected -> visible inside the class and its subclasses
* internal -> visible inside the module
* */

//open class -> one can inherit from this class
//abstract class -> one must inherit it for using it

interface Sounding{
    fun sound()
}

interface MakingTrick {
    fun tricking()
}

class SomethingAnything: Sounding, MakingTrick{
    override fun sound() = println("hau hau hau")
    override fun tricking() = println("the good me making a trick!")
}

interface StudentInterface {
    val name: String
    val lastName: String
}

class Student1(override val name: String, override val lastName: String): StudentInterface {
    fun profile() = println("student profile, name: $name, lastname: $lastName")
}

class TeacherClass(var name: String, var age:Int)

interface  teacherInterface {
    fun getTeachers(): List<TeacherClass>
    fun addTeacher(teacherClass: TeacherClass)
}

class TeacherRepo: teacherInterface {
    private val teachers: MutableList<TeacherClass> = mutableListOf<TeacherClass>(
        TeacherClass("romeo", age = 35),
        TeacherClass("shayne", 40)
    )
    override fun getTeachers(): List<TeacherClass> = this.teachers.toList()
    override fun addTeacher(teacherClass: TeacherClass){
        if(this.teachers.find { it.name == teacherClass.name } != null){
            println("teacher already exist!")
            return
        }
        this.teachers.add(teacherClass).let { println("teacher is added!") }
    }
}

abstract class Abstract1 {
    var word: String = ""
    abstract fun nothing()
}

class AbstractClass1: Abstract1() {
    override fun nothing() = println("this function does nothing")
}

open class ProgrammerBase(var name: String){
    open fun programmerProfile() = "$name is a programmer, "
}

class Programmer1(name: String, var language: String):ProgrammerBase(name) {
    override fun programmerProfile(): String {
        return super.programmerProfile() + "who loves this ${language} language"
    }
}

class Class2(word1: String, word2: String){
    var wordA: String = word1
    var wordB: String = word2
}

//superclass -> subclass -> subclass
open class ParentOne{
    val word1: String = "the word from the parent"
    fun greet() = println("hello, from parent")
    open fun greetBase() = println("the parent message is printed")
}

class ChildOne: ParentOne(){
    override fun greetBase() {
        println("the child-one message is printed")
    }
}

class Class4(var word: String, var canFly: Boolean)

class Class3(word: String, numb: Int){
    var word1: String = word
    var numbs: Int = numb

    constructor(nothing: String, word: String, numb: Int): this(word, numb){
        println("secondary constructor was called!, ${nothing}")
    }
}

class Class1 {
    var word: String = ""
        get() = field.uppercase()
        set(newValue){
            if(newValue == "") {
                println("new value is not allowed!")
            }else {
                field = newValue
            }
        }
    fun printThis() = this
}

class NullClass(val word: String){
    fun printWord(){
        if(word.isEmpty()) println("word is empty!") else println("word is -> ${word.uppercase()}")
    }
}

fun totalSum(vararg numbs: Int): Int{
    var total = 0
    for(num in numbs) {
        total += num
    }
    return  total
}

class A {
    var name: String = ""
    fun printProfile(): String{
        fun message() = "hello, ${UpperCaseName(name)}"
        return "Message -> ${message()}"
    }
}

fun UpperCaseName(name: String): String {
    if(name == ""){
        throw IllegalArgumentException()
    }
    return  name.uppercase()
}

fun languageRole(language: String) = when {
    language == "shona" -> println("the good bantu")
    language == "spanish" -> println("the best romantic")
    else -> println("language not found")
}

fun greetUser(username: String): String{
    return if(username == "") "unknown user!" else "hello, $username"
}

fun checkValue(value: Any?) {
    when(value){
        null -> println("Oops, value is null")
        is Array<*> -> println("value is an array")
        in listOf<String>("hello", "world") -> println("value of in list")
        is  String -> println("Value is a string")
        else -> println("value is something else..")
    }
}

fun doSomethingWithValue(value: Any){
    if(value is String || value is Int){
        when(value){
            is Int -> println("doubled: ${value*2}")
            is String -> println("uppercased: ${value.uppercase()}")
        }
    }else {
        println("Other types are not allowed!")
    }
}