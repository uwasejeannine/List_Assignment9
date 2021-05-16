fun main() {
   println(names(listOf("Jeannine","Uwase","Grace","Diana","Michell","Caroline","Easter","Marie","Louise","Linda")))

    var personHeight=averageAndHeight(listOf(1.90,1.68,1.73,1.53))
    println("Average Height"+ " "+personHeight.average)
    println( "Total Height"+ " "+personHeight.total)

    var person = mutableListOf(
        Personobjects("Jeannine", 20, 1.68, 73.8),
        Personobjects("Uwase", 21, 1.67, 73.1),
        Personobjects("Giselle", 24, 1.43, 70.1) ,
        Personobjects("Mutoni", 16, 1.34,42.3),
    )
    personobject(person)
    var human= mutableListOf(
        Personobjects("Jeannine", 20, 1.68, 73.8),
        Personobjects("Uwase", 21, 1.67, 73.1),
        Personobjects("Giselle", 24, 1.43, 70.1) ,
    )
  personObject(human)

    var carListOf= listOf(
        Car("KCA367R",130.3),
        Car("RAE203F",80.0),
        Car("UAS200",40.3)
    )
    println(avaregeMileage(carListOf))

}
fun names(human:List<String>):List<String>{
    var differentNames= mutableListOf<String>()
    for (name in human)
       if( human.indexOf(name)%2==0){
          differentNames.add(name)

       }
    return differentNames
}
data class AverageMeasurements(var average:Double,var total:Double)
fun averageAndHeight(hieght:List<Double>):AverageMeasurements{
    var sum=hieght.sum()
    var average=hieght.average()
    var averagesum=AverageMeasurements(average,sum)
    return averagesum
}

data class Personobjects(var name:String, var age:Int, var  height:Double,var weight:Double)
fun personobject(person: List<Personobjects>) {

    var descendingPerson = person.sortedByDescending { personage -> personage.age }
           println(descendingPerson)

}

fun personObject(human:MutableList<Personobjects>   ) {
    human.addAll(listOf(
            Personobjects("Jane", 19, 1.56, 40.3),
            Personobjects("Mary", 30, 1.76, 50.8),
        ))
    println(human)
}
data class Car(var registration:String,var mileage:Double)
fun avaregeMileage(cars:List<Car>):Double {
    var TotalMileage=0.0
    for(car in cars){
        TotalMileage+=car.mileage
    }
    var  averages= TotalMileage/cars.size
    return averages
}