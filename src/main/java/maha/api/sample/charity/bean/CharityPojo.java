package maha.api.sample.charity.bean;

import java.util.List;

public class CharityPojo {
    private String id;
    private String charityName;
    private String charityAddress;
    private List<WishlistPojo> wishlist;

    public CharityPojo(String id, String charityName, String charityAddress, List<WishlistPojo> wishlist) {
        this.id = id;
        this.charityName = charityName;
        this.charityAddress = charityAddress;
        this.wishlist = wishlist;
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName( String charityName ) {
        this.charityName = charityName;
    }

    public String getCharityAddress() {
        return charityAddress;
    }

    public void setCharityAddress( String charityAddress ) {
        this.charityAddress = charityAddress;
    }

    public List<WishlistPojo> getWishlist() {
        return wishlist;
    }

    public void setWishlist( List<WishlistPojo> wishlist ) {
        this.wishlist = wishlist;
    }

}
