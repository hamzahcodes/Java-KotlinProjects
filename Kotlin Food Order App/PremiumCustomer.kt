package foodOrderApp

class PremiumCustomer(
    customerID : Byte,
    customerName: Name,
    customerPhone: Long,
    customerAddress: Address,
    customerEmail: String
) : Customer(customerID.toByte(), customerName, customerPhone, customerAddress, customerEmail), BillOrder {

    private var discount: Float = 12.5f
    private var deliveryCharges: Int = -100
    private var membershipCardDiscount: Float = 7.5f
    companion object {
        var type = "Premium Customer"
    }
    override fun payBill(total: Float) {
        println("\tTotal Price is: $total")
        println("\n\tSince you are our $type")
        val billAmount = (total - (total * discount / 100)) + deliveryCharges -
                (total - total * membershipCardDiscount / 100)
        println("\tAfter Discount: $billAmount")
    }
}