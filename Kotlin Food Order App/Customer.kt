package foodOrderApp

open class Customer(customerID: Byte, customerName: Name, customerPhone: Long, customerAddress: Address, customerEmail: String) {
    var customerID: Byte = 0
    var customerName: Name
    var customerPhone: Long = 0L
    var customerAddress: Address
    var customerEmail: String? = null
    init{
        this.customerID = customerID
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.customerEmail = customerEmail
    }
    fun display() {
        println("$customerID\t$customerName\t$customerPhone\t$customerAddress\t$customerEmail")
    }
}