package auctions;

import users.User;

public class Bid extends Auction {

    private final Double startingBid;
    private Double currentBid;
    private User currentHighestBidder;

    public Bid(String title, Item item, User owner, Double bidPrice) {
        super(title, item, owner);
        this.startingBid = bidPrice;
        this.currentBid = bidPrice;

    }

    public Double getCurrentBid() {
        return currentBid;
    }

    public void receiveOffer(Double bid, User user) {
        if (this.isActive()) {
            String msg = "Потребител " + user.getUsername() + " отправи оферта " + bid
                    + " лева за " + getTitle();
            System.out.println(msg);
            if (bid > this.currentBid) {
                this.currentBid = bid;
                this.currentHighestBidder = user;
                System.out.println("Офертата е по-добра");
            } else {
                System.out.println("Офертата е много ниска");
            }
        } else {
            String msg = "Потребител " + user.getUsername() + " отправи оферта " 
                    + " за " + getTitle() + "\n";
            msg += "Късно...";
            System.out.println(msg);
        }


    }

    public User getCurrentHighestBidder() {
        return currentHighestBidder;
    }
}
