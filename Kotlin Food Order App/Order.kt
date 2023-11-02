package foodOrderApp

class Order (orderID: Byte, itemName: String, quantity: Byte) {
    var orderID: Byte = 0
    var itemName: String? = null
    var quantity: Byte = 0

    init {
        this.orderID = orderID
        this.itemName = itemName
        this.quantity = quantity
    }

    companion object {
        fun displayOrder(orders: ArrayList<Order>) {
            println("------------------------------Your Order--------------------------------")
            System.out.printf("%20s %20s %15s", "Sr No", "Item Name", "Quantity")
            println()
            println("-----------------------------------------------------------------------")
            for (i in 0.rangeTo(orders.size - 1)) {
                System.out.format("%20s %20s %15s", orders[i].orderID, orders[i].itemName, orders[i].quantity)
                println()
            }
            println("-----------------------------------------------------------------------")
        }
    }
}