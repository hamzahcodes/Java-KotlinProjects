package foodOrderApp

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class Restaurant(gst: String,name: String, address: String, phone: Long ) {
    private var restaurantName: String = ""
    private var gstNo: String = ""
    private var address: String = ""
    private var phoneNo: Long = 0L

    init {
        this.restaurantName = name
        this.gstNo = gst
        this.address = address
        this.phoneNo = phone
    }

    fun display() {
        println("\n------- Welcome to " + this.restaurantName + " --------");
        println("Address: ${this.address}");
        println("\nPhone: ${this.phoneNo}     GST No: ${this.gstNo}");
        println("\t\tBill No: 11970  ");
        print("Date: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        println("\tTime: " + LocalTime.now().toString().substring(0, 8));
    }
}