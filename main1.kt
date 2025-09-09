fun main1(){
    val greetUser = ::greet
    println(greetUser("jonathan"))
    val noName = fun(a: Int): Int {
        return  a*2
    }
    println(noName(45))
    val sum = {a:Int, b:Int -> a+b}
    println(sum(45,72))

    val message = "This is..cool brother...man..yes!"
    val ref = ::isNotDot
    val withoutDot = message.filter { ref(it) }
    println(withoutDot)
    val withoutDotLamb = message.filter { c: Char -> c!='.' }
    println(withoutDotLamb)
    val numbers = listOf<Int>(10,12,33,56)
    val doubledNumbers = numbers.map { n: Int -> n*2 }
    val doubledNumbers1 = numbers.map { it*2 }
    println(doubledNumbers)
    println(doubledNumbers1)

    listOf<Int>(1,2,3).forEach {
        if(it == 2){
            print("Oops 2!, ")
            return@forEach
        }
        print("Numb: $it, ")
    }
    println()
    val allNumbes = mutableListOf<Int>(1,2,4,5,7,12,13)
    val isOdd = ::oddNumber
    val isEven = ::evenNumber
    println("even numbers!")
    printNumbers(allNumbes, isEven)
    println()
    println("odd numbers!")
    printNumbers(allNumbes, isOdd)

    println()

    val student1:Student = Student("chido", "mark")
    val student2 = Student("jack", "morris")
    val chidoProf = student1::fullProfile
    val jackProfil = student2::fullProfile
    println(chidoProf())
    println(jackProfil.invoke())

    val magicUpper = Int::inc
    println(magicUpper(33))

    fun Int.isEven() = this%2==0
    println("is even -> ${23.isEven()}")
    println("is even -> ${24.isEven()}")
    println("is even -> ${25.isEven()}")

    val sum2: (Int, Int) -> Int = { a: Int, b:Int -> a+b}
    println("sum 2, 45 + 67 = ${sum2(45,67)}")

    Developer("thousand", "fruit", "javascript").apply {
        println(this)
        company = "google"
        language = "kotlin"
        println(this)
    }
    val tazaDev = Developer("taxa", "microsoft", "go")
    tazaDev.apply {
        println(this)
        company = "jetbrains"
        language = "kotlin"
        println(this)
    }
    //apply this -> returns context object
    //also it -> returns context object
    val myLangues = mutableListOf<String>("shona", "english")
    myLangues.also {
        println("i can speak these -> $it")
    }.add("afrikaans")
    val emptyClass = EmptyClass()
    println(emptyClass)

    val mrJones  = Farmer()
    mrJones.name = "mr jones"
    mrJones.age = 33
    mrJones.crops.add("rice")
    mrJones.crops.add("onions")
    println(mrJones)

    val myLand = MyLand(55.4, "st andrews")
    println("my land is ${myLand.width} is size and located in ${myLand.location}!")

    val anotherLandClass = AnotherLandClass("gokwe")
    val hacker = Hacker("j#xx", "kotlin")
    hacker.hackerProfile()

    val studentNurse = StudentNurse().apply {
        name = "lisa"
        address = "harare north"
    }
    println(studentNurse.name)
    val studentHacker = StudentHacker().apply {
        name = "marucs87"
        age = 34
    }
    println(studentHacker.info)
    val studentFarmer = StudentFarmer(33)
    val studentFarmer2 = StudentFarmer(mutableListOf<String>("rice", "beans"))
    val studentFarmer3 = StudentFarmer(23, mutableListOf("pumpkins", "onions"))

    println(studentFarmer.profile())
    studentFarmer.age = 9
    println(studentFarmer.age)

    val schoolBusDriver1 = SchoolBusDriver("mr jones")
    val schoolBusDriver2 = SchoolBusDriver("mr teller", 34, "t@gmail.com")
    println(schoolBusDriver1.name)
    println(schoolBusDriver2.name)

    val baseClass1 = BaseClass1()
    val derivedClass1 = DerivedClass1()
    baseClass1.printInfo()
    derivedClass1.printInfo()

    println(Directions.EAST)
    println(AfricaRegions.NORTH)
    AfricaRegions.SOUTH.regionInfo()
    println(AfricaRegions.WEST.name)
    println(AfricaRegions.EAST.ordinal)


    println("Printing all african regions..")
    for(region in AfricaRegions.entries){
        println("${region.name} has a population of ${region.population} people!")
    }

    println(AfricaRegions.valueOf("NORTH"))
    println(addAsteriks("hello"))

    println("something soweto".addAstericks())

    val topStudent1 = TopStudent("alice", false)
    val topStudent2 = TopStudent("may", true)
    topStudent1.profile()
    topStudent2.profile()

    val secondBestStudent = SecondBestStudent("alia").apply { grade = 5 }
    println(secondBestStudent.studentProfile())
    secondBestStudent.greet()

    val cropsClient1 = CropsClient("agatha", 23, Gender.FEMALE)
    println(cropsClient1)
    val cropsClient2 = cropsClient1.copy(name = "bob", gender = Gender.MALE)
    println(cropsClient2)
    val (name, age) = cropsClient1 //destructing
    println("crops client 1 details -> name: $name, age: $age years")

    val pair1 = Pair(22, mutableListOf("word", "more"))
    println(pair1)
    println(pair1.first)
    println(pair1.component1())

    val triple1 = Triple(true, mutableListOf("word", "palavras"), "something soweto")
    println(triple1)
    println(triple1.component2())

    val doubleResult = returnsDoubleValues()
    println(doubleResult.first)
    println(doubleResult.component2())

    val trippleResult = returnsTripleValues()
    println(trippleResult.first)
    println(trippleResult.component2())
    println(trippleResult.third)

    val book1 = Book("thousand", 435)
    println(book1.bookInfo())

    val novel1 = Novel("taxa", 400, NovelType.ROMANCE)
    println(novel1.bookInfo())

    val worker1 = Worker("romeo", 34)
    val developerWorker1 = DeveloperWorker("sam", 23, "fullstack")

    println(isWorkerOld(worker1))
    println(isWorkerOld(developerWorker1))

    val farmDriver1 = FarmDriver("james", "tractor")
    println(farmDriver1.workerInfo())

    val baseClassBase1 = BaseClassBase("word")
    val baseClassBase2 = BaseClassBase("word", 200)
    val baseClassBase3 = BaseClassBase("word", 43, false)

    val kitchenCook = KitchenCook("sarah", 23)
    println(kitchenCook.info())
    println(kitchenCook.greet())

    learningCollections()
}



interface Employee {
    var name: String
    var age:Int
    fun info(): String
    fun greet(): String
}

open  class KitchenCook(override var name: String,
                        override var age: Int): Employee{
    override fun info(): String = "$name is $age years old!"
    override fun greet(): String = "ola, $name"
}

open class BaseClassBase(val word: String, val numb: Int, val canDo: Boolean = false){
    constructor(word: String, numb: Int = 0): this(word, numb, true)
}

open  class FarmWorker(val name: String){
    open fun workerInfo(): String = "farm worker: $name"
}

class FarmDriver(name: String, var car: String): FarmWorker(name){
    override fun workerInfo(): String {
        return "${super.name} drives this transport $car"
    }
}

fun isWorkerOld(worker: Worker): Boolean = worker.age >= 30

open class Worker(val name: String, val age:Int){
    fun workerInfo(): String {
        return  "worker profile -> $name is $age years old!"
    }
}

class DeveloperWorker(name: String, age: Int, val position: String): Worker(name, age){}

class TeacherWorker(name: String, age: Int, var school: String): Worker(name, age){}

open class Book(val author: String, val pages: Int){
    fun bookInfo(): String = "book is by $author with $pages pages!"
}

enum class NovelType {
    ROMANCE, THRILLER
}

class Novel(author: String, pages: Int, val type: NovelType): Book(author, pages){

}

// sealed classes are abstract -> they can't be instatiated
// but you can extend it!
sealed class SealedClass
sealed interface SealedInterface

fun returnsDoubleValues(): Pair<Int, String> {
    return Pair(22, "hello, world")
}

fun returnsTripleValues(): Triple<Boolean, MutableList<String>, Int> {
    return Triple(true, mutableListOf("ola", "hey"), 3400)
}

enum class Gender {
    MALE, FEMALE
}
data class CropsClient(var name: String, var age: Int, var gender: Gender)


class SecondBestStudent(var name: String){
    var grade: Int = 0
        set(value) {
            if(value > 7){
                println("Max grade is 7!")
                field  = 7
            }else {
                field = value
            }
        }

    fun studentProfile() = "$name is doing grade: $grade!"
}

fun SecondBestStudent.greet() = println("hello, $name!")

class TopStudent(var name: String, var passed: Boolean)

fun TopStudent.profile() = println("$name passed the exams?: $passed")

fun addAsteriks(word: String) = "** $word **"

fun String.addAstericks() = "*** $this ***"

//enums default properties -> name, ordinal, entries, valueOf()

//enums -> grouped constants
enum class Directions {
    NORTH, WEST, EAST, SOUTH
}

enum class AfricaRegions(var region: String, var population: Int){
    NORTH("North", 30000),
    SOUTH("South", 34000),
    EAST("East", 87900),
    WEST("West", 22000);

    fun regionInfo() = println("$region region has a population of $population")
}

// final by default
open class BaseClass1 {
   open fun printInfo() = println("this is base class!")
}

open class DerivedClass1: BaseClass1() {
   final override fun printInfo() = println("this is a derived class!")
}

class DerivedClass2: DerivedClass1(){
//    override fun printInfo() = "this is second derived class!"
}

class SchoolBusDriver(var name: String){
    var age:Int = 0
    var email: String = ""

    constructor(name: String,age: Int, email: String):this(name ){
        this.age = age
        this.email = email
    }
}

class StudentFarmer{
    var age:Int = 10
        set(value) {
            if(value < 10){
                println("Too young")
                field = 10
            }else {
                field = value
            }
        }
    var crops: MutableList<String> = mutableListOf()

    constructor(age:Int){
        this.age = age
    }

    constructor(crops: MutableList<String>){
        this.crops = crops
    }

    constructor(age: Int, crops: MutableList<String>){
        this.age = age
        this.crops = crops
    }

    fun profile(){
        println("farmer is $age years old and grows -> ${crops.size} crops")
    }
}

class StudentHacker {
    var name: String = ""
    var age:Int = 0
    val info: String
        get() {
            if(name == "" && age == 0){
                return  "Unknown with no age!"
            }
            return  "$name is $age years old!"
        }
}

class StudentNurse {
    var name: String = ""
        get(){
            if(field != ""){
                return  field.uppercase()
            }else {
                return  field
            }
        }
    var address: String = ""
        get() = field.uppercase()
}

class Hacker(val name: String, var language: String){
    fun hackerProfile(){
        println("$name uses $language")
    }
}

class AnotherLandClass(var area: String){
    init {
        println("an another land instance has been created!")
    }
}

class MyLand(var width: Double, var location: String)

//new class -> new type
class Farmer{
    var name: String = ""
    var age: Int = 0
    var crops: MutableList<String> = mutableListOf<String>()
}

class EmptyClass{}

data class Developer(var name: String, var company: String, var language: String){}

class Student(val name: String, val last: String){
    fun fullProfile(): String {
        return  "student profile -> $name $last"
    }
}

fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean){
    for(numb in numbers){
        if(filter(numb)){
            print("Number: $numb, ")
        }
    }
}

fun oddNumber(a:Int) = a%2 != 0
fun evenNumber(a: Int) = a%2 == 0

fun greet(username: String) = "hello, $username"

fun isNotDot(c: Char): Boolean = c != '.'

fun learningCollections(){
    /*
    *  collection types
    * list -> ordered  collection, access elements by indices
    * set -> collection of unique elements
    * map -> a set of key value pairs
    *
    * 2 flavours, mutable collection and immutable collection
    * */
    val collection1 = listOf<String>("hello", "world")
    val collection3 = setOf<String>("something", "harare")
    printCollectionValues(collection1)
    printCollectionValues(collection3)

    val list1 = listOf<String>("oslo", "durban", "mahindra")
    val  list2 = emptyList<String>()
    println("first -> ${list1.get(0)},second -> ${list1[0]},size -> ${list1.size}")

    val lista = listOf<Int>(22,23,24)
    val listb = listOf<Int>(22,23,24)
    val listc = listOf<Int>(22,24,23)
    println("${lista == listb}, ${lista == listc}")

    val listNames = mutableListOf<String>()
    listNames.add("martha")
    listNames.add("jack")
    println("names in list: ${listNames.size}")
    listNames.remove("jack")
    println("names in list: ${listNames.size}")
    listNames.addFirst("jack")
    listNames.add("sam")
    println(listNames)

    val uniqueNames = mutableSetOf<String>()
    uniqueNames.add("luke")
    uniqueNames.add("martha")
    println(uniqueNames.contains("luke"))

    //map -> not an inheritor of collection interface
    val johnPals = mapOf<Int, String>(1 to "sam", 2 to "lewis")
    println(johnPals)
    println("john pals keys: ${johnPals.keys}")
    println("john pals values: ${johnPals.values}")
    println("john has a buddy sam?: ${johnPals.containsValue("sam")}")

    val samPals = mutableMapOf<Int, String>(1 to "sam")
    samPals[2] = "james"
    samPals[3] = "paida"
    println(samPals.values)

}

fun printCollectionValues(coll: Collection<String>){
    if(coll.isEmpty()){
        println("Collection is empty!")
    }else {
        println("printing collection elements: ")
        for(ele in coll){
            print("$ele, ")
        }
        println()
    }
}
