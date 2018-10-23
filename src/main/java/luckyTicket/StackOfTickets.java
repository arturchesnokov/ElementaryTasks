package luckyTicket;

import java.util.ArrayList;
import java.util.List;

public class StackOfTickets {
    private List<Ticket> tickets = new ArrayList<Ticket>();
    private int startNumber = 0;
    private int endNumber = 0;

    public StackOfTickets() {
        int length = startNumber - endNumber;
        for (int i = 0; i < length; i++) {
            tickets.add(new Ticket(startNumber + i));
        }
    }

    public void setStartNumber(int startNumber) {

        if (startNumber > 0) {
            this.startNumber = startNumber;
        }
    }

    public void setEndNumber(int endNumber) {
        if (endNumber > 0 && endNumber > startNumber) {
            this.endNumber = endNumber;
        }
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
