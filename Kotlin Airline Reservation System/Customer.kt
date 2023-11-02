package airlineReservationSystem

class Customer {
    var name: Name = TODO()
    var address: Address = TODO()

    fun details() {
        println("-----Please enter your details-----")

        print("Enter your First Name: ")
        val fName = readln()
        print("Enter your Middle Name: ")
        val mName = readln()
        print("Enter your Last Name: ")
        val lName = readln()
        name = Name(fName, mName, lName)

        print("Enter your City: ")
        val city = readln()
        print("Enter your State: ")
        val state = readln()
        print("Enter your Country: ")
        val country = readln()
        print("Enter your Pin code: ")
        val pin = readln().toInt()
        address = Address(city, state, country, pin)
    }

}