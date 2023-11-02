package foodOrderApp

class Menu(menuID: Byte, menuName: String, menuPrice: Short) {
    var menuID: Byte = 0
    var menuName: String = ""
    var menuPrice: Short = 0
    init {
        this.menuID = menuID
        this.menuName = menuName
        this.menuPrice = menuPrice
    }

    companion object {
        fun getSnacksMenuCard(): ArrayList<Menu> {
            val menuArray = arrayListOf<Menu>()
            menuArray.add(Menu(1.toByte(), "Sandwich", 100.toShort()))
            menuArray.add(Menu(2.toByte(), "Pizza", 200.toShort()))
            menuArray.add(Menu(3.toByte(), "Burger", 150.toShort()))
            menuArray.add(Menu(4.toByte(), "Fries", 90.toShort()))
            menuArray.add(Menu(5.toByte(), "Coffee", 50.toShort()))
            menuArray.add(Menu(6.toByte(), "Tea  ", 30.toShort()))
            return menuArray
        }

        fun getMealMenuCard(): ArrayList<Menu> {
            val menuArray = arrayListOf<Menu>()
            menuArray.add(Menu(1.toByte(), "Biryani", 300.toShort()))
            menuArray.add(Menu(2.toByte(), "Fried Rice", 250.toShort()))
            menuArray.add(Menu(3.toByte(), "Noodles", 220.toShort()))
            menuArray.add(Menu(4.toByte(), "Soup", 120.toShort()))
            menuArray.add(Menu(5.toByte(), "Dal Khichdi", 150.toShort()))
            menuArray.add(Menu(6.toByte(), "Thali", 100.toShort()))
            return menuArray
        }

        fun displayMenu(arr: ArrayList<Menu>) {
            println("SrNo\tItemName\t\tPrice")
            for(i in 0.rangeTo(arr.size - 1)) {
                if(arr[i].menuName == "Sandwich") println("${arr[i].menuID}\t\t${arr[i].menuName}\t\t${arr[i].menuPrice}")
                else println("${arr[i].menuID}\t\t${arr[i].menuName}\t\t${arr[i].menuPrice}")
            }
        }
    }
}