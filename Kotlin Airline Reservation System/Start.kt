package airlineReservationSystem

fun main() {
    var booking = Booking()
    Booking.starter()

    val customer = Customer()
    customer.details()

    print("Would you like to travel International or Domestic (0/1): ")
    val travelType: Int = readln().toInt()
    val flightArray = if(travelType == 0) Flights.getIntlFlightDetails() else Flights.getDomesticFlightDetails()
    Flights.displayFlights(flightArray)

    var price = 0
    var buy = 1
    val orderArray = arrayListOf<TripDetails>()
    do {
        println("\nPlease Enter your Choice and Quantity : ")
        val choice: Int = readln().toInt()
        val quantity: Int = readln().toInt()

        orderArray.add(TripDetails(flightArray[choice - 1].src, flightArray[choice - 1].dest, quantity))
        price += quantity * flightArray[choice - 1].price
        print("Do you want to buy more (0 / 1): ")
        buy = readln().toInt()
    } while(buy != 0)

    val fd = FlightDetails("Air World", 78596798654L, "22AYRUII786")
    fd.display()

    TripDetails.displayTickets(orderArray)

    fd.payBill(price.toFloat())
}