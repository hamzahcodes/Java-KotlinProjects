package airlineReservationSystem

class Flights(src: String, dest: String, price: Int) {
    var src: String = ""
    var dest: String = ""
    var price: Int = 0

    init {
        this.src = src
        this.dest = dest
        this.price = price
    }

    companion object{
        fun getIntlFlightDetails(): ArrayList<Flights> {
            val flightArray = arrayListOf<Flights>()
            flightArray.add(Flights("Mumbai", "London", 44000))
            flightArray.add(Flights("Ahmedabad", "Dubai", 25000))
            flightArray.add(Flights("Mumbai", "Singapore", 15000))
            flightArray.add(Flights("Bengaluru", "Munich", 90000))
            flightArray.add(Flights("Hyderabad", "Beijing", 10500))
            return flightArray
        }

        fun getDomesticFlightDetails(): ArrayList<Flights> {
            val flightArray = arrayListOf<Flights>()
            flightArray.add(Flights("Mumbai", "Delhi", 5000))
            flightArray.add(Flights("Ahmedabad", "Jaipur", 2800))
            flightArray.add(Flights("Mumbai", "Goa", 6700))
            flightArray.add(Flights("Bengaluru", "Lucknow", 9000))
            flightArray.add(Flights("Hyderabad", "Chennai", 3600))
            return flightArray
        }
        fun displayFlights(arr: ArrayList<Flights>) {
            println("From\t\tTo\t\tPrice")
            for(i in 0.rangeTo(arr.size - 1)) {
                println("${arr[i].src}\t\t${arr[i].dest}\t\t${arr[i].price}")
            }
        }
    }
}