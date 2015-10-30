package maha.api.sample.charity.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import maha.api.sample.charity.bean.CharityPojo;
import maha.api.sample.charity.bean.WishlistPojo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

package maha.sample.testSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class CharityController {

    @RequestMapping("/charity")
    public List<CharityPojo> getCharityLists() {
        List<WishlistPojo> wishlist1 = new ArrayList<WishlistPojo>();
        List<WishlistPojo> wishlist2 = new ArrayList<WishlistPojo>();
        List<WishlistPojo> wishlist3 = new ArrayList<WishlistPojo>();
        wishlist1.add(new WishlistPojo("Black Board"));
        CharityPojo charity1 = new CharityPojo(UUID.randomUUID().toString(), "HelpingHands", "Bangalore", wishlist1);
        wishlist2.add(new WishlistPojo("Dress"));
        CharityPojo charity2 = new CharityPojo(UUID.randomUUID().toString(), "CV Mission", "Rajapalayam", wishlist2);
        wishlist3.add(new WishlistPojo("Shoes"));
        CharityPojo charity3 = new CharityPojo(UUID.randomUUID().toString(), "Ilabharatham", "Chennai", wishlist3);
        List<CharityPojo> charity = new ArrayList<CharityPojo>();
        charity.add(charity1);
        charity.add(charity2);
        charity.add(charity3);
        return charity;
    }

    @RequestMapping(value = "/charity/{name}", method = RequestMethod.GET)
    public CharityPojo getCharityDetails( @PathVariable(value = "name") String name ) {
        List<WishlistPojo> wishlist1 = new ArrayList<WishlistPojo>();
        List<WishlistPojo> wishlist2 = new ArrayList<WishlistPojo>();
        List<WishlistPojo> wishlist3 = new ArrayList<WishlistPojo>();
        wishlist1.add(new WishlistPojo("Black Board"));
        CharityPojo charity1 = new CharityPojo(UUID.randomUUID().toString(), "HelpingHands", "Bangalore", wishlist1);
        wishlist2.add(new WishlistPojo("Dress"));
        CharityPojo charity2 = new CharityPojo(UUID.randomUUID().toString(), "CV Mission", "Rajapalayam", wishlist2);
        wishlist3.add(new WishlistPojo("Shoes"));
        CharityPojo charity3 = new CharityPojo(UUID.randomUUID().toString(), "Ilabharatham", "Chennai", wishlist3);
        List<CharityPojo> charityList = new ArrayList<CharityPojo>();
        charityList.add(charity1);
        charityList.add(charity2);
        charityList.add(charity3);
        Iterator<CharityPojo> it = charityList.iterator();
        while (it.hasNext()) {
            CharityPojo charity = (CharityPojo) it.next();
            if (charity.getCharityName().equals(name)) {
                return charity;
            }

        }
        return null;
    }
}