object Chapter4e {
  // case classes
  case class Person(name: String, age: Int)

  val anne: Person = Person("Anne", 35)
  val anneName: String = anne.name
  val anneAge: Int = anne.age
  def greeting(person: Person): String = s"hi ${person.name}"
  val anneWithAmendedAge: Person = anne.copy(age = 36)

  enum TrafficLight:
    case Red, Amber, Green

  import TrafficLight.*
  def drivingSignal(light: TrafficLight): String =
    if light == Red then "Stop"
    else if light == Amber then "Get Ready"
    else "Go"

  def drivingSignal2(trafficLight: TrafficLight): String = trafficLight match {
    case Red => "Stop"
    case Amber => "Get Ready"
    case Green => "Go"
  }

  enum Triathlon(val metres: Int):
    case Swim extends Triathlon(400)
    case Cycle extends Triathlon(5000)
    case Run extends Triathlon(2500)

  import Triathlon.*
  def howManyMetres(triathlon: Triathlon): Int = triathlon match {
    case s @ Swim => s.metres
    case c @ Cycle => c.metres
    case r @ Run => r.metres
  }

  case class Country(name: String, population: Int)
  def population(country: Country): Int = country.population

  enum UnitedKingdom:
    case England, NorthernIreland, Scotland, Wales

  import UnitedKingdom.*
  private val country = England
  if country == Scotland then println("we're in scotland!")

  def whereAmI(country: UnitedKingdom): String = country match {
    case England => "I'm in England!"
    case NorthernIreland => "I'm in Northern Ireland!"
    case Scotland => "I'm in Scotland!"
    case Wales => "I'm in Wales!"
  }
}
