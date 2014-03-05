package auctions;

import users.User;

public class Buyout extends Auction {

    Double buyoutPrice;

    public Buyout(String title, Item item, User owner, Double buyoutPrice) {
        super(title, item, owner);
        this.buyoutPrice = buyoutPrice;

    }

    public Double getBuyoutPrice() {
        return buyoutPrice;
    }
    
    public void receivePurchase(User user) {
        if (this.isActive()) {
            String msg = " Потребител " + user.getUsername() + " закупи" 
                    + " продукта " + getTitle();
            System.out.println(msg);
            this.setWinner(user);
            this.setFinalPrice(buyoutPrice);
        } else {
            String msg = "Потребител " + user.getUsername() + " отправи оферта" 
                    + " за " + getTitle() + "\n";
            msg += "Късно...";
            System.out.println(msg);
        }
    }
    
    
}
