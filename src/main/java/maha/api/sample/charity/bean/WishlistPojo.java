package maha.api.sample.charity.bean;

public class WishlistPojo {
    private String wishlistItem;

    public WishlistPojo(String wishlistItem) {
        this.wishlistItem = wishlistItem;
    }

    public String getWishlistItem() {
        return wishlistItem;
    }

    public void setWishlistItem( String wishlistItem ) {
        this.wishlistItem = wishlistItem;
    }

}
