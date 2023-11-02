package foodOrderApp

class RegularCustomer (
    customerID : Byte,
    customerName: Name,
    customerPhone: Long,
    customerAddress: Address,
    customerEmail: String
) : Customer(customerID.toByte(), customerName, customerPhone, customerAddress, customerEmail), BillOrder {

    private var discount: Float = 6.5f
    private var deliveryCharges: Int = -50

    companion object {
        var type = "Regular Customer"
    }

    override fun payBill(total: Float) {
        println("\tTotal Price is: $total")
        println("\n\tSince you are our $type")
        val billAmount: Float = (total - (total * discount / 100)) + deliveryCharges
        println("\tAfter Discount: $billAmount")
    }

}