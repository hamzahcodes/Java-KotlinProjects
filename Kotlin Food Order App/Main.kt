package foodOrderApp

fun main() {
    val rc = RegularCustomer(1.toByte(), Name("John", "Smith", "Hedgeson"), 9823456713L,Address("MG Road", "Mumbai", "India"), "john@gmail.com")
    val pc = PremiumCustomer(2.toByte(), Name("Mark", "Kevin", "Sheriff"),9876523324L, Address("North St", "New York", "USA"), "mark34@gmail.com")
    val gc = GuestCustomer(3.toByte(), Name("Kevin", "Peterson", "Adam"), 8655665232L, Address("West Front", "Westminster", "UK"), "kev7@gmail.com")

    print("Enter your ID: ")
    val id: Byte = readln().toByte()
    when(id) {
        1.toByte() -> println("Welcome back, ${rc.customerName}")
        2.toByte() -> println("Welcome back, ${pc.customerName}")
        3.toByte() -> println("Welcome back, ${gc.customerName}")
        else -> {
            println("No such customer exists")
        }
    }
    print("\nDo you want Snacks or Meal (S/M): ")
    val foodType: String = readln().lowercase()
    val menuArray = if(foodType == "s") Menu.getSnacksMenuCard() else Menu.getMealMenuCard()
    Menu.displayMenu(menuArray)

    var price = 0
    var buy = 1
    val orderArray = arrayListOf<Order>()

    do {
        println("\nPlease Enter your Choice and Quantity : ")
        val choice: Int = readln().toInt()
        val quantity: Int = readln().toInt()

        orderArray.add(Order(choice.toByte(), menuArray[choice - 1].menuName, quantity.toByte()))
        price += quantity * menuArray[choice - 1].menuPrice
        print("Do you want to buy more (0 / 1): ")
        buy = readln().toInt()
    } while(buy != 0)

    val rs = Restaurant("22AAYTRFG675", "Wow Foods", "MG Road, Mumbai, India", 78596798654L)
    rs.display()
    Order.displayOrder(orderArray)

    when(id) {
        1.toByte() -> rc.payBill(price.toFloat())
        2.toByte() -> pc.payBill(price.toFloat())
        3.toByte() -> gc.payBill(price.toFloat())
    }

}
