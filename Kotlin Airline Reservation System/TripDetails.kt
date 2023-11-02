package airlineReservationSystem

class TripDetails(src: String, dest: String, quantity: Int) {
    var src: String = ""
    var dest: String = ""
    var quantity: Int = 0

    init {
        this.src = src
        this.dest = dest
        this.quantity = quantity
    }

    companion object {
        fun displayTickets(tickets: ArrayList<TripDetails>) {
            println("------------------------------Your Order--------------------------------")
            System.out.printf("%20s %20s %15s", "Sr No", "Item Name", "Quantity")
            println()
            println("-----------------------------------------------------------------------")
            for (i in 0.rangeTo(tickets.size - 1)) {
                System.out.format("%20s %20s %15s", tickets[i].src, tickets[i].dest, tickets[i].quantity)
                println()
            }
            println("-----------------------------------------------------------------------")
        }
    }
}