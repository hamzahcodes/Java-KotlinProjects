package airlineReservationSystem

class Customer {

    fun details() {
        println("-----Please enter your details-----")

        print("Enter your First Name: ")
        val fName = readln()
        print("Enter your Middle Name: ")
        val mName = readln()
        print("Enter your Last Name: ")
        val lName = readln()
        var name = Name(fName, mName, lName)

        print("Enter your City: ")
        val city = readln()
        print("Enter your State: ")
        val state = readln()
        print("Enter your Country: ")
        val country = readln()
        print("Enter your Pin code: ")
        val pin = readln().toInt()
        var address = Address(city, state, country, pin)
    }

}
