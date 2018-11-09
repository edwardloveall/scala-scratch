case class Director(
  firstName: String,
  lastName: String,
  yearOfBirth: Int
) {
  def name = firstName + " " + lastName
}

object Director {
  def older(first: Director, second: Director): Director = {
    if (first.yearOfBirth > second.yearOfBirth) {
      second
    } else {
      first
    }
  }
}

case class Film(
  name: String,
  yearOfRelease: Int,
  imdbRating: Double,
  director: Director
) {
  def directorsAge: Int = yearOfRelease - director.yearOfBirth
  def isDirectedBy(person: Director): Boolean = director == person
}

object Film {
  def highestRating(first: Film, second: Film) = {
    if (first.imdbRating > second.imdbRating) {
      first
    } else {
      second
    }
  }

  def oldestDirectorAtTheTime(first: Film, second: Film) = {
    if (first.directorsAge > second.directorsAge) {
      first
    } else {
      second
    }
  }
}

object Dad {
  def rate(film: Film): Double = {
    film match {
      case Film(_, _, _, Director("Clint", "Eastwood", _)) => 10.0
      case Film(_, _, _, Director("John", "McTiernan", _)) => 7.0
      case _ => 3.0
    }
  }
}

val eastwood          = new Director("Clint", "Eastwood", 1930)
val mcTiernan         = new Director("John", "McTiernan", 1951)
val nolan             = new Director("Christopher", "Nolan", 1970)
val someBody          = new Director("Just", "Some Body", 1990)

val memento           = new Film("Memento", 2000, 8.5, nolan)
val darkKnight        = new Film("Dark Knight", 2008, 9.0, nolan)
val inception         = new Film("Inception", 2010, 8.8, nolan)

val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
val outlawJoseyWales  = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
val unforgiven        = new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino        = new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus          = new Film("Invictus", 2009, 7.4, eastwood)

val predator          = new Film("Predator", 1987, 7.9, mcTiernan)
val dieHard           = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)
