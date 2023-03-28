import kotlin.reflect.typeOf

fun main(){
    val names = listOf("marion","Angie","Waweru","Diana")
    println(names)
    val phoneNumbers= mutableListOf("0723453473","0712453672","0702435678")
    phoneNumbers.add("0716588256")
    println(phoneNumbers)

    val nums= listOf(31,243,31,32,5,67,90,21,45,6)
    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.sum())
    println(nums.average())
    println(nums.first())
    println(nums.last())


    println(nums[6])
    println(nums.get(6))
    println(nums.indexOf(67))
    println(nums.lastIndex)
    println(nums.lastIndexOf(31))
    println(nums.size)

//    val mazda=Car("Mazda","Demio")
//    mazda.make
//    mazda.getMake()
//    println(mazda is Car)

    for (y in nums) {
        println(y)
    }
    nums.forEach{nums-> println(nums) }

    nums.sorted()
    println(nums)
   val sortedNUms=nums.sortedDescending()
  println(sortedNUms)
//   nums.reverse
//    nums.sortedAscending()
createStudentList()
    val evenNums=nums.filter { num->num%2==0 }
    println(evenNums)
    val oddNums=nums.filter { num->num%2!==0 }
    println(oddNums)
    val friends= listOf("Adams","Harming","Grant","Edison","Michael")
    val longNames=friends.filter { friend->friend.length>5 }
    println(longNames.size)




}
////class Car(var make:String,var model:String){
////    fun getMake():String{
////        return make
//    }
//}
//creating list from custom datatypes
data class Student(var name:String,var age:Int)
fun createStudentList(){
    val student1=Student("Grace",20)
    val student2=Student("Mary",40)
    val student3=Student("Jane",10)
    val student4=Student("Bree",30)
    val studentslist=listOf(student1,student2,student3,student4)
    println(studentslist)
//    multidimensional array
    println(studentslist[0].age)
    val sorted=studentslist.sortedBy { student -> student.name }
    println(sorted)


}
