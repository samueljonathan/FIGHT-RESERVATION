public class Main {
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {


        Flight flight  = new Flight("4561","Jet",120,100);


        Passenger p1 = new Passenger("Camproad","thermal","tamilnadu","jone","93562725987",
                "donjone@gmail.com");

        Passenger p2 = new Passenger("hyperroad" , "tuty","tamilnadu", "kumar","8645736538"
        ,"kumar@hotmail.com");
        flight.getCapacity();
//

        RegularTicket regTicket = new RegularTicket(1,"cheenai","trichy","17/04/21,5",
                "19/04/21,11",flight,"18A",p1,false,"food,water,snacks");

        
        TouristTicket tourTicket = new TouristTicket(2,"kashmir" , "ladakh","12/12/21,5 ",
                "22/12/21,11",flight,"18C",p2,false,"kfc,resort road,trichy");

        System.out.println(regTicket.getPnr());
        System.out.println(tourTicket.getPnr());
    }
}

