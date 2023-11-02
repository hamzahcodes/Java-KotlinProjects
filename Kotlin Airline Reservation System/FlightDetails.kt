package airlineReservationSystem

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class FlightDetails(flightName: String, flightPhone: Long, gstNo: String): Billing {

    var flightName: String = ""
    var flightPhone: Long = 0L
    var gstNo: String = ""

    init {
        this.flightName = flightName
        this.flightPhone = flightPhone
        this.gstNo = gstNo
    }

    fun display() {
        println("\n------- Welcome to " + this.flightName + " --------");
        println("\nPhone: ${this.flightPhone}     GST No: ${this.gstNo}");
        println("\t\tBill No: 11970  ");
        print("Date: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        println("\tTime: " + LocalTime.now().toString().substring(0, 8));
    }

    override fun payBill(total: Float) {
        println("\tTotal Price is: $total")
        println("Applying Diwal Discount of 10% on all flights")
        val billAmount = (total - (total * 5 / 100))
        println("\tAfter Discount: $billAmount")
    }
}