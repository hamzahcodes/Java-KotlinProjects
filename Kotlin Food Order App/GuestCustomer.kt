package foodOrderApp


class GuestCustomer(
    customerID: Byte,
    customerName: Name,
    customerPhone: Long,
    customerAddress: Address,
    customerEmail: String
) : Customer(customerID.toByte(), customerName, customerPhone, customerAddress, customerEmail), BillOrder
{

    override fun payBill(total: Float) {
        println("\tTotal Price is: $total")
        println("\n\tSince you are our $type")
        println("\tAfter Discount: $total")
    }

    companion object {
        var type = "Guest Customer"
    }
}